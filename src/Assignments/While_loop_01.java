package Assignments;

public class While_loop_01 {
    public static void main(String[] args) {

        // Question 1: WAJP to print all the numbers from 1 to 10.

                       int i = 1;              //Start value
        // While loop runs until i becomes 10
                       while (i<=10) {
                           System.out.println(i);         // Print current number
                       i++;                               // Increase value of i by 1.
                       }
                       System.out.println("Loop End");

        // Question 2: WAJP to print all the numbers from 10 to 1.

                      int i1 = 10;       // Start value (begin from 10)
        // Loop runs until i becomes 1
                      while (i1>=1) {
                          System.out.println(i1); // Print current number
                      i1--;                       // Decrease value of i by 1
                      }
                      System.out.println("Loop End");

        // Question 3: WAJP to print all the even numbers from 1 to 100.
                      int i2 = 1;       // Start from 1
        // Loop from 1 to 100
                      while (i2<=100) {
                          // Check if number is even
                          if (i2%2==0) {
                              System.out.println(i2);
                          }

                          i2++;    // Move to next number
                      }
                      System.out.println("Loop End");

        // Question 4: WAJP to print all the odd numbers from 1 to 100.
                      int i3 = 1;              // Start from 1
       // Loop from 1 to 100
                      while (i3<=100) {
                          // Check if the number is odd
                          if (i3%2==1) {
                              System.out.println(i3); // Print odd number
                          }

                          i3++;                   // Move to next number
                      }
                      System.out.println("Loop End");

      // Question 5: WAJP to print all the numbers from 1 to 100 which are divisible by 7.
                      int i4 = 1;               // Start from 1
      // Loop from 1 to 100
                      while (i4<=100) {
                          // Check if the number is divisible by 7
                          if (i4%7==0) {
                              System.out.println(i4);  // Print number divisible by 7
                          }

                          i4++;                       // Move to next number
                      }
                      System.out.println("Loop End");

       // Question 6: WAJP to print and count all the numbers from 1 to 100 which are divisible by 7.
                       int count = 0;      // To count numbers divisible by 7
                       int i5 = 1;         // Start value
        // Loop from 1 to 100
                      while (i5<=100) {
                          // Check if i is divisible by 7
                          if (i5%7==0) {
                              System.out.println(i5); // Print the number
                              count++;                // Increase count
                          }
                          i5++;                       // Increment in every loop iteration
                      }
                    // Print total count after loop finishes
                      System.out.println("Total numbers divisible by 7: " + count);

                      System.out.println("Loop End");

      // Question 7: WAJP to count all the numbers from 1 to 100 which are divisible by 7.
                      int count2 = 0;        // To count numbers divisible by 7
                      int i6 = 1;            // Start from 1
     // Loop from 1 to 100
                      while (i6<=100) {
                          // Check divisibility
                          if (i6%7==0) {
                              count2++;   // Increase counter
                          }

                          i6++;           // Move to next number
                      }
                     // Print count once after loop is complete
                     System.out.println("Total numbers divisible by 7: " + count);

                      System.out.println("Loop End");

      // Question 8: WAJP to print and count all the numbers from 1 to 100 which are divisible by 7 or
        // ends with 7.
                         int count3 = 0;    // To count numbers
                         int i7 = 1;        // Start from 1
       // Loop from 1 to 100
                         while (i7<=100) {
                          // Condition: divisible by 7 OR last digit is 7
                             if (i7%7==0 || i7%10==7) {
                                 System.out.println(i7);  // Print the number
                                 count3++;               // Increase count
                             }

                             i7++;              // Move to next number
                         }
                         // Print count after loop
                        System.out.println("Total numbers divisible by 7 or end with 7: " + count3);

                        System.out.println("Loop End");

    // Question 9: WAJP to print and count all the numbers from 1 to 1000 which are divisible by 7
        //and also ends with 7.
                          int count4 = 0;        // To count numbers
                          int i8 = 1;            // Start from 1
        // Loop from 1 to 1000
                          while (i8<=1000) {
                              // BOTH conditions must be true:
                              // 1. divisible by 7
                              // 2. ends with 7
                              if (i8%7==0 &&  i8%10==7) {
                                  System.out.println(i8);
                                  count4++;
                              }

                              i8++;  // move to next number
                          }
                          System.out.println("Total numbers divisible by 7 or end with 7: " + count4);

                          System.out.println("Loop End");

    // Question 10: WAJP to print all the numbers from 1 to 100 which are perfect square.
                        int i9 = 1;                // Start from 1
         // Loop from 1 to 100
                        while (i9<=100) {
                            // Find square root of i
                            int root = (int)Math.sqrt(i9);

                            // Check if i is a perfect square
                            if (root * root == i9) {
                                System.out.println(i9);  // Print perfect square
                            }
                            i9++;                       // Move to next number
                        }
                        System.out.println("loop end");

    // Question 11: WAJP to print and count all the number from 1 to 100 which are perfect square.
                      int count5 = 0;     // To count perfect squares
                      int i10 = 1;        // Start from 1
    // Loop from 1 to 100
                      while (i10<=100) {
                          // Find integer square root of i
                          int root = (int)Math.sqrt(i10);
                          // Check if i is a perfect square
                          if (root * root == i10) {
                              System.out.println(i10); // Print perfect square
                              count5++;                // Increase count
                          }
                          i10++;                      // Move to next number
                      }
                      // Final count printed after loop
                      System.out.println("The total number of perfect square is: " + count5);

                      System.out.println("Loop End");

    // Question 12: There are n bulbs that are initially off. You first turn on all the bulbs, then you turn off every second bulb.
                // On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on).
               // For the ith round, you toggle every i bulb. For the nth round, you only toggle the last bulb.
               //Return the number of bulbs that are on after n rounds.
                                 int n = 10;         // you can change this value to test

                                 int i11 = 1;
                                 int count6 = 0;
// Count how many perfect squares are <= n
                                while (i11*i11<=n) {
                                    count6++;
                                    i11++;
                                }
                              System.out.println("Number of bulbs on = "+count6);

    // Question 13: WAJP to print all the numbers from 1 to 100 which are perfect cube.
                                int i12 = 1;          // Start from 1
        // Loop from 1 to 100
                                while (i12<=100) {
                                    // Find cube root of i
                                    int root = (int)Math.cbrt(i12);
                                    // Check if i is a perfect cube
                                    if (root * root * root == i12) {
                                        System.out.println(i12);    // Print perfect cube
                                    }
                                    i12++;    // Move to next number
                                }
                                System.out.println("Loop End");

    // Question 14:WAJP to print and count all the numbers from 1 to 100 which are perfect cube.
                              int count7 = 0;           // To count perfect cubes
                              int i13 = 1;              // Start from 1

                              while (i13<=100) {
                                  // Find cube root of i
                                  int root = (int)Math.cbrt(i13);
                                  // Check if i is a perfect cube
                                  if (root * root * root == i13) {
                                      System.out.println(i13); // Print perfect cube
                                      count7++;                // Increase count
                                  }
                                  i13++;                  // Move to next number
                              }
                              // Print the total count
                              System.out.println("The total number of perfact qube is: " + count7);

                              System.out.println("Loop End");

    // Question 15: WAJP to print all the factor of a number of 28.
                              int n1 = 28;
                              int i14 = 1;
                              while (i14 <= n1) {

                                  if (n1 % i14==0) {
                                      System.out.println(i14);   // checks if i14 is a factor
                                  }
                                  i14++;
                              }
                              System.out.println("Loop End");

    // Question 16: WAJP to count the factors of a number. i/p: 28
                              int count8 = 0;
                              int n2 = 28;
                              int i15 = 1;
                              while (i15<=n2) {

                                  if (n2 % i15==0) {  // if remainder is 0 → i15 is a factor
                                      count8++;
                                  }
                                  i15++;
                              }
                              System.out.println("The Total number of factor is: " + count8);

                              System.out.println("Loop End");

    // Question 17: WAJP to print and count all the factors ofa number. i/p: 28
                              int count9 = 0;
                              int n3 = 28;
                              int i16 = 1;
                              while (i16<=n3) {

                                  if (n3 % i16==0) {
                                      System.out.println(i16);  // print factor
                                      count9++;
                                  }
                                  i16++;
                              }
                              System.out.println("The Total number of factor is: " + count9);

                              System.out.println("Loop End");

    // Question 18: Three divisor leet code problem Given an integer n, return true if n has exactly three positive divisors. Otherwise, return false.
        // An integer m is a divisor of n if there exists an integer k such that n = k * m.
                              int n4 = 3;
                      // Function to check if n has exactly 3 divisors
                              int count10 = 0;
                              int i17 = 1;

                              while (i17 <= n4) {
                               if (n4 % i17 == 0) {
                                   count10++;
                               }
                               i17++;
                              }
                              if (count10==3) {
                                  System.out.println(true);
                              } else {
                                  System.out.println(false);
                              }
                              System.out.println("loop end");




    }
}
