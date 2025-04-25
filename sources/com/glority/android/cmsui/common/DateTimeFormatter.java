package com.glority.android.cmsui.common;

import com.glority.android.cmsui.R;
import com.glority.utils.app.ResUtils;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes14.dex */
public class DateTimeFormatter {
    public static String getItemDetailTimeFormat(Date date) {
        if (date == null) {
            return "";
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(5) + " " + toCNMonth(calendar.get(2) + 1);
    }

    public static String toCNMonth(int i) {
        switch (i) {
            case 1:
                return ResUtils.getString(R.string.month_january);
            case 2:
                return ResUtils.getString(R.string.month_february);
            case 3:
                return ResUtils.getString(R.string.month_march);
            case 4:
                return ResUtils.getString(R.string.month_april);
            case 5:
                return ResUtils.getString(R.string.month_may);
            case 6:
                return ResUtils.getString(R.string.month_june);
            case 7:
                return ResUtils.getString(R.string.month_july);
            case 8:
                return ResUtils.getString(R.string.month_august);
            case 9:
                return ResUtils.getString(R.string.month_september);
            case 10:
                return ResUtils.getString(R.string.month_october);
            case 11:
                return ResUtils.getString(R.string.month_november);
            case 12:
                return ResUtils.getString(R.string.month_december);
            default:
                return ResUtils.getString(R.string.month_january);
        }
    }
}
