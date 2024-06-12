package com.poly.helloworldsd18313.de3.repository;

import com.poly.helloworldsd18313.de3.entity.GioHang;
import com.poly.helloworldsd18313.de3.entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GioHangRepository extends JpaRepository<GioHang, Integer> {
    public List<GioHang> findGioHangsByMaGioHangContainsAndTenNguoiNhanContains(String maGioHang, String tenNguoiNhan);
}
