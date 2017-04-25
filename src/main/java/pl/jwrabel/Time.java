package pl.jwrabel;

/**
 * Created by jakubwrabel on 25.04.2017.
 */
public class Time {
    private int hour;
    private int minute;

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

    public static void main(String[] args) {
        Time time1 = new Time(20, 30);
        System.out.println(time1);

        Time time2 = new Time("2:30");

        System.out.println("-- czas przed dodaniem godzin --");
        System.out.println(time2);

        time2.addHours(-3);

        System.out.println("-- czas po dodaniu godzin --");
        System.out.println(time2);
    }

    public void addHours(int hours) {
        // Sposób 1
//        this.hour += hours;
//        while (this.hour > 23) {
//            this.hour -= 24;
//        }

//        // Sposób 2
//        if (this.hour + hours > 23) {
//            addHours(hours - 24);
//        } else {
//            this.hour += hours;
//        }

        // Sposób 3
        this.hour = (((this.hour + hours) % 24) + 24) % 24;

        // Sposób 4
        this.hour = (this.hour + hours) % 24;
        if (this.hour < 0) {
            this.hour = 24 + this.hour;
        }
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
