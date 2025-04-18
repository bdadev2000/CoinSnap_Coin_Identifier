package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.TraversableNode;
import org.objectweb.asm.Opcodes;
import q0.l;

/* loaded from: classes2.dex */
public final class TraversableNodeKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final TraversableNode a(DelegatableNode delegatableNode, Object obj) {
        NodeChain nodeChain;
        if (!delegatableNode.z0().f14699n) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node node = delegatableNode.z0().f14691f;
        LayoutNode f2 = DelegatableNodeKt.f(delegatableNode);
        while (f2 != null) {
            if ((f2.B.e.d & Opcodes.ASM4) != 0) {
                while (node != null) {
                    if ((node.f14690c & Opcodes.ASM4) != 0) {
                        DelegatingNode delegatingNode = node;
                        ?? r4 = 0;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) delegatingNode;
                                if (p0.a.g(obj, traversableNode.Q())) {
                                    return traversableNode;
                                }
                            } else if ((delegatingNode.f14690c & Opcodes.ASM4) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node node2 = delegatingNode.f15909p;
                                int i2 = 0;
                                delegatingNode = delegatingNode;
                                r4 = r4;
                                while (node2 != null) {
                                    if ((node2.f14690c & Opcodes.ASM4) != 0) {
                                        i2++;
                                        r4 = r4;
                                        if (i2 == 1) {
                                            delegatingNode = node2;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new MutableVector(new Modifier.Node[16]);
                                            }
                                            if (delegatingNode != 0) {
                                                r4.b(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            r4.b(node2);
                                        }
                                    }
                                    node2 = node2.f14692g;
                                    delegatingNode = delegatingNode;
                                    r4 = r4;
                                }
                                if (i2 == 1) {
                                }
                            }
                            delegatingNode = DelegatableNodeKt.b(r4);
                        }
                    }
                    node = node.f14691f;
                }
            }
            f2 = f2.B();
            node = (f2 == null || (nodeChain = f2.B) == null) ? null : nodeChain.d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final TraversableNode b(TraversableNode traversableNode) {
        NodeChain nodeChain;
        if (!traversableNode.z0().f14699n) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node node = traversableNode.z0().f14691f;
        LayoutNode f2 = DelegatableNodeKt.f(traversableNode);
        while (f2 != null) {
            if ((f2.B.e.d & Opcodes.ASM4) != 0) {
                while (node != null) {
                    if ((node.f14690c & Opcodes.ASM4) != 0) {
                        DelegatingNode delegatingNode = node;
                        ?? r5 = 0;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof TraversableNode) {
                                TraversableNode traversableNode2 = (TraversableNode) delegatingNode;
                                if (p0.a.g(traversableNode.Q(), traversableNode2.Q()) && Actual_jvmKt.a(traversableNode, traversableNode2)) {
                                    return traversableNode2;
                                }
                            } else if ((delegatingNode.f14690c & Opcodes.ASM4) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node node2 = delegatingNode.f15909p;
                                int i2 = 0;
                                delegatingNode = delegatingNode;
                                r5 = r5;
                                while (node2 != null) {
                                    if ((node2.f14690c & Opcodes.ASM4) != 0) {
                                        i2++;
                                        r5 = r5;
                                        if (i2 == 1) {
                                            delegatingNode = node2;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new MutableVector(new Modifier.Node[16]);
                                            }
                                            if (delegatingNode != 0) {
                                                r5.b(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            r5.b(node2);
                                        }
                                    }
                                    node2 = node2.f14692g;
                                    delegatingNode = delegatingNode;
                                    r5 = r5;
                                }
                                if (i2 == 1) {
                                }
                            }
                            delegatingNode = DelegatableNodeKt.b(r5);
                        }
                    }
                    node = node.f14691f;
                }
            }
            f2 = f2.B();
            node = (f2 == null || (nodeChain = f2.B) == null) ? null : nodeChain.d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [q0.l] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void c(TraversableNode traversableNode, l lVar) {
        NodeChain nodeChain;
        if (!traversableNode.z0().f14699n) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node node = traversableNode.z0().f14691f;
        LayoutNode f2 = DelegatableNodeKt.f(traversableNode);
        while (f2 != null) {
            if ((f2.B.e.d & Opcodes.ASM4) != 0) {
                while (node != null) {
                    if ((node.f14690c & Opcodes.ASM4) != 0) {
                        DelegatingNode delegatingNode = node;
                        ?? r5 = 0;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof TraversableNode) {
                                TraversableNode traversableNode2 = (TraversableNode) delegatingNode;
                                if (p0.a.g(traversableNode.Q(), traversableNode2.Q()) && Actual_jvmKt.a(traversableNode, traversableNode2) && !((Boolean) lVar.invoke(traversableNode2)).booleanValue()) {
                                    return;
                                }
                            } else if ((delegatingNode.f14690c & Opcodes.ASM4) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node node2 = delegatingNode.f15909p;
                                int i2 = 0;
                                delegatingNode = delegatingNode;
                                r5 = r5;
                                while (node2 != null) {
                                    if ((node2.f14690c & Opcodes.ASM4) != 0) {
                                        i2++;
                                        r5 = r5;
                                        if (i2 == 1) {
                                            delegatingNode = node2;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new MutableVector(new Modifier.Node[16]);
                                            }
                                            if (delegatingNode != 0) {
                                                r5.b(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            r5.b(node2);
                                        }
                                    }
                                    node2 = node2.f14692g;
                                    delegatingNode = delegatingNode;
                                    r5 = r5;
                                }
                                if (i2 == 1) {
                                }
                            }
                            delegatingNode = DelegatableNodeKt.b(r5);
                        }
                    }
                    node = node.f14691f;
                }
            }
            f2 = f2.B();
            node = (f2 == null || (nodeChain = f2.B) == null) ? null : nodeChain.d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [q0.l] */
    /* JADX WARN: Type inference failed for: r7v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void d(TraversableNode traversableNode, l lVar) {
        if (!traversableNode.z0().f14699n) {
            InlineClassHelperKt.b("visitSubtreeIf called on an unattached node");
            throw null;
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16]);
        Modifier.Node node = traversableNode.z0().f14692g;
        if (node == null) {
            DelegatableNodeKt.a(mutableVector, traversableNode.z0());
        } else {
            mutableVector.b(node);
        }
        while (mutableVector.m()) {
            Modifier.Node node2 = (Modifier.Node) mutableVector.o(mutableVector.f14144c - 1);
            if ((node2.d & Opcodes.ASM4) != 0) {
                for (Modifier.Node node3 = node2; node3 != null; node3 = node3.f14692g) {
                    if ((node3.f14690c & Opcodes.ASM4) != 0) {
                        ?? r8 = 0;
                        DelegatingNode delegatingNode = node3;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof TraversableNode) {
                                TraversableNode traversableNode2 = (TraversableNode) delegatingNode;
                                TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction = (p0.a.g(traversableNode.Q(), traversableNode2.Q()) && Actual_jvmKt.a(traversableNode, traversableNode2)) ? (TraversableNode.Companion.TraverseDescendantsAction) lVar.invoke(traversableNode2) : TraversableNode.Companion.TraverseDescendantsAction.f16172a;
                                if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.f16174c) {
                                    return;
                                }
                                if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.f16173b) {
                                    break;
                                }
                            } else if ((delegatingNode.f14690c & Opcodes.ASM4) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node node4 = delegatingNode.f15909p;
                                int i2 = 0;
                                delegatingNode = delegatingNode;
                                r8 = r8;
                                while (node4 != null) {
                                    if ((node4.f14690c & Opcodes.ASM4) != 0) {
                                        i2++;
                                        r8 = r8;
                                        if (i2 == 1) {
                                            delegatingNode = node4;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new MutableVector(new Modifier.Node[16]);
                                            }
                                            if (delegatingNode != 0) {
                                                r8.b(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            r8.b(node4);
                                        }
                                    }
                                    node4 = node4.f14692g;
                                    delegatingNode = delegatingNode;
                                    r8 = r8;
                                }
                                if (i2 == 1) {
                                }
                            }
                            delegatingNode = DelegatableNodeKt.b(r8);
                        }
                    }
                }
            }
            DelegatableNodeKt.a(mutableVector, node2);
        }
    }
}
