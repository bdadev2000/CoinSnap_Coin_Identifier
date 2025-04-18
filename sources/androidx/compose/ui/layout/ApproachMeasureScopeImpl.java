package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LayoutModifierNodeCoordinator;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import q0.l;

@StabilityInferred
/* loaded from: classes4.dex */
public final class ApproachMeasureScopeImpl implements ApproachMeasureScope, MeasureScope, LookaheadScope {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutModifierNodeCoordinator f15709a;

    /* renamed from: b, reason: collision with root package name */
    public ApproachLayoutModifierNode f15710b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15711c;

    public ApproachMeasureScopeImpl(LayoutModifierNodeCoordinator layoutModifierNodeCoordinator, ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.f15709a = layoutModifierNodeCoordinator;
        this.f15710b = approachLayoutModifierNode;
    }

    @Override // androidx.compose.ui.unit.Density
    public final int C1(long j2) {
        return this.f15709a.C1(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    public final int F0(float f2) {
        return this.f15709a.F0(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    public final float H(int i2) {
        return this.f15709a.H(i2);
    }

    @Override // androidx.compose.ui.unit.Density
    public final float I(float f2) {
        return f2 / this.f15709a.getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public final float J0(long j2) {
        return this.f15709a.J0(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    public final long L(long j2) {
        return this.f15709a.L(j2);
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public final MeasureResult T(int i2, int i3, Map map, l lVar) {
        return this.f15709a.r0(i2, i3, map, lVar);
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.f15709a.getDensity();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final LayoutDirection getLayoutDirection() {
        return this.f15709a.f16100m.f15960v;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final long o(float f2) {
        return this.f15709a.o(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    public final long p(long j2) {
        return this.f15709a.p(j2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float r(long j2) {
        return this.f15709a.r(j2);
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public final MeasureResult r0(final int i2, final int i3, final Map map, final l lVar) {
        if ((i2 & (-16777216)) == 0 && ((-16777216) & i3) == 0) {
            return new MeasureResult(i2, i3, map, lVar, this) { // from class: androidx.compose.ui.layout.ApproachMeasureScopeImpl$layout$1

                /* renamed from: a, reason: collision with root package name */
                public final int f15712a;

                /* renamed from: b, reason: collision with root package name */
                public final int f15713b;

                /* renamed from: c, reason: collision with root package name */
                public final Map f15714c;
                public final l d = null;
                public final /* synthetic */ l e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ ApproachMeasureScopeImpl f15715f;

                {
                    this.e = lVar;
                    this.f15715f = this;
                    this.f15712a = i2;
                    this.f15713b = i3;
                    this.f15714c = map;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public final int getHeight() {
                    return this.f15713b;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public final int getWidth() {
                    return this.f15712a;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public final Map q() {
                    return this.f15714c;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public final void r() {
                    this.e.invoke(this.f15715f.f15709a.f16056j);
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
        return false;
    }

    @Override // androidx.compose.ui.unit.Density
    public final long u(float f2) {
        return this.f15709a.u(f2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float x1() {
        return this.f15709a.x1();
    }

    @Override // androidx.compose.ui.unit.Density
    public final float y1(float f2) {
        return this.f15709a.getDensity() * f2;
    }
}
