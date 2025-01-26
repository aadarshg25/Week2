package com.tit.week02.day06.encapsulation.employeemanagementsystem;

class PartTimeEmployee extends Employee implements Department {
    private int workHours;
    private final int hourRate = 200;
    private String department;


    PartTimeEmployee(String employeeId,String name,int baseSalary,int workHours){
        super(employeeId,name,baseSalary);
        this.workHours = workHours;
    }
    @Override
     int calculateSalary() {
        return (workHours*hourRate) + super.getBaseSalary();
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println(getDepartmentDetails());
        System.out.println("Works Hours : " + workHours);
        System.out.println("Total Salary : " + calculateSalary());
    }
    @Override
    public String getDepartmentDetails() {
        return "Department : " + department;
    }

    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }
}
