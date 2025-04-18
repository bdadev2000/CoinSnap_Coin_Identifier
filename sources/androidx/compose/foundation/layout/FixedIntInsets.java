package androidx.compose.foundation.layout;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

@Immutable
/* loaded from: classes2.dex */
final class FixedIntInsets implements WindowInsets {

    /* renamed from: a, reason: collision with root package name */
    public final int f3891a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f3892b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f3893c = 0;
    public final int d = 0;

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int a(Density density) {
        return this.f3892b;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int b(Density density, LayoutDirection layoutDirection) {
        return this.f3893c;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int c(Density density) {
        return this.d;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int d(Density density, LayoutDirection layoutDirection) {
        return this.f3891a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedIntInsets)) {
            return false;
        }
        FixedIntInsets fixedIntInsets = (FixedIntInsets) obj;
        return this.f3891a == fixedIntInsets.f3891a && this.f3892b == fixedIntInsets.f3892b && this.f3893c == fixedIntInsets.f3893c && this.d == fixedIntInsets.d;
    }

    public final int hashCode() {
        return (((((this.f3891a * 31) + this.f3892b) * 31) + this.f3893c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets(left=");
        sb.append(this.f3891a);
        sb.append(", top=");
        sb.append(this.f3892b);
        sb.append(", right=");
        sb.append(this.f3893c);
        sb.append(", bottom=");
        return d.o(sb, this.d, ')');
    }
}
