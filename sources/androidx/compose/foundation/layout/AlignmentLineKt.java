package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import e0.x;

/* loaded from: classes4.dex */
public final class AlignmentLineKt {
    public static final MeasureResult a(MeasureScope measureScope, AlignmentLine alignmentLine, float f2, float f3, Measurable measurable, long j2) {
        boolean z2 = alignmentLine instanceof HorizontalAlignmentLine;
        Placeable V = measurable.V(z2 ? Constraints.b(j2, 0, 0, 0, 0, 11) : Constraints.b(j2, 0, 0, 0, 0, 14));
        int Z = V.Z(alignmentLine);
        if (Z == Integer.MIN_VALUE) {
            Z = 0;
        }
        int i2 = z2 ? V.f15826b : V.f15825a;
        int h2 = (z2 ? Constraints.h(j2) : Constraints.i(j2)) - i2;
        int A = p0.a.A((!Dp.a(f2, Float.NaN) ? measureScope.F0(f2) : 0) - Z, 0, h2);
        int A2 = p0.a.A(((!Dp.a(f3, Float.NaN) ? measureScope.F0(f3) : 0) - i2) + Z, 0, h2 - A);
        int max = z2 ? V.f15825a : Math.max(V.f15825a + A + A2, Constraints.k(j2));
        int max2 = z2 ? Math.max(V.f15826b + A + A2, Constraints.j(j2)) : V.f15826b;
        return measureScope.T(max, max2, x.f30219a, new AlignmentLineKt$alignmentLineOffsetMeasure$1(alignmentLine, f2, A, max, A2, V, max2));
    }

    public static Modifier b(HorizontalAlignmentLine horizontalAlignmentLine, float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            f3 = Float.NaN;
        }
        return new AlignmentLineOffsetDpElement(horizontalAlignmentLine, f2, f3);
    }

    public static final Modifier c(float f2, float f3) {
        boolean a2 = Dp.a(f2, Float.NaN);
        Modifier modifier = Modifier.Companion.f14687a;
        Modifier b2 = !a2 ? b(androidx.compose.ui.layout.AlignmentLineKt.f15692a, f2, 0.0f, 4) : modifier;
        if (!Dp.a(f3, Float.NaN)) {
            modifier = b(androidx.compose.ui.layout.AlignmentLineKt.f15693b, 0.0f, f3, 2);
        }
        return b2.T0(modifier);
    }
}
