package androidx.compose.ui.unit;

import android.support.v4.media.d;
import androidx.compose.foundation.text.input.a;
import androidx.compose.runtime.Immutable;
import com.google.android.gms.common.api.Api;

@Immutable
/* loaded from: classes2.dex */
public final class Constraints {

    /* renamed from: a, reason: collision with root package name */
    public final long f17480a;

    /* loaded from: classes2.dex */
    public static final class Companion {
        public static long a(int i2, int i3, int i4, int i5) {
            int min = Math.min(i4, 262142);
            int i6 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            int min2 = i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i5, 262142);
            int c2 = ConstraintsKt.c(min2 == Integer.MAX_VALUE ? min : min2);
            if (i3 != Integer.MAX_VALUE) {
                i6 = Math.min(c2, i3);
            }
            return ConstraintsKt.a(Math.min(c2, i2), i6, min, min2);
        }

        public static long b(int i2, int i3, int i4, int i5) {
            int min = Math.min(i2, 262142);
            int i6 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            int min2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
            int c2 = ConstraintsKt.c(min2 == Integer.MAX_VALUE ? min : min2);
            if (i5 != Integer.MAX_VALUE) {
                i6 = Math.min(c2, i5);
            }
            return ConstraintsKt.a(min, min2, Math.min(c2, i4), i6);
        }

        public static long c(int i2, int i3) {
            if (i2 >= 0 && i3 >= 0) {
                return ConstraintsKt.i(i2, i2, i3, i3);
            }
            InlineClassHelperKt.a("width(" + i2 + ") and height(" + i3 + ") must be >= 0");
            throw null;
        }

        public static long d(int i2) {
            if (i2 >= 0) {
                return ConstraintsKt.i(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, i2, i2);
            }
            InlineClassHelperKt.a("height(" + i2 + ") must be >= 0");
            throw null;
        }

        public static long e(int i2) {
            if (i2 >= 0) {
                return ConstraintsKt.i(i2, i2, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            }
            InlineClassHelperKt.a("width(" + i2 + ") must be >= 0");
            throw null;
        }
    }

    public static final long a(int i2, int i3, int i4, int i5) {
        if (!(i4 >= 0 && i2 >= 0)) {
            InlineClassHelperKt.a("minHeight(" + i4 + ") and minWidth(" + i2 + ") must be >= 0");
            throw null;
        }
        if (!(i3 >= i2)) {
            InlineClassHelperKt.a("maxWidth(" + i3 + ") must be >= minWidth(" + i2 + ')');
            throw null;
        }
        if (i5 >= i4) {
            return ConstraintsKt.i(i2, i3, i4, i5);
        }
        InlineClassHelperKt.a("maxHeight(" + i5 + ") must be >= minHeight(" + i4 + ')');
        throw null;
    }

    public static /* synthetic */ long b(long j2, int i2, int i3, int i4, int i5, int i6) {
        if ((i6 & 1) != 0) {
            i2 = k(j2);
        }
        if ((i6 & 2) != 0) {
            i3 = i(j2);
        }
        if ((i6 & 4) != 0) {
            i4 = j(j2);
        }
        if ((i6 & 8) != 0) {
            i5 = h(j2);
        }
        return a(i2, i3, i4, i5);
    }

    public static final boolean c(long j2, long j3) {
        return j2 == j3;
    }

    public static final boolean d(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = (((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1);
        return (((int) (j2 >> (i3 + 46))) & ((1 << (18 - i3)) - 1)) != 0;
    }

    public static final boolean e(long j2) {
        int i2 = (int) (3 & j2);
        return (((int) (j2 >> 33)) & ((1 << a.a((i2 & 2) >> 1, 3, (i2 & 1) << 1, 13)) - 1)) != 0;
    }

    public static final boolean f(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = (((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1);
        int i4 = (1 << (18 - i3)) - 1;
        int i5 = ((int) (j2 >> (i3 + 15))) & i4;
        int i6 = ((int) (j2 >> (i3 + 46))) & i4;
        return i5 == (i6 == 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i6 - 1);
    }

    public static final boolean g(long j2) {
        int i2 = (int) (3 & j2);
        int a2 = (1 << a.a((i2 & 2) >> 1, 3, (i2 & 1) << 1, 13)) - 1;
        int i3 = ((int) (j2 >> 2)) & a2;
        int i4 = ((int) (j2 >> 33)) & a2;
        return i3 == (i4 == 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i4 - 1);
    }

    public static final int h(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = (((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1);
        int i4 = ((int) (j2 >> (i3 + 46))) & ((1 << (18 - i3)) - 1);
        return i4 == 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i4 - 1;
    }

    public static final int i(long j2) {
        int i2 = (int) (3 & j2);
        int a2 = ((int) (j2 >> 33)) & ((1 << a.a((i2 & 2) >> 1, 3, (i2 & 1) << 1, 13)) - 1);
        return a2 == 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : a2 - 1;
    }

    public static final int j(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = (((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1);
        return ((int) (j2 >> (i3 + 15))) & ((1 << (18 - i3)) - 1);
    }

    public static final int k(long j2) {
        int i2 = (int) (3 & j2);
        return ((int) (j2 >> 2)) & ((1 << a.a((i2 & 2) >> 1, 3, (i2 & 1) << 1, 13)) - 1);
    }

    public static final boolean l(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = (((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1);
        return (((int) (j2 >> 33)) & ((1 << (i3 + 13)) - 1)) - 1 == 0 || (((int) (j2 >> (i3 + 46))) & ((1 << (18 - i3)) - 1)) - 1 == 0;
    }

    public static String m(long j2) {
        int i2 = i(j2);
        String valueOf = i2 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(i2);
        int h2 = h(j2);
        String valueOf2 = h2 != Integer.MAX_VALUE ? String.valueOf(h2) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(k(j2));
        sb.append(", maxWidth = ");
        sb.append(valueOf);
        sb.append(", minHeight = ");
        sb.append(j(j2));
        sb.append(", maxHeight = ");
        return d.q(sb, valueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Constraints) {
            return this.f17480a == ((Constraints) obj).f17480a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17480a);
    }

    public final String toString() {
        return m(this.f17480a);
    }
}
