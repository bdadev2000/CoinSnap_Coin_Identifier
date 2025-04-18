package androidx.compose.ui.layout;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes3.dex */
public final class FixedScale implements ContentScale {

    /* renamed from: a, reason: collision with root package name */
    public final float f15728a = 1.0f;

    @Override // androidx.compose.ui.layout.ContentScale
    public final long a(long j2, long j3) {
        float f2 = this.f15728a;
        return ScaleFactorKt.a(f2, f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FixedScale) && Float.compare(this.f15728a, ((FixedScale) obj).f15728a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15728a);
    }

    public final String toString() {
        return d.n(new StringBuilder("FixedScale(value="), this.f15728a, ')');
    }
}
