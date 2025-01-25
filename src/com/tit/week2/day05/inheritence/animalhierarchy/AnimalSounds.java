package com.tit.week2.day05.inheritence.animalhierarchy;


class AnimalSounds {
    public static void main(String[] args) {
        Animal dog = new Dog("Shanks",21);
        dog.makeSound();
        Animal cat = new Cat("Kaguya",25);
        cat.makeSound();
        Animal bird = new Bird("Jack Sparrow",28);
        bird.makeSound();
    }
}
