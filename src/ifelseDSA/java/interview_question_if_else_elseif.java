package ifelseDSA.java;

public class interview_question_if_else_elseif {
    public static void main(String[] args) {

     //Q1: Even or Odd?
        int num = 7;

        if (num%2==0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

      //Q2: Biggest of Two Numbers
         int a = 10, b = 20;

        if (a > b) {
            System.out.println("A is Bigger");
        } else {
            System.out.println("B is Bigger");
        }
     //Q3:Biggest of Three Numbers
     int a1 = 10, b1 = 25, c1 = 15;

        if (a1 > b1 && a1 > c1) {
            System.out.println("A is Biggest");
        }
        else if (b1 > c1) {
            System.out.println("B is Biggest");
        }
        else {
            System.out.println("c is Biggest");
        }

     //Q4: Divisible by 3 and 5?
     int num1 = 10;
        if (num1 % 3 == 0 && num1 % 5 == 0) {
            System.out.println("Divisble by both 3 and 5");
        }
        else if (num1 % 3 == 0) {
            System.out.println("Only Divisible by 3");
        }
        else if (num1 % 5 == 0) {
            System.out.println("Only Divisible by 5");
        }
        else {
            System.out.println("Not Divisible by both");
        }

     //Q5: Valid Triangle (Important Logic)
     // Condition a+b>c, b+c>a, a+c>b
     int a2 = 3, b2 = 4, c2 = 5;

     if (a2 + b2 > c2 && b2 + c2 > a2 && a2 + c2 > b2) {
         System.out.println("Valid Triangle");
     } else {
         System.out.println("InValid Triangle");
     }


    }
}
