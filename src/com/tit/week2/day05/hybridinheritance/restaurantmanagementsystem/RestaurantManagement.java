package com.tit.week2.day05.hybridinheritance.restaurantmanagementsystem;

class RestaurantManagement {
    public static void main(String[] args) {
        Chef chef = new Chef("Alice", 101, "Italian Cuisine");
        chef.displayDetails();
        chef.performDuties();

        System.out.println();

        Waiter waiter = new Waiter("Bob", 201, "Evening");
        waiter.displayDetails();
        waiter.performDuties();
    }
}
