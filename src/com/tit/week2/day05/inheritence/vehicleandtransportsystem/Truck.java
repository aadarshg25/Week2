package com.tit.week2.day05.inheritence.vehicleandtransportsystem;

class Truck extends Vehicle {
    int loadCapacity = 200;
    Truck(int maxSpeed , String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    @Override
    void displayInfo() {
        System.out.println();
        System.out.println("Truck has : ");
        System.out.println("MaxSpeed : " + maxSpeed);
        System.out.println("Fuel Type : "+ fuelType);
        System.out.println("Load Capacity : "+ loadCapacity);
    }
}
