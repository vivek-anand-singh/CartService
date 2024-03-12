package com.example.cartservice.Services;

import com.example.cartservice.Models.Category;
import com.example.cartservice.Models.Product;
import com.example.cartservice.dtos.FakeStoreCategoryDto;
import com.example.cartservice.dtos.FakeStoreProductDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class FakeStoreProductService implements ProductService{

    private final RestTemplate restTemplate = new RestTemplate();

    @Override
    public Product[] getAllProducts() {
        FakeStoreProductDto[] fakeStoreProductDto =  restTemplate.getForObject("https://fakestoreapi.com/products" , FakeStoreProductDto[].class);
        Product [] product = new Product[fakeStoreProductDto.length];
        for(int i = 0; i<fakeStoreProductDto.length;i++){
            product[i] = new Product();
            product[i].setId(fakeStoreProductDto[i].getId());
            product[i].setTitle(fakeStoreProductDto[i].getTitle());
            product[i].setPrice(fakeStoreProductDto[i].getPrice());
            product[i].setImageurl(fakeStoreProductDto[i].getImage());
            product[i].setDescription(fakeStoreProductDto[i].getDescription());
            product[i].setCategory(new Category());
            product[i].getCategory().setName(fakeStoreProductDto[i].getCategory());
        }
        return product;
    }

    @Override
    public Product getSingleProduct(Long id) {

        FakeStoreProductDto fakeStoreProductDto =  restTemplate.getForObject("https://fakestoreapi.com/products/" + id, FakeStoreProductDto.class);

        Product product = new Product();
        product.setId(fakeStoreProductDto.getId());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setPrice(fakeStoreProductDto.getPrice());
        product.setImageurl(fakeStoreProductDto.getImage());
        product.setDescription(fakeStoreProductDto.getDescription());
        product.setCategory(new Category());
        product.getCategory().setName(fakeStoreProductDto.getCategory());

        return product;
    }

    @Override
    public String[] getAllCategory() {
        String [] categories = restTemplate.getForObject("https://fakestoreapi.com/products/categories", String[].class);
        return categories;
    }

    @Override
    public Category getInCategory(String id) {
        FakeStoreCategoryDto fakeStoreCategoryDto = restTemplate.getForObject("https://fakestoreapi.com/products/categories"+id, FakeStoreCategoryDto.class);
        Category categories = new Category();
        categories.setName(fakeStoreCategoryDto.getName());
        categories.setCategory(fakeStoreCategoryDto.getCategory());
        categories.setPrice(fakeStoreCategoryDto.getPrice());
        categories.setImageurl(fakeStoreCategoryDto.getImageurl());
        categories.setId(fakeStoreCategoryDto.getId());
        categories.setDescription(fakeStoreCategoryDto.getDescription());
        categories.setTitle(fakeStoreCategoryDto.getTitle());
        return categories;
    }
}
