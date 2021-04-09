package com.springboot.customerservice.dto;

import commons.Customer;
import commons.Product;

import java.util.List;

public class CustomerDto extends Customer {

    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
