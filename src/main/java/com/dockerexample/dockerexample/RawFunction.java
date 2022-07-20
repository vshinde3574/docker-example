package com.dockerexample.dockerexample;

import com.google.cloud.functions.Context;
import com.google.cloud.functions.RawBackgroundFunction;

public class RawFunction implements RawBackgroundFunction {

    @Override
    public void accept(String json, Context context) throws Exception {
        System.out.println("Test");
    }
}
