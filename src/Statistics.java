import java.util.HashSet;
import java.util.HashMap;

public class Statistics {
    private HashSet<String> pages = new HashSet<>();
    private HashMap<String, Integer> osCounts = new HashMap<>();

    public void addEntry(LogEntry entry) {
        if (entry.getResponseCode() == 200) {
            pages.add(entry.getRequestUrl());
        }

        String os = extractOsFromUserAgent(entry.getUserAgent());
        osCounts.put(os, osCounts.getOrDefault(os, 0) + 1);
    }

    public HashSet<String> getPages() {
        return pages;
    }

    public HashMap<String, Double> getOsDistribution() {
        HashMap<String, Double> osDistribution = new HashMap<>();
        int totalEntries = osCounts.values().stream().mapToInt(Integer::intValue).sum();

        for (String os : osCounts.keySet()) {
            osDistribution.put(os, (double) osCounts.get(os) / totalEntries);
        }

        return osDistribution;
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
}
