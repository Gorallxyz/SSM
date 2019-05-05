package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PageController {

    @RequestMapping("/indexjsp")
    public ModelAndView Mainjsp(){
        return new ModelAndView("index");
    }

}
