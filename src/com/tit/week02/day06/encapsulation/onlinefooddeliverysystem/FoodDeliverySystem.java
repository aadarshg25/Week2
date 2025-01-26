package com.tit.week02.day06.encapsulation.onlinefooddeliverysystem;

import java.util.ArrayList;
import java.util.List;

public class FoodDeliverySystem {
    public static void main(String[] args) {
        // Create a list of food items
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Butter Masala", 200, 2));
        order.add(new NonVegItem("Chicken Biryani", 350, 1));
        order.add(new VegItem("Veg Manchurian", 150, 3));

        // Apply discounts
        ((Discountable) order.get(0)).applyDiscount(10); // 10% discount on Paneer Butter Masala
        ((Discountable) order.get(1)).applyDiscount(5);  // 5% discount on Chicken Biryani

        // Process order
        double totalOrderPrice = 0;
        for (FoodItem item : order) {
            System.out.println("\n" + item.getItemDetails());
            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                System.out.println(discountableItem.getDiscountDetails());
            }
            double itemTotal = item.calculateTotalPrice();
            System.out.println("Total Price: " + itemTotal);
            totalOrderPrice += itemTotal;
        }

        System.out.println("\nTotal Order Price: " + totalOrderPrice);
    }
}
