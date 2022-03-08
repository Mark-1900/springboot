package com.df.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hello {
    @RequestMapping("/test")
    @ResponseBody
    public String test1(){
        return "Hello,SpringBoot!";
    }
    public String test2(){
        return "你好";
    }

}
