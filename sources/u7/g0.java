package u7;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* loaded from: classes3.dex */
public abstract class g0 {
    public static void a(AudioTrack audioTrack, t7.x xVar) {
        LogSessionId logSessionId;
        boolean equals;
        t7.w wVar = xVar.a;
        wVar.getClass();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        LogSessionId logSessionId2 = wVar.a;
        equals = logSessionId2.equals(logSessionId);
        if (!equals) {
            audioTrack.setLogSessionId(logSessionId2);
        }
    }
}
