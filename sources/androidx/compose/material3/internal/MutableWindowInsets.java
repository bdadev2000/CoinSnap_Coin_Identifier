package androidx.compose.material3.internal;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

@StabilityInferred
/* loaded from: classes2.dex */
public final class MutableWindowInsets implements WindowInsets {

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f13029a;

    public MutableWindowInsets(WindowInsets windowInsets) {
        ParcelableSnapshotMutableState f2;
        f2 = SnapshotStateKt.f(windowInsets, StructuralEqualityPolicy.f14078a);
        this.f13029a = f2;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int a(Density density) {
        return ((WindowInsets) this.f13029a.getValue()).a(density);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int b(Density density, LayoutDirection layoutDirection) {
        return ((WindowInsets) this.f13029a.getValue()).b(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int c(Density density) {
        return ((WindowInsets) this.f13029a.getValue()).c(density);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int d(Density density, LayoutDirection layoutDirection) {
        return ((WindowInsets) this.f13029a.getValue()).d(density, layoutDirection);
    }
}
