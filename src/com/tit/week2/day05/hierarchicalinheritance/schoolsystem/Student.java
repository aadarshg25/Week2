package com.tit.week2.day05.hierarchicalinheritance.schoolsystem;

class Student extends Person {
    String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }
}
