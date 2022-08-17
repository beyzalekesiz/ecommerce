package com.example.ecommercebackend.dto;

import com.example.ecommercebackend.user.model.Users;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

@Data
@CrossOrigin(origins = "*")
public class UserDto {

    private String name;

    private String password;

    private String email;

}
