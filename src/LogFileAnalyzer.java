import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class LineTooLongException extends RuntimeException {
    public LineTooLongException(String message) {
        super(message);
    }
}

public class LogFileAnalyzer {
    public static void main(String[] args) {
        String path = "C:\\Users\\ebatkov\\IdeaProjects\\AccessLogParser\\src/access.log";

        File file = new File(path);
        if (!file.exists()) {
            throw new IllegalArgumentException("Файл не существует: " + path);
        }
        if (!file.isFile()) {
            throw new IllegalArgumentException("Указанный путь не является файлом: " + path);
        }

        int totalLines = 0;
        int maxLength = 0;
        int minLength = Integer.MAX_VALUE;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                totalLines++;
                int lineLength = line.length();
                if (lineLength > 1024) {
                    throw new LineTooLongException("Строка №" + totalLines + " превышает допустимую длину в 1024 символа.");
                }
                if (lineLength > maxLength) {
                    maxLength = lineLength;
                }
                if (lineLength < minLength) {
                    minLength = lineLength;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        } catch (LineTooLongException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        System.out.println("Общее количество строк в файле: " + totalLines);
        System.out.println("Длина самой длинной строки в файле: " + maxLength);
        System.out.println("Длина самой короткой строки в файле: " + minLength);
    }
}
