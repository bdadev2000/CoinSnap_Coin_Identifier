package androidx.compose.ui.node;

import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import com.google.android.gms.common.api.Api;
import java.util.List;
import org.objectweb.asm.Opcodes;
import q0.l;

@StabilityInferred
/* loaded from: classes.dex */
public final class LayoutNode implements ComposeNodeLifecycleCallback, Remeasurement, OwnerScope, LayoutInfo, ComposeUiNode, InteroperableComposeUiNode, Owner.OnLayoutCompletedListener {
    public static final LayoutNode$Companion$ErrorMeasurePolicy$1 M = new NoIntrinsicsMeasurePolicy("Undefined intrinsics block and it is required");
    public static final LayoutNode$Companion$DummyViewConfiguration$1 N = new Object();
    public static final a O = new a(0);
    public boolean A;
    public final NodeChain B;
    public final LayoutNodeLayoutDelegate C;
    public LayoutNodeSubcompositionsState D;
    public NodeCoordinator E;
    public boolean F;
    public Modifier G;
    public Modifier H;
    public l I;
    public l J;
    public boolean K;
    public boolean L;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15941a;

    /* renamed from: b, reason: collision with root package name */
    public int f15942b;

    /* renamed from: c, reason: collision with root package name */
    public int f15943c;
    public boolean d;

    /* renamed from: f, reason: collision with root package name */
    public LayoutNode f15944f;

    /* renamed from: g, reason: collision with root package name */
    public int f15945g;

    /* renamed from: h, reason: collision with root package name */
    public final MutableVectorWithMutationTracking f15946h;

    /* renamed from: i, reason: collision with root package name */
    public MutableVector f15947i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f15948j;

    /* renamed from: k, reason: collision with root package name */
    public LayoutNode f15949k;

    /* renamed from: l, reason: collision with root package name */
    public Owner f15950l;

    /* renamed from: m, reason: collision with root package name */
    public AndroidViewHolder f15951m;

    /* renamed from: n, reason: collision with root package name */
    public int f15952n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f15953o;

    /* renamed from: p, reason: collision with root package name */
    public SemanticsConfiguration f15954p;

    /* renamed from: q, reason: collision with root package name */
    public final MutableVector f15955q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f15956r;

    /* renamed from: s, reason: collision with root package name */
    public MeasurePolicy f15957s;

    /* renamed from: t, reason: collision with root package name */
    public IntrinsicsPolicy f15958t;

    /* renamed from: u, reason: collision with root package name */
    public Density f15959u;

    /* renamed from: v, reason: collision with root package name */
    public LayoutDirection f15960v;
    public ViewConfiguration w;
    public CompositionLocalMap x;

    /* renamed from: y, reason: collision with root package name */
    public UsageByParent f15961y;

    /* renamed from: z, reason: collision with root package name */
    public UsageByParent f15962z;

    /* loaded from: classes.dex */
    public static final class Companion {
        public static q0.a a() {
            return LayoutNode$Companion$Constructor$1.f15963a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class LayoutState {

        /* renamed from: a, reason: collision with root package name */
        public static final LayoutState f15964a;

        /* renamed from: b, reason: collision with root package name */
        public static final LayoutState f15965b;

        /* renamed from: c, reason: collision with root package name */
        public static final LayoutState f15966c;
        public static final LayoutState d;

        /* renamed from: f, reason: collision with root package name */
        public static final LayoutState f15967f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ LayoutState[] f15968g;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.ui.node.LayoutNode$LayoutState] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.ui.node.LayoutNode$LayoutState] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.ui.node.LayoutNode$LayoutState] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.compose.ui.node.LayoutNode$LayoutState] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.compose.ui.node.LayoutNode$LayoutState] */
        static {
            ?? r02 = new Enum("Measuring", 0);
            f15964a = r02;
            ?? r1 = new Enum("LookaheadMeasuring", 1);
            f15965b = r1;
            ?? r2 = new Enum("LayingOut", 2);
            f15966c = r2;
            ?? r3 = new Enum("LookaheadLayingOut", 3);
            d = r3;
            ?? r4 = new Enum("Idle", 4);
            f15967f = r4;
            f15968g = new LayoutState[]{r02, r1, r2, r3, r4};
        }

        public static LayoutState valueOf(String str) {
            return (LayoutState) Enum.valueOf(LayoutState.class, str);
        }

        public static LayoutState[] values() {
            return (LayoutState[]) f15968g.clone();
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        public final String f15969a;

        public NoIntrinsicsMeasurePolicy(String str) {
            this.f15969a = str;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            throw new IllegalStateException(this.f15969a.toString());
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            throw new IllegalStateException(this.f15969a.toString());
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            throw new IllegalStateException(this.f15969a.toString());
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            throw new IllegalStateException(this.f15969a.toString());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class UsageByParent {

        /* renamed from: a, reason: collision with root package name */
        public static final UsageByParent f15970a;

        /* renamed from: b, reason: collision with root package name */
        public static final UsageByParent f15971b;

        /* renamed from: c, reason: collision with root package name */
        public static final UsageByParent f15972c;
        public static final /* synthetic */ UsageByParent[] d;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.node.LayoutNode$UsageByParent, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.node.LayoutNode$UsageByParent, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.node.LayoutNode$UsageByParent, java.lang.Enum] */
        static {
            ?? r02 = new Enum("InMeasureBlock", 0);
            f15970a = r02;
            ?? r1 = new Enum("InLayoutBlock", 1);
            f15971b = r1;
            ?? r2 = new Enum("NotUsed", 2);
            f15972c = r2;
            d = new UsageByParent[]{r02, r1, r2};
        }

        public static UsageByParent valueOf(String str) {
            return (UsageByParent) Enum.valueOf(UsageByParent.class, str);
        }

        public static UsageByParent[] values() {
            return (UsageByParent[]) d.clone();
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15973a;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f15973a = iArr;
        }
    }

    public LayoutNode(boolean z2, int i2, int i3) {
        this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0 ? SemanticsModifierKt.f16818a.addAndGet(1) : 0);
    }

    public static boolean U(LayoutNode layoutNode) {
        LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = layoutNode.C.f15995r;
        return layoutNode.T(measurePassDelegate.f16029j ? new Constraints(measurePassDelegate.d) : null);
    }

    public static void Z(LayoutNode layoutNode, boolean z2, int i2) {
        LayoutNode B;
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        boolean z3 = (i2 & 2) != 0;
        boolean z4 = (i2 & 4) != 0;
        if (layoutNode.f15944f == null) {
            InlineClassHelperKt.b("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
            throw null;
        }
        Owner owner = layoutNode.f15950l;
        if (owner == null || layoutNode.f15953o || layoutNode.f15941a) {
            return;
        }
        owner.q(layoutNode, true, z2, z3);
        if (z4) {
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = layoutNode.C.f15996s;
            p0.a.p(lookaheadPassDelegate);
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LayoutNode B2 = layoutNodeLayoutDelegate.f15980a.B();
            UsageByParent usageByParent = layoutNodeLayoutDelegate.f15980a.f15961y;
            if (B2 == null || usageByParent == UsageByParent.f15972c) {
                return;
            }
            while (B2.f15961y == usageByParent && (B = B2.B()) != null) {
                B2 = B;
            }
            int ordinal = usageByParent.ordinal();
            if (ordinal == 0) {
                if (B2.f15944f != null) {
                    Z(B2, z2, 6);
                    return;
                } else {
                    b0(B2, z2, 6);
                    return;
                }
            }
            if (ordinal != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
            }
            if (B2.f15944f != null) {
                B2.Y(z2);
            } else {
                B2.a0(z2);
            }
        }
    }

    public static void b0(LayoutNode layoutNode, boolean z2, int i2) {
        Owner owner;
        LayoutNode B;
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        boolean z3 = (i2 & 2) != 0;
        boolean z4 = (i2 & 4) != 0;
        if (layoutNode.f15953o || layoutNode.f15941a || (owner = layoutNode.f15950l) == null) {
            return;
        }
        owner.q(layoutNode, false, z2, z3);
        if (z4) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LayoutNode B2 = layoutNodeLayoutDelegate.f15980a.B();
            UsageByParent usageByParent = layoutNodeLayoutDelegate.f15980a.f15961y;
            if (B2 == null || usageByParent == UsageByParent.f15972c) {
                return;
            }
            while (B2.f15961y == usageByParent && (B = B2.B()) != null) {
                B2 = B;
            }
            int ordinal = usageByParent.ordinal();
            if (ordinal == 0) {
                b0(B2, z2, 6);
            } else {
                if (ordinal != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
                B2.a0(z2);
            }
        }
    }

    public static void c0(LayoutNode layoutNode) {
        int i2 = WhenMappings.f15973a[layoutNode.C.f15982c.ordinal()];
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.C;
        if (i2 != 1) {
            throw new IllegalStateException("Unexpected state " + layoutNodeLayoutDelegate.f15982c);
        }
        if (layoutNodeLayoutDelegate.f15984g) {
            Z(layoutNode, true, 6);
            return;
        }
        if (layoutNodeLayoutDelegate.f15985h) {
            layoutNode.Y(true);
        }
        if (layoutNodeLayoutDelegate.d) {
            b0(layoutNode, true, 6);
        } else if (layoutNodeLayoutDelegate.e) {
            layoutNode.a0(true);
        }
    }

    public final IntrinsicsPolicy A() {
        IntrinsicsPolicy intrinsicsPolicy = this.f15958t;
        if (intrinsicsPolicy != null) {
            return intrinsicsPolicy;
        }
        IntrinsicsPolicy intrinsicsPolicy2 = new IntrinsicsPolicy(this, this.f15957s);
        this.f15958t = intrinsicsPolicy2;
        return intrinsicsPolicy2;
    }

    public final LayoutNode B() {
        LayoutNode layoutNode = this.f15949k;
        while (layoutNode != null && layoutNode.f15941a) {
            layoutNode = layoutNode.f15949k;
        }
        return layoutNode;
    }

    public final int C() {
        return this.C.f15995r.f16028i;
    }

    public final MutableVector D() {
        boolean z2 = this.f15956r;
        MutableVector mutableVector = this.f15955q;
        if (z2) {
            mutableVector.g();
            mutableVector.c(mutableVector.f14144c, E());
            mutableVector.q(O);
            this.f15956r = false;
        }
        return mutableVector;
    }

    public final MutableVector E() {
        f0();
        if (this.f15945g == 0) {
            return this.f15946h.f16083a;
        }
        MutableVector mutableVector = this.f15947i;
        p0.a.p(mutableVector);
        return mutableVector;
    }

    public final void F(long j2, HitTestResult hitTestResult, boolean z2, boolean z3) {
        NodeChain nodeChain = this.B;
        NodeCoordinator nodeCoordinator = nodeChain.f16090c;
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = NodeCoordinator.I;
        nodeChain.f16090c.o1(NodeCoordinator.L, nodeCoordinator.g1(j2, true), hitTestResult, z2, z3);
    }

    public final void G(int i2, LayoutNode layoutNode) {
        if (!(layoutNode.f15949k == null)) {
            StringBuilder sb = new StringBuilder("Cannot insert ");
            sb.append(layoutNode);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(q(0));
            sb.append(" Other tree: ");
            LayoutNode layoutNode2 = layoutNode.f15949k;
            sb.append(layoutNode2 != null ? layoutNode2.q(0) : null);
            InlineClassHelperKt.b(sb.toString());
            throw null;
        }
        if (layoutNode.f15950l != null) {
            InlineClassHelperKt.b("Cannot insert " + layoutNode + " because it already has an owner. This tree: " + q(0) + " Other tree: " + layoutNode.q(0));
            throw null;
        }
        layoutNode.f15949k = this;
        MutableVectorWithMutationTracking mutableVectorWithMutationTracking = this.f15946h;
        mutableVectorWithMutationTracking.f16083a.a(i2, layoutNode);
        mutableVectorWithMutationTracking.f16084b.invoke();
        S();
        if (layoutNode.f15941a) {
            this.f15945g++;
        }
        L();
        Owner owner = this.f15950l;
        if (owner != null) {
            layoutNode.n(owner);
        }
        if (layoutNode.C.f15991n > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.C;
            layoutNodeLayoutDelegate.c(layoutNodeLayoutDelegate.f15991n + 1);
        }
    }

    public final void H() {
        if (this.F) {
            NodeChain nodeChain = this.B;
            NodeCoordinator nodeCoordinator = nodeChain.f16089b;
            NodeCoordinator nodeCoordinator2 = nodeChain.f16090c.f16104q;
            this.E = null;
            while (true) {
                if (p0.a.g(nodeCoordinator, nodeCoordinator2)) {
                    break;
                }
                if ((nodeCoordinator != null ? nodeCoordinator.G : null) != null) {
                    this.E = nodeCoordinator;
                    break;
                }
                nodeCoordinator = nodeCoordinator != null ? nodeCoordinator.f16104q : null;
            }
        }
        NodeCoordinator nodeCoordinator3 = this.E;
        if (nodeCoordinator3 != null && nodeCoordinator3.G == null) {
            InlineClassHelperKt.c("layer was not set");
            throw null;
        }
        if (nodeCoordinator3 != null) {
            nodeCoordinator3.q1();
            return;
        }
        LayoutNode B = B();
        if (B != null) {
            B.H();
        }
    }

    public final void I() {
        NodeChain nodeChain = this.B;
        NodeCoordinator nodeCoordinator = nodeChain.f16090c;
        InnerNodeCoordinator innerNodeCoordinator = nodeChain.f16089b;
        while (nodeCoordinator != innerNodeCoordinator) {
            p0.a.q(nodeCoordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) nodeCoordinator;
            OwnedLayer ownedLayer = layoutModifierNodeCoordinator.G;
            if (ownedLayer != null) {
                ownedLayer.invalidate();
            }
            nodeCoordinator = layoutModifierNodeCoordinator.f16103p;
        }
        OwnedLayer ownedLayer2 = nodeChain.f16089b.G;
        if (ownedLayer2 != null) {
            ownedLayer2.invalidate();
        }
    }

    public final void J() {
        if (this.f15944f != null) {
            Z(this, false, 7);
        } else {
            b0(this, false, 7);
        }
    }

    public final void K() {
        this.f15954p = null;
        LayoutNodeKt.a(this).u();
    }

    public final void L() {
        LayoutNode layoutNode;
        if (this.f15945g > 0) {
            this.f15948j = true;
        }
        if (!this.f15941a || (layoutNode = this.f15949k) == null) {
            return;
        }
        layoutNode.L();
    }

    public final boolean M() {
        return this.f15950l != null;
    }

    public final boolean N() {
        return this.C.f15995r.f16039t;
    }

    public final Boolean O() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = this.C.f15996s;
        if (lookaheadPassDelegate != null) {
            return Boolean.valueOf(lookaheadPassDelegate.f16010r);
        }
        return null;
    }

    public final void P() {
        LayoutNode B;
        if (this.f15961y == UsageByParent.f15972c) {
            p();
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = this.C.f15996s;
        p0.a.p(lookaheadPassDelegate);
        try {
            lookaheadPassDelegate.f15999g = true;
            if (!lookaheadPassDelegate.f16004l) {
                InlineClassHelperKt.b("replace() called on item that was not placed");
                throw null;
            }
            lookaheadPassDelegate.f16015y = false;
            boolean z2 = lookaheadPassDelegate.f16010r;
            lookaheadPassDelegate.C0(lookaheadPassDelegate.f16007o, lookaheadPassDelegate.f16008p, lookaheadPassDelegate.f16009q);
            if (z2 && !lookaheadPassDelegate.f16015y && (B = LayoutNodeLayoutDelegate.this.f15980a.B()) != null) {
                B.Y(false);
            }
        } finally {
            lookaheadPassDelegate.f15999g = false;
        }
    }

    public final void Q(int i2, int i3, int i4) {
        if (i2 == i3) {
            return;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i2 > i3 ? i2 + i5 : i2;
            int i7 = i2 > i3 ? i3 + i5 : (i3 + i4) - 2;
            MutableVectorWithMutationTracking mutableVectorWithMutationTracking = this.f15946h;
            Object o2 = mutableVectorWithMutationTracking.f16083a.o(i6);
            q0.a aVar = mutableVectorWithMutationTracking.f16084b;
            aVar.invoke();
            mutableVectorWithMutationTracking.f16083a.a(i7, (LayoutNode) o2);
            aVar.invoke();
        }
        S();
        L();
        J();
    }

    public final void R(LayoutNode layoutNode) {
        if (layoutNode.C.f15991n > 0) {
            this.C.c(r0.f15991n - 1);
        }
        if (this.f15950l != null) {
            layoutNode.r();
        }
        layoutNode.f15949k = null;
        layoutNode.B.f16090c.f16104q = null;
        if (layoutNode.f15941a) {
            this.f15945g--;
            MutableVector mutableVector = layoutNode.f15946h.f16083a;
            int i2 = mutableVector.f14144c;
            if (i2 > 0) {
                Object[] objArr = mutableVector.f14142a;
                int i3 = 0;
                do {
                    ((LayoutNode) objArr[i3]).B.f16090c.f16104q = null;
                    i3++;
                } while (i3 < i2);
            }
        }
        L();
        S();
    }

    public final void S() {
        if (!this.f15941a) {
            this.f15956r = true;
            return;
        }
        LayoutNode B = B();
        if (B != null) {
            B.S();
        }
    }

    public final boolean T(Constraints constraints) {
        if (constraints == null) {
            return false;
        }
        if (this.f15961y == UsageByParent.f15972c) {
            o();
        }
        return this.C.f15995r.K0(constraints.f17480a);
    }

    public final void V() {
        MutableVectorWithMutationTracking mutableVectorWithMutationTracking = this.f15946h;
        int i2 = mutableVectorWithMutationTracking.f16083a.f14144c;
        while (true) {
            i2--;
            MutableVector mutableVector = mutableVectorWithMutationTracking.f16083a;
            if (-1 >= i2) {
                mutableVector.g();
                mutableVectorWithMutationTracking.f16084b.invoke();
                return;
            }
            R((LayoutNode) mutableVector.f14142a[i2]);
        }
    }

    public final void W(int i2, int i3) {
        if (i3 < 0) {
            InlineClassHelperKt.a("count (" + i3 + ") must be greater than 0");
            throw null;
        }
        int i4 = (i3 + i2) - 1;
        if (i2 > i4) {
            return;
        }
        while (true) {
            MutableVectorWithMutationTracking mutableVectorWithMutationTracking = this.f15946h;
            R((LayoutNode) mutableVectorWithMutationTracking.f16083a.f14142a[i4]);
            Object o2 = mutableVectorWithMutationTracking.f16083a.o(i4);
            mutableVectorWithMutationTracking.f16084b.invoke();
            if (i4 == i2) {
                return;
            } else {
                i4--;
            }
        }
    }

    public final void X() {
        LayoutNode B;
        if (this.f15961y == UsageByParent.f15972c) {
            p();
        }
        LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = this.C.f15995r;
        measurePassDelegate.getClass();
        try {
            measurePassDelegate.f16026g = true;
            if (!measurePassDelegate.f16030k) {
                InlineClassHelperKt.b("replace called on unplaced item");
                throw null;
            }
            boolean z2 = measurePassDelegate.f16039t;
            measurePassDelegate.D0(measurePassDelegate.f16033n, measurePassDelegate.f16036q, measurePassDelegate.f16034o, measurePassDelegate.f16035p);
            if (z2 && !measurePassDelegate.B && (B = LayoutNodeLayoutDelegate.this.f15980a.B()) != null) {
                B.a0(false);
            }
        } finally {
            measurePassDelegate.f16026g = false;
        }
    }

    public final void Y(boolean z2) {
        Owner owner;
        if (this.f15941a || (owner = this.f15950l) == null) {
            return;
        }
        owner.b(this, true, z2);
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public final boolean Y0() {
        return M();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public final void a() {
        AndroidViewHolder androidViewHolder = this.f15951m;
        if (androidViewHolder != null) {
            androidViewHolder.a();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.D;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.a();
        }
        NodeChain nodeChain = this.B;
        NodeCoordinator nodeCoordinator = nodeChain.f16089b.f16103p;
        for (NodeCoordinator nodeCoordinator2 = nodeChain.f16090c; !p0.a.g(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.f16103p) {
            nodeCoordinator2.f16105r = true;
            ((NodeCoordinator$invalidateParentLayer$1) nodeCoordinator2.E).invoke();
            if (nodeCoordinator2.G != null) {
                if (nodeCoordinator2.H != null) {
                    nodeCoordinator2.H = null;
                }
                nodeCoordinator2.W1(false, null);
                nodeCoordinator2.f16100m.a0(false);
            }
        }
    }

    public final void a0(boolean z2) {
        Owner owner;
        if (this.f15941a || (owner = this.f15950l) == null) {
            return;
        }
        owner.b(this, false, z2);
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void b(int i2) {
        this.f15943c = i2;
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public final void c() {
        AndroidViewHolder androidViewHolder = this.f15951m;
        if (androidViewHolder != null) {
            androidViewHolder.c();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.D;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.e(true);
        }
        this.L = true;
        NodeChain nodeChain = this.B;
        for (Modifier.Node node = nodeChain.d; node != null; node = node.f14691f) {
            if (node.f14699n) {
                node.Z1();
            }
        }
        Modifier.Node node2 = nodeChain.d;
        for (Modifier.Node node3 = node2; node3 != null; node3 = node3.f14691f) {
            if (node3.f14699n) {
                node3.b2();
            }
        }
        while (node2 != null) {
            if (node2.f14699n) {
                node2.V1();
            }
            node2 = node2.f14691f;
        }
        if (M()) {
            K();
        }
    }

    @Override // androidx.compose.ui.layout.Remeasurement
    public final void d() {
        if (this.f15944f != null) {
            Z(this, false, 5);
        } else {
            b0(this, false, 5);
        }
        LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = this.C.f15995r;
        Constraints constraints = measurePassDelegate.f16029j ? new Constraints(measurePassDelegate.d) : null;
        if (constraints != null) {
            Owner owner = this.f15950l;
            if (owner != null) {
                owner.m(this, constraints.f17480a);
                return;
            }
            return;
        }
        Owner owner2 = this.f15950l;
        if (owner2 != null) {
            owner2.a(true);
        }
    }

    public final void d0() {
        MutableVector E = E();
        int i2 = E.f14144c;
        if (i2 > 0) {
            Object[] objArr = E.f14142a;
            int i3 = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) objArr[i3];
                UsageByParent usageByParent = layoutNode.f15962z;
                layoutNode.f15961y = usageByParent;
                if (usageByParent != UsageByParent.f15972c) {
                    layoutNode.d0();
                }
                i3++;
            } while (i3 < i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void e(ViewConfiguration viewConfiguration) {
        if (p0.a.g(this.w, viewConfiguration)) {
            return;
        }
        this.w = viewConfiguration;
        Modifier.Node node = this.B.e;
        if ((node.d & 16) != 0) {
            while (node != null) {
                if ((node.f14690c & 16) != 0) {
                    DelegatingNode delegatingNode = node;
                    ?? r3 = 0;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof PointerInputModifierNode) {
                            ((PointerInputModifierNode) delegatingNode).J1();
                        } else if ((delegatingNode.f14690c & 16) != 0 && (delegatingNode instanceof DelegatingNode)) {
                            Modifier.Node node2 = delegatingNode.f15909p;
                            int i2 = 0;
                            delegatingNode = delegatingNode;
                            r3 = r3;
                            while (node2 != null) {
                                if ((node2.f14690c & 16) != 0) {
                                    i2++;
                                    r3 = r3;
                                    if (i2 == 1) {
                                        delegatingNode = node2;
                                    } else {
                                        if (r3 == 0) {
                                            r3 = new MutableVector(new Modifier.Node[16]);
                                        }
                                        if (delegatingNode != 0) {
                                            r3.b(delegatingNode);
                                            delegatingNode = 0;
                                        }
                                        r3.b(node2);
                                    }
                                }
                                node2 = node2.f14692g;
                                delegatingNode = delegatingNode;
                                r3 = r3;
                            }
                            if (i2 == 1) {
                            }
                        }
                        delegatingNode = DelegatableNodeKt.b(r3);
                    }
                }
                if ((node.d & 16) == 0) {
                    return;
                } else {
                    node = node.f14692g;
                }
            }
        }
    }

    public final void e0(LayoutNode layoutNode) {
        if (p0.a.g(layoutNode, this.f15944f)) {
            return;
        }
        this.f15944f = layoutNode;
        if (layoutNode != null) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.C;
            if (layoutNodeLayoutDelegate.f15996s == null) {
                layoutNodeLayoutDelegate.f15996s = new LayoutNodeLayoutDelegate.LookaheadPassDelegate();
            }
            NodeChain nodeChain = this.B;
            NodeCoordinator nodeCoordinator = nodeChain.f16089b.f16103p;
            for (NodeCoordinator nodeCoordinator2 = nodeChain.f16090c; !p0.a.g(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.f16103p) {
                nodeCoordinator2.X0();
            }
        }
        J();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public final void f() {
        if (!M()) {
            InlineClassHelperKt.a("onReuse is only expected on attached node");
            throw null;
        }
        AndroidViewHolder androidViewHolder = this.f15951m;
        if (androidViewHolder != null) {
            androidViewHolder.f();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.D;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.e(false);
        }
        boolean z2 = this.L;
        NodeChain nodeChain = this.B;
        if (z2) {
            this.L = false;
            K();
        } else {
            for (Modifier.Node node = nodeChain.d; node != null; node = node.f14691f) {
                if (node.f14699n) {
                    node.Z1();
                }
            }
            Modifier.Node node2 = nodeChain.d;
            for (Modifier.Node node3 = node2; node3 != null; node3 = node3.f14691f) {
                if (node3.f14699n) {
                    node3.b2();
                }
            }
            while (node2 != null) {
                if (node2.f14699n) {
                    node2.V1();
                }
                node2 = node2.f14691f;
            }
        }
        this.f15942b = SemanticsModifierKt.f16818a.addAndGet(1);
        for (Modifier.Node node4 = nodeChain.e; node4 != null; node4 = node4.f14692g) {
            node4.U1();
        }
        nodeChain.e();
        c0(this);
    }

    public final void f0() {
        if (this.f15945g <= 0 || !this.f15948j) {
            return;
        }
        int i2 = 0;
        this.f15948j = false;
        MutableVector mutableVector = this.f15947i;
        if (mutableVector == null) {
            mutableVector = new MutableVector(new LayoutNode[16]);
            this.f15947i = mutableVector;
        }
        mutableVector.g();
        MutableVector mutableVector2 = this.f15946h.f16083a;
        int i3 = mutableVector2.f14144c;
        if (i3 > 0) {
            Object[] objArr = mutableVector2.f14142a;
            do {
                LayoutNode layoutNode = (LayoutNode) objArr[i2];
                if (layoutNode.f15941a) {
                    mutableVector.c(mutableVector.f14144c, layoutNode.E());
                } else {
                    mutableVector.b(layoutNode);
                }
                i2++;
            } while (i2 < i3);
        }
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.C;
        layoutNodeLayoutDelegate.f15995r.x = true;
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.f15996s;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.f16013u = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void g(LayoutDirection layoutDirection) {
        if (this.f15960v != layoutDirection) {
            this.f15960v = layoutDirection;
            J();
            LayoutNode B = B();
            if (B != null) {
                B.H();
            }
            I();
            Modifier.Node node = this.B.e;
            if ((node.d & 4) != 0) {
                while (node != null) {
                    if ((node.f14690c & 4) != 0) {
                        DelegatingNode delegatingNode = node;
                        ?? r2 = 0;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof DrawModifierNode) {
                                DrawModifierNode drawModifierNode = (DrawModifierNode) delegatingNode;
                                if (drawModifierNode instanceof CacheDrawModifierNode) {
                                    ((CacheDrawModifierNode) drawModifierNode).V0();
                                }
                            } else if ((delegatingNode.f14690c & 4) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node node2 = delegatingNode.f15909p;
                                int i2 = 0;
                                delegatingNode = delegatingNode;
                                r2 = r2;
                                while (node2 != null) {
                                    if ((node2.f14690c & 4) != 0) {
                                        i2++;
                                        r2 = r2;
                                        if (i2 == 1) {
                                            delegatingNode = node2;
                                        } else {
                                            if (r2 == 0) {
                                                r2 = new MutableVector(new Modifier.Node[16]);
                                            }
                                            if (delegatingNode != 0) {
                                                r2.b(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            r2.b(node2);
                                        }
                                    }
                                    node2 = node2.f14692g;
                                    delegatingNode = delegatingNode;
                                    r2 = r2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            delegatingNode = DelegatableNodeKt.b(r2);
                        }
                    }
                    if ((node.d & 4) == 0) {
                        return;
                    } else {
                        node = node.f14692g;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // androidx.compose.ui.node.Owner.OnLayoutCompletedListener
    public final void h() {
        Modifier.Node node;
        NodeChain nodeChain = this.B;
        InnerNodeCoordinator innerNodeCoordinator = nodeChain.f16089b;
        boolean h2 = NodeKindKt.h(128);
        if (h2) {
            node = innerNodeCoordinator.N;
        } else {
            node = innerNodeCoordinator.N.f14691f;
            if (node == null) {
                return;
            }
        }
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = NodeCoordinator.I;
        for (Modifier.Node m1 = innerNodeCoordinator.m1(h2); m1 != null && (m1.d & 128) != 0; m1 = m1.f14692g) {
            if ((m1.f14690c & 128) != 0) {
                DelegatingNode delegatingNode = m1;
                ?? r6 = 0;
                while (delegatingNode != 0) {
                    if (delegatingNode instanceof LayoutAwareModifierNode) {
                        ((LayoutAwareModifierNode) delegatingNode).F(nodeChain.f16089b);
                    } else if ((delegatingNode.f14690c & 128) != 0 && (delegatingNode instanceof DelegatingNode)) {
                        Modifier.Node node2 = delegatingNode.f15909p;
                        int i2 = 0;
                        delegatingNode = delegatingNode;
                        r6 = r6;
                        while (node2 != null) {
                            if ((node2.f14690c & 128) != 0) {
                                i2++;
                                r6 = r6;
                                if (i2 == 1) {
                                    delegatingNode = node2;
                                } else {
                                    if (r6 == 0) {
                                        r6 = new MutableVector(new Modifier.Node[16]);
                                    }
                                    if (delegatingNode != 0) {
                                        r6.b(delegatingNode);
                                        delegatingNode = 0;
                                    }
                                    r6.b(node2);
                                }
                            }
                            node2 = node2.f14692g;
                            delegatingNode = delegatingNode;
                            r6 = r6;
                        }
                        if (i2 == 1) {
                        }
                    }
                    delegatingNode = DelegatableNodeKt.b(r6);
                }
            }
            if (m1 == node) {
                return;
            }
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void i(MeasurePolicy measurePolicy) {
        if (p0.a.g(this.f15957s, measurePolicy)) {
            return;
        }
        this.f15957s = measurePolicy;
        IntrinsicsPolicy intrinsicsPolicy = this.f15958t;
        if (intrinsicsPolicy != null) {
            intrinsicsPolicy.f15929b.setValue(measurePolicy);
        }
        J();
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void j(Modifier modifier) {
        if (!(!this.f15941a || this.G == Modifier.Companion.f14687a)) {
            InlineClassHelperKt.a("Modifiers are not supported on virtual LayoutNodes");
            throw null;
        }
        if (!(!this.L)) {
            InlineClassHelperKt.a("modifier is updated when deactivated");
            throw null;
        }
        if (M()) {
            m(modifier);
        } else {
            this.H = modifier;
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void k(Density density) {
        if (p0.a.g(this.f15959u, density)) {
            return;
        }
        this.f15959u = density;
        J();
        LayoutNode B = B();
        if (B != null) {
            B.H();
        }
        I();
        for (Modifier.Node node = this.B.e; node != null; node = node.f14692g) {
            if ((node.f14690c & 16) != 0) {
                ((PointerInputModifierNode) node).v1();
            } else if (node instanceof CacheDrawModifierNode) {
                ((CacheDrawModifierNode) node).V0();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void l(CompositionLocalMap compositionLocalMap) {
        this.x = compositionLocalMap;
        k((Density) compositionLocalMap.b(CompositionLocalsKt.f16434f));
        g((LayoutDirection) compositionLocalMap.b(CompositionLocalsKt.f16440l));
        e((ViewConfiguration) compositionLocalMap.b(CompositionLocalsKt.f16445q));
        Modifier.Node node = this.B.e;
        if ((node.d & 32768) != 0) {
            while (node != null) {
                if ((node.f14690c & 32768) != 0) {
                    DelegatingNode delegatingNode = node;
                    ?? r3 = 0;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof CompositionLocalConsumerModifierNode) {
                            Modifier.Node z02 = ((CompositionLocalConsumerModifierNode) delegatingNode).z0();
                            if (z02.f14699n) {
                                NodeKindKt.d(z02);
                            } else {
                                z02.f14696k = true;
                            }
                        } else if ((delegatingNode.f14690c & 32768) != 0 && (delegatingNode instanceof DelegatingNode)) {
                            Modifier.Node node2 = delegatingNode.f15909p;
                            int i2 = 0;
                            delegatingNode = delegatingNode;
                            r3 = r3;
                            while (node2 != null) {
                                if ((node2.f14690c & 32768) != 0) {
                                    i2++;
                                    r3 = r3;
                                    if (i2 == 1) {
                                        delegatingNode = node2;
                                    } else {
                                        if (r3 == 0) {
                                            r3 = new MutableVector(new Modifier.Node[16]);
                                        }
                                        if (delegatingNode != 0) {
                                            r3.b(delegatingNode);
                                            delegatingNode = 0;
                                        }
                                        r3.b(node2);
                                    }
                                }
                                node2 = node2.f14692g;
                                delegatingNode = delegatingNode;
                                r3 = r3;
                            }
                            if (i2 == 1) {
                            }
                        }
                        delegatingNode = DelegatableNodeKt.b(r3);
                    }
                }
                if ((node.d & 32768) == 0) {
                    return;
                } else {
                    node = node.f14692g;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ab, code lost:
    
        r4 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b1, code lost:
    
        if (r3 >= r1) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b3, code lost:
    
        if (r8 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b5, code lost:
    
        if (r4 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b9, code lost:
    
        if (r5.H == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bb, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bc, code lost:
    
        r6.f(r3, r8, r9, r4, r0 ^ 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c8, code lost:
    
        androidx.compose.ui.internal.InlineClassHelperKt.c("structuralUpdate requires a non-null tail");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00cd, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ce, code lost:
    
        androidx.compose.ui.internal.InlineClassHelperKt.c("expected prior modifier list to be non-empty");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d1, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0145  */
    /* JADX WARN: Type inference failed for: r1v13, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.compose.ui.node.NodeChain] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(androidx.compose.ui.Modifier r15) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.m(androidx.compose.ui.Modifier):void");
    }

    public final void n(Owner owner) {
        LayoutNode layoutNode;
        if (!(this.f15950l == null)) {
            InlineClassHelperKt.b("Cannot attach " + this + " as it already is attached.  Tree: " + q(0));
            throw null;
        }
        LayoutNode layoutNode2 = this.f15949k;
        if (layoutNode2 != null && !p0.a.g(layoutNode2.f15950l, owner)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(owner);
            sb.append(") than the parent's owner(");
            LayoutNode B = B();
            sb.append(B != null ? B.f15950l : null);
            sb.append("). This tree: ");
            sb.append(q(0));
            sb.append(" Parent tree: ");
            LayoutNode layoutNode3 = this.f15949k;
            sb.append(layoutNode3 != null ? layoutNode3.q(0) : null);
            InlineClassHelperKt.b(sb.toString());
            throw null;
        }
        LayoutNode B2 = B();
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.C;
        if (B2 == null) {
            layoutNodeLayoutDelegate.f15995r.f16039t = true;
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.f15996s;
            if (lookaheadPassDelegate != null) {
                lookaheadPassDelegate.f16010r = true;
            }
        }
        NodeChain nodeChain = this.B;
        nodeChain.f16090c.f16104q = B2 != null ? B2.B.f16089b : null;
        this.f15950l = owner;
        this.f15952n = (B2 != null ? B2.f15952n : -1) + 1;
        Modifier modifier = this.H;
        if (modifier != null) {
            m(modifier);
        }
        this.H = null;
        if (nodeChain.d(8)) {
            K();
        }
        owner.f();
        if (this.d) {
            e0(this);
        } else {
            LayoutNode layoutNode4 = this.f15949k;
            if (layoutNode4 == null || (layoutNode = layoutNode4.f15944f) == null) {
                layoutNode = this.f15944f;
            }
            e0(layoutNode);
            if (this.f15944f == null && nodeChain.d(512)) {
                e0(this);
            }
        }
        if (!this.L) {
            for (Modifier.Node node = nodeChain.e; node != null; node = node.f14692g) {
                node.U1();
            }
        }
        MutableVector mutableVector = this.f15946h.f16083a;
        int i2 = mutableVector.f14144c;
        if (i2 > 0) {
            Object[] objArr = mutableVector.f14142a;
            int i3 = 0;
            do {
                ((LayoutNode) objArr[i3]).n(owner);
                i3++;
            } while (i3 < i2);
        }
        if (!this.L) {
            nodeChain.e();
        }
        J();
        if (B2 != null) {
            B2.J();
        }
        NodeCoordinator nodeCoordinator = nodeChain.f16089b.f16103p;
        for (NodeCoordinator nodeCoordinator2 = nodeChain.f16090c; !p0.a.g(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.f16103p) {
            nodeCoordinator2.W1(true, nodeCoordinator2.f16107t);
            OwnedLayer ownedLayer = nodeCoordinator2.G;
            if (ownedLayer != null) {
                ownedLayer.invalidate();
            }
        }
        l lVar = this.I;
        if (lVar != null) {
            lVar.invoke(owner);
        }
        layoutNodeLayoutDelegate.i();
        if (this.L) {
            return;
        }
        Modifier.Node node2 = nodeChain.e;
        if ((node2.d & 7168) != 0) {
            while (node2 != null) {
                int i4 = node2.f14690c;
                if (((i4 & 4096) != 0) | ((i4 & 1024) != 0) | ((i4 & Opcodes.ACC_STRICT) != 0)) {
                    NodeKindKt.a(node2);
                }
                node2 = node2.f14692g;
            }
        }
    }

    public final void o() {
        this.f15962z = this.f15961y;
        UsageByParent usageByParent = UsageByParent.f15972c;
        this.f15961y = usageByParent;
        MutableVector E = E();
        int i2 = E.f14144c;
        if (i2 > 0) {
            Object[] objArr = E.f14142a;
            int i3 = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) objArr[i3];
                if (layoutNode.f15961y != usageByParent) {
                    layoutNode.o();
                }
                i3++;
            } while (i3 < i2);
        }
    }

    public final void p() {
        this.f15962z = this.f15961y;
        this.f15961y = UsageByParent.f15972c;
        MutableVector E = E();
        int i2 = E.f14144c;
        if (i2 > 0) {
            Object[] objArr = E.f14142a;
            int i3 = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) objArr[i3];
                if (layoutNode.f15961y == UsageByParent.f15971b) {
                    layoutNode.p();
                }
                i3++;
            } while (i3 < i2);
        }
    }

    public final String q(int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        MutableVector E = E();
        int i4 = E.f14144c;
        if (i4 > 0) {
            Object[] objArr = E.f14142a;
            int i5 = 0;
            do {
                sb.append(((LayoutNode) objArr[i5]).q(i2 + 1));
                i5++;
            } while (i5 < i4);
        }
        String sb2 = sb.toString();
        if (i2 != 0) {
            return sb2;
        }
        String substring = sb2.substring(0, sb2.length() - 1);
        p0.a.r(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final void r() {
        LookaheadAlignmentLines lookaheadAlignmentLines;
        Owner owner = this.f15950l;
        if (owner == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            LayoutNode B = B();
            sb.append(B != null ? B.q(0) : null);
            InlineClassHelperKt.c(sb.toString());
            throw null;
        }
        LayoutNode B2 = B();
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.C;
        if (B2 != null) {
            B2.H();
            B2.J();
            LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = layoutNodeLayoutDelegate.f15995r;
            UsageByParent usageByParent = UsageByParent.f15972c;
            measurePassDelegate.f16031l = usageByParent;
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.f15996s;
            if (lookaheadPassDelegate != null) {
                lookaheadPassDelegate.f16002j = usageByParent;
            }
        }
        LayoutNodeAlignmentLines layoutNodeAlignmentLines = layoutNodeLayoutDelegate.f15995r.f16041v;
        layoutNodeAlignmentLines.f15873b = true;
        layoutNodeAlignmentLines.f15874c = false;
        layoutNodeAlignmentLines.e = false;
        layoutNodeAlignmentLines.d = false;
        layoutNodeAlignmentLines.f15875f = false;
        layoutNodeAlignmentLines.f15876g = false;
        layoutNodeAlignmentLines.f15877h = null;
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate2 = layoutNodeLayoutDelegate.f15996s;
        if (lookaheadPassDelegate2 != null && (lookaheadAlignmentLines = lookaheadPassDelegate2.f16011s) != null) {
            lookaheadAlignmentLines.f15873b = true;
            lookaheadAlignmentLines.f15874c = false;
            lookaheadAlignmentLines.e = false;
            lookaheadAlignmentLines.d = false;
            lookaheadAlignmentLines.f15875f = false;
            lookaheadAlignmentLines.f15876g = false;
            lookaheadAlignmentLines.f15877h = null;
        }
        l lVar = this.J;
        if (lVar != null) {
            lVar.invoke(owner);
        }
        NodeChain nodeChain = this.B;
        if (nodeChain.d(8)) {
            K();
        }
        Modifier.Node node = nodeChain.d;
        for (Modifier.Node node2 = node; node2 != null; node2 = node2.f14691f) {
            if (node2.f14699n) {
                node2.b2();
            }
        }
        this.f15953o = true;
        MutableVector mutableVector = this.f15946h.f16083a;
        int i2 = mutableVector.f14144c;
        if (i2 > 0) {
            Object[] objArr = mutableVector.f14142a;
            int i3 = 0;
            do {
                ((LayoutNode) objArr[i3]).r();
                i3++;
            } while (i3 < i2);
        }
        this.f15953o = false;
        while (node != null) {
            if (node.f14699n) {
                node.V1();
            }
            node = node.f14691f;
        }
        owner.r(this);
        this.f15950l = null;
        e0(null);
        this.f15952n = 0;
        LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate2 = layoutNodeLayoutDelegate.f15995r;
        measurePassDelegate2.f16028i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        measurePassDelegate2.f16027h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        measurePassDelegate2.f16039t = false;
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate3 = layoutNodeLayoutDelegate.f15996s;
        if (lookaheadPassDelegate3 != null) {
            lookaheadPassDelegate3.f16001i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            lookaheadPassDelegate3.f16000h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            lookaheadPassDelegate3.f16010r = false;
        }
    }

    public final void s(Canvas canvas, GraphicsLayer graphicsLayer) {
        this.B.f16090c.T0(canvas, graphicsLayer);
    }

    public final List t() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = this.C.f15996s;
        p0.a.p(lookaheadPassDelegate);
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
        layoutNodeLayoutDelegate.f15980a.v();
        boolean z2 = lookaheadPassDelegate.f16013u;
        MutableVector mutableVector = lookaheadPassDelegate.f16012t;
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
                    LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate2 = layoutNode2.C.f15996s;
                    p0.a.p(lookaheadPassDelegate2);
                    mutableVector.b(lookaheadPassDelegate2);
                } else {
                    LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate3 = layoutNode2.C.f15996s;
                    p0.a.p(lookaheadPassDelegate3);
                    Object[] objArr2 = mutableVector.f14142a;
                    Object obj = objArr2[i3];
                    objArr2[i3] = lookaheadPassDelegate3;
                }
                i3++;
            } while (i3 < i2);
        }
        mutableVector.p(layoutNode.v().size(), mutableVector.f14144c);
        lookaheadPassDelegate.f16013u = false;
        return mutableVector.f();
    }

    public final String toString() {
        return JvmActuals_jvmKt.a(this) + " children: " + v().size() + " measurePolicy: " + this.f15957s;
    }

    public final List u() {
        return this.C.f15995r.q0();
    }

    public final List v() {
        return E().f();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    public final SemanticsConfiguration w() {
        if (!M() || this.L) {
            return null;
        }
        if (!this.B.d(8) || this.f15954p != null) {
            return this.f15954p;
        }
        ?? obj = new Object();
        obj.f30930a = new SemanticsConfiguration();
        OwnerSnapshotObserver snapshotObserver = LayoutNodeKt.a(this).getSnapshotObserver();
        snapshotObserver.b(this, snapshotObserver.d, new LayoutNode$collapsedSemantics$1(this, obj));
        Object obj2 = obj.f30930a;
        this.f15954p = (SemanticsConfiguration) obj2;
        return (SemanticsConfiguration) obj2;
    }

    public final List x() {
        return this.f15946h.f16083a.f();
    }

    public final UsageByParent y() {
        return this.C.f15995r.f16031l;
    }

    public final UsageByParent z() {
        UsageByParent usageByParent;
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = this.C.f15996s;
        return (lookaheadPassDelegate == null || (usageByParent = lookaheadPassDelegate.f16002j) == null) ? UsageByParent.f15972c : usageByParent;
    }

    public LayoutNode(boolean z2, int i2) {
        this.f15941a = z2;
        this.f15942b = i2;
        this.f15946h = new MutableVectorWithMutationTracking(new MutableVector(new LayoutNode[16]), new LayoutNode$_foldedChildren$1(this));
        this.f15955q = new MutableVector(new LayoutNode[16]);
        this.f15956r = true;
        this.f15957s = M;
        this.f15959u = LayoutNodeKt.f15979a;
        this.f15960v = LayoutDirection.f17494a;
        this.w = N;
        CompositionLocalMap.e8.getClass();
        this.x = CompositionLocalMap.Companion.f13771b;
        UsageByParent usageByParent = UsageByParent.f15972c;
        this.f15961y = usageByParent;
        this.f15962z = usageByParent;
        this.B = new NodeChain(this);
        this.C = new LayoutNodeLayoutDelegate(this);
        this.F = true;
        this.G = Modifier.Companion.f14687a;
    }
}
