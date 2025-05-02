package SOLIDDesignProblemPractice.SOLID;

public class DatabaseStorage implements Storage{
    public void store(String data){
        System.out.println("Storing data in database: "+data);
    }
}
