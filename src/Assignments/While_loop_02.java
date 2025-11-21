package Assignments;

public class While_loop_02 {
    public static void main(String[] args) {

       // Question 1 WAJP to print sum oF all natural numbers from 1 to 100.

                         int i = 1;
                         int sum = 0;

                         while(i<=100){
                             sum = sum + i;   // Add each number
                             i++;             // Move to next number
                         }
                         System.out.println("The sum of all  natural numbers is: " + sum);

       // Question 2: WAJP to print sum of all even numbers from 1 to 100.
                         int i2 = 1;
                         int sum2 = 0;

                         while(i2 <= 100) {

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
                         while(i3<=100) {

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

                         while(i5<=100) {

                             sum5 = sum5 + (i5 * i5);  // square and add

                             i5++;                    // Next number
                         }
                         System.out.println("The sum of squares of all natural numbers is: " + sum5);

                         System.out.println("loops end");

        // Question 5: WAJP to print sum of cubes of all natural number from 1 to 100.
                        int i6 = 1;
                        int sum6 = 0;

                        while(i6<=100) {

                            sum6 = sum6 + (i6 * i6 * i6);  // cube and add

                            i6++;                        // next number
                        }
                        System.out.println("The sum of cubes of all natural numbers is: " + sum6);

                        System.out.println("loops end");

         // Question 6: WAJP to print sum of squares of all even numbers from 1 to 100.
                        int i7 = 1;
                        int sum7 = 0;

                        while(i7<=100) {

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

                         while(i8<=100) {

                             if (i8 % 2 == 0) {                // check EVEN number
                                 sum8 = sum8 + (i8 * i8 * i8); // cube and add
                             }
                             i8++;                   // move to next number
                         }
                         System.out.println("The sum of cubes of all even number is: " +  sum8);

                         System.out.println("loops end");

        // Question 8: WAJP to print sum of squares of all odd numbers from 1 to 100.
                         int i9 = 1;
                         int sum9 = 0;

                         while(i9<=100) {

                             if (i9 % 2 == 1) {
                                 sum9 = sum9 + (i9 * i9);
                             }
                             i9++;
                         }
                         System.out.println("The sum of squares of all odd number is: " + sum9);

                         System.out.println("loops end");





    }
}
