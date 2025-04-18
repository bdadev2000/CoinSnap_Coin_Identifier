package androidx.compose.ui.modifier;

import androidx.compose.animation.SharedBoundsNode;
import androidx.compose.animation.SharedElementInternalState;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;

/* loaded from: classes4.dex */
public interface ModifierLocalModifierNode extends ModifierLocalReadScope, DelegatableNode {
    default void U(ProvidableModifierLocal providableModifierLocal, SharedElementInternalState sharedElementInternalState) {
        EmptyMap emptyMap = EmptyMap.f15863a;
        SingleLocalMap singleLocalMap = ((SharedBoundsNode) this).f1902q;
        if (!(singleLocalMap != emptyMap)) {
            InlineClassHelperKt.a("In order to provide locals you must override providedValues: ModifierLocalMap");
            throw null;
        }
        if (singleLocalMap.a(providableModifierLocal)) {
            singleLocalMap.c(providableModifierLocal, sharedElementInternalState);
            return;
        }
        InlineClassHelperKt.a("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + providableModifierLocal + " was not found.");
        throw null;
    }

    default ModifierLocalMap n0() {
        return EmptyMap.f15863a;
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
    @Override // androidx.compose.ui.modifier.ModifierLocalReadScope
    default Object s(ProvidableModifierLocal providableModifierLocal) {
        NodeChain nodeChain;
        if (!z0().f14699n) {
            InlineClassHelperKt.a("ModifierLocal accessed from an unattached node");
            throw null;
        }
        if (!z0().f14699n) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node node = z0().f14691f;
        LayoutNode f2 = DelegatableNodeKt.f(this);
        while (f2 != null) {
            if ((f2.B.e.d & 32) != 0) {
                while (node != null) {
                    if ((node.f14690c & 32) != 0) {
                        DelegatingNode delegatingNode = node;
                        ?? r4 = 0;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof ModifierLocalModifierNode) {
                                ModifierLocalModifierNode modifierLocalModifierNode = (ModifierLocalModifierNode) delegatingNode;
                                if (modifierLocalModifierNode.n0().a(providableModifierLocal)) {
                                    return modifierLocalModifierNode.n0().b(providableModifierLocal);
                                }
                            } else if ((delegatingNode.f14690c & 32) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node node2 = delegatingNode.f15909p;
                                int i2 = 0;
                                delegatingNode = delegatingNode;
                                r4 = r4;
                                while (node2 != null) {
                                    if ((node2.f14690c & 32) != 0) {
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
        return providableModifierLocal.f15864a.invoke();
    }
}
