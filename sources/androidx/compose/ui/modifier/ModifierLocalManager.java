package androidx.compose.ui.modifier;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.BackwardsCompatNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import java.util.HashSet;

@StabilityInferred
/* loaded from: classes.dex */
public final class ModifierLocalManager {

    /* renamed from: a, reason: collision with root package name */
    public final Owner f15865a;

    /* renamed from: b, reason: collision with root package name */
    public final MutableVector f15866b = new MutableVector(new BackwardsCompatNode[16]);

    /* renamed from: c, reason: collision with root package name */
    public final MutableVector f15867c = new MutableVector(new ModifierLocal[16]);
    public final MutableVector d = new MutableVector(new LayoutNode[16]);
    public final MutableVector e = new MutableVector(new ModifierLocal[16]);

    /* renamed from: f, reason: collision with root package name */
    public boolean f15868f;

    public ModifierLocalManager(Owner owner) {
        this.f15865a = owner;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.compose.ui.Modifier$Node] */
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
    public static void b(Modifier.Node node, ModifierLocal modifierLocal, HashSet hashSet) {
        Modifier.Node node2 = node.f14688a;
        if (!node2.f14699n) {
            InlineClassHelperKt.b("visitSubtreeIf called on an unattached node");
            throw null;
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16]);
        Modifier.Node node3 = node2.f14692g;
        if (node3 == null) {
            DelegatableNodeKt.a(mutableVector, node2);
        } else {
            mutableVector.b(node3);
        }
        while (mutableVector.m()) {
            Modifier.Node node4 = (Modifier.Node) mutableVector.o(mutableVector.f14144c - 1);
            if ((node4.d & 32) != 0) {
                for (Modifier.Node node5 = node4; node5 != null; node5 = node5.f14692g) {
                    if ((node5.f14690c & 32) != 0) {
                        ?? r6 = 0;
                        DelegatingNode delegatingNode = node5;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof ModifierLocalModifierNode) {
                                ModifierLocalModifierNode modifierLocalModifierNode = (ModifierLocalModifierNode) delegatingNode;
                                if (modifierLocalModifierNode instanceof BackwardsCompatNode) {
                                    BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) modifierLocalModifierNode;
                                    if ((backwardsCompatNode.f15880o instanceof ModifierLocalConsumer) && backwardsCompatNode.f15883r.contains(modifierLocal)) {
                                        hashSet.add(modifierLocalModifierNode);
                                    }
                                }
                                if (!(!modifierLocalModifierNode.n0().a(modifierLocal))) {
                                    break;
                                }
                            } else if ((delegatingNode.f14690c & 32) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node node6 = delegatingNode.f15909p;
                                int i2 = 0;
                                delegatingNode = delegatingNode;
                                r6 = r6;
                                while (node6 != null) {
                                    if ((node6.f14690c & 32) != 0) {
                                        i2++;
                                        r6 = r6;
                                        if (i2 == 1) {
                                            delegatingNode = node6;
                                        } else {
                                            if (r6 == 0) {
                                                r6 = new MutableVector(new Modifier.Node[16]);
                                            }
                                            if (delegatingNode != 0) {
                                                r6.b(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            r6.b(node6);
                                        }
                                    }
                                    node6 = node6.f14692g;
                                    delegatingNode = delegatingNode;
                                    r6 = r6;
                                }
                                if (i2 == 1) {
                                }
                            }
                            delegatingNode = DelegatableNodeKt.b(r6);
                        }
                    }
                }
            }
            DelegatableNodeKt.a(mutableVector, node4);
        }
    }

    public final void a() {
        if (this.f15868f) {
            return;
        }
        this.f15868f = true;
        this.f15865a.l(new ModifierLocalManager$invalidate$1(this));
    }
}
