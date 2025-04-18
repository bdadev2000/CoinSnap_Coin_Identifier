package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import p0.a;

/* loaded from: classes3.dex */
public final class FocusTransactionsKt {

    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[1] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static final boolean a(FocusTargetNode focusTargetNode, boolean z2, boolean z3) {
        int ordinal = focusTargetNode.f2().ordinal();
        FocusStateImpl focusStateImpl = FocusStateImpl.f14888c;
        if (ordinal == 0) {
            focusTargetNode.j2(focusStateImpl);
            if (z3) {
                FocusEventModifierNodeKt.b(focusTargetNode);
            }
        } else if (ordinal == 1) {
            FocusTargetNode c2 = FocusTraversalKt.c(focusTargetNode);
            if (!(c2 != null ? a(c2, z2, z3) : true)) {
                return false;
            }
            focusTargetNode.j2(focusStateImpl);
            if (z3) {
                FocusEventModifierNodeKt.b(focusTargetNode);
            }
        } else {
            if (ordinal == 2) {
                if (!z2) {
                    return z2;
                }
                focusTargetNode.j2(focusStateImpl);
                if (!z3) {
                    return z2;
                }
                FocusEventModifierNodeKt.b(focusTargetNode);
                return z2;
            }
            if (ordinal != 3) {
                throw new RuntimeException();
            }
        }
        return true;
    }

    public static final void b(FocusTargetNode focusTargetNode) {
        ObserverModifierNodeKt.a(focusTargetNode, new FocusTransactionsKt$grantFocus$1(focusTargetNode));
        int ordinal = focusTargetNode.f2().ordinal();
        if (ordinal == 1 || ordinal == 3) {
            focusTargetNode.j2(FocusStateImpl.f14886a);
        }
    }

    public static final CustomDestinationResult c(FocusTargetNode focusTargetNode, int i2) {
        int ordinal = focusTargetNode.f2().ordinal();
        CustomDestinationResult customDestinationResult = CustomDestinationResult.f14826a;
        if (ordinal == 0) {
            return customDestinationResult;
        }
        CustomDestinationResult customDestinationResult2 = CustomDestinationResult.f14827b;
        if (ordinal == 1) {
            FocusTargetNode c2 = FocusTraversalKt.c(focusTargetNode);
            if (c2 == null) {
                throw new IllegalArgumentException("ActiveParent with no focused child".toString());
            }
            CustomDestinationResult c3 = c(c2, i2);
            if (c3 == customDestinationResult) {
                c3 = null;
            }
            if (c3 != null) {
                return c3;
            }
            if (focusTargetNode.f14889o) {
                return customDestinationResult;
            }
            focusTargetNode.f14889o = true;
            try {
                FocusRequester focusRequester = (FocusRequester) focusTargetNode.e2().f14867k.invoke(new FocusDirection(i2));
                if (focusRequester != FocusRequester.f14872b) {
                    if (focusRequester == FocusRequester.f14873c) {
                        focusTargetNode.f14889o = false;
                    } else {
                        customDestinationResult = focusRequester.a(FocusRequester$focus$1.f14875a) ? CustomDestinationResult.f14828c : CustomDestinationResult.d;
                    }
                }
                return customDestinationResult;
            } finally {
                focusTargetNode.f14889o = false;
            }
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return customDestinationResult;
            }
            throw new RuntimeException();
        }
        return customDestinationResult2;
    }

    public static final CustomDestinationResult d(FocusTargetNode focusTargetNode, int i2) {
        if (!focusTargetNode.f14890p) {
            focusTargetNode.f14890p = true;
            try {
                FocusRequester focusRequester = (FocusRequester) focusTargetNode.e2().f14866j.invoke(new FocusDirection(i2));
                if (focusRequester != FocusRequester.f14872b) {
                    if (focusRequester == FocusRequester.f14873c) {
                        return CustomDestinationResult.f14827b;
                    }
                    return focusRequester.a(FocusRequester$focus$1.f14875a) ? CustomDestinationResult.f14828c : CustomDestinationResult.d;
                }
            } finally {
                focusTargetNode.f14890p = false;
            }
        }
        return CustomDestinationResult.f14826a;
    }

    public static final CustomDestinationResult e(FocusTargetNode focusTargetNode, int i2) {
        Modifier.Node node;
        NodeChain nodeChain;
        int ordinal = focusTargetNode.f2().ordinal();
        CustomDestinationResult customDestinationResult = CustomDestinationResult.f14826a;
        if (ordinal != 0) {
            if (ordinal == 1) {
                FocusTargetNode c2 = FocusTraversalKt.c(focusTargetNode);
                if (c2 != null) {
                    return c(c2, i2);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child".toString());
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new RuntimeException();
                }
                Modifier.Node node2 = focusTargetNode.f14688a;
                if (!node2.f14699n) {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                Modifier.Node node3 = node2.f14691f;
                LayoutNode f2 = DelegatableNodeKt.f(focusTargetNode);
                loop0: while (true) {
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
                                        int i3 = 0;
                                        for (Modifier.Node node4 = ((DelegatingNode) node).f15909p; node4 != null; node4 = node4.f14692g) {
                                            if ((node4.f14690c & 1024) != 0) {
                                                i3++;
                                                if (i3 == 1) {
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
                                        if (i3 == 1) {
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
                if (focusTargetNode2 == null) {
                    return customDestinationResult;
                }
                int ordinal2 = focusTargetNode2.f2().ordinal();
                if (ordinal2 == 0) {
                    return d(focusTargetNode2, i2);
                }
                if (ordinal2 == 1) {
                    return e(focusTargetNode2, i2);
                }
                if (ordinal2 == 2) {
                    return CustomDestinationResult.f14827b;
                }
                if (ordinal2 != 3) {
                    throw new RuntimeException();
                }
                CustomDestinationResult e = e(focusTargetNode2, i2);
                CustomDestinationResult customDestinationResult2 = e != customDestinationResult ? e : null;
                return customDestinationResult2 == null ? d(focusTargetNode2, i2) : customDestinationResult2;
            }
        }
        return customDestinationResult;
    }

    public static final boolean f(FocusTargetNode focusTargetNode) {
        Modifier.Node node;
        NodeChain nodeChain;
        int ordinal = focusTargetNode.f2().ordinal();
        boolean z2 = true;
        if (ordinal != 0) {
            if (ordinal == 1) {
                FocusTargetNode c2 = FocusTraversalKt.c(focusTargetNode);
                if (c2 != null ? a(c2, false, true) : true) {
                    b(focusTargetNode);
                }
                z2 = false;
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new RuntimeException();
                }
                Modifier.Node node2 = focusTargetNode.f14688a;
                if (!node2.f14699n) {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                Modifier.Node node3 = node2.f14691f;
                LayoutNode f2 = DelegatableNodeKt.f(focusTargetNode);
                loop0: while (true) {
                    node = null;
                    if (f2 == null) {
                        break;
                    }
                    if ((f2.B.e.d & 1024) != 0) {
                        while (node3 != null) {
                            if ((node3.f14690c & 1024) != 0) {
                                Modifier.Node node4 = node3;
                                MutableVector mutableVector = null;
                                while (node4 != null) {
                                    if (node4 instanceof FocusTargetNode) {
                                        node = node4;
                                        break loop0;
                                    }
                                    if ((node4.f14690c & 1024) != 0 && (node4 instanceof DelegatingNode)) {
                                        int i2 = 0;
                                        for (Modifier.Node node5 = ((DelegatingNode) node4).f15909p; node5 != null; node5 = node5.f14692g) {
                                            if ((node5.f14690c & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    node4 = node5;
                                                } else {
                                                    if (mutableVector == null) {
                                                        mutableVector = new MutableVector(new Modifier.Node[16]);
                                                    }
                                                    if (node4 != null) {
                                                        mutableVector.b(node4);
                                                        node4 = null;
                                                    }
                                                    mutableVector.b(node5);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    node4 = DelegatableNodeKt.b(mutableVector);
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
                    FocusStateImpl f22 = focusTargetNode2.f2();
                    z2 = i(focusTargetNode2, focusTargetNode);
                    if (z2 && f22 != focusTargetNode2.f2()) {
                        FocusEventModifierNodeKt.b(focusTargetNode2);
                    }
                } else {
                    if (DelegatableNodeKt.g(focusTargetNode).getFocusOwner().g()) {
                        b(focusTargetNode);
                    }
                    z2 = false;
                }
            }
        }
        if (z2) {
            FocusEventModifierNodeKt.b(focusTargetNode);
        }
        return z2;
    }

    public static final boolean g(FocusTargetNode focusTargetNode) {
        Boolean h2 = h(focusTargetNode, 7);
        if (h2 != null) {
            return h2.booleanValue();
        }
        return false;
    }

    public static final Boolean h(FocusTargetNode focusTargetNode, int i2) {
        Boolean valueOf;
        FocusTransactionManager c2 = DelegatableNodeKt.g(focusTargetNode).getFocusOwner().c();
        FocusTransactionsKt$requestFocus$1 focusTransactionsKt$requestFocus$1 = new FocusTransactionsKt$requestFocus$1(focusTargetNode);
        try {
            if (c2.f14898c) {
                FocusTransactionManager.a(c2);
            }
            c2.f14898c = true;
            c2.f14897b.b(focusTransactionsKt$requestFocus$1);
            int ordinal = e(focusTargetNode, i2).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        valueOf = Boolean.TRUE;
                    } else if (ordinal != 3) {
                        throw new RuntimeException();
                    }
                }
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(f(focusTargetNode));
            }
            return valueOf;
        } finally {
            FocusTransactionManager.b(c2);
        }
    }

    public static final boolean i(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        Modifier.Node node;
        Modifier.Node node2;
        NodeChain nodeChain;
        NodeChain nodeChain2;
        Modifier.Node node3 = focusTargetNode2.f14688a;
        if (!node3.f14699n) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node node4 = node3.f14691f;
        LayoutNode f2 = DelegatableNodeKt.f(focusTargetNode2);
        loop0: while (true) {
            node = null;
            if (f2 == null) {
                node2 = null;
                break;
            }
            if ((f2.B.e.d & 1024) != 0) {
                while (node4 != null) {
                    if ((node4.f14690c & 1024) != 0) {
                        node2 = node4;
                        MutableVector mutableVector = null;
                        while (node2 != null) {
                            if (node2 instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((node2.f14690c & 1024) != 0 && (node2 instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node node5 = ((DelegatingNode) node2).f15909p; node5 != null; node5 = node5.f14692g) {
                                    if ((node5.f14690c & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node2 = node5;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16]);
                                            }
                                            if (node2 != null) {
                                                mutableVector.b(node2);
                                                node2 = null;
                                            }
                                            mutableVector.b(node5);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node2 = DelegatableNodeKt.b(mutableVector);
                        }
                    }
                    node4 = node4.f14691f;
                }
            }
            f2 = f2.B();
            node4 = (f2 == null || (nodeChain2 = f2.B) == null) ? null : nodeChain2.d;
        }
        if (!a.g(node2, focusTargetNode)) {
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
        int ordinal = focusTargetNode.f2().ordinal();
        FocusStateImpl focusStateImpl = FocusStateImpl.f14887b;
        if (ordinal == 0) {
            b(focusTargetNode2);
            focusTargetNode.j2(focusStateImpl);
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                return false;
            }
            if (ordinal != 3) {
                throw new RuntimeException();
            }
            Modifier.Node node6 = focusTargetNode.f14688a;
            if (!node6.f14699n) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node node7 = node6.f14691f;
            LayoutNode f3 = DelegatableNodeKt.f(focusTargetNode);
            loop4: while (true) {
                if (f3 == null) {
                    break;
                }
                if ((f3.B.e.d & 1024) != 0) {
                    while (node7 != null) {
                        if ((node7.f14690c & 1024) != 0) {
                            Modifier.Node node8 = node7;
                            MutableVector mutableVector2 = null;
                            while (node8 != null) {
                                if (node8 instanceof FocusTargetNode) {
                                    node = node8;
                                    break loop4;
                                }
                                if ((node8.f14690c & 1024) != 0 && (node8 instanceof DelegatingNode)) {
                                    int i3 = 0;
                                    for (Modifier.Node node9 = ((DelegatingNode) node8).f15909p; node9 != null; node9 = node9.f14692g) {
                                        if ((node9.f14690c & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                node8 = node9;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16]);
                                                }
                                                if (node8 != null) {
                                                    mutableVector2.b(node8);
                                                    node8 = null;
                                                }
                                                mutableVector2.b(node9);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                node8 = DelegatableNodeKt.b(mutableVector2);
                            }
                        }
                        node7 = node7.f14691f;
                    }
                }
                f3 = f3.B();
                node7 = (f3 == null || (nodeChain = f3.B) == null) ? null : nodeChain.d;
            }
            FocusTargetNode focusTargetNode3 = (FocusTargetNode) node;
            if (focusTargetNode3 != null || !DelegatableNodeKt.g(focusTargetNode).getFocusOwner().g()) {
                if (focusTargetNode3 == null || !i(focusTargetNode3, focusTargetNode)) {
                    return false;
                }
                boolean i4 = i(focusTargetNode, focusTargetNode2);
                if (focusTargetNode.f2() != focusStateImpl) {
                    throw new IllegalStateException("Deactivated node is focused".toString());
                }
                if (!i4) {
                    return i4;
                }
                FocusEventModifierNodeKt.b(focusTargetNode3);
                return i4;
            }
            b(focusTargetNode2);
            focusTargetNode.j2(focusStateImpl);
        } else {
            if (FocusTraversalKt.c(focusTargetNode) == null) {
                throw new IllegalArgumentException("ActiveParent with no focused child".toString());
            }
            FocusTargetNode c2 = FocusTraversalKt.c(focusTargetNode);
            if (c2 != null && !a(c2, false, true)) {
                return false;
            }
            b(focusTargetNode2);
        }
        return true;
    }
}
