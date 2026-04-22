package What_is_Polymorphism;

class Vehicle2 {
    void run() {
        System.out.println("Vehicle2 is Running");
    }
}

class Bike extends Vehicle2 {
    void run() {
        System.out.println("Bike is Running");
    }
}
