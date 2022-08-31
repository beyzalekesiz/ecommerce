package com.example.ecommercebackend.product.controller;

import com.example.ecommercebackend.dto.ProductDto;
import com.example.ecommercebackend.product.model.Category;
import com.example.ecommercebackend.product.model.Product;
import com.example.ecommercebackend.product.service.ProductService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getAllProducts")
    public List<Product> getAllProduct(){
        try {
            List<Product> products = productService.listProduct();
            return products;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

    @GetMapping("/getProductByID/{id}")
    public Product getProductByID(@PathVariable Long id) {
        return productService.getProductByID(id).get();
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/addProduct")
    public ResponseEntity addProduct(@RequestBody ProductDto productDto) {
        productService.addProduct(productDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping("/updateProduct/{id}")
    public ResponseEntity updateProductByID(@PathVariable Long id, @RequestBody Product product){
        try {
            productService.updateProductByID(id,product);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/deleteProductByID/{id}")
    public ResponseEntity deleteProductByID(Product product, @PathVariable Long id){
        try {
            productService.deleteProductByID(product, id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return ResponseEntity.ok(HttpStatus.OK);
        //if () return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/deleteAllProducts")
    public ResponseEntity deleteAllProducts(){
        productService.deleteAllProducts();
        return ResponseEntity.ok(HttpStatus.OK);
    }

    //@JsonIgnore


}
