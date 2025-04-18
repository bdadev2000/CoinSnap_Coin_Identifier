package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.TraversableNode;

@ExperimentalFoundationApi
/* loaded from: classes3.dex */
final class TraversablePrefetchStateNode extends Modifier.Node implements TraversableNode {

    /* renamed from: o, reason: collision with root package name */
    public LazyLayoutPrefetchState f4907o;

    public TraversablePrefetchStateNode(LazyLayoutPrefetchState lazyLayoutPrefetchState) {
        this.f4907o = lazyLayoutPrefetchState;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final /* bridge */ /* synthetic */ Object Q() {
        return "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode";
    }
}
