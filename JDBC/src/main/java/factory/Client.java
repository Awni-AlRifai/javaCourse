package factory;

public class Client {
    public static void main(String[] args) {
        ReportFactory factory ;
        if(args[0] == "PDF"){
            factory = new PDFReportFactory();
        } else{
            factory = new HTMLReportFactory();
        }

        Report report = factory.createReport();
        report.generate();
    }
}
