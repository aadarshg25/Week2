package com.tit.week02.day06.encapsulation.vehiclerentalsystem;

class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 150.0;  // Example insurance cost for car
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Provider: ProviderA\nPolicy Number: ****1234";  // Example insurance details
    }
}



