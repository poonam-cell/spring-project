package com.example.demo.controller;

import com.example.demo.controller.model.ProductId;
import com.example.demo.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class TestController {

    @RequestMapping(value = "/product",method = RequestMethod.POST)
    public ResponseEntity<ProductId> getSomething(@RequestBody final Product product){
        System.out.println(product);
        ProductId id =new ProductId(UUID.randomUUID().toString());
        return ResponseEntity.status(HttpStatus.CREATED)
                .contentType(MediaType.APPLICATION_JSON)
                .body(id);
    }

    @GetMapping("/getById")
    public List<Product> getById(@PathVariable int id){
         List<Product> liprod = new ArrayList<>();
         liprod.add(new Product("1",
                 "prod1",
                 new BigDecimal("234.4")));
        liprod.add(new Product("2",
                "prod1",
                new BigDecimal("234.4")));
        return liprod;
    }

    @PatchMapping("/product")
    public void patchProduct(@RequestBody final Product product){
    System.out.println(product);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable final String id){
        System.out.println(id);
    }
}
