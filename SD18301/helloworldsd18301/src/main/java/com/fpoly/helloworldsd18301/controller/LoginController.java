package com.fpoly.helloworldsd18301.controller;

import com.fpoly.helloworldsd18301.request.LoginRequest;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.http.HttpRequest;

@Controller
@RequestMapping("/user")
public class LoginController {
    @RequestMapping("/form")
    public String form() {
        return "user/login";
    }

//    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
//    public String login(HttpServletRequest request) {
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        if(username.equals("sd18301") && password.equals("sd18301")) {
//            request.setAttribute("username", username);
//            request.setAttribute("password", password);
//            return "user/info";
//        }
//        request.setAttribute("message", "Sai thong tin dang nhap");
//        return "user/login";
//    }

//    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
//    public String login(@RequestParam("username") String username,
//                        @RequestParam("password") String password,
//                        Model model) {
//        if(username.equals("sd18301") && password.equals("sd18301")) {
//            model.addAttribute("username", username);
//            model.addAttribute("password", password);
//            return "user/info";
//        }
//        model.addAttribute("message", "sai thong tin dang nhap");
//        return "user/login";
//    }

//    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
//    public String login(LoginRequest request, Model model) {
//        String username = request.getUsername();
//        String password = request.getPassword();
//        if(username.equals("fpt") && password.equals("fpt")) {
//            model.addAttribute("username", username);
//            model.addAttribute("password", password);
//            return "user/info";
//        }
//
//        model.addAttribute("message", "sai thong tin dang nhap");
//        return "user/login";
//    }

    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    public String login(LoginRequest request, Model model,
                        @RequestParam(name = "remember", defaultValue = "false") boolean rm,
                        HttpServletResponse response) {
            String username = request.getUsername();
            String password = request.getPassword();
            if(username.equals("fpt") && password.equals("fpt")) {
                model.addAttribute("username", username);
                model.addAttribute("password", password);

                Cookie ckiUsr = new Cookie("usr", username);
                Cookie ckiPwd = new Cookie("pwd", password);

                int expiry = 0;

                if(rm == true) {
                    expiry = 3 * 24 * 60 * 60;
                }

                ckiUsr.setMaxAge(expiry);
                ckiPwd.setMaxAge(expiry);

                response.addCookie(ckiUsr);
                response.addCookie(ckiPwd);

                return "user/info";
            }

            model.addAttribute("message", "sai thong tin dang nhap");
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
