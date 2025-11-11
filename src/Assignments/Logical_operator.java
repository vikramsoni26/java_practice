package Assignments;

import java.sql.SQLOutput;

public class Logical_operator {
    public static void main(String[] args) {

       // Question 1
                    boolean a = true;
                    boolean b = false;
                    boolean c = true;
                    boolean result = (a && b) || (b&&c);
                    System.out.println("The boolean result is: "+result);
                    /*
                    Solve each bracket:
                    (true && false) → false
                    (AND needs both true → one is false → result false)
                    (false && true) → false
                    (AND needs both true → first is false → result false)
                     */

       // Question 2

                    int x = 5;
                    int y = 10;
                    boolean result1 = (++x>5) && (--y<10);  // x value is 6 so 6 is greater then 5 so it is true and in logical perator is only execute when first
                    System.out.println("The boolean result is: "+result1);// operend is true so 6 is greater then 5 so its is true
                    System.out.println("The value of x is: "+x);
                    System.out.println("The value of y is: "+y);

        // Question 3

                    int x1 = 5;
                    int y1 = 10;
                    boolean result2 = (x1++>5) && (--y1<10);
                    System.out.println("The boolean result is: "+result2); // The result is given false because when in display time the value of x is 5
                    System.out.println("The value of x1 is: "+x1);
                    System.out.println("The value of y is: "+y1);
                    /*
                    Pre-increment & Pre-decrement meaning:
                    ++x → increases x before using it.--y → decreases y before using it.
                    && → short-circuit AND — if first condition is false, Java skips evaluating the second.
                    ++x → x becomes 6 So condition: (6 > 5) → true
                    2️⃣ Since the first part is true, Java must check the second part (&& requires both to be true).
                    3️⃣ --y → y becomes 9 Condition: (9 < 10) → true
                    ✅ Both are true → so result = true.
                     */

        // Question 4

                     boolean a1 = true;
                     boolean b1 = false;
                     boolean c1 = true;
                     boolean result3 = (a1 || b1) && (b1 || c1); //
                     System.out.println("The boolean result is: "+result3);
           /*
           Step 2️⃣ — Solve each bracket:
           (true || false) → true
           (because OR (||) is true if any one is true)
           (false || true) → true
           (same reason)
            */

        // Question 5

                         int a2=20;
                         int b2=30;
                         System.out.println(a2++>15 && b2++>20);
                         System.out.println("The value of a2 is: "+a2);
                         System.out.println("The value of b2 is: "+b2);

       // Question 6
                         int a3 = 20;
                         int b3 = 30;
                         System.out.println(a3++>25 && b3++>20);
                         System.out.println("The value of a3 is: "+a3);
                         System.out.println("The value of b3 is: "+b3); // the result is false beacuse and && → short-circuit AND — if first condition is false, Java skips evaluating the second.

       // Question 7

                         int a4=20;
                         int b4=30;
                         System.out.println(a4++>25 || b4++>20);
                         System.out.println("The value of a4 is: "+a4);
                         System.out.println("The value of b4 is: "+b4); // || logical or if any value is true the result is true

       // Question 8
                         int a5=20;
                         int b5=30;
                         System.out.println(a5++>15 || b5++>20);
                         System.out.println("The value of a5 is: "+a5);
                         System.out.println("The value of b5 is: "+b5);





    }
}
