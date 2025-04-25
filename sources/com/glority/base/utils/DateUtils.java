package com.glority.base.utils;

import com.google.android.material.timepicker.TimeModel;
import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DateUtils.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n¨\u0006\u0017"}, d2 = {"Lcom/glority/base/utils/DateUtils;", "", "<init>", "()V", "getMonthString", "", "month", "", "getDateAgoString", "date", "Ljava/util/Date;", "getYearFromDate", "getMonthFromDate", "getDayFromDate", "getHourFromDate", "getHour12FromDate", "getMinuteFromDate", "getAMOrPMFromDate", "differentDays", "date1", "date2", "format12Time", "formatDate", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class DateUtils {
    public static final int $stable = 0;
    public static final DateUtils INSTANCE = new DateUtils();

    private DateUtils() {
    }

    public final String getMonthString(int month) {
        String str = new DateFormatSymbols().getMonths()[month];
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        return str;
    }

    public final String getDateAgoString(Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        long time = new Date().getTime();
        long time2 = date.getTime();
        if (time < time2) {
            return "";
        }
        long j = (time - time2) / 1000;
        if (j < 60) {
            return j + "s";
        }
        long j2 = 60;
        long j3 = j / j2;
        if (j3 < 60) {
            return j3 + "m";
        }
        long j4 = j3 / j2;
        if (j4 < 24) {
            return j4 + "h";
        }
        return (j4 / 24) + "d";
    }

    public final int getYearFromDate(Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(1);
    }

    public final int getMonthFromDate(Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(2);
    }

    public final int getDayFromDate(Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(5);
    }

    public final int getHourFromDate(Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(11);
    }

    public final int getHour12FromDate(Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(10);
    }

    public final int getMinuteFromDate(Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(12);
    }

    public final int getAMOrPMFromDate(Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(9);
    }

    public final int differentDays(Date date1, Date date2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        int i = calendar.get(6);
        int i2 = calendar2.get(6);
        int i3 = calendar.get(1);
        int i4 = calendar2.get(1);
        if (i3 == i4) {
            return i2 - i;
        }
        int i5 = 0;
        while (i3 < i4) {
            i5 += ((i3 % 4 != 0 || i3 % 100 == 0) && i3 % 400 != 0) ? 365 : 366;
            i3++;
        }
        return i5 + (i2 - i);
    }

    public final String format12Time(Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Object[] objArr = new Object[1];
        objArr[0] = Integer.valueOf(getHour12FromDate(date) == 0 ? 12 : getHour12FromDate(date));
        String format = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(objArr, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String format2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(getMinuteFromDate(date))}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return format + ":" + format2 + " " + (getAMOrPMFromDate(date) == 0 ? "AM" : "PM");
    }

    public final String formatDate(Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        int yearFromDate = getYearFromDate(date);
        String format = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(getMonthFromDate(date) + 1)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String format2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(getDayFromDate(date))}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return yearFromDate + "-" + format + "-" + format2;
    }
}
