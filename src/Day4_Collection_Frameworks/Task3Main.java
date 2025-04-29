package Day4_Collection_Frameworks;
import java.util.*;
public class Task3Main {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>(Arrays.asList(10, 30, 80, 50, 9, 2, 3, 7));
        System.out.println(list);
        System.out.println("----------------------------------");
        Collections.sort(list);
        System.out.println("After Ascending");
        System.out.println(list);
        System.out.println("----------------------------------");
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("After Descending");
        System.out.println(list);
        System.out.println("----------------------------------");
        // Method 2
        /*
        list.sort(Comparator.naturalOrder());      // Ascending
        list.sort(Comparator.reverseOrder());      // Descending
         */
    }
}
