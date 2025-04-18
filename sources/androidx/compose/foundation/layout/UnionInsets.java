package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

@Stable
/* loaded from: classes3.dex */
final class UnionInsets implements WindowInsets {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets f4121a;

    /* renamed from: b, reason: collision with root package name */
    public final WindowInsets f4122b;

    public UnionInsets(WindowInsets windowInsets, WindowInsets windowInsets2) {
        this.f4121a = windowInsets;
        this.f4122b = windowInsets2;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int a(Density density) {
        return Math.max(this.f4121a.a(density), this.f4122b.a(density));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int b(Density density, LayoutDirection layoutDirection) {
        return Math.max(this.f4121a.b(density, layoutDirection), this.f4122b.b(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int c(Density density) {
        return Math.max(this.f4121a.c(density), this.f4122b.c(density));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int d(Density density, LayoutDirection layoutDirection) {
        return Math.max(this.f4121a.d(density, layoutDirection), this.f4122b.d(density, layoutDirection));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnionInsets)) {
            return false;
        }
        UnionInsets unionInsets = (UnionInsets) obj;
        return p0.a.g(unionInsets.f4121a, this.f4121a) && p0.a.g(unionInsets.f4122b, this.f4122b);
    }

    public final int hashCode() {
        return (this.f4122b.hashCode() * 31) + this.f4121a.hashCode();
    }

    public final String toString() {
        return "(" + this.f4121a + " ∪ " + this.f4122b + ')';
    }
}
