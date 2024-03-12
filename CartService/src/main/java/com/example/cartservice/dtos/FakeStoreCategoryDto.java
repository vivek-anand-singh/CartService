package com.example.cartservice.dtos;

import com.example.cartservice.Models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreCategoryDto {
        private String name;
        private Long id;
        private String title;
        private double price;
        private Category category;
        private String description;
        private String imageurl;
        FakeStoreCategoryDto(){
                this.id = 0L;
                this.title = null;
                this.price = 0.0;
                this.category = new Category();
                this.description = null;
                this.imageurl = null;
                this.name = null;
        }

    }

