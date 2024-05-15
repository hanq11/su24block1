package com.fpoly.helloworldsof302101.buoi4.controller;

import com.fpoly.helloworldsof302101.buoi4.entity.Student;
import com.fpoly.helloworldsof302101.buoi4.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/update/{id}")
    public String showUpdate(@PathVariable("id") String id, Model model) {
        model.addAttribute("student", service.findById(id));
        return "student/update";
    }

    @PostMapping("/update")
    public String update(Student student) {
        service.update(student);
        return "redirect:/student";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") String id) {
        service.delete(id);
        return "redirect:/student";
    }

    @GetMapping("/create")
    public String showCreateForm() {
        return "student/form";
    }

    @PostMapping("/create")
    public String create(Student student) {
        service.create(student);
        return "redirect:/student";
    }

    @GetMapping("/detail")
    public String showDetailById(@RequestParam("id") String id, Model model) {
        model.addAttribute("student", service.findById(id));
        return "student/detail";
    }
}
