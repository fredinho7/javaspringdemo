package com.example.controller;

import com.example.domain.Product;
import com.example.service.ProductService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by root on 2016-10-14.
 */

@RestController
@RequestMapping(value = "/server/", produces = MediaType.APPLICATION_JSON_VALUE)
public class DemoController {

    @Autowired
    ProductService service;

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ResponseEntity<Product> addProduct(Product product) {
        product = service.addProduct(product);
        ResponseEntity<Product> response = new ResponseEntity<Product>(product, HttpStatus.CREATED);
        return response;
    }

}
