package io.github.lnyocly.ai4j;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author cly
 * @Description TODO
 * @Date 2024/8/9 23:17
 */
@ConfigurationProperties(prefix = "ai.openai")
public class OpenAiConfigProperties {
    private String apiHost = "https://api.openai.com/";

    private String apiKey = "";

    private String chatCompletionUrl = "v1/chat/completions";
    private String embeddingUrl = "v1/embeddings";

    public OpenAiConfigProperties() {
    }

    public String getApiHost() {
        return apiHost;
    }

    public void setApiHost(String apiHost) {
        this.apiHost = apiHost;
    }

    public String getEmbeddingUrl() {
        return embeddingUrl;
    }

    public void setEmbeddingUrl(String embeddingUrl) {
        this.embeddingUrl = embeddingUrl;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getChatCompletionUrl() {
        return chatCompletionUrl;
    }

    public void setChatCompletionUrl(String chatCompletionUrl) {
        this.chatCompletionUrl = chatCompletionUrl;
    }
}
