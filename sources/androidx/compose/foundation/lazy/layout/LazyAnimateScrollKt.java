package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.LazyListAnimateScrollScope;
import androidx.compose.ui.unit.Density;
import com.android.volley.DefaultRetryPolicy;
import com.google.android.gms.common.ConnectionResult;
import d0.b0;
import h0.g;
import i0.a;

/* loaded from: classes2.dex */
public final class LazyAnimateScrollKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f4662a = DefaultRetryPolicy.DEFAULT_TIMEOUT_MS;

    /* renamed from: b, reason: collision with root package name */
    public static final float f4663b = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;

    /* renamed from: c, reason: collision with root package name */
    public static final float f4664c = 50;

    public static final Object a(int i2, int i3, LazyListAnimateScrollScope lazyListAnimateScrollScope, Density density, g gVar) {
        Object f2 = lazyListAnimateScrollScope.f(new LazyAnimateScrollKt$animateScrollToItem$2(i2, i3, 100, lazyListAnimateScrollScope, density, null), gVar);
        return f2 == a.f30806a ? f2 : b0.f30125a;
    }

    public static final boolean b(LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i2) {
        return i2 <= lazyLayoutAnimateScrollScope.a() && lazyLayoutAnimateScrollScope.e() <= i2;
    }
}
