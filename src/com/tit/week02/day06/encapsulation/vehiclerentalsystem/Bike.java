package com.tit.week02.day06.encapsulation.vehiclerentalsystem;

class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 50.0;  // Example insurance cost for bike
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Provider: ProviderB\nPolicy Number: ****5678";  // Example insurance details
    }
}



