package com.applovin.impl;

import kotlin.UByte;

/* loaded from: classes.dex */
public final class zg {
    private byte[] a;

    /* renamed from: b, reason: collision with root package name */
    private int f9395b;

    /* renamed from: c, reason: collision with root package name */
    private int f9396c;

    /* renamed from: d, reason: collision with root package name */
    private int f9397d;

    public zg(byte[] bArr, int i10, int i11) {
        a(bArr, i10, i11);
    }

    private void a() {
        int i10;
        int i11 = this.f9396c;
        a1.b(i11 >= 0 && (i11 < (i10 = this.f9395b) || (i11 == i10 && this.f9397d == 0)));
    }

    private int d() {
        int i10 = 0;
        while (!c()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? b(i10) : 0);
    }

    public boolean b() {
        int i10 = this.f9396c;
        int i11 = this.f9397d;
        int i12 = 0;
        while (this.f9396c < this.f9395b && !c()) {
            i12++;
        }
        boolean z10 = this.f9396c == this.f9395b;
        this.f9396c = i10;
        this.f9397d = i11;
        return !z10 && a((i12 * 2) + 1);
    }

    public boolean c() {
        boolean z10 = (this.a[this.f9396c] & (128 >> this.f9397d)) != 0;
        g();
        return z10;
    }

    public int e() {
        int i10;
        int d10 = d();
        if (d10 % 2 == 0) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        return ((d10 + 1) / 2) * i10;
    }

    public int f() {
        return d();
    }

    public void g() {
        int i10 = 1;
        int i11 = this.f9397d + 1;
        this.f9397d = i11;
        if (i11 == 8) {
            this.f9397d = 0;
            int i12 = this.f9396c;
            if (c(i12 + 1)) {
                i10 = 2;
            }
            this.f9396c = i12 + i10;
        }
        a();
    }

    public boolean a(int i10) {
        int i11 = this.f9396c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f9397d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f9395b) {
                break;
            }
            if (c(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f9395b;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    private boolean c(int i10) {
        if (2 <= i10 && i10 < this.f9395b) {
            byte[] bArr = this.a;
            if (bArr[i10] == 3 && bArr[i10 - 2] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public void d(int i10) {
        int i11 = this.f9396c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f9396c = i13;
        int i14 = (i10 - (i12 * 8)) + this.f9397d;
        this.f9397d = i14;
        if (i14 > 7) {
            this.f9396c = i13 + 1;
            this.f9397d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 <= this.f9396c) {
                if (c(i11)) {
                    this.f9396c++;
                    i11 += 2;
                }
            } else {
                a();
                return;
            }
        }
    }

    public void a(byte[] bArr, int i10, int i11) {
        this.a = bArr;
        this.f9396c = i10;
        this.f9395b = i11;
        this.f9397d = 0;
        a();
    }

    public int b(int i10) {
        int i11;
        this.f9397d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f9397d;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f9397d = i13;
            byte[] bArr = this.a;
            int i14 = this.f9396c;
            i12 |= (bArr[i14] & UByte.MAX_VALUE) << i13;
            if (!c(i14 + 1)) {
                r3 = 1;
            }
            this.f9396c = i14 + r3;
        }
        byte[] bArr2 = this.a;
        int i15 = this.f9396c;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & UByte.MAX_VALUE) >> (8 - i11)));
        if (i11 == 8) {
            this.f9397d = 0;
            this.f9396c = i15 + (c(i15 + 1) ? 2 : 1);
        }
        a();
        return i16;
    }
}
