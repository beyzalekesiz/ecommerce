package com.example.ecommercebackend.dto;

import com.example.ecommercebackend.product.model.Category;
import lombok.Data;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.awt.*;

@Data
@CrossOrigin(origins = "*")
public class ProductDto {

    private String name;
    private String category;
    private Double price;
    private String description;
    private String color;
    @Nullable
    private String imageURL;
    private String size;
//
//    @ManyToOne(cascade = CascadeType.REMOVE, optional = false)
//    @JoinColumn(name = "category", nullable = false)
//    private Category category;

}
