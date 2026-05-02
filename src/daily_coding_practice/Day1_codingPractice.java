package daily_coding_practice;

import java.util.Scanner;

public class Day1_codingPractice {
    public static void main(String[] args) {

        // Reverse number
        int num = 1234;
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        System.out.println(rev);

        // Palindrome number
        int n = 121;
        int original = n;
        int rev1 = 0;

        while (n != 0) {
            int digit1 = n % 10;
            rev1 = rev1 * 10 + digit1;
            n = n / 10;
        }
        if (original == rev1) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }


    // reviosn practice of day 1
    // reverse a number by accept user input
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num2 = sc.nextInt();

        int rev3 = 0;

        while (num2 !=0) {
            int digit2 = num2 % 10;
            rev3 = rev3 * 10 + digit2;
            num2 = num2 / 10;
        }
        System.out.println(rev3);
        sc.close();

    // Reverse palindrome number by taking user input
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a number");
        int num4 = sc1.nextInt();
        int original3 = num4;
        int rev4 = 0;
        while (num4 !=0) {
            int digit3 = num4 % 10;
            rev4 = rev4 * 10 + digit3;
            num4 = num4 / 10;
        }
        if (original3 == rev4) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }








    }





}
