package com.admin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/rabbit")
public class RabbitMQController {
    @Value("${tongyi.model.qwenPlus}")
    private String chat;
    @RequestMapping("/test")
    public String test() {
        log.info("看这个:{}",chat);
        return "测试";
    }
}
