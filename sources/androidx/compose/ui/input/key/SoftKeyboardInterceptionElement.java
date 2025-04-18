package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;

/* loaded from: classes.dex */
final class SoftKeyboardInterceptionElement extends ModifierNodeElement<InterceptedKeyInputNode> {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.Modifier$Node, androidx.compose.ui.input.key.InterceptedKeyInputNode] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f15500o = null;
        node.f15501p = null;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        InterceptedKeyInputNode interceptedKeyInputNode = (InterceptedKeyInputNode) node;
        interceptedKeyInputNode.f15500o = null;
        interceptedKeyInputNode.f15501p = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SoftKeyboardInterceptionElement)) {
            return false;
        }
        ((SoftKeyboardInterceptionElement) obj).getClass();
        return a.g(null, null) && a.g(null, null);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "SoftKeyboardInterceptionElement(onKeyEvent=null, onPreKeyEvent=null)";
    }
}
