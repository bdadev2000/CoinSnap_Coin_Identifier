package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;

@ExperimentalFoundationApi
/* loaded from: classes3.dex */
final class BringIntoViewResponderElement extends ModifierNodeElement<BringIntoViewResponderNode> {
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new BringIntoViewResponderNode(null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((BringIntoViewResponderNode) node).f5334o = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BringIntoViewResponderElement) {
                ((BringIntoViewResponderElement) obj).getClass();
                if (a.g(null, null)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        throw null;
    }
}
