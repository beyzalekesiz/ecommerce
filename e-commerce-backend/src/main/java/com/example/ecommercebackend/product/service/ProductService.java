package com.example.ecommercebackend.product.service;

import com.example.ecommercebackend.dto.ProductDto;
import com.example.ecommercebackend.product.model.Category;
import com.example.ecommercebackend.product.model.Product;
import com.example.ecommercebackend.product.repository.CategoryRepository;
import com.example.ecommercebackend.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productrepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Product> listProduct() { return productrepository.findAll(); }

    public Optional<Product> getProductByID( Long id) { return productrepository.findById(id); }

    public void addProduct(ProductDto productDto) {
        Category category = categoryRepository.findById(productDto.getCategoryID()).get();
//        product.setCategory(category);
        Product product = new Product();
        product.setName(productDto.getName());
        product.setCategory(category);
        product.setPrice(product.getPrice());
        product.setDescription(productDto.getDescription());
        product.setColor(productDto.getColor());
        product.setImageURL(productDto.getImageURL());
        product.setSize(productDto.getSize());
        product.setFileUpload(product.getFileUpload());
        productrepository.save(product);
    }

    public void updateProductByID(Long id, Product product) throws Exception {

        Optional<Product> updateProduct = productrepository.findById(id);

        if(updateProduct.isPresent()){
            product.setId(updateProduct.get().getId());
            productrepository.save(product);
        }else{
            throw new Exception("Product not found.");
        }


    }

    public void deleteAllProducts() {
        productrepository.deleteAll();
    }

    public void deleteProductByID(Product product, Long id) throws Exception {

        Optional<Product> deleteProduct = productrepository.findById(id);

        if(deleteProduct.isPresent()){
            product.setId(deleteProduct.get().getId());
            productrepository.deleteById(id);
        }else{
            throw new Exception("Product does not exist or has been deleted already.");
        }
        productrepository.deleteById(id);
    }

    public void addToOrders(Long id, Product product) {

    }




}
