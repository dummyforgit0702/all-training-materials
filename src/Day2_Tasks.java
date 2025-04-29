import java.util.*;


public class Day2_Tasks {
    public static void main(String [] args){
        Student s1= new Student("Shantanu Gupta", 23, 98);
        System.out.println("For Task 2");
        System.out.println("----------------------------------");
        s1.getDetails();

        System.out.println(s1.getMarks());
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println("----------------------------------");

        s1.setAge(21);
        s1.setMarks(80);
        s1.setName("Raghav");

        System.out.println("----------------------------------");
        s1.getDetails();

        System.out.println("For Task 3");
        BankAccount b1= new BankAccount("Shantanu Gupta", "12345678", "9958356721");
        b1.checkBalance();
        b1.depositMoney(1000);
        b1.checkBalance();
        b1.withdrawMoney(100);
        b1.checkBalance();

        System.out.println("----------------------------------");
        System.out.println("Task 4");
        Car c1= new Car("Maruti", "Swift");
        c1.moveCar();
        c1.printCarDetails();

        Vehicle c2= new Vehicle("4-Wheeler", "TATA", "Curvv");
        c2.printCarDetails(); // Inheritance;
        c2.moveCar(5); // Method Overloading
        System.out.println("----------------------------------");
        System.out.println("Task 5");
        Super super1= new Super();
        super1.printName();
        Sub sub1= new Sub();
        sub1.printName();
        System.out.println("----------------------------------");

        System.out.println("Task 6");
        Dog d= new Dog();
        d.makeSound();
        d.specialMove();

        Cat c= new Cat();
        c.makeSound();
        c.specialMove();
        System.out.println("----------------------------------");
    }
}
// Task 1.
/*
class Student{
    // We can make this private
    String name;
    int age;
    int marks;
    // char grade;
    public Student (String name, int age, int marks){
        this.name = name ;
        this.age= age;
        this.marks= marks;
    }
    // Methods
    public void getDetails(){
        System.out.println(this.name+" "+ this.age +" "+ this.marks);
    }
}
 */

// Task 2.
class Student{
    // We can make this private
    private String name;
    private int age;
    private int marks;


    // char grade;
    public Student (String name, int age, int marks){
        this.name = name ;
        this.age= age;
        this.marks= marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Methods
    public void getDetails(){
        System.out.println(this.name+" "+ this.age +" "+ this.marks);
    }
}
/*
 Create a Student class with fields (name, age, grade) and methods (displayDetails())
Implement Encapsulation – make fields private, use getters and setters
Create a BankAccount class with deposit() and withdraw() methods
Implement Inheritance: Create a Car class that extends a Vehicle class
Implement Method Overloading & Overriding in an example
Use Abstract Class & Interface – Create an interface Animal with makeSound() and implement it in Dog and Cat classe
 */
// Task 3
class BankAccount{
    private String name;
    private String accountNumber;
    private String phoneNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, String phoneNumber){
        this.name= name;
        this.accountNumber= accountNumber;
        this.phoneNumber = phoneNumber;
    }
    public void depositMoney(double money){
        if(balance<=0){
            balance= money;
        }
        else{
            balance= balance+money;
        }
    }
    public void withdrawMoney(double money){
        if(balance<=0){
            System.out.println("Not Possible");
        }
        else{
            balance-=money;
        }
    }
    public void checkBalance(){
        System.out.println(balance);
    }
}
// Task 4 and Method overloading.
class Car {
    String carCompany;
    String modelName;

    public Car(String carCompany, String modelName){
        this.carCompany = carCompany;
        this.modelName = modelName;
    }

    public void printCarDetails(){
        System.out.println(this.carCompany + " " + this.modelName);
    }

    public void moveCar(){
        System.out.println("Car is moving");
    }
}

class Vehicle extends Car {
    String vehicle;

    public Vehicle(String vehicle, String carCompany, String modelName){
        super(carCompany, modelName); // Moved this line to the top
        this.vehicle = vehicle;
    }

    public void moveCar(int number){
        System.out.println("Car is moving for " + number + " minutes");
    }
}


// Task 5 :- Method Overriding

class Super{
    String name= "Shantanu Gupta";
    public void printName(){
        System.out.println("The code is written by " +name);
    }
}
class Sub extends Super{
    public void printName(){
        System.out.println("My name is "+name);
    }
}

// Task 6:- Abstract classes and
// Interfaces Use Abstract Class & Interface –
// Create an interface Animal with makeSound() and implement it in Dog and Cat classes

interface Animal{
    public void makeSound();
    public void specialMove();
}
class Dog implements Animal{
    public void makeSound(){
        System.out.println("Dog is barking");
    }
    public void specialMove(){
        System.out.println("Dog is attacking the intruders");
    }
}
class Cat implements Animal{
    public void makeSound(){
        System.out.println("Cat is meowing");
    }
    public void specialMove(){
        System.out.println("Cat is climbing the walls");
    }
}