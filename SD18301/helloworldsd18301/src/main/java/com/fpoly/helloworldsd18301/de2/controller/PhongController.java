package com.fpoly.helloworldsd18301.de2.controller;

import com.fpoly.helloworldsd18301.de2.entity.Phong;
import com.fpoly.helloworldsd18301.de2.repository.LoaiPhongRepository;
import com.fpoly.helloworldsd18301.de2.repository.PhongRepository;
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
    LoaiPhongRepository loaiPhongRepository;

    @Autowired
    PhongRepository phongRepository;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        model.addAttribute("listLoaiPhong", loaiPhongRepository.findAll());
        model.addAttribute("listPhong", phongRepository.findAll());
        return "dich-vu/hien-thi";
    }

    @PostMapping("/add")
    public String themMoi(Phong phong) {
        phongRepository.save(phong);
        return "redirect:/dich-vu/hien-thi";
    }

    @GetMapping("/detail/{id}")
    public String showDetail(Model model, @PathVariable("id") Integer id) {
        model.addAttribute("listLoaiPhong", loaiPhongRepository.findAll());
        model.addAttribute("listPhong", phongRepository.findAll());
        model.addAttribute("phong", phongRepository.findById(id).get());
        return "dich-vu/hien-thi";
    }
}
