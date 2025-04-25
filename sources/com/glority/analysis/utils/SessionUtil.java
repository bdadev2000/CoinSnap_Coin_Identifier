package com.glority.analysis.utils;

import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.xx.constants.Args;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SessionUtil.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/glority/analysis/utils/SessionUtil;", "", "()V", "isSessionEnd", "", Args.sessionId, "", "getSessionId", "()Ljava/lang/String;", "setSessionId", "(Ljava/lang/String;)V", "startTs", "", "onAppSessionEnd", "", "onAppSessionStart", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final class SessionUtil {
    public static final SessionUtil INSTANCE = new SessionUtil();
    private static boolean isSessionEnd;
    private static String sessionId;
    private static long startTs;

    static {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "UUID.randomUUID().toString()");
        sessionId = uuid;
        startTs = System.currentTimeMillis();
    }

    private SessionUtil() {
    }

    public final String getSessionId() {
        return sessionId;
    }

    public final void setSessionId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        sessionId = str;
    }

    public final void onAppSessionStart() {
        if (isSessionEnd) {
            isSessionEnd = false;
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "UUID.randomUUID().toString()");
            sessionId = uuid;
        }
        startTs = System.currentTimeMillis();
        new LogEventRequest(LogEvents.APP_SESSION_START, null, 2, null).post();
    }

    public final void onAppSessionEnd() {
        isSessionEnd = true;
        new LogEventRequest(LogEvents.APP_SESSION_END, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("time", Double.valueOf((System.currentTimeMillis() - startTs) / 1000)))).post();
    }
}
