package day17_do_loop;

import java.util.Scanner;

public class do_loop {
    /*
        1. What is do loop?
           it is a exit control loop where first loop body executes and then condition is checked
           at exit point.
        2. Syntax of do loop.
            do {
            // loop body
            // increment or decrement
            } while (Condition);

         */
    // Password validation method
    public static String validatePassword() {

        Scanner sc = new Scanner(System.in);

        String serverPassword = "Password@123"; // fixed server password
        int attempts = 3;

        do {
            System.out.println("Enter Your Server Password");
            String userPassword = sc.nextLine();

            if (userPassword.length() >= 8 &&
                userPassword.length() <= 16 &&
                serverPassword.equals(userPassword) ) {

                return "Validation Sucessful";
            }

            attempts--;
            System.out.println("Invalid Password! Attempts left: " + attempts);
        }
        while (attempts > 0);
        return "Validation failed user is blocked";
    }

    public static void main(String[] args) {
        System.out.println(validatePassword());
    }
}






