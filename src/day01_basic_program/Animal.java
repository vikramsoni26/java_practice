package day01_basic_program;

public class Animal {
    // Parent class
    void run(){
            System.out.println("Animal is Running...");
        }
    }

    // Child class
    class Dog extends Animal{
        void bark() {
            System.out.println("Dog is barking...");
        }
    }


