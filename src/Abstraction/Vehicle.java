package Abstraction;

 abstract class Vehicle {
     // abstract method (does not have a body)
     abstract void start();
}
// sub class (inherit from vehicle)
class car1 extends Vehicle {

    @Override
    void start() {
        // the body of vehicle is provided here
        System.out.println("Car starts with key");
    }
}
