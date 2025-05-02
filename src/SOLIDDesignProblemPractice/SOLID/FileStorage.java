package SOLIDDesignProblemPractice.SOLID;

public class FileStorage implements Storage{
    public void store(String data){
        System.out.println("Storing data in file: "+data);
    }

}
