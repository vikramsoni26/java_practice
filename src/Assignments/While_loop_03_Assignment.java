package Assignments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class While_loop_03_Assignment {
    public static void main(String[] args) {

    // Question 1: Write a java program to take a user input and print each
        // digits of the number one by one from right to left. input N=43705;

                        Scanner sc = new Scanner (System.in);  // Scanner sc = new Scanner(System.in); → allows us to read input from keyboard.

                        System.out.println("Enter a number");
                        int n = sc.nextInt();// waits for the user to type a number (e.g. 43705) and press Enter.

        // That number is stored in variable n. So if user enters: 43705 Then: n = 43705

                        while (n > 0) {             // As long as n is greater than 0, repeat the block.
                                                    // When n becomes 0, stop.

                            int rem = n % 10;           // % is modulus operator → gives remainder after division.
                            System.out.println(rem);
                            n /= 10;               // same as: n = n / 10    // n % 10 → always gives the last digit of the number.
                        }

                         /*
                         43705 % 10 = 5, 4370 % 10 = 0, 437 % 10 = 7, 43 % 10 = 3, 4 % 10 = 4
                         We store last digit in rem, Then we print it.
                         ▶ Iteration 1: n = 43705, Condition: n > 0 → 43705 > 0 so condition is true
                         rem = n % 10 = 43705 % 10 = 5
                         System.out.println(rem); // prints 5
                         n = n / 10 = 43705 / 10 = 4370
                         ▶ Iteration 2: n = 4370, Condition: 4370 > 0 so condition is true
                         rem = 4370 % 10 = 0
                         print 0
                         n = 4370 / 10 = 437
                         ▶ Iteration 3: n = 437, Condition: 437 > 0 so condition is true
                         rem = 437 % 10 = 7
                         print 7
                         n = 437 / 10 = 43
                         ▶ Iteration 4: n = 43, Condition: 43 > 0 so condition is true
                         rem = 43 % 10 = 3
                         print 3
                         n = 43 / 10 = 4
                         ▶ Iteration 5: n = 4, Condition: 4 > 0 so condition is true
                         rem = 4 % 10 = 4
                         print 4
                         n = 4 / 10 = 0
                         ▶ Iteration 6: n = 0, condition: 0 > 0 so condition is false
                         loop stops.
                         Final Output for N = 43705
                         5, 0, 7, 3, 4.
                          */

    // Question 2: Write a java program to take a user input and print each even digits of the number one by one.
        // Input:N=43705;


                         System.out.println("Enter a number");
                         int n1 = sc.nextInt();

                         while (n1 > 0)  {

                             int rem = n1 % 10;   // last digit

                         if (rem % 2 == 0) {      // check even digit
                                 System.out.println(rem);
                             }
                             n1 /= 10;             // remove last digit (always!)
                         }
                         /*
                         Dry Run Example: N = 43705 Digits from right →
                         n1	     rem = n1 % 10	  Even?	  Printed	New n1
                         43705	      5	          ❌ No	    -	    4370
                         4370	      0	          ✔ Yes	    0	    437
                         437	      7	          ❌ No	    -	    43
                         43	          3	          ❌ No	    -	    4
                         4	          4	          ✔ Yes	    4	    0
                         Output: 0,4.
                          */

    // Question 3: Write a java program to take a user input and print each odd digits of the number one by one.
        // Input: N=43705;

                        System.out.println("Enter a number");
                       int n2 = sc.nextInt();

                       while (n2 > 0)   {

                            int rem = n2 % 10; // last digit

                           if (rem % 2 == 1) {
                                System.out.println(rem); // check odd
                          }
                             n2 /= 10;    // remove last digit (always)
                         }
                         /*
                         Dry Run Example: N = 43705 Digits from right →
                         n1	     rem = n1 % 10	  ODD?	  Printed	New n1
                         43705	      5	          ✔ Yes	    5	    4370
                         4370	      0	          ❌ No	    -	    437
                         437	      7	          ✔ Yes	    7	    43
                         43	          3	          ✔ Yes	    3	    4
                         4	          4	          ❌ No	    -	    0
                         Output: 5,7,3.
                          */

    // Question 4: Write a java program to take a user input and print each digits of the number which are greater than or equals to 5 one by
        // one. Input: N=43705;

                         System.out.println("Enter a number");
                         int n3 = sc.nextInt();

                         while (n3 > 0)   {

                             int rem = n3 % 10;  // last digit

                             if (rem >= 5) {    // check rem is greater or equal then 5.
                                 System.out.println(rem);
                             }
                             n3 /= 10;   // remove last digit always.
                         }
                         /*
                         Dry Run Example: N = 43705 Digits from right →
                         n1	     rem = n1 % 10	   >=5?	  Printed	New n1
                         43705	      5	          ✔ Yes	    5	    4370
                         4370	      0	          ❌ No	    -	    437
                         437	      7	          ✔ Yes	    7	    43
                         43	          3	          ❌ No	    -	    4
                         4	          4	          ❌ No	    -	    0
                         Output: 5,7.
                          */

    // Question 5: Write a java program to take a user input and print the biggest digit of the number.
        // Input: N=43705;

                         System.out.println("Enter a Input Number");
                         int n4 = sc.nextInt();

                         int big = n4 % 10;   // take last digit as initial biggest
                         n4 /= 10;

                         while (n4 > 0)   {

                             int rem = n4 % 10;   // extract digit

                             if (rem > big) {     // compare
                                 big = rem;       // update biggest digit
                             }
                             n4 /= 10;            // remove last digit
                         }
                         System.out.println("The biggest digit is: " + big);
                         /*
                         Dry Run (Input: 43705)
                         Step	   n4	   rem	 big before	 Compare	big after
                         Init	   43705	5	 big = 5	    -	       5
                         1	       4370	    0	   5	       0>5?❌	   5
                         2	       437	    7	   5	       7>5?✔	   7
                         3	       43	    3	   7	       3>7?❌	   7
                         4	       4	    4	   7	       4>7?❌	   7
                         ✔ Final Answer:
                         The biggest digit is: 7
                          */

    // Question 6: Write a java program to take a user input and print the difference of biggest digit and smallest digit of the number.
        //Input: N=42375;

                         System.out.println("Enter a Input number");
                         int n5 = sc.nextInt();

                         int rem = n5 % 10;

                         int big1 = rem;      // initial biggest
                         int small = rem;   // initial smallest
                         n5 /= 10;

                         while (n5 > 0) {

                             rem = n5 % 10;          // extract digit

                             if (rem > big1) {       // compare
                                 big1 = rem;         // update biggest digit
                             }
                             if (rem < small) {      // compare
                                 small = rem;        // update smallest digit
                             }
                             n5 /= 10;               // remove last digit
                         }

                         int diff = big1 - small;     // compare the difference

                         System.out.println("Biggest digit = " + big1);     // print the biggest number
                         System.out.println("Smallest digit = " + small);  // print the smallest number
                         System.out.println("Difference = " + diff);       // print the difference.

    // Question 7: Write a java program to take a user input and count the total digit of the number.
        //Input:N=43705;

                        System.out.println("Enter a Input Number");
                        int n6 = sc.nextInt();

                        int count = 0;
                        while (n6 > 0) {

                            count++;
                            n6 /= 10;
                        }
                        System.out.println("The count of number of 43705 is: " + count);
                        /*
                        Dry Run Example Input: 43705
                        n6	       count	     Action
                        43705	     1	         remove 5 → 4370
                        4370	     2	         remove 0 → 437
                        437	         3	         remove 7 → 43
                        43	         4	         remove 3 → 4
                        4	         5	         remove 4 → 0
                        Final Output: Total digits = 5
                         */

    // Question 8: Write a java program to take a user input and count how many 0 digit is in number.
        // Input: N=430705;

                        System.out.println("Enter a Input Number");
                        int n7 = sc.nextInt();

                        int count1 = 0;
                        while (n7 > 0) {

                            int rem1 = n7 % 10;   // last digit

                            if (rem1 == 0) {      // check zero
                                count1++;
                            }
                            n7 /= 10;          // remove last digit
                        }
                        System.out.println("Total zeros in number = " + count1);

    // Question 9:Write a java program to take a user input and count how many 3 has appeared in
        //the number Input: N=4373533;

                       System.out.println("Enter a Input Number");
                       int n8 = sc.nextInt();

                       int count2 = 0;

                       while (n8 > 0)  {

                           int rem2 = n8 % 10;  // last digit

                           if (rem2 == 3)  {    // check 3
                               count2++;
                           }
                           n8 /= 10;         // remove last digit
                       }
                       System.out.println("Total three in number = " + count2);

    // Question 10: Write a java program to take a user input and count the even digits of the number.
        //Input: N=42765;
                       System.out.println("Enter a Input Number");
                       int n9 = sc.nextInt();
                       int original = n9;
                       int count3 = 0;

                       while (n9 > 0)   {

                           int rem3 = n9 % 10;

                           if (rem3 % 2 == 0)  {
                               count3++;
                           }
                           n9 /= 10;
                       }
                       System.out.println("Total even digits in " + original + " = " + count3);

    // Question 11: Write a java program to take a user input and count the odd digits of the number.
        //Input: N=42765;

                      System.out.println("Enter a Input Number");
                      int n10 = sc.nextInt();
                      // store original number
                      int original1 = n10;
                      int count4 = 0;

                      while (n10 > 0)  {

                          int rem4 = n10 % 10;

                          if (rem4 % 2 == 1)  {
                              count4++;
                          }
                          n10 /= 10;
                      }
                      System.out.println("Total odd digits in " + original1 + " = " + count4);

    // Question 12: Write a java program to take a user input and count all the digits of the number
        //which are less than or equals to 5.Input: N=42765;

                      System.out.println("Enter a Input Number");
                      int n11 = sc.nextInt();
                      int original2 = n11;
                      int count5 = 0;

                      while (n11 > 0)   {

                          int rem5 = n11 % 10;
                          if (rem5 <= 5)  {
                              count5++;
                          }
                          n11 /= 10;
                      }
                      System.out.println("Total digit of the number which are less then or equal to 5 in " + original2 + " = " + count5);
    // Question 13: Write a java program to take a user input and print each digit of the number from left to right.
        // Input: N=43705;
                      System.out.println("Enter a number");
                      int n12 = sc.nextInt();

                      // Step 1: Reverse the number first
                      int rev = 0;
                      int temp1 = n;

                      while (temp1 > 0)  {
                          int rem1 = temp1 % 10;
                          rev = rev * 10 + rem;
                          temp1 /= 10;
                      }
        // Step 2: Now print digits of reversed number (which is original left → right)
                      while (rev > 0) {
                          int rem2 = rev % 10;
                          System.out.println(rem);
                          rev /= 10;
                      }
                      /*
                      🧠 Why do we reverse the number?
                      Because normal digit extraction gives digits from right to left:
                      Example:43705
                      Right to left → 5, 0, 7, 3, 4 We want → 4, 3, 7, 0, 5
                      To achieve this without using arrays or strings, we:
                      Step 1 → Reverse the number
                      Original: 43705
                      Reversed: 50734
                      Step 2 → Print digits of reversed number (again right → left)
                      This prints:
                      5, 0, 7, 3, 4 Exactly what we want!
                      Dry Run Example Input: 43705
                      Reverse process:
                      rev = 0
                      take 5 → rev = 5
                      take 0 → rev = 50
                      take 7 → rev = 507
                      take 3 → rev = 5073
                      take 4 → rev = 50734
                      Now print digits of 50734:
                      5, 0, 7, 3, 4
                      ⭐ Final Output
                      4, 3, 7, 0, 5
                       */


    // Question 14:  Write a java program to take a user input and print each digit of the number from left to right(Without using any inbuilt
        //features) Input: N=43705;

                      System.out.println("Enter a Input Number");
                      int n13 = sc.nextInt();

                      int temp = n13;
                      int divisor = 1;

                      // Step 1 Find the correct divisor (10, 100, 1000...)
                      while (temp >= 10) {
                          temp /= 10;
                          divisor *= 10;
                      }
                      // Step 2 Print Digit from left to right
                      while (divisor > 0) {
                          int digit = n13 / divisor;       // extract leftmost digit
                          System.out.println(digit);       // print digit
                          n12  = n13 % divisor;            // remove leftmost digit
                          divisor /= 10;                   // reduce divisor

                      /*
                      Explanation:
                      Normally, when we extract digits using %10, we get digits from RIGHT to LEFT.
                      Example:43705 → 5, 0, 7, 3, 4
                      But we want:
                      4, 3, 7, 0, 5
                      To do this, we must solve two problems:
                      ⭐ STEP 1: Find the Biggest Divisor (10000 for 43705) To extract the first digit, we divide like this:
                      43705 / 10000 = 4
                      So we must find 10000 automatically for any number.
                      ❓ How to find the divisor?
                      Take the original number (43705) and keep dividing by 10:
                      43705 ÷ 10 → 4370
                      4370 ÷ 10 → 437
                      437 ÷ 10 → 43
                      43 ÷ 10 → 4 Now the number becomes a single digit (4). At the same time we multiply divisor:
                      divisor = 1
                      divisor * 10 = 10
                      divisor * 10 = 100
                      divisor * 10 = 1000
                      divisor * 10 = 10000  So now: divisor = 10000
                      ⭐ STEP 2: Extract digits from LEFT to RIGHT Now we repeatedly divide:
                      ✔ First digit: 43705 / 10000 = 4 Print: 4
                      Remove first digit: 43705 % 10000 = 3705 Reduce divisor: 10000 / 10 = 1000
                      ✔ Second digit: 3705 / 1000 = 3 Print: 3
                      Remove first digit: 3705 % 1000 = 705 Reduce divisor: 1000 / 10 = 100
                      ✔ Third digit: 705 / 100 = 7 Print: 7
                      Remove first digit: 705 % 100 = 5 Reduce divisor: 100 / 10 = 10
                      ✔ Fourth digit: 5 / 10 = 0 Print: 0
                      Remove first digit: 5 % 10 = 5 Reduce divisor: 10 / 10 = 1
                      ✔ Fifth digit: 5 / 1 = 5 Print: 5
                      🔥 Final Output:4, 3, 7, 0, 5

                       */

    // Question 15:  Write a java program to take a user input and print the sum of each digit of the number.
                          // Input: N=4207065;

                          System.out.println("Enter a Input Number");
                          int n14 = sc.nextInt();
                          int sum = 0;

                          while (n14 > 0) {

                              int rem13 = n14 % 10; // extract last digit
                              sum = sum + rem;      // add digit to sum
                              n14 /= 10;            // remove last digit
                          }
                          System.out.println("The sum of digit is: "+ sum);



                      }
    // Question 16: Write a java program to take a user input and print the sum of each even digits of
        // the number.Input: N=42765;

                         System.out.println("Enter a number");
                         int n15 = sc.nextInt();
                         int sum1 = 0;

                         while (n15 > 0)   {
                             int rem15 = n15 % 10;   // extract last digit

                             if (rem15 % 2 == 0) {   // check even digit
                                 sum1 = sum1 + rem15;
                             }
                             n15 /= 10;
                         }
                         System.out.println("The sum of digit is: "+ sum1);



    }
}
