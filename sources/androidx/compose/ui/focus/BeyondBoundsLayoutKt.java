package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import p0.a;
import q0.l;

/* loaded from: classes4.dex */
public final class BeyondBoundsLayoutKt {
    public static final Object a(FocusTargetNode focusTargetNode, int i2, l lVar) {
        int i3;
        Modifier.Node node;
        NodeChain nodeChain;
        Modifier.Node node2 = focusTargetNode.f14688a;
        if (!node2.f14699n) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node node3 = node2.f14691f;
        LayoutNode f2 = DelegatableNodeKt.f(focusTargetNode);
        loop0: while (true) {
            i3 = 1;
            if (f2 == null) {
                node = null;
                break;
            }
            if ((f2.B.e.d & 1024) != 0) {
                while (node3 != null) {
                    if ((node3.f14690c & 1024) != 0) {
                        node = node3;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((node.f14690c & 1024) != 0 && (node instanceof DelegatingNode)) {
                                int i4 = 0;
                                for (Modifier.Node node4 = ((DelegatingNode) node).f15909p; node4 != null; node4 = node4.f14692g) {
                                    if ((node4.f14690c & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            node = node4;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16]);
                                            }
                                            if (node != null) {
                                                mutableVector.b(node);
                                                node = null;
                                            }
                                            mutableVector.b(node4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.b(mutableVector);
                        }
                    }
                    node3 = node3.f14691f;
                }
            }
            f2 = f2.B();
            node3 = (f2 == null || (nodeChain = f2.B) == null) ? null : nodeChain.d;
        }
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
        if (focusTargetNode2 != null) {
            ProvidableModifierLocal providableModifierLocal = androidx.compose.ui.layout.BeyondBoundsLayoutKt.f15716a;
            if (a.g((BeyondBoundsLayout) focusTargetNode2.s(providableModifierLocal), (BeyondBoundsLayout) focusTargetNode.s(providableModifierLocal))) {
                return null;
            }
        }
        BeyondBoundsLayout beyondBoundsLayout = (BeyondBoundsLayout) focusTargetNode.s(androidx.compose.ui.layout.BeyondBoundsLayoutKt.f15716a);
        if (beyondBoundsLayout == null) {
            return null;
        }
        int i5 = 5;
        if (!FocusDirection.a(i2, 5)) {
            i5 = 6;
            if (!FocusDirection.a(i2, 6)) {
                i5 = 3;
                if (!FocusDirection.a(i2, 3)) {
                    i5 = 4;
                    if (!FocusDirection.a(i2, 4)) {
                        if (FocusDirection.a(i2, 1)) {
                            i3 = 2;
                        } else if (!FocusDirection.a(i2, 2)) {
                            throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
                        }
                        return beyondBoundsLayout.a(i3, lVar);
                    }
                }
            }
        }
        i3 = i5;
        return beyondBoundsLayout.a(i3, lVar);
    }
}
