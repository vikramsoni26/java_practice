package day01_basic_program;

public class Calculator {

    // Method 1 - adds two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2 - adds three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 numbers: " + calc.add(10, 20));
        System.out.println("Sum of 3 numbers: " + calc.add(10, 20, 30));
    }
}

