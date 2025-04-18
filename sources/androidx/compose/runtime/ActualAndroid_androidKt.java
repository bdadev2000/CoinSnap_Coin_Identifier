package androidx.compose.runtime;

import android.os.Looper;
import b1.f0;

/* loaded from: classes4.dex */
public final class ActualAndroid_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final long f13672a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f13673b = 0;

    static {
        long j2;
        f0.t(ActualAndroid_androidKt$DefaultMonotonicFrameClock$2.f13674a);
        try {
            j2 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j2 = -1;
        }
        f13672a = j2;
    }
}
