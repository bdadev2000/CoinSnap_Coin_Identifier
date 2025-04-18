package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;

/* loaded from: classes3.dex */
public final class SideCalculator$Companion$RightSideCalculator$1 implements SideCalculator {
    @Override // androidx.compose.foundation.layout.SideCalculator
    public final float b(float f2, float f3) {
        return -f2;
    }

    @Override // androidx.compose.foundation.layout.SideCalculator
    public final Insets c(Insets insets, int i2) {
        int i3;
        int i4;
        int i5;
        Insets of;
        i3 = insets.left;
        i4 = insets.top;
        i5 = insets.bottom;
        of = Insets.of(i3, i4, i2, i5);
        return of;
    }

    @Override // androidx.compose.foundation.layout.SideCalculator
    public final int e(Insets insets) {
        int i2;
        i2 = insets.right;
        return i2;
    }

    @Override // androidx.compose.foundation.layout.SideCalculator
    public final long f(long j2) {
        return androidx.compose.ui.geometry.OffsetKt.a(Offset.g(j2), 0.0f);
    }

    @Override // androidx.compose.foundation.layout.SideCalculator
    public final long g(long j2, float f2) {
        return VelocityKt.a(Velocity.b(j2) + f2, 0.0f);
    }
}
