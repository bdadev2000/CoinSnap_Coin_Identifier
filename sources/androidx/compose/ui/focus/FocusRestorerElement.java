package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;

/* loaded from: classes2.dex */
final class FocusRestorerElement extends ModifierNodeElement<FocusRestorerNode> {
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new FocusRestorerNode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((FocusRestorerNode) node).f14880o = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FocusRestorerElement)) {
            return false;
        }
        ((FocusRestorerElement) obj).getClass();
        return a.g(null, null);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "FocusRestorerElement(onRestoreFailed=null)";
    }
}
