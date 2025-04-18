package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import java.util.Comparator;

@StabilityInferred
/* loaded from: classes.dex */
public final class OnPositionedDispatcher {

    /* renamed from: a, reason: collision with root package name */
    public final MutableVector f16152a = new MutableVector(new LayoutNode[16]);

    /* renamed from: b, reason: collision with root package name */
    public LayoutNode[] f16153b;

    /* loaded from: classes.dex */
    public static final class Companion {

        /* loaded from: classes.dex */
        public static final class DepthComparator implements Comparator<LayoutNode> {

            /* renamed from: a, reason: collision with root package name */
            public static final DepthComparator f16154a = new Object();

            @Override // java.util.Comparator
            public final int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
                LayoutNode layoutNode3 = layoutNode;
                LayoutNode layoutNode4 = layoutNode2;
                int E = p0.a.E(layoutNode4.f15952n, layoutNode3.f15952n);
                return E != 0 ? E : p0.a.E(layoutNode3.hashCode(), layoutNode4.hashCode());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void a(LayoutNode layoutNode) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.C;
        int i2 = 0;
        if (layoutNodeLayoutDelegate.f15982c == LayoutNode.LayoutState.f15967f && !layoutNodeLayoutDelegate.e && !layoutNodeLayoutDelegate.d && !layoutNode.L && layoutNode.N()) {
            Modifier.Node node = layoutNode.B.e;
            if ((node.d & 256) != 0) {
                while (node != null) {
                    if ((node.f14690c & 256) != 0) {
                        DelegatingNode delegatingNode = node;
                        ?? r6 = 0;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof GlobalPositionAwareModifierNode) {
                                GlobalPositionAwareModifierNode globalPositionAwareModifierNode = (GlobalPositionAwareModifierNode) delegatingNode;
                                globalPositionAwareModifierNode.M(DelegatableNodeKt.d(globalPositionAwareModifierNode, 256));
                            } else if ((delegatingNode.f14690c & 256) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node node2 = delegatingNode.f15909p;
                                int i3 = 0;
                                delegatingNode = delegatingNode;
                                r6 = r6;
                                while (node2 != null) {
                                    if ((node2.f14690c & 256) != 0) {
                                        i3++;
                                        r6 = r6;
                                        if (i3 == 1) {
                                            delegatingNode = node2;
                                        } else {
                                            if (r6 == 0) {
                                                r6 = new MutableVector(new Modifier.Node[16]);
                                            }
                                            if (delegatingNode != 0) {
                                                r6.b(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            r6.b(node2);
                                        }
                                    }
                                    node2 = node2.f14692g;
                                    delegatingNode = delegatingNode;
                                    r6 = r6;
                                }
                                if (i3 == 1) {
                                }
                            }
                            delegatingNode = DelegatableNodeKt.b(r6);
                        }
                    }
                    if ((node.d & 256) == 0) {
                        break;
                    } else {
                        node = node.f14692g;
                    }
                }
            }
        }
        layoutNode.K = false;
        MutableVector E = layoutNode.E();
        int i4 = E.f14144c;
        if (i4 > 0) {
            Object[] objArr = E.f14142a;
            do {
                a((LayoutNode) objArr[i2]);
                i2++;
            } while (i2 < i4);
        }
    }
}
