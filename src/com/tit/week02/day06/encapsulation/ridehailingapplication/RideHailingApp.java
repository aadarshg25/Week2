package com.tit.week02.day06.encapsulation.ridehailingapplication;

import java.util.ArrayList;
import java.util.List;

public class RideHailingApp {
    public static void main(String[] args) {
        // Create a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR123", "Rio", 15.0, "Bhopal"));
        vehicles.add(new Bike("BIKE456", "Janice", 8.0, "Indore"));
        vehicles.add(new Auto("AUTO789", "Ichigo", 10.0, "Delhi"));

        // Calculate fares for each vehicle
        double distance = 10.0;
        for (Vehicle vehicle : vehicles) {
            System.out.println("\n" + vehicle.getVehicleDetails());
            System.out.println("Current Location: " + ((GPS) vehicle).getCurrentLocation());
            System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));

            // Update location
            ((GPS) vehicle).updateLocation("Sagar");
            System.out.println("Updated Location: " + ((GPS) vehicle).getCurrentLocation());
        }
    }
}

