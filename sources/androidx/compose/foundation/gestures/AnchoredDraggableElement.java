package androidx.compose.foundation.gestures;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;

/* loaded from: classes3.dex */
final class AnchoredDraggableElement<T> extends ModifierNodeElement<AnchoredDraggableNode<T>> {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.gestures.DragGestureNode, androidx.compose.foundation.gestures.AnchoredDraggableNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? dragGestureNode = new DragGestureNode(AnchoredDraggableKt$AlwaysDrag$1.f3009a, false, null, null);
        dragGestureNode.f3046y = null;
        dragGestureNode.f3047z = null;
        dragGestureNode.A = null;
        dragGestureNode.B = null;
        dragGestureNode.C = false;
        return dragGestureNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        boolean z2;
        AnchoredDraggableNode anchoredDraggableNode = (AnchoredDraggableNode) node;
        if (a.g(anchoredDraggableNode.f3046y, null)) {
            z2 = false;
        } else {
            anchoredDraggableNode.f3046y = null;
            z2 = true;
        }
        if (anchoredDraggableNode.f3047z != null) {
            anchoredDraggableNode.f3047z = null;
            z2 = true;
        }
        if (!a.g(anchoredDraggableNode.A, null)) {
            anchoredDraggableNode.A = null;
            z2 = true;
        }
        anchoredDraggableNode.C = false;
        anchoredDraggableNode.B = null;
        anchoredDraggableNode.p2(anchoredDraggableNode.f3293r, false, null, null, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchoredDraggableElement)) {
            return false;
        }
        AnchoredDraggableElement anchoredDraggableElement = (AnchoredDraggableElement) obj;
        anchoredDraggableElement.getClass();
        if (!a.g(null, null)) {
            return false;
        }
        anchoredDraggableElement.getClass();
        anchoredDraggableElement.getClass();
        anchoredDraggableElement.getClass();
        if (!a.g(null, null)) {
            return false;
        }
        anchoredDraggableElement.getClass();
        if (!a.g(null, null)) {
            return false;
        }
        anchoredDraggableElement.getClass();
        anchoredDraggableElement.getClass();
        return a.g(null, null);
    }

    public final int hashCode() {
        throw null;
    }
}
