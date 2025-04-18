package androidx.collection;

import android.support.v4.media.d;

/* loaded from: classes3.dex */
public final class IntIntPair {

    /* renamed from: a, reason: collision with root package name */
    public final long f1432a;

    public /* synthetic */ IntIntPair(long j2) {
        this.f1432a = j2;
    }

    public static long a(int i2, int i3) {
        return (i3 & 4294967295L) | (i2 << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof IntIntPair) {
            return this.f1432a == ((IntIntPair) obj).f1432a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1432a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j2 = this.f1432a;
        sb.append((int) (j2 >> 32));
        sb.append(", ");
        return d.o(sb, (int) (j2 & 4294967295L), ')');
    }
}
