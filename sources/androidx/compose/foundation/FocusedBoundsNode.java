package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;

@StabilityInferred
/* loaded from: classes3.dex */
public final class FocusedBoundsNode extends Modifier.Node implements TraversableNode, GlobalPositionAwareModifierNode {

    /* renamed from: q, reason: collision with root package name */
    public static final TraverseKey f2720q = new Object();

    /* renamed from: o, reason: collision with root package name */
    public boolean f2721o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutCoordinates f2722p;

    /* loaded from: classes3.dex */
    public static final class TraverseKey {
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void M(NodeCoordinator nodeCoordinator) {
        FocusedBoundsObserverNode e2;
        this.f2722p = nodeCoordinator;
        if (this.f2721o) {
            if (!nodeCoordinator.k1().f14699n) {
                FocusedBoundsObserverNode e22 = e2();
                if (e22 != null) {
                    e22.e2(null);
                    return;
                }
                return;
            }
            LayoutCoordinates layoutCoordinates = this.f2722p;
            if (layoutCoordinates == null || !layoutCoordinates.B() || (e2 = e2()) == null) {
                return;
            }
            e2.e2(this.f2722p);
        }
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final Object Q() {
        return f2720q;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean T1() {
        return false;
    }

    public final FocusedBoundsObserverNode e2() {
        if (!this.f14699n) {
            return null;
        }
        TraversableNode a2 = TraversableNodeKt.a(this, FocusedBoundsObserverNode.f2723p);
        if (a2 instanceof FocusedBoundsObserverNode) {
            return (FocusedBoundsObserverNode) a2;
        }
        return null;
    }
}
