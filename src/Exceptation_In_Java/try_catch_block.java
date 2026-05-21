package Exceptation_In_Java;

import java.io.BufferedReader;
import java.io.FileReader;

public class try_catch_block {
    public static void main(String[] args) {
        try{
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Null error");
        } catch (Exception e) {
            System.out.println("General Error");
        }
    }
}
