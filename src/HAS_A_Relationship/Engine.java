package HAS_A_Relationship;

class Engine {
    void start() {
        System.out.println("Engine starts");
    }
}
class Car {
    Engine engine = new Engine();  // HAS-A relationship

    void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}



