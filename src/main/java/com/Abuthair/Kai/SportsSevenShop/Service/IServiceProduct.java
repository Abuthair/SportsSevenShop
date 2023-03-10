package com.Abuthair.Kai.SportsSevenShop.Service;

import com.Abuthair.Kai.SportsSevenShop.Exception.ProductNotFoundException;
import com.Abuthair.Kai.SportsSevenShop.Model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author abuthair on 10/03/23.
 * 11:30 pm
 * @project SportsSevenShop
 */
@Service
public interface IServiceProduct {
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int productId);
    Product getById(int productId) throws ProductNotFoundException;
    List<Product> getAll();

    List<Product> getByProductNameAndBrand(String productName, String brand);
    List<Product> getByBrandAndPriceGreaterThan(String brand,double price);
}
