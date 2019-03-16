class Demo {
    //this program makes us to learn the typezconversion in java
    public static void main(String args[]) {
        byte x;
        int a = 270;
        double b = 128.128;
        System.out.println("the value of a and b is" + a + " " + b);
        System.out.println("int converted to byte");
        x = (byte) a;
        System.out.println("Now the value of a and x is " + " " + a + " " + x);
        System.out.println("double converted to int");
        a = (int) b;
        System.out.println("now the value of a and b is " + " " + " " + b);
        System.out.println("double converted to byte");
        x = (byte) b;
        System.out.println("now the value of a:" + " " + a + " " + "b:" + b + " " + "x:" + " " + x);
    }
}