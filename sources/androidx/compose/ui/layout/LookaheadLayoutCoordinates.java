package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class LookaheadLayoutCoordinates implements LayoutCoordinates {

    /* renamed from: a, reason: collision with root package name */
    public final LookaheadDelegate f15794a;

    public LookaheadLayoutCoordinates(LookaheadDelegate lookaheadDelegate) {
        this.f15794a = lookaheadDelegate;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final boolean B() {
        return this.f15794a.f16067m.k1().f14699n;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long D(long j2) {
        return Offset.k(this.f15794a.f16067m.D(j2), b());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final void E(LayoutCoordinates layoutCoordinates, float[] fArr) {
        this.f15794a.f16067m.E(layoutCoordinates, fArr);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long M(long j2) {
        return this.f15794a.f16067m.M(Offset.k(j2, b()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final void P(float[] fArr) {
        this.f15794a.f16067m.P(fArr);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final Rect Q(LayoutCoordinates layoutCoordinates, boolean z2) {
        return this.f15794a.f16067m.Q(layoutCoordinates, z2);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long U(LayoutCoordinates layoutCoordinates, long j2) {
        boolean z2 = layoutCoordinates instanceof LookaheadLayoutCoordinates;
        LookaheadDelegate lookaheadDelegate = this.f15794a;
        if (!z2) {
            LookaheadDelegate a2 = LookaheadLayoutCoordinatesKt.a(lookaheadDelegate);
            long U = U(a2.f16070p, j2);
            NodeCoordinator nodeCoordinator = a2.f16067m;
            nodeCoordinator.getClass();
            return Offset.k(U, nodeCoordinator.U(layoutCoordinates, 0L));
        }
        LookaheadDelegate lookaheadDelegate2 = ((LookaheadLayoutCoordinates) layoutCoordinates).f15794a;
        lookaheadDelegate2.f16067m.z1();
        LookaheadDelegate h12 = lookaheadDelegate.f16067m.e1(lookaheadDelegate2.f16067m).h1();
        if (h12 != null) {
            long c2 = IntOffset.c(IntOffset.d(lookaheadDelegate2.Q0(h12, false), IntOffsetKt.b(j2)), lookaheadDelegate.Q0(h12, false));
            return OffsetKt.a((int) (c2 >> 32), (int) (c2 & 4294967295L));
        }
        LookaheadDelegate a3 = LookaheadLayoutCoordinatesKt.a(lookaheadDelegate2);
        long d = IntOffset.d(IntOffset.d(lookaheadDelegate2.Q0(a3, false), a3.f16068n), IntOffsetKt.b(j2));
        LookaheadDelegate a4 = LookaheadLayoutCoordinatesKt.a(lookaheadDelegate);
        long c3 = IntOffset.c(d, IntOffset.d(lookaheadDelegate.Q0(a4, false), a4.f16068n));
        long a5 = OffsetKt.a((int) (c3 >> 32), (int) (c3 & 4294967295L));
        NodeCoordinator nodeCoordinator2 = a4.f16067m.f16104q;
        a.p(nodeCoordinator2);
        NodeCoordinator nodeCoordinator3 = a3.f16067m.f16104q;
        a.p(nodeCoordinator3);
        return nodeCoordinator2.U(nodeCoordinator3, a5);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long a() {
        LookaheadDelegate lookaheadDelegate = this.f15794a;
        return IntSizeKt.a(lookaheadDelegate.f15825a, lookaheadDelegate.f15826b);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates a0() {
        LookaheadDelegate h12;
        if (!B()) {
            InlineClassHelperKt.b("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        NodeCoordinator nodeCoordinator = this.f15794a.f16067m.f16100m.B.f16090c.f16104q;
        if (nodeCoordinator == null || (h12 = nodeCoordinator.h1()) == null) {
            return null;
        }
        return h12.f16070p;
    }

    public final long b() {
        LookaheadDelegate lookaheadDelegate = this.f15794a;
        LookaheadDelegate a2 = LookaheadLayoutCoordinatesKt.a(lookaheadDelegate);
        return Offset.j(U(a2.f16070p, 0L), lookaheadDelegate.f16067m.U(a2.f16067m, 0L));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long e0(long j2) {
        return this.f15794a.f16067m.e0(Offset.k(j2, b()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long n(long j2) {
        return Offset.k(this.f15794a.f16067m.n(j2), b());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long v(LayoutCoordinates layoutCoordinates, long j2) {
        return U(layoutCoordinates, j2);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates z() {
        LookaheadDelegate h12;
        if (!B()) {
            InlineClassHelperKt.b("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        NodeCoordinator nodeCoordinator = this.f15794a.f16067m.f16104q;
        if (nodeCoordinator == null || (h12 = nodeCoordinator.h1()) == null) {
            return null;
        }
        return h12.f16070p;
    }
}
