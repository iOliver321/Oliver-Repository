package EcoRoute.domain;

public class DayStatus {
    private String dayOfWeek;
    private String status;

    public DayStatus(String dayOfWeek, String status) {
        this.dayOfWeek = dayOfWeek;
        this.status = status;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
