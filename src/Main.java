import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:/Users/ebatkov/IdeaProjects/AccessLogParser/src/access.log";
        Statistics statistics = new Statistics();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String logLine;
            while ((logLine = br.readLine()) != null) {
                try {
                    LogEntry logEntry = LogEntryParser.parseLogEntry(logLine);
                    statistics.addEntry(logEntry);
                } catch (IllegalArgumentException e) {
                    System.err.println("Error processing log entry: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        // Вывод списка всех страниц
        System.out.println("List of all pages:");
        for (String page : statistics.getPages()) {
            System.out.println(page);
        }

        // Вывод статистики операционных систем
        System.out.println("\nOperating System Distribution:");
        Map<String, Double> osDistribution = statistics.getOsDistribution();

        double sumOfDistributions = 0.0;
        for (Map.Entry<String, Double> entry : osDistribution.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            sumOfDistributions += entry.getValue();
        }
        System.out.println("\nSum of distributions: " + sumOfDistributions);
    }
}
