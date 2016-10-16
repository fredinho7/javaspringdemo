package com.example.service;

import com.example.domain.Product;
import com.example.repository.Persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by root on 2016-10-15.
 */
@Service
public class TireService implements ProductService {

    @Autowired
    Persistence<Product> productRepository;

    @Override
    public Product addProduct(Product product) {
        return this.productRepository.add(product);
    }

    @Override
    public List<Product> getProducts() {
        return this.productRepository.find();
    }

    @Override
    public Product getProductBy(Integer id) {
        return this.productRepository.get(id);
    }

    @Override
    public Product updateProduct(Product product) {
        return this.productRepository.update(product);
    }

    @Override
    public Integer removeProduct(Integer id) {
        return this.productRepository.remove(id);
    }

    @Override
    public Integer removeAllProdcuts() {
        return this.productRepository.clear();
    }
}
