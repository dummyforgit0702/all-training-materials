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


/*
// S - Single Responsibility Principle
class Report {
    private String content;

    public Report(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

// Separate class for saving reports
class ReportSaver {
    public void saveToFile(Report report) {
        System.out.println("Saving Report: " + report.getContent());
        // Logic to save to file
    }
}


// O - Open/Closed Principle
interface ReportFormatter {
    String format(String content);
}

class PDFFormatter implements ReportFormatter {
    public String format(String content) {
        return "PDF Format: " + content;
    }
}

class HTMLFormatter implements ReportFormatter {
    public String format(String content) {
        return "<html>" + content + "</html>";
    }
}


// L - Liskov Substitution Principle
class ReportPrinter {
    public void printFormattedReport(Report report, ReportFormatter formatter) {
        System.out.println(formatter.format(report.getContent()));
    }
}


// I - Interface Segregation Principle
interface Scannable {
    void scan();
}

interface Printable {
    void print();
}

class MultiFunctionPrinter implements Scannable, Printable {
    public void scan() {
        System.out.println("Scanning document...");
    }

    public void print() {
        System.out.println("Printing document...");
    }
}

// D - Dependency Inversion Principle
interface Storage {
    void store(String data);
}

class FileStorage implements Storage {
    public void store(String data) {
        System.out.println("Storing data in file: " + data);
    }
}

class DatabaseStorage implements Storage {
    public void store(String data) {
        System.out.println("Storing data in database: " + data);
    }
}

class ReportService {
    private final Storage storage;

    public ReportService(Storage storage) {
        this.storage = storage;
    }

    public void saveReport(Report report) {
        storage.store(report.getContent());
    }
}
public class SolidDemo {
    public static void main(String[] args) {
        Report report = new Report("Quarterly Earnings Report");

        // SRP
        ReportSaver saver = new ReportSaver();
        saver.saveToFile(report);

        // OCP + LSP
        ReportFormatter pdfFormatter = new PDFFormatter();
        ReportFormatter htmlFormatter = new HTMLFormatter();
        ReportPrinter printer = new ReportPrinter();
        printer.printFormattedReport(report, pdfFormatter);
        printer.printFormattedReport(report, htmlFormatter);

        // ISP
        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.scan();
        mfp.print();

        // DIP
        Storage fileStorage = new FileStorage(); // can switch to DatabaseStorage
        ReportService service = new ReportService(fileStorage);
        service.saveReport(report);
    }
}

 */
