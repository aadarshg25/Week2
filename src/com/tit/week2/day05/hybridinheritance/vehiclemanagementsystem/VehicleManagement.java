package com.tit.week2.day05.hybridinheritance.vehiclemanagementsystem;

class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 260, 75);
        ev.displayDetails();
        ev.charge();

        System.out.println();

        PetrolVehicle pv = new PetrolVehicle("Ford Mustang", 250, 60);
        pv.displayDetails();
        pv.refuel();
    }
}
