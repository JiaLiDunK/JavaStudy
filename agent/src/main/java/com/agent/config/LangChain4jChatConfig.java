package com.agent.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "openai")
public class LangChain4jChatConfig {
    @Value("${openai.chat.base-url}")
    private String baseUrl;
}
