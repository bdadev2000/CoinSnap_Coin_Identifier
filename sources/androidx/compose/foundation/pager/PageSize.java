package androidx.compose.foundation.pager;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;

@Stable
/* loaded from: classes3.dex */
public interface PageSize {

    @StabilityInferred
    /* loaded from: classes3.dex */
    public static final class Fill implements PageSize {

        /* renamed from: a, reason: collision with root package name */
        public static final Fill f5137a = new Object();

        @Override // androidx.compose.foundation.pager.PageSize
        public final int a(Density density, int i2, int i3) {
            return i2;
        }
    }

    @StabilityInferred
    /* loaded from: classes3.dex */
    public static final class Fixed implements PageSize {
        @Override // androidx.compose.foundation.pager.PageSize
        public final int a(Density density, int i2, int i3) {
            return density.F0(0.0f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Fixed)) {
                return false;
            }
            ((Fixed) obj).getClass();
            return Dp.a(0.0f, 0.0f);
        }

        public final int hashCode() {
            return Float.hashCode(0.0f);
        }
    }

    int a(Density density, int i2, int i3);
}
