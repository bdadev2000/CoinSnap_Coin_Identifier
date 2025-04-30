package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Charsets;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class yg {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f12403a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f12404c;

    public yg() {
        this.f12403a = yp.f12455f;
    }

    public int A() {
        int j7 = j();
        if (j7 >= 0) {
            return j7;
        }
        throw new IllegalStateException(com.mbridge.msdk.foundation.entity.o.h(j7, "Top bit not zero: "));
    }

    public long B() {
        long s5 = s();
        if (s5 >= 0) {
            return s5;
        }
        throw new IllegalStateException(Q7.n0.g(s5, "Top bit not zero: "));
    }

    public int C() {
        byte[] bArr = this.f12403a;
        int i9 = this.b;
        int i10 = i9 + 1;
        int i11 = (bArr[i9] & 255) << 8;
        this.b = i9 + 2;
        return (bArr[i10] & 255) | i11;
    }

    public long D() {
        int i9;
        int i10;
        long j7 = this.f12403a[this.b];
        int i11 = 7;
        while (true) {
            if (i11 < 0) {
                break;
            }
            if (((1 << i11) & j7) != 0) {
                i11--;
            } else if (i11 < 6) {
                j7 &= r6 - 1;
                i10 = 7 - i11;
            } else if (i11 == 7) {
                i10 = 1;
            }
        }
        i10 = 0;
        if (i10 != 0) {
            for (i9 = 1; i9 < i10; i9++) {
                if ((this.f12403a[this.b + i9] & 192) == 128) {
                    j7 = (j7 << 6) | (r3 & 63);
                } else {
                    throw new NumberFormatException(Q7.n0.g(j7, "Invalid UTF-8 sequence continuation byte: "));
                }
            }
            this.b += i10;
            return j7;
        }
        throw new NumberFormatException(Q7.n0.g(j7, "Invalid UTF-8 sequence first byte: "));
    }

    public int a() {
        return this.f12404c - this.b;
    }

    public int b() {
        return this.f12403a.length;
    }

    public byte[] c() {
        return this.f12403a;
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.f12404c;
    }

    public char f() {
        byte[] bArr = this.f12403a;
        int i9 = this.b;
        return (char) ((bArr[i9 + 1] & 255) | ((bArr[i9] & 255) << 8));
    }

    public int g() {
        return this.f12403a[this.b] & 255;
    }

    public double h() {
        return Double.longBitsToDouble(s());
    }

    public float i() {
        return Float.intBitsToFloat(j());
    }

    public int j() {
        byte[] bArr = this.f12403a;
        int i9 = this.b;
        int i10 = ((bArr[i9 + 1] & 255) << 16) | ((bArr[i9] & 255) << 24);
        int i11 = i9 + 3;
        int i12 = i10 | ((bArr[i9 + 2] & 255) << 8);
        this.b = i9 + 4;
        return (bArr[i11] & 255) | i12;
    }

    public int k() {
        byte[] bArr = this.f12403a;
        int i9 = this.b;
        int i10 = i9 + 2;
        int i11 = ((bArr[i9 + 1] & 255) << 8) | (((bArr[i9] & 255) << 24) >> 8);
        this.b = i9 + 3;
        return (bArr[i10] & 255) | i11;
    }

    public String l() {
        if (a() == 0) {
            return null;
        }
        int i9 = this.b;
        while (i9 < this.f12404c && !yp.h(this.f12403a[i9])) {
            i9++;
        }
        int i10 = this.b;
        if (i9 - i10 >= 3) {
            byte[] bArr = this.f12403a;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.b = i10 + 3;
            }
        }
        byte[] bArr2 = this.f12403a;
        int i11 = this.b;
        String a6 = yp.a(bArr2, i11, i9 - i11);
        this.b = i9;
        int i12 = this.f12404c;
        if (i9 == i12) {
            return a6;
        }
        byte[] bArr3 = this.f12403a;
        if (bArr3[i9] == 13) {
            int i13 = i9 + 1;
            this.b = i13;
            if (i13 == i12) {
                return a6;
            }
        }
        int i14 = this.b;
        if (bArr3[i14] == 10) {
            this.b = i14 + 1;
        }
        return a6;
    }

    public int m() {
        byte[] bArr = this.f12403a;
        int i9 = this.b;
        int i10 = ((bArr[i9 + 1] & 255) << 8) | (bArr[i9] & 255);
        int i11 = i9 + 3;
        int i12 = i10 | ((bArr[i9 + 2] & 255) << 16);
        this.b = i9 + 4;
        return ((bArr[i11] & 255) << 24) | i12;
    }

    public long n() {
        byte[] bArr = this.f12403a;
        int i9 = this.b;
        int i10 = i9 + 7;
        long j7 = (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16) | ((bArr[i9 + 3] & 255) << 24) | ((bArr[i9 + 4] & 255) << 32) | ((bArr[i9 + 5] & 255) << 40) | ((bArr[i9 + 6] & 255) << 48);
        this.b = i9 + 8;
        return ((bArr[i10] & 255) << 56) | j7;
    }

    public short o() {
        byte[] bArr = this.f12403a;
        int i9 = this.b;
        int i10 = i9 + 1;
        int i11 = bArr[i9] & 255;
        this.b = i9 + 2;
        return (short) (((bArr[i10] & 255) << 8) | i11);
    }

    public long p() {
        byte[] bArr = this.f12403a;
        int i9 = this.b;
        int i10 = i9 + 3;
        long j7 = (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16);
        this.b = i9 + 4;
        return ((bArr[i10] & 255) << 24) | j7;
    }

    public int q() {
        int m = m();
        if (m >= 0) {
            return m;
        }
        throw new IllegalStateException(com.mbridge.msdk.foundation.entity.o.h(m, "Top bit not zero: "));
    }

    public int r() {
        byte[] bArr = this.f12403a;
        int i9 = this.b;
        int i10 = i9 + 1;
        int i11 = bArr[i9] & 255;
        this.b = i9 + 2;
        return ((bArr[i10] & 255) << 8) | i11;
    }

    public long s() {
        byte[] bArr = this.f12403a;
        int i9 = this.b;
        int i10 = i9 + 7;
        long j7 = ((bArr[i9] & 255) << 56) | ((bArr[i9 + 1] & 255) << 48) | ((bArr[i9 + 2] & 255) << 40) | ((bArr[i9 + 3] & 255) << 32) | ((bArr[i9 + 4] & 255) << 24) | ((bArr[i9 + 5] & 255) << 16) | ((bArr[i9 + 6] & 255) << 8);
        this.b = i9 + 8;
        return (bArr[i10] & 255) | j7;
    }

    public String t() {
        return a((char) 0);
    }

    public short u() {
        byte[] bArr = this.f12403a;
        int i9 = this.b;
        int i10 = i9 + 1;
        int i11 = (bArr[i9] & 255) << 8;
        this.b = i9 + 2;
        return (short) ((bArr[i10] & 255) | i11);
    }

    public int v() {
        return (w() << 21) | (w() << 14) | (w() << 7) | w();
    }

    public int w() {
        byte[] bArr = this.f12403a;
        int i9 = this.b;
        this.b = i9 + 1;
        return bArr[i9] & 255;
    }

    public int x() {
        byte[] bArr = this.f12403a;
        int i9 = this.b;
        int i10 = (bArr[i9 + 1] & 255) | ((bArr[i9] & 255) << 8);
        this.b = i9 + 4;
        return i10;
    }

    public long y() {
        byte[] bArr = this.f12403a;
        int i9 = this.b;
        int i10 = i9 + 3;
        long j7 = ((bArr[i9] & 255) << 24) | ((bArr[i9 + 1] & 255) << 16) | ((bArr[i9 + 2] & 255) << 8);
        this.b = i9 + 4;
        return (bArr[i10] & 255) | j7;
    }

    public int z() {
        byte[] bArr = this.f12403a;
        int i9 = this.b;
        int i10 = i9 + 2;
        int i11 = ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9] & 255) << 16);
        this.b = i9 + 3;
        return (bArr[i10] & 255) | i11;
    }

    public void a(int i9) {
        if (i9 > b()) {
            this.f12403a = Arrays.copyOf(this.f12403a, i9);
        }
    }

    public String b(int i9) {
        if (i9 == 0) {
            return "";
        }
        int i10 = this.b;
        int i11 = (i10 + i9) - 1;
        String a6 = yp.a(this.f12403a, i10, (i11 >= this.f12404c || this.f12403a[i11] != 0) ? i9 : i9 - 1);
        this.b += i9;
        return a6;
    }

    public String c(int i9) {
        return a(i9, Charsets.UTF_8);
    }

    public void d(int i9) {
        a(b() < i9 ? new byte[i9] : this.f12403a, i9);
    }

    public void e(int i9) {
        AbstractC0669a1.a(i9 >= 0 && i9 <= this.f12403a.length);
        this.f12404c = i9;
    }

    public void f(int i9) {
        AbstractC0669a1.a(i9 >= 0 && i9 <= this.f12404c);
        this.b = i9;
    }

    public void g(int i9) {
        f(this.b + i9);
    }

    public yg(int i9) {
        this.f12403a = new byte[i9];
        this.f12404c = i9;
    }

    public void a(xg xgVar, int i9) {
        a(xgVar.f12177a, 0, i9);
        xgVar.c(0);
    }

    public yg(byte[] bArr) {
        this.f12403a = bArr;
        this.f12404c = bArr.length;
    }

    public void a(byte[] bArr, int i9, int i10) {
        System.arraycopy(this.f12403a, this.b, bArr, i9, i10);
        this.b += i10;
    }

    public String a(char c9) {
        if (a() == 0) {
            return null;
        }
        int i9 = this.b;
        while (i9 < this.f12404c && this.f12403a[i9] != c9) {
            i9++;
        }
        byte[] bArr = this.f12403a;
        int i10 = this.b;
        String a6 = yp.a(bArr, i10, i9 - i10);
        this.b = i9;
        if (i9 < this.f12404c) {
            this.b = i9 + 1;
        }
        return a6;
    }

    public yg(byte[] bArr, int i9) {
        this.f12403a = bArr;
        this.f12404c = i9;
    }

    public void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    public void a(byte[] bArr, int i9) {
        this.f12403a = bArr;
        this.f12404c = i9;
        this.b = 0;
    }

    public String a(int i9, Charset charset) {
        String str = new String(this.f12403a, this.b, i9, charset);
        this.b += i9;
        return str;
    }
}
