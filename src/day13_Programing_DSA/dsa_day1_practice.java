package day13_Programing_DSA;

public class dsa_day1_practice {
    public static void main(String[] args) {

        // Last digit n = 5783
        int num = 5783;
        System.out.println(num%10);  // last digit is 3

        // Remove last digit n2 = 5783
        int n2 = 5783;
        System.out.println(n2/10); // 578

        // Print all Digit
        int num1 = 5783;
        while (num1 > 0) {
            int digit = num1 % 10;
            System.out.println(digit);
            num1 = num1 / 10; // 3875
        }



        // Reverse a number
        int n = 4231;
        int rev = 0;

        while (n != 0) {
            int digit = n % 10;
            rev   = rev * 10 + digit;
            n = n  / 10;
        }
        System.out.println(rev);


        // Sum of digit
        int n1 = 1234;
        int sum = 0;

        while (n1 > 0) {
            sum+= n1%10;
            n1 = n1 / 10;
        }
        System.out.println(sum);


    }
}
