package s7;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;

/* loaded from: classes3.dex */
public abstract class d0 {
    public static t7.x a(Context context, i0 i0Var, boolean z10) {
        t7.u uVar;
        LogSessionId logSessionId;
        MediaMetricsManager b3 = t7.s.b(context.getSystemService("media_metrics"));
        if (b3 == null) {
            uVar = null;
        } else {
            uVar = new t7.u(context, t7.s.n(b3));
        }
        if (uVar == null) {
            n9.o.f("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new t7.x(logSessionId);
        }
        if (z10) {
            i0Var.getClass();
            t7.p pVar = (t7.p) i0Var.f24417r;
            pVar.getClass();
            pVar.f25320h.a(uVar);
        }
        return new t7.x(t7.s.a(uVar.f25337c));
    }
}
