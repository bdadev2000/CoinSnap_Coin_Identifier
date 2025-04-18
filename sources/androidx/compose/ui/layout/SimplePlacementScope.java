package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes4.dex */
final class SimplePlacementScope extends Placeable.PlacementScope {

    /* renamed from: b, reason: collision with root package name */
    public final int f15839b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutDirection f15840c;

    public SimplePlacementScope(int i2, LayoutDirection layoutDirection) {
        this.f15839b = i2;
        this.f15840c = layoutDirection;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public final LayoutDirection c() {
        return this.f15840c;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public final int d() {
        return this.f15839b;
    }
}
