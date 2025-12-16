public class LogEntry {
    private String requestUrl;
    private int responseCode;
    private String userAgent;

    public LogEntry(String requestUrl, int responseCode, String userAgent) {
        this.requestUrl = requestUrl;
        this.responseCode = responseCode;
        this.userAgent = userAgent;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public String getUserAgent() {
        return userAgent;
    }
}
