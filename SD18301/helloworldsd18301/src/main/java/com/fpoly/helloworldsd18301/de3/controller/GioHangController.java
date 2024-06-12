package com.fpoly.helloworldsd18301.de3.controller;

import com.fpoly.helloworldsd18301.de3.entity.GioHang;
import com.fpoly.helloworldsd18301.de3.entity.KhachHang;
import com.fpoly.helloworldsd18301.de3.repository.GioHangRepository;
import com.fpoly.helloworldsd18301.de3.repository.KhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/gio-hang")
public class GioHangController {
    @Autowired
    GioHangRepository gioHangRepository;

    @Autowired
    KhachHangRepository khachHangRepository;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        model.addAttribute("listKhachHang", khachHangRepository.findAll());
        model.addAttribute("listGioHang", gioHangRepository.findAll());
        return "gio-hang/hien-thi";
    }

    @PostMapping("/add")
    public String themMoi(GioHang gioHang) {
        gioHangRepository.save(gioHang);
        return "redirect:/gio-hang/hien-thi";
    }

    @GetMapping("/view-update/{id}")
    public String viewUpdateForm(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("gioHang", gioHangRepository.findById(id).get());
        model.addAttribute("listKhachHang", khachHangRepository.findAll());
        return "gio-hang/view-update";
    }

    @PostMapping("/update")
    public String updateGioHang(GioHang gioHang) {
        gioHangRepository.save(gioHang);
        return "redirect:/gio-hang/hien-thi";
    }

    @GetMapping("/delete")
    public String deleteGioHang(@RequestParam("id") Integer id) {
        gioHangRepository.deleteById(id);
        return "redirect:/gio-hang/hien-thi";
    }

    @GetMapping("/search")
    public String searchGioHang(GioHang gioHang, Model model) {
        model.addAttribute("listGioHang",
                gioHangRepository
                        .findGioHangsByMaGioHangContainsAndTenNguoiNhanContains(
                                gioHang.getMaGioHang(), gioHang.getTenNguoiNhan()
                        ));
        model.addAttribute("listKhachHang", khachHangRepository.findAll());
        return "gio-hang/hien-thi";
    }
}
