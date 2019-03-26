//ArrayList is a data structure where the length can be varied; it can be used for dynamic purposes, ex:ArrayList is like a rubberband it can be strectched to the maximum and lowered too, How much ever elements can be added and deleted depends on the situation whereas Array is like a rope it can be extended to some extent and further is not possible it is fixed size and ArrayList size is varying

import java.util.ArrayList;
class Test_ArrayList {
    public static void main(String args[]) {
        //this is the way of initialising the ArrayList; we have to mention the type of the arrayList in the below format otherwise it will throw an error  with note: You are using RawTypes with ArrayList 
        ArrayList<String> arlTest = new ArrayList<>();
        System.out.println("size of the arraylist is" + " " + arlTest.size());//size method is used to know the length of the ArrayList
        arlTest.add("Deepika");
        arlTest.add("Deeksha");
        arlTest.add("solle");
        arlTest.add("Bangara");
        arlTest.add("Chinna");
        System.out.println("The values in the ArrayList are" + " " + arlTest);
        System.out.println("Now the size of the ArrayList is" + " " + arlTest.size());
    }
}