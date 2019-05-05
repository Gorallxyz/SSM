package com.ssm.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class DataController {

    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        return "hello world";
    }
}
