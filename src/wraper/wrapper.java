package wraper;

public class wrapper {
    public static void main(String[] args) {

        int a = 10;
        // converting primitive to object
        Integer obj = Integer.valueOf(a);
        System.out.println(obj);

        // converting object to primitive
        int b = obj.intValue();
        System.out.println(b);
    }
}
