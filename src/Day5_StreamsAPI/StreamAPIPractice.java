package Day5_StreamsAPI;
import java.util.*;
import java.util.stream.Collectors;

//
public class StreamAPIPractice {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>(Arrays.asList("Kanav", "Abhijeet", "Archit", "Kapil", "Sahil"));
        // List<String> arr= List.of("Kanav", "Abhijeet", "Archit", "Kapil", "Sahil");

        // Basic Syntax;
        list.stream()
                .filter(name->name.startsWith("K"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        /*
        Types of Streams()
            1. Sequential Stream ----> this is default;
            2. Parallel Stream
         */
        /*
            Important Concepts;
            1. filter() ----> filters the elements based on the condition.;
            2. map() -------> transform each element;
            3. sorted()---> sorts the elements;
         */
        List<Integer> nums= List.of(1, 2, 3, 4, 5, 6, 7);
        // 1. filter() ----> filters the elements based on the condition.;
        nums.stream()
                .filter(n->n%2==0)
                .forEach(System.out::println);

        List<String> names= new ArrayList<>(Arrays.asList("Shantanu", "Bhanu"));
        // 2. map() -------> transform each element;
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        // 3. sorted()
        nums.stream()
                .sorted()
                .forEach(System.out::println);

        nums.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        // 4. Collect
        List<String> exp= List.of("A", "BB", "CCC");
        List<String> filtered= exp.stream()
                .filter(s->s.length()>1)
                .collect(Collectors.toList());
        System.out.println(filtered);


        // 5. reduce()
        int sum= nums.stream()
                .reduce(0, (a,b)->a+b);
        System.out.println(sum);

        // 6. distinct()
        List<Integer> duplicateList= List.of(1, 2, 2, 4, 4, 6, 7, 8, 9, 9);
        duplicateList.stream()
                .distinct()
                .forEach(System.out::println);

        //7. limit() and skip()
        List<Integer> list2= new ArrayList<>(Arrays.asList(1,2, 3, 4, 5));
        list2.stream()
                .skip(2)
                .limit(3)
                .forEach(System.out::println);

    }
}
