package com.admin.controller;

import com.agent.service.TestService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/langchain4j")
public class LangChian4jController {
    @Resource
    private TestService testService;

    @RequestMapping("/test1")
    public String test1(){
        testService.demoOne();
        return "测试数据";
    }
}
