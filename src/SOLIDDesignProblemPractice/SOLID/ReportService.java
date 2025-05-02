package SOLIDDesignProblemPractice.SOLID;

public class ReportService {
    private final Storage storage;
    public ReportService(Storage storage){
        this.storage= storage;
    }
    public void saveReport(Report report){
        storage.store(report.getContent());
    }
}
