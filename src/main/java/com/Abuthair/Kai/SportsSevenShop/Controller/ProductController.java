package com.Abuthair.Kai.SportsSevenShop.Controller;

import com.Abuthair.Kai.SportsSevenShop.Exception.ProductNotFoundException;
import com.Abuthair.Kai.SportsSevenShop.Model.Product;
import com.Abuthair.Kai.SportsSevenShop.Service.IServiceProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author abuthair on 10/03/23.
 * 11:48 pm
 * @project SportsSevenShop
 */
@RestController
@RequestMapping("/Product-api")
public class ProductController {
    IServiceProduct iServiceProduct;
    @Autowired
    public void setiServiceProduct(IServiceProduct iServiceProduct) {
        this.iServiceProduct = iServiceProduct;
    }
    @PostMapping("/products")
    void addProduct(@RequestBody Product product){
       iServiceProduct.addProduct(product);
    }
    @PutMapping("/products")
    void updateProduct( @RequestBody  Product product){
      iServiceProduct.updateProduct(product);
    }
    @DeleteMapping("/products/productId/{productId}")
    void deleteProduct(@PathVariable("productId") int productId){
     iServiceProduct.deleteProduct(productId);
    }
    @GetMapping("/products/productId/{productId}")
    Product getById(int productId) throws ProductNotFoundException{
        Product pro = iServiceProduct.getById(productId);
        return pro;
    }
    @GetMapping("/products")
    List<Product> getAll(){
        return iServiceProduct.getAll();
    }
    @GetMapping("/products/productName/{productName}/brand/{brand}")
    List<Product> getByProductNameAndBrand(@PathVariable("productName") String productName,@PathVariable("brand") String brand){
        return iServiceProduct.getByProductNameAndBrand(productName,brand);

    }
    @GetMapping("/products/brand/{brand}/price/{price}")
    List<Product> getByBrandAndPriceGreaterThan(@PathVariable("brand") String brand,@PathVariable("price") double price){
        return iServiceProduct.getByBrandAndPriceGreaterThan(brand,price);
    }
}
