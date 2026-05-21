package day06_variables;

public class LocalVariable {
    public static void main (String [] args) {

        int a = 10;  // Local variable
        {
            int x = 40; // another Local variable

            System.out.println(x);  // 40
            System.out.println(a);  // 10
        }
       System.out.println(a);
          //   System.out.println(x);  // x Error x is not accessible out side the block,
    }
}




