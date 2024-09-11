package com.kuga.examples;

import com.kuga.langfuse.client.api.PromptsApi;
import com.kuga.langfuse.client.invoker.ApiClient;

public class Client {

    private static final String LANGFUSE_BASE_URL = System.getenv("LANGFUSE_BASE_URL");
    private static final String LANGFUSE_USERNAME = System.getenv("LANGFUSE_USERNAME");
    private static final String LANGFUSE_PASSWORD = System.getenv("LANGFUSE_PASSWORD");

    private static ApiClient buildClient() {
        ApiClient client = new ApiClient();
        client.setBasePath(LANGFUSE_BASE_URL);
        client.setUsername(LANGFUSE_USERNAME);
        client.setPassword(LANGFUSE_PASSWORD);
        return client;
    }

    public static PromptsApi buildPromptsApi() {
        return new PromptsApi(buildClient());
    }
}
