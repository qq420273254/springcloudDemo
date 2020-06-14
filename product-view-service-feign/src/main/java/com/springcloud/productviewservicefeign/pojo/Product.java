package com.springcloud.productviewservicefeign.pojo;

/**
 * Demo class Product
 *
 * @author jiangjianke
 * @date 2020/6/14
 */


public class Product {

    private int id;
    private String name;
    private int price;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public Product() {

    }
    public Product(int id, String name, int price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

}