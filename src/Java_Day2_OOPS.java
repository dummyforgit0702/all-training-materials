import java.util.*;
// Classes and Objects
/*
class Testing_Class{
    int age;    // This is called as the data members
    String name;
    // Default Constructor; ----> used to initialize the object of the class
    public Testing_Class(){

    }
    // Parameterized Constructor
    public Testing_Class(int age, String name){
        this.age= age;
        this.name= name;
    }
    public void print_age() {
        System.out.println("The age is" + age);
    }
    public void print_name(){
        System.out.println("The name is"+name);
    }
}

 */
/*
class Point{
    int x, y;
    Point(int x, int y){
        this.x= x;
        this.y= y;
    }

    Point (){
        this(10, 10);
    }


    Point setX(int x){
        this.x= x;
        return this;
    }
    Point setY(int y){
        this.y = y;
        return this;
    }
}
*/
/*
class Player{
    static int playerCount= 0;
    String name;
    int id;
    Player(String name){
        this.name = name;
        id= ++playerCount;
    }
    static int getPlayerCount(){
        return playerCount;
    }
}

 */
public class Java_Day2_OOPS {
    public static void main(String [] args){
        //System.out.println("Hello World");
        /*
        Testing_Class t1= new Testing_Class(23, "Shantanu Gupta");
        t1.print_age();
        t1.print_name();
        Testing_Class t2= new Testing_Class();
        t2.age= 23;
        t2.name= "Shantanu Gupta";
        t2.print_name();
        t2.print_age();
        System.out.println(t2==t1); // 2 different objects but same

         */
        /*
        Point p1= new Point(10, 20);
        Point p2= new Point(5, 15);
        p1.setX(2).setY(3); // Chaining

         */
        /*
        System.out.println(Player.getPlayerCount());
        Player p1= new Player("Shantanu Gupta");
        System.out.println(Player.getPlayerCount());

         */


    }
}





























/*
    Day 2:- OOPS Revision.
    Before that, understand about the procedural programming, this is the
    bridge between the procedural programming to object-oriented programming


    Also, read about the OOPS advantages 

    1. Classes and Objects.
    Classes -----------> Where you write the properties of the object, what the functionalities are
    and other stuff. (Properties and Behaviours)

    Objects ----------> Instance of the class; Defined in terms of its properties and behaviors.
    In other words, it represents the real world entities and what they are going to do is
    defined in the classes.

    2. 4 Pillars of OOPS
        A. Abstraction  ----------> Hiding up the data/methods/ so that only main functions are used.
        B. Encapsulation -----------> Placing all the methods in one place.
        C. Inheritance ---------> inheriting the properties from the parent class.
        D. Polymorphism --------> Similar name but different forms. (Achieved using the Interfaces).



        Questions that can be asked by anyone ----->
                1. Difference between Abstraction and Encapsulation.
                2. Difference between Inheritance and Polymorphism.
                3. What is the difference between method overloading and method overriding.
                4. Other questions related to core concepts of each topic

    3. Access Modifiers
    private ------> Within the class
    protected -----> within the package and child classes of other packages
    default -------> within the package
    public -------> anywhere

    4. static members ------> To make it accessible over methods so that it can be changed by anyone,

    5. final keyword
        A. for the variable ----> cannot be changed.
        B. for the method -------> no overriding
        C. for the class --------> no inheritance

 */
