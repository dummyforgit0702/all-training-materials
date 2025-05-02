package SOLIDDesignProblemPractice.SOLID;

public class HTMLFormatter implements ReportFormatter{
    public String format(String content){
        return "<html>" + content +"</html>";

    }
}


