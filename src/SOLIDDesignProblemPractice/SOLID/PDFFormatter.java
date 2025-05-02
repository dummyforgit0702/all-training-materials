package SOLIDDesignProblemPractice.SOLID;

public class PDFFormatter implements ReportFormatter{
    public String format(String content){
        return "PDF Format: "+ content;
    }

}

