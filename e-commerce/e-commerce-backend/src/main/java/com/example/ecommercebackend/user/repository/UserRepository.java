package com.example.ecommercebackend.user.repository;

import com.example.ecommercebackend.product.model.Product;

import com.example.ecommercebackend.user.model.Users;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users,Long> {

    Users findByEmail(String email);
    Users findByPassword(String password);
    Users findByPasswordAndEmail(String email, String password);

}
