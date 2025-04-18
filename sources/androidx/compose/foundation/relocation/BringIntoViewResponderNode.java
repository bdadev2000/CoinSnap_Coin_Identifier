package androidx.compose.foundation.relocation;

import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.TraversableNode;
import d0.b0;
import h0.g;
import q0.a;

@StabilityInferred
/* loaded from: classes.dex */
public final class BringIntoViewResponderNode extends Modifier.Node implements BringIntoViewParent, LayoutAwareModifierNode, TraversableNode {

    /* renamed from: q, reason: collision with root package name */
    public static final TraverseKey f5333q = new Object();

    /* renamed from: o, reason: collision with root package name */
    public BringIntoViewResponder f5334o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5335p;

    /* loaded from: classes.dex */
    public static final class TraverseKey {
    }

    public BringIntoViewResponderNode(ContentInViewNode contentInViewNode) {
        this.f5334o = contentInViewNode;
    }

    public static final Rect e2(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, a aVar) {
        Rect rect;
        if (!bringIntoViewResponderNode.f14699n || !bringIntoViewResponderNode.f5335p) {
            return null;
        }
        NodeCoordinator e = DelegatableNodeKt.e(bringIntoViewResponderNode);
        if (!layoutCoordinates.B()) {
            layoutCoordinates = null;
        }
        if (layoutCoordinates == null || (rect = (Rect) aVar.invoke()) == null) {
            return null;
        }
        return rect.m(e.Q(layoutCoordinates, false).g());
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void F(NodeCoordinator nodeCoordinator) {
        this.f5335p = true;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final Object Q() {
        return f5333q;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean T1() {
        return false;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewParent
    public final Object z1(NodeCoordinator nodeCoordinator, a aVar, g gVar) {
        Object J = p0.a.J(new BringIntoViewResponderNode$bringChildIntoView$2(this, nodeCoordinator, aVar, new BringIntoViewResponderNode$bringChildIntoView$parentRect$1(this, nodeCoordinator, aVar), null), gVar);
        return J == i0.a.f30806a ? J : b0.f30125a;
    }
}
