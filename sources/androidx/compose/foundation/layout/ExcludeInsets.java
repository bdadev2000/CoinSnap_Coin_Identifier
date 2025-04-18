package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

@Stable
/* loaded from: classes4.dex */
final class ExcludeInsets implements WindowInsets {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets f3883a;

    /* renamed from: b, reason: collision with root package name */
    public final WindowInsets f3884b;

    public ExcludeInsets(WindowInsets windowInsets, WindowInsets windowInsets2) {
        this.f3883a = windowInsets;
        this.f3884b = windowInsets2;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int a(Density density) {
        int a2 = this.f3883a.a(density) - this.f3884b.a(density);
        if (a2 < 0) {
            return 0;
        }
        return a2;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int b(Density density, LayoutDirection layoutDirection) {
        int b2 = this.f3883a.b(density, layoutDirection) - this.f3884b.b(density, layoutDirection);
        if (b2 < 0) {
            return 0;
        }
        return b2;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int c(Density density) {
        int c2 = this.f3883a.c(density) - this.f3884b.c(density);
        if (c2 < 0) {
            return 0;
        }
        return c2;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int d(Density density, LayoutDirection layoutDirection) {
        int d = this.f3883a.d(density, layoutDirection) - this.f3884b.d(density, layoutDirection);
        if (d < 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExcludeInsets)) {
            return false;
        }
        ExcludeInsets excludeInsets = (ExcludeInsets) obj;
        return p0.a.g(excludeInsets.f3883a, this.f3883a) && p0.a.g(excludeInsets.f3884b, this.f3884b);
    }

    public final int hashCode() {
        return this.f3884b.hashCode() + (this.f3883a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f3883a + " - " + this.f3884b + ')';
    }
}
