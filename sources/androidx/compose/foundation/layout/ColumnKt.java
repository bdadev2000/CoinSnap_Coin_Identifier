package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;

/* loaded from: classes2.dex */
public final class ColumnKt {

    /* renamed from: a, reason: collision with root package name */
    public static final ColumnMeasurePolicy f3829a = new ColumnMeasurePolicy(Arrangement.f3774c, Alignment.Companion.f14669m);

    public static final ColumnMeasurePolicy a(Arrangement.Vertical vertical, BiasAlignment.Horizontal horizontal, Composer composer, int i2) {
        if (p0.a.g(vertical, Arrangement.f3774c) && p0.a.g(horizontal, Alignment.Companion.f14669m)) {
            composer.J(345962472);
            composer.D();
            return f3829a;
        }
        composer.J(346016319);
        boolean z2 = ((((i2 & 14) ^ 6) > 4 && composer.I(vertical)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.I(horizontal)) || (i2 & 48) == 32);
        Object u2 = composer.u();
        if (z2 || u2 == Composer.Companion.f13690a) {
            u2 = new ColumnMeasurePolicy(vertical, horizontal);
            composer.o(u2);
        }
        ColumnMeasurePolicy columnMeasurePolicy = (ColumnMeasurePolicy) u2;
        composer.D();
        return columnMeasurePolicy;
    }
}
