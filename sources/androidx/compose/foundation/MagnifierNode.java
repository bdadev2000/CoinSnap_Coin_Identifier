package androidx.compose.foundation;

import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import d0.b0;
import d1.b;
import kotlin.jvm.internal.e;
import p0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class MagnifierNode extends Modifier.Node implements GlobalPositionAwareModifierNode, DrawModifierNode, SemanticsModifierNode, ObserverModifierNode {
    public PlatformMagnifier A;
    public State C;
    public IntSize E;
    public b F;

    /* renamed from: o, reason: collision with root package name */
    public l f2769o;

    /* renamed from: p, reason: collision with root package name */
    public l f2770p;

    /* renamed from: q, reason: collision with root package name */
    public l f2771q;

    /* renamed from: r, reason: collision with root package name */
    public float f2772r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2773s;

    /* renamed from: t, reason: collision with root package name */
    public long f2774t;

    /* renamed from: u, reason: collision with root package name */
    public float f2775u;

    /* renamed from: v, reason: collision with root package name */
    public float f2776v;
    public boolean w;
    public PlatformMagnifierFactory x;

    /* renamed from: y, reason: collision with root package name */
    public View f2777y;

    /* renamed from: z, reason: collision with root package name */
    public Density f2778z;
    public final ParcelableSnapshotMutableState B = SnapshotStateKt.f(null, SnapshotStateKt.h());
    public long D = 9205357640488583168L;

    public MagnifierNode(l lVar, l lVar2, l lVar3, float f2, boolean z2, long j2, float f3, float f4, boolean z3, PlatformMagnifierFactory platformMagnifierFactory) {
        this.f2769o = lVar;
        this.f2770p = lVar2;
        this.f2771q = lVar3;
        this.f2772r = f2;
        this.f2773s = z2;
        this.f2774t = j2;
        this.f2775u = f3;
        this.f2776v = f4;
        this.w = z3;
        this.x = platformMagnifierFactory;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void B(SemanticsConfiguration semanticsConfiguration) {
        semanticsConfiguration.b(Magnifier_androidKt.f2785a, new MagnifierNode$applySemantics$1(this));
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void C0() {
        ObserverModifierNodeKt.a(this, new MagnifierNode$onObservedReadsChanged$1(this));
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void M(NodeCoordinator nodeCoordinator) {
        this.B.setValue(nodeCoordinator);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void W1() {
        C0();
        this.F = a.a(0, 0, 7);
        e.v(S1(), null, 0, new MagnifierNode$onAttach$1(this, null), 3);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void X1() {
        PlatformMagnifier platformMagnifier = this.A;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        this.A = null;
    }

    public final long e2() {
        if (this.C == null) {
            this.C = SnapshotStateKt.e(new MagnifierNode$anchorPositionInRoot$1(this));
        }
        State state = this.C;
        if (state != null) {
            return ((Offset) state.getValue()).f14913a;
        }
        return 9205357640488583168L;
    }

    public final void f2() {
        PlatformMagnifier platformMagnifier = this.A;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        View view = this.f2777y;
        if (view == null) {
            view = DelegatableNode_androidKt.a(this);
        }
        View view2 = view;
        this.f2777y = view2;
        Density density = this.f2778z;
        if (density == null) {
            density = DelegatableNodeKt.f(this).f15959u;
        }
        Density density2 = density;
        this.f2778z = density2;
        this.A = this.x.a(view2, this.f2773s, this.f2774t, this.f2775u, this.f2776v, this.w, density2, this.f2772r);
        h2();
    }

    public final void g2() {
        Density density = this.f2778z;
        if (density == null) {
            density = DelegatableNodeKt.f(this).f15959u;
            this.f2778z = density;
        }
        long j2 = ((Offset) this.f2769o.invoke(density)).f14913a;
        long j3 = 9205357640488583168L;
        if (!OffsetKt.c(j2) || !OffsetKt.c(e2())) {
            this.D = 9205357640488583168L;
            PlatformMagnifier platformMagnifier = this.A;
            if (platformMagnifier != null) {
                platformMagnifier.dismiss();
                return;
            }
            return;
        }
        this.D = Offset.k(e2(), j2);
        l lVar = this.f2770p;
        if (lVar != null) {
            long j4 = ((Offset) lVar.invoke(density)).f14913a;
            Offset offset = new Offset(j4);
            if (!OffsetKt.c(j4)) {
                offset = null;
            }
            if (offset != null) {
                j3 = Offset.k(e2(), offset.f14913a);
            }
        }
        long j5 = j3;
        if (this.A == null) {
            f2();
        }
        PlatformMagnifier platformMagnifier2 = this.A;
        if (platformMagnifier2 != null) {
            platformMagnifier2.b(this.D, j5, this.f2772r);
        }
        h2();
    }

    public final void h2() {
        Density density;
        PlatformMagnifier platformMagnifier = this.A;
        if (platformMagnifier == null || (density = this.f2778z) == null || IntSize.a(platformMagnifier.a(), this.E)) {
            return;
        }
        l lVar = this.f2771q;
        if (lVar != null) {
            lVar.invoke(new DpSize(density.p(IntSizeKt.c(platformMagnifier.a()))));
        }
        this.E = new IntSize(platformMagnifier.a());
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void z(ContentDrawScope contentDrawScope) {
        contentDrawScope.P1();
        b bVar = this.F;
        if (bVar != null) {
            bVar.b(b0.f30125a);
        }
    }
}
