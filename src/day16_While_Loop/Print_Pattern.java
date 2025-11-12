package day16_While_Loop;

public class Print_Pattern {
    public static void main(String[] args) {
        // Question 1 print star in rows

        for(int i = 1; i<= 5 ; i++){
            System.out.println("x");
        }

        // Question 2 print star for 5 rows and 5 columns

        for (int i1 = 1; i1<=5 ; i1++){          // here we are set i1 less then 5 so 5 rows are create
            for (int j1 = 1; j1<=5; j1++){       // here we are set j1 less then 5 so 5 columns are create
                System.out.print("* "); // print stays on same line       // Inner loop decide how many columns will be generated in rows like j1
                                                                          // outer loop decide how many rows will be created like j1
            }
            System.out.println();        // move to next line after each row,
                                         // print() → keeps cursor on same line
                                        // println() → moves cursor to next line
        }

        // Question 3
                   int n = 5;
                  for (int i2 = 1; i2<=n; i2++){         // Outer loop → controls rows
                      for (int j2 = 1; j2<=n; j2++){     // Inner loop → controls columns
                          System.out.print(i2 + " ");    // Prints the current row number repeatedly
                      }
                      System.out.println();              // Moves to the next line
                  }
                 /*
                 Outer loop (i2) controls the row number → runs from 1 to 5.
                 Inner loop (j2) prints each value of i2 five times (because n = 5).
                 So, for each row, the same number repeats five times.
                  */

        // Question 4 four different value use j
                    int n1 = 5;
                    for (int i3 = 1; i3<=n1; i3++){      // Outer loop → controls number of rows
                        for (int j3 = 1; j3<=n1; j3++){  // Inner loop → controls number of columns
                            System.out.print(j3 + " ");  // Prints column numbers (1 to 5)
                        }
                        System.out.println();            // Moves to the next line
                    }
                   /*
                   Explanation:The outer loop (i3) runs 5 times → creates 5 rows.
                   The inner loop (j3) prints numbers from 1 to 5 in each row.
                   So, every row contains 1 2 3 4 5.
                    */


    }
}
