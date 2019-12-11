package com.meng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
    @RequestMapping("/detail/data={uname}")
    public String Search(@PathVariable("uname")String data, Model model)
    {
        model.addAttribute("data", data);
        System.out.println("查询...");
        return "detail";
    }

    @RequestMapping(value = "/report1", method = RequestMethod.GET)
    public String reportGet(@RequestParam("begin")String begin, @RequestParam("end")String end, Model model)
    {
        model.addAttribute("begin", begin);
        model.addAttribute("end", end);
        model.addAttribute("formType", "GET");
        return "report";
    }

    @RequestMapping(value = "/report2", method = RequestMethod.POST)
    public String reportPost(@RequestParam("begin")String begin, @RequestParam("end")String end, Model model)
    {
        model.addAttribute("begin", begin);
        model.addAttribute("end", end);
        model.addAttribute("formType", "POST");
        return "report";
    }
}
