package androidx.collection.internal;

import p0.a;

/* loaded from: classes2.dex */
public final class ContainerHelpersKt {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1617a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f1618b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f1619c = new Object[0];

    public static final int a(int i2, int i3, int[] iArr) {
        a.s(iArr, "array");
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int b(long[] jArr, int i2, long j2) {
        a.s(jArr, "array");
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }
}
