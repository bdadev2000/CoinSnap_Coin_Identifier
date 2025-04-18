package androidx.compose.material.ripple;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;

/* loaded from: classes4.dex */
public final class RippleAnimationKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f7435a = 10;

    public static final float a(Density density, boolean z2, long j2) {
        float e = Offset.e(OffsetKt.a(Size.d(j2), Size.b(j2))) / 2.0f;
        return z2 ? e + density.y1(f7435a) : e;
    }
}
