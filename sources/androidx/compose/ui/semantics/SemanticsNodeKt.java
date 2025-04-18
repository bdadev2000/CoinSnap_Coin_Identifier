package androidx.compose.ui.semantics;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class SemanticsNodeKt {
    public static final SemanticsNode a(LayoutNode layoutNode, boolean z2) {
        Modifier.Node node = layoutNode.B.e;
        Object obj = null;
        if ((node.d & 8) != 0) {
            loop0: while (true) {
                if (node == null) {
                    break;
                }
                if ((node.f14690c & 8) != 0) {
                    Modifier.Node node2 = node;
                    MutableVector mutableVector = null;
                    while (node2 != null) {
                        if (node2 instanceof SemanticsModifierNode) {
                            obj = node2;
                            break loop0;
                        }
                        if ((node2.f14690c & 8) != 0 && (node2 instanceof DelegatingNode)) {
                            int i2 = 0;
                            for (Modifier.Node node3 = ((DelegatingNode) node2).f15909p; node3 != null; node3 = node3.f14692g) {
                                if ((node3.f14690c & 8) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        node2 = node3;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16]);
                                        }
                                        if (node2 != null) {
                                            mutableVector.b(node2);
                                            node2 = null;
                                        }
                                        mutableVector.b(node3);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        node2 = DelegatableNodeKt.b(mutableVector);
                    }
                }
                if ((node.d & 8) == 0) {
                    break;
                }
                node = node.f14692g;
            }
        }
        a.p(obj);
        Modifier.Node z02 = ((SemanticsModifierNode) obj).z0();
        SemanticsConfiguration w = layoutNode.w();
        a.p(w);
        return new SemanticsNode(z02, z2, layoutNode, w);
    }

    public static final LayoutNode b(LayoutNode layoutNode, l lVar) {
        for (LayoutNode B = layoutNode.B(); B != null; B = B.B()) {
            if (((Boolean) lVar.invoke(B)).booleanValue()) {
                return B;
            }
        }
        return null;
    }

    public static final SemanticsModifierNode c(LayoutNode layoutNode) {
        Modifier.Node node = layoutNode.B.e;
        Object obj = null;
        if ((node.d & 8) != 0) {
            loop0: while (true) {
                if (node == null) {
                    break;
                }
                if ((node.f14690c & 8) != 0) {
                    Modifier.Node node2 = node;
                    MutableVector mutableVector = null;
                    while (node2 != null) {
                        if (node2 instanceof SemanticsModifierNode) {
                            if (((SemanticsModifierNode) node2).N1()) {
                                obj = node2;
                                break loop0;
                            }
                        } else if ((node2.f14690c & 8) != 0 && (node2 instanceof DelegatingNode)) {
                            int i2 = 0;
                            for (Modifier.Node node3 = ((DelegatingNode) node2).f15909p; node3 != null; node3 = node3.f14692g) {
                                if ((node3.f14690c & 8) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        node2 = node3;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16]);
                                        }
                                        if (node2 != null) {
                                            mutableVector.b(node2);
                                            node2 = null;
                                        }
                                        mutableVector.b(node3);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        node2 = DelegatableNodeKt.b(mutableVector);
                    }
                }
                if ((node.d & 8) == 0) {
                    break;
                }
                node = node.f14692g;
            }
        }
        return (SemanticsModifierNode) obj;
    }
}
