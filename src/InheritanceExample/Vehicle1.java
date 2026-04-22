package InheritanceExample;

class Vehicle1 {
    protected String brand = "Ford"; // Vehicle attributes
    void honk() {
        System.out.println("Pee, Pee");
    }
}
class Car2 extends Vehicle1 {
    String modelName = "Mustang"; // Car attributes

}