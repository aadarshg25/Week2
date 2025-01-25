package com.tit.week2.day05.inheritence.vehicleandtransportsystem;

class Motorcycle extends Vehicle {
    String engine = "250cc";
    Motorcycle(int maxSpeed , String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    @Override
    void displayInfo() {
        System.out.println();
        System.out.println("Motorcycle has : ");
        System.out.println("MaxSpeed : " + maxSpeed);
        System.out.println("Fuel Type : "+ fuelType);
        System.out.println("engine : "+ engine);
    }
}
