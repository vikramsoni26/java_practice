package day01_basic_program;

public class TestStudent {
    public static void main(String[] args) {
        student s1 = new student();

        // setting value using setters
        s1.setValue("Vikram", 28, 12, "Delhi", "Vikramsoni751@gmail.com");

        System.out.println(s1.getDetails());



    }
}
