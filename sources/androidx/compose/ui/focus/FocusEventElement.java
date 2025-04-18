package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;

/* loaded from: classes2.dex */
final class FocusEventElement extends ModifierNodeElement<FocusEventNode> {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.focus.FocusEventNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f14834o = null;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((FocusEventNode) node).f14834o = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FocusEventElement)) {
            return false;
        }
        ((FocusEventElement) obj).getClass();
        return a.g(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "FocusEventElement(onFocusEvent=null)";
    }
}
