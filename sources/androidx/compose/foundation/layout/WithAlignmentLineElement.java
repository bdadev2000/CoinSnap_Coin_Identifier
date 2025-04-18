package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.SiblingsAlignedNode;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;

@StabilityInferred
/* loaded from: classes2.dex */
public final class WithAlignmentLineElement extends ModifierNodeElement<SiblingsAlignedNode.WithAlignmentLineNode> {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.layout.SiblingsAlignedNode$WithAlignmentLineNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f4096o = null;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((SiblingsAlignedNode.WithAlignmentLineNode) node).f4096o = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof WithAlignmentLineElement ? (WithAlignmentLineElement) obj : null) == null) {
            return false;
        }
        return p0.a.g(null, null);
    }

    public final int hashCode() {
        throw null;
    }
}
