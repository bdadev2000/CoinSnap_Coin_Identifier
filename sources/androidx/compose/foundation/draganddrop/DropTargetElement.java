package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropNode;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;

@ExperimentalFoundationApi
/* loaded from: classes2.dex */
final class DropTargetElement extends ModifierNodeElement<DragAndDropTargetNode> {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.draganddrop.DragAndDropTargetNode, androidx.compose.ui.node.DelegatingNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? delegatingNode = new DelegatingNode();
        delegatingNode.f3000q = null;
        delegatingNode.f3001r = null;
        return delegatingNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        DragAndDropTargetNode dragAndDropTargetNode = (DragAndDropTargetNode) node;
        dragAndDropTargetNode.f3000q = null;
        if (a.g(null, dragAndDropTargetNode.f3001r)) {
            return;
        }
        DragAndDropModifierNode dragAndDropModifierNode = dragAndDropTargetNode.f3002s;
        if (dragAndDropModifierNode != null) {
            dragAndDropTargetNode.f2(dragAndDropModifierNode);
        }
        dragAndDropTargetNode.f3001r = null;
        DragAndDropNode b2 = DragAndDropNodeKt.b(new DragAndDropTargetNode$createAndAttachDragAndDropModifierNode$1(dragAndDropTargetNode), null);
        dragAndDropTargetNode.e2(b2);
        dragAndDropTargetNode.f3002s = b2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropTargetElement)) {
            return false;
        }
        DropTargetElement dropTargetElement = (DropTargetElement) obj;
        dropTargetElement.getClass();
        if (!a.g(null, null)) {
            return false;
        }
        dropTargetElement.getClass();
        return true;
    }

    public final int hashCode() {
        throw null;
    }
}
