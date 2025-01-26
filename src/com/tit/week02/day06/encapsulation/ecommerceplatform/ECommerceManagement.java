package com.tit.week02.day06.encapsulation.ecommerceplatform;

import java.util.ArrayList;
import java.util.List;

class ECommerceManagement {

    public static void calculateAndPrintFinalPrice(List<Product> products) {
        for (Product product : products) {
            double discount = product.calculateDiscount();
            double tax = 0.0;

            //To Check who is eligible for tax
            if (product instanceof Taxable) {
                tax = ((Taxable) product).calculateTax(); //downcast to access method
            }

            double finalPrice = product.getPrice() + tax - discount;

            product.displayDetails();
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);

        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics("E001", "Smartphone", 50000));
        products.add(new Clothing("C001", "T-Shirt", 1000));
        products.add(new Groceries("G001", "Rice", 500));

        calculateAndPrintFinalPrice(products);
    }
}
