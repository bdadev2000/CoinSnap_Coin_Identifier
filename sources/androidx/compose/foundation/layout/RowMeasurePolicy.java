package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import com.google.android.gms.common.api.Api;
import e0.x;
import java.util.List;

@StabilityInferred
/* loaded from: classes3.dex */
public final class RowMeasurePolicy implements MeasurePolicy, RowColumnMeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final Arrangement.Horizontal f4088a;

    /* renamed from: b, reason: collision with root package name */
    public final Alignment.Vertical f4089b;

    public RowMeasurePolicy(Arrangement.Horizontal horizontal, BiasAlignment.Vertical vertical) {
        this.f4088a = horizontal;
        this.f4089b = vertical;
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public final long a(int i2, int i3, int i4, int i5, boolean z2) {
        RowMeasurePolicy rowMeasurePolicy = RowKt.f4087a;
        return !z2 ? ConstraintsKt.a(i2, i4, i3, i5) : Constraints.Companion.b(i2, i4, i3, i5);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public final void b(int i2, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        this.f4088a.c(measureScope, i2, iArr, measureScope.getLayoutDirection(), iArr2);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public final MeasureResult c(Placeable[] placeableArr, MeasureScope measureScope, int i2, int[] iArr, int i3, int i4, int[] iArr2, int i5, int i6, int i7) {
        return measureScope.T(i3, i4, x.f30219a, new RowMeasurePolicy$placeHelper$1$1(placeableArr, this, i4, i2, iArr));
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public final int d(Placeable placeable) {
        return placeable.f15825a;
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public final int e(Placeable placeable) {
        return placeable.f15826b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RowMeasurePolicy)) {
            return false;
        }
        RowMeasurePolicy rowMeasurePolicy = (RowMeasurePolicy) obj;
        return p0.a.g(this.f4088a, rowMeasurePolicy.f4088a) && p0.a.g(this.f4089b, rowMeasurePolicy.f4089b);
    }

    public final int hashCode() {
        return this.f4089b.hashCode() + (this.f4088a.hashCode() * 31);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        int F0 = intrinsicMeasureScope.F0(this.f4088a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * F0, i2);
        int size = list.size();
        int i3 = 0;
        float f2 = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i4);
            float c2 = RowColumnImplKt.c(RowColumnImplKt.a(intrinsicMeasurable));
            if (c2 == 0.0f) {
                int min2 = Math.min(intrinsicMeasurable.S(Api.BaseClientBuilder.API_PRIORITY_OTHER), i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i2 - min);
                min += min2;
                i3 = Math.max(i3, intrinsicMeasurable.s(min2));
            } else if (c2 > 0.0f) {
                f2 += c2;
            }
        }
        int round = f2 == 0.0f ? 0 : i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i2 - min, 0) / f2);
        int size2 = list.size();
        for (int i5 = 0; i5 < size2; i5++) {
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list.get(i5);
            float c3 = RowColumnImplKt.c(RowColumnImplKt.a(intrinsicMeasurable2));
            if (c3 > 0.0f) {
                i3 = Math.max(i3, intrinsicMeasurable2.s(round != Integer.MAX_VALUE ? Math.round(round * c3) : Integer.MAX_VALUE));
            }
        }
        return i3;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        int F0 = intrinsicMeasureScope.F0(this.f4088a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        float f2 = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i5);
            float c2 = RowColumnImplKt.c(RowColumnImplKt.a(intrinsicMeasurable));
            int S = intrinsicMeasurable.S(i2);
            if (c2 == 0.0f) {
                i4 += S;
            } else if (c2 > 0.0f) {
                f2 += c2;
                i3 = Math.max(i3, Math.round(S / c2));
            }
        }
        return ((list.size() - 1) * F0) + Math.round(i3 * f2) + i4;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo0measure3p2s80s(MeasureScope measureScope, List list, long j2) {
        return RowColumnMeasurePolicyKt.a(this, Constraints.k(j2), Constraints.j(j2), Constraints.i(j2), Constraints.h(j2), measureScope.F0(this.f4088a.a()), measureScope, list, new Placeable[list.size()], 0, list.size(), null, 0);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        int F0 = intrinsicMeasureScope.F0(this.f4088a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * F0, i2);
        int size = list.size();
        int i3 = 0;
        float f2 = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i4);
            float c2 = RowColumnImplKt.c(RowColumnImplKt.a(intrinsicMeasurable));
            if (c2 == 0.0f) {
                int min2 = Math.min(intrinsicMeasurable.S(Api.BaseClientBuilder.API_PRIORITY_OTHER), i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i2 - min);
                min += min2;
                i3 = Math.max(i3, intrinsicMeasurable.K(min2));
            } else if (c2 > 0.0f) {
                f2 += c2;
            }
        }
        int round = f2 == 0.0f ? 0 : i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i2 - min, 0) / f2);
        int size2 = list.size();
        for (int i5 = 0; i5 < size2; i5++) {
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list.get(i5);
            float c3 = RowColumnImplKt.c(RowColumnImplKt.a(intrinsicMeasurable2));
            if (c3 > 0.0f) {
                i3 = Math.max(i3, intrinsicMeasurable2.K(round != Integer.MAX_VALUE ? Math.round(round * c3) : Integer.MAX_VALUE));
            }
        }
        return i3;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        int F0 = intrinsicMeasureScope.F0(this.f4088a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        float f2 = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i5);
            float c2 = RowColumnImplKt.c(RowColumnImplKt.a(intrinsicMeasurable));
            int R = intrinsicMeasurable.R(i2);
            if (c2 == 0.0f) {
                i4 += R;
            } else if (c2 > 0.0f) {
                f2 += c2;
                i3 = Math.max(i3, Math.round(R / c2));
            }
        }
        return ((list.size() - 1) * F0) + Math.round(i3 * f2) + i4;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f4088a + ", verticalAlignment=" + this.f4089b + ')';
    }
}
