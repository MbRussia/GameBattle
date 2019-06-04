package com.example.gamebattle;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateHelper {
    private static Calendar date = Calendar.getInstance();
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm");

    public static String getFormattedStartDate() {
        date.set(Calendar.YEAR, date.get(Calendar.YEAR) - 1500);
        return simpleDateFormat.format(date.getTime());
    }

    public static void skipTime() {
        date.set(Calendar.MINUTE, date.get(Calendar.MINUTE) + 45);

    }

    public static String getFormattedDiff() {
        return simpleDateFormat.format(date.getTime());
    }
}
