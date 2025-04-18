package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class LookaheadCapablePlacementScope extends Placeable.PlacementScope {

    /* renamed from: b, reason: collision with root package name */
    public final LookaheadCapablePlaceable f15793b;

    public LookaheadCapablePlacementScope(LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.f15793b = lookaheadCapablePlaceable;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public final LayoutCoordinates b() {
        LookaheadCapablePlaceable lookaheadCapablePlaceable = this.f15793b;
        LayoutCoordinates x02 = lookaheadCapablePlaceable.f16055i ? null : lookaheadCapablePlaceable.x0();
        if (x02 == null) {
            lookaheadCapablePlaceable.H1().C.b();
        }
        return x02;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public final LayoutDirection c() {
        return this.f15793b.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public final int d() {
        return this.f15793b.h0();
    }
}
