public class LogEntryParser {
    public static LogEntry parseLogEntry(String logLine) throws IllegalArgumentException {
        // регулярка для парсинга строки лога
        String regex = "^\\S+ \\S+ \\S+ \\[(.*?)\\] \"(\\S+) (\\S+) \\S+\" (\\d+) \\d+ \"(.*?)\" \"(.*)\"$";
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex);
        java.util.regex.Matcher matcher = pattern.matcher(logLine);

        if (!matcher.matches()) {
            throw new IllegalArgumentException("Некорректный формат строки лога: " + logLine);
        }

        String requestUrl = matcher.group(3);
        int responseCode = Integer.parseInt(matcher.group(4));
        String userAgent = matcher.group(6);

        return new LogEntry(requestUrl, responseCode, userAgent);
    }
}
