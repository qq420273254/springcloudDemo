package com.springcloud.productviewservicefeign.service;

import com.springcloud.productviewservicefeign.client.ProductClientFeign;
import com.springcloud.productviewservicefeign.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Demo class ProductService
 *
 * @author jiangjianke
 * @date 2020/6/14
 */


@Service
public class ProductService {
    @Autowired
    ProductClientFeign productClientFeign;
    public List<Product> listProducts(){
        return productClientFeign.listProdcuts();

    }
}