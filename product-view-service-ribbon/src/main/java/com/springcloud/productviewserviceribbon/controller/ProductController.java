package com.springcloud.productviewserviceribbon.controller;

import com.springcloud.productviewserviceribbon.pojo.Product;
import com.springcloud.productviewserviceribbon.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Demo class ProductController
 *
 * @author jiangjianke
 * @date 2020/6/13
 */


@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public Object products(Model m) {
        List<Product> ps = productService.listProducts();
        return ps;
    }
}