package com.example.controller.api;

import com.example.domain.Product;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by linux on 2016-10-21.
 */
@RestController
@RequestMapping(value = "/api")
public class APIController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/addproduct", method = RequestMethod.POST)
    public ResponseEntity<Product> createProduct() {

        Product p = new Product("NEW PROD!" , "NEWEST PRODUCT!");
        this.productService.addProduct(p);

        return new ResponseEntity<Product>(p, HttpStatus.CREATED);
    }

}
