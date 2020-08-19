package com.ll.bb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHello {

    @RequestMapping("/hello")
    public String sayHello(){
        return "hello";
    }
}