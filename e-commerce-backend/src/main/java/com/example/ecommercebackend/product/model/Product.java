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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
@JsonInclude (JsonInclude.Include.NON_NULL)
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    @NotNull
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
    @Nullable
    @Column(name = "description")
    private String description;

    //@JsonBackReference(value = "product-category")
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "products"})
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "category", "products"})
    @JoinColumn(name = "order_id")
    private Orders order;
}
