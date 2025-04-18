package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;

@Stable
/* loaded from: classes2.dex */
final class PaddingValuesConsumingModifier extends InsetsConsumingModifier {

    /* renamed from: b, reason: collision with root package name */
    public final PaddingValues f4074b = null;

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifier
    public final WindowInsets a(WindowInsets windowInsets) {
        return new AddedInsets(new PaddingValuesInsets(this.f4074b), windowInsets);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaddingValuesConsumingModifier) {
            return p0.a.g(((PaddingValuesConsumingModifier) obj).f4074b, this.f4074b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4074b.hashCode();
    }
}
