package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;

/* loaded from: classes3.dex */
final class OnPlacedElement extends ModifierNodeElement<OnPlacedNode> {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.layout.OnPlacedNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f15818o = null;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((OnPlacedNode) node).f15818o = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnPlacedElement)) {
            return false;
        }
        ((OnPlacedElement) obj).getClass();
        return a.g(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "OnPlacedElement(onPlaced=null)";
    }
}
