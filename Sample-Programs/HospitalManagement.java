class Patient {
    static String hospitalName = "AIMS Hospital";

    static int totalPatients = 0;

    private String name;
    private int age;
    private String ailment;

    private final String patientID;

    // Parameterized Constructor
    Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;

        totalPatients++;
    }

    // total number of patients
    public static void getTotalPatients() {
        System.out.println("Total patients admitted: " + totalPatients);
    }

    // display patient details
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("\nPatient Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Hospital: " + hospitalName);
            System.out.println();
        } else {
            System.out.println("Invalid patient.");
        }
    }
}

class HospitalManagement {
    public static void main(String[] args) {
        Patient p1 = new Patient("Ankit", 21, "Flu", "P001");
        Patient p2 = new Patient("Aditya Raj Gupta", 21, "Malaria", "P002");

        Patient.getTotalPatients();

        p1.displayPatientDetails();
        p2.displayPatientDetails();
    }
}