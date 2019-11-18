package com.zjb.controller;

import com.zjb.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zjb on 2019/11/18.
 */
@RestController
public class TestController {

    @Autowired
    private HelloService service;

    @GetMapping("/")
    public String test() {
        return service.sayHello();
    }
}
