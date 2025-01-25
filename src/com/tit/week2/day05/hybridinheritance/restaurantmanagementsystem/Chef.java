package com.tit.week2.day05.hybridinheritance.restaurantmanagementsystem;

class Chef extends Person implements Worker {
    String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Duties: Preparing delicious meals, especially " + specialty + ".");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Chef");
        System.out.println("Specialty: " + specialty);
    }
}
