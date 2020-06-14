package com.springcloud.productdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductDataServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductDataServiceApplication.class, args);
    }

}
