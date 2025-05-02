package SOLIDDesignProblemPractice.SOLID;
//
public class ReportPrinter {
    public void printFormattedReport(Report report, ReportFormatter formatter){
        System.out.println(formatter.format(report.getContent()));
    }
}

