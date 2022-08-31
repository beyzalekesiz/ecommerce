package com.example.ecommercebackend.user.model;

import com.example.ecommercebackend.order.model.Orders;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

}
