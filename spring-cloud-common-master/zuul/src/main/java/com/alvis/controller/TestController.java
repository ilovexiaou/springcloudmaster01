package com.alvis.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zuul")
public class TestController {

    @Value("${name}")
    private String name;

    @GetMapping("/get666")
    public String hello(){
        System.out.println("****************************************************");
        System.out.println(this.name+"****************************************************");

        return name;
    }

}
