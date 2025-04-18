package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes3.dex */
final class WindowInsetsSizeKt$windowInsetsEndWidth$2 extends r implements q {
    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        WindowInsets windowInsets = (WindowInsets) obj;
        LayoutDirection layoutDirection = (LayoutDirection) obj2;
        Density density = (Density) obj3;
        return Integer.valueOf(layoutDirection == LayoutDirection.f17495b ? windowInsets.d(density, layoutDirection) : windowInsets.b(density, layoutDirection));
    }
}
