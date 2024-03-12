package com.example.cartservice.Controller;

import com.example.cartservice.Models.Category;
import com.example.cartservice.Services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    private final ProductService productService;

    public CategoryController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/products/categories")
    public String[] getAllCategory(){
        return productService.getAllCategory();
    }

    @GetMapping("/products/categories/{id}")
    public Category getInCategory(@PathVariable("id") String id){
        return productService.getInCategory(id);
    }
}
