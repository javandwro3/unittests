package pl.jwrabel;

/**
 * Created by jakubwrabel on 25.04.2017.
 */
public class Time {
    private int hour;
    private int minute;

    public static void main(String[] args) {
        Time time1 = new Time(20, 30);
        System.out.println(time1);

        Time time2 = new Time("20:30");
        System.out.println(time2);
    }

    // "12:30"
    public Time(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Cannot parse null");
        }

        String[] splitted = text.split(":");
        if (splitted.length != 2) {
            throw new IllegalArgumentException("Wrong number of elements");
        }

        try {
            hour = Integer.parseInt(splitted[0]);
            minute = Integer.parseInt(splitted[1]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Wrong time format");
        }
    }

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                '}';
    }

}
