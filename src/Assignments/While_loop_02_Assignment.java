package Assignments;

import java.util.Scanner;

public class While_loop_02_Assignment {
    public static void main(String[] args) {

        // Question 1 WAJP to print sum oF all natural numbers from 1 to 100.

        int i = 1;
        int sum = 0;

        while (i <= 100) {
            sum = sum + i;   // Add each number
            i++;             // Move to next number
        }
        System.out.println("The sum of all  natural numbers is: " + sum);

        // Question 2: WAJP to print sum of all even numbers from 1 to 100.
        int i2 = 1;
        int sum2 = 0;

        while (i2 <= 100) {

            if (i2 % 2 == 0) {     // check even
                sum2 = sum2 + i2;
            }

            i2++;                 // Increment must be outside this if
        }
        System.out.println("The sum of all even number is: " + sum2);
        System.out.println("loops end");

        // Question 3: WAJP to print sum of all odd numbers from 1 to 100.
        int i3 = 1;
        int sum3 = 0;
        while (i3 <= 100) {

            if (i3 % 2 == 1) {     // check odd number
                sum3 = sum3 + i3;
            }
            i3++;                  // move to next number
        }
        System.out.println("The sum of all odd numbers is: " + sum3);

        System.out.println("loops end");

        // Question 4; WAJP to print sum of squares of all natural number from 1 to 100.
        int i5 = 1;
        int sum5 = 0;

        while (i5 <= 100) {

            sum5 = sum5 + (i5 * i5);  // square and add

            i5++;                    // Next number
        }
        System.out.println("The sum of squares of all natural numbers is: " + sum5);

        System.out.println("loops end");

        // Question 5: WAJP to print sum of cubes of all natural number from 1 to 100.
        int i6 = 1;
        int sum6 = 0;

        while (i6 <= 100) {

            sum6 = sum6 + (i6 * i6 * i6);  // cube and add

            i6++;                        // next number
        }
        System.out.println("The sum of cubes of all natural numbers is: " + sum6);

        System.out.println("loops end");

        // Question 6: WAJP to print sum of squares of all even numbers from 1 to 100.
        int i7 = 1;
        int sum7 = 0;

        while (i7 <= 100) {

            if (i7 % 2 == 0) {            // check even
                sum7 = sum7 + (i7 * i7);  // add squares
            }
            i7++;                         // move to next number
        }
        System.out.println("The sum of squares of all even number is: " + sum7);

        System.out.println("loops end");

        //Question 7: WAJP to print sum of cubes of all even number from 1 to 100;

        int i8 = 1;
        int sum8 = 0;

        while (i8 <= 100) {

            if (i8 % 2 == 0) {                // check EVEN number
                sum8 = sum8 + (i8 * i8 * i8); // cube and add
            }
            i8++;                   // move to next number
        }
        System.out.println("The sum of cubes of all even number is: " + sum8);

        System.out.println("loops end");

        // Question 8: WAJP to print sum of squares of all odd numbers from 1 to 100.
        int i9 = 1;
        int sum9 = 0;

        while (i9 <= 100) {

            if (i9 % 2 == 1) {
                sum9 = sum9 + (i9 * i9);
            }
            i9++;
        }
        System.out.println("The sum of squares of all odd number is: " + sum9);

        System.out.println("loops end");

        // Question 9: WAJP to print sum of cubes of all odd numbers from 1 to 100.
        int i10 = 1;
        int sum10 = 0;

        while (i10 <= 100) {

            if (i10 % 2 == 1) {                  // check ODD number
                sum10 = sum10 + (i10 * i10 * i10); // add cube
            }
            i10++;     // next number
        }
        System.out.println("The sum of cubes of all odd number is: " + sum10);

        System.out.println("loops end");

        // Question 10: WAJP to print the sum of below series: 1 ∗ 2 + 2 ∗ 3 + 3 ∗ 4 ... ... upto 100.

        int i11 = 1;
        int sum11 = 0;

        while (i11 <= 100) {

            sum11 = sum11 + i11 * (i11 + 1);
            i11++;
        }
        System.out.println("The sum of below series is: " + sum11);

        System.out.println("loops end");

        // Question 11: WAJP to print the sum of the series: 1*2^2 + 2*3^2 + 3*4^2 ... upto 100
        int i12 = 1;
        int sum12 = 0;               // long used because numbers will be large

        while (i12 <= 100) {

            int next = i12 + 1;          // (i+1)
            int square = next * next;    // (i+1)^2

            sum12 = sum12 + (i12 * square);

            i12++;
        }
        System.out.println("The sum of below series is: " + sum12);

        System.out.println("loops end");

        // Question 12: WAJP to print the sum of below series: 12\*2+22\*3+32\*4+… upto 100

        int i13 = 1;
        int sum13 = 0;

        while (i13 <= 100) {

            sum13 = sum13 + (i13 * i13 * (i13 + 1));
            i13++;
        }
        System.out.println("The sum of below series is: " + sum13);

        System.out.println("loops end");


        // Question 14: Sum of the series 1/2 + 1/4 + 1/6 + ... + 1/100
        double sum14 = 0;
        int i14 = 1;

        while (i14 <= 100) {

            sum14 = sum14 + (1.0 / i14);           // use 1.0 to get double value
            i14 += 2;                              // increase by 2 to reach even numbers
        }
        System.out.println("The sum of below series is: " + sum14);

        System.out.println("loops end");

        // Question 15: WAJP to print the sum of below series: 1/1 + 1/3 + 1/5 + 1/7 + ..... up to 100 number.

        double sum15 = 0;
        int i16 = 1;

        while (i16 <= 100) {

            sum15 = sum15 + (1.0 / i16);           // use 1.0 to get double value
            i16 += 2;                              // increase by 2 to reach odd numbers
        }
        System.out.println("The sum of below series is: " + sum15);

        System.out.println("loops end");

        // Question 16: WAJP to print the sum of below series: 1/1*2+1/2*2+1/3*2+1/4*2+......UP TO 100.

        double sum16 = 0;
        int i17 = 1;

        while (i17 <= 100) {

            sum16 = sum16 + (1.0 / (i17 * 2));
            i17++;
        }
        System.out.println("The sum of below series is: " + sum16);


        System.out.println("loops end");

        // Question 17: WAJP to print the sum of below series: 1/1*3+1/2*3+1/3*3+1/4*3+.....up tp 100
        double sum17 = 0;
        int i18 = 1;

        while (i18 <= 100) {

            sum17 = sum17 + (1.0 / (i18 * 3));
            i18++;
        }
        System.out.println("The sum of below series is: " + sum17);

        System.out.println("loops end");

        // Question 18: WAJP to print the sum of below series: 1/1*2+1/2*3+1/3*4+1/4*5+.... up to 100.
        double sum18 = 0;
        int i19 = 1;

        while (i19 <= 100) {

            sum18 = sum18 + (1.0 / (i19 * (i19 + 1)));

            i19++;
        }
        System.out.println("The sum of below series is: " + sum18);

        System.out.println("loops end");

        // Question 19: WAJP to accept a input from user and print factorial of that number. i/p: 6
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int n = sc.nextInt();

        int fact = 1;
        int i20 = 1;

        while (i20 <= n) {
            fact = fact * i20;
            i20++;
        }
        System.out.println("The factorial of the number is: " + fact);

        System.out.println("loops end");

        // Question 20: WAJP to accept two numbers from user and print power of a to b. i/p: 6 3
        System.out.println("Enter the base number (a): ");
        int a = sc.nextInt();

        System.out.println("Enter the power (b): ");
        int b = sc.nextInt();

        int pow = 1;
        int i21 = 1;

        while (i21 <= b) {     // repeat b times
            pow = pow * a;   // multiply a each time
            i21++;
        }

        System.out.println(a + " raised to the power " + b + " is: " + pow);
        System.out.println("loops end");
    }
}
