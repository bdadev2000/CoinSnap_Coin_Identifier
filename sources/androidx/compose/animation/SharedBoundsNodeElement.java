package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.node.ModifierNodeElement;

@StabilityInferred
/* loaded from: classes2.dex */
public final class SharedBoundsNodeElement extends ModifierNodeElement<SharedBoundsNode> {
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new SharedBoundsNode(null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        SharedBoundsNode sharedBoundsNode = (SharedBoundsNode) node;
        if (p0.a.g(null, sharedBoundsNode.f1900o)) {
            return;
        }
        sharedBoundsNode.f1900o = null;
        if (sharedBoundsNode.f14699n) {
            ProvidableModifierLocal providableModifierLocal = SharedContentNodeKt.f1909a;
            sharedBoundsNode.U(providableModifierLocal, null);
            sharedBoundsNode.f1900o.f1913c = (SharedElementInternalState) sharedBoundsNode.s(providableModifierLocal);
            SharedElementInternalState sharedElementInternalState = sharedBoundsNode.f1900o;
            GraphicsLayer graphicsLayer = sharedBoundsNode.f1901p;
            sharedElementInternalState.getClass();
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedBoundsNodeElement)) {
            return false;
        }
        ((SharedBoundsNodeElement) obj).getClass();
        return p0.a.g(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "SharedBoundsNodeElement(sharedElementState=null)";
    }
}
