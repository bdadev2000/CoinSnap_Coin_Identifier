package androidx.compose.foundation.relocation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.TraversableNodeKt;
import d0.b0;
import h0.g;
import i0.a;

/* loaded from: classes3.dex */
public final class ScrollIntoView {
    public static final Object a(Modifier.Node node, Rect rect, g gVar) {
        BringIntoViewParent bringIntoViewParent;
        Object z1;
        boolean z2 = node.f14688a.f14699n;
        b0 b0Var = b0.f30125a;
        if (!z2) {
            return b0Var;
        }
        NodeCoordinator e = DelegatableNodeKt.e(node);
        if (node.f14688a.f14699n) {
            BringIntoViewParent bringIntoViewParent2 = (BringIntoViewParent) TraversableNodeKt.a(node, BringIntoViewResponderNode.f5333q);
            if (bringIntoViewParent2 == null) {
                bringIntoViewParent2 = new BringIntoViewResponder_androidKt$defaultBringIntoViewParent$1(node);
            }
            bringIntoViewParent = bringIntoViewParent2;
        } else {
            bringIntoViewParent = null;
        }
        return (bringIntoViewParent != null && (z1 = bringIntoViewParent.z1(e, new ScrollIntoView__ScrollIntoViewRequesterKt$scrollIntoView$2(rect, e), gVar)) == a.f30806a) ? z1 : b0Var;
    }
}
