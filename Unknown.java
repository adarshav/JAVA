// Write a program to print the names of students by creating a Student class. If no name is passed while creating an object of Student class, then the name should be "Unknown", otherwise the name should be equal to the String value passed while creating object of Student class.
class Student 
{
    private String name;

    public Student( String n) 
    {
        name  = n;
    }

    public void hesaru() {
        System.out.println("name is:"+  name);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Raksha");
        s1.hesaru();
    }
}
