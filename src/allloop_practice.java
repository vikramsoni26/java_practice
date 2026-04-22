public class allloop_practice {
    public static void main(String[] args) {

        // 5.TASK 1: Print 1 to 10 Use for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // 6. TASK 2: Print digits (Right to Left)
        // Example: Input: 5783

        int n = 5783;
        while (n >0) {
            int rem = n % 10;
            System.out.println(rem);
            n /= 10;
        }

        // 7. TASK 3: Reverse Number
        int n1 = 1234;
        int rev = 0;

        while (n1 > 0) {
            rev = rev * 10 + n1 % 10;
            n1 /= 10;
        }
        System.out.println(rev);

        //TASK 4: Sum of Digits
        //Input: 1234

        int n2 = 1234;
        int sum = 0;

        while (n2 > 0) {
            int rem = n2 % 10;
            sum = sum + rem;
            n2 /= 10;
        }
        System.out.println(sum);

        // Task 5 prime number
        int n3 = 4;
        int count = 0;
        int i1 = 1;

        while (i1 <= n3) {
            if (n3 % i1 == 0) {
                count++;
            }
            i1++;

            if (count == 2) {
                System.out.println("Prime number");

            } else {
                System.out.println("Not Prime number");
            }
        }


    }


}
