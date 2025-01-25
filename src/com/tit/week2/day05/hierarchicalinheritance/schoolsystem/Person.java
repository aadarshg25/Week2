package com.tit.week2.day05.hierarchicalinheritance.schoolsystem;

abstract class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Abstract method to enforce implementation in subclasses
    public abstract void displayRole();
}







