package com.example.demo.controller;

import jdk.jfr.ContentType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController //==@ResponseBody + @Controller
public class Hellocontroller {

    @RequestMapping("/hello")
    public  String handle01(){
        System.out.println("hello");
        return "Hello,Spring Boot2222222222";
    }
}
