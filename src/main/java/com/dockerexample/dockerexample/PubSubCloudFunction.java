package com.dockerexample.dockerexample;

import com.google.cloud.functions.BackgroundFunction;
import com.google.cloud.functions.Context;
import com.google.pubsub.v1.PubsubMessage;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class PubSubCloudFunction implements BackgroundFunction<PubsubMessage> {
    @Override
    public void accept(PubsubMessage payload, Context context) throws Exception {
        String name = "world";
        if (payload != null && payload.getData() != null) {
            name = new String(
                    Base64.getDecoder().decode(payload.getData().toString(StandardCharsets.UTF_8)),
                    StandardCharsets.UTF_8);
        }
        System.out.println(name);
        return;
    }
}
