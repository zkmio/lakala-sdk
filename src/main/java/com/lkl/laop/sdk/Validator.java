package com.lkl.laop.sdk;

import org.apache.http.client.methods.CloseableHttpResponse;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public interface Validator {

    boolean validate(CloseableHttpResponse response) throws IOException;

    boolean validate(HttpServletRequest request);

    boolean validate(String body,String authorization);
}
