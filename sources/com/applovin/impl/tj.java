package com.applovin.impl;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public interface tj {

    /* loaded from: classes.dex */
    public static class a implements tj {

        /* renamed from: a, reason: collision with root package name */
        private final Random f11487a;
        private final int[] b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f11488c;

        public a(int i9) {
            this(i9, new Random());
        }

        @Override // com.applovin.impl.tj
        public tj a(int i9, int i10) {
            int i11 = i10 - i9;
            int[] iArr = new int[this.b.length - i11];
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int[] iArr2 = this.b;
                if (i12 < iArr2.length) {
                    int i14 = iArr2[i12];
                    if (i14 < i9 || i14 >= i10) {
                        int i15 = i12 - i13;
                        if (i14 >= i9) {
                            i14 -= i11;
                        }
                        iArr[i15] = i14;
                    } else {
                        i13++;
                    }
                    i12++;
                } else {
                    return new a(iArr, new Random(this.f11487a.nextLong()));
                }
            }
        }

        @Override // com.applovin.impl.tj
        public tj b(int i9, int i10) {
            int[] iArr = new int[i10];
            int[] iArr2 = new int[i10];
            int i11 = 0;
            int i12 = 0;
            while (i12 < i10) {
                iArr[i12] = this.f11487a.nextInt(this.b.length + 1);
                int i13 = i12 + 1;
                int nextInt = this.f11487a.nextInt(i13);
                iArr2[i12] = iArr2[nextInt];
                iArr2[nextInt] = i12 + i9;
                i12 = i13;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.b.length + i10];
            int i14 = 0;
            int i15 = 0;
            while (true) {
                int[] iArr4 = this.b;
                if (i11 < iArr4.length + i10) {
                    if (i14 < i10 && i15 == iArr[i14]) {
                        iArr3[i11] = iArr2[i14];
                        i14++;
                    } else {
                        int i16 = i15 + 1;
                        int i17 = iArr4[i15];
                        iArr3[i11] = i17;
                        if (i17 >= i9) {
                            iArr3[i11] = i17 + i10;
                        }
                        i15 = i16;
                    }
                    i11++;
                } else {
                    return new a(iArr3, new Random(this.f11487a.nextLong()));
                }
            }
        }

        @Override // com.applovin.impl.tj
        public int c() {
            int[] iArr = this.b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.applovin.impl.tj
        public tj d() {
            return new a(0, new Random(this.f11487a.nextLong()));
        }

        private a(int i9, Random random) {
            this(a(i9, random), random);
        }

        private a(int[] iArr, Random random) {
            this.b = iArr;
            this.f11487a = random;
            this.f11488c = new int[iArr.length];
            for (int i9 = 0; i9 < iArr.length; i9++) {
                this.f11488c[iArr[i9]] = i9;
            }
        }

        private static int[] a(int i9, Random random) {
            int[] iArr = new int[i9];
            int i10 = 0;
            while (i10 < i9) {
                int i11 = i10 + 1;
                int nextInt = random.nextInt(i11);
                iArr[i10] = iArr[nextInt];
                iArr[nextInt] = i10;
                i10 = i11;
            }
            return iArr;
        }

        @Override // com.applovin.impl.tj
        public int a() {
            return this.b.length;
        }

        @Override // com.applovin.impl.tj
        public int a(int i9) {
            int i10 = this.f11488c[i9] + 1;
            int[] iArr = this.b;
            if (i10 < iArr.length) {
                return iArr[i10];
            }
            return -1;
        }

        @Override // com.applovin.impl.tj
        public int b() {
            int[] iArr = this.b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.applovin.impl.tj
        public int b(int i9) {
            int i10 = this.f11488c[i9] - 1;
            if (i10 >= 0) {
                return this.b[i10];
            }
            return -1;
        }
    }

    int a();

    int a(int i9);

    tj a(int i9, int i10);

    int b();

    int b(int i9);

    tj b(int i9, int i10);

    int c();

    tj d();
}
