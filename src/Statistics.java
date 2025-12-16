import java.util.HashSet;
import java.util.HashMap;

public class Statistics {
    private HashSet<String> pages = new HashSet<>();
    private HashSet<String> nonExistentPages = new HashSet<>();
    private HashMap<String, Integer> osCounts = new HashMap<>();
    private HashMap<String, Integer> browserCounts = new HashMap<>();

    public void addEntry(LogEntry entry) {
        if (entry.getResponseCode() == 200) {
            pages.add(entry.getRequestUrl());
        } else if (entry.getResponseCode() == 404) {
            nonExistentPages.add(entry.getRequestUrl());
        }

        String os = extractOsFromUserAgent(entry.getUserAgent());
        osCounts.put(os, osCounts.getOrDefault(os, 0) + 1);

        String browser = extractBrowserFromUserAgent(entry.getUserAgent());
        browserCounts.put(browser, browserCounts.getOrDefault(browser, 0) + 1);
    }

    public HashSet<String> getPages() {
        return pages;
    }

    public HashSet<String> getNonExistentPages() {
        return nonExistentPages;
    }

    public HashMap<String, Double> getOsDistribution() {
        HashMap<String, Double> osDistribution = new HashMap<>();
        int totalEntries = osCounts.values().stream().mapToInt(Integer::intValue).sum();

        for (String os : osCounts.keySet()) {
            osDistribution.put(os, (double) osCounts.get(os) / totalEntries);
        }

        return osDistribution;
    }

    public HashMap<String, Double> getBrowserDistribution() {
        HashMap<String, Double> browserDistribution = new HashMap<>();
        int totalEntries = browserCounts.values().stream().mapToInt(Integer::intValue).sum();

        for (String browser : browserCounts.keySet()) {
            browserDistribution.put(browser, (double) browserCounts.get(browser) / totalEntries);
        }

        return browserDistribution;
    }

    private String extractOsFromUserAgent(String userAgent) {
        if (userAgent.contains("Windows")) {
            return "Windows";
        } else if (userAgent.contains("Macintosh")) {
            return "Macintosh";
        } else if (userAgent.contains("Linux")) {
            return "Linux";
        } else {
            return "Other";
        }
    }

    private String extractBrowserFromUserAgent(String userAgent) {
        if (userAgent.contains("Chrome")) {
            return "Chrome";
        } else if (userAgent.contains("Firefox")) {
            return "Firefox";
        } else if (userAgent.contains("Safari") && !userAgent.contains("Chrome")) {
            return "Safari";
        } else if (userAgent.contains("Edge")) {
            return "Edge";
        } else if (userAgent.contains("YandexBot")) {
            return "YandexBot";
        } else {
            return "Other";
        }
    }
}
