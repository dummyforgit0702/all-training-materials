package Day4_Collection_Frameworks;
import java.util.*;

class Customer {
    String name;
    int number;
    public Customer(String name, int number){
        this.name = name;
        this.number = number;
    }
    public String toString(){
        return name + " (ID: " + number + ")";
    }
}

public class Task5Main {
    public static void main(String[] args) {
        int capacity = 3;
        Queue<Customer> q = new ArrayDeque<>(capacity);

        Customer c1 = new Customer("John", 1);
        Customer c2 = new Customer("Joe", 2);
        Customer c3 = new Customer("Kitty", 3);
        Customer c4 = new Customer("Perry", 4);

        q.offer(c1);
        q.offer(c2);
        q.offer(c3);

        if (q.size() == capacity) {
            System.out.println("Queue full! Customer " + c4.name + " please wait.");
        }

        while (!q.isEmpty()) {
            System.out.println(q.poll() + " is done");
        }
    }
}
