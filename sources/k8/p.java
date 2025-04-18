package k8;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;

/* loaded from: classes3.dex */
public abstract class p {
    public static void a(j jVar, t7.x xVar) {
        LogSessionId logSessionId;
        boolean equals;
        String stringId;
        t7.w wVar = xVar.a;
        wVar.getClass();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        LogSessionId logSessionId2 = wVar.a;
        equals = logSessionId2.equals(logSessionId);
        if (!equals) {
            MediaFormat mediaFormat = jVar.f20324b;
            stringId = logSessionId2.getStringId();
            mediaFormat.setString("log-session-id", stringId);
        }
    }
}
