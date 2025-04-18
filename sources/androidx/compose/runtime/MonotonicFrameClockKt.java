package androidx.compose.runtime;

import androidx.compose.runtime.MonotonicFrameClock;
import h0.l;

/* loaded from: classes3.dex */
public final class MonotonicFrameClockKt {
    public static final MonotonicFrameClock a(l lVar) {
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) lVar.i(MonotonicFrameClock.Key.f13830a);
        if (monotonicFrameClock != null) {
            return monotonicFrameClock;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }
}
