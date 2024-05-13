package com.poly.helloworldsd18313.controller;

import com.poly.helloworldsd18313.request.LoginRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "helloworld";
    }

    @ResponseBody
    @RequestMapping("/test")
    public String test() {
        return "Test Response Body";
    }

    @ResponseBody
    @RequestMapping("/TestJSON")
    public LoginRequest testJSON() {
        return new LoginRequest();
    }
}
