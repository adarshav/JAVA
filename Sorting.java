import java.util.Arrays;

class Sorting {
    //in Arrays to sort the elements we use Arrays.Sort method by importing jaav.util.Arrays
    public static void main(String args[]) {
        int[] myArray1 = {12, 65, 99, 21, 11};
        String[] myArray2 = {"jaggesh", "ramesh", "suresh", "veeresh", "adarsha"};
        System.out.println("Elemtns in myArray1 are BEFORE sorting:" + Arrays.toString(myArray1));
        Arrays.sort(myArray1);
        System.out.println("Elements AFTER sorting:" + Arrays.toString(myArray1));
        System.out.println("Elements BEFORE sorting myArray2:" + Arrays.toString(myArray2));
        Arrays.sort(myArray2);
        System.out.println("Elements AFTER sorting myArray2:" + Arrays.toString(myArray2));
    }
}