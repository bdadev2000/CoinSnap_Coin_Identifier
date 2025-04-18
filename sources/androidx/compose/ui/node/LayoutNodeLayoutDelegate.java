package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.google.android.gms.common.api.Api;
import java.util.List;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class LayoutNodeLayoutDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutNode f15980a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15981b;
    public boolean d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15983f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15984g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15985h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15986i;

    /* renamed from: j, reason: collision with root package name */
    public int f15987j;

    /* renamed from: k, reason: collision with root package name */
    public int f15988k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f15989l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f15990m;

    /* renamed from: n, reason: collision with root package name */
    public int f15991n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f15992o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f15993p;

    /* renamed from: q, reason: collision with root package name */
    public int f15994q;

    /* renamed from: s, reason: collision with root package name */
    public LookaheadPassDelegate f15996s;

    /* renamed from: c, reason: collision with root package name */
    public LayoutNode.LayoutState f15982c = LayoutNode.LayoutState.f15967f;

    /* renamed from: r, reason: collision with root package name */
    public final MeasurePassDelegate f15995r = new MeasurePassDelegate();

    /* renamed from: t, reason: collision with root package name */
    public long f15997t = ConstraintsKt.b(0, 0, 15);

    /* renamed from: u, reason: collision with root package name */
    public final q0.a f15998u = new LayoutNodeLayoutDelegate$performMeasureBlock$1(this);

    /* loaded from: classes3.dex */
    public final class LookaheadPassDelegate extends Placeable implements Measurable, AlignmentLinesOwner, MotionReferencePlacementDelegate {

        /* renamed from: g, reason: collision with root package name */
        public boolean f15999g;

        /* renamed from: k, reason: collision with root package name */
        public boolean f16003k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f16004l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f16005m;

        /* renamed from: n, reason: collision with root package name */
        public Constraints f16006n;

        /* renamed from: p, reason: collision with root package name */
        public l f16008p;

        /* renamed from: q, reason: collision with root package name */
        public GraphicsLayer f16009q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f16010r;

        /* renamed from: v, reason: collision with root package name */
        public boolean f16014v;
        public Object x;

        /* renamed from: y, reason: collision with root package name */
        public boolean f16015y;

        /* renamed from: h, reason: collision with root package name */
        public int f16000h = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* renamed from: i, reason: collision with root package name */
        public int f16001i = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* renamed from: j, reason: collision with root package name */
        public LayoutNode.UsageByParent f16002j = LayoutNode.UsageByParent.f15972c;

        /* renamed from: o, reason: collision with root package name */
        public long f16007o = 0;

        /* renamed from: s, reason: collision with root package name */
        public final LookaheadAlignmentLines f16011s = new AlignmentLines(this);

        /* renamed from: t, reason: collision with root package name */
        public final MutableVector f16012t = new MutableVector(new LookaheadPassDelegate[16]);

        /* renamed from: u, reason: collision with root package name */
        public boolean f16013u = true;
        public boolean w = true;

        /* loaded from: classes3.dex */
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[LayoutNode.LayoutState.values().length];
                try {
                    iArr[1] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[0] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[3] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
                try {
                    iArr2[0] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[1] = 2;
                } catch (NoSuchFieldError unused6) {
                }
            }
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.ui.node.AlignmentLines, androidx.compose.ui.node.LookaheadAlignmentLines] */
        public LookaheadPassDelegate() {
            this.x = LayoutNodeLayoutDelegate.this.f15995r.f16038s;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public final AlignmentLinesOwner A() {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
            LayoutNode B = LayoutNodeLayoutDelegate.this.f15980a.B();
            if (B == null || (layoutNodeLayoutDelegate = B.C) == null) {
                return null;
            }
            return layoutNodeLayoutDelegate.f15996s;
        }

        public final void C0(long j2, l lVar, GraphicsLayer graphicsLayer) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (!(!layoutNodeLayoutDelegate.f15980a.L)) {
                InlineClassHelperKt.a("place is called on a deactivated node");
                throw null;
            }
            layoutNodeLayoutDelegate.f15982c = LayoutNode.LayoutState.d;
            this.f16004l = true;
            this.f16015y = false;
            if (!IntOffset.b(j2, this.f16007o)) {
                if (layoutNodeLayoutDelegate.f15993p || layoutNodeLayoutDelegate.f15992o) {
                    layoutNodeLayoutDelegate.f15985h = true;
                }
                u0();
            }
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f15980a;
            Owner a2 = LayoutNodeKt.a(layoutNode);
            if (layoutNodeLayoutDelegate.f15985h || !this.f16010r) {
                layoutNodeLayoutDelegate.g(false);
                this.f16011s.f15876g = false;
                OwnerSnapshotObserver snapshotObserver = a2.getSnapshotObserver();
                LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeSelf$2 layoutNodeLayoutDelegate$LookaheadPassDelegate$placeSelf$2 = new LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeSelf$2(layoutNodeLayoutDelegate, a2, j2);
                snapshotObserver.getClass();
                if (layoutNode.f15944f != null) {
                    snapshotObserver.b(layoutNode, snapshotObserver.f16159g, layoutNodeLayoutDelegate$LookaheadPassDelegate$placeSelf$2);
                } else {
                    snapshotObserver.b(layoutNode, snapshotObserver.f16158f, layoutNodeLayoutDelegate$LookaheadPassDelegate$placeSelf$2);
                }
            } else {
                LookaheadDelegate h12 = layoutNodeLayoutDelegate.a().h1();
                p0.a.p(h12);
                h12.P0(IntOffset.d(j2, h12.f15828f));
                z0();
            }
            this.f16007o = j2;
            this.f16008p = lVar;
            this.f16009q = graphicsLayer;
            layoutNodeLayoutDelegate.f15982c = LayoutNode.LayoutState.f15967f;
        }

        public final boolean D0(long j2) {
            Constraints constraints;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f15980a;
            if (!(!layoutNode.L)) {
                InlineClassHelperKt.a("measure is called on a deactivated node");
                throw null;
            }
            LayoutNode B = layoutNode.B();
            LayoutNode layoutNode2 = layoutNodeLayoutDelegate.f15980a;
            layoutNode2.A = layoutNode2.A || (B != null && B.A);
            if (!layoutNode2.C.f15984g && (constraints = this.f16006n) != null && Constraints.c(constraints.f17480a, j2)) {
                Owner owner = layoutNode2.f15950l;
                if (owner != null) {
                    owner.i(layoutNode2, true);
                }
                layoutNode2.d0();
                return false;
            }
            this.f16006n = new Constraints(j2);
            p0(j2);
            this.f16011s.f15875f = false;
            F(LayoutNodeLayoutDelegate$LookaheadPassDelegate$remeasure$2.f16025a);
            long a2 = this.f16005m ? this.f15827c : IntSizeKt.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
            this.f16005m = true;
            LookaheadDelegate h12 = layoutNodeLayoutDelegate.a().h1();
            if (h12 == null) {
                InlineClassHelperKt.b("Lookahead result from lookaheadRemeasure cannot be null");
                throw null;
            }
            layoutNodeLayoutDelegate.f15982c = LayoutNode.LayoutState.f15965b;
            layoutNodeLayoutDelegate.f15984g = false;
            OwnerSnapshotObserver snapshotObserver = LayoutNodeKt.a(layoutNode2).getSnapshotObserver();
            LayoutNodeLayoutDelegate$performLookaheadMeasure$1 layoutNodeLayoutDelegate$performLookaheadMeasure$1 = new LayoutNodeLayoutDelegate$performLookaheadMeasure$1(layoutNodeLayoutDelegate, j2);
            snapshotObserver.getClass();
            if (layoutNode2.f15944f != null) {
                snapshotObserver.b(layoutNode2, snapshotObserver.f16156b, layoutNodeLayoutDelegate$performLookaheadMeasure$1);
            } else {
                snapshotObserver.b(layoutNode2, snapshotObserver.f16157c, layoutNodeLayoutDelegate$performLookaheadMeasure$1);
            }
            layoutNodeLayoutDelegate.f15985h = true;
            layoutNodeLayoutDelegate.f15986i = true;
            if (LayoutNodeLayoutDelegateKt.a(layoutNode2)) {
                layoutNodeLayoutDelegate.e = true;
                layoutNodeLayoutDelegate.f15983f = true;
            } else {
                layoutNodeLayoutDelegate.d = true;
            }
            layoutNodeLayoutDelegate.f15982c = LayoutNode.LayoutState.f15967f;
            o0(IntSizeKt.a(h12.f15825a, h12.f15826b));
            return (((int) (a2 >> 32)) == h12.f15825a && ((int) (4294967295L & a2)) == h12.f15826b) ? false : true;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public final void F(l lVar) {
            MutableVector E = LayoutNodeLayoutDelegate.this.f15980a.E();
            int i2 = E.f14144c;
            if (i2 > 0) {
                Object[] objArr = E.f14142a;
                int i3 = 0;
                do {
                    LookaheadPassDelegate lookaheadPassDelegate = ((LayoutNode) objArr[i3]).C.f15996s;
                    p0.a.p(lookaheadPassDelegate);
                    lVar.invoke(lookaheadPassDelegate);
                    i3++;
                } while (i3 < i2);
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public final void G() {
            MutableVector E;
            int i2;
            this.f16014v = true;
            LookaheadAlignmentLines lookaheadAlignmentLines = this.f16011s;
            lookaheadAlignmentLines.i();
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            boolean z2 = layoutNodeLayoutDelegate.f15985h;
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f15980a;
            if (z2 && (i2 = (E = layoutNode.E()).f14144c) > 0) {
                Object[] objArr = E.f14142a;
                int i3 = 0;
                do {
                    LayoutNode layoutNode2 = (LayoutNode) objArr[i3];
                    if (layoutNode2.C.f15984g && layoutNode2.z() == LayoutNode.UsageByParent.f15970a) {
                        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNode2.C;
                        LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate2.f15996s;
                        p0.a.p(lookaheadPassDelegate);
                        LookaheadPassDelegate lookaheadPassDelegate2 = layoutNodeLayoutDelegate2.f15996s;
                        Constraints constraints = lookaheadPassDelegate2 != null ? lookaheadPassDelegate2.f16006n : null;
                        p0.a.p(constraints);
                        if (lookaheadPassDelegate.D0(constraints.f17480a)) {
                            LayoutNode.Z(layoutNode, false, 7);
                        }
                    }
                    i3++;
                } while (i3 < i2);
            }
            LookaheadDelegate lookaheadDelegate = O().O;
            p0.a.p(lookaheadDelegate);
            if (layoutNodeLayoutDelegate.f15986i || (!this.f16003k && !lookaheadDelegate.f16055i && layoutNodeLayoutDelegate.f15985h)) {
                layoutNodeLayoutDelegate.f15985h = false;
                LayoutNode.LayoutState layoutState = layoutNodeLayoutDelegate.f15982c;
                layoutNodeLayoutDelegate.f15982c = LayoutNode.LayoutState.d;
                Owner a2 = LayoutNodeKt.a(layoutNode);
                layoutNodeLayoutDelegate.h(false);
                OwnerSnapshotObserver snapshotObserver = a2.getSnapshotObserver();
                LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1 layoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1 = new LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1(this, lookaheadDelegate, layoutNodeLayoutDelegate);
                snapshotObserver.getClass();
                if (layoutNode.f15944f != null) {
                    snapshotObserver.b(layoutNode, snapshotObserver.f16160h, layoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1);
                } else {
                    snapshotObserver.b(layoutNode, snapshotObserver.e, layoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1);
                }
                layoutNodeLayoutDelegate.f15982c = layoutState;
                if (layoutNodeLayoutDelegate.f15992o && lookaheadDelegate.f16055i) {
                    requestLayout();
                }
                layoutNodeLayoutDelegate.f15986i = false;
            }
            if (lookaheadAlignmentLines.d) {
                lookaheadAlignmentLines.e = true;
            }
            if (lookaheadAlignmentLines.f15873b && lookaheadAlignmentLines.f()) {
                lookaheadAlignmentLines.h();
            }
            this.f16014v = false;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public final boolean J() {
            return this.f16010r;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int K(int i2) {
            x0();
            LookaheadDelegate h12 = LayoutNodeLayoutDelegate.this.a().h1();
            p0.a.p(h12);
            return h12.K(i2);
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public final InnerNodeCoordinator O() {
            return LayoutNodeLayoutDelegate.this.f15980a.B.f16089b;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int R(int i2) {
            x0();
            LookaheadDelegate h12 = LayoutNodeLayoutDelegate.this.a().h1();
            p0.a.p(h12);
            return h12.R(i2);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int S(int i2) {
            x0();
            LookaheadDelegate h12 = LayoutNodeLayoutDelegate.this.a().h1();
            p0.a.p(h12);
            return h12.S(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        
            if ((r1 != null ? r1.C.f15982c : null) == androidx.compose.ui.node.LayoutNode.LayoutState.d) goto L14;
         */
        @Override // androidx.compose.ui.layout.Measurable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.compose.ui.layout.Placeable V(long r7) {
            /*
                r6 = this;
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                androidx.compose.ui.node.LayoutNode r1 = r0.f15980a
                androidx.compose.ui.node.LayoutNode r1 = r1.B()
                r2 = 0
                if (r1 == 0) goto L10
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r1 = r1.C
                androidx.compose.ui.node.LayoutNode$LayoutState r1 = r1.f15982c
                goto L11
            L10:
                r1 = r2
            L11:
                androidx.compose.ui.node.LayoutNode$LayoutState r3 = androidx.compose.ui.node.LayoutNode.LayoutState.f15965b
                if (r1 == r3) goto L27
                androidx.compose.ui.node.LayoutNode r1 = r0.f15980a
                androidx.compose.ui.node.LayoutNode r1 = r1.B()
                if (r1 == 0) goto L22
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r1 = r1.C
                androidx.compose.ui.node.LayoutNode$LayoutState r1 = r1.f15982c
                goto L23
            L22:
                r1 = r2
            L23:
                androidx.compose.ui.node.LayoutNode$LayoutState r3 = androidx.compose.ui.node.LayoutNode.LayoutState.d
                if (r1 != r3) goto L2a
            L27:
                r1 = 0
                r0.f15981b = r1
            L2a:
                androidx.compose.ui.node.LayoutNode r1 = r0.f15980a
                androidx.compose.ui.node.LayoutNode r3 = r1.B()
                androidx.compose.ui.node.LayoutNode$UsageByParent r4 = androidx.compose.ui.node.LayoutNode.UsageByParent.f15972c
                if (r3 == 0) goto L75
                androidx.compose.ui.node.LayoutNode$UsageByParent r5 = r6.f16002j
                if (r5 == r4) goto L43
                boolean r1 = r1.A
                if (r1 == 0) goto L3d
                goto L43
            L3d:
                java.lang.String r7 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
                androidx.compose.ui.internal.InlineClassHelperKt.b(r7)
                throw r2
            L43:
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r1 = r3.C
                androidx.compose.ui.node.LayoutNode$LayoutState r2 = r1.f15982c
                int r2 = r2.ordinal()
                if (r2 == 0) goto L70
                r3 = 1
                if (r2 == r3) goto L70
                r3 = 2
                if (r2 == r3) goto L6d
                r3 = 3
                if (r2 != r3) goto L57
                goto L6d
            L57:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                java.lang.String r0 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
                r8.<init>(r0)
                androidx.compose.ui.node.LayoutNode$LayoutState r0 = r1.f15982c
                r8.append(r0)
                java.lang.String r8 = r8.toString()
                r7.<init>(r8)
                throw r7
            L6d:
                androidx.compose.ui.node.LayoutNode$UsageByParent r1 = androidx.compose.ui.node.LayoutNode.UsageByParent.f15971b
                goto L72
            L70:
                androidx.compose.ui.node.LayoutNode$UsageByParent r1 = androidx.compose.ui.node.LayoutNode.UsageByParent.f15970a
            L72:
                r6.f16002j = r1
                goto L77
            L75:
                r6.f16002j = r4
            L77:
                androidx.compose.ui.node.LayoutNode r0 = r0.f15980a
                androidx.compose.ui.node.LayoutNode$UsageByParent r1 = r0.f15961y
                if (r1 != r4) goto L80
                r0.o()
            L80:
                r6.D0(r7)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.V(long):androidx.compose.ui.layout.Placeable");
        }

        @Override // androidx.compose.ui.layout.Measured
        public final int Z(AlignmentLine alignmentLine) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LayoutNode B = layoutNodeLayoutDelegate.f15980a.B();
            LayoutNode.LayoutState layoutState = B != null ? B.C.f15982c : null;
            LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.f15965b;
            LookaheadAlignmentLines lookaheadAlignmentLines = this.f16011s;
            if (layoutState == layoutState2) {
                lookaheadAlignmentLines.f15874c = true;
            } else {
                LayoutNode B2 = layoutNodeLayoutDelegate.f15980a.B();
                if ((B2 != null ? B2.C.f15982c : null) == LayoutNode.LayoutState.d) {
                    lookaheadAlignmentLines.d = true;
                }
            }
            this.f16003k = true;
            LookaheadDelegate h12 = layoutNodeLayoutDelegate.a().h1();
            p0.a.p(h12);
            int Z = h12.Z(alignmentLine);
            this.f16003k = false;
            return Z;
        }

        @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
        public final void d0(boolean z2) {
            LookaheadDelegate h12;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LookaheadDelegate h13 = layoutNodeLayoutDelegate.a().h1();
            if (p0.a.g(Boolean.valueOf(z2), h13 != null ? Boolean.valueOf(h13.f16053g) : null) || (h12 = layoutNodeLayoutDelegate.a().h1()) == null) {
                return;
            }
            h12.f16053g = z2;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public final void f0() {
            LayoutNode.Z(LayoutNodeLayoutDelegate.this.f15980a, false, 7);
        }

        @Override // androidx.compose.ui.layout.Placeable
        public final int g0() {
            LookaheadDelegate h12 = LayoutNodeLayoutDelegate.this.a().h1();
            p0.a.p(h12);
            return h12.g0();
        }

        @Override // androidx.compose.ui.layout.Placeable
        public final int h0() {
            LookaheadDelegate h12 = LayoutNodeLayoutDelegate.this.a().h1();
            p0.a.p(h12);
            return h12.h0();
        }

        @Override // androidx.compose.ui.layout.Placeable
        public final void j0(long j2, float f2, GraphicsLayer graphicsLayer) {
            C0(j2, null, graphicsLayer);
        }

        @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
        public final Object m() {
            return this.x;
        }

        @Override // androidx.compose.ui.layout.Placeable
        public final void n0(long j2, float f2, l lVar) {
            C0(j2, lVar, null);
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public final AlignmentLines q() {
            return this.f16011s;
        }

        public final void q0() {
            boolean z2 = this.f16010r;
            this.f16010r = true;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (!z2 && layoutNodeLayoutDelegate.f15984g) {
                LayoutNode.Z(layoutNodeLayoutDelegate.f15980a, true, 6);
            }
            MutableVector E = layoutNodeLayoutDelegate.f15980a.E();
            int i2 = E.f14144c;
            if (i2 > 0) {
                Object[] objArr = E.f14142a;
                int i3 = 0;
                do {
                    LayoutNode layoutNode = (LayoutNode) objArr[i3];
                    if (layoutNode.C() != Integer.MAX_VALUE) {
                        LookaheadPassDelegate lookaheadPassDelegate = layoutNode.C.f15996s;
                        p0.a.p(lookaheadPassDelegate);
                        lookaheadPassDelegate.q0();
                        LayoutNode.c0(layoutNode);
                    }
                    i3++;
                } while (i3 < i2);
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public final void requestLayout() {
            LayoutNodeLayoutDelegate.this.f15980a.Y(false);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int s(int i2) {
            x0();
            LookaheadDelegate h12 = LayoutNodeLayoutDelegate.this.a().h1();
            p0.a.p(h12);
            return h12.s(i2);
        }

        public final void s0() {
            if (this.f16010r) {
                int i2 = 0;
                this.f16010r = false;
                MutableVector E = LayoutNodeLayoutDelegate.this.f15980a.E();
                int i3 = E.f14144c;
                if (i3 > 0) {
                    Object[] objArr = E.f14142a;
                    do {
                        LookaheadPassDelegate lookaheadPassDelegate = ((LayoutNode) objArr[i2]).C.f15996s;
                        p0.a.p(lookaheadPassDelegate);
                        lookaheadPassDelegate.s0();
                        i2++;
                    } while (i2 < i3);
                }
            }
        }

        public final void u0() {
            MutableVector E;
            int i2;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (layoutNodeLayoutDelegate.f15994q <= 0 || (i2 = (E = layoutNodeLayoutDelegate.f15980a.E()).f14144c) <= 0) {
                return;
            }
            Object[] objArr = E.f14142a;
            int i3 = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) objArr[i3];
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNode.C;
                if ((layoutNodeLayoutDelegate2.f15992o || layoutNodeLayoutDelegate2.f15993p) && !layoutNodeLayoutDelegate2.f15985h) {
                    layoutNode.Y(false);
                }
                LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate2.f15996s;
                if (lookaheadPassDelegate != null) {
                    lookaheadPassDelegate.u0();
                }
                i3++;
            } while (i3 < i2);
        }

        public final void x0() {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LayoutNode.Z(layoutNodeLayoutDelegate.f15980a, false, 7);
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f15980a;
            LayoutNode B = layoutNode.B();
            if (B == null || layoutNode.f15961y != LayoutNode.UsageByParent.f15972c) {
                return;
            }
            int ordinal = B.C.f15982c.ordinal();
            layoutNode.f15961y = ordinal != 0 ? ordinal != 2 ? B.f15961y : LayoutNode.UsageByParent.f15971b : LayoutNode.UsageByParent.f15970a;
        }

        public final void z0() {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
            LayoutNode.LayoutState layoutState;
            this.f16015y = true;
            LayoutNode B = LayoutNodeLayoutDelegate.this.f15980a.B();
            if (!this.f16010r) {
                q0();
                if (this.f15999g && B != null) {
                    B.Y(false);
                }
            }
            if (B == null) {
                this.f16001i = 0;
            } else if (!this.f15999g && ((layoutState = (layoutNodeLayoutDelegate = B.C).f15982c) == LayoutNode.LayoutState.f15966c || layoutState == LayoutNode.LayoutState.d)) {
                if (this.f16001i != Integer.MAX_VALUE) {
                    InlineClassHelperKt.b("Place was called on a node which was placed already");
                    throw null;
                }
                int i2 = layoutNodeLayoutDelegate.f15987j;
                this.f16001i = i2;
                layoutNodeLayoutDelegate.f15987j = i2 + 1;
            }
            G();
        }
    }

    /* loaded from: classes3.dex */
    public final class MeasurePassDelegate extends Placeable implements Measurable, AlignmentLinesOwner, MotionReferencePlacementDelegate {
        public float A;
        public boolean B;
        public l C;
        public GraphicsLayer D;
        public float F;
        public final q0.a G;
        public boolean H;

        /* renamed from: g, reason: collision with root package name */
        public boolean f16026g;

        /* renamed from: j, reason: collision with root package name */
        public boolean f16029j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f16030k;

        /* renamed from: m, reason: collision with root package name */
        public boolean f16032m;

        /* renamed from: o, reason: collision with root package name */
        public l f16034o;

        /* renamed from: p, reason: collision with root package name */
        public GraphicsLayer f16035p;

        /* renamed from: q, reason: collision with root package name */
        public float f16036q;

        /* renamed from: s, reason: collision with root package name */
        public Object f16038s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f16039t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f16040u;

        /* renamed from: y, reason: collision with root package name */
        public boolean f16042y;

        /* renamed from: h, reason: collision with root package name */
        public int f16027h = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* renamed from: i, reason: collision with root package name */
        public int f16028i = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* renamed from: l, reason: collision with root package name */
        public LayoutNode.UsageByParent f16031l = LayoutNode.UsageByParent.f15972c;

        /* renamed from: n, reason: collision with root package name */
        public long f16033n = 0;

        /* renamed from: r, reason: collision with root package name */
        public boolean f16037r = true;

        /* renamed from: v, reason: collision with root package name */
        public final LayoutNodeAlignmentLines f16041v = new AlignmentLines(this);
        public final MutableVector w = new MutableVector(new MeasurePassDelegate[16]);
        public boolean x = true;

        /* renamed from: z, reason: collision with root package name */
        public final q0.a f16043z = new LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildrenBlock$1(this);
        public long E = 0;

        /* loaded from: classes3.dex */
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[LayoutNode.LayoutState.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[2] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
                try {
                    iArr2[0] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[1] = 2;
                } catch (NoSuchFieldError unused4) {
                }
            }
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.ui.node.AlignmentLines, androidx.compose.ui.node.LayoutNodeAlignmentLines] */
        public MeasurePassDelegate() {
            this.G = new LayoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinatorBlock$1(LayoutNodeLayoutDelegate.this, this);
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public final AlignmentLinesOwner A() {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
            LayoutNode B = LayoutNodeLayoutDelegate.this.f15980a.B();
            if (B == null || (layoutNodeLayoutDelegate = B.C) == null) {
                return null;
            }
            return layoutNodeLayoutDelegate.f15995r;
        }

        public final void C0() {
            this.B = true;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LayoutNode B = layoutNodeLayoutDelegate.f15980a.B();
            float f2 = O().A;
            NodeChain nodeChain = layoutNodeLayoutDelegate.f15980a.B;
            NodeCoordinator nodeCoordinator = nodeChain.f16090c;
            while (nodeCoordinator != nodeChain.f16089b) {
                p0.a.q(nodeCoordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) nodeCoordinator;
                f2 += layoutModifierNodeCoordinator.A;
                nodeCoordinator = layoutModifierNodeCoordinator.f16103p;
            }
            if (f2 != this.A) {
                this.A = f2;
                if (B != null) {
                    B.S();
                }
                if (B != null) {
                    B.H();
                }
            }
            if (!this.f16039t) {
                if (B != null) {
                    B.H();
                }
                s0();
                if (this.f16026g && B != null) {
                    B.a0(false);
                }
            }
            if (B == null) {
                this.f16028i = 0;
            } else if (!this.f16026g) {
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = B.C;
                if (layoutNodeLayoutDelegate2.f15982c == LayoutNode.LayoutState.f15966c) {
                    if (this.f16028i != Integer.MAX_VALUE) {
                        InlineClassHelperKt.b("Place was called on a node which was placed already");
                        throw null;
                    }
                    int i2 = layoutNodeLayoutDelegate2.f15988k;
                    this.f16028i = i2;
                    layoutNodeLayoutDelegate2.f15988k = i2 + 1;
                }
            }
            G();
        }

        public final void D0(long j2, float f2, l lVar, GraphicsLayer graphicsLayer) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f15980a;
            if (!(!layoutNode.L)) {
                InlineClassHelperKt.a("place is called on a deactivated node");
                throw null;
            }
            layoutNodeLayoutDelegate.f15982c = LayoutNode.LayoutState.f15966c;
            this.f16033n = j2;
            this.f16036q = f2;
            this.f16034o = lVar;
            this.f16035p = graphicsLayer;
            this.f16030k = true;
            this.B = false;
            Owner a2 = LayoutNodeKt.a(layoutNode);
            if (layoutNodeLayoutDelegate.e || !this.f16039t) {
                this.f16041v.f15876g = false;
                layoutNodeLayoutDelegate.e(false);
                this.C = lVar;
                this.E = j2;
                this.F = f2;
                this.D = graphicsLayer;
                OwnerSnapshotObserver snapshotObserver = a2.getSnapshotObserver();
                snapshotObserver.b(layoutNodeLayoutDelegate.f15980a, snapshotObserver.f16158f, this.G);
            } else {
                NodeCoordinator a3 = layoutNodeLayoutDelegate.a();
                a3.N1(IntOffset.d(j2, a3.f15828f), f2, lVar, graphicsLayer);
                C0();
            }
            layoutNodeLayoutDelegate.f15982c = LayoutNode.LayoutState.f15967f;
        }

        public final void E0(long j2, float f2, l lVar, GraphicsLayer graphicsLayer) {
            Placeable.PlacementScope placementScope;
            this.f16040u = true;
            boolean b2 = IntOffset.b(j2, this.f16033n);
            boolean z2 = false;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (!b2 || this.H) {
                if (layoutNodeLayoutDelegate.f15990m || layoutNodeLayoutDelegate.f15989l || this.H) {
                    layoutNodeLayoutDelegate.e = true;
                    this.H = false;
                }
                x0();
            }
            if (LayoutNodeLayoutDelegateKt.a(layoutNodeLayoutDelegate.f15980a)) {
                NodeCoordinator nodeCoordinator = layoutNodeLayoutDelegate.a().f16104q;
                LayoutNode layoutNode = layoutNodeLayoutDelegate.f15980a;
                if (nodeCoordinator == null || (placementScope = nodeCoordinator.f16056j) == null) {
                    placementScope = LayoutNodeKt.a(layoutNode).getPlacementScope();
                }
                LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.f15996s;
                p0.a.p(lookaheadPassDelegate);
                LayoutNode B = layoutNode.B();
                if (B != null) {
                    B.C.f15987j = 0;
                }
                lookaheadPassDelegate.f16001i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                placementScope.e(lookaheadPassDelegate, (int) (j2 >> 32), (int) (4294967295L & j2), 0.0f);
            }
            LookaheadPassDelegate lookaheadPassDelegate2 = layoutNodeLayoutDelegate.f15996s;
            if (lookaheadPassDelegate2 != null && !lookaheadPassDelegate2.f16004l) {
                z2 = true;
            }
            if (true ^ z2) {
                D0(j2, f2, lVar, graphicsLayer);
            } else {
                InlineClassHelperKt.b("Error: Placement happened before lookahead.");
                throw null;
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public final void F(l lVar) {
            MutableVector E = LayoutNodeLayoutDelegate.this.f15980a.E();
            int i2 = E.f14144c;
            if (i2 > 0) {
                Object[] objArr = E.f14142a;
                int i3 = 0;
                do {
                    lVar.invoke(((LayoutNode) objArr[i3]).C.f15995r);
                    i3++;
                } while (i3 < i2);
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public final void G() {
            MutableVector E;
            int i2;
            this.f16042y = true;
            LayoutNodeAlignmentLines layoutNodeAlignmentLines = this.f16041v;
            layoutNodeAlignmentLines.i();
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            boolean z2 = layoutNodeLayoutDelegate.e;
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f15980a;
            if (z2 && (i2 = (E = layoutNode.E()).f14144c) > 0) {
                Object[] objArr = E.f14142a;
                int i3 = 0;
                do {
                    LayoutNode layoutNode2 = (LayoutNode) objArr[i3];
                    if (layoutNode2.C.d && layoutNode2.y() == LayoutNode.UsageByParent.f15970a && LayoutNode.U(layoutNode2)) {
                        LayoutNode.b0(layoutNode, false, 7);
                    }
                    i3++;
                } while (i3 < i2);
            }
            if (layoutNodeLayoutDelegate.f15983f || (!this.f16032m && !O().f16055i && layoutNodeLayoutDelegate.e)) {
                layoutNodeLayoutDelegate.e = false;
                LayoutNode.LayoutState layoutState = layoutNodeLayoutDelegate.f15982c;
                layoutNodeLayoutDelegate.f15982c = LayoutNode.LayoutState.f15966c;
                layoutNodeLayoutDelegate.f(false);
                OwnerSnapshotObserver snapshotObserver = LayoutNodeKt.a(layoutNode).getSnapshotObserver();
                snapshotObserver.b(layoutNode, snapshotObserver.e, this.f16043z);
                layoutNodeLayoutDelegate.f15982c = layoutState;
                if (O().f16055i && layoutNodeLayoutDelegate.f15989l) {
                    requestLayout();
                }
                layoutNodeLayoutDelegate.f15983f = false;
            }
            if (layoutNodeAlignmentLines.d) {
                layoutNodeAlignmentLines.e = true;
            }
            if (layoutNodeAlignmentLines.f15873b && layoutNodeAlignmentLines.f()) {
                layoutNodeAlignmentLines.h();
            }
            this.f16042y = false;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public final boolean J() {
            return this.f16039t;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int K(int i2) {
            z0();
            return LayoutNodeLayoutDelegate.this.a().K(i2);
        }

        public final boolean K0(long j2) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f15980a;
            boolean z2 = true;
            if (!(!layoutNode.L)) {
                InlineClassHelperKt.a("measure is called on a deactivated node");
                throw null;
            }
            Owner a2 = LayoutNodeKt.a(layoutNode);
            LayoutNode layoutNode2 = layoutNodeLayoutDelegate.f15980a;
            LayoutNode B = layoutNode2.B();
            layoutNode2.A = layoutNode2.A || (B != null && B.A);
            if (!layoutNode2.C.d && Constraints.c(this.d, j2)) {
                a2.i(layoutNode2, false);
                layoutNode2.d0();
                return false;
            }
            this.f16041v.f15875f = false;
            F(LayoutNodeLayoutDelegate$MeasurePassDelegate$remeasure$2.f16049a);
            this.f16029j = true;
            long j3 = layoutNodeLayoutDelegate.a().f15827c;
            p0(j2);
            LayoutNode.LayoutState layoutState = layoutNodeLayoutDelegate.f15982c;
            LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.f15967f;
            if (layoutState != layoutState2) {
                InlineClassHelperKt.b("layout state is not idle before measure starts");
                throw null;
            }
            LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.f15964a;
            layoutNodeLayoutDelegate.f15982c = layoutState3;
            layoutNodeLayoutDelegate.d = false;
            layoutNodeLayoutDelegate.f15997t = j2;
            OwnerSnapshotObserver snapshotObserver = LayoutNodeKt.a(layoutNode2).getSnapshotObserver();
            snapshotObserver.b(layoutNode2, snapshotObserver.f16157c, layoutNodeLayoutDelegate.f15998u);
            if (layoutNodeLayoutDelegate.f15982c == layoutState3) {
                layoutNodeLayoutDelegate.e = true;
                layoutNodeLayoutDelegate.f15983f = true;
                layoutNodeLayoutDelegate.f15982c = layoutState2;
            }
            if (IntSize.b(layoutNodeLayoutDelegate.a().f15827c, j3) && layoutNodeLayoutDelegate.a().f15825a == this.f15825a && layoutNodeLayoutDelegate.a().f15826b == this.f15826b) {
                z2 = false;
            }
            o0(IntSizeKt.a(layoutNodeLayoutDelegate.a().f15825a, layoutNodeLayoutDelegate.a().f15826b));
            return z2;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public final InnerNodeCoordinator O() {
            return LayoutNodeLayoutDelegate.this.f15980a.B.f16089b;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int R(int i2) {
            z0();
            return LayoutNodeLayoutDelegate.this.a().R(i2);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int S(int i2) {
            z0();
            return LayoutNodeLayoutDelegate.this.a().S(i2);
        }

        @Override // androidx.compose.ui.layout.Measurable
        public final Placeable V(long j2) {
            LayoutNode.UsageByParent usageByParent;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f15980a;
            LayoutNode.UsageByParent usageByParent2 = layoutNode.f15961y;
            LayoutNode.UsageByParent usageByParent3 = LayoutNode.UsageByParent.f15972c;
            if (usageByParent2 == usageByParent3) {
                layoutNode.o();
            }
            if (LayoutNodeLayoutDelegateKt.a(layoutNodeLayoutDelegate.f15980a)) {
                LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.f15996s;
                p0.a.p(lookaheadPassDelegate);
                lookaheadPassDelegate.f16002j = usageByParent3;
                lookaheadPassDelegate.V(j2);
            }
            LayoutNode layoutNode2 = layoutNodeLayoutDelegate.f15980a;
            LayoutNode B = layoutNode2.B();
            if (B == null) {
                this.f16031l = usageByParent3;
            } else {
                if (this.f16031l != usageByParent3 && !layoutNode2.A) {
                    InlineClassHelperKt.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                    throw null;
                }
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = B.C;
                int ordinal = layoutNodeLayoutDelegate2.f15982c.ordinal();
                if (ordinal == 0) {
                    usageByParent = LayoutNode.UsageByParent.f15970a;
                } else {
                    if (ordinal != 2) {
                        throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + layoutNodeLayoutDelegate2.f15982c);
                    }
                    usageByParent = LayoutNode.UsageByParent.f15971b;
                }
                this.f16031l = usageByParent;
            }
            K0(j2);
            return this;
        }

        @Override // androidx.compose.ui.layout.Measured
        public final int Z(AlignmentLine alignmentLine) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LayoutNode B = layoutNodeLayoutDelegate.f15980a.B();
            LayoutNode.LayoutState layoutState = B != null ? B.C.f15982c : null;
            LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.f15964a;
            LayoutNodeAlignmentLines layoutNodeAlignmentLines = this.f16041v;
            if (layoutState == layoutState2) {
                layoutNodeAlignmentLines.f15874c = true;
            } else {
                LayoutNode B2 = layoutNodeLayoutDelegate.f15980a.B();
                if ((B2 != null ? B2.C.f15982c : null) == LayoutNode.LayoutState.f15966c) {
                    layoutNodeAlignmentLines.d = true;
                }
            }
            this.f16032m = true;
            int Z = layoutNodeLayoutDelegate.a().Z(alignmentLine);
            this.f16032m = false;
            return Z;
        }

        @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
        public final void d0(boolean z2) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            boolean z3 = layoutNodeLayoutDelegate.a().f16053g;
            if (z2 != z3) {
                layoutNodeLayoutDelegate.a().f16053g = z3;
                this.H = true;
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public final void f0() {
            LayoutNode.b0(LayoutNodeLayoutDelegate.this.f15980a, false, 7);
        }

        @Override // androidx.compose.ui.layout.Placeable
        public final int g0() {
            return LayoutNodeLayoutDelegate.this.a().g0();
        }

        @Override // androidx.compose.ui.layout.Placeable
        public final int h0() {
            return LayoutNodeLayoutDelegate.this.a().h0();
        }

        @Override // androidx.compose.ui.layout.Placeable
        public final void j0(long j2, float f2, GraphicsLayer graphicsLayer) {
            E0(j2, f2, null, graphicsLayer);
        }

        @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
        public final Object m() {
            return this.f16038s;
        }

        @Override // androidx.compose.ui.layout.Placeable
        public final void n0(long j2, float f2, l lVar) {
            E0(j2, f2, lVar, null);
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public final AlignmentLines q() {
            return this.f16041v;
        }

        public final List q0() {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            layoutNodeLayoutDelegate.f15980a.f0();
            boolean z2 = this.x;
            MutableVector mutableVector = this.w;
            if (!z2) {
                return mutableVector.f();
            }
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f15980a;
            MutableVector E = layoutNode.E();
            int i2 = E.f14144c;
            if (i2 > 0) {
                Object[] objArr = E.f14142a;
                int i3 = 0;
                do {
                    LayoutNode layoutNode2 = (LayoutNode) objArr[i3];
                    if (mutableVector.f14144c <= i3) {
                        mutableVector.b(layoutNode2.C.f15995r);
                    } else {
                        MeasurePassDelegate measurePassDelegate = layoutNode2.C.f15995r;
                        Object[] objArr2 = mutableVector.f14142a;
                        Object obj = objArr2[i3];
                        objArr2[i3] = measurePassDelegate;
                    }
                    i3++;
                } while (i3 < i2);
            }
            mutableVector.p(layoutNode.v().size(), mutableVector.f14144c);
            this.x = false;
            return mutableVector.f();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public final void requestLayout() {
            LayoutNodeLayoutDelegate.this.f15980a.a0(false);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int s(int i2) {
            z0();
            return LayoutNodeLayoutDelegate.this.a().s(i2);
        }

        public final void s0() {
            boolean z2 = this.f16039t;
            this.f16039t = true;
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.f15980a;
            if (!z2) {
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.C;
                if (layoutNodeLayoutDelegate.d) {
                    LayoutNode.b0(layoutNode, true, 6);
                } else if (layoutNodeLayoutDelegate.f15984g) {
                    LayoutNode.Z(layoutNode, true, 6);
                }
            }
            NodeChain nodeChain = layoutNode.B;
            NodeCoordinator nodeCoordinator = nodeChain.f16089b.f16103p;
            for (NodeCoordinator nodeCoordinator2 = nodeChain.f16090c; !p0.a.g(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.f16103p) {
                if (nodeCoordinator2.F) {
                    nodeCoordinator2.q1();
                }
            }
            MutableVector E = layoutNode.E();
            int i2 = E.f14144c;
            if (i2 > 0) {
                Object[] objArr = E.f14142a;
                int i3 = 0;
                do {
                    LayoutNode layoutNode2 = (LayoutNode) objArr[i3];
                    if (layoutNode2.C() != Integer.MAX_VALUE) {
                        layoutNode2.C.f15995r.s0();
                        LayoutNode.c0(layoutNode2);
                    }
                    i3++;
                } while (i3 < i2);
            }
        }

        public final void u0() {
            if (this.f16039t) {
                int i2 = 0;
                this.f16039t = false;
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
                NodeChain nodeChain = layoutNodeLayoutDelegate.f15980a.B;
                NodeCoordinator nodeCoordinator = nodeChain.f16089b.f16103p;
                for (NodeCoordinator nodeCoordinator2 = nodeChain.f16090c; !p0.a.g(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.f16103p) {
                    if (nodeCoordinator2.G != null) {
                        if (nodeCoordinator2.H != null) {
                            nodeCoordinator2.H = null;
                        }
                        nodeCoordinator2.W1(false, null);
                        nodeCoordinator2.f16100m.a0(false);
                    }
                }
                MutableVector E = layoutNodeLayoutDelegate.f15980a.E();
                int i3 = E.f14144c;
                if (i3 > 0) {
                    Object[] objArr = E.f14142a;
                    do {
                        ((LayoutNode) objArr[i2]).C.f15995r.u0();
                        i2++;
                    } while (i2 < i3);
                }
            }
        }

        public final void x0() {
            MutableVector E;
            int i2;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (layoutNodeLayoutDelegate.f15991n <= 0 || (i2 = (E = layoutNodeLayoutDelegate.f15980a.E()).f14144c) <= 0) {
                return;
            }
            Object[] objArr = E.f14142a;
            int i3 = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) objArr[i3];
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNode.C;
                if ((layoutNodeLayoutDelegate2.f15989l || layoutNodeLayoutDelegate2.f15990m) && !layoutNodeLayoutDelegate2.e) {
                    layoutNode.a0(false);
                }
                layoutNodeLayoutDelegate2.f15995r.x0();
                i3++;
            } while (i3 < i2);
        }

        public final void z0() {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LayoutNode.b0(layoutNodeLayoutDelegate.f15980a, false, 7);
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f15980a;
            LayoutNode B = layoutNode.B();
            if (B == null || layoutNode.f15961y != LayoutNode.UsageByParent.f15972c) {
                return;
            }
            int ordinal = B.C.f15982c.ordinal();
            layoutNode.f15961y = ordinal != 0 ? ordinal != 2 ? B.f15961y : LayoutNode.UsageByParent.f15971b : LayoutNode.UsageByParent.f15970a;
        }
    }

    public LayoutNodeLayoutDelegate(LayoutNode layoutNode) {
        this.f15980a = layoutNode;
    }

    public final NodeCoordinator a() {
        return this.f15980a.B.f16090c;
    }

    public final void b() {
        LayoutNode.LayoutState layoutState = this.f15980a.C.f15982c;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.f15966c;
        LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.d;
        if (layoutState == layoutState2 || layoutState == layoutState3) {
            if (this.f15995r.f16042y) {
                f(true);
            } else {
                e(true);
            }
        }
        if (layoutState == layoutState3) {
            LookaheadPassDelegate lookaheadPassDelegate = this.f15996s;
            if (lookaheadPassDelegate == null || !lookaheadPassDelegate.f16014v) {
                g(true);
            } else {
                h(true);
            }
        }
    }

    public final void c(int i2) {
        int i3 = this.f15991n;
        this.f15991n = i2;
        if ((i3 == 0) != (i2 == 0)) {
            LayoutNode B = this.f15980a.B();
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = B != null ? B.C : null;
            if (layoutNodeLayoutDelegate != null) {
                if (i2 == 0) {
                    layoutNodeLayoutDelegate.c(layoutNodeLayoutDelegate.f15991n - 1);
                } else {
                    layoutNodeLayoutDelegate.c(layoutNodeLayoutDelegate.f15991n + 1);
                }
            }
        }
    }

    public final void d(int i2) {
        int i3 = this.f15994q;
        this.f15994q = i2;
        if ((i3 == 0) != (i2 == 0)) {
            LayoutNode B = this.f15980a.B();
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = B != null ? B.C : null;
            if (layoutNodeLayoutDelegate != null) {
                if (i2 == 0) {
                    layoutNodeLayoutDelegate.d(layoutNodeLayoutDelegate.f15994q - 1);
                } else {
                    layoutNodeLayoutDelegate.d(layoutNodeLayoutDelegate.f15994q + 1);
                }
            }
        }
    }

    public final void e(boolean z2) {
        if (this.f15990m != z2) {
            this.f15990m = z2;
            if (z2 && !this.f15989l) {
                c(this.f15991n + 1);
            } else {
                if (z2 || this.f15989l) {
                    return;
                }
                c(this.f15991n - 1);
            }
        }
    }

    public final void f(boolean z2) {
        if (this.f15989l != z2) {
            this.f15989l = z2;
            if (z2 && !this.f15990m) {
                c(this.f15991n + 1);
            } else {
                if (z2 || this.f15990m) {
                    return;
                }
                c(this.f15991n - 1);
            }
        }
    }

    public final void g(boolean z2) {
        if (this.f15993p != z2) {
            this.f15993p = z2;
            if (z2 && !this.f15992o) {
                d(this.f15994q + 1);
            } else {
                if (z2 || this.f15992o) {
                    return;
                }
                d(this.f15994q - 1);
            }
        }
    }

    public final void h(boolean z2) {
        if (this.f15992o != z2) {
            this.f15992o = z2;
            if (z2 && !this.f15993p) {
                d(this.f15994q + 1);
            } else {
                if (z2 || this.f15993p) {
                    return;
                }
                d(this.f15994q - 1);
            }
        }
    }

    public final void i() {
        MeasurePassDelegate measurePassDelegate = this.f15995r;
        Object obj = measurePassDelegate.f16038s;
        LayoutNode layoutNode = this.f15980a;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
        if ((obj != null || layoutNodeLayoutDelegate.a().m() != null) && measurePassDelegate.f16037r) {
            measurePassDelegate.f16037r = false;
            measurePassDelegate.f16038s = layoutNodeLayoutDelegate.a().m();
            LayoutNode B = layoutNode.B();
            if (B != null) {
                LayoutNode.b0(B, false, 7);
            }
        }
        LookaheadPassDelegate lookaheadPassDelegate = this.f15996s;
        if (lookaheadPassDelegate != null) {
            Object obj2 = lookaheadPassDelegate.x;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = LayoutNodeLayoutDelegate.this;
            if (obj2 == null) {
                LookaheadDelegate h12 = layoutNodeLayoutDelegate2.a().h1();
                p0.a.p(h12);
                if (h12.f16067m.m() == null) {
                    return;
                }
            }
            if (lookaheadPassDelegate.w) {
                lookaheadPassDelegate.w = false;
                LookaheadDelegate h13 = layoutNodeLayoutDelegate2.a().h1();
                p0.a.p(h13);
                lookaheadPassDelegate.x = h13.f16067m.m();
                if (LayoutNodeLayoutDelegateKt.a(layoutNode)) {
                    LayoutNode B2 = layoutNode.B();
                    if (B2 != null) {
                        LayoutNode.b0(B2, false, 7);
                        return;
                    }
                    return;
                }
                LayoutNode B3 = layoutNode.B();
                if (B3 != null) {
                    LayoutNode.Z(B3, false, 7);
                }
            }
        }
    }
}
