package Abstractclass;

abstract class Animal {
    abstract void sound(); // abstract method

    void eat() {
        System.out.println("Animal eats");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}