package androidx.compose.ui.layout;

import androidx.compose.ui.unit.IntSizeKt;
import q0.l;

/* loaded from: classes3.dex */
final class FixedSizeIntrinsicsPlaceable extends Placeable {
    public FixedSizeIntrinsicsPlaceable(int i2, int i3) {
        o0(IntSizeKt.a(i2, i3));
    }

    @Override // androidx.compose.ui.layout.Measured
    public final int Z(AlignmentLine alignmentLine) {
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.layout.Placeable
    public final void n0(long j2, float f2, l lVar) {
    }
}
