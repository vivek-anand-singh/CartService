package com.example.cartservice.Controller;

import com.example.cartservice.Models.Product;
import com.example.cartservice.Services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public Product[] getAllProduct(){
        return  productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getSingleProduct(@PathVariable("id") Long id) {
        return productService.getSingleProduct(id);
    }

    @PostMapping("/addProduct")
    public Product addNewProduct(Product product){
        return null;
    }

    @PutMapping("/updateproduct")
    public Product updateProduct(Product product){
        return null;
    }

    @DeleteMapping("/deleteproduct")
    public Product deleteProduct(Product product){
        return null;
    }


}
