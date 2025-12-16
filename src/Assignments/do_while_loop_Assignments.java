package Assignments;

import java.util.Scanner;

public class do_while_loop_Assignments {

    public static void main(String[] args) {

        // Question 1: WAJP to print factorial and ask user in end to press Y/n to continue or any
        // other key to exit.

                                  Scanner sc = new Scanner(System.in);
                                  char choice;

                                  do {
                                      System.out.println("Enter a number");
                                      int n = sc.nextInt();

                                      int fact = 1;
                                      int i1 = 1;

                                      while (i1 <= n) {
                                      fact = fact * i1;
                                      i1++;
                                  }

                                  System.out.println("Factorial of " + n + " is " + fact);

                                  System.out.println("Press Y/N to continue or any other key to exit: ");
                                  choice = sc.next().charAt(0);

                                  } while (choice == 'y' || choice == 'Y');

                                  System.out.println("Program exited. Thank you!");
                                  sc.close();

        // Question 2: WAJP to print power of a and b and ask user in end to press Y/y to continue or any other key to
        //exit.
                          Scanner sc2 = new Scanner(System.in);
                          char c;

                          do {
                              System.out.println("Enter a: ");
                              int a = sc2.nextInt();

                              System.out.println("Enter b: ");
                              int b = sc2.nextInt();

                              int power = getPower(a, b);
                              System.out.println(a + " to the power " + b + " is: " + power);

                              System.out.println("Press Y/y to continue or any other key to exit:");
                              c = sc2.next().charAt(0);

                          }   while (c == 'Y' || c == 'y');

                              System.out.println("======= Program End =======");
                              sc2.close();
                          }

                              public static int getPower(int a, int b) {
                              int pow = 1;
                              int i2 = 1;

                              while (i2 <= b) {
                              pow = pow * a;
                              i2++;
                               }
                              return pow;

    // Question 3: WAJP to check a number is a prime number or not and ask user in end to press Y/y to continue
                                  // or any other key to exit.
                              Scanner sc3 = new Scanner(System.in);
                                  char choice;

                          do {
                              System.out.println("Enter a number");
                              int num = sc3.nextInt();

                              boolean isPrime = true;

                              if (num <= 1) {
                                  isPrime = false;
                              } else {
                                  int i3 = 2;
                                  while (i3 <= num / 2) {
                                      if (num % i3 == 0) {
                                          isPrime = false;
                                          break;
                                      }
                                      i3++;
                                  }
                              }
                              if (isPrime) {
                                  System.out.println(num +" is a Prime Number");
                              } else {
                                  System.out.println(num +" is NOT a Prime Number");
                              }

                              System.out.println("Press Y/y to continue or any other key to exit:");
                              choice = sc3.next().charAt(0);
                          } while (choice == 'Y' || choice == 'y');

                          System.out.println("======= Program End =======");
                          sc3.close();



    }

}
