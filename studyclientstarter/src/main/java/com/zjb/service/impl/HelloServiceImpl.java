package com.zjb.service.impl;

import com.zjb.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * Created by zjb on 2019/11/18.
 */
@Component
public class HelloServiceImpl implements HelloService {
    public String sayHello() {
        return "hello";
    }
}
