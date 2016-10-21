package com.example.controller.web;

import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by linux on 2016-10-21.
 */
@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/products")
    public String products(Model model) {
        model.addAttribute("products", productService.getProducts());
        return "products";
    }

    @RequestMapping(value = "/product/{id}")
    public String product(Model model, @PathVariable("id") Integer id) {
        model.addAttribute("product", productService.getProductBy(id));
        return "product";
    }

}
