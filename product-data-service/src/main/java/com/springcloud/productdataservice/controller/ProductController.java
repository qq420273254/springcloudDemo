package com.springcloud.productdataservice.controller;

import com.springcloud.productdataservice.pojo.Product;
import com.springcloud.productdataservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Object products() {
        List<Product> ps = productService.listProducts();
        return ps;
    }
}