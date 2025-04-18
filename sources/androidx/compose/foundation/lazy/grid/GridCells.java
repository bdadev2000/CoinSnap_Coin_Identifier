package androidx.compose.foundation.lazy.grid;

import android.support.v4.media.d;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;

@Stable
/* loaded from: classes.dex */
public interface GridCells {

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class Adaptive implements GridCells {
        @Override // androidx.compose.foundation.lazy.grid.GridCells
        public final ArrayList a(Density density, int i2, int i3) {
            return LazyGridDslKt.b(i2, Math.max((i2 + i3) / (density.F0(0.0f) + i3), 1), i3);
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
    public static final class Fixed implements GridCells {

        /* renamed from: a, reason: collision with root package name */
        public final int f4446a;

        public Fixed(int i2) {
            this.f4446a = i2;
            if (i2 <= 0) {
                throw new IllegalArgumentException(d.j("Provided count ", i2, " should be larger than zero").toString());
            }
        }

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        public final ArrayList a(Density density, int i2, int i3) {
            return LazyGridDslKt.b(i2, this.f4446a, i3);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Fixed) {
                if (this.f4446a == ((Fixed) obj).f4446a) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return -this.f4446a;
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class FixedSize implements GridCells {
        @Override // androidx.compose.foundation.lazy.grid.GridCells
        public final ArrayList a(Density density, int i2, int i3) {
            int F0 = density.F0(0.0f);
            int i4 = F0 + i3;
            int i5 = i3 + i2;
            if (i4 >= i5) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(Integer.valueOf(i2));
                return arrayList;
            }
            int i6 = i5 / i4;
            ArrayList arrayList2 = new ArrayList(i6);
            for (int i7 = 0; i7 < i6; i7++) {
                arrayList2.add(Integer.valueOf(F0));
            }
            return arrayList2;
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

    ArrayList a(Density density, int i2, int i3);
}
