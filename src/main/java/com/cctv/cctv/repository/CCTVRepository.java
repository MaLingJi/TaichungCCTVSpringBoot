package com.cctv.cctv.repository;

import com.cctv.cctv.entity.CCTV;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CCTVRepository extends JpaRepository<CCTV, String> {
    List<CCTV> findByRoadsectionContaining(String roadsection);
}
