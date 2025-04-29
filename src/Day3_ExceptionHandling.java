// Custom Exception
/*
class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }
}
 */
public class Day3_ExceptionHandling {

    public static void main(String[] args) {
        System.out.println("Hello World");
        /*
        try {
            Scanner sc = new Scanner(new File("C:\\Users\\shantanu.gupta\\IdeaProjects\\Java Learnings\\src\\shantanu.txt"));
            System.out.println("File found");
            System.out.println("------------------------");
            //Scanner sc = new Scanner(new File("C:\\Users\\shantanu.gupta\\IdeaProjects\\Java Learnings\\src\\text.txt"));

        }
        catch(FileNotFoundException ex){
            System.out.println("File not found....");
            System.out.println("------------------------");
        }
        finally{
            System.out.println("This will execute anyhow");
            System.out.println("------------------------");
        }

         */
        /*
        int a= 5;
        int b=0;
        try {
            System.out.println("The division is " + divide(5, 0));
        }
        catch(ArithmeticException e){
            System.out.println("Check the values of the variables used");
            // e.printStackTrace();
        }

         */
        int a = 10;
        /*
        if(a<11){
            throw new MyException("This is not possible");
        }
        else{
            System.out.println("It is possible");
        }

         */
    }
    /*
    public static int divide(int a, int b){
            int c = a / b;
            return c;
    }

     */
}


/*
Day 3:- Exception Handling
        Questions that might be asked:-
        1. Difference between error and exception.
        2. Difference between throw and throws.
        3. Checked vs unchecked.


        " Note:- Errors are being handled by JVM "
        Main Keywords:- try, catch, finally, throw, throws.



        // This is the part I know.

        Method 1:- try catch finally block
        try{
        // Logic
        }catch(// Mention the exception){
        //... logic
        }
        finally{
        // It will be executing anyhow even if there is no exception.
        }
        Eg:-
        System.out.println("Hello World");
        try {
            Scanner sc = new Scanner(new File("C:\\Users\\shantanu.gupta\\IdeaProjects\\Java Learnings\\src\\shantanu.txt"));
            System.out.println("File found");
            System.out.println("------------------------");
            //Scanner sc = new Scanner(new File("C:\\Users\\shantanu.gupta\\IdeaProjects\\Java Learnings\\src\\text.txt"));

        }
        catch(FileNotFoundException ex){
            System.out.println("File not found....");
            System.out.println("------------------------");
        }
        finally{
            System.out.println("This will execute anyhow");
            System.out.println("------------------------");
        }

        Method 2:- throw throws

        Multiple Exceptions is also possible

        // Custom Exceptions
 */
