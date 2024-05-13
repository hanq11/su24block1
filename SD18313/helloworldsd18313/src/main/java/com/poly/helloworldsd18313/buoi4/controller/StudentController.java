package com.poly.helloworldsd18313.buoi4.controller;

import com.poly.helloworldsd18313.buoi4.entity.Student;
import com.poly.helloworldsd18313.buoi4.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
