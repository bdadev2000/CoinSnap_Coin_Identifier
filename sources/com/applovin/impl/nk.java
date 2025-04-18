package com.applovin.impl;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class nk {

    /* renamed from: a, reason: collision with root package name */
    private final int f25725a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25726b;

    /* renamed from: c, reason: collision with root package name */
    private final float f25727c;
    private final float d;
    private final float e;

    /* renamed from: f, reason: collision with root package name */
    private final int f25728f;

    /* renamed from: g, reason: collision with root package name */
    private final int f25729g;

    /* renamed from: h, reason: collision with root package name */
    private final int f25730h;

    /* renamed from: i, reason: collision with root package name */
    private final short[] f25731i;

    /* renamed from: j, reason: collision with root package name */
    private short[] f25732j;

    /* renamed from: k, reason: collision with root package name */
    private int f25733k;

    /* renamed from: l, reason: collision with root package name */
    private short[] f25734l;

    /* renamed from: m, reason: collision with root package name */
    private int f25735m;

    /* renamed from: n, reason: collision with root package name */
    private short[] f25736n;

    /* renamed from: o, reason: collision with root package name */
    private int f25737o;

    /* renamed from: p, reason: collision with root package name */
    private int f25738p;

    /* renamed from: q, reason: collision with root package name */
    private int f25739q;

    /* renamed from: r, reason: collision with root package name */
    private int f25740r;

    /* renamed from: s, reason: collision with root package name */
    private int f25741s;

    /* renamed from: t, reason: collision with root package name */
    private int f25742t;

    /* renamed from: u, reason: collision with root package name */
    private int f25743u;

    /* renamed from: v, reason: collision with root package name */
    private int f25744v;

    public nk(int i2, int i3, float f2, float f3, int i4) {
        this.f25725a = i2;
        this.f25726b = i3;
        this.f25727c = f2;
        this.d = f3;
        this.e = i2 / i4;
        this.f25728f = i2 / 400;
        int i5 = i2 / 65;
        this.f25729g = i5;
        int i6 = i5 * 2;
        this.f25730h = i6;
        this.f25731i = new short[i6];
        int i7 = i6 * i3;
        this.f25732j = new short[i7];
        this.f25734l = new short[i7];
        this.f25736n = new short[i7];
    }

    private void d() {
        int i2 = this.f25735m;
        float f2 = this.f25727c;
        float f3 = this.d;
        float f4 = f2 / f3;
        float f5 = this.e * f3;
        double d = f4;
        if (d <= 1.00001d && d >= 0.99999d) {
            a(this.f25732j, 0, this.f25733k);
            this.f25733k = 0;
        } else {
            a(f4);
        }
        if (f5 != 1.0f) {
            a(f5, i2);
        }
    }

    public void a() {
        this.f25733k = 0;
        this.f25735m = 0;
        this.f25737o = 0;
        this.f25738p = 0;
        this.f25739q = 0;
        this.f25740r = 0;
        this.f25741s = 0;
        this.f25742t = 0;
        this.f25743u = 0;
        this.f25744v = 0;
    }

    public int b() {
        return this.f25735m * this.f25726b * 2;
    }

    public int c() {
        return this.f25733k * this.f25726b * 2;
    }

    public void e() {
        int i2;
        int i3 = this.f25733k;
        float f2 = this.f25727c;
        float f3 = this.d;
        int i4 = this.f25735m + ((int) ((((i3 / (f2 / f3)) + this.f25737o) / (this.e * f3)) + 0.5f));
        this.f25732j = c(this.f25732j, i3, (this.f25730h * 2) + i3);
        int i5 = 0;
        while (true) {
            i2 = this.f25730h * 2;
            int i6 = this.f25726b;
            if (i5 >= i2 * i6) {
                break;
            }
            this.f25732j[(i6 * i3) + i5] = 0;
            i5++;
        }
        this.f25733k += i2;
        d();
        if (this.f25735m > i4) {
            this.f25735m = i4;
        }
        this.f25733k = 0;
        this.f25740r = 0;
        this.f25737o = 0;
    }

    private boolean a(int i2, int i3) {
        return i2 != 0 && this.f25741s != 0 && i3 <= i2 * 3 && i2 * 2 > this.f25742t * 3;
    }

    private void b(short[] sArr, int i2, int i3) {
        int i4 = this.f25730h / i3;
        int i5 = this.f25726b;
        int i6 = i3 * i5;
        int i7 = i2 * i5;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i9 += sArr[androidx.compose.foundation.text.input.a.a(i8, i6, i7, i10)];
            }
            this.f25731i[i8] = (short) (i9 / i6);
        }
    }

    private short[] c(short[] sArr, int i2, int i3) {
        int length = sArr.length;
        int i4 = this.f25726b;
        int i5 = length / i4;
        return i2 + i3 <= i5 ? sArr : Arrays.copyOf(sArr, (((i5 * 3) / 2) + i3) * i4);
    }

    private void a(float f2, int i2) {
        int i3;
        int i4;
        if (this.f25735m == i2) {
            return;
        }
        int i5 = this.f25725a;
        int i6 = (int) (i5 / f2);
        while (true) {
            if (i6 <= 16384 && i5 <= 16384) {
                break;
            }
            i6 /= 2;
            i5 /= 2;
        }
        b(i2);
        int i7 = 0;
        while (true) {
            int i8 = this.f25737o - 1;
            if (i7 >= i8) {
                c(i8);
                return;
            }
            while (true) {
                i3 = this.f25738p + 1;
                int i9 = i3 * i6;
                i4 = this.f25739q;
                if (i9 <= i4 * i5) {
                    break;
                }
                this.f25734l = c(this.f25734l, this.f25735m, 1);
                int i10 = 0;
                while (true) {
                    int i11 = this.f25726b;
                    if (i10 < i11) {
                        this.f25734l[(this.f25735m * i11) + i10] = b(this.f25736n, (i11 * i7) + i10, i5, i6);
                        i10++;
                    }
                }
                this.f25739q++;
                this.f25735m++;
            }
            this.f25738p = i3;
            if (i3 == i5) {
                this.f25738p = 0;
                b1.b(i4 == i6);
                this.f25739q = 0;
            }
            i7++;
        }
    }

    private void d(int i2) {
        int i3 = this.f25733k - i2;
        short[] sArr = this.f25732j;
        int i4 = this.f25726b;
        System.arraycopy(sArr, i2 * i4, sArr, 0, i4 * i3);
        this.f25733k = i3;
    }

    private void c(int i2) {
        if (i2 == 0) {
            return;
        }
        short[] sArr = this.f25736n;
        int i3 = this.f25726b;
        System.arraycopy(sArr, i2 * i3, sArr, 0, (this.f25737o - i2) * i3);
        this.f25737o -= i2;
    }

    private short b(short[] sArr, int i2, int i3, int i4) {
        short s2 = sArr[i2];
        short s3 = sArr[i2 + this.f25726b];
        int i5 = this.f25739q * i3;
        int i6 = this.f25738p;
        int i7 = i6 * i4;
        int i8 = (i6 + 1) * i4;
        int i9 = i8 - i5;
        int i10 = i8 - i7;
        return (short) ((((i10 - i9) * s3) + (s2 * i9)) / i10);
    }

    private void a(float f2) {
        int a2;
        int i2 = this.f25733k;
        if (i2 < this.f25730h) {
            return;
        }
        int i3 = 0;
        do {
            if (this.f25740r > 0) {
                a2 = a(i3);
            } else {
                int a3 = a(this.f25732j, i3);
                if (f2 > 1.0d) {
                    i3 = a3 + b(this.f25732j, i3, f2, a3) + i3;
                } else {
                    a2 = a(this.f25732j, i3, f2, a3);
                }
            }
            i3 += a2;
        } while (this.f25730h + i3 <= i2);
        d(i3);
    }

    private void b(int i2) {
        int i3 = this.f25735m - i2;
        short[] c2 = c(this.f25736n, this.f25737o, i3);
        this.f25736n = c2;
        short[] sArr = this.f25734l;
        int i4 = this.f25726b;
        System.arraycopy(sArr, i2 * i4, c2, this.f25737o * i4, i4 * i3);
        this.f25735m = i2;
        this.f25737o += i3;
    }

    public void b(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i2 = this.f25726b;
        int i3 = remaining / i2;
        short[] c2 = c(this.f25732j, this.f25733k, i3);
        this.f25732j = c2;
        shortBuffer.get(c2, this.f25733k * this.f25726b, ((i2 * i3) * 2) / 2);
        this.f25733k += i3;
        d();
    }

    private int a(int i2) {
        int min = Math.min(this.f25730h, this.f25740r);
        a(this.f25732j, i2, min);
        this.f25740r -= min;
        return min;
    }

    private int b(short[] sArr, int i2, float f2, int i3) {
        int i4;
        if (f2 >= 2.0f) {
            i4 = (int) (i3 / (f2 - 1.0f));
        } else {
            this.f25740r = (int) (((2.0f - f2) * i3) / (f2 - 1.0f));
            i4 = i3;
        }
        short[] c2 = c(this.f25734l, this.f25735m, i4);
        this.f25734l = c2;
        a(i4, this.f25726b, c2, this.f25735m, sArr, i2, sArr, i2 + i3);
        this.f25735m += i4;
        return i4;
    }

    private void a(short[] sArr, int i2, int i3) {
        short[] c2 = c(this.f25734l, this.f25735m, i3);
        this.f25734l = c2;
        int i4 = this.f25726b;
        System.arraycopy(sArr, i2 * i4, c2, this.f25735m * i4, i4 * i3);
        this.f25735m += i3;
    }

    private int a(short[] sArr, int i2) {
        int i3;
        int i4 = this.f25725a;
        int i5 = i4 > 4000 ? i4 / 4000 : 1;
        if (this.f25726b == 1 && i5 == 1) {
            i3 = a(sArr, i2, this.f25728f, this.f25729g);
        } else {
            b(sArr, i2, i5);
            int a2 = a(this.f25731i, 0, this.f25728f / i5, this.f25729g / i5);
            if (i5 != 1) {
                int i6 = a2 * i5;
                int i7 = i5 * 4;
                int i8 = i6 - i7;
                int i9 = i6 + i7;
                int i10 = this.f25728f;
                if (i8 < i10) {
                    i8 = i10;
                }
                int i11 = this.f25729g;
                if (i9 > i11) {
                    i9 = i11;
                }
                if (this.f25726b == 1) {
                    i3 = a(sArr, i2, i8, i9);
                } else {
                    b(sArr, i2, 1);
                    i3 = a(this.f25731i, 0, i8, i9);
                }
            } else {
                i3 = a2;
            }
        }
        int i12 = a(this.f25743u, this.f25744v) ? this.f25741s : i3;
        this.f25742t = this.f25743u;
        this.f25741s = i3;
        return i12;
    }

    private int a(short[] sArr, int i2, int i3, int i4) {
        int i5 = i2 * this.f25726b;
        int i6 = 255;
        int i7 = 1;
        int i8 = 0;
        int i9 = 0;
        while (i3 <= i4) {
            int i10 = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                i10 += Math.abs(sArr[i5 + i11] - sArr[(i5 + i3) + i11]);
            }
            if (i10 * i8 < i7 * i3) {
                i8 = i3;
                i7 = i10;
            }
            if (i10 * i6 > i9 * i3) {
                i6 = i3;
                i9 = i10;
            }
            i3++;
        }
        this.f25743u = i7 / i8;
        this.f25744v = i9 / i6;
        return i8;
    }

    public void a(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f25726b, this.f25735m);
        shortBuffer.put(this.f25734l, 0, this.f25726b * min);
        int i2 = this.f25735m - min;
        this.f25735m = i2;
        short[] sArr = this.f25734l;
        int i3 = this.f25726b;
        System.arraycopy(sArr, min * i3, sArr, 0, i2 * i3);
    }

    private int a(short[] sArr, int i2, float f2, int i3) {
        int i4;
        if (f2 < 0.5f) {
            i4 = (int) ((i3 * f2) / (1.0f - f2));
        } else {
            this.f25740r = (int) ((((2.0f * f2) - 1.0f) * i3) / (1.0f - f2));
            i4 = i3;
        }
        int i5 = i3 + i4;
        short[] c2 = c(this.f25734l, this.f25735m, i5);
        this.f25734l = c2;
        int i6 = this.f25726b;
        System.arraycopy(sArr, i2 * i6, c2, this.f25735m * i6, i6 * i3);
        a(i4, this.f25726b, this.f25734l, this.f25735m + i3, sArr, i2 + i3, sArr, i2);
        this.f25735m += i5;
        return i4;
    }

    private static void a(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i4 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i5 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i8] = (short) (((sArr3[i9] * i11) + ((i2 - i11) * sArr2[i10])) / i2);
                i8 += i3;
                i10 += i3;
                i9 += i3;
            }
        }
    }
}
