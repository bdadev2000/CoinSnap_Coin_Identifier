package com.applovin.impl;

/* loaded from: classes.dex */
public final class zg {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f12578a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f12579c;

    /* renamed from: d, reason: collision with root package name */
    private int f12580d;

    public zg(byte[] bArr, int i9, int i10) {
        a(bArr, i9, i10);
    }

    private void a() {
        int i9;
        int i10 = this.f12579c;
        AbstractC0669a1.b(i10 >= 0 && (i10 < (i9 = this.b) || (i10 == i9 && this.f12580d == 0)));
    }

    private int d() {
        int i9 = 0;
        while (!c()) {
            i9++;
        }
        return ((1 << i9) - 1) + (i9 > 0 ? b(i9) : 0);
    }

    public boolean b() {
        int i9 = this.f12579c;
        int i10 = this.f12580d;
        int i11 = 0;
        while (this.f12579c < this.b && !c()) {
            i11++;
        }
        boolean z8 = this.f12579c == this.b;
        this.f12579c = i9;
        this.f12580d = i10;
        return !z8 && a((i11 * 2) + 1);
    }

    public boolean c() {
        boolean z8 = (this.f12578a[this.f12579c] & (128 >> this.f12580d)) != 0;
        g();
        return z8;
    }

    public int e() {
        int i9;
        int d2 = d();
        if (d2 % 2 == 0) {
            i9 = -1;
        } else {
            i9 = 1;
        }
        return ((d2 + 1) / 2) * i9;
    }

    public int f() {
        return d();
    }

    public void g() {
        int i9 = 1;
        int i10 = this.f12580d + 1;
        this.f12580d = i10;
        if (i10 == 8) {
            this.f12580d = 0;
            int i11 = this.f12579c;
            if (c(i11 + 1)) {
                i9 = 2;
            }
            this.f12579c = i11 + i9;
        }
        a();
    }

    public boolean a(int i9) {
        int i10 = this.f12579c;
        int i11 = i9 / 8;
        int i12 = i10 + i11;
        int i13 = (this.f12580d + i9) - (i11 * 8);
        if (i13 > 7) {
            i12++;
            i13 -= 8;
        }
        while (true) {
            int i14 = i10 + 1;
            if (i14 > i12 || i12 >= this.b) {
                break;
            }
            if (c(i14)) {
                i12++;
                i10 += 3;
            } else {
                i10 = i14;
            }
        }
        int i15 = this.b;
        return i12 < i15 || (i12 == i15 && i13 == 0);
    }

    private boolean c(int i9) {
        if (2 <= i9 && i9 < this.b) {
            byte[] bArr = this.f12578a;
            if (bArr[i9] == 3 && bArr[i9 - 2] == 0 && bArr[i9 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public void d(int i9) {
        int i10 = this.f12579c;
        int i11 = i9 / 8;
        int i12 = i10 + i11;
        this.f12579c = i12;
        int i13 = (i9 - (i11 * 8)) + this.f12580d;
        this.f12580d = i13;
        if (i13 > 7) {
            this.f12579c = i12 + 1;
            this.f12580d = i13 - 8;
        }
        while (true) {
            i10++;
            if (i10 <= this.f12579c) {
                if (c(i10)) {
                    this.f12579c++;
                    i10 += 2;
                }
            } else {
                a();
                return;
            }
        }
    }

    public void a(byte[] bArr, int i9, int i10) {
        this.f12578a = bArr;
        this.f12579c = i9;
        this.b = i10;
        this.f12580d = 0;
        a();
    }

    public int b(int i9) {
        int i10;
        this.f12580d += i9;
        int i11 = 0;
        while (true) {
            i10 = this.f12580d;
            if (i10 <= 8) {
                break;
            }
            int i12 = i10 - 8;
            this.f12580d = i12;
            byte[] bArr = this.f12578a;
            int i13 = this.f12579c;
            i11 |= (bArr[i13] & 255) << i12;
            if (!c(i13 + 1)) {
                r3 = 1;
            }
            this.f12579c = i13 + r3;
        }
        byte[] bArr2 = this.f12578a;
        int i14 = this.f12579c;
        int i15 = ((-1) >>> (32 - i9)) & (i11 | ((bArr2[i14] & 255) >> (8 - i10)));
        if (i10 == 8) {
            this.f12580d = 0;
            this.f12579c = i14 + (c(i14 + 1) ? 2 : 1);
        }
        a();
        return i15;
    }
}
