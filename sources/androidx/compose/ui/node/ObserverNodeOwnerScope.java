package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes3.dex */
public final class ObserverNodeOwnerScope implements OwnerScope {

    /* renamed from: a, reason: collision with root package name */
    public final ObserverModifierNode f16150a;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public ObserverNodeOwnerScope(ObserverModifierNode observerModifierNode) {
        this.f16150a = observerModifierNode;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public final boolean Y0() {
        return this.f16150a.z0().f14699n;
    }
}
