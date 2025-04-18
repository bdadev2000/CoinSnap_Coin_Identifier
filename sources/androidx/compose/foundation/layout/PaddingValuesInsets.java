package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;

@Stable
/* loaded from: classes3.dex */
final class PaddingValuesInsets implements WindowInsets {

    /* renamed from: a, reason: collision with root package name */
    public final PaddingValues f4079a;

    public PaddingValuesInsets(PaddingValues paddingValues) {
        this.f4079a = paddingValues;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int a(Density density) {
        return density.F0(this.f4079a.d());
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int b(Density density, LayoutDirection layoutDirection) {
        return density.F0(this.f4079a.c(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int c(Density density) {
        return density.F0(this.f4079a.a());
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int d(Density density, LayoutDirection layoutDirection) {
        return density.F0(this.f4079a.b(layoutDirection));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaddingValuesInsets) {
            return p0.a.g(((PaddingValuesInsets) obj).f4079a, this.f4079a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4079a.hashCode();
    }

    public final String toString() {
        LayoutDirection layoutDirection = LayoutDirection.f17494a;
        PaddingValues paddingValues = this.f4079a;
        return "PaddingValues(" + ((Object) Dp.b(paddingValues.b(layoutDirection))) + ", " + ((Object) Dp.b(paddingValues.d())) + ", " + ((Object) Dp.b(paddingValues.c(layoutDirection))) + ", " + ((Object) Dp.b(paddingValues.a())) + ')';
    }
}
