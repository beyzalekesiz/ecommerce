package com.example.ecommercebackend.product.model;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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

    //@JsonManagedReference(value = "product-category")
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //@JoinColumn(name="category_id", referencedColumnName = "id")

    //@JoinTable(name = "product",
            //joinColumns = {@JoinColumn(name = "category_id", referencedColumnName = "ID")},
      //
    //      inverseJoinColumns = {@JoinColumn(name = "product_id", referencedColumnName = "ID")})

    private List<Product> products;

    //@Override
    //public String toString() { return "abc";}
}
