package com.ll.aa.controller;

import com.ll.aa.fign.SayHelloCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Person {
    @Autowired
    private SayHelloCaller caller;

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(){
        return caller.sayHello();
    }

}