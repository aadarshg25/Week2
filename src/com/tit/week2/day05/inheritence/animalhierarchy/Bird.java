package com.tit.week2.day05.inheritence.animalhierarchy;

class Bird extends Animal {
    Bird(String name , int age){
        this.name = name;
        this.age = age;
    }
    @Override
    void makeSound() {
        System.out.println(name + " having age "+ age+" makes a Chirp Sound...");
    }
}
