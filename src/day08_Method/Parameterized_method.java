package day08_Method;

public class Parameterized_method {
    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }

    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("jenny");
        myMethod("Anja");
    }

}
