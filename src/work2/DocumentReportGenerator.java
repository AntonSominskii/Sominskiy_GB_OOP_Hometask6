package work2;

// Если DocumentReportGenerator поддерживает генерацию отчетов и в XML, и в JSON
public class DocumentReportGenerator implements XmlReportGenerator, JsonReportGenerator {

    @Override
    public String generateXml() {
        String report = "XML report content for Document";
        // Реализация логики создания отчета в формате XML
        return report;
    }

    @Override
    public String generateJson() {
        String report = "JSON report content for Document";
        // Реализация логики создания отчета в формате JSON
        return report;
    }
}