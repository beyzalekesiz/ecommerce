package com.example.ecommercebackend.product.model;

import com.example.ecommercebackend.order.model.Orders;
import com.fasterxml.jackson.annotation.*;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "product")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@JsonInclude (JsonInclude.Include.NON_NULL)
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    @Basic(optional = false)
    private String name;
    //@NotNull
    //@Basic(optional = false)
    @Column(name = "price")
    private Double price;

    public Double getPrice() { return price; }
    public void setPrice (Double price) { this.price = price; }
    @Column(name = "size")
    private String size;
    @Column(name = "color")
    private String color;
    @Column(name = "imageURL")
    private String imageURL;
    @Column(name = "description")
    private String description;

    //@JsonBackReference(value = "product-category")


//    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JsonIgnoreProperties({"hibernateLazyInitializer", "category", "products"})
//    @JoinColumn(name = "order_id")
//    private Orders order;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, optional = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "products"})
    @JoinColumn(name = "categoryID", nullable = false)
    private Category category;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "order_id")
    private Orders order;



}
