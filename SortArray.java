//Write a Java program to sort a numeric array and a string array
import java.util.Arrays;
class Sort {
    public static void main(String args[] ) {
        int[] digits = {13, 4, 8, 21, 0, 3};
        System.out.println(Arrays.toString(digits));//by default arrays hold string values hence it should be converted to string by using toString method
        Arrays.sort(digits);
        System.out.println(Arrays.toString(digits));
    }
}