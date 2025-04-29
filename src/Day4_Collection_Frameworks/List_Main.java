package Day4_Collection_Frameworks;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;
public class List_Main {

    public static void main(String[] args) {
        // ArrayList ---> All methods
        ArrayList<Integer> arr= new ArrayList<>();
        /*
        for(int i=0; i<100; i++){
            arr.add(i);
        }
        System.out.println(arr);
        for(Integer i: arr){
            System.out.println(i);
        }
         */
        System.out.println("-------------------------");
        System.out.println("ADD Methods /n 1. add(e) /n 2. add(index, object)");
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(arr);
        System.out.println("-------------------------");
        arr.add(1, 10);
        arr.add(2, 30);
        arr.add(0, -20);
        System.out.println(arr);
        System.out.println("-------------------------");

        // contains(object) ; remove(index); remove(object);
        System.out.println(arr.contains(1));
        System.out.println(arr.remove(1));
        // System.out.println(arr.remove(30));
        System.out.println("-------------------------");

        // get(object), set(index, object), indexOf(object), lastIndexOf(object)

        ArrayList<Integer> exp= new ArrayList<>();
        exp.add(1);
        exp.add(2);
        exp.add(3);
        System.out.println(exp.get(1));
        System.out.println(exp.set(1, 20));
        System.out.println(exp);
        System.out.println(exp.indexOf(20));
        exp.add(20);
        System.out.println(exp.lastIndexOf(20));

        // clear() // isEmpty()
        exp.clear();
        System.out.println(exp.isEmpty());
        System.out.println(arr.isEmpty());
        arr.clear();
        // ArrayList Traversal
        // Using for loop
        for(int i=0; i<10; i++){
            arr.add(i*10);
        }
        System.out.println(arr.size());
        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
        // Using for each loop
        for(Integer i: arr){
            System.out.print(i+" ");
        }
        System.out.println(" ");

        // Using iterator
        Iterator it= arr.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println(" ");
        /*
            If we are using the iterator method, we can also modify the
            arraylist as per our condition.
         */
        // for each method

        arr.forEach(x-> System.out.println(x));

    }
}

