package com.glority.base.utils;

import com.glority.android.core.utils.data.PersistData;
import kotlin.Metadata;

/* compiled from: BillingActivityUtils.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/glority/base/utils/BillingActivityUtils;", "", "<init>", "()V", "KEY_BILLING_ACTIVITY_LAST_OPENING_TIME", "", "KEY_BILLING_ACTIVITY_OPENED_TIMES_TODAY", "getLastBillingOpeningTime", "", "setLatestBillingOpeningTime", "", "time", "getBillingOpenedTimesToday", "", "setBillingOpenedTimesToday", "times", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class BillingActivityUtils {
    public static final int $stable = 0;
    public static final BillingActivityUtils INSTANCE = new BillingActivityUtils();
    private static final String KEY_BILLING_ACTIVITY_LAST_OPENING_TIME = "key_billing_activity_last_opening_time";
    private static final String KEY_BILLING_ACTIVITY_OPENED_TIMES_TODAY = "key_billing_activity_opened_times_today";

    private BillingActivityUtils() {
    }

    public final long getLastBillingOpeningTime() {
        return ((Number) PersistData.INSTANCE.get(KEY_BILLING_ACTIVITY_LAST_OPENING_TIME, 0L)).longValue();
    }

    public final void setLatestBillingOpeningTime(long time) {
        PersistData.INSTANCE.set(KEY_BILLING_ACTIVITY_LAST_OPENING_TIME, Long.valueOf(time));
    }

    public final int getBillingOpenedTimesToday() {
        return ((Number) PersistData.INSTANCE.get(KEY_BILLING_ACTIVITY_OPENED_TIMES_TODAY, 0)).intValue();
    }

    public final void setBillingOpenedTimesToday(int times) {
        PersistData.INSTANCE.set(KEY_BILLING_ACTIVITY_OPENED_TIMES_TODAY, Integer.valueOf(times));
    }
}
