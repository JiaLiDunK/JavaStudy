package com.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbit")
public class RabbitMQController {
    @RequestMapping("/test")
    public String test() {
        return "测试";
    }
}
