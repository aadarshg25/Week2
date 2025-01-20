class Vehicle {
    static double registrationFee = 200.0;

    private String ownerName;
    private String vehicleType;

    private final String registrationNumber;

    // Parameterized Constructor
    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // display vehicle details
    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("\nOwner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
            System.out.println();
        } else {
            System.out.println("Invalid vehicle.");
        }
    }

}

class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Rio", "Car", "VT01");
        Vehicle v2 = new Vehicle("Isagi", "Bike", "VT02");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(250.0);
        System.out.println("After Updtaing Registration Fees...");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}