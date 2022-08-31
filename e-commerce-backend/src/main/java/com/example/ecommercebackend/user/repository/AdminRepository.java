package com.example.ecommercebackend.user.repository;

import com.example.ecommercebackend.user.model.Admin;
import com.example.ecommercebackend.user.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Users,Long> {
    Admin findByEmail(String email);
}
