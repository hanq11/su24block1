package com.fpoly.helloworldsof302101.buoi4.controller;

import com.fpoly.helloworldsof302101.buoi4.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/student")
public class StudentController {
    private StudentService service = new StudentService();

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("list", service.getAll());
        return "student/index";
    }

}
