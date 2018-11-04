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
        // 返回字符串1
        return "hello world!";
    }

    @RequestMapping("/success")
    public String success(){
        // 跳转success.html页面12
        return "success";
    }

    @RequestMapping("/show")
    public String index(){
        return "index";
    }
}
