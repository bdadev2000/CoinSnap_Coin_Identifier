package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Rect;
import d0.k;
import e0.e0;
import java.util.Map;

/* loaded from: classes3.dex */
public final class VisibilityThresholdsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Rect f2404a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f2405b;

    static {
        Float valueOf = Float.valueOf(0.5f);
        f2404a = new Rect(0.5f, 0.5f, 0.5f, 0.5f);
        TwoWayConverter twoWayConverter = VectorConvertersKt.f2341b;
        Float valueOf2 = Float.valueOf(1.0f);
        f2405b = e0.t(new k(twoWayConverter, valueOf2), new k(VectorConvertersKt.f2345h, valueOf2), new k(VectorConvertersKt.f2344g, valueOf2), new k(VectorConvertersKt.f2340a, Float.valueOf(0.01f)), new k(VectorConvertersKt.f2346i, valueOf), new k(VectorConvertersKt.e, valueOf), new k(VectorConvertersKt.f2343f, valueOf), new k(VectorConvertersKt.f2342c, Float.valueOf(0.1f)), new k(VectorConvertersKt.d, Float.valueOf(0.1f)));
    }
}
