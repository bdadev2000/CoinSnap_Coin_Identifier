package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import d0.b0;
import java.util.LinkedHashMap;
import q0.l;

@StabilityInferred
/* loaded from: classes4.dex */
public abstract class LookaheadDelegate extends LookaheadCapablePlaceable implements Measurable {

    /* renamed from: m, reason: collision with root package name */
    public final NodeCoordinator f16067m;

    /* renamed from: o, reason: collision with root package name */
    public LinkedHashMap f16069o;

    /* renamed from: q, reason: collision with root package name */
    public MeasureResult f16071q;

    /* renamed from: n, reason: collision with root package name */
    public long f16068n = 0;

    /* renamed from: p, reason: collision with root package name */
    public final LookaheadLayoutCoordinates f16070p = new LookaheadLayoutCoordinates(this);

    /* renamed from: r, reason: collision with root package name */
    public final LinkedHashMap f16072r = new LinkedHashMap();

    public LookaheadDelegate(NodeCoordinator nodeCoordinator) {
        this.f16067m = nodeCoordinator;
    }

    public static final void M0(LookaheadDelegate lookaheadDelegate, MeasureResult measureResult) {
        b0 b0Var;
        LinkedHashMap linkedHashMap;
        if (measureResult != null) {
            lookaheadDelegate.getClass();
            lookaheadDelegate.o0(IntSizeKt.a(measureResult.getWidth(), measureResult.getHeight()));
            b0Var = b0.f30125a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            lookaheadDelegate.o0(0L);
        }
        if (!p0.a.g(lookaheadDelegate.f16071q, measureResult) && measureResult != null && ((((linkedHashMap = lookaheadDelegate.f16069o) != null && !linkedHashMap.isEmpty()) || (!measureResult.q().isEmpty())) && !p0.a.g(measureResult.q(), lookaheadDelegate.f16069o))) {
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = lookaheadDelegate.f16067m.f16100m.C.f15996s;
            p0.a.p(lookaheadPassDelegate);
            lookaheadPassDelegate.f16011s.g();
            LinkedHashMap linkedHashMap2 = lookaheadDelegate.f16069o;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                lookaheadDelegate.f16069o = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(measureResult.q());
        }
        lookaheadDelegate.f16071q = measureResult;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final MeasureResult C0() {
        MeasureResult measureResult = this.f16071q;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final LookaheadCapablePlaceable D0() {
        NodeCoordinator nodeCoordinator = this.f16067m.f16104q;
        if (nodeCoordinator != null) {
            return nodeCoordinator.h1();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final long E0() {
        return this.f16068n;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    public final LayoutNode H1() {
        return this.f16067m.f16100m;
    }

    public int K(int i2) {
        NodeCoordinator nodeCoordinator = this.f16067m.f16103p;
        p0.a.p(nodeCoordinator);
        LookaheadDelegate h12 = nodeCoordinator.h1();
        p0.a.p(h12);
        return h12.K(i2);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final void L0() {
        n0(this.f16068n, 0.0f, null);
    }

    public void O0() {
        C0().r();
    }

    public final void P0(long j2) {
        if (!IntOffset.b(this.f16068n, j2)) {
            this.f16068n = j2;
            NodeCoordinator nodeCoordinator = this.f16067m;
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = nodeCoordinator.f16100m.C.f15996s;
            if (lookaheadPassDelegate != null) {
                lookaheadPassDelegate.u0();
            }
            LookaheadCapablePlaceable.K0(nodeCoordinator);
        }
        if (this.f16055i) {
            return;
        }
        s0(new PlaceableResult(C0(), this));
    }

    public final long Q0(LookaheadDelegate lookaheadDelegate, boolean z2) {
        long j2 = 0;
        LookaheadDelegate lookaheadDelegate2 = this;
        while (!p0.a.g(lookaheadDelegate2, lookaheadDelegate)) {
            if (!lookaheadDelegate2.f16053g || !z2) {
                j2 = IntOffset.d(j2, lookaheadDelegate2.f16068n);
            }
            NodeCoordinator nodeCoordinator = lookaheadDelegate2.f16067m.f16104q;
            p0.a.p(nodeCoordinator);
            lookaheadDelegate2 = nodeCoordinator.h1();
            p0.a.p(lookaheadDelegate2);
        }
        return j2;
    }

    public int R(int i2) {
        NodeCoordinator nodeCoordinator = this.f16067m.f16103p;
        p0.a.p(nodeCoordinator);
        LookaheadDelegate h12 = nodeCoordinator.h1();
        p0.a.p(h12);
        return h12.R(i2);
    }

    public int S(int i2) {
        NodeCoordinator nodeCoordinator = this.f16067m.f16103p;
        p0.a.p(nodeCoordinator);
        LookaheadDelegate h12 = nodeCoordinator.h1();
        p0.a.p(h12);
        return h12.S(i2);
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.f16067m.getDensity();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final LayoutDirection getLayoutDirection() {
        return this.f16067m.f16100m.f15960v;
    }

    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public final Object m() {
        return this.f16067m.m();
    }

    @Override // androidx.compose.ui.layout.Placeable
    public final void n0(long j2, float f2, l lVar) {
        P0(j2);
        if (this.f16054h) {
            return;
        }
        O0();
    }

    public int s(int i2) {
        NodeCoordinator nodeCoordinator = this.f16067m.f16103p;
        p0.a.p(nodeCoordinator);
        LookaheadDelegate h12 = nodeCoordinator.h1();
        p0.a.p(h12);
        return h12.s(i2);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.layout.IntrinsicMeasureScope
    public final boolean t0() {
        return true;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final LookaheadCapablePlaceable u0() {
        NodeCoordinator nodeCoordinator = this.f16067m.f16103p;
        if (nodeCoordinator != null) {
            return nodeCoordinator.h1();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final LayoutCoordinates x0() {
        return this.f16070p;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float x1() {
        return this.f16067m.x1();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final boolean z0() {
        return this.f16071q != null;
    }
}
