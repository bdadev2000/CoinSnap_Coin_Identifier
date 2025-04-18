package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;

/* loaded from: classes3.dex */
public final class SideCalculator$Companion$BottomSideCalculator$1 implements SideCalculator {
    @Override // androidx.compose.foundation.layout.SideCalculator
    public final float b(float f2, float f3) {
        return -f3;
    }

    @Override // androidx.compose.foundation.layout.SideCalculator
    public final Insets c(Insets insets, int i2) {
        int i3;
        int i4;
        int i5;
        Insets of;
        i3 = insets.left;
        i4 = insets.top;
        i5 = insets.right;
        of = Insets.of(i3, i4, i5, i2);
        return of;
    }

    @Override // androidx.compose.foundation.layout.SideCalculator
    public final int e(Insets insets) {
        int i2;
        i2 = insets.bottom;
        return i2;
    }

    @Override // androidx.compose.foundation.layout.SideCalculator
    public final long f(long j2) {
        return androidx.compose.ui.geometry.OffsetKt.a(0.0f, Offset.h(j2));
    }

    @Override // androidx.compose.foundation.layout.SideCalculator
    public final long g(long j2, float f2) {
        return VelocityKt.a(0.0f, Velocity.c(j2) + f2);
    }
}
