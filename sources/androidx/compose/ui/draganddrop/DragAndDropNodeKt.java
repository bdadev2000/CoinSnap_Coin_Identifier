package androidx.compose.ui.draganddrop;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.InnerNodeCoordinator;
import q0.l;

/* loaded from: classes4.dex */
public final class DragAndDropNodeKt {
    public static final DragAndDropNode a() {
        return new DragAndDropNode(DragAndDropNodeKt$DragAndDropModifierNode$1.f14784a);
    }

    public static final DragAndDropNode b(l lVar, DragAndDropTarget dragAndDropTarget) {
        return new DragAndDropNode(new DragAndDropNodeKt$DragAndDropModifierNode$2(lVar, dragAndDropTarget));
    }

    public static final boolean c(DragAndDropModifierNode dragAndDropModifierNode, long j2) {
        if (!dragAndDropModifierNode.z0().f14699n) {
            return false;
        }
        InnerNodeCoordinator innerNodeCoordinator = DelegatableNodeKt.f(dragAndDropModifierNode).B.f16089b;
        if (!innerNodeCoordinator.k1().f14699n) {
            return false;
        }
        long j3 = innerNodeCoordinator.f15827c;
        long e02 = innerNodeCoordinator.e0(0L);
        float g2 = Offset.g(e02);
        float h2 = Offset.h(e02);
        float f2 = ((int) (j3 >> 32)) + g2;
        float f3 = ((int) (j3 & 4294967295L)) + h2;
        float g3 = Offset.g(j2);
        if (g2 > g3 || g3 > f2) {
            return false;
        }
        float h3 = Offset.h(j2);
        return h2 <= h3 && h3 <= f3;
    }
}
