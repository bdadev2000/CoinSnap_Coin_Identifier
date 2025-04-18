package androidx.compose.ui.input.pointer.util;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes2.dex */
public final class DataPointAtTime {

    /* renamed from: a, reason: collision with root package name */
    public long f15669a;

    /* renamed from: b, reason: collision with root package name */
    public float f15670b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataPointAtTime)) {
            return false;
        }
        DataPointAtTime dataPointAtTime = (DataPointAtTime) obj;
        return this.f15669a == dataPointAtTime.f15669a && Float.compare(this.f15670b, dataPointAtTime.f15670b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15670b) + (Long.hashCode(this.f15669a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f15669a);
        sb.append(", dataPoint=");
        return d.n(sb, this.f15670b, ')');
    }
}
