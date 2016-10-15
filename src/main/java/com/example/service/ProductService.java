package com.example.service;

import com.example.domain.Product;

import java.util.List;

/**
 * Created by root on 2016-10-15.
 */
public interface ProductService {

    Product addProduct(Product product);

    List<Product> getProducts();
    Product getProductBy(Integer id);

    Product updateProduct(Product product);

    Integer removeProduct(Integer id);
    Integer removeAllProdcuts();

}
