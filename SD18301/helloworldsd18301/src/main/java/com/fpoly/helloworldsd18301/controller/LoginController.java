package com.fpoly.helloworldsd18301.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.net.http.HttpRequest;

@Controller
public class LoginController {
    @RequestMapping("/user/form")
    public String form() {
        return "user/login";
    }

    @RequestMapping(value = {"/user/login"}, method = RequestMethod.POST)
    public String login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(username.equals("sd18301") && password.equals("sd18301")) {
            request.setAttribute("username", username);
            request.setAttribute("password", password);
            return "user/info";
        }
        request.setAttribute("message", "Sai thong tin dang nhap");
        return "user/login";
    }
}
