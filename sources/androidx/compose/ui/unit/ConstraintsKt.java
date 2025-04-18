package androidx.compose.ui.unit;

import android.support.v4.media.d;
import p0.a;

/* loaded from: classes.dex */
public final class ConstraintsKt {
    public static final long a(int i2, int i3, int i4, int i5) {
        boolean z2 = false;
        if (!(i3 >= i2)) {
            InlineClassHelperKt.a("maxWidth(" + i3 + ") must be >= than minWidth(" + i2 + ')');
            throw null;
        }
        if (!(i5 >= i4)) {
            InlineClassHelperKt.a("maxHeight(" + i5 + ") must be >= than minHeight(" + i4 + ')');
            throw null;
        }
        if (i2 >= 0 && i4 >= 0) {
            z2 = true;
        }
        if (z2) {
            return i(i2, i3, i4, i5);
        }
        InlineClassHelperKt.a("minWidth(" + i2 + ") and minHeight(" + i4 + ") must be >= 0");
        throw null;
    }

    public static /* synthetic */ long b(int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return a(0, i2, 0, i3);
    }

    public static final int c(int i2) {
        if (i2 < 8191) {
            return 262142;
        }
        if (i2 < 32767) {
            return 65534;
        }
        if (i2 < 65535) {
            return 32766;
        }
        if (i2 < 262143) {
            return 8190;
        }
        throw new IllegalArgumentException(d.j("Can't represent a size of ", i2, " in Constraints"));
    }

    public static final int d(int i2) {
        if (i2 < 8191) {
            return 13;
        }
        if (i2 < 32767) {
            return 15;
        }
        if (i2 < 65535) {
            return 16;
        }
        return i2 < 262143 ? 18 : 255;
    }

    public static final long e(long j2, long j3) {
        return IntSizeKt.a(a.A((int) (j3 >> 32), Constraints.k(j2), Constraints.i(j2)), a.A((int) (j3 & 4294967295L), Constraints.j(j2), Constraints.h(j2)));
    }

    public static final long f(long j2, long j3) {
        return a(a.A(Constraints.k(j3), Constraints.k(j2), Constraints.i(j2)), a.A(Constraints.i(j3), Constraints.k(j2), Constraints.i(j2)), a.A(Constraints.j(j3), Constraints.j(j2), Constraints.h(j2)), a.A(Constraints.h(j3), Constraints.j(j2), Constraints.h(j2)));
    }

    public static final int g(int i2, long j2) {
        return a.A(i2, Constraints.j(j2), Constraints.h(j2));
    }

    public static final int h(int i2, long j2) {
        return a.A(i2, Constraints.k(j2), Constraints.i(j2));
    }

    public static final long i(int i2, int i3, int i4, int i5) {
        int i6 = i5 == Integer.MAX_VALUE ? i4 : i5;
        int d = d(i6);
        int i7 = i3 == Integer.MAX_VALUE ? i2 : i3;
        int d2 = d(i7);
        if (d + d2 > 31) {
            throw new IllegalArgumentException(d.l("Can't represent a width of ", i7, " and height of ", i6, " in Constraints"));
        }
        int i8 = i3 + 1;
        int i9 = i8 & (~(i8 >> 31));
        int i10 = i5 + 1;
        int i11 = i10 & (~(i10 >> 31));
        int i12 = 0;
        if (d2 != 13) {
            if (d2 == 18) {
                i12 = 3;
            } else if (d2 == 15) {
                i12 = 1;
            } else if (d2 == 16) {
                i12 = 2;
            }
        }
        int i13 = (((i12 & 2) >> 1) * 3) + ((i12 & 1) << 1);
        return (i9 << 33) | i12 | (i2 << 2) | (i4 << (i13 + 15)) | (i11 << (i13 + 46));
    }

    public static final boolean j(long j2, long j3) {
        int k2 = Constraints.k(j2);
        int i2 = Constraints.i(j2);
        int i3 = (int) (j3 >> 32);
        if (k2 <= i3 && i3 <= i2) {
            int j4 = Constraints.j(j2);
            int h2 = Constraints.h(j2);
            int i4 = (int) (j3 & 4294967295L);
            if (j4 <= i4 && i4 <= h2) {
                return true;
            }
        }
        return false;
    }

    public static final long k(int i2, int i3, long j2) {
        int k2 = Constraints.k(j2) + i2;
        if (k2 < 0) {
            k2 = 0;
        }
        int i4 = Constraints.i(j2);
        if (i4 != Integer.MAX_VALUE && (i4 = i4 + i2) < 0) {
            i4 = 0;
        }
        int j3 = Constraints.j(j2) + i3;
        if (j3 < 0) {
            j3 = 0;
        }
        int h2 = Constraints.h(j2);
        if (h2 != Integer.MAX_VALUE) {
            int i5 = h2 + i3;
            h2 = i5 >= 0 ? i5 : 0;
        }
        return a(k2, i4, j3, h2);
    }

    public static /* synthetic */ long l(int i2, int i3, long j2, int i4) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return k(i2, i3, j2);
    }
}
