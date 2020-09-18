package com.kangge.authenticate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaok
 * @time 2020/9/18
 */
@RestController
@RequestMapping(value = "/test")
public class TheFirstController {

    @GetMapping(value = "/first")
    public String testOne(){
        return "this first controller";
    }

}
