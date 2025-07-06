package com.example.ecommercebackend.product.model;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "category")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Product> products = new LinkedHashSet<>();

    //@JsonManagedReference(value = "product-category")

    //@JoinColumn(name="category_id", referencedColumnName = "id")

    //@JoinTable(name = "product",
            //joinColumns = {@JoinColumn(name = "category_id", referencedColumnName = "ID")},
      //
    //      inverseJoinColumns = {@JoinColumn(name = "product_id", referencedColumnName = "ID")})

    //@Override
    //public String toString() { return "abc";}
}
