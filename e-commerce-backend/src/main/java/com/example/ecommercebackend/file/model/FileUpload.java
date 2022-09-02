package com.example.ecommercebackend.file.model;

import com.example.ecommercebackend.product.model.Product;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Getter
@Setter
public class FileUpload {
    @Id
    @GeneratedValue
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    private String name;

    private String fileType;

    @OneToOne(mappedBy = "fileUpload", cascade = CascadeType.ALL, orphanRemoval = true)
    private Product product;

}
