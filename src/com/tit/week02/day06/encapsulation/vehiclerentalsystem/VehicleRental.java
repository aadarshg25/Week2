package com.tit.week02.day06.encapsulation.vehiclerentalsystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleRental {
    public static void main(String[] args) {
        // Create a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("ABC123", 50.0));
        vehicles.add(new Bike("XYZ456", 30.0));
        vehicles.add(new Truck("LMN789", 100.0));

        // Iterate over the list and calculate rental and insurance costs
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Rental Cost for 5 days: $" + vehicle.calculateRentalCost(5));

            // If the vehicle is insurable, calculate and show insurance details
            if (vehicle instanceof Insurable) {
                Insurable insurableVehicle = (Insurable) vehicle;
                System.out.println("Insurance Cost: $" + insurableVehicle.calculateInsurance());
                System.out.println("Insurance Details: \n" + insurableVehicle.getInsuranceDetails());
            }
            System.out.println("----------------------------");
        }
    }
}
