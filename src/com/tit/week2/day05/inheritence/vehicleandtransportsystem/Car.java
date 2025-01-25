package com.tit.week2.day05.inheritence.vehicleandtransportsystem;

class Car extends Vehicle {
    int seatCapacity = 20;
    Car(int maxSpeed , String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    @Override
    void displayInfo() {
        System.out.println();
        System.out.println("Car has : ");
        System.out.println("MaxSpeed : " + maxSpeed);
        System.out.println("Fuel Type : "+ fuelType);
        System.out.println("Seat Capacity : "+ seatCapacity);
    }
}
