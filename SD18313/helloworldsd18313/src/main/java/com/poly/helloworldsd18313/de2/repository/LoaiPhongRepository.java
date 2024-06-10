package com.poly.helloworldsd18313.de2.repository;

import com.poly.helloworldsd18313.de2.entity.LoaiPhong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiPhongRepository extends JpaRepository<LoaiPhong, Integer> {
}
