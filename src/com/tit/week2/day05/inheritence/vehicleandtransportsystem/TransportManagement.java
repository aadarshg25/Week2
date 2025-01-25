package com.tit.week2.day05.inheritence.vehicleandtransportsystem;

class TransportManagement {
    public static void main(String[] args) {


        Vehicle car = new Car(200,"Petrol");

        Vehicle truck = new Truck(150,"Diesel");

        Vehicle motorCycle = new Motorcycle(250,"Petrol");

        Vehicle vehicles[] = new Vehicle[3];
        vehicles[0] = car;
        vehicles[1] = truck;
        vehicles[2] = motorCycle;

        //Display Vechicles
        for (var vech : vehicles){
            vech.displayInfo();
        }
    }
}
