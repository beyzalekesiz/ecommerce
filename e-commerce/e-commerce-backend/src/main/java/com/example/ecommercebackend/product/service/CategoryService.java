package com.example.ecommercebackend.product.service;

import com.example.ecommercebackend.product.model.Category;
import com.example.ecommercebackend.product.model.Product;
import com.example.ecommercebackend.product.repository.CategoryRepository;
import com.example.ecommercebackend.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public void addCategory(Category category){
        categoryRepository.save(category);
    }

    public void deleteAllCategories() {
        categoryRepository.deleteAll();
    }

    public void deleteCategoryByID(Long id) {
        categoryRepository.deleteById(id);
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public void updateCategoryByID(Long id, Category category) throws Exception {
        Optional<Category> updateCategory = categoryRepository.findById(id);

        if(updateCategory.isPresent()) {
            category.setId(updateCategory.get().getId());
            categoryRepository.save(category);
        }
        else throw new Exception("Category does not exist.");
    }
}
