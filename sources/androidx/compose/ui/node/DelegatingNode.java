package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;

@StabilityInferred
/* loaded from: classes4.dex */
public abstract class DelegatingNode extends Modifier.Node {

    /* renamed from: o, reason: collision with root package name */
    public final int f15908o = NodeKindKt.f(this);

    /* renamed from: p, reason: collision with root package name */
    public Modifier.Node f15909p;

    @Override // androidx.compose.ui.Modifier.Node
    public final void U1() {
        super.U1();
        for (Modifier.Node node = this.f15909p; node != null; node = node.f14692g) {
            node.d2(this.f14694i);
            if (!node.f14699n) {
                node.U1();
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void V1() {
        for (Modifier.Node node = this.f15909p; node != null; node = node.f14692g) {
            node.V1();
        }
        super.V1();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void Z1() {
        super.Z1();
        for (Modifier.Node node = this.f15909p; node != null; node = node.f14692g) {
            node.Z1();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void a2() {
        for (Modifier.Node node = this.f15909p; node != null; node = node.f14692g) {
            node.a2();
        }
        super.a2();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void b2() {
        super.b2();
        for (Modifier.Node node = this.f15909p; node != null; node = node.f14692g) {
            node.b2();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void c2(Modifier.Node node) {
        this.f14688a = node;
        for (Modifier.Node node2 = this.f15909p; node2 != null; node2 = node2.f14692g) {
            node2.c2(node);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void d2(NodeCoordinator nodeCoordinator) {
        this.f14694i = nodeCoordinator;
        for (Modifier.Node node = this.f15909p; node != null; node = node.f14692g) {
            node.d2(nodeCoordinator);
        }
    }

    public final DelegatableNode e2(DelegatableNode delegatableNode) {
        Modifier.Node z02 = delegatableNode.z0();
        if (z02 != delegatableNode) {
            Modifier.Node node = delegatableNode instanceof Modifier.Node ? (Modifier.Node) delegatableNode : null;
            Modifier.Node node2 = node != null ? node.f14691f : null;
            if (z02 == this.f14688a && p0.a.g(node2, this)) {
                return delegatableNode;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node".toString());
        }
        if (!(!z02.f14699n)) {
            InlineClassHelperKt.b("Cannot delegate to an already attached node");
            throw null;
        }
        z02.c2(this.f14688a);
        int i2 = this.f14690c;
        int g2 = NodeKindKt.g(z02);
        z02.f14690c = g2;
        int i3 = this.f14690c;
        int i4 = g2 & 2;
        if (i4 != 0 && (i3 & 2) != 0 && !(this instanceof LayoutModifierNode)) {
            InlineClassHelperKt.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + z02);
            throw null;
        }
        z02.f14692g = this.f15909p;
        this.f15909p = z02;
        z02.f14691f = this;
        g2(g2 | i3, false);
        if (this.f14699n) {
            if (i4 == 0 || (i2 & 2) != 0) {
                d2(this.f14694i);
            } else {
                NodeChain nodeChain = DelegatableNodeKt.f(this).B;
                this.f14688a.d2(null);
                nodeChain.g();
            }
            z02.U1();
            z02.a2();
            NodeKindKt.a(z02);
        }
        return delegatableNode;
    }

    public final void f2(DelegatableNode delegatableNode) {
        Modifier.Node node = null;
        for (Modifier.Node node2 = this.f15909p; node2 != null; node2 = node2.f14692g) {
            if (node2 == delegatableNode) {
                boolean z2 = node2.f14699n;
                if (z2) {
                    MutableObjectIntMap mutableObjectIntMap = NodeKindKt.f16140a;
                    if (!z2) {
                        InlineClassHelperKt.b("autoInvalidateRemovedNode called on unattached node");
                        throw null;
                    }
                    NodeKindKt.b(node2, -1, 2);
                    node2.b2();
                    node2.V1();
                }
                node2.c2(node2);
                node2.d = 0;
                if (node == null) {
                    this.f15909p = node2.f14692g;
                } else {
                    node.f14692g = node2.f14692g;
                }
                node2.f14692g = null;
                node2.f14691f = null;
                int i2 = this.f14690c;
                int g2 = NodeKindKt.g(this);
                g2(g2, true);
                if (this.f14699n && (i2 & 2) != 0 && (g2 & 2) == 0) {
                    NodeChain nodeChain = DelegatableNodeKt.f(this).B;
                    this.f14688a.d2(null);
                    nodeChain.g();
                    return;
                }
                return;
            }
            node = node2;
        }
        throw new IllegalStateException(("Could not find delegate: " + delegatableNode).toString());
    }

    public final void g2(int i2, boolean z2) {
        Modifier.Node node;
        int i3 = this.f14690c;
        this.f14690c = i2;
        if (i3 != i2) {
            if (z0() == this) {
                this.d = i2;
            }
            if (this.f14699n) {
                Modifier.Node node2 = this.f14688a;
                Modifier.Node node3 = this;
                while (node3 != null) {
                    i2 |= node3.f14690c;
                    node3.f14690c = i2;
                    if (node3 == node2) {
                        break;
                    } else {
                        node3 = node3.f14691f;
                    }
                }
                if (z2 && node3 == node2) {
                    i2 = NodeKindKt.g(node2);
                    node2.f14690c = i2;
                }
                int i4 = i2 | ((node3 == null || (node = node3.f14692g) == null) ? 0 : node.d);
                while (node3 != null) {
                    i4 |= node3.f14690c;
                    node3.d = i4;
                    node3 = node3.f14691f;
                }
            }
        }
    }
}
