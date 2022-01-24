package com.company.Products;

import com.company.enums.ProductsCategories;

public class Products {
    String name;
    float price;
    ProductsCategories category;

    public Products(String name, float price, ProductsCategories category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public Products(Products product) {
        this.name = product.name;
        this.price = product.price;
        this.category = product.category;
    }
    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }

    public ProductsCategories getCategory() {
        return category;
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
