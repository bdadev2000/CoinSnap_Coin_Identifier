package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import d0.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class LayoutNode$collapsedSemantics$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LayoutNode f15975a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f15976b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNode$collapsedSemantics$1(LayoutNode layoutNode, f0 f0Var) {
        super(0);
        this.f15975a = layoutNode;
        this.f15976b = f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // q0.a
    public final Object invoke() {
        NodeChain nodeChain = this.f15975a.B;
        if ((nodeChain.e.d & 8) != 0) {
            for (Modifier.Node node = nodeChain.d; node != null; node = node.f14691f) {
                if ((node.f14690c & 8) != 0) {
                    DelegatingNode delegatingNode = node;
                    ?? r3 = 0;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof SemanticsModifierNode) {
                            SemanticsModifierNode semanticsModifierNode = (SemanticsModifierNode) delegatingNode;
                            boolean f02 = semanticsModifierNode.f0();
                            f0 f0Var = this.f15976b;
                            if (f02) {
                                SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
                                f0Var.f30930a = semanticsConfiguration;
                                semanticsConfiguration.f16817c = true;
                            }
                            if (semanticsModifierNode.N1()) {
                                ((SemanticsConfiguration) f0Var.f30930a).f16816b = true;
                            }
                            semanticsModifierNode.B((SemanticsConfiguration) f0Var.f30930a);
                        } else if ((delegatingNode.f14690c & 8) != 0 && (delegatingNode instanceof DelegatingNode)) {
                            Modifier.Node node2 = delegatingNode.f15909p;
                            int i2 = 0;
                            delegatingNode = delegatingNode;
                            r3 = r3;
                            while (node2 != null) {
                                if ((node2.f14690c & 8) != 0) {
                                    i2++;
                                    r3 = r3;
                                    if (i2 == 1) {
                                        delegatingNode = node2;
                                    } else {
                                        if (r3 == 0) {
                                            r3 = new MutableVector(new Modifier.Node[16]);
                                        }
                                        if (delegatingNode != 0) {
                                            r3.b(delegatingNode);
                                            delegatingNode = 0;
                                        }
                                        r3.b(node2);
                                    }
                                }
                                node2 = node2.f14692g;
                                delegatingNode = delegatingNode;
                                r3 = r3;
                            }
                            if (i2 == 1) {
                            }
                        }
                        delegatingNode = DelegatableNodeKt.b(r3);
                    }
                }
            }
        }
        return b0.f30125a;
    }
}
