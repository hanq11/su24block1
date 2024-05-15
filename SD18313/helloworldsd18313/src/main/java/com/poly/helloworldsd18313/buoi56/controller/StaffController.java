package com.poly.helloworldsd18313.buoi56.controller;

import com.poly.helloworldsd18313.buoi56.entity.Country;
import com.poly.helloworldsd18313.buoi56.entity.Staff;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
        map.put("gd", "Giam Doc");
        return map;
    }
    @ModelAttribute("hobbies")
    public String[] getHobby() {
        String[] list = {"An", "Choi", "Hoc"};
        return list;
    }
    @ModelAttribute("countries")
    public List<Country> getCountry() {
        List<Country> list = new ArrayList<>();
        list.add(new Country("vn", "Viet Nam"));
        list.add(new Country("usa", "My"));
        list.add(new Country("cn", "Trung Quoc"));
        return list;
    }

    @PostMapping("/form")
    public String save(@ModelAttribute("staff") Staff staff, Model model) {
        model.addAttribute("message", "Luu thanh cong");
        return "staff/staff";
    }

}
