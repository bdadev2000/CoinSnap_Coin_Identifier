package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class FocusedBoundsObserverNode extends Modifier.Node implements TraversableNode {

    /* renamed from: p, reason: collision with root package name */
    public static final TraverseKey f2723p = new Object();

    /* renamed from: o, reason: collision with root package name */
    public l f2724o;

    /* loaded from: classes3.dex */
    public static final class TraverseKey {
    }

    public FocusedBoundsObserverNode(l lVar) {
        this.f2724o = lVar;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final Object Q() {
        return f2723p;
    }

    public final void e2(LayoutCoordinates layoutCoordinates) {
        this.f2724o.invoke(layoutCoordinates);
        FocusedBoundsObserverNode focusedBoundsObserverNode = (FocusedBoundsObserverNode) TraversableNodeKt.b(this);
        if (focusedBoundsObserverNode != null) {
            focusedBoundsObserverNode.e2(layoutCoordinates);
        }
    }
}
