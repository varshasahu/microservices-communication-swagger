package com.springboot.customerservice.feign.client;

import commons.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="product-service")
public interface ProductClient {

    @RequestMapping(method = RequestMethod.GET, value = "/products")
    List<Product> listProducts();

    @RequestMapping(method = RequestMethod.GET, value = "/products/{id}")
    Product getProductById(@PathVariable String id);

    @RequestMapping(method = RequestMethod.POST, value = "/products")
    Product create(@RequestBody Product product);

    @RequestMapping(method = RequestMethod.GET, value = "/products/customer/{custId}")
    List<Product> listProductsByCustomerId(@PathVariable String custId);
}
