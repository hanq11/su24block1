package com.fpoly.helloworldsd18301.de2.repository;

import com.fpoly.helloworldsd18301.de2.entity.Phong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhongRepository extends JpaRepository<Phong, Integer> {
}
