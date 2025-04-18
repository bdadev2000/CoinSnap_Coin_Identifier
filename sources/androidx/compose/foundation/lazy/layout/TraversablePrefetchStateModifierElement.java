package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;

@ExperimentalFoundationApi
/* loaded from: classes3.dex */
final class TraversablePrefetchStateModifierElement extends ModifierNodeElement<TraversablePrefetchStateNode> {

    /* renamed from: a, reason: collision with root package name */
    public final LazyLayoutPrefetchState f4906a;

    public TraversablePrefetchStateModifierElement(LazyLayoutPrefetchState lazyLayoutPrefetchState) {
        this.f4906a = lazyLayoutPrefetchState;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new TraversablePrefetchStateNode(this.f4906a);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((TraversablePrefetchStateNode) node).f4907o = this.f4906a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && a.g(this.f4906a, ((TraversablePrefetchStateModifierElement) obj).f4906a);
    }

    public final int hashCode() {
        return this.f4906a.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f4906a + ')';
    }
}
