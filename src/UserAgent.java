public class UserAgent {
    private final String operatingSystem;
    private final String browser;

    public UserAgent(String userAgentString) {
        if (userAgentString == null || userAgentString.isEmpty()) {
            throw new IllegalArgumentException("Неверный формат строки User-Agent: " + userAgentString);
        }

        if (userAgentString.contains("Windows")) {
            this.operatingSystem = "Windows";
        } else if (userAgentString.contains("Macintosh") || userAgentString.contains("macOS")) {
            this.operatingSystem = "macOS";
        } else if (userAgentString.contains("Linux")) {
            this.operatingSystem = "Linux";
        } else {
            this.operatingSystem = "Other";
        }

        if (userAgentString.contains("Edge")) {
            this.browser = "Edge";
        } else if (userAgentString.contains("Firefox")) {
            this.browser = "Firefox";
        } else if (userAgentString.contains("Chrome")) {
            this.browser = "Chrome";
        } else if (userAgentString.contains("Opera")) {
            this.browser = "Opera";
        } else {
            this.browser = "Other";
        }
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getBrowser() {
        return browser;
    }
}
