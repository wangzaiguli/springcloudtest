package com.ll.aa.fign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "bb") //调用的服务名称
public interface SayHelloCaller {
    @RequestMapping("/hello")
    public String sayHello();
}