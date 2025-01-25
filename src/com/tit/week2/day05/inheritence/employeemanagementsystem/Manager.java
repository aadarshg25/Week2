package com.tit.week2.day05.inheritence.employeemanagementsystem;

class Manager extends Employee {
     int teamSize = 20;
    Manager(String name , String id , int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    void displayDetails() {
        System.out.println();
        System.out.println(name + " has : ");
        System.out.println("id : "+id);
        System.out.println("salary : "+salary);
        System.out.println("teamSize : "+teamSize);
    }
}
