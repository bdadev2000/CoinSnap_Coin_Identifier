package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.SemanticsConfiguration;

/* loaded from: classes.dex */
public final class NodeCoordinator$Companion$SemanticsSource$1 implements NodeCoordinator.HitTestSource {
    @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
    public final int a() {
        return 8;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
    public final boolean b(Modifier.Node node) {
        return false;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
    public final void c(LayoutNode layoutNode, long j2, HitTestResult hitTestResult, boolean z2, boolean z3) {
        NodeChain nodeChain = layoutNode.B;
        NodeCoordinator nodeCoordinator = nodeChain.f16090c;
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = NodeCoordinator.I;
        nodeChain.f16090c.o1(NodeCoordinator.M, nodeCoordinator.g1(j2, true), hitTestResult, true, z3);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
    public final boolean d(LayoutNode layoutNode) {
        SemanticsConfiguration w = layoutNode.w();
        boolean z2 = false;
        if (w != null && w.f16817c) {
            z2 = true;
        }
        return !z2;
    }
}
