package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;

@StabilityInferred
/* loaded from: classes3.dex */
public final class RenderInTransitionOverlayNodeElement extends ModifierNodeElement<RenderInTransitionOverlayNode> {
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new RenderInTransitionOverlayNode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        RenderInTransitionOverlayNode renderInTransitionOverlayNode = (RenderInTransitionOverlayNode) node;
        renderInTransitionOverlayNode.f1889o = null;
        renderInTransitionOverlayNode.f1890p = null;
        renderInTransitionOverlayNode.f1892r.n(0.0f);
        renderInTransitionOverlayNode.f1891q = null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RenderInTransitionOverlayNodeElement)) {
            return false;
        }
        RenderInTransitionOverlayNodeElement renderInTransitionOverlayNodeElement = (RenderInTransitionOverlayNodeElement) obj;
        renderInTransitionOverlayNodeElement.getClass();
        if (!p0.a.g(null, null)) {
            return false;
        }
        renderInTransitionOverlayNodeElement.getClass();
        renderInTransitionOverlayNodeElement.getClass();
        renderInTransitionOverlayNodeElement.getClass();
        return true;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "RenderInTransitionOverlayNodeElement(sharedTransitionScope=null, renderInOverlay=null, zIndexInOverlay=0.0, clipInOverlay=null)";
    }
}
