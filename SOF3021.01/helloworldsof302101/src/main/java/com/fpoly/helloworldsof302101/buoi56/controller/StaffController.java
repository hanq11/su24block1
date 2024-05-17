package com.fpoly.helloworldsof302101.buoi56.controller;

import com.fpoly.helloworldsof302101.buoi56.entity.Country;
import com.fpoly.helloworldsof302101.buoi56.entity.Staff;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/staff")
public class StaffController {
    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("staff", new Staff());
        String s;
        return "staff/form";
    }

    @PostMapping("/form")
    public String register(@Valid @ModelAttribute("staff") Staff staff, BindingResult result, Model model) {
        if(result.hasErrors()) {
            return "staff/form";
        }
        model.addAttribute("message", "Dang ky thanh cong");
        return "staff/form";
    }

    @ModelAttribute("positions")
    public Map<String, String> getPosition() {
        Map<String, String> map = new HashMap<>();
        map.put("sv", "Sinh Vien");
        map.put("dn", "Doanh Nhan");
        map.put("bv", "Bao Ve");
        return map;
    }

    @ModelAttribute("hobbies")
    public String[] getHobby() {
        String[] list = {"An", "Hoc", "Choi Game"};
        return list;
    }

    @ModelAttribute("countries")
    public List<Country> getCountry() {
        List<Country> list = new ArrayList<Country>();
        list.add(new Country("1", "Viet Nam"));
        list.add(new Country("2", "Thai Lan"));
        list.add(new Country("3", "Anh Quoc"));
        return list;
    }
}
