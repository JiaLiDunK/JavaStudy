package com.agent.service;

import dev.langchain4j.data.message.SystemMessage;
import dev.langchain4j.model.chat.request.ChatRequest;
import dev.langchain4j.model.chat.response.ChatResponse;
import dev.langchain4j.model.openai.OpenAiChatModel;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class TestService {


    @Resource
    private OpenAiChatModel chatModel;

    public String demoOne(){
        ChatResponse chat = chatModel.chat(ChatRequest.builder()
                        .messages(SystemMessage.from("返回三个关于小偷的笑话给我"))
                .build());
        System.out.println("===================");
        System.out.println(chat.aiMessage().text());
        demoTwo();
        return "测试数据";
    }
    public void demoTwo(){
        ChatResponse chat = chatModel.chat(ChatRequest.builder()
                .messages(SystemMessage.from("返回三个关于囚犯的笑话给我"))
                .build());
        System.out.println("===================");
        System.out.println(chat.aiMessage().text());
    }
}
