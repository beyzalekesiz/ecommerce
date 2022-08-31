package com.example.ecommercebackend.user.controller;

import com.example.ecommercebackend.common.ApiResponse;
import com.example.ecommercebackend.dto.LoginDto;
import com.example.ecommercebackend.dto.RegisterDto;
import com.example.ecommercebackend.user.model.Users;
import com.example.ecommercebackend.user.service.AdminService;
import com.example.ecommercebackend.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "*")
public class AdminController {

    @Autowired
    private AdminService adminService;


//    @RequestMapping(path ="/getAllUsers", method = RequestMethod.GET)
//    public List<Users> getAllUsers() {
//        List<Users> users = adminService.listUsers();
//        return users;
//    }
//
//    @GetMapping("/getUserByID/{id}")
//    public Users getUserByID(@PathVariable Long id) {
//        Users user = userService.getUserByID(id).get();
//        return user;
//    }
//
//    @GetMapping("/getUserByEmail/{email}")
//    public Users getUserByEmail(@PathVariable String email) {
//        Users user = userService.getUserByEmail(email);
//        return user;
//    }
//
//    @CrossOrigin(origins = "*")
//    @PostMapping("/addUser")
//    public ResponseEntity addUser(@RequestBody RegisterDto registerDto) {
//        userService.addUser(registerDto);
//        return ResponseEntity.ok(HttpStatus.OK);
//    }
//
//    /*
//    @CrossOrigin(origins = "*")
//    @PostMapping ("/login")
//    public ApiResponse login(LoginDto loginDto) {
//        try {
//            userService.login(loginDto);
//        } catch (Exception e) {
//            return new ApiResponse(false, "Invalid password.");
//        }
//
//        return new ApiResponse(true, "Successfully logged in.");
//    }*/
//
    @PostMapping("/adminLogin")
    public ApiResponse login(@RequestBody LoginDto loginDto){
        return adminService.login(loginDto);
    }
//
//
//    @DeleteMapping("/deleteUserByID/{id}")
//    public ResponseEntity deleteUserByID(@PathVariable Long id) {
//        userService.deleteUserByID(id);
//        return ResponseEntity.ok(HttpStatus.OK);
//    }
//
//    @PutMapping("/updateUserByID")
//    public ResponseEntity updateUserByID(@PathVariable Long id, @RequestBody Users user){
//        userService.deleteUserByID(user.getId());
//        return ResponseEntity.ok(HttpStatus.OK);
//    }

}
