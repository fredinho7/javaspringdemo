package com.example.repository;

import com.example.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by root on 2016-10-15.
 */
@Repository
public class ProductRepository implements Persistence<Product> {

    @Override
    public Product add(Product element) {
        return null;
    }

    @Override
    public List<Product> find() {
        return null;
    }

    @Override
    public Product get(Integer id) {
        return null;
    }

    @Override
    public Product update(Product element) {
        return null;
    }

    @Override
    public Integer remove(Integer id) {
        return null;
    }

    @Override
    public Integer clear() {
        return null;
    }
}
