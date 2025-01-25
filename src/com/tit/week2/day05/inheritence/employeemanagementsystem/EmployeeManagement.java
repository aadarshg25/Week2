package com.tit.week2.day05.inheritence.employeemanagementsystem;

class EmployeeManagement {
    public static void main(String[] args) {
        Employee manager = new Manager("Ankit","CG0018",500000);
        manager.displayDetails();

        Employee developer = new Developer("Alice" , "CG0019" ,800000);
        developer.displayDetails();

        Employee intern = new Intern("Brook","CG0015" ,2000);
        intern.displayDetails();
    }
}
