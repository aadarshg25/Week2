import java.util.ArrayList;
import java.util.List;

class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Consult method to show communication between doctor and patient
    public void consult(Patient patient) {
        patients.add(patient);
        System.out.println("Doctor " + name + " is consulting with Patient " + patient.getName() + ".");
        patient.addDoctor(this);
        System.out.println();
    }

    public List<Patient> getPatients() {
        return patients;
    }
}

class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Add doctor to patient's list of doctors
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }
}

class Hospital {
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital() {
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    // Display details of all consultations
    public void displayConsultations() {
        for (Doctor doctor : doctors) {
            for (Patient patient : doctor.getPatients()) {
                System.out.println("Doctor " + doctor.getName() + " has consulted with Patient " + patient.getName());
            }
        }
    }
}

public class HospitalManagment {
    public static void main(String[] args) {

        Doctor doctor1 = new Doctor("Dr. Aditya");
        Doctor doctor2 = new Doctor("Dr. Aadarsh");

        Patient patient1 = new Patient("Ankit");
        Patient patient2 = new Patient("Darshan");

        Hospital hospital = new Hospital();
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient2);

        System.out.println("Hospital Consultation Details...");
        hospital.displayConsultations();
    }
}
