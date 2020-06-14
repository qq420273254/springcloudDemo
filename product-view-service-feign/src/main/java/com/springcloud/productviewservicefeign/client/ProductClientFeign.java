package com.springcloud.productviewservicefeign.client;

import com.springcloud.productviewservicefeign.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Demo class ProductClientFeign
 *
 * @author jiangjianke
 * @date 2020/6/14
 */


@FeignClient(value = "PRODUCT-DATA-SERVICE")
public interface ProductClientFeign {

    @GetMapping("/products")
    List<Product> listProdcuts();
}