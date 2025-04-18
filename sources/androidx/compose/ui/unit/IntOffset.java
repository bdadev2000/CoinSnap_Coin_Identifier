package androidx.compose.ui.unit;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes3.dex */
public final class IntOffset {

    /* renamed from: a, reason: collision with root package name */
    public final long f17489a;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public static long a(int i2, int i3, long j2, int i4) {
        if ((i4 & 1) != 0) {
            i2 = (int) (j2 >> 32);
        }
        if ((i4 & 2) != 0) {
            i3 = (int) (j2 & 4294967295L);
        }
        return (i3 & 4294967295L) | (i2 << 32);
    }

    public static final boolean b(long j2, long j3) {
        return j2 == j3;
    }

    public static final long c(long j2, long j3) {
        return ((((int) (j2 >> 32)) - ((int) (j3 >> 32))) << 32) | ((((int) (j2 & 4294967295L)) - ((int) (j3 & 4294967295L))) & 4294967295L);
    }

    public static final long d(long j2, long j3) {
        return ((((int) (j2 >> 32)) + ((int) (j3 >> 32))) << 32) | ((((int) (j2 & 4294967295L)) + ((int) (j3 & 4294967295L))) & 4294967295L);
    }

    public static String e(long j2) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j2 >> 32));
        sb.append(", ");
        return d.o(sb, (int) (j2 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof IntOffset) {
            return this.f17489a == ((IntOffset) obj).f17489a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17489a);
    }

    public final String toString() {
        return e(this.f17489a);
    }
}
