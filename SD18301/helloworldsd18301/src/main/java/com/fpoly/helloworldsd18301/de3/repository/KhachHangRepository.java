package com.fpoly.helloworldsd18301.de3.repository;

import com.fpoly.helloworldsd18301.de3.entity.GioHang;
import com.fpoly.helloworldsd18301.de3.entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang, Integer> {
}
