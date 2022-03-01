package com.df.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hello {
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "Hello,SpringBoot!";
    }

}
