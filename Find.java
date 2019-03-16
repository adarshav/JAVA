//Write a Java program to test if an array contains a specific value
import java.util.Scanner;
import java.util.Arrays;
class Find {
    public static void main(String args[]) {
        String success = "the number is found";
        String unSucess = "the number is not found";
        Scanner s = new Scanner(System.in);       
        System.out.println("Enter the number of array elements");
        int n = s.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements");
        for(int i = 0;i < n;i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("The array elements are");
        System.out.println(Arrays.toString(arr));
        System.out.println("Which element do you want to find");
        int find = s.nextInt();
        System.out.println("the find value is " + find);
        
        for(int j = 0;j < n;j++) {
            if(arr[j] == find) {
                return success;
            } else {
                return unSucess;
            }
        }
    }
}