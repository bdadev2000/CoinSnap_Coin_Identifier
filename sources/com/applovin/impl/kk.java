package com.applovin.impl;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
final class kk {

    /* renamed from: a, reason: collision with root package name */
    private final int f8706a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final float f8707c;

    /* renamed from: d, reason: collision with root package name */
    private final float f8708d;

    /* renamed from: e, reason: collision with root package name */
    private final float f8709e;

    /* renamed from: f, reason: collision with root package name */
    private final int f8710f;

    /* renamed from: g, reason: collision with root package name */
    private final int f8711g;

    /* renamed from: h, reason: collision with root package name */
    private final int f8712h;

    /* renamed from: i, reason: collision with root package name */
    private final short[] f8713i;

    /* renamed from: j, reason: collision with root package name */
    private short[] f8714j;

    /* renamed from: k, reason: collision with root package name */
    private int f8715k;
    private short[] l;
    private int m;

    /* renamed from: n, reason: collision with root package name */
    private short[] f8716n;

    /* renamed from: o, reason: collision with root package name */
    private int f8717o;

    /* renamed from: p, reason: collision with root package name */
    private int f8718p;

    /* renamed from: q, reason: collision with root package name */
    private int f8719q;

    /* renamed from: r, reason: collision with root package name */
    private int f8720r;

    /* renamed from: s, reason: collision with root package name */
    private int f8721s;

    /* renamed from: t, reason: collision with root package name */
    private int f8722t;

    /* renamed from: u, reason: collision with root package name */
    private int f8723u;

    /* renamed from: v, reason: collision with root package name */
    private int f8724v;

    public kk(int i9, int i10, float f9, float f10, int i11) {
        this.f8706a = i9;
        this.b = i10;
        this.f8707c = f9;
        this.f8708d = f10;
        this.f8709e = i9 / i11;
        this.f8710f = i9 / 400;
        int i12 = i9 / 65;
        this.f8711g = i12;
        int i13 = i12 * 2;
        this.f8712h = i13;
        this.f8713i = new short[i13];
        int i14 = i13 * i10;
        this.f8714j = new short[i14];
        this.l = new short[i14];
        this.f8716n = new short[i14];
    }

    private void a(float f9, int i9) {
        int i10;
        int i11;
        if (this.m == i9) {
            return;
        }
        int i12 = this.f8706a;
        int i13 = (int) (i12 / f9);
        while (true) {
            if (i13 <= 16384 && i12 <= 16384) {
                break;
            }
            i13 /= 2;
            i12 /= 2;
        }
        b(i9);
        int i14 = 0;
        while (true) {
            int i15 = this.f8717o - 1;
            if (i14 < i15) {
                while (true) {
                    i10 = this.f8718p + 1;
                    int i16 = i10 * i13;
                    i11 = this.f8719q;
                    if (i16 <= i11 * i12) {
                        break;
                    }
                    this.l = c(this.l, this.m, 1);
                    int i17 = 0;
                    while (true) {
                        int i18 = this.b;
                        if (i17 < i18) {
                            this.l[(this.m * i18) + i17] = b(this.f8716n, (i18 * i14) + i17, i12, i13);
                            i17++;
                        }
                    }
                    this.f8719q++;
                    this.m++;
                }
                this.f8718p = i10;
                if (i10 == i12) {
                    this.f8718p = 0;
                    AbstractC0669a1.b(i11 == i13);
                    this.f8719q = 0;
                }
                i14++;
            } else {
                c(i15);
                return;
            }
        }
    }

    private void b(short[] sArr, int i9, int i10) {
        int i11 = this.f8712h / i10;
        int i12 = this.b;
        int i13 = i10 * i12;
        int i14 = i9 * i12;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                i16 += sArr[(i15 * i13) + i14 + i17];
            }
            this.f8713i[i15] = (short) (i16 / i13);
        }
    }

    private short[] c(short[] sArr, int i9, int i10) {
        int length = sArr.length;
        int i11 = this.b;
        int i12 = length / i11;
        return i9 + i10 <= i12 ? sArr : Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    private void d() {
        int i9 = this.m;
        float f9 = this.f8707c;
        float f10 = this.f8708d;
        float f11 = f9 / f10;
        float f12 = this.f8709e * f10;
        double d2 = f11;
        if (d2 <= 1.00001d && d2 >= 0.99999d) {
            a(this.f8714j, 0, this.f8715k);
            this.f8715k = 0;
        } else {
            a(f11);
        }
        if (f12 != 1.0f) {
            a(f12, i9);
        }
    }

    public void e() {
        int i9;
        int i10 = this.f8715k;
        float f9 = this.f8707c;
        float f10 = this.f8708d;
        int i11 = this.m + ((int) ((((i10 / (f9 / f10)) + this.f8717o) / (this.f8709e * f10)) + 0.5f));
        this.f8714j = c(this.f8714j, i10, (this.f8712h * 2) + i10);
        int i12 = 0;
        while (true) {
            i9 = this.f8712h * 2;
            int i13 = this.b;
            if (i12 >= i9 * i13) {
                break;
            }
            this.f8714j[(i13 * i10) + i12] = 0;
            i12++;
        }
        this.f8715k += i9;
        d();
        if (this.m > i11) {
            this.m = i11;
        }
        this.f8715k = 0;
        this.f8720r = 0;
        this.f8717o = 0;
    }

    public int c() {
        return this.f8715k * this.b * 2;
    }

    private void c(int i9) {
        if (i9 == 0) {
            return;
        }
        short[] sArr = this.f8716n;
        int i10 = this.b;
        System.arraycopy(sArr, i9 * i10, sArr, 0, (this.f8717o - i9) * i10);
        this.f8717o -= i9;
    }

    public int b() {
        return this.m * this.b * 2;
    }

    private short b(short[] sArr, int i9, int i10, int i11) {
        short s5 = sArr[i9];
        short s9 = sArr[i9 + this.b];
        int i12 = this.f8719q * i10;
        int i13 = this.f8718p;
        int i14 = i13 * i11;
        int i15 = (i13 + 1) * i11;
        int i16 = i15 - i12;
        int i17 = i15 - i14;
        return (short) ((((i17 - i16) * s9) + (s5 * i16)) / i17);
    }

    private void d(int i9) {
        int i10 = this.f8715k - i9;
        short[] sArr = this.f8714j;
        int i11 = this.b;
        System.arraycopy(sArr, i9 * i11, sArr, 0, i11 * i10);
        this.f8715k = i10;
    }

    private void b(int i9) {
        int i10 = this.m - i9;
        short[] c9 = c(this.f8716n, this.f8717o, i10);
        this.f8716n = c9;
        short[] sArr = this.l;
        int i11 = this.b;
        System.arraycopy(sArr, i9 * i11, c9, this.f8717o * i11, i11 * i10);
        this.m = i9;
        this.f8717o += i10;
    }

    public void b(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i9 = this.b;
        int i10 = remaining / i9;
        short[] c9 = c(this.f8714j, this.f8715k, i10);
        this.f8714j = c9;
        shortBuffer.get(c9, this.f8715k * this.b, ((i9 * i10) * 2) / 2);
        this.f8715k += i10;
        d();
    }

    private void a(float f9) {
        int a6;
        int i9 = this.f8715k;
        if (i9 < this.f8712h) {
            return;
        }
        int i10 = 0;
        do {
            if (this.f8720r > 0) {
                a6 = a(i10);
            } else {
                int a9 = a(this.f8714j, i10);
                if (f9 > 1.0d) {
                    i10 = a9 + b(this.f8714j, i10, f9, a9) + i10;
                } else {
                    a6 = a(this.f8714j, i10, f9, a9);
                }
            }
            i10 += a6;
        } while (this.f8712h + i10 <= i9);
        d(i10);
    }

    private int b(short[] sArr, int i9, float f9, int i10) {
        int i11;
        if (f9 >= 2.0f) {
            i11 = (int) (i10 / (f9 - 1.0f));
        } else {
            this.f8720r = (int) (((2.0f - f9) * i10) / (f9 - 1.0f));
            i11 = i10;
        }
        short[] c9 = c(this.l, this.m, i11);
        this.l = c9;
        a(i11, this.b, c9, this.m, sArr, i9, sArr, i9 + i10);
        this.m += i11;
        return i11;
    }

    private int a(int i9) {
        int min = Math.min(this.f8712h, this.f8720r);
        a(this.f8714j, i9, min);
        this.f8720r -= min;
        return min;
    }

    private void a(short[] sArr, int i9, int i10) {
        short[] c9 = c(this.l, this.m, i10);
        this.l = c9;
        int i11 = this.b;
        System.arraycopy(sArr, i9 * i11, c9, this.m * i11, i11 * i10);
        this.m += i10;
    }

    private int a(short[] sArr, int i9) {
        int i10;
        int i11 = this.f8706a;
        int i12 = i11 > 4000 ? i11 / 4000 : 1;
        if (this.b == 1 && i12 == 1) {
            i10 = a(sArr, i9, this.f8710f, this.f8711g);
        } else {
            b(sArr, i9, i12);
            int a6 = a(this.f8713i, 0, this.f8710f / i12, this.f8711g / i12);
            if (i12 != 1) {
                int i13 = a6 * i12;
                int i14 = i12 * 4;
                int i15 = i13 - i14;
                int i16 = i13 + i14;
                int i17 = this.f8710f;
                if (i15 < i17) {
                    i15 = i17;
                }
                int i18 = this.f8711g;
                if (i16 > i18) {
                    i16 = i18;
                }
                if (this.b == 1) {
                    i10 = a(sArr, i9, i15, i16);
                } else {
                    b(sArr, i9, 1);
                    i10 = a(this.f8713i, 0, i15, i16);
                }
            } else {
                i10 = a6;
            }
        }
        int i19 = a(this.f8723u, this.f8724v) ? this.f8721s : i10;
        this.f8722t = this.f8723u;
        this.f8721s = i10;
        return i19;
    }

    private int a(short[] sArr, int i9, int i10, int i11) {
        int i12 = i9 * this.b;
        int i13 = 255;
        int i14 = 1;
        int i15 = 0;
        int i16 = 0;
        while (i10 <= i11) {
            int i17 = 0;
            for (int i18 = 0; i18 < i10; i18++) {
                i17 += Math.abs(sArr[i12 + i18] - sArr[(i12 + i10) + i18]);
            }
            if (i17 * i15 < i14 * i10) {
                i15 = i10;
                i14 = i17;
            }
            if (i17 * i13 > i16 * i10) {
                i13 = i10;
                i16 = i17;
            }
            i10++;
        }
        this.f8723u = i14 / i15;
        this.f8724v = i16 / i13;
        return i15;
    }

    public void a() {
        this.f8715k = 0;
        this.m = 0;
        this.f8717o = 0;
        this.f8718p = 0;
        this.f8719q = 0;
        this.f8720r = 0;
        this.f8721s = 0;
        this.f8722t = 0;
        this.f8723u = 0;
        this.f8724v = 0;
    }

    public void a(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.b, this.m);
        shortBuffer.put(this.l, 0, this.b * min);
        int i9 = this.m - min;
        this.m = i9;
        short[] sArr = this.l;
        int i10 = this.b;
        System.arraycopy(sArr, min * i10, sArr, 0, i9 * i10);
    }

    private int a(short[] sArr, int i9, float f9, int i10) {
        int i11;
        if (f9 < 0.5f) {
            i11 = (int) ((i10 * f9) / (1.0f - f9));
        } else {
            this.f8720r = (int) ((((2.0f * f9) - 1.0f) * i10) / (1.0f - f9));
            i11 = i10;
        }
        int i12 = i10 + i11;
        short[] c9 = c(this.l, this.m, i12);
        this.l = c9;
        int i13 = this.b;
        System.arraycopy(sArr, i9 * i13, c9, this.m * i13, i13 * i10);
        a(i11, this.b, this.l, this.m + i10, sArr, i9 + i10, sArr, i9);
        this.m += i12;
        return i11;
    }

    private static void a(int i9, int i10, short[] sArr, int i11, short[] sArr2, int i12, short[] sArr3, int i13) {
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i11 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i12 * i10) + i14;
            for (int i18 = 0; i18 < i9; i18++) {
                sArr[i15] = (short) (((sArr3[i16] * i18) + ((i9 - i18) * sArr2[i17])) / i9);
                i15 += i10;
                i17 += i10;
                i16 += i10;
            }
        }
    }

    private boolean a(int i9, int i10) {
        return i9 != 0 && this.f8721s != 0 && i10 <= i9 * 3 && i9 * 2 > this.f8722t * 3;
    }
}
