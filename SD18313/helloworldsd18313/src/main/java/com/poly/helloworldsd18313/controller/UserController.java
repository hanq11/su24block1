package com.poly.helloworldsd18313.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @RequestMapping("/user/form")
    public String form() {
        return "user/login";
    }

    @RequestMapping(value = {"/user/login"}, method = RequestMethod.POST)
    public String login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(username.equals("sd18313") && password.equals("sd18313")) {
            request.setAttribute("username", username);
            request.setAttribute("password", password);
            return "user/info";
        }
        request.setAttribute("message", "Thong tin dang nhap sai");
        return "user/login";
    }
}
