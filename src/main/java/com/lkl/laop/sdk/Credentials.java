package com.lkl.laop.sdk;

import org.apache.http.client.methods.HttpRequestWrapper;

import java.io.IOException;

public interface Credentials {

    String getSchema();

    String getToken(HttpRequestWrapper request) throws IOException;

    String getOpAppId();

}
