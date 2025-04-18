package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.core.os.HandlerCompat;
import androidx.work.RunnableScheduler;

@RestrictTo
/* loaded from: classes3.dex */
public class DefaultRunnableScheduler implements RunnableScheduler {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f21923a = HandlerCompat.a(Looper.getMainLooper());

    @Override // androidx.work.RunnableScheduler
    public final void a(Runnable runnable, long j2) {
        this.f21923a.postDelayed(runnable, j2);
    }

    @Override // androidx.work.RunnableScheduler
    public final void b(Runnable runnable) {
        this.f21923a.removeCallbacks(runnable);
    }
}
