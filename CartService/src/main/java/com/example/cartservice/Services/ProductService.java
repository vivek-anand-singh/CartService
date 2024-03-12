package com.example.cartservice.Services;

import com.example.cartservice.Models.Category;
import com.example.cartservice.Models.Product;

import java.util.List;

public interface ProductService {
    Product[] getAllProducts();

    Product getSingleProduct(Long id);

    String[] getAllCategory();
    Category getInCategory(String id);
}
