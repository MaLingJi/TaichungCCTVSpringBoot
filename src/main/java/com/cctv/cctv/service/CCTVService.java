package com.cctv.cctv.service;

import com.cctv.cctv.entity.CCTV;
import com.cctv.cctv.repository.CCTVRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CCTVService {

    @Autowired
    private CCTVRepository cctvRepository;

    public List<CCTV> findAll() {
        return cctvRepository.findAll();
    }

    public CCTV save(CCTV cctv) {
        return cctvRepository.save(cctv);
    }

    public void deleteById(String id) {
        cctvRepository.deleteById(id);
    }

    public List<CCTV> searchByRoadsection(String roadsection) {
        return cctvRepository.findByRoadsectionContaining(roadsection);
    }

    public CCTV findById(String id) {
        return cctvRepository.findById(id).orElse(null);
    }
}
