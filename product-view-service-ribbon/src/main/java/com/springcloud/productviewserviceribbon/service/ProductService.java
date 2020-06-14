package com.springcloud.productviewserviceribbon.service;

import com.springcloud.productviewserviceribbon.component.ProductClientRibbon;
import com.springcloud.productviewserviceribbon.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Demo class ProductService
 *
 * @author jiangjianke
 * @date 2020/6/13
 */


@Service
public class ProductService {
    @Autowired
    ProductClientRibbon productClientRibbon;
    public List<Product> listProducts(){
        return productClientRibbon.listProdcuts();

    }
}