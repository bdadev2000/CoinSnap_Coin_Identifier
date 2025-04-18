package androidx.compose.animation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;

/* loaded from: classes3.dex */
final class SkipToLookaheadElement extends ModifierNodeElement<SkipToLookaheadNode> {
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new SkipToLookaheadNode(null, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        SkipToLookaheadNode skipToLookaheadNode = (SkipToLookaheadNode) node;
        skipToLookaheadNode.f1963p.setValue(null);
        skipToLookaheadNode.f1964q.setValue(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkipToLookaheadElement)) {
            return false;
        }
        ((SkipToLookaheadElement) obj).getClass();
        return p0.a.g(null, null) && p0.a.g(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "SkipToLookaheadElement(scaleToBounds=null, isEnabled=null)";
    }
}
