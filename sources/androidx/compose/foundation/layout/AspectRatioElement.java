package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;

/* loaded from: classes2.dex */
final class AspectRatioElement extends ModifierNodeElement<AspectRatioNode> {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.layout.AspectRatioNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f3789o = 0.0f;
        node.f3790p = false;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        AspectRatioNode aspectRatioNode = (AspectRatioNode) node;
        aspectRatioNode.f3789o = 0.0f;
        aspectRatioNode.f3790p = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null) == null) {
            return false;
        }
        ((AspectRatioElement) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(0.0f) * 31);
    }
}
