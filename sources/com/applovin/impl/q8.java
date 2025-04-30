package com.applovin.impl;

import androidx.fragment.app.FragmentTransaction;

/* loaded from: classes.dex */
abstract class q8 {

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f10212a;
        public final int[] b;

        /* renamed from: c, reason: collision with root package name */
        public final int f10213c;

        /* renamed from: d, reason: collision with root package name */
        public final long[] f10214d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f10215e;

        /* renamed from: f, reason: collision with root package name */
        public final long f10216f;

        private b(long[] jArr, int[] iArr, int i9, long[] jArr2, int[] iArr2, long j7) {
            this.f10212a = jArr;
            this.b = iArr;
            this.f10213c = i9;
            this.f10214d = jArr2;
            this.f10215e = iArr2;
            this.f10216f = j7;
        }
    }

    public static b a(int i9, long[] jArr, int[] iArr, long j7) {
        int i10 = FragmentTransaction.TRANSIT_EXIT_MASK / i9;
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += yp.a(i12, i10);
        }
        long[] jArr2 = new long[i11];
        int[] iArr2 = new int[i11];
        long[] jArr3 = new long[i11];
        int[] iArr3 = new int[i11];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < iArr.length; i16++) {
            int i17 = iArr[i16];
            long j9 = jArr[i16];
            while (i17 > 0) {
                int min = Math.min(i10, i17);
                jArr2[i14] = j9;
                int i18 = i9 * min;
                iArr2[i14] = i18;
                i15 = Math.max(i15, i18);
                jArr3[i14] = i13 * j7;
                iArr3[i14] = 1;
                j9 += iArr2[i14];
                i13 += min;
                i17 -= min;
                i14++;
            }
        }
        return new b(jArr2, iArr2, i15, jArr3, iArr3, j7 * i13);
    }
}
