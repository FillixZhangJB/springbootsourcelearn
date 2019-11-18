package com.zjb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zjb on 2019/11/18.
 */
@RestController
public class TestController {
    @GetMapping("/")
    public String test() {
        return "test";
    }
}
