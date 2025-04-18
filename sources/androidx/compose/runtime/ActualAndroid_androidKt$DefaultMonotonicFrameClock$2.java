package androidx.compose.runtime;

import android.os.Looper;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
public final class ActualAndroid_androidKt$DefaultMonotonicFrameClock$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public static final ActualAndroid_androidKt$DefaultMonotonicFrameClock$2 f13674a = new r(0);

    @Override // q0.a
    public final Object invoke() {
        return Looper.getMainLooper() != null ? DefaultChoreographerFrameClock.f13779a : SdkStubsFallbackFrameClock.f13973a;
    }
}
