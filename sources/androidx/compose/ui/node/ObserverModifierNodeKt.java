package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;

/* loaded from: classes3.dex */
public final class ObserverModifierNodeKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Modifier.Node node, q0.a aVar) {
        ObserverNodeOwnerScope observerNodeOwnerScope = node.f14693h;
        if (observerNodeOwnerScope == null) {
            observerNodeOwnerScope = new ObserverNodeOwnerScope((ObserverModifierNode) node);
            node.f14693h = observerNodeOwnerScope;
        }
        DelegatableNodeKt.g(node).getSnapshotObserver().b(observerNodeOwnerScope, ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1.f16151a, aVar);
    }
}
