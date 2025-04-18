package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;

/* loaded from: classes.dex */
public final class FocusEventModifierNodeKt {

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
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

    /* JADX WARN: Code restructure failed: missing block: B:106:0x007f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.focus.FocusStateImpl a(androidx.compose.ui.focus.FocusEventModifierNode r10) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusEventModifierNodeKt.a(androidx.compose.ui.focus.FocusEventModifierNode):androidx.compose.ui.focus.FocusStateImpl");
    }

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
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.runtime.collection.MutableVector] */
    public static final void b(FocusTargetNode focusTargetNode) {
        NodeChain nodeChain;
        Modifier.Node node = focusTargetNode.f14688a;
        if (!node.f14699n) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        LayoutNode f2 = DelegatableNodeKt.f(focusTargetNode);
        Modifier.Node node2 = node;
        while (f2 != null) {
            if ((f2.B.e.d & 5120) != 0) {
                while (node2 != null) {
                    int i2 = node2.f14690c;
                    if ((i2 & 5120) != 0) {
                        if (node2 != node && (i2 & 1024) != 0) {
                            return;
                        }
                        if ((i2 & 4096) != 0) {
                            DelegatingNode delegatingNode = node2;
                            ?? r4 = 0;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof FocusEventModifierNode) {
                                    FocusEventModifierNode focusEventModifierNode = (FocusEventModifierNode) delegatingNode;
                                    focusEventModifierNode.v(a(focusEventModifierNode));
                                } else if ((delegatingNode.f14690c & 4096) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node node3 = delegatingNode.f15909p;
                                    int i3 = 0;
                                    delegatingNode = delegatingNode;
                                    r4 = r4;
                                    while (node3 != null) {
                                        if ((node3.f14690c & 4096) != 0) {
                                            i3++;
                                            r4 = r4;
                                            if (i3 == 1) {
                                                delegatingNode = node3;
                                            } else {
                                                if (r4 == 0) {
                                                    r4 = new MutableVector(new Modifier.Node[16]);
                                                }
                                                if (delegatingNode != 0) {
                                                    r4.b(delegatingNode);
                                                    delegatingNode = 0;
                                                }
                                                r4.b(node3);
                                            }
                                        }
                                        node3 = node3.f14692g;
                                        delegatingNode = delegatingNode;
                                        r4 = r4;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.b(r4);
                            }
                        }
                    }
                    node2 = node2.f14691f;
                }
            }
            f2 = f2.B();
            node2 = (f2 == null || (nodeChain = f2.B) == null) ? null : nodeChain.d;
        }
    }
}
