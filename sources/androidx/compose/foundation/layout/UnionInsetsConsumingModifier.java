package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;

@Stable
/* loaded from: classes2.dex */
final class UnionInsetsConsumingModifier extends InsetsConsumingModifier {

    /* renamed from: b, reason: collision with root package name */
    public final WindowInsets f4123b;

    public UnionInsetsConsumingModifier(WindowInsets windowInsets) {
        this.f4123b = windowInsets;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifier
    public final WindowInsets a(WindowInsets windowInsets) {
        return new UnionInsets(this.f4123b, windowInsets);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnionInsetsConsumingModifier) {
            return p0.a.g(((UnionInsetsConsumingModifier) obj).f4123b, this.f4123b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4123b.hashCode();
    }
}
