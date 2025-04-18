package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import q0.l;

@StabilityInferred
/* loaded from: classes2.dex */
public final class InnerNodeCoordinator extends NodeCoordinator {
    public static final AndroidPaint P;
    public final TailModifierNode N;
    public LookaheadDelegate O;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    /* loaded from: classes2.dex */
    public final class LookaheadDelegateImpl extends LookaheadDelegate {
        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int K(int i2) {
            IntrinsicsPolicy A = this.f16067m.f16100m.A();
            MeasurePolicy a2 = A.a();
            LayoutNode layoutNode = A.f15928a;
            return a2.minIntrinsicHeight(layoutNode.B.f16090c, layoutNode.t(), i2);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate
        public final void O0() {
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = this.f16067m.f16100m.C.f15996s;
            p0.a.p(lookaheadPassDelegate);
            lookaheadPassDelegate.z0();
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int R(int i2) {
            IntrinsicsPolicy A = this.f16067m.f16100m.A();
            MeasurePolicy a2 = A.a();
            LayoutNode layoutNode = A.f15928a;
            return a2.minIntrinsicWidth(layoutNode.B.f16090c, layoutNode.t(), i2);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int S(int i2) {
            IntrinsicsPolicy A = this.f16067m.f16100m.A();
            MeasurePolicy a2 = A.a();
            LayoutNode layoutNode = A.f15928a;
            return a2.maxIntrinsicWidth(layoutNode.B.f16090c, layoutNode.t(), i2);
        }

        @Override // androidx.compose.ui.layout.Measurable
        public final Placeable V(long j2) {
            p0(j2);
            NodeCoordinator nodeCoordinator = this.f16067m;
            MutableVector E = nodeCoordinator.f16100m.E();
            int i2 = E.f14144c;
            if (i2 > 0) {
                Object[] objArr = E.f14142a;
                int i3 = 0;
                do {
                    LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = ((LayoutNode) objArr[i3]).C.f15996s;
                    p0.a.p(lookaheadPassDelegate);
                    lookaheadPassDelegate.f16002j = LayoutNode.UsageByParent.f15972c;
                    i3++;
                } while (i3 < i2);
            }
            LayoutNode layoutNode = nodeCoordinator.f16100m;
            LookaheadDelegate.M0(this, layoutNode.f15957s.mo0measure3p2s80s(this, layoutNode.t(), j2));
            return this;
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public final int q0(AlignmentLine alignmentLine) {
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = this.f16067m.f16100m.C.f15996s;
            p0.a.p(lookaheadPassDelegate);
            boolean z2 = lookaheadPassDelegate.f16003k;
            LookaheadAlignmentLines lookaheadAlignmentLines = lookaheadPassDelegate.f16011s;
            if (!z2) {
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
                if (layoutNodeLayoutDelegate.f15982c == LayoutNode.LayoutState.f15965b) {
                    lookaheadAlignmentLines.f15875f = true;
                    if (lookaheadAlignmentLines.f15873b) {
                        layoutNodeLayoutDelegate.f15985h = true;
                        layoutNodeLayoutDelegate.f15986i = true;
                    }
                } else {
                    lookaheadAlignmentLines.f15876g = true;
                }
            }
            LookaheadDelegate lookaheadDelegate = lookaheadPassDelegate.O().O;
            if (lookaheadDelegate != null) {
                lookaheadDelegate.f16055i = true;
            }
            lookaheadPassDelegate.G();
            LookaheadDelegate lookaheadDelegate2 = lookaheadPassDelegate.O().O;
            if (lookaheadDelegate2 != null) {
                lookaheadDelegate2.f16055i = false;
            }
            Integer num = (Integer) lookaheadAlignmentLines.f15878i.get(alignmentLine);
            int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            this.f16072r.put(alignmentLine, Integer.valueOf(intValue));
            return intValue;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int s(int i2) {
            IntrinsicsPolicy A = this.f16067m.f16100m.A();
            MeasurePolicy a2 = A.a();
            LayoutNode layoutNode = A.f15928a;
            return a2.maxIntrinsicHeight(layoutNode.B.f16090c, layoutNode.t(), i2);
        }
    }

    static {
        AndroidPaint a2 = AndroidPaint_androidKt.a();
        a2.v(Color.d);
        a2.D(1.0f);
        a2.C(1);
        P = a2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.node.TailModifierNode, androidx.compose.ui.Modifier$Node] */
    public InnerNodeCoordinator(LayoutNode layoutNode) {
        super(layoutNode);
        ?? node = new Modifier.Node();
        node.d = 0;
        this.N = node;
        node.f14694i = this;
        this.O = layoutNode.f15944f != null ? new LookaheadDelegate(this) : null;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int K(int i2) {
        IntrinsicsPolicy A = this.f16100m.A();
        MeasurePolicy a2 = A.a();
        LayoutNode layoutNode = A.f15928a;
        return a2.minIntrinsicHeight(layoutNode.B.f16090c, layoutNode.u(), i2);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final void M1(Canvas canvas, GraphicsLayer graphicsLayer) {
        LayoutNode layoutNode = this.f16100m;
        Owner a2 = LayoutNodeKt.a(layoutNode);
        MutableVector D = layoutNode.D();
        int i2 = D.f14144c;
        if (i2 > 0) {
            Object[] objArr = D.f14142a;
            int i3 = 0;
            do {
                LayoutNode layoutNode2 = (LayoutNode) objArr[i3];
                if (layoutNode2.N()) {
                    layoutNode2.s(canvas, graphicsLayer);
                }
                i3++;
            } while (i3 < i2);
        }
        if (a2.getShowLayoutBounds()) {
            V0(canvas, P);
        }
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int R(int i2) {
        IntrinsicsPolicy A = this.f16100m.A();
        MeasurePolicy a2 = A.a();
        LayoutNode layoutNode = A.f15928a;
        return a2.minIntrinsicWidth(layoutNode.B.f16090c, layoutNode.u(), i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int S(int i2) {
        IntrinsicsPolicy A = this.f16100m.A();
        MeasurePolicy a2 = A.a();
        LayoutNode layoutNode = A.f15928a;
        return a2.maxIntrinsicWidth(layoutNode.B.f16090c, layoutNode.u(), i2);
    }

    @Override // androidx.compose.ui.layout.Measurable
    public final Placeable V(long j2) {
        if (this.f16102o) {
            LookaheadDelegate lookaheadDelegate = this.O;
            p0.a.p(lookaheadDelegate);
            j2 = lookaheadDelegate.d;
        }
        p0(j2);
        LayoutNode layoutNode = this.f16100m;
        MutableVector E = layoutNode.E();
        int i2 = E.f14144c;
        if (i2 > 0) {
            Object[] objArr = E.f14142a;
            int i3 = 0;
            do {
                ((LayoutNode) objArr[i3]).C.f15995r.f16031l = LayoutNode.UsageByParent.f15972c;
                i3++;
            } while (i3 < i2);
        }
        Q1(layoutNode.f15957s.mo0measure3p2s80s(this, layoutNode.u(), j2));
        G1();
        return this;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final void X0() {
        if (this.O == null) {
            this.O = new LookaheadDelegate(this);
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final LookaheadDelegate h1() {
        return this.O;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    public final void j0(long j2, float f2, GraphicsLayer graphicsLayer) {
        super.j0(j2, f2, graphicsLayer);
        if (this.f16054h) {
            return;
        }
        J1();
        this.f16100m.C.f15995r.C0();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final Modifier.Node k1() {
        return this.N;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    public final void n0(long j2, float f2, l lVar) {
        super.n0(j2, f2, lVar);
        if (this.f16054h) {
            return;
        }
        J1();
        this.f16100m.C.f15995r.C0();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.node.NodeCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p1(androidx.compose.ui.node.NodeCoordinator.HitTestSource r18, long r19, androidx.compose.ui.node.HitTestResult r21, boolean r22, boolean r23) {
        /*
            r17 = this;
            r0 = r17
            r8 = r19
            r10 = r21
            androidx.compose.ui.node.LayoutNode r1 = r0.f16100m
            r11 = r18
            boolean r2 = r11.d(r1)
            r12 = 1
            r3 = 0
            if (r2 == 0) goto L44
            boolean r2 = androidx.compose.ui.geometry.OffsetKt.b(r19)
            if (r2 != 0) goto L19
            goto L28
        L19:
            androidx.compose.ui.node.OwnedLayer r2 = r0.G
            if (r2 == 0) goto L41
            boolean r4 = r0.f16106s
            if (r4 == 0) goto L41
            boolean r2 = r2.g(r8)
            if (r2 == 0) goto L28
            goto L41
        L28:
            if (r22 == 0) goto L44
            long r4 = r17.i1()
            float r2 = r0.Q0(r8, r4)
            boolean r4 = java.lang.Float.isInfinite(r2)
            if (r4 != 0) goto L44
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto L44
            r13 = r3
        L3f:
            r3 = r12
            goto L46
        L41:
            r13 = r23
            goto L3f
        L44:
            r13 = r23
        L46:
            if (r3 == 0) goto L98
            int r14 = r10.f15918c
            androidx.compose.runtime.collection.MutableVector r1 = r1.D()
            int r2 = r1.f14144c
            if (r2 <= 0) goto L96
            int r2 = r2 - r12
            java.lang.Object[] r15 = r1.f14142a
            r16 = r2
        L57:
            r1 = r15[r16]
            r2 = r1
            androidx.compose.ui.node.LayoutNode r2 = (androidx.compose.ui.node.LayoutNode) r2
            boolean r1 = r2.N()
            if (r1 == 0) goto L92
            r1 = r18
            r3 = r19
            r5 = r21
            r6 = r22
            r7 = r13
            r1.c(r2, r3, r5, r6, r7)
            long r1 = r21.b()
            r3 = 32
            long r3 = r1 >> r3
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L92
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            int r1 = (int) r1
            if (r1 == 0) goto L92
            boolean r1 = r10.f15919f
            if (r1 == 0) goto L96
            int r1 = r10.d
            int r1 = r1 - r12
            r10.f15918c = r1
        L92:
            int r16 = r16 + (-1)
            if (r16 >= 0) goto L57
        L96:
            r10.f15918c = r14
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.InnerNodeCoordinator.p1(androidx.compose.ui.node.NodeCoordinator$HitTestSource, long, androidx.compose.ui.node.HitTestResult, boolean, boolean):void");
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final int q0(AlignmentLine alignmentLine) {
        LookaheadDelegate lookaheadDelegate = this.O;
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.q0(alignmentLine);
        }
        LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = this.f16100m.C.f15995r;
        boolean z2 = measurePassDelegate.f16032m;
        LayoutNodeAlignmentLines layoutNodeAlignmentLines = measurePassDelegate.f16041v;
        if (!z2) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (layoutNodeLayoutDelegate.f15982c == LayoutNode.LayoutState.f15964a) {
                layoutNodeAlignmentLines.f15875f = true;
                if (layoutNodeAlignmentLines.f15873b) {
                    layoutNodeLayoutDelegate.e = true;
                    layoutNodeLayoutDelegate.f15983f = true;
                }
            } else {
                layoutNodeAlignmentLines.f15876g = true;
            }
        }
        measurePassDelegate.O().f16055i = true;
        measurePassDelegate.G();
        measurePassDelegate.O().f16055i = false;
        Integer num = (Integer) layoutNodeAlignmentLines.f15878i.get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int s(int i2) {
        IntrinsicsPolicy A = this.f16100m.A();
        MeasurePolicy a2 = A.a();
        LayoutNode layoutNode = A.f15928a;
        return a2.maxIntrinsicHeight(layoutNode.B.f16090c, layoutNode.u(), i2);
    }
}
