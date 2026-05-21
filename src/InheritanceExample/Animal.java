package InheritanceExample;

public class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal{
    void bark() {
        System.out.println("Dog bark");
    }
}

class AnimalDriver{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
    }
}
