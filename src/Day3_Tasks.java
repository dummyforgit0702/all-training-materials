
import java.util.*;
public class Day3_Tasks {
    public static void main(String [] args) throws IllegalArgumentException, CustomAgeException{
        Scanner sc= new Scanner(System.in);
        // Task 1
        /*
        •   Create a program that takes an integer input from the user and
            divides 100 by that number.
        •   Use try-catch to handle ArithmeticException (division by zero) and
            InputMismatchException (invalid input).
         */
        /*
        System.out.println("Task 1");
        System.out.println("--------------------");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number that is needed to be divided");
        int num= sc.nextInt();
        try{
            System.out.println(divideNumber(num));
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero not possible");
        }
         */
        // For Task 2
        /*
        System.out.println("Task 2");
        System.out.println("--------------------");
        System.out.println("Enter the number for the square root");
        double task2Number= sc.nextDouble();
        if(task2Number < 0){
            throw new IllegalArgumentException("Cannot calculate the square root of -ve number");
        }
        else{
            System.out.println("Square root of the number is "+ calculateSquareRoot(task2Number));
        }

         */
        /*
        Task:
                • Create a method calculateSquareRoot(double number) that
                    throws an exception if the number is negative.
                • Use throws to propagate the exception and handle
                    it in the main method.
         */

        // For Task 3
        System.out.println("Enter the age");
        int age= sc.nextInt();
        validateAge(age);
    }

    // For Task 1
    /*
    public static int divideNumber(int a){
        return 100/a;
    }

     */

    // For Task 2
    /*
    public static double calculateSquareRoot(double number) {
        return Math.sqrt(number);
    }
     */

    // For Task 3
    /*
    Task:
        • Create a CustomAgeException that gets triggered
                when an invalid age (<18) is entered.
        • Implement a method validateAge(int age) that
            throws this exception if the age is less than 18.
     */
    public static void validateAge(int age) throws CustomAgeException{
        if(age<18){
            throw new CustomAgeException("He is below age 18");
        }
    }
}

// For Task 3
class CustomAgeException extends Exception{
    public CustomAgeException(String msg){
        super (msg);
    }
}

