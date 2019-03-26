class Account {
    int a, b;
    public void setData(int c, int d) {
        a = c;
        b = d;
    }
    public void showData() {
        System.out.println("the value of First Array is" + " " + a);
        System.out.println("the value of Second Array is " + " " + b);   
    }
}

class Object{
    public static void main(String args[]) {
        //initialising ObjectArray: className object = new className[array_size]
        Account obj[] = new Account[2]; 
        obj[0].setData(3, 4);
        obj[1].setData(10, 5);
        obj[0].showData();
        obj[1].showData();
    }
}