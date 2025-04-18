package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.BuildDrawCacheParams;
import androidx.compose.ui.draw.DrawCacheModifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusRequesterModifier;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.modifier.BackwardsCompatLocalMap;
import androidx.compose.ui.modifier.EmptyMap;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import d0.c;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

@StabilityInferred
/* loaded from: classes3.dex */
public final class BackwardsCompatNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode, PointerInputModifierNode, ModifierLocalModifierNode, ModifierLocalReadScope, ParentDataModifierNode, LayoutAwareModifierNode, GlobalPositionAwareModifierNode, FocusEventModifierNode, FocusPropertiesModifierNode, FocusRequesterModifierNode, OwnerScope, BuildDrawCacheParams {

    /* renamed from: o, reason: collision with root package name */
    public Modifier.Element f15880o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f15881p;

    /* renamed from: q, reason: collision with root package name */
    public BackwardsCompatLocalMap f15882q;

    /* renamed from: r, reason: collision with root package name */
    public HashSet f15883r;

    /* renamed from: s, reason: collision with root package name */
    public LayoutCoordinates f15884s;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int A(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        Modifier.Element element = this.f15880o;
        p0.a.q(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).A(intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void B(SemanticsConfiguration semanticsConfiguration) {
        Modifier.Element element = this.f15880o;
        p0.a.q(element, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        SemanticsConfiguration O1 = ((SemanticsModifier) element).O1();
        p0.a.q(semanticsConfiguration, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        if (O1.f16816b) {
            semanticsConfiguration.f16816b = true;
        }
        if (O1.f16817c) {
            semanticsConfiguration.f16817c = true;
        }
        for (Map.Entry entry : O1.f16815a.entrySet()) {
            SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) entry.getKey();
            Object value = entry.getValue();
            LinkedHashMap linkedHashMap = semanticsConfiguration.f16815a;
            if (!linkedHashMap.containsKey(semanticsPropertyKey)) {
                linkedHashMap.put(semanticsPropertyKey, value);
            } else if (value instanceof AccessibilityAction) {
                Object obj = linkedHashMap.get(semanticsPropertyKey);
                p0.a.q(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
                String str = accessibilityAction.f16772a;
                if (str == null) {
                    str = ((AccessibilityAction) value).f16772a;
                }
                c cVar = accessibilityAction.f16773b;
                if (cVar == null) {
                    cVar = ((AccessibilityAction) value).f16773b;
                }
                linkedHashMap.put(semanticsPropertyKey, new AccessibilityAction(str, cVar));
            }
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int E(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        Modifier.Element element = this.f15880o;
        p0.a.q(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).E(intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void F(NodeCoordinator nodeCoordinator) {
        this.f15884s = nodeCoordinator;
        Modifier.Element element = this.f15880o;
        if (element instanceof OnPlacedModifier) {
            ((OnPlacedModifier) element).F(nodeCoordinator);
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final boolean G1() {
        Modifier.Element element = this.f15880o;
        p0.a.q(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((PointerInputModifier) element).q1().getClass();
        return true;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public final Object J(Density density, Object obj) {
        Modifier.Element element = this.f15880o;
        p0.a.q(element, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((ParentDataModifier) element).J(density, obj);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int K(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        Modifier.Element element = this.f15880o;
        p0.a.q(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).K(intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void M(NodeCoordinator nodeCoordinator) {
        Modifier.Element element = this.f15880o;
        p0.a.q(element, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((OnGloballyPositionedModifier) element).M(nodeCoordinator);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void W1() {
        e2(true);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void X1() {
        f2();
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public final boolean Y0() {
        return this.f14699n;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public final long b() {
        return IntSizeKt.c(DelegatableNodeKt.d(this, 128).f15827c);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void e0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        Modifier.Element element = this.f15880o;
        p0.a.q(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((PointerInputModifier) element).q1().c(pointerEvent, pointerEventPass);
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public final void e1(FocusProperties focusProperties) {
        Modifier.Element element = this.f15880o;
        if (element instanceof FocusOrderModifier) {
            ((FocusOrderModifier) element).Q1();
        } else {
            InlineClassHelperKt.b("applyFocusProperties called on wrong node");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.node.BackwardsCompatNode$initializeModifier$3] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, androidx.compose.ui.modifier.BackwardsCompatLocalMap] */
    public final void e2(boolean z2) {
        if (!this.f14699n) {
            InlineClassHelperKt.b("initializeModifier called on unattached node");
            throw null;
        }
        Modifier.Element element = this.f15880o;
        if ((this.f14690c & 32) != 0) {
            if (element instanceof ModifierLocalConsumer) {
                DelegatableNodeKt.g(this).l(new BackwardsCompatNode$initializeModifier$2(this));
            }
            if (element instanceof ModifierLocalProvider) {
                ModifierLocalProvider modifierLocalProvider = (ModifierLocalProvider) element;
                BackwardsCompatLocalMap backwardsCompatLocalMap = this.f15882q;
                if (backwardsCompatLocalMap == null || !backwardsCompatLocalMap.a(modifierLocalProvider.getKey())) {
                    ?? obj = new Object();
                    obj.f15862a = modifierLocalProvider;
                    this.f15882q = obj;
                    if (BackwardsCompatNodeKt.a(this)) {
                        ModifierLocalManager modifierLocalManager = DelegatableNodeKt.g(this).getModifierLocalManager();
                        ProvidableModifierLocal key = modifierLocalProvider.getKey();
                        modifierLocalManager.f15866b.b(this);
                        modifierLocalManager.f15867c.b(key);
                        modifierLocalManager.a();
                    }
                } else {
                    backwardsCompatLocalMap.f15862a = modifierLocalProvider;
                    ModifierLocalManager modifierLocalManager2 = DelegatableNodeKt.g(this).getModifierLocalManager();
                    ProvidableModifierLocal key2 = modifierLocalProvider.getKey();
                    modifierLocalManager2.f15866b.b(this);
                    modifierLocalManager2.f15867c.b(key2);
                    modifierLocalManager2.a();
                }
            }
        }
        if ((this.f14690c & 4) != 0) {
            if (element instanceof DrawCacheModifier) {
                this.f15881p = true;
            }
            if (!z2) {
                DelegatableNodeKt.d(this, 2).q1();
            }
        }
        if ((this.f14690c & 2) != 0) {
            if (BackwardsCompatNodeKt.a(this)) {
                NodeCoordinator nodeCoordinator = this.f14694i;
                p0.a.p(nodeCoordinator);
                ((LayoutModifierNodeCoordinator) nodeCoordinator).Z1(this);
                OwnedLayer ownedLayer = nodeCoordinator.G;
                if (ownedLayer != null) {
                    ownedLayer.invalidate();
                }
            }
            if (!z2) {
                DelegatableNodeKt.d(this, 2).q1();
                DelegatableNodeKt.f(this).J();
            }
        }
        if (element instanceof RemeasurementModifier) {
            ((RemeasurementModifier) element).o0(DelegatableNodeKt.f(this));
        }
        if ((this.f14690c & 128) != 0) {
            if ((element instanceof OnRemeasuredModifier) && BackwardsCompatNodeKt.a(this)) {
                DelegatableNodeKt.f(this).J();
            }
            if (element instanceof OnPlacedModifier) {
                this.f15884s = null;
                if (BackwardsCompatNodeKt.a(this)) {
                    DelegatableNodeKt.g(this).j(new Owner.OnLayoutCompletedListener() { // from class: androidx.compose.ui.node.BackwardsCompatNode$initializeModifier$3
                        @Override // androidx.compose.ui.node.Owner.OnLayoutCompletedListener
                        public final void h() {
                            BackwardsCompatNode backwardsCompatNode = BackwardsCompatNode.this;
                            if (backwardsCompatNode.f15884s == null) {
                                backwardsCompatNode.F(DelegatableNodeKt.d(backwardsCompatNode, 128));
                            }
                        }
                    });
                }
            }
        }
        if ((this.f14690c & 256) != 0 && (element instanceof OnGloballyPositionedModifier) && BackwardsCompatNodeKt.a(this)) {
            DelegatableNodeKt.f(this).J();
        }
        if (element instanceof FocusRequesterModifier) {
            ((FocusRequesterModifier) element).h0().f14874a.b(this);
        }
        if ((this.f14690c & 16) != 0 && (element instanceof PointerInputModifier)) {
            ((PointerInputModifier) element).q1().f15618a = this.f14694i;
        }
        if ((this.f14690c & 8) != 0) {
            DelegatableNodeKt.g(this).u();
        }
    }

    public final void f2() {
        if (!this.f14699n) {
            InlineClassHelperKt.b("unInitializeModifier called on unattached node");
            throw null;
        }
        Modifier.Element element = this.f15880o;
        if ((this.f14690c & 32) != 0) {
            if (element instanceof ModifierLocalProvider) {
                ModifierLocalManager modifierLocalManager = DelegatableNodeKt.g(this).getModifierLocalManager();
                ProvidableModifierLocal key = ((ModifierLocalProvider) element).getKey();
                modifierLocalManager.d.b(DelegatableNodeKt.f(this));
                modifierLocalManager.e.b(key);
                modifierLocalManager.a();
            }
            if (element instanceof ModifierLocalConsumer) {
                ((ModifierLocalConsumer) element).g1(BackwardsCompatNodeKt.f15889a);
            }
        }
        if ((this.f14690c & 8) != 0) {
            DelegatableNodeKt.g(this).u();
        }
        if (element instanceof FocusRequesterModifier) {
            ((FocusRequesterModifier) element).h0().f14874a.n(this);
        }
    }

    public final void g2() {
        if (this.f14699n) {
            this.f15883r.clear();
            DelegatableNodeKt.g(this).getSnapshotObserver().b(this, BackwardsCompatNodeKt$updateModifierLocalConsumer$1.f15891a, new BackwardsCompatNode$updateModifierLocalConsumer$1(this));
        }
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public final Density getDensity() {
        return DelegatableNodeKt.f(this).f15959u;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public final LayoutDirection getLayoutDirection() {
        return DelegatableNodeKt.f(this).f15960v;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void i0() {
        Modifier.Element element = this.f15880o;
        p0.a.q(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((PointerInputModifier) element).q1().getClass();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        Modifier.Element element = this.f15880o;
        p0.a.q(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).m(measureScope, measurable, j2);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void m1() {
        Modifier.Element element = this.f15880o;
        p0.a.q(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((PointerInputModifier) element).q1().b();
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void n(long j2) {
        Modifier.Element element = this.f15880o;
        if (element instanceof OnRemeasuredModifier) {
            ((OnRemeasuredModifier) element).n(j2);
        }
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public final ModifierLocalMap n0() {
        BackwardsCompatLocalMap backwardsCompatLocalMap = this.f15882q;
        return backwardsCompatLocalMap != null ? backwardsCompatLocalMap : EmptyMap.f15863a;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void p1() {
        this.f15881p = true;
        DrawModifierNodeKt.a(this);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int q(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        Modifier.Element element = this.f15880o;
        p0.a.q(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).q(intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public final Object s(ProvidableModifierLocal providableModifierLocal) {
        NodeChain nodeChain;
        this.f15883r.add(providableModifierLocal);
        Modifier.Node node = this.f14688a;
        if (!node.f14699n) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node node2 = node.f14691f;
        LayoutNode f2 = DelegatableNodeKt.f(this);
        while (f2 != null) {
            if ((f2.B.e.d & 32) != 0) {
                while (node2 != null) {
                    if ((node2.f14690c & 32) != 0) {
                        DelegatingNode delegatingNode = node2;
                        ?? r4 = 0;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof ModifierLocalModifierNode) {
                                ModifierLocalModifierNode modifierLocalModifierNode = (ModifierLocalModifierNode) delegatingNode;
                                if (modifierLocalModifierNode.n0().a(providableModifierLocal)) {
                                    return modifierLocalModifierNode.n0().b(providableModifierLocal);
                                }
                            } else if ((delegatingNode.f14690c & 32) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node node3 = delegatingNode.f15909p;
                                int i2 = 0;
                                delegatingNode = delegatingNode;
                                r4 = r4;
                                while (node3 != null) {
                                    if ((node3.f14690c & 32) != 0) {
                                        i2++;
                                        r4 = r4;
                                        if (i2 == 1) {
                                            delegatingNode = node3;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new MutableVector(new Modifier.Node[16]);
                                            }
                                            if (delegatingNode != 0) {
                                                r4.b(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            r4.b(node3);
                                        }
                                    }
                                    node3 = node3.f14692g;
                                    delegatingNode = delegatingNode;
                                    r4 = r4;
                                }
                                if (i2 == 1) {
                                }
                            }
                            delegatingNode = DelegatableNodeKt.b(r4);
                        }
                    }
                    node2 = node2.f14691f;
                }
            }
            f2 = f2.B();
            node2 = (f2 == null || (nodeChain = f2.B) == null) ? null : nodeChain.d;
        }
        return providableModifierLocal.f15864a.invoke();
    }

    public final String toString() {
        return this.f15880o.toString();
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void v(FocusStateImpl focusStateImpl) {
        Modifier.Element element = this.f15880o;
        if (element instanceof FocusEventModifier) {
            ((FocusEventModifier) element).v(focusStateImpl);
        } else {
            InlineClassHelperKt.b("onFocusEvent called on wrong node");
            throw null;
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void z(ContentDrawScope contentDrawScope) {
        Modifier.Element element = this.f15880o;
        p0.a.q(element, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        DrawModifier drawModifier = (DrawModifier) element;
        if (this.f15881p && (element instanceof DrawCacheModifier)) {
            Modifier.Element element2 = this.f15880o;
            if (element2 instanceof DrawCacheModifier) {
                DelegatableNodeKt.g(this).getSnapshotObserver().b(this, BackwardsCompatNodeKt$onDrawCacheReadsChanged$1.f15890a, new BackwardsCompatNode$updateDrawCache$1(element2, this));
            }
            this.f15881p = false;
        }
        drawModifier.z(contentDrawScope);
    }
}
