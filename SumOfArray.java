//import java.util.Arrays;
import java.util.Scanner;

//this is to accept the array elements and display it
// class SumOfArray {
//     public static void main(String args[]) {
//         int n;
//         Scanner s = new Scanner(System.in);
//         System.out.println("enter the number of elements");
//         n = s.nextInt();
//         int[] a = new int[n];
//         System.out.println("Enter the elements for an array");
//         for(int i = 0;i < n;i++) {
//             a[i] = s.nextInt();
//         }
//         for(int i: a) {
//             System.out.println(i);
// }

//Write a Java program to sum values of an array
class SumOfArray {
    public static void main(String args[]) {
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = s.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements");
        for(int i = 0;i < n;i++) {
            arr[i] = s.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("sum of an array is " + sum);
    }
}