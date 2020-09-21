package com.kangge.authenticate.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zk
 * @Date: 2020/9/21 11:20
 */
@RestController
@RequestMapping("/demo")
public class ResourceController {
    @GetMapping(value = "/test")
    public String getTest(){
        return "abc";
    }

}
