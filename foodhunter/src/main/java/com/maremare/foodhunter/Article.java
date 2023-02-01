package com.maremare.foodhunter;

public class Article {

    private final String productName;
    private final String price;

    public Article(String productName, String price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Article{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
