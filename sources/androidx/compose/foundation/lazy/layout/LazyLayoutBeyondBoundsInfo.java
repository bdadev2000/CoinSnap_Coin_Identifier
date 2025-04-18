package androidx.compose.foundation.lazy.layout;

import android.support.v4.media.d;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes2.dex */
public final class LazyLayoutBeyondBoundsInfo {

    /* renamed from: a, reason: collision with root package name */
    public final MutableVector f4695a = new MutableVector(new Interval[16]);

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class Interval {

        /* renamed from: a, reason: collision with root package name */
        public final int f4696a;

        /* renamed from: b, reason: collision with root package name */
        public final int f4697b;

        public Interval(int i2, int i3) {
            this.f4696a = i2;
            this.f4697b = i3;
            if (i2 < 0) {
                throw new IllegalArgumentException("negative start index".toString());
            }
            if (i3 < i2) {
                throw new IllegalArgumentException("end index greater than start".toString());
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Interval)) {
                return false;
            }
            Interval interval = (Interval) obj;
            return this.f4696a == interval.f4696a && this.f4697b == interval.f4697b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f4697b) + (Integer.hashCode(this.f4696a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Interval(start=");
            sb.append(this.f4696a);
            sb.append(", end=");
            return d.o(sb, this.f4697b, ')');
        }
    }
}
