package com.example.cartservice.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {
    private String name;
    private Long id;
    private String title;
    private double price;
    private Category category;
    private String description;
    private String imageurl;
    public Category() {
        this.name = "";
        this.id = 0L;
        this.title = "";
        this.price = 0.0;
        this.description = "";
        this.imageurl = "";
    }
}

