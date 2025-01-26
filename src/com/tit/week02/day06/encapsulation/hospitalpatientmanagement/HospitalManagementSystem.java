package com.tit.week02.day06.encapsulation.hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create a list of patients
        List<Patient> patients = new ArrayList<>();
        patients.add(new InPatient(101, "Brook", 45, 5, 2000));
        patients.add(new OutPatient(102, "Janice", 30, 500));
        patients.add(new InPatient(103, "Alice", 60, 3, 1500));

        // Add medical records
        ((MedicalRecord) patients.get(0)).addRecord("Heart Surgery");
        ((MedicalRecord) patients.get(1)).addRecord("Flu Treatment");
        ((MedicalRecord) patients.get(2)).addRecord("Orthopedic Surgery");

        // Process patients
        for (Patient patient : patients) {
            System.out.println("\n" + patient.getPatientDetails());
            System.out.println(((MedicalRecord) patient).viewRecords());
            System.out.println("Total Bill: " + patient.calculateBill());
        }
    }
}
