package com.example.ecommercebackend.file.controller;

import com.example.ecommercebackend.file.model.FileUpload;
import com.example.ecommercebackend.file.service.FileUploadService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@Getter
@Setter
@RequestMapping("/fileUpload")
public class FileUploadController {

    @Autowired
    private FileUploadService fileUploadService;

    @PostMapping("/upload")
    public FileUpload uploadFile(MultipartFile file){
        return fileUploadService.saveFile(file);
    }
}
