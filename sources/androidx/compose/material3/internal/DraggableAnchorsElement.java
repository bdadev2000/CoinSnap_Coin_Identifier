package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DraggableAnchorsElement<T> extends ModifierNodeElement<DraggableAnchorsNode<T>> {

    /* renamed from: a, reason: collision with root package name */
    public final AnchoredDraggableState f12964a;

    /* renamed from: b, reason: collision with root package name */
    public final p f12965b;

    /* renamed from: c, reason: collision with root package name */
    public final Orientation f12966c;

    public DraggableAnchorsElement(AnchoredDraggableState anchoredDraggableState, p pVar, Orientation orientation) {
        this.f12964a = anchoredDraggableState;
        this.f12965b = pVar;
        this.f12966c = orientation;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.material3.internal.DraggableAnchorsNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f12967o = this.f12964a;
        node.f12968p = this.f12965b;
        node.f12969q = this.f12966c;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        DraggableAnchorsNode draggableAnchorsNode = (DraggableAnchorsNode) node;
        draggableAnchorsNode.f12967o = this.f12964a;
        draggableAnchorsNode.f12968p = this.f12965b;
        draggableAnchorsNode.f12969q = this.f12966c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        return p0.a.g(this.f12964a, draggableAnchorsElement.f12964a) && this.f12965b == draggableAnchorsElement.f12965b && this.f12966c == draggableAnchorsElement.f12966c;
    }

    public final int hashCode() {
        return this.f12966c.hashCode() + ((this.f12965b.hashCode() + (this.f12964a.hashCode() * 31)) * 31);
    }
}
