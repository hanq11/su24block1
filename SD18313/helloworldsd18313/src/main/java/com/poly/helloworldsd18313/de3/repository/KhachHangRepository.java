package com.poly.helloworldsd18313.de3.repository;

import com.poly.helloworldsd18313.de3.entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang, Integer> {
}
