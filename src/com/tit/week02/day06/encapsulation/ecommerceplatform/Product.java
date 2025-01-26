package com.tit.week02.day06.encapsulation.ecommerceplatform;

abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("\nProduct ID : "+ productId);
        System.out.println("Product Name : "+ name);
        System.out.println("Product Price : " + price);

    }
    public double getPrice() {
        return price;
    }


    public abstract double calculateDiscount();
}



