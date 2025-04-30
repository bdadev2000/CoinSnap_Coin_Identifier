package t3;

import android.os.SystemClock;

/* renamed from: t3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2707b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23010a;

    public final long a() {
        switch (this.f23010a) {
            case 0:
                return SystemClock.elapsedRealtime();
            default:
                return System.currentTimeMillis();
        }
    }
}
