package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;

/* loaded from: classes4.dex */
public final class OrientationIndependentConstraints {
    public static long a(long j2, LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.f4037a;
        return ConstraintsKt.a(layoutOrientation == layoutOrientation2 ? Constraints.k(j2) : Constraints.j(j2), layoutOrientation == layoutOrientation2 ? Constraints.i(j2) : Constraints.h(j2), layoutOrientation == layoutOrientation2 ? Constraints.j(j2) : Constraints.k(j2), layoutOrientation == layoutOrientation2 ? Constraints.h(j2) : Constraints.i(j2));
    }

    public static long b(long j2, int i2) {
        return ConstraintsKt.a((i2 & 1) != 0 ? Constraints.k(j2) : 0, (i2 & 2) != 0 ? Constraints.i(j2) : 0, (i2 & 4) != 0 ? Constraints.j(j2) : 0, (i2 & 8) != 0 ? Constraints.h(j2) : 0);
    }

    public static final long c(long j2, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.f4037a ? ConstraintsKt.a(Constraints.k(j2), Constraints.i(j2), Constraints.j(j2), Constraints.h(j2)) : ConstraintsKt.a(Constraints.j(j2), Constraints.h(j2), Constraints.k(j2), Constraints.i(j2));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OrientationIndependentConstraints)) {
            return false;
        }
        ((OrientationIndependentConstraints) obj).getClass();
        return Constraints.c(0L, 0L);
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        return "OrientationIndependentConstraints(value=" + ((Object) Constraints.m(0L)) + ')';
    }
}
