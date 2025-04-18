package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.unit.Constraints;

@StabilityInferred
/* loaded from: classes2.dex */
public final class MeasureAndLayoutDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutNode f16073a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16075c;
    public boolean d;

    /* renamed from: i, reason: collision with root package name */
    public Constraints f16079i;

    /* renamed from: b, reason: collision with root package name */
    public final DepthSortedSetsForDifferentPasses f16074b = new DepthSortedSetsForDifferentPasses();
    public final OnPositionedDispatcher e = new OnPositionedDispatcher();

    /* renamed from: f, reason: collision with root package name */
    public final MutableVector f16076f = new MutableVector(new Owner.OnLayoutCompletedListener[16]);

    /* renamed from: g, reason: collision with root package name */
    public final long f16077g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final MutableVector f16078h = new MutableVector(new PostponedRequest[16]);

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class PostponedRequest {

        /* renamed from: a, reason: collision with root package name */
        public final LayoutNode f16080a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f16081b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f16082c;

        public PostponedRequest(LayoutNode layoutNode, boolean z2, boolean z3) {
            this.f16080a = layoutNode;
            this.f16081b = z2;
            this.f16082c = z3;
        }
    }

    /* loaded from: classes2.dex */
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
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public MeasureAndLayoutDelegate(LayoutNode layoutNode) {
        this.f16073a = layoutNode;
    }

    public static boolean b(LayoutNode layoutNode, Constraints constraints) {
        boolean D0;
        LayoutNode layoutNode2 = layoutNode.f15944f;
        if (layoutNode2 == null) {
            return false;
        }
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.C;
        if (constraints != null) {
            if (layoutNode2 != null) {
                LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.f15996s;
                p0.a.p(lookaheadPassDelegate);
                D0 = lookaheadPassDelegate.D0(constraints.f17480a);
            }
            D0 = false;
        } else {
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate2 = layoutNodeLayoutDelegate.f15996s;
            Constraints constraints2 = lookaheadPassDelegate2 != null ? lookaheadPassDelegate2.f16006n : null;
            if (constraints2 != null && layoutNode2 != null) {
                p0.a.p(lookaheadPassDelegate2);
                D0 = lookaheadPassDelegate2.D0(constraints2.f17480a);
            }
            D0 = false;
        }
        LayoutNode B = layoutNode.B();
        if (D0 && B != null) {
            if (B.f15944f == null) {
                LayoutNode.b0(B, false, 3);
            } else if (layoutNode.z() == LayoutNode.UsageByParent.f15970a) {
                LayoutNode.Z(B, false, 3);
            } else if (layoutNode.z() == LayoutNode.UsageByParent.f15971b) {
                B.Y(false);
            }
        }
        return D0;
    }

    public static boolean c(LayoutNode layoutNode, Constraints constraints) {
        boolean T = constraints != null ? layoutNode.T(constraints) : LayoutNode.U(layoutNode);
        LayoutNode B = layoutNode.B();
        if (T && B != null) {
            if (layoutNode.y() == LayoutNode.UsageByParent.f15970a) {
                LayoutNode.b0(B, false, 3);
            } else if (layoutNode.y() == LayoutNode.UsageByParent.f15971b) {
                B.a0(false);
            }
        }
        return T;
    }

    public static boolean h(LayoutNode layoutNode) {
        return layoutNode.C.d && i(layoutNode);
    }

    public static boolean i(LayoutNode layoutNode) {
        return layoutNode.y() == LayoutNode.UsageByParent.f15970a || layoutNode.C.f15995r.f16041v.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r4 < r7) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r7) {
        /*
            r6 = this;
            androidx.compose.ui.node.OnPositionedDispatcher r0 = r6.e
            r1 = 1
            if (r7 == 0) goto L11
            androidx.compose.runtime.collection.MutableVector r7 = r0.f16152a
            r7.g()
            androidx.compose.ui.node.LayoutNode r2 = r6.f16073a
            r7.b(r2)
            r2.K = r1
        L11:
            androidx.compose.ui.node.OnPositionedDispatcher$Companion$DepthComparator r7 = androidx.compose.ui.node.OnPositionedDispatcher.Companion.DepthComparator.f16154a
            androidx.compose.runtime.collection.MutableVector r2 = r0.f16152a
            r2.q(r7)
            int r7 = r2.f14144c
            androidx.compose.ui.node.LayoutNode[] r3 = r0.f16153b
            if (r3 == 0) goto L21
            int r4 = r3.length
            if (r4 >= r7) goto L29
        L21:
            r3 = 16
            int r3 = java.lang.Math.max(r3, r7)
            androidx.compose.ui.node.LayoutNode[] r3 = new androidx.compose.ui.node.LayoutNode[r3]
        L29:
            r4 = 0
            r0.f16153b = r4
            r4 = 0
        L2d:
            if (r4 >= r7) goto L38
            java.lang.Object[] r5 = r2.f14142a
            r5 = r5[r4]
            r3[r4] = r5
            int r4 = r4 + 1
            goto L2d
        L38:
            r2.g()
            int r7 = r7 - r1
        L3c:
            r1 = -1
            if (r1 >= r7) goto L4e
            r1 = r3[r7]
            p0.a.p(r1)
            boolean r2 = r1.K
            if (r2 == 0) goto L4b
            androidx.compose.ui.node.OnPositionedDispatcher.a(r1)
        L4b:
            int r7 = r7 + (-1)
            goto L3c
        L4e:
            r0.f16153b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.MeasureAndLayoutDelegate.a(boolean):void");
    }

    public final void d() {
        MutableVector mutableVector = this.f16078h;
        if (mutableVector.m()) {
            int i2 = mutableVector.f14144c;
            if (i2 > 0) {
                Object[] objArr = mutableVector.f14142a;
                int i3 = 0;
                do {
                    PostponedRequest postponedRequest = (PostponedRequest) objArr[i3];
                    if (postponedRequest.f16080a.M()) {
                        boolean z2 = postponedRequest.f16081b;
                        boolean z3 = postponedRequest.f16082c;
                        LayoutNode layoutNode = postponedRequest.f16080a;
                        if (z2) {
                            LayoutNode.Z(layoutNode, z3, 2);
                        } else {
                            LayoutNode.b0(layoutNode, z3, 2);
                        }
                    }
                    i3++;
                } while (i3 < i2);
            }
            mutableVector.g();
        }
    }

    public final void e(LayoutNode layoutNode) {
        MutableVector E = layoutNode.E();
        int i2 = E.f14144c;
        if (i2 > 0) {
            Object[] objArr = E.f14142a;
            int i3 = 0;
            do {
                LayoutNode layoutNode2 = (LayoutNode) objArr[i3];
                if (p0.a.g(layoutNode2.O(), Boolean.TRUE) && !layoutNode2.L) {
                    if (this.f16074b.b(layoutNode2, true)) {
                        layoutNode2.P();
                    }
                    e(layoutNode2);
                }
                i3++;
            } while (i3 < i2);
        }
    }

    public final void f(LayoutNode layoutNode, boolean z2) {
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.f16074b;
        if ((z2 ? depthSortedSetsForDifferentPasses.f15914a : depthSortedSetsForDifferentPasses.f15915b).f15912c.isEmpty()) {
            return;
        }
        if (!this.f16075c) {
            InlineClassHelperKt.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
            throw null;
        }
        if (!(z2 ? layoutNode.C.f15984g : layoutNode.C.d)) {
            g(layoutNode, z2);
        } else {
            InlineClassHelperKt.a("node not yet measured");
            throw null;
        }
    }

    public final void g(LayoutNode layoutNode, boolean z2) {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate;
        LookaheadAlignmentLines lookaheadAlignmentLines;
        MutableVector E = layoutNode.E();
        int i2 = E.f14144c;
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.f16074b;
        if (i2 > 0) {
            Object[] objArr = E.f14142a;
            int i3 = 0;
            do {
                LayoutNode layoutNode2 = (LayoutNode) objArr[i3];
                if ((!z2 && i(layoutNode2)) || (z2 && (layoutNode2.z() == LayoutNode.UsageByParent.f15970a || ((lookaheadPassDelegate = layoutNode2.C.f15996s) != null && (lookaheadAlignmentLines = lookaheadPassDelegate.f16011s) != null && lookaheadAlignmentLines.f())))) {
                    boolean a2 = LayoutNodeLayoutDelegateKt.a(layoutNode2);
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode2.C;
                    if (a2 && !z2) {
                        if (layoutNodeLayoutDelegate.f15984g && depthSortedSetsForDifferentPasses.b(layoutNode2, true)) {
                            m(layoutNode2, true, false);
                        } else {
                            f(layoutNode2, true);
                        }
                    }
                    if ((z2 ? layoutNodeLayoutDelegate.f15984g : layoutNodeLayoutDelegate.d) && depthSortedSetsForDifferentPasses.b(layoutNode2, z2)) {
                        m(layoutNode2, z2, false);
                    }
                    if (!(z2 ? layoutNodeLayoutDelegate.f15984g : layoutNodeLayoutDelegate.d)) {
                        g(layoutNode2, z2);
                    }
                }
                i3++;
            } while (i3 < i2);
        }
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNode.C;
        if ((z2 ? layoutNodeLayoutDelegate2.f15984g : layoutNodeLayoutDelegate2.d) && depthSortedSetsForDifferentPasses.b(layoutNode, z2)) {
            m(layoutNode, z2, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j(q0.a aVar) {
        boolean z2;
        LayoutNode layoutNode;
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.f16074b;
        LayoutNode layoutNode2 = this.f16073a;
        if (!layoutNode2.M()) {
            InlineClassHelperKt.a("performMeasureAndLayout called with unattached root");
            throw null;
        }
        if (!layoutNode2.N()) {
            InlineClassHelperKt.a("performMeasureAndLayout called with unplaced root");
            throw null;
        }
        if (!(!this.f16075c)) {
            InlineClassHelperKt.a("performMeasureAndLayout called during measure layout");
            throw null;
        }
        int i2 = 0;
        byte b2 = 0;
        byte b3 = 0;
        if (this.f16079i != null) {
            this.f16075c = true;
            this.d = true;
            try {
                if (depthSortedSetsForDifferentPasses.c()) {
                    z2 = false;
                    while (true) {
                        boolean c2 = depthSortedSetsForDifferentPasses.c();
                        DepthSortedSet depthSortedSet = depthSortedSetsForDifferentPasses.f15914a;
                        if (!c2) {
                            break;
                        }
                        boolean z3 = !depthSortedSet.f15912c.isEmpty();
                        if (z3) {
                            layoutNode = (LayoutNode) depthSortedSet.f15912c.first();
                        } else {
                            depthSortedSet = depthSortedSetsForDifferentPasses.f15915b;
                            layoutNode = (LayoutNode) depthSortedSet.f15912c.first();
                        }
                        depthSortedSet.c(layoutNode);
                        boolean m2 = m(layoutNode, z3, true);
                        if (layoutNode == layoutNode2 && m2) {
                            z2 = true;
                        }
                    }
                    if (aVar != null) {
                        aVar.invoke();
                    }
                } else {
                    z2 = false;
                }
            } finally {
                this.f16075c = false;
                this.d = false;
            }
        } else {
            z2 = false;
        }
        MutableVector mutableVector = this.f16076f;
        int i3 = mutableVector.f14144c;
        if (i3 > 0) {
            Object[] objArr = mutableVector.f14142a;
            do {
                ((Owner.OnLayoutCompletedListener) objArr[i2]).h();
                i2++;
            } while (i2 < i3);
        }
        mutableVector.g();
        return z2;
    }

    public final void k(LayoutNode layoutNode, long j2) {
        if (layoutNode.L) {
            return;
        }
        LayoutNode layoutNode2 = this.f16073a;
        if (!(!p0.a.g(layoutNode, layoutNode2))) {
            InlineClassHelperKt.a("measureAndLayout called on root");
            throw null;
        }
        if (!layoutNode2.M()) {
            InlineClassHelperKt.a("performMeasureAndLayout called with unattached root");
            throw null;
        }
        if (!layoutNode2.N()) {
            InlineClassHelperKt.a("performMeasureAndLayout called with unplaced root");
            throw null;
        }
        if (!(!this.f16075c)) {
            InlineClassHelperKt.a("performMeasureAndLayout called during measure layout");
            throw null;
        }
        int i2 = 0;
        if (this.f16079i != null) {
            this.f16075c = true;
            this.d = false;
            try {
                DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.f16074b;
                depthSortedSetsForDifferentPasses.f15914a.c(layoutNode);
                depthSortedSetsForDifferentPasses.f15915b.c(layoutNode);
                boolean b2 = b(layoutNode, new Constraints(j2));
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.C;
                if ((b2 || layoutNodeLayoutDelegate.f15985h) && p0.a.g(layoutNode.O(), Boolean.TRUE)) {
                    layoutNode.P();
                }
                e(layoutNode);
                c(layoutNode, new Constraints(j2));
                if (layoutNodeLayoutDelegate.e && layoutNode.N()) {
                    layoutNode.X();
                    this.e.f16152a.b(layoutNode);
                    layoutNode.K = true;
                }
                d();
                this.f16075c = false;
                this.d = false;
            } catch (Throwable th) {
                this.f16075c = false;
                this.d = false;
                throw th;
            }
        }
        MutableVector mutableVector = this.f16076f;
        int i3 = mutableVector.f14144c;
        if (i3 > 0) {
            Object[] objArr = mutableVector.f14142a;
            do {
                ((Owner.OnLayoutCompletedListener) objArr[i2]).h();
                i2++;
            } while (i2 < i3);
        }
        mutableVector.g();
    }

    public final void l() {
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.f16074b;
        if (depthSortedSetsForDifferentPasses.c()) {
            LayoutNode layoutNode = this.f16073a;
            if (!layoutNode.M()) {
                InlineClassHelperKt.a("performMeasureAndLayout called with unattached root");
                throw null;
            }
            if (!layoutNode.N()) {
                InlineClassHelperKt.a("performMeasureAndLayout called with unplaced root");
                throw null;
            }
            if (!(!this.f16075c)) {
                InlineClassHelperKt.a("performMeasureAndLayout called during measure layout");
                throw null;
            }
            if (this.f16079i != null) {
                this.f16075c = true;
                this.d = false;
                try {
                    if (!depthSortedSetsForDifferentPasses.f15914a.f15912c.isEmpty()) {
                        if (layoutNode.f15944f != null) {
                            o(layoutNode, true);
                        } else {
                            n(layoutNode);
                        }
                    }
                    o(layoutNode, false);
                    this.f16075c = false;
                    this.d = false;
                } catch (Throwable th) {
                    this.f16075c = false;
                    this.d = false;
                    throw th;
                }
            }
        }
    }

    public final boolean m(LayoutNode layoutNode, boolean z2, boolean z3) {
        Constraints constraints;
        Placeable.PlacementScope placementScope;
        InnerNodeCoordinator innerNodeCoordinator;
        LayoutNode B;
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate;
        LookaheadAlignmentLines lookaheadAlignmentLines;
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate2;
        LookaheadAlignmentLines lookaheadAlignmentLines2;
        if (layoutNode.L) {
            return false;
        }
        boolean N = layoutNode.N();
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.C;
        if (N || layoutNodeLayoutDelegate.f15995r.f16040u || h(layoutNode) || p0.a.g(layoutNode.O(), Boolean.TRUE) || ((layoutNodeLayoutDelegate.f15984g && (layoutNode.z() == LayoutNode.UsageByParent.f15970a || ((lookaheadPassDelegate2 = layoutNodeLayoutDelegate.f15996s) != null && (lookaheadAlignmentLines2 = lookaheadPassDelegate2.f16011s) != null && lookaheadAlignmentLines2.f()))) || layoutNodeLayoutDelegate.f15995r.f16041v.f() || ((lookaheadPassDelegate = layoutNodeLayoutDelegate.f15996s) != null && (lookaheadAlignmentLines = lookaheadPassDelegate.f16011s) != null && lookaheadAlignmentLines.f()))) {
            LayoutNode layoutNode2 = this.f16073a;
            if (layoutNode == layoutNode2) {
                constraints = this.f16079i;
                p0.a.p(constraints);
            } else {
                constraints = null;
            }
            if (z2) {
                r1 = layoutNodeLayoutDelegate.f15984g ? b(layoutNode, constraints) : false;
                if (z3 && ((r1 || layoutNodeLayoutDelegate.f15985h) && p0.a.g(layoutNode.O(), Boolean.TRUE))) {
                    layoutNode.P();
                }
            } else {
                boolean c2 = layoutNodeLayoutDelegate.d ? c(layoutNode, constraints) : false;
                if (z3 && layoutNodeLayoutDelegate.e && (layoutNode == layoutNode2 || ((B = layoutNode.B()) != null && B.N() && layoutNodeLayoutDelegate.f15995r.f16040u))) {
                    if (layoutNode == layoutNode2) {
                        if (layoutNode.f15961y == LayoutNode.UsageByParent.f15972c) {
                            layoutNode.p();
                        }
                        LayoutNode B2 = layoutNode.B();
                        if (B2 == null || (innerNodeCoordinator = B2.B.f16089b) == null || (placementScope = innerNodeCoordinator.f16056j) == null) {
                            placementScope = LayoutNodeKt.a(layoutNode).getPlacementScope();
                        }
                        Placeable.PlacementScope.h(placementScope, layoutNodeLayoutDelegate.f15995r, 0, 0);
                    } else {
                        layoutNode.X();
                    }
                    this.e.f16152a.b(layoutNode);
                    layoutNode.K = true;
                }
                r1 = c2;
            }
            d();
        }
        return r1;
    }

    public final void n(LayoutNode layoutNode) {
        MutableVector E = layoutNode.E();
        int i2 = E.f14144c;
        if (i2 > 0) {
            Object[] objArr = E.f14142a;
            int i3 = 0;
            do {
                LayoutNode layoutNode2 = (LayoutNode) objArr[i3];
                if (i(layoutNode2)) {
                    if (LayoutNodeLayoutDelegateKt.a(layoutNode2)) {
                        o(layoutNode2, true);
                    } else {
                        n(layoutNode2);
                    }
                }
                i3++;
            } while (i3 < i2);
        }
    }

    public final void o(LayoutNode layoutNode, boolean z2) {
        Constraints constraints;
        if (layoutNode.L) {
            return;
        }
        if (layoutNode == this.f16073a) {
            constraints = this.f16079i;
            p0.a.p(constraints);
        } else {
            constraints = null;
        }
        if (z2) {
            b(layoutNode, constraints);
        } else {
            c(layoutNode, constraints);
        }
    }

    public final boolean p(LayoutNode layoutNode, boolean z2) {
        int ordinal = layoutNode.C.f15982c.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return false;
        }
        if (ordinal == 2 || ordinal == 3) {
            this.f16078h.b(new PostponedRequest(layoutNode, false, z2));
            return false;
        }
        if (ordinal != 4) {
            throw new RuntimeException();
        }
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.C;
        if (layoutNodeLayoutDelegate.d && !z2) {
            return false;
        }
        layoutNodeLayoutDelegate.d = true;
        if (layoutNode.L) {
            return false;
        }
        if (!layoutNode.N() && !h(layoutNode)) {
            return false;
        }
        LayoutNode B = layoutNode.B();
        if (B == null || !B.C.d) {
            this.f16074b.a(layoutNode, false);
        }
        return !this.d;
    }

    public final void q(long j2) {
        Constraints constraints = this.f16079i;
        if (constraints != null && Constraints.c(constraints.f17480a, j2)) {
            return;
        }
        if (!(!this.f16075c)) {
            InlineClassHelperKt.a("updateRootConstraints called while measuring");
            throw null;
        }
        this.f16079i = new Constraints(j2);
        LayoutNode layoutNode = this.f16073a;
        LayoutNode layoutNode2 = layoutNode.f15944f;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.C;
        if (layoutNode2 != null) {
            layoutNodeLayoutDelegate.f15984g = true;
        }
        layoutNodeLayoutDelegate.d = true;
        this.f16074b.a(layoutNode, layoutNode2 != null);
    }
}
