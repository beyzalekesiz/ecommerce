package com.example.ecommercebackend.dto;

import com.example.ecommercebackend.user.model.Users;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class UserDto {

    private String name;

    private String password;

    private String email;

}
