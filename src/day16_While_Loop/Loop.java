package day16_While_Loop;

public class Loop {
    public static void main(String[] args) {
        /*

        1. What is loop?
        loop is a block of code which will be executed repeatedly until loop condition will be false.
        2. Types of loop?
        there are two types of loops 1. Entry criteria loop. 2. Exit criteria loop.
        3. What is entry criteria loop?
        if the loop condition is at entry point and after loop there is loop body than it is called entry
        criteria loop.
        like while loop and for loop.
        4. What is exit criteria loop?
        if the loop condition is at exit point but before loop condition there is loop body then it is called
        exit criteria loop like do while loop.
        5. What is while loop?
        while (condition) {
              // loop body
         // increment or decrement
         }
         output statement.
*/
     // Example 1, Print number up to 100 divisible by 7 or ends with 7.
                   int i = 1;   // created a variable i and initialized it with 1.

                   while (i<=100){        // The loop will run as long as i is less than or equal to 100.
                                          // Meaning:Loop starts at 1 Stops only after reaching 100. So it will check all numbers from 1 to 100.

                       if (i%7==0 || i%10==7){         // A. (i % 7 == 0) This checks if the number is divisible by 7
                                                        //Examples → 7, 14, 21, 28, 35, ..., 98 If remainder = 0 → divisible.
                                                       // B. (i % 10 == 7) This checks if the number ends with 7 Examples → 7, 17, 27, 37, ..., 97
                                                        //Why? Any number ending with 7 gives remainder 7 when divided by 10.
                           System.out.println(i+"\t");
                       }
                       i++;                            // At the end of every loop, i increases by 1. So sequence goes 1 → 2 → 3 → 4 → … → 100
                   }
                   System.out.println("\nLoop End");

    // Example 2. Count all number up to 10 divisible by 4.
                    int count = 0;              // created a variable count which will store how many numbers are divisible by 4.
                                                // Initially count = 0
                    int i1 = 1;

                    while (i1<=10){           // This loop will run from 1 to 10 (inclusive).
                                             // So iterations will be:
                                            // i1 = 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
                        if (i1%4==0)

                            count++;
                        i1++;
                    }
                    System.out.println(count);

                    /*
                    Now let’s see each iteration inside the loop:
                    ➡️ Iteration 1: i1 = 1 Condition: 1 % 4 == 0 → No. So count stays 0. i1++ → i1 becomes 2.
                    ➡️ Iteration 2: i1 = 2 Condition: 2 % 4 == 0 → No. So count = 0. i1 → 3.
                    ➡️ Iteration 3: i1 = 3 Condition: 3 % 4 == 0 → No. So count = 0. i1 → 4.
                    ➡️ Iteration 4: i1 = 4 Condition: 4 % 4 == 0 → YES. So count++ → count = 1. i1 → 5.
                    ➡️ Iteration 5: i1 = 5 Condition: 5 % 4 == 0 → No. So count = 1. i1 → 6.
                    ➡️ Iteration 6: i1 = 6 Condition: 6 % 4 == 0 → No. So count = 1. i1 → 7.
                    ➡️ Iteration 7: i1 = 7 Condition: 7 % 4 == 0 → No. So count = 1. i1 → 8.
                    ➡️ Iteration 8: i1 = 8 Condition: 8 % 4 == 0 → YES. So count++ → count = 2. i1 → 9.
                    ➡️ Iteration 9: i1 = 9 Condition: 9 % 4 == 0 → No. So count = 2. i1 → 10.
                    ➡️ Iteration 10: i1 = 10 Condition: 10 % 4 == 0 → No. So count = 2. i1 → 11.
                    Loop Ends When i1 becomes 11, condition fails → loop stops.
                    Final Output: 2. Because only 4 and 8 are divisible by 4 between 1 and 10.
                     */
    // Example 3 There are n bulbs that are initially off. You first turn on all the bulbs, then you turn off every second bulb.
        // On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on).
        // For the ith round, you toggle every i bulb. For the nth round, you only toggle the last bulb.
        //Return the number of bulbs that are on after n rounds.
                         int n = 5;         // you can change this value to test

                         int i2 = 1;
                         int count1 = 0;

                         while (i2*i2<=n) {
                             count1++;
                             i2++;
                         }
                         System.out.println("Number of bulbs on = "+count1);


    // Question 5 Prime number
                    int n1 = 4;         // Let’s take n1 = 4. I want to check: Is 4 a prime number?
                    int count2 = 0;     // (will count how many numbers divide n1)
                    int i3 = 1;         // (start checking from 1)

                    while (i3<=n1) {// So loop will run when:i3 = 1,i3 = 2, i3 = 3, i3 = 4, (Stops when i3 becomes 5)
      // Check divisibility and count factors
                        if (n1%i3==0) {   // 4 % 1 == 0 → true
                            count2++;     // So: count2 = count2 + 1 → now count2 = 1

                        }
                        i3++;             // Then: i3++  → now i3 = 2
                    }
             // Check if prime
                    if (count2==2)          //  A prime number must have exactly 2 factors: 1 itself
                    System.out.println("Prime number");
                    else
                        System.out.println("Not Prime number");

                    /*
                    A prime number has exactly 2 divisors
                    A non-prime number has more than 2 divisors
                     */








    }
}
