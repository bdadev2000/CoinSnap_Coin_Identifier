package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.TextUnit;

/* loaded from: classes4.dex */
final class AlignmentLineOffsetTextUnitElement extends ModifierNodeElement<AlignmentLineOffsetTextUnitNode> {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.layout.AlignmentLineOffsetTextUnitNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f3762o = null;
        node.f3763p = 0L;
        node.f3764q = 0L;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        AlignmentLineOffsetTextUnitNode alignmentLineOffsetTextUnitNode = (AlignmentLineOffsetTextUnitNode) node;
        alignmentLineOffsetTextUnitNode.f3762o = null;
        alignmentLineOffsetTextUnitNode.f3763p = 0L;
        alignmentLineOffsetTextUnitNode.f3764q = 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AlignmentLineOffsetTextUnitElement ? (AlignmentLineOffsetTextUnitElement) obj : null) == null) {
            return false;
        }
        return p0.a.g(null, null) && TextUnit.a(0L, 0L) && TextUnit.a(0L, 0L);
    }

    public final int hashCode() {
        throw null;
    }
}
