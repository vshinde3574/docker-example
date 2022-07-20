package com.dockerexample.dockerexample;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;

public class HttpCloudFunction implements HttpFunction {
    @Override
    public void service(HttpRequest request, HttpResponse response) throws Exception {
        response.getWriter().write(request.getQueryParameters().values().toString());
    }
}
