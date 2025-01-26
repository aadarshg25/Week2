package com.tit.week02.day06.encapsulation.employeemanagementsystem;

abstract class Employee {
    private String employeeId;
    private String name;
    private int baseSalary;

    Employee(String employeeId,String name,int baseSalary){
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
        this.name = name;
    }
    abstract int calculateSalary();

    void displayDetails(){
        System.out.println("\nEmployee Id : " +employeeId);
        System.out.println("name : " + name);
        System.out.println("Base Salary : " + baseSalary);
    }

    public int getBaseSalary(){
        return baseSalary;
    }

}
