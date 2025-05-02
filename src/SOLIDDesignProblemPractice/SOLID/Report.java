package SOLIDDesignProblemPractice.SOLID;
// S -> Single Responsibility Principle
        // Only one reason to change.
public class Report {
    private String content;

    public Report(String content){
        this.content= content;

    }
    public String getContent(){
        return content;
    }
}



