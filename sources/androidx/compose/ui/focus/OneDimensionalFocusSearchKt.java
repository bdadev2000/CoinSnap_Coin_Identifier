package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import p0.a;
import q0.l;
import w0.e;

/* loaded from: classes.dex */
public final class OneDimensionalFocusSearchKt {

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final boolean a(FocusTargetNode focusTargetNode, l lVar) {
        int ordinal = focusTargetNode.f2().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                FocusTargetNode c2 = FocusTraversalKt.c(focusTargetNode);
                if (c2 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                }
                int ordinal2 = c2.f2().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                throw new RuntimeException();
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                        }
                    } else if (!a(c2, lVar) && !c(focusTargetNode, c2, 2, lVar) && (!c2.e2().f14859a || !((Boolean) lVar.invoke(c2)).booleanValue())) {
                        return false;
                    }
                }
                return c(focusTargetNode, c2, 2, lVar);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new RuntimeException();
                }
                if (!d(focusTargetNode, lVar) && (!focusTargetNode.e2().f14859a || !((Boolean) lVar.invoke(focusTargetNode)).booleanValue())) {
                    return false;
                }
            }
            return true;
        }
        return d(focusTargetNode, lVar);
    }

    public static final boolean b(FocusTargetNode focusTargetNode, l lVar) {
        int ordinal = focusTargetNode.f2().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                FocusTargetNode c2 = FocusTraversalKt.c(focusTargetNode);
                if (c2 != null) {
                    return b(c2, lVar) || c(focusTargetNode, c2, 1, lVar);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return focusTargetNode.e2().f14859a ? ((Boolean) lVar.invoke(focusTargetNode)).booleanValue() : e(focusTargetNode, lVar);
                }
                throw new RuntimeException();
            }
        }
        return e(focusTargetNode, lVar);
    }

    public static final boolean c(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i2, l lVar) {
        if (f(focusTargetNode, focusTargetNode2, i2, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.a(focusTargetNode, i2, new OneDimensionalFocusSearchKt$generateAndSearchChildren$1(focusTargetNode, focusTargetNode2, i2, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean d(FocusTargetNode focusTargetNode, l lVar) {
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16]);
        Modifier.Node node = focusTargetNode.f14688a;
        if (!node.f14699n) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16]);
        Modifier.Node node2 = node.f14692g;
        if (node2 == null) {
            DelegatableNodeKt.a(mutableVector2, node);
        } else {
            mutableVector2.b(node2);
        }
        while (mutableVector2.m()) {
            Modifier.Node node3 = (Modifier.Node) mutableVector2.o(mutableVector2.f14144c - 1);
            if ((node3.d & 1024) == 0) {
                DelegatableNodeKt.a(mutableVector2, node3);
            } else {
                while (true) {
                    if (node3 == null) {
                        break;
                    }
                    if ((node3.f14690c & 1024) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node3 != null) {
                            if (node3 instanceof FocusTargetNode) {
                                mutableVector.b((FocusTargetNode) node3);
                            } else if ((node3.f14690c & 1024) != 0 && (node3 instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node node4 = ((DelegatingNode) node3).f15909p; node4 != null; node4 = node4.f14692g) {
                                    if ((node4.f14690c & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node3 = node4;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16]);
                                            }
                                            if (node3 != null) {
                                                mutableVector3.b(node3);
                                                node3 = null;
                                            }
                                            mutableVector3.b(node4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node3 = DelegatableNodeKt.b(mutableVector3);
                        }
                    } else {
                        node3 = node3.f14692g;
                    }
                }
            }
        }
        mutableVector.q(FocusableChildrenComparator.f14901a);
        int i3 = mutableVector.f14144c;
        if (i3 > 0) {
            int i4 = i3 - 1;
            Object[] objArr = mutableVector.f14142a;
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i4];
                if (FocusTraversalKt.d(focusTargetNode2) && a(focusTargetNode2, lVar)) {
                    return true;
                }
                i4--;
            } while (i4 >= 0);
        }
        return false;
    }

    public static final boolean e(FocusTargetNode focusTargetNode, l lVar) {
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16]);
        Modifier.Node node = focusTargetNode.f14688a;
        if (!node.f14699n) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16]);
        Modifier.Node node2 = node.f14692g;
        if (node2 == null) {
            DelegatableNodeKt.a(mutableVector2, node);
        } else {
            mutableVector2.b(node2);
        }
        while (mutableVector2.m()) {
            Modifier.Node node3 = (Modifier.Node) mutableVector2.o(mutableVector2.f14144c - 1);
            if ((node3.d & 1024) == 0) {
                DelegatableNodeKt.a(mutableVector2, node3);
            } else {
                while (true) {
                    if (node3 == null) {
                        break;
                    }
                    if ((node3.f14690c & 1024) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node3 != null) {
                            if (node3 instanceof FocusTargetNode) {
                                mutableVector.b((FocusTargetNode) node3);
                            } else if ((node3.f14690c & 1024) != 0 && (node3 instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node node4 = ((DelegatingNode) node3).f15909p; node4 != null; node4 = node4.f14692g) {
                                    if ((node4.f14690c & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node3 = node4;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16]);
                                            }
                                            if (node3 != null) {
                                                mutableVector3.b(node3);
                                                node3 = null;
                                            }
                                            mutableVector3.b(node4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node3 = DelegatableNodeKt.b(mutableVector3);
                        }
                    } else {
                        node3 = node3.f14692g;
                    }
                }
            }
        }
        mutableVector.q(FocusableChildrenComparator.f14901a);
        int i3 = mutableVector.f14144c;
        if (i3 > 0) {
            Object[] objArr = mutableVector.f14142a;
            int i4 = 0;
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i4];
                if (FocusTraversalKt.d(focusTargetNode2) && b(focusTargetNode2, lVar)) {
                    return true;
                }
                i4++;
            } while (i4 < i3);
        }
        return false;
    }

    public static final boolean f(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i2, l lVar) {
        Modifier.Node node;
        NodeChain nodeChain;
        if (focusTargetNode.f2() != FocusStateImpl.f14887b) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
        }
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16]);
        Modifier.Node node2 = focusTargetNode.f14688a;
        if (!node2.f14699n) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16]);
        Modifier.Node node3 = node2.f14692g;
        if (node3 == null) {
            DelegatableNodeKt.a(mutableVector2, node2);
        } else {
            mutableVector2.b(node3);
        }
        while (true) {
            node = null;
            if (!mutableVector2.m()) {
                break;
            }
            Modifier.Node node4 = (Modifier.Node) mutableVector2.o(mutableVector2.f14144c - 1);
            if ((node4.d & 1024) == 0) {
                DelegatableNodeKt.a(mutableVector2, node4);
            } else {
                while (true) {
                    if (node4 == null) {
                        break;
                    }
                    if ((node4.f14690c & 1024) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node4 != null) {
                            if (node4 instanceof FocusTargetNode) {
                                mutableVector.b((FocusTargetNode) node4);
                            } else if ((node4.f14690c & 1024) != 0 && (node4 instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node node5 = ((DelegatingNode) node4).f15909p; node5 != null; node5 = node5.f14692g) {
                                    if ((node5.f14690c & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            node4 = node5;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16]);
                                            }
                                            if (node4 != null) {
                                                mutableVector3.b(node4);
                                                node4 = null;
                                            }
                                            mutableVector3.b(node5);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            node4 = DelegatableNodeKt.b(mutableVector3);
                        }
                    } else {
                        node4 = node4.f14692g;
                    }
                }
            }
        }
        mutableVector.q(FocusableChildrenComparator.f14901a);
        if (FocusDirection.a(i2, 1)) {
            int i4 = new e(0, mutableVector.f14144c - 1, 1).f31407b;
            if (i4 >= 0) {
                boolean z2 = false;
                int i5 = 0;
                while (true) {
                    if (z2) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) mutableVector.f14142a[i5];
                        if (FocusTraversalKt.d(focusTargetNode3) && b(focusTargetNode3, lVar)) {
                            return true;
                        }
                    }
                    if (a.g(mutableVector.f14142a[i5], focusTargetNode2)) {
                        z2 = true;
                    }
                    if (i5 == i4) {
                        break;
                    }
                    i5++;
                }
            }
        } else {
            if (!FocusDirection.a(i2, 2)) {
                throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
            }
            int i6 = new e(0, mutableVector.f14144c - 1, 1).f31407b;
            if (i6 >= 0) {
                boolean z3 = false;
                while (true) {
                    if (z3) {
                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) mutableVector.f14142a[i6];
                        if (FocusTraversalKt.d(focusTargetNode4) && a(focusTargetNode4, lVar)) {
                            return true;
                        }
                    }
                    if (a.g(mutableVector.f14142a[i6], focusTargetNode2)) {
                        z3 = true;
                    }
                    if (i6 == 0) {
                        break;
                    }
                    i6--;
                }
            }
        }
        if (!FocusDirection.a(i2, 1) && focusTargetNode.e2().f14859a) {
            Modifier.Node node6 = focusTargetNode.f14688a;
            if (!node6.f14699n) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node node7 = node6.f14691f;
            LayoutNode f2 = DelegatableNodeKt.f(focusTargetNode);
            loop5: while (true) {
                if (f2 == null) {
                    break;
                }
                if ((f2.B.e.d & 1024) != 0) {
                    while (node7 != null) {
                        if ((node7.f14690c & 1024) != 0) {
                            Modifier.Node node8 = node7;
                            MutableVector mutableVector4 = null;
                            while (node8 != null) {
                                if (node8 instanceof FocusTargetNode) {
                                    node = node8;
                                    break loop5;
                                }
                                if ((node8.f14690c & 1024) != 0 && (node8 instanceof DelegatingNode)) {
                                    int i7 = 0;
                                    for (Modifier.Node node9 = ((DelegatingNode) node8).f15909p; node9 != null; node9 = node9.f14692g) {
                                        if ((node9.f14690c & 1024) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                node8 = node9;
                                            } else {
                                                if (mutableVector4 == null) {
                                                    mutableVector4 = new MutableVector(new Modifier.Node[16]);
                                                }
                                                if (node8 != null) {
                                                    mutableVector4.b(node8);
                                                    node8 = null;
                                                }
                                                mutableVector4.b(node9);
                                            }
                                        }
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                node8 = DelegatableNodeKt.b(mutableVector4);
                            }
                        }
                        node7 = node7.f14691f;
                    }
                }
                f2 = f2.B();
                node7 = (f2 == null || (nodeChain = f2.B) == null) ? null : nodeChain.d;
            }
            if (node != null) {
                return ((Boolean) lVar.invoke(focusTargetNode)).booleanValue();
            }
        }
        return false;
    }
}
