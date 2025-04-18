package androidx.compose.foundation.content;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class ReceiveContentElement extends ModifierNodeElement<ReceiveContentNode> {
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new ReceiveContentNode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((ReceiveContentNode) node).f2891q = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReceiveContentElement)) {
            return false;
        }
        ((ReceiveContentElement) obj).getClass();
        return a.g(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ReceiveContentElement(receiveContentListener=null)";
    }
}
