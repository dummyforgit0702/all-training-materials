package Day5_StreamsAPI;
import java.util.*;
public class LambdaExpressionsMain {

    // Lambda Expression
    /*
            These are the annonymous functions.
            It is implemented using functional interfaces; functional interfaces are those
            interfaces that are having exactly one abstract method.
     */
    // Without Lambda Expression
    /*
    public static void main(String[] args) {

        class MyPredicate implements Predicate<Integer>{

            public boolean test(Integer x){
                return (x%2==0);
            }
        }

        List<Integer> al= new ArrayList<>(Arrays.asList(10, 5, 20, 7, 30));
        printCond(al, new MyPredicate());
    }
    public static void printCond(Collection<Integer> c, Predicate<Integer> p){
        for(Integer x: c){
            if(p.test(x)){
                System.out.println(x+" ");
            }
        }
    }

     */

    public static void main(String[] args) {
        Predicate<Integer> myPredEven= new Predicate<>(){
            public boolean test(Integer x){
                return (x%2==0);
            }
        };
        List<Integer> al= new ArrayList<>(Arrays.asList(10, 5, 20, 7, 30));
        printCond(al, myPredEven);
        System.out.println("---------------------------");
        // Another Method
        printCond(al, new Predicate<Integer>() {
            @Override
            public boolean test(Integer x) {
                return (x%2==0);
            }
        });
        // Using the Lambda Expression
        System.out.println("---------------------------");
        printCond(al, x->x%2==0);
    }
    public static void printCond(Collection<Integer> c, Predicate<Integer> p){
        for(Integer x: c){
            if(p.test(x)){
                System.out.println(x+" ");
            }
        }
    }
}
interface Predicate<T>{
    abstract boolean test(T t);
}
