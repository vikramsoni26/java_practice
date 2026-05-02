package day08_Method;

public class Main {
    static  void myMethod() {
        // code to be executed
        System.out.println("I just got executed");
    }
    public static void main(String[] args) {
        myMethod();
    }
    // outputs "i just got executed
    /*
    myMethod() is the name of the method
    static means that the method belongs to the Main class and not an object of the Main class.
    void means that this method does not have a return value.
     */
}
