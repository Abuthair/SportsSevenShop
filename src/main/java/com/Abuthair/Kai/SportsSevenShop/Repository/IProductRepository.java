package com.Abuthair.Kai.SportsSevenShop.Repository;

import com.Abuthair.Kai.SportsSevenShop.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author abuthair on 10/03/23.
 * 11:18 pm
 * @project SportsSevenShop
 */
//Crud
@Repository
public interface IProductRepository extends JpaRepository<Product,Integer> {
    @Query("from Product p where p.productName = ?1 and p.brand = ?2")
    List<Product> findByProductNameAndBrand(String productName,String brand);
    @Query("from Product p where p.brand=?1 and p.price =?2")
    List<Product> findByBrandAndPriceGreaterThan(String brand,double price);


}
