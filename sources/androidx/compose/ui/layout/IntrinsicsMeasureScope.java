package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import q0.l;

@StabilityInferred
/* loaded from: classes4.dex */
public final class IntrinsicsMeasureScope implements MeasureScope, IntrinsicMeasureScope {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutDirection f15735a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntrinsicMeasureScope f15736b;

    public IntrinsicsMeasureScope(IntrinsicMeasureScope intrinsicMeasureScope, LayoutDirection layoutDirection) {
        this.f15735a = layoutDirection;
        this.f15736b = intrinsicMeasureScope;
    }

    @Override // androidx.compose.ui.unit.Density
    public final int C1(long j2) {
        return this.f15736b.C1(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    public final int F0(float f2) {
        return this.f15736b.F0(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    public final float H(int i2) {
        return this.f15736b.H(i2);
    }

    @Override // androidx.compose.ui.unit.Density
    public final float I(float f2) {
        return this.f15736b.I(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    public final float J0(long j2) {
        return this.f15736b.J0(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    public final long L(long j2) {
        return this.f15736b.L(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.f15736b.getDensity();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final LayoutDirection getLayoutDirection() {
        return this.f15735a;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final long o(float f2) {
        return this.f15736b.o(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    public final long p(long j2) {
        return this.f15736b.p(j2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float r(long j2) {
        return this.f15736b.r(j2);
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public final MeasureResult r0(final int i2, final int i3, final Map map, l lVar) {
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if ((i2 & (-16777216)) == 0 && ((-16777216) & i3) == 0) {
            return new MeasureResult() { // from class: androidx.compose.ui.layout.IntrinsicsMeasureScope$layout$1
                public final /* synthetic */ l d = null;

                @Override // androidx.compose.ui.layout.MeasureResult
                public final int getHeight() {
                    return i3;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public final int getWidth() {
                    return i2;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public final Map q() {
                    return map;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public final void r() {
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public final l s() {
                    return this.d;
                }
            };
        }
        InlineClassHelperKt.b("Size(" + i2 + " x " + i3 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final boolean t0() {
        return this.f15736b.t0();
    }

    @Override // androidx.compose.ui.unit.Density
    public final long u(float f2) {
        return this.f15736b.u(f2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float x1() {
        return this.f15736b.x1();
    }

    @Override // androidx.compose.ui.unit.Density
    public final float y1(float f2) {
        return this.f15736b.y1(f2);
    }
}
