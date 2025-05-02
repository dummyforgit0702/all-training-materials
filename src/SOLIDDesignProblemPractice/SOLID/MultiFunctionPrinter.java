package SOLIDDesignProblemPractice.SOLID;


public class MultiFunctionPrinter implements Scannable, Printable {
    public void scan(){
        System.out.println("Scanning documents.....");
    }
    public void print(){
        System.out.println("Printing document.....");
    }
}

