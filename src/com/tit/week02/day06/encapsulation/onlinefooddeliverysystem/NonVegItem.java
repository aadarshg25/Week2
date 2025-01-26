package com.tit.week02.day06.encapsulation.onlinefooddeliverysystem;

class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    private final double nonVegCharge = 50; // Additional charge for non-veg items

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0; // No discount by default
    }

    @Override
    public double calculateTotalPrice() {
        double basePrice = (getPrice() * getQuantity()) + nonVegCharge;
        return basePrice * (1 - discount / 100); //final discounted price
    }

    @Override
    public void applyDiscount(double percentage) {
        this.discount = percentage;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applied: " + discount + "%";
    }
}
