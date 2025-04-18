package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;

/* loaded from: classes2.dex */
public final class DelegatableNodeKt {
    public static final void a(MutableVector mutableVector, Modifier.Node node) {
        MutableVector E = f(node).E();
        int i2 = E.f14144c;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = E.f14142a;
            do {
                mutableVector.b(((LayoutNode) objArr[i3]).B.e);
                i3--;
            } while (i3 >= 0);
        }
    }

    public static final Modifier.Node b(MutableVector mutableVector) {
        if (mutableVector == null || mutableVector.l()) {
            return null;
        }
        return (Modifier.Node) mutableVector.o(mutableVector.f14144c - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final LayoutModifierNode c(Modifier.Node node) {
        if ((node.f14690c & 2) != 0) {
            if (node instanceof LayoutModifierNode) {
                return (LayoutModifierNode) node;
            }
            if (node instanceof DelegatingNode) {
                Modifier.Node node2 = ((DelegatingNode) node).f15909p;
                while (node2 != 0) {
                    if (node2 instanceof LayoutModifierNode) {
                        return (LayoutModifierNode) node2;
                    }
                    node2 = (!(node2 instanceof DelegatingNode) || (node2.f14690c & 2) == 0) ? node2.f14692g : ((DelegatingNode) node2).f15909p;
                }
            }
        }
        return null;
    }

    public static final NodeCoordinator d(DelegatableNode delegatableNode, int i2) {
        NodeCoordinator nodeCoordinator = delegatableNode.z0().f14694i;
        p0.a.p(nodeCoordinator);
        if (nodeCoordinator.k1() != delegatableNode || !NodeKindKt.h(i2)) {
            return nodeCoordinator;
        }
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.f16103p;
        p0.a.p(nodeCoordinator2);
        return nodeCoordinator2;
    }

    public static final NodeCoordinator e(DelegatableNode delegatableNode) {
        if (!delegatableNode.z0().f14699n) {
            InlineClassHelperKt.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
            throw null;
        }
        NodeCoordinator d = d(delegatableNode, 2);
        if (d.k1().f14699n) {
            return d;
        }
        InlineClassHelperKt.b("LayoutCoordinates is not attached.");
        throw null;
    }

    public static final LayoutNode f(DelegatableNode delegatableNode) {
        NodeCoordinator nodeCoordinator = delegatableNode.z0().f14694i;
        if (nodeCoordinator != null) {
            return nodeCoordinator.f16100m;
        }
        InlineClassHelperKt.c("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw null;
    }

    public static final Owner g(DelegatableNode delegatableNode) {
        Owner owner = f(delegatableNode).f15950l;
        if (owner != null) {
            return owner;
        }
        InlineClassHelperKt.c("This node does not have an owner.");
        throw null;
    }
}
