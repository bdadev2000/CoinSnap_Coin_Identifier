package com.glority.utils.data;

import android.text.format.DateUtils;
import com.glority.utils.UtilsApp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class TimeUtils {
    private static final ThreadLocal<SimpleDateFormat> SDF_THREAD_LOCAL = new ThreadLocal<>();

    public static long now() {
        return System.currentTimeMillis();
    }

    public static String nowString() {
        return toString(System.currentTimeMillis(), getDefaultFormat());
    }

    public static String nowString(DateFormat dateFormat) {
        return toString(System.currentTimeMillis(), dateFormat);
    }

    public static Date nowDate() {
        return new Date();
    }

    public static String toString(long j) {
        return toString(j, getDefaultFormat());
    }

    public static String toString(long j, DateFormat dateFormat) {
        return dateFormat.format(new Date(j));
    }

    public static String toString(long j, int i) {
        return DateUtils.formatDateTime(UtilsApp.getApp(), j, i);
    }

    public static long toMillis(String str) {
        return toMillis(str, getDefaultFormat());
    }

    public static long toMillis(String str, DateFormat dateFormat) {
        try {
            return dateFormat.parse(str).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
            return -1L;
        }
    }

    public static Date toDate(String str) {
        return toDate(str, getDefaultFormat());
    }

    public static Date toDate(String str, DateFormat dateFormat) {
        try {
            return dateFormat.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String toString(Date date) {
        return toString(date, getDefaultFormat());
    }

    public static String toString(Date date, DateFormat dateFormat) {
        return dateFormat.format(date);
    }

    public static String toString(Date date, int i) {
        return toString(date.getTime(), i);
    }

    public static long toMillis(Date date) {
        return date.getTime();
    }

    public static Date toDate(long j) {
        return new Date(j);
    }

    public static long span(String str, String str2, int i) {
        return span(str, str2, getDefaultFormat(), i);
    }

    public static long span(String str, String str2, DateFormat dateFormat, int i) {
        return toTimeSpan(toMillis(str, dateFormat) - toMillis(str2, dateFormat), i);
    }

    public static long span(Date date, Date date2, int i) {
        return toTimeSpan(toMillis(date) - toMillis(date2), i);
    }

    public static long span(long j, long j2, int i) {
        return toTimeSpan(j - j2, i);
    }

    public static boolean isLeapYear(String str) {
        return isLeapYear(toDate(str, getDefaultFormat()));
    }

    public static boolean isLeapYear(String str, DateFormat dateFormat) {
        return isLeapYear(toDate(str, dateFormat));
    }

    public static boolean isLeapYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return isLeapYear(calendar.get(1));
    }

    public static boolean isLeapYear(long j) {
        return isLeapYear(toDate(j));
    }

    public static boolean isLeapYear(int i) {
        return (i % 4 == 0 && i % 100 != 0) || i % 400 == 0;
    }

    private static SimpleDateFormat getDefaultFormat() {
        ThreadLocal<SimpleDateFormat> threadLocal = SDF_THREAD_LOCAL;
        SimpleDateFormat simpleDateFormat = threadLocal.get();
        if (simpleDateFormat != null) {
            return simpleDateFormat;
        }
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        threadLocal.set(simpleDateFormat2);
        return simpleDateFormat2;
    }

    private static long toTimeSpan(long j, int i) {
        return j / i;
    }

    private TimeUtils() {
        throw new UnsupportedOperationException("u can't initialize me!");
    }
}
