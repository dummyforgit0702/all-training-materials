package SOLIDDesignProblemPractice.SOLID;

public class Main {
    public static void main(String[] args) {
        Report report = new Report("Quarterly Earning Report");

        // SRP
        ReportSaver saver= new ReportSaver();
        saver.saveToFile(report);

        // OCP + LSP
        ReportFormatter pdfFormatter= new PDFFormatter();
        ReportFormatter htmlFormatter= new HTMLFormatter();
        ReportPrinter printer= new ReportPrinter();
        printer.printFormattedReport(report, pdfFormatter);
        printer.printFormattedReport(report, htmlFormatter);

        // ISP
        MultiFunctionPrinter mfp= new MultiFunctionPrinter();
        mfp.scan();
        mfp.print();

        // DIP
        Storage fileStorage = new FileStorage();
        ReportService service = new ReportService(fileStorage);
        service.saveReport(report); 
    }

}
