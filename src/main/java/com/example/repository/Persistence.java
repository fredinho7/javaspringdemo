package com.example.repository;

import com.example.domain.Product;

import java.util.List;

/**
 * Created by Linux on 2016-10-15.
 */
public interface Persistence<T> {

    T add(T element);

    List<T> find();
    T get(Integer id);

    T update(T element);

    Integer remove(Integer id);
    Integer clear();

}
