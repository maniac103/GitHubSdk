package com.meisolsson.githubsdk.core;

import static org.junit.Assert.assertEquals;
import static java.util.Calendar.DECEMBER;
import static java.util.Calendar.FEBRUARY;

import org.junit.Test;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class FormattedTimeAdapterTest {

    private final FormattedTimeAdapter adapter = new FormattedTimeAdapter();

    @Test
    public void parses_a_utc_time_string() {
        String dateString = "2017-02-10T20:49:50Z";

        Date parsedDate = adapter.fromJson(dateString);

        Date expectedDate = buildUTCDate(2017, FEBRUARY, 10, 20, 49, 50);
        assertEquals(expectedDate, parsedDate);
    }

    @Test
    public void formats_local_time_into_a_utc_time_string() {
        Date date = buildLocalDate(2020, DECEMBER, 24, 0, 59, 59);

        String formattedDate = adapter.toJson(date);

        String expectedDateString = "2020-12-24T00:59:59Z";
        assertEquals(expectedDateString, formattedDate);
    }

    private Date buildUTCDate(int year, int month, int day, int hour, int minute, int second) {
        GregorianCalendar calendar = new GregorianCalendar(year, month, day, hour, minute, second);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar.getTime();
    }

    private Date buildLocalDate(int year, int month, int day, int hour, int minute, int second) {
        GregorianCalendar calendar = new GregorianCalendar(year, month, day, hour, minute, second);
        return calendar.getTime();
    }
}