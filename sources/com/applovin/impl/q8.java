package com.applovin.impl;

/* loaded from: classes.dex */
abstract class q8 {

    /* loaded from: classes.dex */
    public static final class b {
        public final long[] a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f7129b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7130c;

        /* renamed from: d, reason: collision with root package name */
        public final long[] f7131d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f7132e;

        /* renamed from: f, reason: collision with root package name */
        public final long f7133f;

        private b(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j3) {
            this.a = jArr;
            this.f7129b = iArr;
            this.f7130c = i10;
            this.f7131d = jArr2;
            this.f7132e = iArr2;
            this.f7133f = j3;
        }
    }

    public static b a(int i10, long[] jArr, int[] iArr, long j3) {
        int i11 = 8192 / i10;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += yp.a(i13, i11);
        }
        long[] jArr2 = new long[i12];
        int[] iArr2 = new int[i12];
        long[] jArr3 = new long[i12];
        int[] iArr3 = new int[i12];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < iArr.length; i17++) {
            int i18 = iArr[i17];
            long j10 = jArr[i17];
            while (i18 > 0) {
                int min = Math.min(i11, i18);
                jArr2[i15] = j10;
                int i19 = i10 * min;
                iArr2[i15] = i19;
                i16 = Math.max(i16, i19);
                jArr3[i15] = i14 * j3;
                iArr3[i15] = 1;
                j10 += iArr2[i15];
                i14 += min;
                i18 -= min;
                i15++;
            }
        }
        return new b(jArr2, iArr2, i16, jArr3, iArr3, j3 * i14);
    }
}
