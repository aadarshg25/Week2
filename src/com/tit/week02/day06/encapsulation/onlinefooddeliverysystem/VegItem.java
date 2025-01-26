package com.tit.week02.day06.encapsulation.onlinefooddeliverysystem;

class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0; // No discount by default
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) * (1 - discount / 100); ////final discounted price
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

