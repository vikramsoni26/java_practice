package day01_basic_program;

public class TestInheritance1 {
    public static void main(String[] args) {
            Puppy p = new Puppy();  // creating Puppy object
            p.run();   // inherited from Animal1
            p.bark();  // inherited from Dog1
            p.cry();   // defined in Puppy
        }
    }

