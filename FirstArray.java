class ArrayDemo {
    public static void main(String args[]) {
        int array[] = new int[5];
        for(int count = 0;count < array.length;count++) {
            array[count] = count++;
        System.out.println(count);
        }
        
    }
}