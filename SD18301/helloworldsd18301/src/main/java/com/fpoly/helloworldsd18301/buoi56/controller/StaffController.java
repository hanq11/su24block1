package com.fpoly.helloworldsd18301.buoi56.controller;

import com.fpoly.helloworldsd18301.buoi56.entity.Country;
import com.fpoly.helloworldsd18301.buoi56.entity.Staff;
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
        return "staff/staff";
    }

    @ModelAttribute("positions")
    public Map<String, String> getPosition() {
        Map<String, String> map = new HashMap<>();
        map.put("sv", "Sinh Vien");
        map.put("ca", "Cong An");
        map.put("dn", "Doanh Nhan");
        return map;
    }
    @ModelAttribute("hobbies")
    public String[] getHobby() {
        String[] array = {"An", "Choi", "Hoc"};
        return array;
    }
    @ModelAttribute("countries")
    public List<Country> getCountry() {
        List<Country> list = new ArrayList<>();
        list.add(new Country("vn", "Viet Nam"));
        list.add(new Country("usa", "My"));
        list.add(new Country("tq", "Trung Quoc"));
        return list;
    }

    @PostMapping("/form")
    public String save(@Valid @ModelAttribute("staff") Staff staff, BindingResult result, Model model) {
        if(result.hasErrors()) {
            return "staff/staff";
        }
        model.addAttribute("message", "Luu thanh cong");
        return "staff/staff";
    }
}
