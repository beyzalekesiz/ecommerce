package com.example.ecommercebackend.file.service;

import com.example.ecommercebackend.file.model.FileUpload;
import com.example.ecommercebackend.file.repository.FileUploadRepository;
import lombok.Getter;
import lombok.Setter;
import org.apache.tika.Tika;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;


@Service
@Getter
@Setter
public class FileUploadService {

    @Autowired
    private FileUploadRepository fileUploadRepository;

    Tika tika;

    private String getRandomName() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public String detectType(byte[] fileArr) {
        return tika.detect(fileArr);
    }


    public FileUpload saveFile(MultipartFile file) {
        FileUpload fileUpload = new FileUpload();
        fileUpload.setDate(new Date());
        String randomName = getRandomName();
        fileUpload.setName(randomName);

        File target = new File(randomName);
        try {
            byte[] fileAsByte = file.getBytes();
            FileUtils.writeByteArrayToFile(target, fileAsByte);
            fileUpload.setFileType(detectType(fileAsByte));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return fileUploadRepository.save(fileUpload);
    }


}
