package com.applovin.impl;

/* loaded from: classes2.dex */
abstract class s8 {

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f26467a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f26468b;

        /* renamed from: c, reason: collision with root package name */
        public final int f26469c;
        public final long[] d;
        public final int[] e;

        /* renamed from: f, reason: collision with root package name */
        public final long f26470f;

        private b(long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2, long j2) {
            this.f26467a = jArr;
            this.f26468b = iArr;
            this.f26469c = i2;
            this.d = jArr2;
            this.e = iArr2;
            this.f26470f = j2;
        }
    }

    public static b a(int i2, long[] jArr, int[] iArr, long j2) {
        int i3 = 8192 / i2;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += xp.a(i5, i3);
        }
        long[] jArr2 = new long[i4];
        int[] iArr2 = new int[i4];
        long[] jArr3 = new long[i4];
        int[] iArr3 = new int[i4];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < iArr.length; i9++) {
            int i10 = iArr[i9];
            long j3 = jArr[i9];
            while (i10 > 0) {
                int min = Math.min(i3, i10);
                jArr2[i7] = j3;
                int i11 = i2 * min;
                iArr2[i7] = i11;
                i8 = Math.max(i8, i11);
                jArr3[i7] = i6 * j2;
                iArr3[i7] = 1;
                j3 += iArr2[i7];
                i6 += min;
                i10 -= min;
                i7++;
            }
        }
        return new b(jArr2, iArr2, i8, jArr3, iArr3, j2 * i6);
    }
}
