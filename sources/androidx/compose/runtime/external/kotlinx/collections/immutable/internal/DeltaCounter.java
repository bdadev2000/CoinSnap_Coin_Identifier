package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class DeltaCounter {

    /* renamed from: a, reason: collision with root package name */
    public int f14278a = 0;

    public final void a(int i2) {
        this.f14278a += i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeltaCounter) && this.f14278a == ((DeltaCounter) obj).f14278a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14278a);
    }

    public final String toString() {
        return d.o(new StringBuilder("DeltaCounter(count="), this.f14278a, ')');
    }
}
