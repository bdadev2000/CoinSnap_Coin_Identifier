package w4;

import android.os.SystemClock;

/* loaded from: classes.dex */
public abstract class g {
    public static final double a = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f26732b = 0;

    public static double a(long j3) {
        return (SystemClock.elapsedRealtimeNanos() - j3) * a;
    }
}
