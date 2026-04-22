package What_is_Polymorphism;

public class AnimalDriver {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Create a animal object
        Animal myPig = new Pig();  // Create a pig object
        Animal myDog = new Dog();  // Create a dog object

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
