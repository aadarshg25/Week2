package com.tit.week2.day05.hierarchicalinheritance.schoolsystem;

class Staff extends Person {
    String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Staff");
    }
}
