package com.meng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/Message")
public class MessageController {
    @RequestMapping("/go")
    public String handleMessage()
    {
        return "reach";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "reach";
    }

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String root() {
//        return "index";
//    }
}
