package day06_variables;

public class Car {
        String name = "Honda";
        double price = 98765.50;
        String color = "Black";
    }

class Test {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.name);   // Honda
        System.out.println(c1.price);  // 98765.5
        System.out.println(c1.color);  // Black
    }
}