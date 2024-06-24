package com.lkl.laop.sdk;

import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpExecutionAware;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.impl.execchain.ClientExecChain;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class SignatureExec implements ClientExecChain {

    private static final Logger log = LoggerFactory.getLogger(SignatureExec.class);

    final ClientExecChain mainExec;
    final Credentials credentials;
    final Validator validator;

    SignatureExec(Credentials credentials, Validator validator, ClientExecChain mainExec) {
        this.credentials = credentials;
        this.validator = validator;
        this.mainExec = mainExec;
    }

    protected void convertToRepeatableResponseEntity(CloseableHttpResponse response)
            throws IOException {
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            response.setEntity(new BufferedHttpEntity(entity));
        }
    }

    protected void convertToRepeatableRequestEntity(HttpRequestWrapper request) throws IOException {
        if (request instanceof HttpEntityEnclosingRequest) {
            HttpEntity entity = ((HttpEntityEnclosingRequest) request).getEntity();
            if (entity != null) {
                ((HttpEntityEnclosingRequest) request).setEntity(new BufferedHttpEntity(entity));
            }
        }
    }

    @Override
    public CloseableHttpResponse execute(HttpRoute route, HttpRequestWrapper request,
                                         HttpClientContext context, HttpExecutionAware execAware) throws IOException, HttpException {
        return executeWithSignature(route, request, context, execAware);
    }

    private CloseableHttpResponse executeWithSignature(HttpRoute route, HttpRequestWrapper request,
                                                       HttpClientContext context, HttpExecutionAware execAware) throws IOException, HttpException {
        convertToRepeatableRequestEntity(request);

        String auth = credentials.getSchema() + " " + credentials.getToken(request);

        // 添加认证信息
        request.addHeader("Authorization", auth);
        log.info("Authorization:{}" , auth);
        // 添加必要信息
        request.addHeader("lkl-op-sdk", LKLSDK.LKL_OP_SDK);
        request.addHeader("lkl-op-flowgroup", LKLSDK.LKL_OP_FLOWGROUP);
        request.addHeader("lkl-op-appid", credentials.getOpAppId());
        // 执行
        CloseableHttpResponse response = mainExec.execute(route, request, context, execAware);
        // 对成功应答验签
        StatusLine statusLine = response.getStatusLine();
        log.info("statusLine:{}", statusLine);
        if (statusLine.getStatusCode() == 200) {
            convertToRepeatableResponseEntity(response);
            if (!validator.validate(response)) {
                throw new HttpException("应答的签名验证失败");
            }
        } else {
            String resp = "";
            try {
                resp = getResponseBody(response);
            } catch (Exception e) {
                //ignore
            }
            log.info("ResponseBody:{}", resp);
            resp = !isEmpty(resp) ? resp : statusLine.toString();
            throw new HttpException("请求响应失败：" + resp);
        }
        return response;
    }

    private String getResponseBody(CloseableHttpResponse response) throws IOException {
        HttpEntity entity = response.getEntity();
        return EntityUtils.toString(entity, StandardCharsets.UTF_8);
    }

    boolean isEmpty(String str) {
        return str == null || "".equals(str);
    }
}
