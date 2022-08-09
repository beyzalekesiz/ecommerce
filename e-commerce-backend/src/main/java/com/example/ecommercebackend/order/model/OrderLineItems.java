package com.example.ecommercebackend.order.model;

import com.example.ecommercebackend.product.model.Product;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class OrderLineItems {

    @EmbeddedId
    private OrderID pk;

    @Column(name = "quantity")
    private Long quantity;

    @OneToMany
    private List<Product> products;

    /*public Double getLinePrice() {
        return pk.getProduct().getPrice() * quantity;
    }*/

}
