package com.glority.android.base.agreement.util;

import androidx.core.app.NotificationCompat;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LogEventUtil.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/glority/android/base/agreement/util/LogEventUtil;", "", "()V", "logEvent", "", "page", "", NotificationCompat.CATEGORY_EVENT, "time", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "base-agreement_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class LogEventUtil {
    public static final LogEventUtil INSTANCE = new LogEventUtil();

    private LogEventUtil() {
    }

    public static /* synthetic */ void logEvent$default(LogEventUtil logEventUtil, String str, String str2, Double d, int i, Object obj) {
        if ((i & 4) != 0) {
            d = null;
        }
        logEventUtil.logEvent(str, str2, d);
    }

    public final void logEvent(String page, String event, Double time) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(event, "event");
        new LogEventRequest("gl_agreement", LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("name", page), TuplesKt.to("type", event), TuplesKt.to("time", time))).post();
    }
}
