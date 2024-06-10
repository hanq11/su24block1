package com.fpoly.helloworldsof302101.de2.controller;

import com.fpoly.helloworldsof302101.de2.entity.Phong;
import com.fpoly.helloworldsof302101.de2.repository.LoaiPhongRepository;
import com.fpoly.helloworldsof302101.de2.repository.PhongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dich-vu")
public class PhongController {
    @Autowired
    PhongRepository phongRepository;

    @Autowired
    LoaiPhongRepository loaiPhongRepository;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        model.addAttribute("listPhong", phongRepository.findAll());
        model.addAttribute("listLoaiPhong", loaiPhongRepository.findAll());
        return "dich-vu/hien-thi";
    }

    @PostMapping("/add")
    public String them(Phong phong) {
        phongRepository.save(phong);
        return "redirect:/dich-vu/hien-thi";
    }

    @GetMapping("/detail/{id}")
    public String showDetail(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("phong", phongRepository.findById(id).get());
        model.addAttribute("listPhong", phongRepository.findAll());
        model.addAttribute("listLoaiPhong", loaiPhongRepository.findAll());
        return "dich-vu/hien-thi";
    }
}
