package com.example.ecommercebackend.user.service;

import com.example.ecommercebackend.common.ApiResponse;
import com.example.ecommercebackend.dto.LoginDto;
import com.example.ecommercebackend.user.model.Admin;
import com.example.ecommercebackend.user.model.Users;
import com.example.ecommercebackend.user.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public ApiResponse login(LoginDto loginDto) {
        Admin admin = adminRepository.findByEmail(loginDto.getEmail());
        if(admin == null) {
            return new ApiResponse(false, "Invalid email address.");
        }
        if(!admin.getPassword().equals(loginDto.getPassword())){
            return new ApiResponse(false, "Incorrect password, please try again.");
        }
        return new ApiResponse(true, "Login success");
    }
}
