package com.example.repository;

import com.example.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by root on 2016-10-15.
 */
@Repository
public class ProductRepository implements Persistence<Product> {

    Map<Integer, Product> mockDB = new HashMap<Integer, Product>();
    Integer counter = 0;

    @Override
    public Product add(Product element) {
        this.mockDB.put(counter, element);
        counter++;
        return element;
    }

    @Override
    public List<Product> find() {
        return new ArrayList<Product>(mockDB.values());
    }

    @Override
    public Product get(Integer id) {
        return this.mockDB.get(id);
    }

    @Override
    public Product update(Product element) {
        return this.mockDB.put(element.getId(), element);
    }

    @Override
    public Integer remove(Integer id) {
        return this.mockDB.remove(id).getId();
    }

    @Override
    public Integer clear() {
        this.mockDB.clear();
        return 1;
    }
}
