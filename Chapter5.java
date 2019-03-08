
    //here iam defininng a class
    class Name
    {
        //here iam mentioning as private because the value of the variable should be in class so private is used
        private String first;
        private String middle;
        private String last;
        
        //this is a constructor it should have the same name of the class
        public Name(String f, String m, String l) 
        {
            first = f;
            middle = m;
            last = l;
        }
        //this is a method which performs operations of class
        //String is return type we get from that method and method also acts as Function in other programming languages
        public void display()
        {
            System.out.println(first +  " " + middle + " " + last);
        }
        
        public void initials() {
            System.out.println(first.substring(0,1) + " " + middle.substring(0,1) + " " + last.substring(0,1));
        }


    public static void main(String[] args)
    {
        Name n1 = new Name("adarsha", "v", "navada");
        n1.display();
        n1.initials();
    }
}

// class Demo{
//     int  value1;
//     int  value2;
//     Demo(int v1, int v2){
//        value1 = v1;
//        value2 = v2;
//        System.out.println("Inside Constructor");
//    }

//    public void display(){
//       System.out.println("Value1 === "+value1);
//       System.out.println("Value2 === "+value2);
//   }

//  public static void main(String args[]){
//      Demo d1 = new Demo(10 , 20);
//     d1.display();
//     }
// }
