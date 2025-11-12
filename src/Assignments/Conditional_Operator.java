package Assignments;

public class Conditional_Operator {
    public static void main(String[] args) {

        // Question 1

                          int a = 5;
                          int b = 10;
                         int c = (a > b) ? a++ : b++;
                         System.out.println(a+ " "+b+ " "+c); // The result is 5,11,10
               /*
               Step 1: Evaluate the condition (a > b) → 5 > 10 → ❌ false
So, the false part of the ternary operator will execute → b++
🧠 Step 2: Execute false part → b++ b++ is post-increment, which means:
Use the current value of b first (10) Then increment it by 1 after using it
So:The expression result (value assigned to c) = 10
After execution, b becomes 11
Step 3: Assign and update
Variable	Before	After
a	5	5 (unchanged because condition was false, so a++ didn’t execute)
b	10	11 (because b++ executed)
c	—	10 (old value of b)
🧾 Step 4: Print statement System.out.println(a + " " + b + " " + c);
👉 a = 5, b = 11, c = 10
                */

         // Question 2

        int a1 = 3, b1 = 4, c1 = 5;
        int result = (a1 > b1) ? (a1 > c1 ? a1 : c1) : (b1 > c1 ? b1 : c1);
        System.out.println(result);
       /*
       Step 1: Evaluate the first condition (a1 > b1) → 3 > 4 → ❌ false
       So, we move to the false part of the ternary operator:
       Step 2: Evaluate the false part Now check (b1 > c1) → 4 > 5 → ❌ false
       So, we take the else part → c1 ✅ Therefore, result = c1
       🧾 Step 3: Substitute the value c1 = 5
        */

          // Question 3
                   int x = 10;
                   int y = 5;
                   int z = (x>y) ? (x<15? x:y): (x>5? x:y);
                   System.out.println(z);

          // Question 4

                   int x1 = 10;  // (x1 < y1) → 10 < 5 → ❌ false
                   int y1 = 5;   // Since the condition is false, we directly take the else part of the ternary:👉 x1
                   int z1 = 7;   // Step 2: Assign the result result1 = x1 = 10
                   int result1 = (x1 < y1) ? (y1 < z1 ? z1 : y1) : x1;
                   System.out.println(result1);

          // Question 5

                  int a2 = 1, b2 = 2, c2 = 3;
                  int result3 = a2 < b2 ? a2 < c2 ? c2 : a2 : b2;
                  System.out.println(result3);
          /*
          So we first check the outer condition
                  1<2 so it's true condition
                  so now check the true condition again
                  1<3 so 3 is bigger 1
           */

          // Question 6
                  int a3 = 5;
                  int b3 = 10;
                  int c3=(a>b) ? b3++ : (a3<b3 ? --b3 : b3) ;
                  System.out.println(c3);
                  /*
                  so first we check the condition 5>10 it is false
                  now we move to the false statement
                  5<10 it is true so --b3 it is increment b3 is 9 so the result is 9
                   */

         // Question 7

                    int val=10;
                    int result4=(val>5) ? (val<8?1:2) : 3;
                    System.out.println(result4);

                      /*
                      So first we evaluate the condition
                      10>5 it is true so we check the true part 10<8 so this is wrong we take the else part is 2
                       */

          // Question 8

                     int x3=5, y3=7, z3=3;
                      int result5=(x3>y3) ? (x3>z3? x3:z3) : (y3>z3 ? y3:z3);
                      System.out.println(result5);

          // Question 9

                       int x4=5 ;
                       int y4=7 ;
                       int z4=3;
                       int result6=(x4<y4) ? (x4<z4? x4:z4) : (y4<z4 ? y4:z4);
                       System.out.println("The result of result6 is: "+result6);

          // Question 10

                       int num = 8;

                       String Result8= (num % 2 == 0) ? "Even number" : "Odd number";
                       System.out.println(Result8);

          // Question 11

                       int num1 = 345;
                       String result8 = (num1>=100 && num1<=999) ? "it is a three digit number" : "It is not a three digit number";
                       System.out.println(num1 + " " + result8);

           // Question 12

                       int num2 = 7;
                       String result9 = (num2%3==0 && num2%5==0) ? "both 5 and 3" : (num2%3==0) ? "Divided by only 3" : (num2%5==0) ? "Divided by 5": "Divided by none";
                       System.out.println(num2 + " " + result9);

           // Question 13

                       int x6 = 12;
                       int y6 = 4;
                       String result10 = (x6%y6==0) ? "It is factor ": "not";
                       System.out.println(result10);

           // Question 14
                       int a6 = 5;
                       int b6 = 7;
                       int c6 = 10;  // sides of the triangle

        String result11 = (a6 + b6 > c6 && a6 + c6 > b6 && b6 + c6 > a6)
                ? "It is a valid triangle"
                : "It is not a valid triangle";

        System.out.println("Sides: " + a6 + ", " + b6 + ", " + c6);
        System.out.println(result11);
                 /*
                 For any three sides to form a valid triangle, the Triangle Inequality Theorem must be satisfied:
                 a + b > c, a + c > b ,b + c > a
                 If all three are true → the triangle is valid, otherwise invalid


                  */





     }
}
