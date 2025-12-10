import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LogFileAnalyzer {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.err.println("Не указан путь к файлу.");
            return;
        }

        String path = args[0];

        // Проверка, что указанный путь является файлом
        if (!isFile(path)) {
            System.err.println("Указанный путь не является файлом.");
            return;
        }

        try {
            int totalLines = 0;
            int maxLength = 0;
            int minLength = Integer.MAX_VALUE;

            try (FileReader fileReader = new FileReader(path);
                 BufferedReader reader = new BufferedReader(fileReader)) {

                String line;
                while ((line = reader.readLine()) != null) {
                    totalLines++;
                    int length = line.length();

                    // Проверка длины строки
                    if (length > 1024) {
                        throw new LineTooLongException("Строка длиннее 1024 символов.");
                    }

                    // Обновление максимальной и минимальной длины строки
                    if (length > maxLength) {
                        maxLength = length;
                    }

                    if (length < minLength) {
                        minLength = length;
                    }
                }

                // Вывод результатов
                System.out.println("Общее количество строк в файле: " + totalLines);
                System.out.println("Длина самой длинной строки в файле: " + maxLength);
                System.out.println("Длина самой короткой строки в файле: " + minLength);

            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (LineTooLongException ex) {
                ex.printStackTrace();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Метод для проверки, является ли указанный путь файлом
    private static boolean isFile(String path) {
        java.io.File file = new java.io.File(path);
        return file.isFile();
    }
}

// Класс для обработки строки, превышающей допустимую длину
class LineTooLongException extends RuntimeException {
    public LineTooLongException(String message) {
        super(message);
    }
}
