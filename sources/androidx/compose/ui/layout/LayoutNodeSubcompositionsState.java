package androidx.compose.ui.layout;

import android.support.v4.media.d;
import android.view.ViewGroup;
import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ReusableComposition;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.platform.Wrapper_androidKt;
import androidx.compose.ui.unit.LayoutDirection;
import e0.u;
import e0.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.objectweb.asm.Opcodes;
import p0.a;
import q0.l;
import q0.p;

@StabilityInferred
/* loaded from: classes2.dex */
public final class LayoutNodeSubcompositionsState implements ComposeNodeLifecycleCallback {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutNode f15751a;

    /* renamed from: b, reason: collision with root package name */
    public CompositionContext f15752b;

    /* renamed from: c, reason: collision with root package name */
    public SubcomposeSlotReusePolicy f15753c;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public int f15754f;

    /* renamed from: o, reason: collision with root package name */
    public int f15763o;

    /* renamed from: p, reason: collision with root package name */
    public int f15764p;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f15755g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f15756h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final Scope f15757i = new Scope();

    /* renamed from: j, reason: collision with root package name */
    public final PostLookaheadMeasureScopeImpl f15758j = new PostLookaheadMeasureScopeImpl();

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f15759k = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public final SubcomposeSlotReusePolicy.SlotIdsSet f15760l = new SubcomposeSlotReusePolicy.SlotIdsSet();

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f15761m = new LinkedHashMap();

    /* renamed from: n, reason: collision with root package name */
    public final MutableVector f15762n = new MutableVector(new Object[16]);

    /* renamed from: q, reason: collision with root package name */
    public final String f15765q = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    /* loaded from: classes2.dex */
    public static final class NodeState {

        /* renamed from: a, reason: collision with root package name */
        public Object f15772a;

        /* renamed from: b, reason: collision with root package name */
        public p f15773b;

        /* renamed from: c, reason: collision with root package name */
        public ReusableComposition f15774c;
        public boolean d;
        public boolean e;

        /* renamed from: f, reason: collision with root package name */
        public MutableState f15775f;
    }

    /* loaded from: classes2.dex */
    public final class PostLookaheadMeasureScopeImpl implements SubcomposeMeasureScope, MeasureScope {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f15776a;

        public PostLookaheadMeasureScopeImpl() {
            this.f15776a = LayoutNodeSubcompositionsState.this.f15757i;
        }

        @Override // androidx.compose.ui.unit.Density
        public final int C1(long j2) {
            return this.f15776a.C1(j2);
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        public final List D1(Object obj, p pVar) {
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
            LayoutNode layoutNode = (LayoutNode) layoutNodeSubcompositionsState.f15756h.get(obj);
            List u2 = layoutNode != null ? layoutNode.u() : null;
            if (u2 != null) {
                return u2;
            }
            MutableVector mutableVector = layoutNodeSubcompositionsState.f15762n;
            int i2 = mutableVector.f14144c;
            int i3 = layoutNodeSubcompositionsState.f15754f;
            if (i2 < i3) {
                throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.".toString());
            }
            if (i2 == i3) {
                mutableVector.b(obj);
            } else {
                Object[] objArr = mutableVector.f14142a;
                Object obj2 = objArr[i3];
                objArr[i3] = obj;
            }
            layoutNodeSubcompositionsState.f15754f++;
            HashMap hashMap = layoutNodeSubcompositionsState.f15759k;
            if (!hashMap.containsKey(obj)) {
                layoutNodeSubcompositionsState.f15761m.put(obj, layoutNodeSubcompositionsState.g(obj, pVar));
                LayoutNode layoutNode2 = layoutNodeSubcompositionsState.f15751a;
                if (layoutNode2.C.f15982c == LayoutNode.LayoutState.f15966c) {
                    layoutNode2.Y(true);
                } else {
                    LayoutNode.Z(layoutNode2, true, 6);
                }
            }
            LayoutNode layoutNode3 = (LayoutNode) hashMap.get(obj);
            if (layoutNode3 == null) {
                return w.f30218a;
            }
            List q02 = layoutNode3.C.f15995r.q0();
            int size = q02.size();
            for (int i4 = 0; i4 < size; i4++) {
                LayoutNodeLayoutDelegate.this.f15981b = true;
            }
            return q02;
        }

        @Override // androidx.compose.ui.unit.Density
        public final int F0(float f2) {
            return this.f15776a.F0(f2);
        }

        @Override // androidx.compose.ui.unit.Density
        public final float H(int i2) {
            return this.f15776a.H(i2);
        }

        @Override // androidx.compose.ui.unit.Density
        public final float I(float f2) {
            return f2 / this.f15776a.getDensity();
        }

        @Override // androidx.compose.ui.unit.Density
        public final float J0(long j2) {
            return this.f15776a.J0(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        public final long L(long j2) {
            return this.f15776a.L(j2);
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public final MeasureResult T(int i2, int i3, Map map, l lVar) {
            return this.f15776a.r0(i2, i3, map, lVar);
        }

        @Override // androidx.compose.ui.unit.Density
        public final float getDensity() {
            return this.f15776a.f15779b;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public final LayoutDirection getLayoutDirection() {
            return this.f15776a.f15778a;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public final long o(float f2) {
            return this.f15776a.o(f2);
        }

        @Override // androidx.compose.ui.unit.Density
        public final long p(long j2) {
            return this.f15776a.p(j2);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public final float r(long j2) {
            return this.f15776a.r(j2);
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public final MeasureResult r0(int i2, int i3, Map map, l lVar) {
            return this.f15776a.r0(i2, i3, map, lVar);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public final boolean t0() {
            return this.f15776a.t0();
        }

        @Override // androidx.compose.ui.unit.Density
        public final long u(float f2) {
            return this.f15776a.u(f2);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public final float x1() {
            return this.f15776a.f15780c;
        }

        @Override // androidx.compose.ui.unit.Density
        public final float y1(float f2) {
            return this.f15776a.getDensity() * f2;
        }
    }

    /* loaded from: classes2.dex */
    public final class Scope implements SubcomposeMeasureScope {

        /* renamed from: a, reason: collision with root package name */
        public LayoutDirection f15778a = LayoutDirection.f17495b;

        /* renamed from: b, reason: collision with root package name */
        public float f15779b;

        /* renamed from: c, reason: collision with root package name */
        public float f15780c;

        public Scope() {
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        public final List D1(Object obj, p pVar) {
            LayoutNode layoutNode;
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
            layoutNodeSubcompositionsState.d();
            LayoutNode layoutNode2 = layoutNodeSubcompositionsState.f15751a;
            LayoutNode.LayoutState layoutState = layoutNode2.C.f15982c;
            LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.f15964a;
            LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.f15966c;
            if (!(layoutState == layoutState2 || layoutState == layoutState3 || layoutState == LayoutNode.LayoutState.f15965b || layoutState == LayoutNode.LayoutState.d)) {
                InlineClassHelperKt.b("subcompose can only be used inside the measure or layout blocks");
                throw null;
            }
            HashMap hashMap = layoutNodeSubcompositionsState.f15756h;
            Object obj2 = hashMap.get(obj);
            Object obj3 = obj2;
            if (obj2 == null) {
                LayoutNode layoutNode3 = (LayoutNode) layoutNodeSubcompositionsState.f15759k.remove(obj);
                if (layoutNode3 != null) {
                    int i2 = layoutNodeSubcompositionsState.f15764p;
                    if (i2 <= 0) {
                        InlineClassHelperKt.b("Check failed.");
                        throw null;
                    }
                    layoutNodeSubcompositionsState.f15764p = i2 - 1;
                    layoutNode = layoutNode3;
                } else {
                    LayoutNode i3 = layoutNodeSubcompositionsState.i(obj);
                    if (i3 == null) {
                        int i4 = layoutNodeSubcompositionsState.d;
                        LayoutNode layoutNode4 = new LayoutNode(true, 2, 0);
                        layoutNode2.f15953o = true;
                        layoutNode2.G(i4, layoutNode4);
                        layoutNode2.f15953o = false;
                        layoutNode = layoutNode4;
                    } else {
                        layoutNode = i3;
                    }
                }
                hashMap.put(obj, layoutNode);
                obj3 = layoutNode;
            }
            LayoutNode layoutNode5 = (LayoutNode) obj3;
            if (u.G0(layoutNodeSubcompositionsState.d, layoutNode2.x()) != layoutNode5) {
                int indexOf = layoutNode2.x().indexOf(layoutNode5);
                int i5 = layoutNodeSubcompositionsState.d;
                if (indexOf < i5) {
                    throw new IllegalArgumentException(("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
                }
                if (i5 != indexOf) {
                    layoutNode2.f15953o = true;
                    layoutNode2.Q(indexOf, i5, 1);
                    layoutNode2.f15953o = false;
                }
            }
            layoutNodeSubcompositionsState.d++;
            layoutNodeSubcompositionsState.h(layoutNode5, obj, pVar);
            return (layoutState == layoutState2 || layoutState == layoutState3) ? layoutNode5.u() : layoutNode5.t();
        }

        @Override // androidx.compose.ui.unit.Density
        public final float getDensity() {
            return this.f15779b;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public final LayoutDirection getLayoutDirection() {
            return this.f15778a;
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public final MeasureResult r0(final int i2, final int i3, final Map map, final l lVar) {
            if ((i2 & (-16777216)) == 0 && ((-16777216) & i3) == 0) {
                final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$Scope$layout$1
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
                        LookaheadDelegate lookaheadDelegate;
                        boolean t02 = this.t0();
                        l lVar2 = lVar;
                        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = layoutNodeSubcompositionsState;
                        if (!t02 || (lookaheadDelegate = layoutNodeSubcompositionsState2.f15751a.B.f16089b.O) == null) {
                            lVar2.invoke(layoutNodeSubcompositionsState2.f15751a.B.f16089b.f16056j);
                        } else {
                            lVar2.invoke(lookaheadDelegate.f16056j);
                        }
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
            LayoutNode.LayoutState layoutState = LayoutNodeSubcompositionsState.this.f15751a.C.f15982c;
            return layoutState == LayoutNode.LayoutState.d || layoutState == LayoutNode.LayoutState.f15965b;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public final float x1() {
            return this.f15780c;
        }
    }

    public LayoutNodeSubcompositionsState(LayoutNode layoutNode, SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.f15751a = layoutNode;
        this.f15753c = subcomposeSlotReusePolicy;
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public final void a() {
        LayoutNode layoutNode = this.f15751a;
        layoutNode.f15953o = true;
        HashMap hashMap = this.f15755g;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ReusableComposition reusableComposition = ((NodeState) it.next()).f15774c;
            if (reusableComposition != null) {
                reusableComposition.dispose();
            }
        }
        layoutNode.V();
        layoutNode.f15953o = false;
        hashMap.clear();
        this.f15756h.clear();
        this.f15764p = 0;
        this.f15763o = 0;
        this.f15759k.clear();
        d();
    }

    public final void b(int i2) {
        this.f15763o = 0;
        LayoutNode layoutNode = this.f15751a;
        int size = (layoutNode.x().size() - this.f15764p) - 1;
        if (i2 <= size) {
            SubcomposeSlotReusePolicy.SlotIdsSet slotIdsSet = this.f15760l;
            slotIdsSet.clear();
            HashMap hashMap = this.f15755g;
            Set set = slotIdsSet.f15856a;
            if (i2 <= size) {
                int i3 = i2;
                while (true) {
                    Object obj = hashMap.get((LayoutNode) layoutNode.x().get(i3));
                    a.p(obj);
                    set.add(((NodeState) obj).f15772a);
                    if (i3 == size) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.f15753c.a(slotIdsSet);
            Snapshot a2 = Snapshot.Companion.a();
            l f2 = a2 != null ? a2.f() : null;
            Snapshot c2 = Snapshot.Companion.c(a2);
            boolean z2 = false;
            while (size >= i2) {
                try {
                    LayoutNode layoutNode2 = (LayoutNode) layoutNode.x().get(size);
                    Object obj2 = hashMap.get(layoutNode2);
                    a.p(obj2);
                    NodeState nodeState = (NodeState) obj2;
                    Object obj3 = nodeState.f15772a;
                    if (set.contains(obj3)) {
                        this.f15763o++;
                        if (((Boolean) nodeState.f15775f.getValue()).booleanValue()) {
                            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode2.C;
                            LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = layoutNodeLayoutDelegate.f15995r;
                            LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.f15972c;
                            measurePassDelegate.f16031l = usageByParent;
                            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.f15996s;
                            if (lookaheadPassDelegate != null) {
                                lookaheadPassDelegate.f16002j = usageByParent;
                            }
                            nodeState.f15775f.setValue(Boolean.FALSE);
                            z2 = true;
                        }
                    } else {
                        layoutNode.f15953o = true;
                        hashMap.remove(layoutNode2);
                        ReusableComposition reusableComposition = nodeState.f15774c;
                        if (reusableComposition != null) {
                            reusableComposition.dispose();
                        }
                        layoutNode.W(size, 1);
                        layoutNode.f15953o = false;
                    }
                    this.f15756h.remove(obj3);
                    size--;
                } catch (Throwable th) {
                    Snapshot.Companion.f(a2, c2, f2);
                    throw th;
                }
            }
            Snapshot.Companion.f(a2, c2, f2);
            if (z2) {
                Snapshot.Companion.g();
            }
        }
        d();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public final void c() {
        e(true);
    }

    public final void d() {
        int size = this.f15751a.x().size();
        HashMap hashMap = this.f15755g;
        if (hashMap.size() != size) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + hashMap.size() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((size - this.f15763o) - this.f15764p < 0) {
            StringBuilder t2 = d.t("Incorrect state. Total children ", size, ". Reusable children ");
            t2.append(this.f15763o);
            t2.append(". Precomposed children ");
            t2.append(this.f15764p);
            throw new IllegalArgumentException(t2.toString().toString());
        }
        HashMap hashMap2 = this.f15759k;
        if (hashMap2.size() == this.f15764p) {
            return;
        }
        throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.f15764p + ". Map size " + hashMap2.size()).toString());
    }

    public final void e(boolean z2) {
        this.f15764p = 0;
        this.f15759k.clear();
        LayoutNode layoutNode = this.f15751a;
        int size = layoutNode.x().size();
        if (this.f15763o != size) {
            this.f15763o = size;
            Snapshot a2 = Snapshot.Companion.a();
            l f2 = a2 != null ? a2.f() : null;
            Snapshot c2 = Snapshot.Companion.c(a2);
            for (int i2 = 0; i2 < size; i2++) {
                try {
                    LayoutNode layoutNode2 = (LayoutNode) layoutNode.x().get(i2);
                    NodeState nodeState = (NodeState) this.f15755g.get(layoutNode2);
                    if (nodeState != null && ((Boolean) nodeState.f15775f.getValue()).booleanValue()) {
                        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode2.C;
                        LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = layoutNodeLayoutDelegate.f15995r;
                        LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.f15972c;
                        measurePassDelegate.f16031l = usageByParent;
                        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.f15996s;
                        if (lookaheadPassDelegate != null) {
                            lookaheadPassDelegate.f16002j = usageByParent;
                        }
                        if (z2) {
                            ReusableComposition reusableComposition = nodeState.f15774c;
                            if (reusableComposition != null) {
                                reusableComposition.deactivate();
                            }
                            nodeState.f15775f = SnapshotStateKt.g(Boolean.FALSE);
                        } else {
                            nodeState.f15775f.setValue(Boolean.FALSE);
                        }
                        nodeState.f15772a = SubcomposeLayoutKt.f15841a;
                    }
                } catch (Throwable th) {
                    Snapshot.Companion.f(a2, c2, f2);
                    throw th;
                }
            }
            Snapshot.Companion.f(a2, c2, f2);
            this.f15756h.clear();
        }
        d();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public final void f() {
        e(false);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.layout.SubcomposeLayoutState$PrecomposedSlotHandle, java.lang.Object] */
    public final SubcomposeLayoutState.PrecomposedSlotHandle g(final Object obj, p pVar) {
        LayoutNode layoutNode = this.f15751a;
        if (!layoutNode.M()) {
            return new Object();
        }
        d();
        if (!this.f15756h.containsKey(obj)) {
            this.f15761m.remove(obj);
            HashMap hashMap = this.f15759k;
            Object obj2 = hashMap.get(obj);
            if (obj2 == null) {
                obj2 = i(obj);
                if (obj2 != null) {
                    int indexOf = layoutNode.x().indexOf(obj2);
                    int size = layoutNode.x().size();
                    layoutNode.f15953o = true;
                    layoutNode.Q(indexOf, size, 1);
                    layoutNode.f15953o = false;
                    this.f15764p++;
                } else {
                    int size2 = layoutNode.x().size();
                    LayoutNode layoutNode2 = new LayoutNode(true, 2, 0);
                    layoutNode.f15953o = true;
                    layoutNode.G(size2, layoutNode2);
                    layoutNode.f15953o = false;
                    this.f15764p++;
                    obj2 = layoutNode2;
                }
                hashMap.put(obj, obj2);
            }
            h((LayoutNode) obj2, obj, pVar);
        }
        return new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$precompose$2
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public final void a(int i2, long j2) {
                LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                LayoutNode layoutNode3 = (LayoutNode) layoutNodeSubcompositionsState.f15759k.get(obj);
                if (layoutNode3 == null || !layoutNode3.M()) {
                    return;
                }
                int size3 = layoutNode3.v().size();
                if (i2 < 0 || i2 >= size3) {
                    throw new IndexOutOfBoundsException("Index (" + i2 + ") is out of bound of [0, " + size3 + ')');
                }
                if (!(!layoutNode3.N())) {
                    throw new IllegalArgumentException("Pre-measure called on node that is not placed".toString());
                }
                LayoutNode layoutNode4 = layoutNodeSubcompositionsState.f15751a;
                layoutNode4.f15953o = true;
                LayoutNodeKt.a(layoutNode3).m((LayoutNode) layoutNode3.v().get(i2), j2);
                layoutNode4.f15953o = false;
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public final int b() {
                LayoutNode layoutNode3 = (LayoutNode) LayoutNodeSubcompositionsState.this.f15759k.get(obj);
                if (layoutNode3 != null) {
                    return layoutNode3.v().size();
                }
                return 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r13v0, types: [q0.l] */
            /* JADX WARN: Type inference failed for: r7v10, types: [androidx.compose.ui.Modifier$Node] */
            /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v12 */
            /* JADX WARN: Type inference failed for: r7v13 */
            /* JADX WARN: Type inference failed for: r7v14 */
            /* JADX WARN: Type inference failed for: r7v15 */
            /* JADX WARN: Type inference failed for: r7v16 */
            /* JADX WARN: Type inference failed for: r7v17 */
            /* JADX WARN: Type inference failed for: r7v2 */
            /* JADX WARN: Type inference failed for: r7v3, types: [androidx.compose.ui.Modifier$Node] */
            /* JADX WARN: Type inference failed for: r7v9 */
            /* JADX WARN: Type inference failed for: r8v0 */
            /* JADX WARN: Type inference failed for: r8v1 */
            /* JADX WARN: Type inference failed for: r8v10 */
            /* JADX WARN: Type inference failed for: r8v11 */
            /* JADX WARN: Type inference failed for: r8v2 */
            /* JADX WARN: Type inference failed for: r8v3, types: [androidx.compose.runtime.collection.MutableVector] */
            /* JADX WARN: Type inference failed for: r8v4 */
            /* JADX WARN: Type inference failed for: r8v5 */
            /* JADX WARN: Type inference failed for: r8v6, types: [androidx.compose.runtime.collection.MutableVector] */
            /* JADX WARN: Type inference failed for: r8v8 */
            /* JADX WARN: Type inference failed for: r8v9 */
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public final void c(l lVar) {
                NodeChain nodeChain;
                Modifier.Node node;
                LayoutNode layoutNode3 = (LayoutNode) LayoutNodeSubcompositionsState.this.f15759k.get(obj);
                if (layoutNode3 == null || (nodeChain = layoutNode3.B) == null || (node = nodeChain.e) == null) {
                    return;
                }
                Modifier.Node node2 = node.f14688a;
                if (!node2.f14699n) {
                    InlineClassHelperKt.b("visitSubtreeIf called on an unattached node");
                    throw null;
                }
                MutableVector mutableVector = new MutableVector(new Modifier.Node[16]);
                Modifier.Node node3 = node2.f14692g;
                if (node3 == null) {
                    DelegatableNodeKt.a(mutableVector, node2);
                } else {
                    mutableVector.b(node3);
                }
                while (mutableVector.m()) {
                    Modifier.Node node4 = (Modifier.Node) mutableVector.o(mutableVector.f14144c - 1);
                    if ((node4.d & Opcodes.ASM4) != 0) {
                        for (Modifier.Node node5 = node4; node5 != null; node5 = node5.f14692g) {
                            if ((node5.f14690c & Opcodes.ASM4) != 0) {
                                ?? r8 = 0;
                                DelegatingNode delegatingNode = node5;
                                while (delegatingNode != 0) {
                                    if (delegatingNode instanceof TraversableNode) {
                                        TraversableNode traversableNode = (TraversableNode) delegatingNode;
                                        TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction = a.g("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", traversableNode.Q()) ? (TraversableNode.Companion.TraverseDescendantsAction) lVar.invoke(traversableNode) : TraversableNode.Companion.TraverseDescendantsAction.f16172a;
                                        if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.f16174c) {
                                            return;
                                        }
                                        if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.f16173b) {
                                            break;
                                        }
                                    } else if ((delegatingNode.f14690c & Opcodes.ASM4) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                        Modifier.Node node6 = delegatingNode.f15909p;
                                        int i2 = 0;
                                        delegatingNode = delegatingNode;
                                        r8 = r8;
                                        while (node6 != null) {
                                            if ((node6.f14690c & Opcodes.ASM4) != 0) {
                                                i2++;
                                                r8 = r8;
                                                if (i2 == 1) {
                                                    delegatingNode = node6;
                                                } else {
                                                    if (r8 == 0) {
                                                        r8 = new MutableVector(new Modifier.Node[16]);
                                                    }
                                                    if (delegatingNode != 0) {
                                                        r8.b(delegatingNode);
                                                        delegatingNode = 0;
                                                    }
                                                    r8.b(node6);
                                                }
                                            }
                                            node6 = node6.f14692g;
                                            delegatingNode = delegatingNode;
                                            r8 = r8;
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    delegatingNode = DelegatableNodeKt.b(r8);
                                }
                            }
                        }
                    }
                    DelegatableNodeKt.a(mutableVector, node4);
                }
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public final void dispose() {
                LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                layoutNodeSubcompositionsState.d();
                LayoutNode layoutNode3 = (LayoutNode) layoutNodeSubcompositionsState.f15759k.remove(obj);
                if (layoutNode3 != null) {
                    if (layoutNodeSubcompositionsState.f15764p <= 0) {
                        throw new IllegalStateException("No pre-composed items to dispose".toString());
                    }
                    LayoutNode layoutNode4 = layoutNodeSubcompositionsState.f15751a;
                    int indexOf2 = layoutNode4.x().indexOf(layoutNode3);
                    int size3 = layoutNode4.x().size();
                    int i2 = layoutNodeSubcompositionsState.f15764p;
                    if (indexOf2 < size3 - i2) {
                        throw new IllegalStateException("Item is not in pre-composed item range".toString());
                    }
                    layoutNodeSubcompositionsState.f15763o++;
                    layoutNodeSubcompositionsState.f15764p = i2 - 1;
                    int size4 = (layoutNode4.x().size() - layoutNodeSubcompositionsState.f15764p) - layoutNodeSubcompositionsState.f15763o;
                    layoutNode4.f15953o = true;
                    layoutNode4.Q(indexOf2, size4, 1);
                    layoutNode4.f15953o = false;
                    layoutNodeSubcompositionsState.b(size4);
                }
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.runtime.AbstractApplier, androidx.compose.ui.node.UiApplier] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, androidx.compose.ui.layout.LayoutNodeSubcompositionsState$NodeState] */
    public final void h(LayoutNode layoutNode, Object obj, p pVar) {
        HashMap hashMap = this.f15755g;
        Object obj2 = hashMap.get(layoutNode);
        Object obj3 = obj2;
        if (obj2 == null) {
            ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$SubcomposeLayoutKt.f15718a;
            ?? obj4 = new Object();
            obj4.f15772a = obj;
            obj4.f15773b = composableLambdaImpl;
            obj4.f15774c = null;
            obj4.f15775f = SnapshotStateKt.g(Boolean.TRUE);
            hashMap.put(layoutNode, obj4);
            obj3 = obj4;
        }
        NodeState nodeState = (NodeState) obj3;
        ReusableComposition reusableComposition = nodeState.f15774c;
        boolean q2 = reusableComposition != null ? reusableComposition.q() : true;
        if (nodeState.f15773b != pVar || q2 || nodeState.d) {
            nodeState.f15773b = pVar;
            Snapshot a2 = Snapshot.Companion.a();
            l f2 = a2 != null ? a2.f() : null;
            Snapshot c2 = Snapshot.Companion.c(a2);
            try {
                LayoutNode layoutNode2 = this.f15751a;
                layoutNode2.f15953o = true;
                p pVar2 = nodeState.f15773b;
                ReusableComposition reusableComposition2 = nodeState.f15774c;
                CompositionContext compositionContext = this.f15752b;
                if (compositionContext == null) {
                    throw new IllegalStateException("parent composition reference not set".toString());
                }
                boolean z2 = nodeState.e;
                LayoutNodeSubcompositionsState$subcompose$3$1$1 layoutNodeSubcompositionsState$subcompose$3$1$1 = new LayoutNodeSubcompositionsState$subcompose$3$1$1(nodeState, pVar2);
                Object obj5 = ComposableLambdaKt.f14482a;
                ComposableLambdaImpl composableLambdaImpl2 = new ComposableLambdaImpl(-1750409193, layoutNodeSubcompositionsState$subcompose$3$1$1, true);
                if (reusableComposition2 == null || reusableComposition2.f()) {
                    ViewGroup.LayoutParams layoutParams = Wrapper_androidKt.f16701a;
                    ?? abstractApplier = new AbstractApplier(layoutNode);
                    Object obj6 = CompositionKt.f13759a;
                    reusableComposition2 = new CompositionImpl(compositionContext, abstractApplier);
                }
                if (z2) {
                    reusableComposition2.t(composableLambdaImpl2);
                } else {
                    reusableComposition2.d(composableLambdaImpl2);
                }
                nodeState.f15774c = reusableComposition2;
                nodeState.e = false;
                layoutNode2.f15953o = false;
                Snapshot.Companion.f(a2, c2, f2);
                nodeState.d = false;
            } catch (Throwable th) {
                Snapshot.Companion.f(a2, c2, f2);
                throw th;
            }
        }
    }

    public final LayoutNode i(Object obj) {
        HashMap hashMap;
        int i2;
        if (this.f15763o == 0) {
            return null;
        }
        LayoutNode layoutNode = this.f15751a;
        int size = layoutNode.x().size() - this.f15764p;
        int i3 = size - this.f15763o;
        int i4 = size - 1;
        int i5 = i4;
        while (true) {
            hashMap = this.f15755g;
            if (i5 < i3) {
                i2 = -1;
                break;
            }
            Object obj2 = hashMap.get((LayoutNode) layoutNode.x().get(i5));
            a.p(obj2);
            if (a.g(((NodeState) obj2).f15772a, obj)) {
                i2 = i5;
                break;
            }
            i5--;
        }
        if (i2 == -1) {
            while (i4 >= i3) {
                Object obj3 = hashMap.get((LayoutNode) layoutNode.x().get(i4));
                a.p(obj3);
                NodeState nodeState = (NodeState) obj3;
                Object obj4 = nodeState.f15772a;
                if (obj4 == SubcomposeLayoutKt.f15841a || this.f15753c.b(obj, obj4)) {
                    nodeState.f15772a = obj;
                    i5 = i4;
                    i2 = i5;
                    break;
                }
                i4--;
            }
            i5 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        if (i5 != i3) {
            layoutNode.f15953o = true;
            layoutNode.Q(i5, i3, 1);
            layoutNode.f15953o = false;
        }
        this.f15763o--;
        LayoutNode layoutNode2 = (LayoutNode) layoutNode.x().get(i3);
        Object obj5 = hashMap.get(layoutNode2);
        a.p(obj5);
        NodeState nodeState2 = (NodeState) obj5;
        nodeState2.f15775f = SnapshotStateKt.g(Boolean.TRUE);
        nodeState2.e = true;
        nodeState2.d = true;
        return layoutNode2;
    }
}
