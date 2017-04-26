package pl.jwrabel;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jakubwrabel on 25.04.2017.
 */
public class TimeTest {

    // 20:30 + 15min -> 20:45
    @Test
    public void addMinutes_simpleCase() {
        // given
        Time time = new Time(20, 30);
        int minutesToAdd = 15;

        int expectedHours = 20;
        int expectedMinutes = 45;

        // when
        time.addMinutes(minutesToAdd);

        // then
        assertEquals(expectedHours, time.getHour());
        assertEquals(expectedMinutes, time.getMinute());
    }

    @Test
    public void addMinutes_simpleCase2() {
        // given
        Time time = new Time(20, 30);
        int minutesToAdd = 15;

        Time timeExpected = new Time(20, 45);

        // when
        time.addMinutes(minutesToAdd);

        // then
        assertEquals(timeExpected, time);
    }

    @Test
    public void addMinutes_overOneHour() {
        // given
        Time time = new Time(20, 30);
        int minutesToAdd = 45;

        int expectedHours = 21;
        int expectedMinutes = 15;

        // when
        time.addMinutes(minutesToAdd);

        // then
        assertEquals(expectedHours, time.getHour());
        assertEquals(expectedMinutes, time.getMinute());
    }
}