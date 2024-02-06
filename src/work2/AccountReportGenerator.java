package work2;

// Если AccountReportGenerator поддерживает генерацию отчетов только в формате JSON
public class AccountReportGenerator implements JsonReportGenerator {

    @Override
    public String generateJson() {
        String report = "JSON report content for Account";
        // Реализация логики создания отчета в формате JSON
        return report;
    }
}