package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;

/* loaded from: classes2.dex */
public final class RowKt {

    /* renamed from: a, reason: collision with root package name */
    public static final RowMeasurePolicy f4087a = new RowMeasurePolicy(Arrangement.f3772a, Alignment.Companion.f14666j);

    public static final RowMeasurePolicy a(Arrangement.Horizontal horizontal, BiasAlignment.Vertical vertical, Composer composer, int i2) {
        if (p0.a.g(horizontal, Arrangement.f3772a) && p0.a.g(vertical, Alignment.Companion.f14666j)) {
            composer.J(-849081669);
            composer.D();
            return f4087a;
        }
        composer.J(-849030798);
        boolean z2 = ((((i2 & 14) ^ 6) > 4 && composer.I(horizontal)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.I(vertical)) || (i2 & 48) == 32);
        Object u2 = composer.u();
        if (z2 || u2 == Composer.Companion.f13690a) {
            u2 = new RowMeasurePolicy(horizontal, vertical);
            composer.o(u2);
        }
        RowMeasurePolicy rowMeasurePolicy = (RowMeasurePolicy) u2;
        composer.D();
        return rowMeasurePolicy;
    }
}
