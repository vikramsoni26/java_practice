package Assignments;

import java.util.Scanner;

public class If_else_based_question {
    public static void main(String[] args) {

        // Question 1. WAJP to print big of two numbers using if else statement.

                         int a = 10;  // First number
                         int b = 20;  // Second number

                         if (a>b) {
                             System.out.println(a+ " is greater than "+b);
                         }
                         else {
                             System.out.println(a+ " is less than "+b);
                         }

         // Question 2  WAJP to print all are equal if all have same value or print biggest of three
         // numbers using if else statement.
                         int a1 = 12;
                         int b1 = 24;
                         int c1 = 32;

                         if (a1==b1 && a1==c1){
                             System.out.println("All are same "+a);
                         } else if (a1>b1 && a1>c1) {
                             System.out.println("A is biggest"+a);
                         } else if (b1>c1) {
                             System.out.println("B is biggest"+b);
                         }else
                             System.out.println("c1 is biggest"+c1);

           // Question 3 WAJP to take a character input and print it
          // is alphabet or not using if else statement.

                        Scanner sc = new Scanner(System.in);
                        System.out.println("Enter a character:");
                        char ch = sc.next().charAt(0);  // takes first character of input

                        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                            System.out.println(ch + " is an alphabet.");
                      } else {
                        System.out.println(ch + " is not an alphabet.");
                        }
           // Question 4 WAJP to take a character input and print it
          //is upper case, lower case or other alphabet using if else statement.

                      System.out.println("Enter a character:");
                        char ch1 = sc.next().charAt(0);
                         if (ch1 >= 'A' && ch1 <= 'Z') {
                             System.out.println(ch1 + " is an Uppercase letter.");
                         } else if (ch1 >= 'a' && ch1 <= 'z') {
                             System.out.println(ch1 + " is a Lowercase letter.");
                         }else {
                             System.out.println(ch1 + " is not an alphabet character.");
                         }
          // Question 5 WAJP to take a character input and print it is an upper case alphabet, lower case
         //alphabet, a digit or a special character using if else statement.

                      System.out.println("Enter a character:");
                         char ch2 = sc.next().charAt(0);
                         if (ch2 >= 'A' && ch2 <= 'Z') {
                             System.out.println(ch2 + " is an Uppercase letter.");
                         } else if (ch2 >= 'a' && ch2 <= 'z') {
                             System.out.println(ch2 + " is a Lowercase letter.");
                         } else if (ch2 >= '0' && ch2 <= '9') {
                             System.out.println(ch2 + " is a Digit.");
                         }
                         else {
                             System.out.println(ch2 + " is a Special character.");
                         }
         // Question 6 WAJP to take three angles of a triangle from user and print triangle is valid or not using if else statement.

                             System.out.println("Enter angle1:");
                             int angle1 = sc.nextInt();
                             System.out.println("Enter angle2:");
                             int angle2 = sc.nextInt();
                             System.out.println("Enter angle3:");
                             int angle3 = sc.nextInt();

                             if (angle1 > 0 && angle2 > 0 && angle3 > 0 && (angle1 + angle2 + angle3 == 180)) {
                             System.out.println("It is a valid triangle.");
                             } else {
                             System.out.println("It is not a valid triangle.");
                             }

          // Question 7 WAJP to take three sides of a triangle and print it is a valid triangle or not using if else statement.

                             System.out.println("Enter Side1");
                             int side1 = sc.nextInt();
                             System.out.println("Enter Side2");
                             int side2 = sc.nextInt();
                             System.out.println("Enter Side3");
                             int side3 = sc.nextInt();

                             if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1){
                                 System.out.println("It is a valid triangle.");
                             } else {
                                 System.out.println("It is not a valid triangle.");
                             }

         // Question 8 WAJP to take three sides of a triangle and print it is equilateral, isosceles or scalene
         // triangle or not using if else statement.
                             System.out.println("Enter Side1");
                             int side1a = sc.nextInt();
                             System.out.println("Enter Side2");
                             int side2a = sc.nextInt();
                             System.out.println("Enter Side3");
                             int side3a = sc.nextInt();


                             if (side1a==side2a&&side1a==side3a){
                                 System.out.println("It is a Equilateral Triangle.");
                             } else if (side1a==side2a || side1a==side3a || side2a==side3a) {
                                 System.out.println("It is a Isosceles Triangle.");
                             } else {
                                 System.out.println("It is a Scalene Triangle.");
                             }
        // Question 9 WAJP to take year input from user and print it is a Leap year or NOT.

                               System.out.println("Enter a year:");
                               int year = sc.nextInt();

                              // Leap year conditions:
                             // 1️⃣ Year divisible by 400 → Leap year
                            // 2️⃣ Year divisible by 4 but not by 100 → Leap year
                           // Otherwise → Not a leap year
                              if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                              System.out.println(year + " is a Leap Year.");
                              } else {
                              System.out.println(year + " is NOT a Leap Year.");


        //  Question 10 WAJP to take CP and SP from user and print %Profit or % Loss in the transaction.

                                  System.out.println("Enter Cost Price (CP):");
                                  double cp = sc.nextDouble();

                                  System.out.println("Enter Selling Price (SP):");
                                  double sp = sc.nextDouble();

                                  if (sp > cp) {
                                      double profit = sp - cp;
                                      double profitPercent = (profit / cp) * 100;
                                      System.out.println("Profit = " + profit + " ₹");
                                      System.out.println("Profit Percentage = " + profitPercent + " %");
                                  }
                                  else if (cp > sp) {
                                      double loss = cp - sp;
                                      double lossPercent = (loss / cp) * 100;
                                      System.out.println("Loss = " + loss + " ₹");
                                      System.out.println("Loss Percentage = " + lossPercent + " %");
                                  }
                                  else {
                                      System.out.println("No Profit, No Loss — CP and SP are equal.");
                                  }
        }
    }
}
