package com.admin.controller;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rabbitmq.service.MQSender;
import com.rabbitmq.service.MQReceiver;
@Slf4j
@RestController
@RequestMapping("/rabbit")
public class RabbitMQController {
    @Value("${tongyi.model.qwenPlus}")
    private String chat;
    @Resource
    private MQSender mqSender;
    @Resource
    private MQReceiver mqReceiver;
    @RequestMapping("/test")
    public String test() {
        log.info("看这个:{}",chat);
        return "测试";
    }
    @RequestMapping("/put")
    public String put(){
        mqSender.send(chat);
        return "put";
    }
    @RequestMapping("/get")
    public String get(){
        mqReceiver.receive(chat);
        return "get";
    }
}
