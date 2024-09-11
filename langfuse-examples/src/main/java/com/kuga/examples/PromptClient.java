package com.kuga.examples;

import com.kuga.langfuse.client.api.PromptsApi;
import com.kuga.langfuse.client.model.Prompt;
import lombok.SneakyThrows;

public class PromptClient {

    @SneakyThrows
    public static void main(String[] args) {
        PromptsApi promptsApi = Client.buildPromptsApi();
        Prompt prompt = promptsApi.promptsGet("test-1", null, null);
        System.out.println(prompt);
    }
}
