package com.tit.week2.day05.inheritence.animalhierarchy;

class Cat extends Animal {
    Cat(String name , int age){
        this.name = name;
        this.age = age;
    }
    @Override
    void makeSound() {
        System.out.println(name + " having age  "+ age+" makes a Meow Sound...");
    }
}
