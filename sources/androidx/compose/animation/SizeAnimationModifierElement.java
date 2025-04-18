package androidx.compose.animation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;

/* loaded from: classes2.dex */
final class SizeAnimationModifierElement extends ModifierNodeElement<SizeAnimationModifierNode> {
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new SizeAnimationModifierNode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        SizeAnimationModifierNode sizeAnimationModifierNode = (SizeAnimationModifierNode) node;
        sizeAnimationModifierNode.f1943o = null;
        sizeAnimationModifierNode.f1945q = null;
        sizeAnimationModifierNode.f1944p = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        ((SizeAnimationModifierElement) obj).getClass();
        return p0.a.g(null, null) && p0.a.g(null, null) && p0.a.g(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "SizeAnimationModifierElement(animationSpec=null, alignment=null, finishedListener=null)";
    }
}
