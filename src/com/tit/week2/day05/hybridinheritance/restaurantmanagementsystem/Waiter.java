package com.tit.week2.day05.hybridinheritance.restaurantmanagementsystem;

class Waiter extends Person implements Worker {
    String shift;

    public Waiter(String name, int id, String shift) {
        super(name, id);
        this.shift = shift;
    }

    @Override
    public void performDuties() {
        System.out.println("Duties: Serving food to customers and ensuring excellent service during the " + shift + " shift.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Waiter");
        System.out.println("Shift: " + shift);
    }
}
