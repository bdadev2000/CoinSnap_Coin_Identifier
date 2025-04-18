package androidx.compose.foundation.gestures;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;

/* loaded from: classes4.dex */
final class TransformableElement extends ModifierNodeElement<TransformableNode> {
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new TransformableNode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        TransformableNode transformableNode = (TransformableNode) node;
        transformableNode.f3610r = null;
        if (!a.g(transformableNode.f3609q, null) || transformableNode.f3612t || transformableNode.f3611s) {
            transformableNode.f3609q = null;
            transformableNode.f3612t = false;
            transformableNode.f3611s = false;
            transformableNode.w.M0();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TransformableElement.class != obj.getClass()) {
            return false;
        }
        return a.g(null, null);
    }

    public final int hashCode() {
        throw null;
    }
}
