package com.example.ecommercebackend.dto;

import lombok.Data;
import org.springframework.web.bind.annotation.CrossOrigin;

@Data
@CrossOrigin(origins = "*")
public class RegisterDto {

    private String name;

    private String password;

    private String email;

}
