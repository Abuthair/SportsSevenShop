package com.Abuthair.Kai.SportsSevenShop.Service;

import com.Abuthair.Kai.SportsSevenShop.Exception.ProductNotFoundException;
import com.Abuthair.Kai.SportsSevenShop.Model.Product;
import com.Abuthair.Kai.SportsSevenShop.Repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author abuthair on 10/03/23.
 * 11:30 pm
 * @project SportsSevenShop
 */
@Service
public class ServiceProductImpl implements IServiceProduct{
    IProductRepository iProductRepository;
    @Autowired
    public void setiProductRepository(IProductRepository iProductRepository) {
        this.iProductRepository = iProductRepository;
    }

    @Override
    public void addProduct(Product product) {
      iProductRepository.save(product);
    }

    @Override
    public void updateProduct(Product product) {
     iProductRepository.save(product);
    }

    @Override
    public void deleteProduct(int productId) {
     iProductRepository.deleteById(productId);
    }

    @Override
    public Product getById(int productId) throws ProductNotFoundException {

        Product pro = iProductRepository.findById(productId).get();
        if (pro == null){
            throw  new ProductNotFoundException("Product Not Found with Id  "+productId);
        }
        return pro;
    }

    @Override
    public List<Product> getAll() {
        return iProductRepository.findAll();
    }

    @Override
    public List<Product> getByProductNameAndBrand(String productName, String brand) {
        List<Product> pro = iProductRepository.findByProductNameAndBrand(productName,brand);
        if(pro.isEmpty()){
            throw new ProductNotFoundException("Product Not found with "+productName+" And "+brand);
        }
        return pro;
    }

    @Override
    public List<Product> getByBrandAndPriceGreaterThan(String brand, double price) {
        List<Product> pro = iProductRepository.findByBrandAndPriceGreaterThan(brand,price);
        if(pro.isEmpty()){
            throw new ProductNotFoundException("Product Not found with "+brand+" And  "+price);
        }
        return  pro;
    }
}
