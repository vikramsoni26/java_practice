package Assignments;

import java.util.Scanner;

public class Homework_4Day_dsa {

    // Programe Reverse a number 1234,9876
    // Reverse a number
}
class Reverse_a_number{
    public static void main(String[] args) {

        int num = 1234;
        int rev = 0;

        while(num != 0) {

            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        System.out.println("The Reverse a number is: "+rev); // output 4321

    }
}
class Reverse_a_number2{
    public static void main(String[] args) {
        int num = 9876;
        int rev = 0;

        while(num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        System.out.println("The Reverse a number is: "+rev); // output 6789
    }
}
class Palindrome{
    public static void main(String[] args) {
        int num = 121;
        int original = num;
        int rev = 0;

        while(num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        if (original == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        } // output Palindrome
    }
}
class Palindrome_number{
    public static void main(String[] args) {
        int num = 454;
        int original = num;
        int rev = 0;

        while(num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        if (original == rev) {
            System.out.println("Palindrome");
        }  else {
            System.out.println("Not Palindrome");
        }
    }
}
class Palindrome_number2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int original = num;
        int rev = 0;

        while(num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        if (original == rev) {
            System.out.println("Palindrome");
        }  else {
            System.out.println("Not Palindrome");
        }
    }
}
class Reverse_String{
    public static void main(String[] args) {
        String str = "java";
        String rev = "";

        for(int i = str.length()-1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("The Reverse String is: "+rev); // avaj
    }
}
class Reverse_string1{
    public static void main(String[] args) {
        String str = "selenium";
        String rev = "";

        for(int i = str.length()-1; i >=0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("The Reverse String is: "+rev); // output muineles
    }
}
class Palindrome_string1{
    public static void main(String[] args) {

        String str = "java";
        String rev = "";

        for(int i = str.length()-1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("Palindrome");
        }  else {
            System.out.println("Not Palindrome"); // not palindrome
        }
    }
}
class Reverse_string2{
    public static void main(String[] args) {

        String str = "level";
        String rev = "";

        for(int i = str.length()-1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("Palindrome");
        }   else {
            System.out.println("Not Palindrome"); // palindrome
        }
    }
}
class CountofVowels{
    public static void main(String[] args) {
        String str = "interview";
        int count = 0;
        str = str.toLowerCase();

        for(int i =0; i< str.length(); i++) {
            Character ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'  || ch == 'u') {
                count++;
            }
        }
        System.out.println("The number of vowels is: "+count); // 4
    }
}
class Duplicate_Programe{
    public static void main(String[] args) {
        String str = "programing";

        for(int i =0; i< str.length(); i++) {

            for(int j = i+1; j< str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    System.out.println(str.charAt(i));
                    break;
                }
            }
        }
    }
}