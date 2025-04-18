package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

@Stable
/* loaded from: classes4.dex */
final class InsetsPaddingValues implements PaddingValues {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets f4020a;

    /* renamed from: b, reason: collision with root package name */
    public final Density f4021b;

    public InsetsPaddingValues(WindowInsets windowInsets, SubcomposeMeasureScope subcomposeMeasureScope) {
        this.f4020a = windowInsets;
        this.f4021b = subcomposeMeasureScope;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    public final float a() {
        WindowInsets windowInsets = this.f4020a;
        Density density = this.f4021b;
        return density.H(windowInsets.c(density));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    public final float b(LayoutDirection layoutDirection) {
        WindowInsets windowInsets = this.f4020a;
        Density density = this.f4021b;
        return density.H(windowInsets.d(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    public final float c(LayoutDirection layoutDirection) {
        WindowInsets windowInsets = this.f4020a;
        Density density = this.f4021b;
        return density.H(windowInsets.b(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    public final float d() {
        WindowInsets windowInsets = this.f4020a;
        Density density = this.f4021b;
        return density.H(windowInsets.a(density));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsetsPaddingValues)) {
            return false;
        }
        InsetsPaddingValues insetsPaddingValues = (InsetsPaddingValues) obj;
        return p0.a.g(this.f4020a, insetsPaddingValues.f4020a) && p0.a.g(this.f4021b, insetsPaddingValues.f4021b);
    }

    public final int hashCode() {
        return this.f4021b.hashCode() + (this.f4020a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f4020a + ", density=" + this.f4021b + ')';
    }
}
