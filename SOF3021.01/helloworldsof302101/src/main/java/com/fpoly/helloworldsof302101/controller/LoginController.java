package com.fpoly.helloworldsof302101.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    @RequestMapping("/user/form")
    public String form() {
        return "user/login";
    }

    @RequestMapping(value = {"/user/login"}, method = RequestMethod.POST)
    public String login(HttpServletRequest req) {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if(username.equals("sof3012") && password.equals("sof3012")) {
            req.setAttribute("username", username);
            req.setAttribute("password", password);
            return "user/info";
        }
        req.setAttribute("message", "Sai thong tin dang nhap");
        return "user/login";
    }

}
