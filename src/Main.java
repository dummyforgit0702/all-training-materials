/*//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}

 */
import java.util.*;
public class Main{
    public static void main(String [] args){
        // Basic testing of wheather the code is working or not;

       // int c= 3;
        //System.out.println(c);
        // Data Types
        /*
        Integer -----> int ;
        Short ---> byte
        long -----> long (for long integer values)
        decimal -----> float;
        double decimal -----> double;
         */
        // Scanner function revision ;
        /*
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value for x");
        float x= sc.nextFloat();
        System.out.println("Enter value for y");
        float y= sc.nextFloat();
        float z= x+y;
        System.out.println(z);
         */
        // Loops practice
        // 1. if -else loop
        /*
        if(a>b && a>c){
            System.out.println("A is biggest");
        }
        else if(b>a && b>c){
            System.out.println("B is Biggest");
        }
        else{
            System.out.println("C is the greatest");
        }
         */
        // 2. for loops
        System.out.println("For Loop Testing");
        for(int i=0; i<5; i++){
            System.out.println(5*i);
        }
        int a = 10;
        System.out.println("while loop testing");
        while(a>0){
            System.out.println(a--);
        }

        System.out.println("do-while loop testing");
        int b= 0;
        do{
            System.out.println(b);
            b++;
            //System.out.println(b);
        }while(b<10);


        // Operators
        // 1. Assignment Operator -----> +, -, *, /, %
        //2. Unary Operator -----> ++a (pre-increment/decrement ) && a++(post-increment/decrement)
                                        // !

        //3. Assignment Operator
          // a. +=
//        int n=34;
//        n+=3;
//        System.out.println(n);
//
        // b. -=
//        int n=34;
//        n-=3;
//        System.out.println(n);
//
        // c. *=
//        int n= 3;
//        n*=5;
//        System.out.println(n);

        // d. /=
//        int n= 15;
//        n/=5;
//        System.out.println(n);

        // e. %=
        int n= 20 ;
        n%=3;
        System.out.println(n);

    }
}

