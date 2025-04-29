package Day4_Collection_Frameworks;
import java.util.*;
public class Task2Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap= new HashMap<>();
        // ArrayList<Student> studentList= new ArrayList<>();
        /*
        Student s1= new Student("Tanay", 1);
        Student s2= new Student("Nikita", 2);
        Student s3= new Student("Tanishq", 3);
        Student s4= new Student("Abhisekh", 4);
        Student s5= new Student("Anurag", 5);
        Student s6= new Student("Priyanshu", 6);
        Student s7= new Student("Shantanu", 7);
         */

        hashMap.put(1, "Shantanu");
        hashMap.put(2, "Bhanu");
        hashMap.put(3, "Kunal");

        System.out.println(hashMap.get(1));

        HashMap<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, new Student("Tanay", 1));
        studentMap.put(2, new Student("Nikita", 2));

        Student s = studentMap.get(1);
        System.out.println(s.name); // Output: Tanay




    }
}
