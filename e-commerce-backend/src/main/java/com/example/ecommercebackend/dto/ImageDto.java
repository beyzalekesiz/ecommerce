package com.example.ecommercebackend.dto;

import lombok.Data;
import org.springframework.web.bind.annotation.CrossOrigin;


@Data
@CrossOrigin(origins = "*")
public class ImageDto {

    private String name;

    private String type;

    private byte[] bytes;
}