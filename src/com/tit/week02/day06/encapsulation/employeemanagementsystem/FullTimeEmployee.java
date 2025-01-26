package com.tit.week02.day06.encapsulation.employeemanagementsystem;

class FullTimeEmployee extends Employee implements Department{
    private int fixedSalary;
    private String department;

    FullTimeEmployee(String employeeId,String name,int baseSalary,int fixedSalary){
        super(employeeId,name,baseSalary);
        this.fixedSalary = fixedSalary;
    }
    @Override
    int calculateSalary() {
        return fixedSalary + super.getBaseSalary();
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println(getDepartmentDetails());
        System.out.println("Fixed Salary : " + fixedSalary);
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
