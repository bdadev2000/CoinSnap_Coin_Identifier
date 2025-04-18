package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

@Stable
/* loaded from: classes2.dex */
final class LimitInsets implements WindowInsets {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets f4044a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4045b;

    public LimitInsets(WindowInsets windowInsets, int i2) {
        this.f4044a = windowInsets;
        this.f4045b = i2;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int a(Density density) {
        if ((this.f4045b & 16) != 0) {
            return this.f4044a.a(density);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int b(Density density, LayoutDirection layoutDirection) {
        if (((layoutDirection == LayoutDirection.f17494a ? 4 : 1) & this.f4045b) != 0) {
            return this.f4044a.b(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int c(Density density) {
        if ((this.f4045b & 32) != 0) {
            return this.f4044a.c(density);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int d(Density density, LayoutDirection layoutDirection) {
        if (((layoutDirection == LayoutDirection.f17494a ? 8 : 2) & this.f4045b) != 0) {
            return this.f4044a.d(density, layoutDirection);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitInsets)) {
            return false;
        }
        LimitInsets limitInsets = (LimitInsets) obj;
        return p0.a.g(this.f4044a, limitInsets.f4044a) && WindowInsetsSides.a(this.f4045b, limitInsets.f4045b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4045b) + (this.f4044a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f4044a + " only " + ((Object) WindowInsetsSides.b(this.f4045b)) + ')';
    }
}
