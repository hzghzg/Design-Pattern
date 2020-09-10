package com.huangda7.designpattern.proxy.springbootaop.controller;

import com.huangda7.designpattern.proxy.springbootaop.config.DistributedLock;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        System.out.println("the method be invoked!!!!");
        return "test";
    }

    @GetMapping("/test1")
    @DistributedLock(lockName = "test")
    public String test1() {
        System.out.println("the method be invoked!!!!");
        return "test";
    }
}
