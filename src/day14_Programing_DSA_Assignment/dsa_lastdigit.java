package day14_Programing_DSA_Assignment;

public class dsa_lastdigit {
    public static void main(String[] args) {


        int n = 5783;
        // Print the last digit of a number
        int last = n % 10;
        int last2 = n % 100;
        int last3 = n % 1000;
        System.out.println(last);
        System.out.println(last2);
        System.out.println(last3);
    }
}