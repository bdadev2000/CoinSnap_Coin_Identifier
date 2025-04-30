package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class o {
    private final Handler handler = new Handler(Looper.getMainLooper());

    private final long calculateTime(long j7) {
        return SystemClock.uptimeMillis() + j7;
    }

    public final void cancel(String str) {
        G7.j.e(str, "tag");
        this.handler.removeCallbacksAndMessages(str);
    }

    public final void cancelAll() {
        this.handler.removeCallbacksAndMessages(null);
    }

    public final void schedule(Runnable runnable, String str, long j7) {
        G7.j.e(runnable, "runnable");
        G7.j.e(str, "tag");
        this.handler.postAtTime(runnable, str, calculateTime(j7));
    }

    public final void schedule(Runnable runnable, long j7) {
        G7.j.e(runnable, "runnable");
        this.handler.postAtTime(runnable, calculateTime(j7));
    }
}
