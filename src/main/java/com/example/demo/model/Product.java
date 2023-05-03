package com.example.demo.model;

import java.math.BigDecimal;

public class Product {
    private  String id;
    private  String desc;
    private  BigDecimal price;

    public Product(String id, String desc, BigDecimal price) {
       this.id = id ;
       this.desc =desc;
       this.price =price;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Product(){
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                '}';
    }
}
