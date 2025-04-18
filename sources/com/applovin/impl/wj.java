package com.applovin.impl;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes2.dex */
public interface wj {

    /* loaded from: classes2.dex */
    public static class a implements wj {

        /* renamed from: a, reason: collision with root package name */
        private final Random f27725a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f27726b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f27727c;

        public a(int i2) {
            this(i2, new Random());
        }

        @Override // com.applovin.impl.wj
        public wj a(int i2, int i3) {
            int i4 = i3 - i2;
            int[] iArr = new int[this.f27726b.length - i4];
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int[] iArr2 = this.f27726b;
                if (i5 < iArr2.length) {
                    int i7 = iArr2[i5];
                    if (i7 < i2 || i7 >= i3) {
                        int i8 = i5 - i6;
                        if (i7 >= i2) {
                            i7 -= i4;
                        }
                        iArr[i8] = i7;
                    } else {
                        i6++;
                    }
                    i5++;
                } else {
                    return new a(iArr, new Random(this.f27725a.nextLong()));
                }
            }
        }

        @Override // com.applovin.impl.wj
        public wj b(int i2, int i3) {
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int i4 = 0;
            int i5 = 0;
            while (i5 < i3) {
                iArr[i5] = this.f27725a.nextInt(this.f27726b.length + 1);
                int i6 = i5 + 1;
                int nextInt = this.f27725a.nextInt(i6);
                iArr2[i5] = iArr2[nextInt];
                iArr2[nextInt] = i5 + i2;
                i5 = i6;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f27726b.length + i3];
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f27726b;
                if (i4 < iArr4.length + i3) {
                    if (i7 < i3 && i8 == iArr[i7]) {
                        iArr3[i4] = iArr2[i7];
                        i7++;
                    } else {
                        int i9 = i8 + 1;
                        int i10 = iArr4[i8];
                        iArr3[i4] = i10;
                        if (i10 >= i2) {
                            iArr3[i4] = i10 + i3;
                        }
                        i8 = i9;
                    }
                    i4++;
                } else {
                    return new a(iArr3, new Random(this.f27725a.nextLong()));
                }
            }
        }

        @Override // com.applovin.impl.wj
        public int c() {
            int[] iArr = this.f27726b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.applovin.impl.wj
        public wj d() {
            return new a(0, new Random(this.f27725a.nextLong()));
        }

        private a(int i2, Random random) {
            this(a(i2, random), random);
        }

        private a(int[] iArr, Random random) {
            this.f27726b = iArr;
            this.f27725a = random;
            this.f27727c = new int[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                this.f27727c[iArr[i2]] = i2;
            }
        }

        private static int[] a(int i2, Random random) {
            int[] iArr = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i3 + 1;
                int nextInt = random.nextInt(i4);
                iArr[i3] = iArr[nextInt];
                iArr[nextInt] = i3;
                i3 = i4;
            }
            return iArr;
        }

        @Override // com.applovin.impl.wj
        public int a() {
            return this.f27726b.length;
        }

        @Override // com.applovin.impl.wj
        public int a(int i2) {
            int i3 = this.f27727c[i2] + 1;
            int[] iArr = this.f27726b;
            if (i3 < iArr.length) {
                return iArr[i3];
            }
            return -1;
        }

        @Override // com.applovin.impl.wj
        public int b() {
            int[] iArr = this.f27726b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.applovin.impl.wj
        public int b(int i2) {
            int i3 = this.f27727c[i2] - 1;
            if (i3 >= 0) {
                return this.f27726b[i3];
            }
            return -1;
        }
    }

    int a();

    int a(int i2);

    wj a(int i2, int i3);

    int b();

    int b(int i2);

    wj b(int i2, int i3);

    int c();

    wj d();
}
