package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;

@Stable
/* loaded from: classes.dex */
public interface StaggeredGridCells {

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class Adaptive implements StaggeredGridCells {
        @Override // androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
        public final int[] a(Density density, int i2, int i3) {
            return LazyStaggeredGridCellsKt.a(i2, Math.max((i2 + i3) / (density.F0(0.0f) + i3), 1), i3);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Adaptive) {
                ((Adaptive) obj).getClass();
                if (Dp.a(0.0f, 0.0f)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(0.0f);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class Fixed implements StaggeredGridCells {
        @Override // androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
        public final int[] a(Density density, int i2, int i3) {
            return LazyStaggeredGridCellsKt.a(i2, 0, i3);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Fixed)) {
                return false;
            }
            ((Fixed) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class FixedSize implements StaggeredGridCells {
        @Override // androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
        public final int[] a(Density density, int i2, int i3) {
            int F0 = density.F0(0.0f);
            int i4 = F0 + i3;
            int i5 = i3 + i2;
            if (i4 >= i5) {
                return new int[]{i2};
            }
            int i6 = i5 / i4;
            int[] iArr = new int[i6];
            for (int i7 = 0; i7 < i6; i7++) {
                iArr[i7] = F0;
            }
            return iArr;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof FixedSize) {
                ((FixedSize) obj).getClass();
                if (Dp.a(0.0f, 0.0f)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(0.0f);
        }
    }

    int[] a(Density density, int i2, int i3);
}
