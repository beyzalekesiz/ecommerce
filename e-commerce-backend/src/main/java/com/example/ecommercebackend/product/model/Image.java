package com.example.ecommercebackend.product.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "")
public class Image {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private String name;

    private String type;
    @Column(length = 25500)
    private byte[] bytes;


}
