package com.springcloud.productviewservicefeign.controller;

import com.springcloud.productviewservicefeign.pojo.Product;
import com.springcloud.productviewservicefeign.service.ProductService;
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
 * @date 2020/6/14
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