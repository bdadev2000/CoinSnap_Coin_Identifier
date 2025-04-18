package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;

/* loaded from: classes2.dex */
final class HandwritingDetectorElement extends ModifierNodeElement<HandwritingDetectorNode> {
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new HandwritingDetectorNode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((HandwritingDetectorNode) node).f6265q = null;
    }

    public final boolean equals(Object obj) {
        boolean z2 = false;
        boolean z3 = this == obj;
        if (obj instanceof HandwritingDetectorElement) {
            ((HandwritingDetectorElement) obj).getClass();
            z2 = true;
        }
        return z3 | z2;
    }

    public final int hashCode() {
        throw null;
    }
}
