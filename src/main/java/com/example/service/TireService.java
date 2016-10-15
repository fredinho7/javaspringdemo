package com.example.service;

import com.example.domain.Product;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by root on 2016-10-15.
 */
@Service
public class TireService implements ProductService {

    // Denna klass ska kopplas till ett repository .. ex MongoDB..

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public List<Product> getProducts() {
        return null;
    }

    @Override
    public Product getProductBy(Integer id) {
        return null;
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public Integer removeProduct(Integer id) {
        return null;
    }

    @Override
    public Integer removeAllProdcuts() {
        return null;
    }
}
