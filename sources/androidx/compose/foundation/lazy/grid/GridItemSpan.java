package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes2.dex */
public final class GridItemSpan {

    /* renamed from: a, reason: collision with root package name */
    public final long f4447a;

    public final boolean equals(Object obj) {
        if (obj instanceof GridItemSpan) {
            return this.f4447a == ((GridItemSpan) obj).f4447a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4447a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.f4447a + ')';
    }
}
