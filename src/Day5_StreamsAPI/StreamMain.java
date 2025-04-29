package Day5_StreamsAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {

        List<Integer> l= new ArrayList<>(Arrays.asList(5, 10, 20, 30, 8, 7));
        l.stream()
                .filter(x->x%2==0)
                .filter(x->x>10)
                .forEach(System.out::println);

        System.out.println("---------------------------");
        // Eg 1:- Sum of the arrays
        int []arr= {30, 20, 10};
        int sum= Arrays.stream(arr)
                .sum();
        System.out.println("The sum of the array is: "+sum);
        System.out.println("---------------------------");
        // Eg 2:- Maximum in Array
        int max= Arrays.stream(arr)
                .max()
                .getAsInt();
        System.out.println("The maximum of the array is: "+max);
        System.out.println("---------------------------");
        // Eg 3:- Average of Array
        double avg= Arrays.stream(arr)
                .average()
                .getAsDouble();
        System.out.println("The average of the array is: "+avg);
        System.out.println("---------------------------");
        // Eg 4:- Print first n natural numbers with given digit d.
        Stream.iterate(1, x->x+1)
                .filter(x->x.toString().contains("5"))
                .limit(10)
                .forEach(System.out::println);
        System.out.println("---------------------------");
        // Eg 5:- Print the Strings which starts from a and ends with c
        String []stringArr= {"abc", "cde", "acd", "aec", "xyz"};
        Arrays.stream(stringArr).
                filter(x->x.startsWith("a"))
                .filter(x->x.endsWith("c"))
                .sorted()
                .forEach(System.out::println);
        System.out.println("---------------------------");

        // Eg 6:- Marks Average
        Student []studentArray= {new Student(1, 90, "ABC"),
                                 new Student(2, 80, "DEF"),
                                 new Student(3, 50, "GHI")};
        double res= Arrays.stream(studentArray)
                .mapToInt(x->x.getMarks())
                .average()
                .getAsDouble();
        System.out.println("The average of the students in the class are "+res);
        System.out.println("---------------------------");

        // Eg 7:- Collect Stream Use
        Map<Integer, String> map= new HashMap<>();
        Arrays.stream(studentArray)
                .collect(Collectors.toMap(Student::getRollNumber, Student::getName));

    }
}
class Student{
    int rollNumber;
    int marks;
    String name;
    public Student(int rollNumber, int marks, String name){
        this.rollNumber= rollNumber;
        this.marks= marks;
        this.name= name;
    }
    int getRollNumber(){
        return rollNumber;
    }
    String getName(){
        return name;
    }
    int getMarks(){
        return marks;
    }
}
