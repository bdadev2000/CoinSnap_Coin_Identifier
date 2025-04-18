package androidx.compose.foundation.layout;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes3.dex */
public final class FlowLayoutData {

    /* renamed from: a, reason: collision with root package name */
    public float f3909a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FlowLayoutData) && Float.compare(this.f3909a, ((FlowLayoutData) obj).f3909a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3909a);
    }

    public final String toString() {
        return d.n(new StringBuilder("FlowLayoutData(fillCrossAxisFraction="), this.f3909a, ')');
    }
}
