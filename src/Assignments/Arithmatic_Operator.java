package Assignments;

public class Arithmatic_Operator {
    public static void main(String[] args) {

        // Question 1 For a given number int n = 5783;
        // a. Print the last digit of the number.
        // b. Print the last two digit of the number,
        // c. Remove the last digit of the number.
        // d. Remove the last two digit of the number.

        int n = 5783;
        System.out.println("The last digit of the number is: "+n%10);
        System.out.println("The last two digit of the number is: "+n%100);
        System.out.println("After remove the last digit of the number is: "+n/10);
        System.out.println("After remove the last two digit of the number is: "+n/100);

        // Question 2 is For a given number int n = 5783;
        // Print each digit of the number one by one from right to left and Left to right.
          int n1 = 5783;
        System.out.println("The last digit of the number first is from right to left is: "+n1%10);
        System.out.println("The 2nd last digit of the number is from right to left is: "+(n1/10)%10);
        System.out.println("The 3rd last digit of the number is from right to left is: "+(n1/100)%10);
        System.out.println("The 4th last digit of the number is from right to left is: "+(n1/1000)%10);
        System.out.println("The first digit of the number is from left to right is: "+n1/1000);
        System.out.println("The 2nd digit of the number is from left to right is: "+(n1/100)%10);
        System.out.println("The 3rd digit of the number is from left to right is: "+(n1/10)%10);
        System.out.println("The 4th digit of the number is from left to right is: "+(n1)%10);
        // Question 4 is WAJP to swap two numbers?
        // a. with using a third variable,
        // b. without using a third variable.
        //Answer swap two number
        // a.with using a third variable
        //    int a = 40;
        //    int b = 50;
        //    int temp = a;
        //    a = b;
        //    b = temp;
    //    System.out.println("The value of a is: "+a);
    //    System.out.println("The value of b is: "+b);
        // b. without using a third variable
            int c = 40;
            int d = 50;
            c = c+d;
            System.out.println("The value of c is: "+c);
            d = c-d;
            System.out.println("The value of d is: "+d);
            c = c-d;
            System.out.println("The value of c is: "+c);

         // Question 5 is For the given three numbers. Swap 1st into 2nd,
         // 2nd into 3rd and 3rd into 1st numbers.
         // a. With using fourth variable
         // b. Without using fourth variable
             int e = 50;
             int f = 60;
             int g = 45;
         // Answer swap three number
         // a. with using fourth variable
             int temp = e;
                 e = f;
                 f = g;
                 g = temp;
                 System.out.println("The value of e is: "+e);
                 System.out.println("The value of f is: "+f);
                 System.out.println("The value of g is: "+g);
                 System.out.println("The value of temp is: "+temp);
          // Question 6 is For the given CP and SP. Calculate %profit.
          // CP = 120;  SP = 160;
          // Answer of Question 6.
              float CP = 120f;
              float SP = 160f;
              float profit = SP-CP;
              float Profitper = profit/CP*100;
        System.out.println("The Profit percentage is: "+Profitper); // the Profit percentage is: 33.333336.

          // Question 7 is For the given CP and SP. Calculate %loss.
          // CP = 120; SP = 90;
          // Answer 7 is,
                  double CP1 = 120d;
                  double SP1 = 90d;
                  double loss = CP1-SP1;
                  double lossper = loss/CP1*100;
        System.out.println("The loss percentage is: "+lossper);

          // Question 8 is find the last digit of a number without using % operator
          // int n = 12345;
          // Answer of 8  is
               int n2 = 12345;
          // compute last digit without using %
             int last = n2 - (n2/10)*10;
        System.out.println("Last digit: " + last);
          /*
          how is it work step by step for question 8 is
          * n2/10 --> 12345/10 = 1234
          * (n2/10)*10 --> 1234*10 = 12340.
          * n2 - (n2/10)*10 --> 12345-12340 = 5 --> The last Digit
           */

        // Question 9 is Reverse a 3 digit Number using Pure Arithmetic operator.
        // int n = 123;
        // Answer of 9 is here
                         int n3 = 123;
        System.out.println(((n3 % 10) * 100) + ((n3 / 10 % 10) * 10) + (n3 / 100));
            /*
            how it works step by step by question 9 is
            (n3 % 10) * 100 ---> last digit * 100 ---> 3*100=300
            (n3/10%10)*10 ---> middle digit *10 ---> 2*10 = 20
            (n3/100)      ---> first digit      ---> 1
            Total         ---> 300+20+1        ---> 321
             */
        // Question 10 Find sum of three Digit number without using loops
        // int n= 123;
        // Answer of 10 is here
                    int n4 = 123;

           int last1 = n4 % 10;              // 3
           int middle = (n4 / 10) % 10;      // 2
           int first = (n4 / 100) % 10;      // 1

           int sum = first + middle + last1;

        System.out.println("Sum of digits: " + sum);

        // Question 11 is Evaluate the Expression:
        // int x = 5 /2 * 2;
        // Answer of 10 is
                  int x3 = 5 /2 * 2;
        System.out.println("THe value of x3 is: "+x3);

        // Question 12 is Evaluate the Expression:
        // int x = 5*2/2;
        // Answer of 11 is
                 int x4 = 5*2/2;
        System.out.println("THe value of x4 is: "+x4);

        // Question 13 is Evaluate the Expression:
        // Int x = 1+2*3/4
        // Answer of 13 is
                   int x5 = 1+2*3/4;
        System.out.println("THe value of x5 is: "+x5);

        // Question 14 is Evaluate the Expression:
        // int x = 1+2/3*4;
        // Answer of 14 is
                    int x6 = 1+2/3*4;
        System.out.println("THe value of x6 is: "+x6);

        // Question 15 is Evaluate the Expression;
        // int x = 100/10*2%3;
        // Answer of 15 is
                    int x7 = 100/10*2%3;
        System.out.println("THe value of x7 is: "+x7);

        // Question 16 is Evaluate the Expression:
        //int n = 128;
        //int rev = (n % 10) * 100 + ((n / 10) % 10) * 10 + (n / 100);
                  int n5 = 128;
                  int rev = (n5 % 10) * 100 + ((n5 / 10) % 10) * 10 + (n5 / 100);
        System.out.println(rev);

    }
}
