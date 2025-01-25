package com.tit.week2.day05.hybridinheritance.vehiclemanagementsystem;

class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelCapacity;

    public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the vehicle with " + fuelCapacity + " liters capacity.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}
