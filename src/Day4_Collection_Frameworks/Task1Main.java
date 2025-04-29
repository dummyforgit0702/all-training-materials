package Day4_Collection_Frameworks;
import java.util.*;

public class Task1Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList= new ArrayList<>();
        Student s1= new Student("Tanay", 1);
        Student s2= new Student("Nikita", 2);
        Student s3= new Student("Tanishq", 3);
        Student s4= new Student("Abhisekh", 4);
        Student s5= new Student("Anurag", 5);
        Student s6= new Student("Priyanshu", 6);
        Student s7= new Student("Shantanu", 7);
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);
        studentList.add(s7);
        for(Student s: studentList){
            System.out.println(s.toString());
        }
        // System.out.println("");
    }
}
