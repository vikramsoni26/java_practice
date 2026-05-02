package day08_Method.MethodOverloading;

public class calculator1Driver {
    public static void main(String[] args) {

        calculator1 c = new calculator1();
        System.out.println(c.add(1,2));
        System.out.println(c.add(1,2,3));
    }
}
