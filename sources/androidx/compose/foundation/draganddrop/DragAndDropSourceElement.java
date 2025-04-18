package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;

@ExperimentalFoundationApi
/* loaded from: classes3.dex */
final class DragAndDropSourceElement extends ModifierNodeElement<DragAndDropSourceNode> {
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new DragAndDropSourceNode(null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        DragAndDropSourceNode dragAndDropSourceNode = (DragAndDropSourceNode) node;
        dragAndDropSourceNode.getClass();
        dragAndDropSourceNode.f2994q = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DragAndDropSourceElement)) {
            return false;
        }
        ((DragAndDropSourceElement) obj).getClass();
        return a.g(null, null) && a.g(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "DragAndDropSourceElement(drawDragDecoration=null, dragAndDropSourceHandler=null)";
    }
}
