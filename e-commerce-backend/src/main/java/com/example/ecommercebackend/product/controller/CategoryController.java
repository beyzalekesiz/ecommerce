package com.example.ecommercebackend.product.controller;

import com.example.ecommercebackend.common.ApiResponse;
import com.example.ecommercebackend.product.model.Category;
import com.example.ecommercebackend.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@CrossOrigin(origins = "*")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @DeleteMapping("/deleteAllCategories")
    public ResponseEntity deleteAllCategories() {
        categoryService.deleteAllCategories();
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/deleteCategoryByID/{id}")
    public ResponseEntity deleteCategoryByID(@PathVariable Long id) {
        categoryService.deleteCategoryByID(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PostMapping("/addCategory")
    public ApiResponse addCategory(@RequestBody Category category){
        categoryService.addCategory(category);
        return new ApiResponse(true, "Category created.");

    }

    @GetMapping("/getAllCategories")
    public List<Category> getAllCategories(){
        List<Category> categories = categoryService.getAllCategories();
        return categories;
    }

    @PutMapping("/updateCategorybyID/{id}")
    public ResponseEntity updateCategorybyID(@PathVariable Long id, @RequestBody Category category) {
        try {
            categoryService.updateCategoryByID(id, category);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
