package com.agent.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import dev.langchain4j.model.openai.OpenAiChatModel;
@Data
@Configuration
@ConfigurationProperties(prefix = "openai")
public class LangChain4jChatConfig {
    @Value("${tongyi.base-url}")
    private String baseUrl;
    @Value("${tongyi.model:qwenPlus}")
    private String model;
    @Value("${tongyi.api-key}")
    private String apiKey;
    @Bean
    OpenAiChatModel qwenPlusModel(){
        return OpenAiChatModel.builder()
                .baseUrl(baseUrl)
                .modelName(model)
                .apiKey(apiKey)
                .build();
    }
}
