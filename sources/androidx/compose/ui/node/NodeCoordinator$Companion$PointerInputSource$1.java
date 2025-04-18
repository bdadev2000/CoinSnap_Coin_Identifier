package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.NodeCoordinator;

/* loaded from: classes.dex */
public final class NodeCoordinator$Companion$PointerInputSource$1 implements NodeCoordinator.HitTestSource {
    @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
    public final int a() {
        return 16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
    public final boolean b(Modifier.Node node) {
        ?? r1 = 0;
        while (true) {
            int i2 = 0;
            if (node == 0) {
                return false;
            }
            if (node instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) node).i0();
            } else if ((node.f14690c & 16) != 0 && (node instanceof DelegatingNode)) {
                Modifier.Node node2 = node.f15909p;
                r1 = r1;
                node = node;
                while (node2 != null) {
                    if ((node2.f14690c & 16) != 0) {
                        i2++;
                        r1 = r1;
                        if (i2 == 1) {
                            node = node2;
                        } else {
                            if (r1 == 0) {
                                r1 = new MutableVector(new Modifier.Node[16]);
                            }
                            if (node != 0) {
                                r1.b(node);
                                node = 0;
                            }
                            r1.b(node2);
                        }
                    }
                    node2 = node2.f14692g;
                    r1 = r1;
                    node = node;
                }
                if (i2 == 1) {
                }
            }
            node = DelegatableNodeKt.b(r1);
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
    public final void c(LayoutNode layoutNode, long j2, HitTestResult hitTestResult, boolean z2, boolean z3) {
        layoutNode.F(j2, hitTestResult, z2, z3);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
    public final boolean d(LayoutNode layoutNode) {
        return true;
    }
}
