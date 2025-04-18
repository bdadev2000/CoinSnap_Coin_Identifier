package com.applovin.impl;

import com.google.common.primitives.UnsignedBytes;

/* loaded from: classes3.dex */
public final class ch {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f23276a;

    /* renamed from: b, reason: collision with root package name */
    private int f23277b;

    /* renamed from: c, reason: collision with root package name */
    private int f23278c;
    private int d;

    public ch(byte[] bArr, int i2, int i3) {
        a(bArr, i2, i3);
    }

    private void a() {
        int i2;
        int i3 = this.f23278c;
        b1.b(i3 >= 0 && (i3 < (i2 = this.f23277b) || (i3 == i2 && this.d == 0)));
    }

    private int d() {
        int i2 = 0;
        while (!c()) {
            i2++;
        }
        return ((1 << i2) - 1) + (i2 > 0 ? b(i2) : 0);
    }

    public boolean b() {
        int i2 = this.f23278c;
        int i3 = this.d;
        int i4 = 0;
        while (this.f23278c < this.f23277b && !c()) {
            i4++;
        }
        boolean z2 = this.f23278c == this.f23277b;
        this.f23278c = i2;
        this.d = i3;
        return !z2 && a((i4 * 2) + 1);
    }

    public boolean c() {
        boolean z2 = (this.f23276a[this.f23278c] & (128 >> this.d)) != 0;
        g();
        return z2;
    }

    public int e() {
        int d = d();
        return ((d + 1) / 2) * (d % 2 == 0 ? -1 : 1);
    }

    public int f() {
        return d();
    }

    public void g() {
        int i2 = this.d + 1;
        this.d = i2;
        if (i2 == 8) {
            this.d = 0;
            int i3 = this.f23278c;
            this.f23278c = i3 + (c(i3 + 1) ? 2 : 1);
        }
        a();
    }

    public boolean a(int i2) {
        int i3 = this.f23278c;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        int i6 = (this.d + i2) - (i4 * 8);
        if (i6 > 7) {
            i5++;
            i6 -= 8;
        }
        while (true) {
            int i7 = i3 + 1;
            if (i7 > i5 || i5 >= this.f23277b) {
                break;
            }
            if (c(i7)) {
                i5++;
                i3 += 3;
            } else {
                i3 = i7;
            }
        }
        int i8 = this.f23277b;
        return i5 < i8 || (i5 == i8 && i6 == 0);
    }

    private boolean c(int i2) {
        if (2 <= i2 && i2 < this.f23277b) {
            byte[] bArr = this.f23276a;
            if (bArr[i2] == 3 && bArr[i2 - 2] == 0 && bArr[i2 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public int b(int i2) {
        int i3;
        this.d += i2;
        int i4 = 0;
        while (true) {
            i3 = this.d;
            if (i3 <= 8) {
                break;
            }
            int i5 = i3 - 8;
            this.d = i5;
            byte[] bArr = this.f23276a;
            int i6 = this.f23278c;
            i4 |= (bArr[i6] & UnsignedBytes.MAX_VALUE) << i5;
            if (!c(i6 + 1)) {
                r3 = 1;
            }
            this.f23278c = i6 + r3;
        }
        byte[] bArr2 = this.f23276a;
        int i7 = this.f23278c;
        int i8 = ((-1) >>> (32 - i2)) & (i4 | ((bArr2[i7] & UnsignedBytes.MAX_VALUE) >> (8 - i3)));
        if (i3 == 8) {
            this.d = 0;
            this.f23278c = i7 + (c(i7 + 1) ? 2 : 1);
        }
        a();
        return i8;
    }

    public void d(int i2) {
        int i3 = this.f23278c;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        this.f23278c = i5;
        int i6 = (i2 - (i4 * 8)) + this.d;
        this.d = i6;
        if (i6 > 7) {
            this.f23278c = i5 + 1;
            this.d = i6 - 8;
        }
        while (true) {
            i3++;
            if (i3 <= this.f23278c) {
                if (c(i3)) {
                    this.f23278c++;
                    i3 += 2;
                }
            } else {
                a();
                return;
            }
        }
    }

    public void a(byte[] bArr, int i2, int i3) {
        this.f23276a = bArr;
        this.f23278c = i2;
        this.f23277b = i3;
        this.d = 0;
        a();
    }
}
