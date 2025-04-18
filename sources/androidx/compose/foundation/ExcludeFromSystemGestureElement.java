package androidx.compose.foundation;

import androidx.annotation.RequiresApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;

@RequiresApi
/* loaded from: classes3.dex */
final class ExcludeFromSystemGestureElement extends ModifierNodeElement<ExcludeFromSystemGestureNode> {
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new RectListNode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((ExcludeFromSystemGestureNode) node).f2847o = null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ExcludeFromSystemGestureElement)) {
            return false;
        }
        ((ExcludeFromSystemGestureElement) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return 0;
    }
}
