package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

@Stable
/* loaded from: classes4.dex */
final class AddedInsets implements WindowInsets {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets f3748a;

    /* renamed from: b, reason: collision with root package name */
    public final WindowInsets f3749b;

    public AddedInsets(WindowInsets windowInsets, WindowInsets windowInsets2) {
        this.f3748a = windowInsets;
        this.f3749b = windowInsets2;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int a(Density density) {
        return this.f3749b.a(density) + this.f3748a.a(density);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int b(Density density, LayoutDirection layoutDirection) {
        return this.f3749b.b(density, layoutDirection) + this.f3748a.b(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int c(Density density) {
        return this.f3749b.c(density) + this.f3748a.c(density);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int d(Density density, LayoutDirection layoutDirection) {
        return this.f3749b.d(density, layoutDirection) + this.f3748a.d(density, layoutDirection);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddedInsets)) {
            return false;
        }
        AddedInsets addedInsets = (AddedInsets) obj;
        return p0.a.g(addedInsets.f3748a, this.f3748a) && p0.a.g(addedInsets.f3749b, this.f3749b);
    }

    public final int hashCode() {
        return (this.f3749b.hashCode() * 31) + this.f3748a.hashCode();
    }

    public final String toString() {
        return "(" + this.f3748a + " + " + this.f3749b + ')';
    }
}
