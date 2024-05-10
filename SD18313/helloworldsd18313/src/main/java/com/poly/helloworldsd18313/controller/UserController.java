package com.poly.helloworldsd18313.controller;

import com.poly.helloworldsd18313.request.LoginRequest;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/form")
    public String form() {
        return "user/login";
    }

//    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
//    public String login(HttpServletRequest request) {
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        if(username.equals("sd18313") && password.equals("sd18313")) {
//            request.setAttribute("username", username);
//            request.setAttribute("password", password);
//            return "user/info";
//        }
//        request.setAttribute("message", "Thong tin dang nhap sai");
//        return "user/login";
//    }

//    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
//    public String login(@RequestParam("username") String username,
//                        @RequestParam("password") String password,
//                        Model model) {
//        if(username.equals("fpt") && password.equals("fpt")) {
//            model.addAttribute("username", username);
//            model.addAttribute("password", password);
//            return "user/info";
//        }
//        model.addAttribute("message", "Thong tin dang nhap sai");
//        return "user/login";
//    }

//    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
//    public String login(LoginRequest loginRequest, Model model) {
//        String username = loginRequest.getUsername();
//        String password = loginRequest.getPassword();
//        if(username.equals("fpt") && password.equals("fpt")) {
//            model.addAttribute("username", username);
//            model.addAttribute("password", password);
//            return "user/info";
//        }
//        model.addAttribute("message", "Thong tin dang nhap sai");
//        return "user/login";
//    }

    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    public String login(LoginRequest loginRequest, Model model,
                        @RequestParam(value = "remember", defaultValue = "false") boolean rm,
                        HttpServletResponse response) {
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();
        if(username.equals("fpt") && password.equals("fpt")) {
            model.addAttribute("username", username);
            model.addAttribute("password", password);

            Cookie ckiUsr = new Cookie("usr", username);
            Cookie ckiPwd = new Cookie("pwd", password);

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
        model.addAttribute("message", "Thong tin dang nhap sai");
        return "user/login";
    }

    @RequestMapping("/readCookie")
    public String readCookie(@CookieValue("usr") String username,
                             @CookieValue("pwd") String password,
                             Model model) {
        model.addAttribute("usr", username);
        model.addAttribute("pwd", password);
        return "user/info";
    }
}
