package com.huangda7.designpattern.proxy.springbootaop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        System.out.println("the method be invoked!!!!");
        return "test";
    }
}
