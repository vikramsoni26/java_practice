package Array_in_java;

public class Array_Programe {
}
// Program 1 – Largest & Smallest Number
//
//Array: {5, 2, 9, 1, 6}
class Program_1_Largest_and_smallest_Number {
    public static void main(String[] args) {
        // Method 2
        int[] arr1 = {5, 2, 9, 1, 6};
        int largest = arr1[0];
        int smallest = arr1[0];

        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > largest) largest = arr1[i];
            if (arr1[i] < smallest) smallest = arr1[i];
        }
        System.out.println("Largest:" + largest);
        System.out.println("Smallest:" + smallest);
    }
}
class Program_2_Sum_of_Array_Elements{
    public static void main(String[] args) {
        int arr [] = {5,2,9,1,6};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }
        System.out.println("sum: " + sum); // output 23

    }
}
class Program_3_Find_Missing_Number{
    public static void main(String[] args) {
        int arr [] = {1,2,3,5};
        int n =  arr.length+1;
        int total = n*(n+1)/2;
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }
        int missing = total-sum;
        System.out.println("Missing: " + missing);// output 4
    }
}