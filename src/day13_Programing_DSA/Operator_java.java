package day13_Programing_DSA;

public class Operator_java {
    public static void main(String[] args) {
        /*
        1. Arithmetic Operators:-
        1.1 Addition. +.
        1.2 Subtraction -.
        1.3 Multiplication *.
        1.4 Division /.
        1.5 (Modulus) Remainder.

        2. Assignment Operator =.

        3. Note Point :-
        3.1 n%10= to get the last digit of no.
        3.2 n/10= to remove one digit from no.
        4. Increment Decrement Operator
        (++) is use for Increment or (--) is use for Decrement
        Increment or Decrement is used to increase or decrease the original value of a variable by 1.
        1.First Scenario Post increment
          X++ in this first it will display old value then it will be incremented by one at memory that is post increment.
             Ex1.     Int x = 30;
             SOP(X++); FIRST IT WILL DISPLAY 30
             SOP(X); NOW IT WILL DISPLAY 31
             SOP(X--); NOW IT WILL DISPLAY 31
             SOP(X); NOW IT WILL DISPLAY 30
        2 Post Decrement
          x-- in this first it will be displaying old value then it will be decremented by 1 at a memory.
        3 Pre Increment
          ++x in this first value will be incremented by 1 at memory then it will be display.
                EX1.       INT Y =30;
                SOP(++Y); NOW IT WILL DISPLAY 31
                SOP(Y); NOW IT WILL DISPLAY 31
                SOP (--Y); NOW IT WILL DISPLAY 30
                SOP(Y); NOW IT WILL DISPLAY 30
        4 Pre Decrement
          --x in this first value will be decremented by 1 at memory then it will be display.
          Que;     int n= 10;
                 SOP(n++); in result it will be display 10.
                 SOP(n++); in result it will display 11.
                 SOP(++n); in result it will display 13.
                 SOP(n--); in result it will display 13.
                 SOP (--n); in result it will display 11.
                 SOP(++n); in result it will display 12.
                 SOP(++n) in result it will display 13;

        5. Logical Operator.
          5.1 Logical AND: - in java it represents && and in python is represented and.
          Option 1	Option 2	&&
            True	True	True
            True	false	false
           false	true	false
           false	false	false
          It will execute second operand only if first operant will be true.
          5.2 Logical OR: - In java it represents || and in python is represent or.
              Option 1	Option 2	||
                True	True	True
                True	false	True
               false	True	True
               false	false	false
           It will execute second operand only if first operant will be false.
         5.3 Not Operator: -
              Option 1	!
                True	False
                false	True
         5.4 Condition Ternary operator: -
             If operand 1 is true then operand 2 will execute else operand 3 will execute.








      */

        // Example of Arithmetic operator.

     //     int a = 9;
     //     int b = 2;

     //     System.out.println(a/b); // the result is 4.
        // double example
         double a1 = 9;
         double b2 = 2;

         System.out.println(a1/b2); // the result is 4.5

       // Example 3rd
          double x = 9;
          int y = 2;

          System.out.println(x/y); // the result is 4.5
          System.out.println(8/10); // The result is 0
          System.out.println(17%9); // The result is 2
          System.out.println(8%10); // The result is 0

       // Example on Assignment Operator.
           int x1 = 38;
               x1 = x1/10;
        System.out.println(x1);

      // Question 1. n= 5783 Print the number from right to left.

    //       int x2 = 5783;
    //    System.out.println(x2%10); // The result is 3.
    //    System.out.println(x2%10); // The result is 8.
    //    System.out.println(x2%10); // The result is 7.
    //    System.out.println(x2%10); // The result is 5.

      // Question 2. How to swap two numbers.
      // Using 3rd variable.
      //    int a = 10;
      //    int b = 20;
      //    int temp = a;   // here is a 10
      //    a = b;          // here is a 20
      //    b = temp;       // here is a 10
      //  System.out.println("The value of a is " + a);
      //  System.out.println("The value of b is " + b);

      // Without using 3rd variable

      //      int a = 40;
      //      int b = 50;

      //      a = a+b; // THe value of a is 90
      //      b = a-b; // The value of b is 40
     //       a = a-b; // The value of a is 50

      //  System.out.println("The value of a is " +a);
      //  System.out.println("The value of b is " +b);

     // Question 5 is Swap 3 number
    //    int a = 10;
    //    int b = 20;
    //    int c = 30;

    //    a = a+b+c;  // The value of a is 60
    //    b = a-(b+c); // The value of b is 10
    //    c = a-(b+c); // The value of c is 20
    //    a = a-(b+c); // The value of a is 30

    //    System.out.println("The value of a is: "+a);
    //    System.out.println("The value of b is: "+b);
    //    System.out.println("The value of c is: "+c);

    // Question 9 is n = 123; Reverse the number.

    //    int n = 123;
    //    System.out.println(((n%10)*100)+((n/10%10)*10)+(n/100));

    // Question on Increment or Decrement
    // First is Post increment or Decrement
              int x3 = 30;

    //    System.out.println(x3++); // The value of x3 is 30
    //    System.out.println("The value of x is : "+ x3); // The value of x3 is 31

    // so here in this first it will display old value then it will be incremented by one at memory that is post increment.

        System.out.println(x3--); // The value of x3 is 31.
        System.out.println(x3);

    // so here in this first it will display old value then it will be decrement

      // Second is Pre increment or Decrement
             int y1 = 30;

        System.out.println(++y1); // The result is 31
        System.out.println(y1); // The result is 31
        System.out.println(--y1); // The result is 30
        System.out.println(y1);








    }
}
