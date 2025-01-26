package com.tit.week02.day06.encapsulation.vehiclerentalsystem;

class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 200.0;  // Example insurance cost for truck
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Provider: ProviderC\nPolicy Number: ****9012";  // Example insurance details
    }
}


