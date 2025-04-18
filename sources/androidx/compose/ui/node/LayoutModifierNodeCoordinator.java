package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScopeImpl;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import q0.l;

@StabilityInferred
/* loaded from: classes2.dex */
public final class LayoutModifierNodeCoordinator extends NodeCoordinator {
    public static final AndroidPaint R;
    public LayoutModifierNode N;
    public Constraints O;
    public LookaheadDelegate P;
    public ApproachMeasureScopeImpl Q;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    /* loaded from: classes2.dex */
    public final class LookaheadDelegateForLayoutModifierNode extends LookaheadDelegate {
        public LookaheadDelegateForLayoutModifierNode() {
            super(LayoutModifierNodeCoordinator.this);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int K(int i2) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.N;
            NodeCoordinator nodeCoordinator = layoutModifierNodeCoordinator.f16103p;
            p0.a.p(nodeCoordinator);
            LookaheadDelegate h12 = nodeCoordinator.h1();
            p0.a.p(h12);
            return layoutModifierNode.A(this, h12, i2);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int R(int i2) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.N;
            NodeCoordinator nodeCoordinator = layoutModifierNodeCoordinator.f16103p;
            p0.a.p(nodeCoordinator);
            LookaheadDelegate h12 = nodeCoordinator.h1();
            p0.a.p(h12);
            return layoutModifierNode.E(this, h12, i2);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int S(int i2) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.N;
            NodeCoordinator nodeCoordinator = layoutModifierNodeCoordinator.f16103p;
            p0.a.p(nodeCoordinator);
            LookaheadDelegate h12 = nodeCoordinator.h1();
            p0.a.p(h12);
            return layoutModifierNode.K(this, h12, i2);
        }

        @Override // androidx.compose.ui.layout.Measurable
        public final Placeable V(long j2) {
            p0(j2);
            Constraints constraints = new Constraints(j2);
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            layoutModifierNodeCoordinator.O = constraints;
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.N;
            NodeCoordinator nodeCoordinator = layoutModifierNodeCoordinator.f16103p;
            p0.a.p(nodeCoordinator);
            LookaheadDelegate h12 = nodeCoordinator.h1();
            p0.a.p(h12);
            LookaheadDelegate.M0(this, layoutModifierNode.m(this, h12, j2));
            return this;
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public final int q0(AlignmentLine alignmentLine) {
            int a2 = LayoutModifierNodeCoordinatorKt.a(this, alignmentLine);
            this.f16072r.put(alignmentLine, Integer.valueOf(a2));
            return a2;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int s(int i2) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.N;
            NodeCoordinator nodeCoordinator = layoutModifierNodeCoordinator.f16103p;
            p0.a.p(nodeCoordinator);
            LookaheadDelegate h12 = nodeCoordinator.h1();
            p0.a.p(h12);
            return layoutModifierNode.q(this, h12, i2);
        }
    }

    static {
        AndroidPaint a2 = AndroidPaint_androidKt.a();
        a2.v(Color.f14959f);
        a2.D(1.0f);
        a2.C(1);
        R = a2;
    }

    public LayoutModifierNodeCoordinator(LayoutNode layoutNode, LayoutModifierNode layoutModifierNode) {
        super(layoutNode);
        this.N = layoutModifierNode;
        this.P = layoutNode.f15944f != null ? new LookaheadDelegateForLayoutModifierNode() : null;
        this.Q = (layoutModifierNode.z0().f14690c & 512) != 0 ? new ApproachMeasureScopeImpl(this, (ApproachLayoutModifierNode) layoutModifierNode) : null;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int K(int i2) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.Q;
        if (approachMeasureScopeImpl != null) {
            ApproachLayoutModifierNode approachLayoutModifierNode = approachMeasureScopeImpl.f15710b;
            NodeCoordinator nodeCoordinator = this.f16103p;
            p0.a.p(nodeCoordinator);
            return approachLayoutModifierNode.q0(approachMeasureScopeImpl, nodeCoordinator, i2);
        }
        LayoutModifierNode layoutModifierNode = this.N;
        NodeCoordinator nodeCoordinator2 = this.f16103p;
        p0.a.p(nodeCoordinator2);
        return layoutModifierNode.A(this, nodeCoordinator2, i2);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final void M1(Canvas canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator nodeCoordinator = this.f16103p;
        p0.a.p(nodeCoordinator);
        nodeCoordinator.T0(canvas, graphicsLayer);
        if (LayoutNodeKt.a(this.f16100m).getShowLayoutBounds()) {
            V0(canvas, R);
        }
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int R(int i2) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.Q;
        if (approachMeasureScopeImpl != null) {
            ApproachLayoutModifierNode approachLayoutModifierNode = approachMeasureScopeImpl.f15710b;
            NodeCoordinator nodeCoordinator = this.f16103p;
            p0.a.p(nodeCoordinator);
            return approachLayoutModifierNode.K0(approachMeasureScopeImpl, nodeCoordinator, i2);
        }
        LayoutModifierNode layoutModifierNode = this.N;
        NodeCoordinator nodeCoordinator2 = this.f16103p;
        p0.a.p(nodeCoordinator2);
        return layoutModifierNode.E(this, nodeCoordinator2, i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int S(int i2) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.Q;
        if (approachMeasureScopeImpl != null) {
            ApproachLayoutModifierNode approachLayoutModifierNode = approachMeasureScopeImpl.f15710b;
            NodeCoordinator nodeCoordinator = this.f16103p;
            p0.a.p(nodeCoordinator);
            return approachLayoutModifierNode.s0(approachMeasureScopeImpl, nodeCoordinator, i2);
        }
        LayoutModifierNode layoutModifierNode = this.N;
        NodeCoordinator nodeCoordinator2 = this.f16103p;
        p0.a.p(nodeCoordinator2);
        return layoutModifierNode.K(this, nodeCoordinator2, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        if (r9 == r1.f15826b) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    @Override // androidx.compose.ui.layout.Measurable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.ui.layout.Placeable V(long r8) {
        /*
            r7 = this;
            boolean r0 = r7.f16102o
            if (r0 == 0) goto L17
            androidx.compose.ui.unit.Constraints r8 = r7.O
            if (r8 == 0) goto Lb
            long r8 = r8.f17480a
            goto L17
        Lb:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Lookahead constraints cannot be null in approach pass."
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L17:
            r7.p0(r8)
            androidx.compose.ui.layout.ApproachMeasureScopeImpl r0 = r7.Q
            if (r0 == 0) goto Lbb
            androidx.compose.ui.layout.ApproachLayoutModifierNode r1 = r0.f15710b
            androidx.compose.ui.node.LayoutModifierNodeCoordinator r2 = r0.f15709a
            androidx.compose.ui.node.LookaheadDelegate r2 = r2.P
            p0.a.p(r2)
            androidx.compose.ui.layout.MeasureResult r2 = r2.C0()
            int r3 = r2.getWidth()
            int r2 = r2.getHeight()
            long r2 = androidx.compose.ui.unit.IntSizeKt.a(r3, r2)
            boolean r2 = r1.Q0(r2)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L4f
            androidx.compose.ui.unit.Constraints r2 = r7.O
            boolean r5 = r2 instanceof androidx.compose.ui.unit.Constraints
            if (r5 != 0) goto L46
            goto L4f
        L46:
            long r5 = r2.f17480a
            int r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r2 == 0) goto L4d
            goto L4f
        L4d:
            r2 = r4
            goto L50
        L4f:
            r2 = r3
        L50:
            r0.f15711c = r2
            if (r2 != 0) goto L5b
            androidx.compose.ui.node.NodeCoordinator r2 = r7.f16103p
            p0.a.p(r2)
            r2.f16102o = r3
        L5b:
            androidx.compose.ui.node.NodeCoordinator r2 = r7.f16103p
            p0.a.p(r2)
            androidx.compose.ui.layout.MeasureResult r8 = r1.L0(r0, r2, r8)
            androidx.compose.ui.node.NodeCoordinator r9 = r7.f16103p
            p0.a.p(r9)
            r9.f16102o = r4
            int r9 = r8.getWidth()
            androidx.compose.ui.node.LookaheadDelegate r1 = r7.P
            p0.a.p(r1)
            int r1 = r1.f15825a
            if (r9 != r1) goto L86
            int r9 = r8.getHeight()
            androidx.compose.ui.node.LookaheadDelegate r1 = r7.P
            p0.a.p(r1)
            int r1 = r1.f15826b
            if (r9 != r1) goto L86
            goto L87
        L86:
            r3 = r4
        L87:
            boolean r9 = r0.f15711c
            if (r9 != 0) goto Lc6
            androidx.compose.ui.node.NodeCoordinator r9 = r7.f16103p
            p0.a.p(r9)
            long r0 = r9.f15827c
            androidx.compose.ui.node.NodeCoordinator r9 = r7.f16103p
            p0.a.p(r9)
            androidx.compose.ui.node.LookaheadDelegate r9 = r9.h1()
            if (r9 == 0) goto Lab
            int r2 = r9.f15825a
            int r9 = r9.f15826b
            long r4 = androidx.compose.ui.unit.IntSizeKt.a(r2, r9)
            androidx.compose.ui.unit.IntSize r9 = new androidx.compose.ui.unit.IntSize
            r9.<init>(r4)
            goto Lac
        Lab:
            r9 = 0
        Lac:
            boolean r9 = androidx.compose.ui.unit.IntSize.a(r0, r9)
            if (r9 == 0) goto Lc6
            if (r3 != 0) goto Lc6
            androidx.compose.ui.node.LayoutModifierNodeCoordinator$measure$1$1$1$1 r9 = new androidx.compose.ui.node.LayoutModifierNodeCoordinator$measure$1$1$1$1
            r9.<init>(r7)
            r8 = r9
            goto Lc6
        Lbb:
            androidx.compose.ui.node.LayoutModifierNode r0 = r7.N
            androidx.compose.ui.node.NodeCoordinator r1 = r7.f16103p
            p0.a.p(r1)
            androidx.compose.ui.layout.MeasureResult r8 = r0.m(r7, r1, r8)
        Lc6:
            r7.Q1(r8)
            r7.G1()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutModifierNodeCoordinator.V(long):androidx.compose.ui.layout.Placeable");
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final void X0() {
        if (this.P == null) {
            this.P = new LookaheadDelegateForLayoutModifierNode();
        }
    }

    public final void Y1() {
        boolean z2;
        if (this.f16054h) {
            return;
        }
        J1();
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.Q;
        if (approachMeasureScopeImpl != null) {
            ApproachLayoutModifierNode approachLayoutModifierNode = approachMeasureScopeImpl.f15710b;
            Placeable.PlacementScope placementScope = this.f16056j;
            LookaheadDelegate lookaheadDelegate = this.P;
            p0.a.p(lookaheadDelegate);
            if (!approachLayoutModifierNode.V(placementScope, lookaheadDelegate.f16070p) && !approachMeasureScopeImpl.f15711c) {
                long j2 = this.f15827c;
                LookaheadDelegate lookaheadDelegate2 = this.P;
                if (IntSize.a(j2, lookaheadDelegate2 != null ? new IntSize(IntSizeKt.a(lookaheadDelegate2.f15825a, lookaheadDelegate2.f15826b)) : null)) {
                    NodeCoordinator nodeCoordinator = this.f16103p;
                    p0.a.p(nodeCoordinator);
                    long j3 = nodeCoordinator.f15827c;
                    NodeCoordinator nodeCoordinator2 = this.f16103p;
                    p0.a.p(nodeCoordinator2);
                    LookaheadDelegate h12 = nodeCoordinator2.h1();
                    if (IntSize.a(j3, h12 != null ? new IntSize(IntSizeKt.a(h12.f15825a, h12.f15826b)) : null)) {
                        z2 = true;
                        NodeCoordinator nodeCoordinator3 = this.f16103p;
                        p0.a.p(nodeCoordinator3);
                        nodeCoordinator3.f16101n = z2;
                    }
                }
            }
            z2 = false;
            NodeCoordinator nodeCoordinator32 = this.f16103p;
            p0.a.p(nodeCoordinator32);
            nodeCoordinator32.f16101n = z2;
        }
        C0().r();
        NodeCoordinator nodeCoordinator4 = this.f16103p;
        p0.a.p(nodeCoordinator4);
        nodeCoordinator4.f16101n = false;
    }

    public final void Z1(LayoutModifierNode layoutModifierNode) {
        if (!p0.a.g(layoutModifierNode, this.N)) {
            if ((layoutModifierNode.z0().f14690c & 512) != 0) {
                ApproachLayoutModifierNode approachLayoutModifierNode = (ApproachLayoutModifierNode) layoutModifierNode;
                ApproachMeasureScopeImpl approachMeasureScopeImpl = this.Q;
                if (approachMeasureScopeImpl != null) {
                    approachMeasureScopeImpl.f15710b = approachLayoutModifierNode;
                } else {
                    approachMeasureScopeImpl = new ApproachMeasureScopeImpl(this, approachLayoutModifierNode);
                }
                this.Q = approachMeasureScopeImpl;
            } else {
                this.Q = null;
            }
        }
        this.N = layoutModifierNode;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final LookaheadDelegate h1() {
        return this.P;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    public final void j0(long j2, float f2, GraphicsLayer graphicsLayer) {
        super.j0(j2, f2, graphicsLayer);
        Y1();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final Modifier.Node k1() {
        return this.N.z0();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    public final void n0(long j2, float f2, l lVar) {
        super.n0(j2, f2, lVar);
        Y1();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final int q0(AlignmentLine alignmentLine) {
        LookaheadDelegate lookaheadDelegate = this.P;
        if (lookaheadDelegate == null) {
            return LayoutModifierNodeCoordinatorKt.a(this, alignmentLine);
        }
        Integer num = (Integer) lookaheadDelegate.f16072r.get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int s(int i2) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.Q;
        if (approachMeasureScopeImpl != null) {
            ApproachLayoutModifierNode approachLayoutModifierNode = approachMeasureScopeImpl.f15710b;
            NodeCoordinator nodeCoordinator = this.f16103p;
            p0.a.p(nodeCoordinator);
            return approachLayoutModifierNode.j0(approachMeasureScopeImpl, nodeCoordinator, i2);
        }
        LayoutModifierNode layoutModifierNode = this.N;
        NodeCoordinator nodeCoordinator2 = this.f16103p;
        p0.a.p(nodeCoordinator2);
        return layoutModifierNode.q(this, nodeCoordinator2, i2);
    }
}
