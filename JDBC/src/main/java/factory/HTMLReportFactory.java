package factory;

public class HTMLReportFactory implements ReportFactory {
   @Override
    public Report createReport() {
        return new HTMReport();
    }
}
