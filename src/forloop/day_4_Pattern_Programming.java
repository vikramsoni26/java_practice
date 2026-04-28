package forloop;

public class day_4_Pattern_Programming {
    public static void main(String[] args) {

       // in this we practice day 4 pattern programing

       // TASK 1: Square Pattern
       // * * *
       // * * *
       // * * *
    //   for (int i = 1; i <= 3; i++) {
    //       for (int j = 1; j <= 3; j++) {
    //           System.out.print("x ");

    //       }
    //       System.out.println();
    //   }

       // TASK 2: Right Triangle
       // *
       // * *
       // * * *
    //    for (int i1 = 1; i1 <= 3; i1++) {
    //        for (int j1 = 1; j1 <= i1; j1++) {
    //            System.out.print("x ");
    //        }
    //        System.out.println();
    //    }
       // 3 TASK 3: Reverse Triangle
	   //    * * *
	   //    * *
	   //    *
    //    for (int i = 3; i >= 1; i--) {
    //        for (int j = 1; j <= i; j++) {
    //            System.out.print("* ");
    //        }
    //        System.out.println();
    //    }
           // 4.TASK 4: Number Pattern
           //   1
           //	1 2
           //	1 2 3
      //      for (int i = 1; i <= 3; i++) {
      //          for (int j = 1; j <= i; j++) {
      //              System.out.print(j+" ");
       //         }
       //         System.out.println();
       //     }
              // 5.	TASK 5: Pyramid
              //  *
             //	 * *
             //	* * *

            int n = 3;
        for (int i = 1; i <= n; i++) {

            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}
