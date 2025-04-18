package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public final class NodeCoordinatorKt {
    public static final Modifier.Node a(DelegatableNode delegatableNode, int i2) {
        Modifier.Node node = delegatableNode.z0().f14692g;
        if (node == null || (node.d & i2) == 0) {
            return null;
        }
        while (node != null) {
            int i3 = node.f14690c;
            if ((i3 & 2) != 0) {
                return null;
            }
            if ((i3 & i2) != 0) {
                return node;
            }
            node = node.f14692g;
        }
        return null;
    }
}
