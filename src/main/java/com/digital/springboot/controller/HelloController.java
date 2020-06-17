package com.digital.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello,World";
    }

    @RequestMapping("/success")
    public String success(Map<String,String> map){
        map.put("hello","你好");

        return "success";
    }
}
