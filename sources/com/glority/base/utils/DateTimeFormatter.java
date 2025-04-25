package com.glority.base.utils;

import com.glority.base.R;
import com.glority.utils.app.ResUtils;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DateTimeFormatter.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\r\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0007¨\u0006\u000e"}, d2 = {"Lcom/glority/base/utils/DateTimeFormatter;", "", "<init>", "()V", "getItemDetailTimeFormat", "", "uploadDate", "Ljava/util/Date;", "toCNMonth", "month", "", "getMonth", "date", "getDay", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class DateTimeFormatter {
    public static final int $stable = 0;
    public static final DateTimeFormatter INSTANCE = new DateTimeFormatter();

    private DateTimeFormatter() {
    }

    public final String getItemDetailTimeFormat(Date uploadDate) {
        if (uploadDate == null) {
            return "";
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(uploadDate);
        return calendar.get(5) + " " + toCNMonth(calendar.get(2) + 1);
    }

    private final String toCNMonth(int month) {
        String string;
        switch (month) {
            case 2:
                string = ResUtils.getString(R.string.month_february);
                break;
            case 3:
                string = ResUtils.getString(R.string.month_march);
                break;
            case 4:
                string = ResUtils.getString(R.string.month_april);
                break;
            case 5:
                string = ResUtils.getString(R.string.month_may);
                break;
            case 6:
                string = ResUtils.getString(R.string.month_june);
                break;
            case 7:
                string = ResUtils.getString(R.string.month_july);
                break;
            case 8:
                string = ResUtils.getString(R.string.month_august);
                break;
            case 9:
                string = ResUtils.getString(R.string.month_september);
                break;
            case 10:
                string = ResUtils.getString(R.string.month_october);
                break;
            case 11:
                string = ResUtils.getString(R.string.month_november);
                break;
            case 12:
                string = ResUtils.getString(R.string.month_december);
                break;
            default:
                string = ResUtils.getString(R.string.month_january);
                break;
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final String getMonth(Date date) {
        if (date == null) {
            return "";
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return toCNMonth(calendar.get(2) + 1);
    }

    public final int getDay(Date date) {
        if (date == null) {
            return -1;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(5);
    }
}
