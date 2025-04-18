package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class OuterPlacementScope extends Placeable.PlacementScope {

    /* renamed from: b, reason: collision with root package name */
    public final Owner f15822b;

    public OuterPlacementScope(Owner owner) {
        this.f15822b = owner;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public final LayoutCoordinates b() {
        return this.f15822b.getRoot().B.f16090c;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public final LayoutDirection c() {
        return this.f15822b.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public final int d() {
        return this.f15822b.getRoot().C.f15995r.f15825a;
    }
}
