package androidx.compose.foundation;

import androidx.annotation.RequiresApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;

@RequiresApi
/* loaded from: classes4.dex */
final class PreferKeepClearElement extends ModifierNodeElement<PreferKeepClearNode> {
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new RectListNode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((PreferKeepClearNode) node).f2847o = null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof PreferKeepClearNode) && ((PreferKeepClearNode) obj).f2847o == null;
    }

    public final int hashCode() {
        return 0;
    }
}
