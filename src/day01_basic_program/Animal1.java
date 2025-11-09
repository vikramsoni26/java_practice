package day01_basic_program;

public class Animal1 {
      void run() {
        System.out.println("Animal1 is running...");
    }
}

// Child class 1
class Dog1 extends Animal1 {
    void bark() {
        System.out.println("Dog1 is barking...");
    }
}

// Child class 2 (grandchild)
class Puppy extends Dog1 {
    void cry() {
        System.out.println("Puppy is crying...");
    }
}

