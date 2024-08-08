package com.cctv.cctv.service;

import com.cctv.cctv.entity.User;
import com.cctv.cctv.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void save(User user) {
        userRepository.save(user);
    }

    // 檢查username是否已被使用
    public boolean checkUser(User user) {
        User uBean = userRepository.findByUsername(user.getUsername());

        if (uBean != null) {
            return true;
        }
        return false;
    }
}
