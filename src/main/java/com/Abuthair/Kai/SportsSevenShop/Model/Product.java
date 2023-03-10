package com.Abuthair.Kai.SportsSevenShop.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * @author abuthair on 10/03/23.
 * 11:03 pm
 * @project SportsSevenShop
 */

@Entity
@Getter
@Setter
public class Product {
    //sdada
    @Id
    @GeneratedValue(generator = "product_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "product_gen",sequenceName = "product_seq",allocationSize = 1,initialValue = 1000)
     private Integer productId;
    @Column(length = 100)
     private String productName;
    @Column
     private String productDescription;

     private Category category;
    @Column(length = 100)
     private String brand;
    @Column(length = 100)
     private String imageUrl;
     @Column(name = "Price")
     private double price;

}
