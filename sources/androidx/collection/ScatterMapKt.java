package androidx.collection;

import p0.a;

/* loaded from: classes4.dex */
public final class ScatterMapKt {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f1590a = {-9187201950435737345L, -1};

    static {
        new MutableScatterMap(0);
    }

    public static final void a(long[] jArr, int i2) {
        a.s(jArr, "metadata");
        int i3 = (i2 + 7) >> 3;
        for (int i4 = 0; i4 < i3; i4++) {
            long j2 = jArr[i4] & (-9187201950435737472L);
            jArr[i4] = (-72340172838076674L) & ((~j2) + (j2 >>> 7));
        }
        int length = jArr.length;
        int i5 = length - 1;
        int i6 = length - 2;
        jArr[i6] = (jArr[i6] & 72057594037927935L) | (-72057594037927936L);
        jArr[i5] = jArr[0];
    }

    public static final int b(long[] jArr, int i2, int i3) {
        while (i2 < i3) {
            if (((jArr[i2 >> 3] >> ((i2 & 7) << 3)) & 255) == 128) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final int c(int i2) {
        if (i2 == 7) {
            return 6;
        }
        return i2 - (i2 / 8);
    }

    public static final MutableScatterMap d() {
        return new MutableScatterMap();
    }

    public static final int e(int i2) {
        if (i2 == 0) {
            return 6;
        }
        return (i2 * 2) + 1;
    }

    public static final int f(int i2) {
        if (i2 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i2);
        }
        return 0;
    }

    public static final int g(int i2) {
        if (i2 == 7) {
            return 8;
        }
        return ((i2 - 1) / 7) + i2;
    }
}
