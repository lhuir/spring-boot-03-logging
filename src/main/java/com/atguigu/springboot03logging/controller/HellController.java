package com.atguigu.springboot03logging.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HellController {

    @RequestMapping("/hello")
    @ResponseBody
    public String show(){
        // 返回字符串
        return "hello world!";
    }

    @RequestMapping("/success")
    public String success(){
        return "success";
    }

    @RequestMapping("/show")
    public String index(){
        return "index";
    }
}
