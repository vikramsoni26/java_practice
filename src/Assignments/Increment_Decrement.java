package Assignments;

import java.sql.SQLOutput;

public class Increment_Decrement {
    public static void main(String[] args) {

        // Question 1 Solve int a = 10; int b = a++; print a,b.

                      int a = 10;
                      int b = a++;

              System.out.println("The value of a is: "+a);   // The result is 10.  this question of Post Decrement
              System.out.println("The value of b is: "+b);   // The result is 11.

        // Question 2 Solve and answer value of a.b and c.
        // Solve: int a = 10; int b = ++a; print a,b

                     int a1 = 10;
                     int b1 = ++a1;

               System.out.println("The value of a1 is: "+a1);  // The result is 11    this question of Pre increment
               System.out.println("The value of b1 is: "+b1);  // The result is 11

        // Question 3 Solve and answer value of a,b and c.
        // int a = 20; a++ int b = a++; int c=++b print a,b and c

                      int a2 = 20;
                      a2++;
                      int b2 = a2++;
                      int c2 = ++b2;

                System.out.println("The value of a2 is: "+a2);      // The result is 22
                System.out.println("The value of b2 is: "+b2);      // The result is 22
                System.out.println("The value of c2 is: "+c2);      // The result is 22

        // Question 4 Solve and answer value of a,b and c.
        // int a = 12; int b = a++;, b++; int c= a++ + --b;
        // Print details a,b and c.
                         int a3 = 12;
                        int b3 = a3++;
                        b3++;
                        int c3 = a3++ + --b3;
                System.out.println("The value of a3 is: "+a3);     //  The value of a is 14
                System.out.println("The value of b3 is: "+b3);     //  the value of b is 12
                System.out.println("The value of c3 is: "+c3);     //  the value of c is 25
        // Question 5 Solve and answer value of a, b and c.
        // int a = 10; a++; int b=++a; int c= a++ + ++b; b++; print a,b and c.

                          int a4 = 10;
                              a4++;
                          int b4 = ++a4;
                          int c4 = a4++ + ++b4;
                          b4++;
                System.out.println("The value of a4 is: "+a4);  // The result is 13
                System.out.println("The value of b4 is: "+b4);  // The result is 14
                System.out.println("The value of c4 is: "+c4);  // The result is 25

        // Question 6 Solve and answer value of c.
        // int a= 12; int b= 20; int c=a++ +b++ -++a- --a;
        // Print value of c.
                          int a5 = 12;
                          int b5 = 20;
                          int c5 = a5++ + b5++ - ++a5- --a5;
                System.out.println("The value of c5 is: "+c5);

        // Question 7 Solve and answer value of z.
        // int x= 10;  int y= 5; int z= x-- - --y + x++ + ++y;
        // Print value of z.
                         int x = 10;
                         int y = 5;
                         int z = x-- - --y + x++ + ++y;
                System.out.println("The value of z is: "+z);

        // Question 8 Solve and answer value of Result;
        // int x = 5; int result = x++ - --x + x-- - --x;
                         int x1 = 5;
                         int Result = x1++ - --x1 + x1-- - --x1;
                System.out.println("The value of Result is: "+Result);

         // Question 9 Solve and answer value of c.
         // int a = 5; int b = 10; int c = a-- + ++b - b-- + ++a;
         // Print the value of c.
                          int a6 = 5;
                          int b6 = 10;
                          int c6 = a6-- + ++b6 - b6-- + ++a6;
                System.out.println("The value of c6 is: "+c6);

          // Question 10 Solve and answer value of x.
                          int x2 = 12;
                              x2 = x2++;
                              x2 = x2++;
                              x2 = x2++;
                              x2 = ++x2;
                              x2 = x2++;
                System.out.println("The value of x2 is: "+x2);

         // Question 11 Solve and answer value of x, y, z and p.
                          int x3 = 12;
                          int y2 = x3++ + ++x3;
                          y2++;
                          int z1= ++y2;
                          int p = x3++ - ++y2 + z1++;
                System.out.println("The value of x3 is: "+x3);
                System.out.println("The value of y2 is: "+y2);
                System.out.println("The value of z1 is: "+z1);
                System.out.println("The value of p is: "+p);

         // Question 12 Solve and answer value of a, b and c and d.
                           int a7 = 12;
                           int b7 = a7++;
                               b7++;
                           int c7 = a7++ + --b7;
                           int d7 = a7++ + ++b7 + c7++;
                               d7++;
                               c7--;
                System.out.println("The value of a7 is: "+a7);
                System.out.println("The value of b7 is: "+b7);
                System.out.println("The value of c7 is: "+c7);
                System.out.println("The value of d7 is: "+d7);

         // Question 13 Solve and answer value of a, b and c and d.
                           int a8 = 12;
                           a8++;
                           ++a8;
                           int b8 = a8++;
                           b8++;
                           int c8 = a8++ + --b8;
                           c8--;
                           --c8;
                           int d8 = ++a8 + b8++ + --c8;
                System.out.println("The value of a8 is: "+a8);
                System.out.println("The value of b8 is: "+b8);
                System.out.println("The value of c8 is: "+c8);
                System.out.println("The value of d8 is: "+d8);

         // Question 14 Solve and answer:-
                          int a9 = 8;
                          int b9 = 12;
                          int c9 = ++a9 + b9++;
                          c9--;
                          --b9;
                          int d9 = c9-- + ++b9 + ++a9;
                          int e = a9 + ++b9 +c9 + d9++;
                System.out.println("The value of ++e is: "+e);
        System.out.println(a9);






    }
}
