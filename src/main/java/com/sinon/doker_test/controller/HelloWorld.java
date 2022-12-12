package com.sinon.doker_test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorld {

    @RequestMapping("sayHello")
    public String sayHello(){
        return "hello world";
    }
}
