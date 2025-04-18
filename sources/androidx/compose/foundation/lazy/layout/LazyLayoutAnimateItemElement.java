package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class LazyLayoutAnimateItemElement extends ModifierNodeElement<LazyLayoutAnimationSpecsNode> {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.lazy.layout.LazyLayoutAnimationSpecsNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f4692o = null;
        node.f4693p = null;
        node.f4694q = null;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        LazyLayoutAnimationSpecsNode lazyLayoutAnimationSpecsNode = (LazyLayoutAnimationSpecsNode) node;
        lazyLayoutAnimationSpecsNode.f4692o = null;
        lazyLayoutAnimationSpecsNode.f4693p = null;
        lazyLayoutAnimationSpecsNode.f4694q = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutAnimateItemElement)) {
            return false;
        }
        ((LazyLayoutAnimateItemElement) obj).getClass();
        return a.g(null, null) && a.g(null, null) && a.g(null, null);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=null, placementSpec=null, fadeOutSpec=null)";
    }
}
