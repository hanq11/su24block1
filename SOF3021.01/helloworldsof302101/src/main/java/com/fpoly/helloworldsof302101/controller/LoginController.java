package com.fpoly.helloworldsof302101.controller;

import com.fpoly.helloworldsof302101.request.LoginRequest;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class LoginController {
    @RequestMapping("/form")
    public String form() {
        return "user/login";
    }

//    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
//    public String login(HttpServletRequest req) {
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//
//        if(username.equals("sof3012") && password.equals("sof3012")) {
//            req.setAttribute("username", username);
//            req.setAttribute("password", password);
//            return "user/info";
//        }
//        req.setAttribute("message", "Sai thong tin dang nhap");
//        return "user/login";
//    }

//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public String login(@RequestParam("username") String username,
//                        @RequestParam("password") String password,
//                        Model model) {
//        if(username.equals("fpt") && password.equals("fpt")) {
//            model.addAttribute("username", username);
//            model.addAttribute("password", password);
//            return "user/info";
//        }
//        model.addAttribute("message", "Sai thong tin dang nhap");
//        return "user/login";
//    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(LoginRequest loginRequest, Model model,
                        @RequestParam(name = "remember", defaultValue = "false") boolean rm,
                        HttpServletResponse response) {
        if(loginRequest.getUsername().equals("fpt") && loginRequest.getPassword().equals("fpt")) {
            model.addAttribute("username", loginRequest.getUsername());
            model.addAttribute("password", loginRequest.getPassword());

            Cookie ckiUsr = new Cookie("usr", loginRequest.getUsername());
            Cookie ckiPwd = new Cookie("pwd", loginRequest.getPassword());

            int expiry = 0;
            if(rm == true) {
                expiry = 24 * 60 * 60 * 3;
            }
            ckiUsr.setMaxAge(expiry);
            ckiPwd.setMaxAge(expiry);
            response.addCookie(ckiUsr);
            response.addCookie(ckiPwd);

            return "user/info";
        }
        model.addAttribute("message", "Sai thong tin dang nhap");
        return "user/login";
    }

    @RequestMapping("/readCookie")
    public String readCookie(@CookieValue("usr") String usr, @CookieValue("pwd") String pwd,
                             Model model) {
        model.addAttribute("usr", usr);
        model.addAttribute("pwd", pwd);
        return "user/info";
    }
}
