package day13_Programing_DSA;

public class coding_Practice {
    public static void main(String[] args) {

        // Last digit of number
        int n = 5783;
        System.out.println(n%10);

        // Last 2 digit
        System.out.println(n%100);

        // Remove last Digit
        System.out.println(n/10);

        // Reverse 3 Digit number
        int n1 = 123;
        int rev = (n1%10)*100+(n1/10) * 10 +(n1/100);
        System.out.println(rev);

        // Sum of Digits No loop
        int n2 = 123;
        int sum = (n2%10) + ((n2/10) % 10) + (n2/100);
        System.out.println(sum);
    }
}
