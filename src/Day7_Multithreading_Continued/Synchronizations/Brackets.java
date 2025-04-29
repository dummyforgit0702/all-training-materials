package Day7_Multithreading_Continued.Synchronizations;

public class Brackets {

    // Before Synchronization
    /*
    public void printBrackets(char open, char close){
        for(int i=0; i<10; i++){
            if(i<5){
                System.out.print(open);
            }
            else{
                System.out.print(close);
            }
        }
        System.out.println("");
    }

     */
    // Method 1:- Using the Synchronization Methods
    /*
    public synchronized void printBrackets(char open, char close){
        for(int i=0; i<10; i++){
            if(i<5){
                System.out.print(open);
            }
            else{
                System.out.print(close);
            }
        }
        System.out.println("");

    }

     */

    // Method 2:- Using the Synchronization blocks :-
                    // used so that whole method is not blocked
    public void printBrackets(char open, char close){
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                if (i < 5) {
                    System.out.print(open);
                } else {
                    System.out.print(close);
                }
            }
            System.out.println("");
        }
        // System.out.println("");

    }

}
