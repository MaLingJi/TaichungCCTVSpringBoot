package com.cctv.cctv.repository;

import com.cctv.cctv.entity.CCTV;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CCTVRepository extends JpaRepository<CCTV, String> {
    List<CCTV> findByRoadsectionContaining(String roadsection);
}
