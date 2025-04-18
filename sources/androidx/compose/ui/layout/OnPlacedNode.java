package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import q0.l;

/* loaded from: classes4.dex */
final class OnPlacedNode extends Modifier.Node implements LayoutAwareModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public l f15818o;

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void F(NodeCoordinator nodeCoordinator) {
        this.f15818o.invoke(nodeCoordinator);
    }
}
