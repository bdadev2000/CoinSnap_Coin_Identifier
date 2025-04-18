package com.applovin.impl;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
final class kk {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5724b;

    /* renamed from: c, reason: collision with root package name */
    private final float f5725c;

    /* renamed from: d, reason: collision with root package name */
    private final float f5726d;

    /* renamed from: e, reason: collision with root package name */
    private final float f5727e;

    /* renamed from: f, reason: collision with root package name */
    private final int f5728f;

    /* renamed from: g, reason: collision with root package name */
    private final int f5729g;

    /* renamed from: h, reason: collision with root package name */
    private final int f5730h;

    /* renamed from: i, reason: collision with root package name */
    private final short[] f5731i;

    /* renamed from: j, reason: collision with root package name */
    private short[] f5732j;

    /* renamed from: k, reason: collision with root package name */
    private int f5733k;

    /* renamed from: l, reason: collision with root package name */
    private short[] f5734l;

    /* renamed from: m, reason: collision with root package name */
    private int f5735m;

    /* renamed from: n, reason: collision with root package name */
    private short[] f5736n;

    /* renamed from: o, reason: collision with root package name */
    private int f5737o;

    /* renamed from: p, reason: collision with root package name */
    private int f5738p;

    /* renamed from: q, reason: collision with root package name */
    private int f5739q;

    /* renamed from: r, reason: collision with root package name */
    private int f5740r;

    /* renamed from: s, reason: collision with root package name */
    private int f5741s;

    /* renamed from: t, reason: collision with root package name */
    private int f5742t;
    private int u;

    /* renamed from: v, reason: collision with root package name */
    private int f5743v;

    public kk(int i10, int i11, float f10, float f11, int i12) {
        this.a = i10;
        this.f5724b = i11;
        this.f5725c = f10;
        this.f5726d = f11;
        this.f5727e = i10 / i12;
        this.f5728f = i10 / 400;
        int i13 = i10 / 65;
        this.f5729g = i13;
        int i14 = i13 * 2;
        this.f5730h = i14;
        this.f5731i = new short[i14];
        int i15 = i14 * i11;
        this.f5732j = new short[i15];
        this.f5734l = new short[i15];
        this.f5736n = new short[i15];
    }

    private void a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f5735m == i10) {
            return;
        }
        int i13 = this.a;
        int i14 = (int) (i13 / f10);
        while (true) {
            if (i14 <= 16384 && i13 <= 16384) {
                break;
            }
            i14 /= 2;
            i13 /= 2;
        }
        b(i10);
        int i15 = 0;
        while (true) {
            int i16 = this.f5737o - 1;
            if (i15 < i16) {
                while (true) {
                    i11 = this.f5738p + 1;
                    int i17 = i11 * i14;
                    i12 = this.f5739q;
                    if (i17 <= i12 * i13) {
                        break;
                    }
                    this.f5734l = c(this.f5734l, this.f5735m, 1);
                    int i18 = 0;
                    while (true) {
                        int i19 = this.f5724b;
                        if (i18 < i19) {
                            this.f5734l[(this.f5735m * i19) + i18] = b(this.f5736n, (i19 * i15) + i18, i13, i14);
                            i18++;
                        }
                    }
                    this.f5739q++;
                    this.f5735m++;
                }
                this.f5738p = i11;
                if (i11 == i13) {
                    this.f5738p = 0;
                    a1.b(i12 == i14);
                    this.f5739q = 0;
                }
                i15++;
            } else {
                c(i16);
                return;
            }
        }
    }

    private void b(short[] sArr, int i10, int i11) {
        int i12 = this.f5730h / i11;
        int i13 = this.f5724b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f5731i[i16] = (short) (i17 / i14);
        }
    }

    private short[] c(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f5724b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    private void d() {
        int i10 = this.f5735m;
        float f10 = this.f5725c;
        float f11 = this.f5726d;
        float f12 = f10 / f11;
        float f13 = this.f5727e * f11;
        double d10 = f12;
        if (d10 <= 1.00001d && d10 >= 0.99999d) {
            a(this.f5732j, 0, this.f5733k);
            this.f5733k = 0;
        } else {
            a(f12);
        }
        if (f13 != 1.0f) {
            a(f13, i10);
        }
    }

    public void e() {
        int i10;
        int i11 = this.f5733k;
        float f10 = this.f5725c;
        float f11 = this.f5726d;
        int i12 = this.f5735m + ((int) ((((i11 / (f10 / f11)) + this.f5737o) / (this.f5727e * f11)) + 0.5f));
        this.f5732j = c(this.f5732j, i11, (this.f5730h * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f5730h * 2;
            int i14 = this.f5724b;
            if (i13 >= i10 * i14) {
                break;
            }
            this.f5732j[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f5733k += i10;
        d();
        if (this.f5735m > i12) {
            this.f5735m = i12;
        }
        this.f5733k = 0;
        this.f5740r = 0;
        this.f5737o = 0;
    }

    public int c() {
        return this.f5733k * this.f5724b * 2;
    }

    private void c(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.f5736n;
        int i11 = this.f5724b;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f5737o - i10) * i11);
        this.f5737o -= i10;
    }

    public int b() {
        return this.f5735m * this.f5724b * 2;
    }

    private short b(short[] sArr, int i10, int i11, int i12) {
        short s5 = sArr[i10];
        short s10 = sArr[i10 + this.f5724b];
        int i13 = this.f5739q * i11;
        int i14 = this.f5738p;
        int i15 = i14 * i12;
        int i16 = (i14 + 1) * i12;
        int i17 = i16 - i13;
        int i18 = i16 - i15;
        return (short) ((((i18 - i17) * s10) + (s5 * i17)) / i18);
    }

    private void d(int i10) {
        int i11 = this.f5733k - i10;
        short[] sArr = this.f5732j;
        int i12 = this.f5724b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f5733k = i11;
    }

    private void b(int i10) {
        int i11 = this.f5735m - i10;
        short[] c10 = c(this.f5736n, this.f5737o, i11);
        this.f5736n = c10;
        short[] sArr = this.f5734l;
        int i12 = this.f5724b;
        System.arraycopy(sArr, i10 * i12, c10, this.f5737o * i12, i12 * i11);
        this.f5735m = i10;
        this.f5737o += i11;
    }

    public void b(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i10 = this.f5724b;
        int i11 = remaining / i10;
        short[] c10 = c(this.f5732j, this.f5733k, i11);
        this.f5732j = c10;
        shortBuffer.get(c10, this.f5733k * this.f5724b, ((i10 * i11) * 2) / 2);
        this.f5733k += i11;
        d();
    }

    private void a(float f10) {
        int a;
        int i10 = this.f5733k;
        if (i10 < this.f5730h) {
            return;
        }
        int i11 = 0;
        do {
            if (this.f5740r > 0) {
                a = a(i11);
            } else {
                int a10 = a(this.f5732j, i11);
                if (f10 > 1.0d) {
                    i11 = a10 + b(this.f5732j, i11, f10, a10) + i11;
                } else {
                    a = a(this.f5732j, i11, f10, a10);
                }
            }
            i11 += a;
        } while (this.f5730h + i11 <= i10);
        d(i11);
    }

    private int b(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 >= 2.0f) {
            i12 = (int) (i11 / (f10 - 1.0f));
        } else {
            this.f5740r = (int) (((2.0f - f10) * i11) / (f10 - 1.0f));
            i12 = i11;
        }
        short[] c10 = c(this.f5734l, this.f5735m, i12);
        this.f5734l = c10;
        a(i12, this.f5724b, c10, this.f5735m, sArr, i10, sArr, i10 + i11);
        this.f5735m += i12;
        return i12;
    }

    private int a(int i10) {
        int min = Math.min(this.f5730h, this.f5740r);
        a(this.f5732j, i10, min);
        this.f5740r -= min;
        return min;
    }

    private void a(short[] sArr, int i10, int i11) {
        short[] c10 = c(this.f5734l, this.f5735m, i11);
        this.f5734l = c10;
        int i12 = this.f5724b;
        System.arraycopy(sArr, i10 * i12, c10, this.f5735m * i12, i12 * i11);
        this.f5735m += i11;
    }

    private int a(short[] sArr, int i10) {
        int i11;
        int i12 = this.a;
        int i13 = i12 > 4000 ? i12 / 4000 : 1;
        if (this.f5724b == 1 && i13 == 1) {
            i11 = a(sArr, i10, this.f5728f, this.f5729g);
        } else {
            b(sArr, i10, i13);
            int a = a(this.f5731i, 0, this.f5728f / i13, this.f5729g / i13);
            if (i13 != 1) {
                int i14 = a * i13;
                int i15 = i13 * 4;
                int i16 = i14 - i15;
                int i17 = i14 + i15;
                int i18 = this.f5728f;
                if (i16 < i18) {
                    i16 = i18;
                }
                int i19 = this.f5729g;
                if (i17 > i19) {
                    i17 = i19;
                }
                if (this.f5724b == 1) {
                    i11 = a(sArr, i10, i16, i17);
                } else {
                    b(sArr, i10, 1);
                    i11 = a(this.f5731i, 0, i16, i17);
                }
            } else {
                i11 = a;
            }
        }
        int i20 = a(this.u, this.f5743v) ? this.f5741s : i11;
        this.f5742t = this.u;
        this.f5741s = i11;
        return i20;
    }

    private int a(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f5724b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                i18 += Math.abs(sArr[i13 + i19] - sArr[(i13 + i11) + i19]);
            }
            if (i18 * i16 < i15 * i11) {
                i16 = i11;
                i15 = i18;
            }
            if (i18 * i14 > i17 * i11) {
                i14 = i11;
                i17 = i18;
            }
            i11++;
        }
        this.u = i15 / i16;
        this.f5743v = i17 / i14;
        return i16;
    }

    public void a() {
        this.f5733k = 0;
        this.f5735m = 0;
        this.f5737o = 0;
        this.f5738p = 0;
        this.f5739q = 0;
        this.f5740r = 0;
        this.f5741s = 0;
        this.f5742t = 0;
        this.u = 0;
        this.f5743v = 0;
    }

    public void a(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f5724b, this.f5735m);
        shortBuffer.put(this.f5734l, 0, this.f5724b * min);
        int i10 = this.f5735m - min;
        this.f5735m = i10;
        short[] sArr = this.f5734l;
        int i11 = this.f5724b;
        System.arraycopy(sArr, min * i11, sArr, 0, i10 * i11);
    }

    private int a(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 < 0.5f) {
            i12 = (int) ((i11 * f10) / (1.0f - f10));
        } else {
            this.f5740r = (int) ((((2.0f * f10) - 1.0f) * i11) / (1.0f - f10));
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] c10 = c(this.f5734l, this.f5735m, i13);
        this.f5734l = c10;
        int i14 = this.f5724b;
        System.arraycopy(sArr, i10 * i14, c10, this.f5735m * i14, i14 * i11);
        a(i12, this.f5724b, this.f5734l, this.f5735m + i11, sArr, i10 + i11, sArr, i10);
        this.f5735m += i13;
        return i12;
    }

    private static void a(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr3[i17] * i19) + ((i10 - i19) * sArr2[i18])) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    private boolean a(int i10, int i11) {
        return i10 != 0 && this.f5741s != 0 && i11 <= i10 * 3 && i10 * 2 > this.f5742t * 3;
    }
}
