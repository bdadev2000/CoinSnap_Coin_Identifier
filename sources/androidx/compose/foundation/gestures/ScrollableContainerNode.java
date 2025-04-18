package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.TraversableNode;

@StabilityInferred
/* loaded from: classes2.dex */
public final class ScrollableContainerNode extends Modifier.Node implements TraversableNode {

    /* renamed from: p, reason: collision with root package name */
    public static final TraverseKey f3424p = new Object();

    /* renamed from: o, reason: collision with root package name */
    public boolean f3425o;

    /* loaded from: classes2.dex */
    public static final class TraverseKey {
    }

    public ScrollableContainerNode(boolean z2) {
        this.f3425o = z2;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final Object Q() {
        return f3424p;
    }
}
