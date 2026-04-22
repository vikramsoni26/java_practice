package What_is_Polymorphism;

public class CalculatorDriver {
    public static void main(String[] args) {

        // Now create a Calculator object
        Calculator C = new Calculator();
        System.out.println(C.add(10, 20));
        System.out.println(C.add(10, 20, 30));
        System.out.println(C.add(10, 20, 30, 40));
    }
}
