package day1_basic_java_programe;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Original Main Method");
        main(10);
    }

    public static void main(int a) {
        System.out.println("Overloaded Main: " + a);
    }
}

