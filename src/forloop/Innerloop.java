package forloop;

public class Innerloop {
    public static void main(String[] args) {

        // print star for 5 rows and 5 columns
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
