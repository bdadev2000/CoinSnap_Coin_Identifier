package j2;

import android.os.SystemClock;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final double f21020a = 1.0d / Math.pow(10.0d, 6.0d);
    public static final /* synthetic */ int b = 0;

    public static double a(long j7) {
        return (SystemClock.elapsedRealtimeNanos() - j7) * f21020a;
    }
}
