package Exceptation_In_Java;

public class run_time_exception {
    public static void main(String[] args) {

        try {
            int a = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Can not divide by zero");
        }
    }
}
