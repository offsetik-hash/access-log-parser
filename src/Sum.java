import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sum {
    public static void main(String[] args) {
        int googlebotCount = 0;
        int yandexbotCount = 0;
        int totalCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("path_to_your_log_file.log"))) {
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
            e.printStackTrace();
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
