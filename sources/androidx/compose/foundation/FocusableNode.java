package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import kotlin.jvm.internal.e;
import p0.a;
import x0.n;

@StabilityInferred
/* loaded from: classes4.dex */
public final class FocusableNode extends DelegatingNode implements FocusEventModifierNode, SemanticsModifierNode, GlobalPositionAwareModifierNode, FocusRequesterModifierNode {

    /* renamed from: q, reason: collision with root package name */
    public FocusState f2709q;

    /* renamed from: r, reason: collision with root package name */
    public final FocusableInteractionNode f2710r;

    /* renamed from: s, reason: collision with root package name */
    public final FocusablePinnableContainerNode f2711s;

    /* renamed from: t, reason: collision with root package name */
    public final FocusedBoundsNode f2712t;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.FocusableInteractionNode, androidx.compose.ui.Modifier$Node, androidx.compose.ui.node.DelegatableNode] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.foundation.FocusablePinnableContainerNode, androidx.compose.ui.Modifier$Node, androidx.compose.ui.node.DelegatableNode] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.foundation.FocusedBoundsNode, androidx.compose.ui.Modifier$Node, androidx.compose.ui.node.DelegatableNode] */
    public FocusableNode(MutableInteractionSource mutableInteractionSource) {
        ?? node = new Modifier.Node();
        node.f2702o = mutableInteractionSource;
        e2(node);
        this.f2710r = node;
        ?? node2 = new Modifier.Node();
        e2(node2);
        this.f2711s = node2;
        ?? node3 = new Modifier.Node();
        e2(node3);
        this.f2712t = node3;
        e2(new Modifier.Node());
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void B(SemanticsConfiguration semanticsConfiguration) {
        FocusState focusState = this.f2709q;
        boolean z2 = false;
        if (focusState != null && focusState.a()) {
            z2 = true;
        }
        n[] nVarArr = SemanticsPropertiesKt.f16865a;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f16841l;
        n nVar = SemanticsPropertiesKt.f16865a[4];
        Boolean valueOf = Boolean.valueOf(z2);
        semanticsPropertyKey.getClass();
        semanticsConfiguration.b(semanticsPropertyKey, valueOf);
        semanticsConfiguration.b(SemanticsActions.f16811u, new AccessibilityAction(null, new FocusableNode$applySemantics$1(this)));
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void M(NodeCoordinator nodeCoordinator) {
        this.f2712t.M(nodeCoordinator);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean T1() {
        return false;
    }

    public final void h2(MutableInteractionSource mutableInteractionSource) {
        FocusInteraction.Focus focus;
        FocusableInteractionNode focusableInteractionNode = this.f2710r;
        if (a.g(focusableInteractionNode.f2702o, mutableInteractionSource)) {
            return;
        }
        MutableInteractionSource mutableInteractionSource2 = focusableInteractionNode.f2702o;
        if (mutableInteractionSource2 != null && (focus = focusableInteractionNode.f2703p) != null) {
            mutableInteractionSource2.b(new FocusInteraction.Unfocus(focus));
        }
        focusableInteractionNode.f2703p = null;
        focusableInteractionNode.f2702o = mutableInteractionSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.foundation.interaction.FocusInteraction$Focus, androidx.compose.foundation.interaction.FocusInteraction, java.lang.Object] */
    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void v(FocusStateImpl focusStateImpl) {
        FocusedBoundsObserverNode e2;
        if (a.g(this.f2709q, focusStateImpl)) {
            return;
        }
        boolean a2 = focusStateImpl.a();
        if (a2) {
            e.v(S1(), null, 0, new FocusableNode$onFocusEvent$1(this, null), 3);
        }
        if (this.f14699n) {
            DelegatableNodeKt.f(this).K();
        }
        FocusableInteractionNode focusableInteractionNode = this.f2710r;
        MutableInteractionSource mutableInteractionSource = focusableInteractionNode.f2702o;
        if (mutableInteractionSource != null) {
            if (a2) {
                FocusInteraction.Focus focus = focusableInteractionNode.f2703p;
                if (focus != null) {
                    focusableInteractionNode.e2(mutableInteractionSource, new FocusInteraction.Unfocus(focus));
                    focusableInteractionNode.f2703p = null;
                }
                ?? obj = new Object();
                focusableInteractionNode.e2(mutableInteractionSource, obj);
                focusableInteractionNode.f2703p = obj;
            } else {
                FocusInteraction.Focus focus2 = focusableInteractionNode.f2703p;
                if (focus2 != null) {
                    focusableInteractionNode.e2(mutableInteractionSource, new FocusInteraction.Unfocus(focus2));
                    focusableInteractionNode.f2703p = null;
                }
            }
        }
        FocusedBoundsNode focusedBoundsNode = this.f2712t;
        if (a2 != focusedBoundsNode.f2721o) {
            if (a2) {
                LayoutCoordinates layoutCoordinates = focusedBoundsNode.f2722p;
                if (layoutCoordinates != null && layoutCoordinates.B() && (e2 = focusedBoundsNode.e2()) != null) {
                    e2.e2(focusedBoundsNode.f2722p);
                }
            } else {
                FocusedBoundsObserverNode e22 = focusedBoundsNode.e2();
                if (e22 != null) {
                    e22.e2(null);
                }
            }
            focusedBoundsNode.f2721o = a2;
        }
        FocusablePinnableContainerNode focusablePinnableContainerNode = this.f2711s;
        if (a2) {
            focusablePinnableContainerNode.getClass();
            ?? obj2 = new Object();
            ObserverModifierNodeKt.a(focusablePinnableContainerNode, new FocusablePinnableContainerNode$retrievePinnableContainer$1(obj2, focusablePinnableContainerNode));
            PinnableContainer pinnableContainer = (PinnableContainer) obj2.f30930a;
            focusablePinnableContainerNode.f2716o = pinnableContainer != null ? pinnableContainer.a() : null;
        } else {
            PinnableContainer.PinnedHandle pinnedHandle = focusablePinnableContainerNode.f2716o;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            focusablePinnableContainerNode.f2716o = null;
        }
        focusablePinnableContainerNode.f2717p = a2;
        this.f2709q = focusStateImpl;
    }
}
