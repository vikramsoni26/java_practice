package String;

public class Test {
    public static void main(String[] args) {

        String S1 = "Hello";
        String S2 = "Hello";
        String S3v=new String("Hello");


        System.out.println(S1==S2);
        System.out.println(S1==S3v);
        System.out.println(S1.equals(S3v));


    }


}
