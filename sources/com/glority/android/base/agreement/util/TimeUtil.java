package com.glority.android.base.agreement.util;

import com.glority.android.base.agreement.R;
import com.glority.utils.app.ResUtils;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TimeUtil.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\n"}, d2 = {"Lcom/glority/android/base/agreement/util/TimeUtil;", "", "()V", "formatDate", "", "date", "Ljava/util/Date;", "getMonth", "month", "", "base-agreement_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class TimeUtil {
    public static final TimeUtil INSTANCE = new TimeUtil();

    private TimeUtil() {
    }

    public final String formatDate(Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(5) + ' ' + getMonth(calendar.get(2) + 1) + ' ' + calendar.get(1);
    }

    private final String getMonth(int month) {
        int i;
        switch (month) {
            case 1:
                i = R.string.agreement_month_january;
                break;
            case 2:
                i = R.string.agreement_month_february;
                break;
            case 3:
                i = R.string.agreement_month_march;
                break;
            case 4:
                i = R.string.agreement_month_april;
                break;
            case 5:
                i = R.string.agreement_month_may;
                break;
            case 6:
                i = R.string.agreement_month_june;
                break;
            case 7:
                i = R.string.agreement_month_july;
                break;
            case 8:
                i = R.string.agreement_month_august;
                break;
            case 9:
                i = R.string.agreement_month_september;
                break;
            case 10:
                i = R.string.agreement_month_october;
                break;
            case 11:
                i = R.string.agreement_month_november;
                break;
            case 12:
                i = R.string.agreement_month_december;
                break;
            default:
                i = R.string.agreement_month_january;
                break;
        }
        String string = ResUtils.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "ResUtils.getString(\n    …th_january\n            })");
        return string;
    }
}
