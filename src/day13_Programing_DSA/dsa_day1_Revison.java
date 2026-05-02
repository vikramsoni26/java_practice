package day13_Programing_DSA;

public class dsa_day1_Revison {
    public static void main(String[] args) {

        // Q8. Find the Last Digit of a Number Without using
        // % operator.
        // Int n=12345;

        int n = 12345;
        int result = n%10;
        System.out.println(result); // 5

        // Q3. int n = 5783; last digit
        int n1 = 5783;
        int result1 = n1%10;
        System.out.println(result1);

        // Q4. Remove last digit int n 12345
        int n2 = 12345;
        int result2 = n2/10;
        System.out.println(result2); // 1234

        // Q5. Reverse a number
        int n4 = 123;
        int rev = 0;

        while (n4 != 0) {
            int digit = n4 % 10;
            rev = rev * 10 + digit;
            n4 /= 10;
        }
        System.out.println(rev);

        // Find Sum of three Digit number int n =123
        int n5 = 123;
        int sum = 0;

        while (n5 != 0) {
            int  digit = n5 % 10;
            sum += digit;
            n5 /= 10;
        }
        System.out.println(sum);

    }
}
