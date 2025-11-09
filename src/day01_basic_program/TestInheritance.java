package day01_basic_program;

// Test class with main method
    public class TestInheritance{
        public static void main(String[] args) {
            Dog d = new Dog(); // creating Dog object
            d.run();       // inherited from Animal
            d.bark();      // defined in dog
        }
    }
