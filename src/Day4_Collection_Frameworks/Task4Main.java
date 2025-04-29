package Day4_Collection_Frameworks;
import java.util.*;
public class Task4Main {
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 10, 2, 3,9, 9, 2, 3));
        System.out.println(list);
        set.addAll(list);
        System.out.println(set);
    }
}
