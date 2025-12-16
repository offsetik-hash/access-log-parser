import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LogFileAnalyzer {
    public static void main(String[] args) {
        int googlebotCount = 0;
        int yandexbotCount = 0;
        int totalCount = 0;

        String filePath = "C:\\Users\\ebatkov\\IdeaProjects\\AccessLogParser\\src\\access.log";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                totalCount++;
                if (line.length() > 1024) {
                    throw new IllegalArgumentException("Строка слишком длинная");
                }

                String userAgent = extractUserAgent(line);
                if (userAgent != null) {
                    String[] parts = userAgent.split(";");
                    if (parts.length >= 2) {
                        String fragment = parts[1].trim();
                        String botName = fragment.split("/")[0].trim();

                        if ("Googlebot".equals(botName)) {
                            googlebotCount++;
                        } else if ("YandexBot".equals(botName)) {
                            yandexbotCount++;
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
            return;
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            return;
        }

        if (totalCount == 0) {
            System.out.println("Файл не содержит строк для анализа/может пустой");
            return;
        }

        double googlebotShare = (double) googlebotCount / totalCount * 100;
        double yandexbotShare = (double) yandexbotCount / totalCount * 100;

        System.out.println("Доля запросов от Googlebot: " + googlebotShare + "%");
        System.out.println("Доля запросов от YandexBot: " + yandexbotShare + "%");
    }

    private static String extractUserAgent(String line) {
        int start = line.indexOf("(");
        int end = line.indexOf(")");
        if (start != -1 && end != -1 && end > start) {
            return line.substring(start, end + 1);
        }
        return null;
    }
}