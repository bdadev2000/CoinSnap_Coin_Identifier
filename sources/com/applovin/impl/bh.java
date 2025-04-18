package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Charsets;
import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.Charset;
import java.util.Arrays;
import okio.Utf8;

/* loaded from: classes3.dex */
public final class bh {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f23060a;

    /* renamed from: b, reason: collision with root package name */
    private int f23061b;

    /* renamed from: c, reason: collision with root package name */
    private int f23062c;

    public bh() {
        this.f23060a = xp.f27965f;
    }

    public int A() {
        int j2 = j();
        if (j2 >= 0) {
            return j2;
        }
        throw new IllegalStateException(android.support.v4.media.d.i("Top bit not zero: ", j2));
    }

    public long B() {
        long s2 = s();
        if (s2 >= 0) {
            return s2;
        }
        throw new IllegalStateException(android.support.v4.media.d.m("Top bit not zero: ", s2));
    }

    public int C() {
        byte[] bArr = this.f23060a;
        int i2 = this.f23061b;
        int i3 = i2 + 1;
        int i4 = (bArr[i2] & UnsignedBytes.MAX_VALUE) << 8;
        this.f23061b = i2 + 2;
        return (bArr[i3] & UnsignedBytes.MAX_VALUE) | i4;
    }

    public long D() {
        int i2;
        int i3;
        long j2 = this.f23060a[this.f23061b];
        int i4 = 7;
        while (true) {
            if (i4 < 0) {
                break;
            }
            if (((1 << i4) & j2) != 0) {
                i4--;
            } else if (i4 < 6) {
                j2 &= r6 - 1;
                i3 = 7 - i4;
            } else if (i4 == 7) {
                i3 = 1;
            }
        }
        i3 = 0;
        if (i3 == 0) {
            throw new NumberFormatException(android.support.v4.media.d.m("Invalid UTF-8 sequence first byte: ", j2));
        }
        for (i2 = 1; i2 < i3; i2++) {
            if ((this.f23060a[this.f23061b + i2] & 192) != 128) {
                throw new NumberFormatException(android.support.v4.media.d.m("Invalid UTF-8 sequence continuation byte: ", j2));
            }
            j2 = (j2 << 6) | (r3 & Utf8.REPLACEMENT_BYTE);
        }
        this.f23061b += i3;
        return j2;
    }

    public int a() {
        return this.f23062c - this.f23061b;
    }

    public int b() {
        return this.f23060a.length;
    }

    public byte[] c() {
        return this.f23060a;
    }

    public int d() {
        return this.f23061b;
    }

    public int e() {
        return this.f23062c;
    }

    public char f() {
        byte[] bArr = this.f23060a;
        int i2 = this.f23061b;
        return (char) ((bArr[i2 + 1] & UnsignedBytes.MAX_VALUE) | ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 8));
    }

    public int g() {
        return this.f23060a[this.f23061b] & UnsignedBytes.MAX_VALUE;
    }

    public double h() {
        return Double.longBitsToDouble(s());
    }

    public float i() {
        return Float.intBitsToFloat(j());
    }

    public int j() {
        byte[] bArr = this.f23060a;
        int i2 = this.f23061b;
        int i3 = ((bArr[i2 + 1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 24);
        int i4 = i2 + 3;
        int i5 = i3 | ((bArr[i2 + 2] & UnsignedBytes.MAX_VALUE) << 8);
        this.f23061b = i2 + 4;
        return (bArr[i4] & UnsignedBytes.MAX_VALUE) | i5;
    }

    public int k() {
        byte[] bArr = this.f23060a;
        int i2 = this.f23061b;
        int i3 = i2 + 2;
        int i4 = ((bArr[i2 + 1] & UnsignedBytes.MAX_VALUE) << 8) | (((bArr[i2] & UnsignedBytes.MAX_VALUE) << 24) >> 8);
        this.f23061b = i2 + 3;
        return (bArr[i3] & UnsignedBytes.MAX_VALUE) | i4;
    }

    public String l() {
        if (a() == 0) {
            return null;
        }
        int i2 = this.f23061b;
        while (i2 < this.f23062c && !xp.h(this.f23060a[i2])) {
            i2++;
        }
        int i3 = this.f23061b;
        if (i2 - i3 >= 3) {
            byte[] bArr = this.f23060a;
            if (bArr[i3] == -17 && bArr[i3 + 1] == -69 && bArr[i3 + 2] == -65) {
                this.f23061b = i3 + 3;
            }
        }
        byte[] bArr2 = this.f23060a;
        int i4 = this.f23061b;
        String a2 = xp.a(bArr2, i4, i2 - i4);
        this.f23061b = i2;
        int i5 = this.f23062c;
        if (i2 == i5) {
            return a2;
        }
        byte[] bArr3 = this.f23060a;
        if (bArr3[i2] == 13) {
            int i6 = i2 + 1;
            this.f23061b = i6;
            if (i6 == i5) {
                return a2;
            }
        }
        int i7 = this.f23061b;
        if (bArr3[i7] == 10) {
            this.f23061b = i7 + 1;
        }
        return a2;
    }

    public int m() {
        byte[] bArr = this.f23060a;
        int i2 = this.f23061b;
        int i3 = ((bArr[i2 + 1] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[i2] & UnsignedBytes.MAX_VALUE);
        int i4 = i2 + 3;
        int i5 = i3 | ((bArr[i2 + 2] & UnsignedBytes.MAX_VALUE) << 16);
        this.f23061b = i2 + 4;
        return ((bArr[i4] & UnsignedBytes.MAX_VALUE) << 24) | i5;
    }

    public long n() {
        byte[] bArr = this.f23060a;
        int i2 = this.f23061b;
        int i3 = i2 + 7;
        long j2 = (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
        this.f23061b = i2 + 8;
        return ((bArr[i3] & 255) << 56) | j2;
    }

    public short o() {
        byte[] bArr = this.f23060a;
        int i2 = this.f23061b;
        int i3 = i2 + 1;
        int i4 = bArr[i2] & UnsignedBytes.MAX_VALUE;
        this.f23061b = i2 + 2;
        return (short) (((bArr[i3] & UnsignedBytes.MAX_VALUE) << 8) | i4);
    }

    public long p() {
        byte[] bArr = this.f23060a;
        int i2 = this.f23061b;
        int i3 = i2 + 3;
        long j2 = (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        this.f23061b = i2 + 4;
        return ((bArr[i3] & 255) << 24) | j2;
    }

    public int q() {
        int m2 = m();
        if (m2 >= 0) {
            return m2;
        }
        throw new IllegalStateException(android.support.v4.media.d.i("Top bit not zero: ", m2));
    }

    public int r() {
        byte[] bArr = this.f23060a;
        int i2 = this.f23061b;
        int i3 = i2 + 1;
        int i4 = bArr[i2] & UnsignedBytes.MAX_VALUE;
        this.f23061b = i2 + 2;
        return ((bArr[i3] & UnsignedBytes.MAX_VALUE) << 8) | i4;
    }

    public long s() {
        byte[] bArr = this.f23060a;
        int i2 = this.f23061b;
        int i3 = i2 + 7;
        long j2 = ((bArr[i2] & 255) << 56) | ((bArr[i2 + 1] & 255) << 48) | ((bArr[i2 + 2] & 255) << 40) | ((bArr[i2 + 3] & 255) << 32) | ((bArr[i2 + 4] & 255) << 24) | ((bArr[i2 + 5] & 255) << 16) | ((bArr[i2 + 6] & 255) << 8);
        this.f23061b = i2 + 8;
        return (bArr[i3] & 255) | j2;
    }

    public String t() {
        return a((char) 0);
    }

    public short u() {
        byte[] bArr = this.f23060a;
        int i2 = this.f23061b;
        int i3 = i2 + 1;
        int i4 = (bArr[i2] & UnsignedBytes.MAX_VALUE) << 8;
        this.f23061b = i2 + 2;
        return (short) ((bArr[i3] & UnsignedBytes.MAX_VALUE) | i4);
    }

    public int v() {
        return (w() << 21) | (w() << 14) | (w() << 7) | w();
    }

    public int w() {
        byte[] bArr = this.f23060a;
        int i2 = this.f23061b;
        this.f23061b = i2 + 1;
        return bArr[i2] & UnsignedBytes.MAX_VALUE;
    }

    public int x() {
        byte[] bArr = this.f23060a;
        int i2 = this.f23061b;
        int i3 = (bArr[i2 + 1] & UnsignedBytes.MAX_VALUE) | ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 8);
        this.f23061b = i2 + 4;
        return i3;
    }

    public long y() {
        byte[] bArr = this.f23060a;
        int i2 = this.f23061b;
        int i3 = i2 + 3;
        long j2 = ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
        this.f23061b = i2 + 4;
        return (bArr[i3] & 255) | j2;
    }

    public int z() {
        byte[] bArr = this.f23060a;
        int i2 = this.f23061b;
        int i3 = i2 + 2;
        int i4 = ((bArr[i2 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 16);
        this.f23061b = i2 + 3;
        return (bArr[i3] & UnsignedBytes.MAX_VALUE) | i4;
    }

    public void a(byte[] bArr, int i2) {
        this.f23060a = bArr;
        this.f23062c = i2;
        this.f23061b = 0;
    }

    public String b(int i2) {
        if (i2 == 0) {
            return "";
        }
        int i3 = this.f23061b;
        int i4 = (i3 + i2) - 1;
        String a2 = xp.a(this.f23060a, i3, (i4 >= this.f23062c || this.f23060a[i4] != 0) ? i2 : i2 - 1);
        this.f23061b += i2;
        return a2;
    }

    public String c(int i2) {
        return a(i2, Charsets.UTF_8);
    }

    public void d(int i2) {
        a(b() < i2 ? new byte[i2] : this.f23060a, i2);
    }

    public void e(int i2) {
        b1.a(i2 >= 0 && i2 <= this.f23060a.length);
        this.f23062c = i2;
    }

    public void f(int i2) {
        b1.a(i2 >= 0 && i2 <= this.f23062c);
        this.f23061b = i2;
    }

    public void g(int i2) {
        f(this.f23061b + i2);
    }

    public bh(int i2) {
        this.f23060a = new byte[i2];
        this.f23062c = i2;
    }

    public void a(int i2) {
        if (i2 > b()) {
            this.f23060a = Arrays.copyOf(this.f23060a, i2);
        }
    }

    public bh(byte[] bArr) {
        this.f23060a = bArr;
        this.f23062c = bArr.length;
    }

    public void a(ah ahVar, int i2) {
        a(ahVar.f22849a, 0, i2);
        ahVar.c(0);
    }

    public bh(byte[] bArr, int i2) {
        this.f23060a = bArr;
        this.f23062c = i2;
    }

    public void a(byte[] bArr, int i2, int i3) {
        System.arraycopy(this.f23060a, this.f23061b, bArr, i2, i3);
        this.f23061b += i3;
    }

    public String a(char c2) {
        if (a() == 0) {
            return null;
        }
        int i2 = this.f23061b;
        while (i2 < this.f23062c && this.f23060a[i2] != c2) {
            i2++;
        }
        byte[] bArr = this.f23060a;
        int i3 = this.f23061b;
        String a2 = xp.a(bArr, i3, i2 - i3);
        this.f23061b = i2;
        if (i2 < this.f23062c) {
            this.f23061b = i2 + 1;
        }
        return a2;
    }

    public void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    public String a(int i2, Charset charset) {
        String str = new String(this.f23060a, this.f23061b, i2, charset);
        this.f23061b += i2;
        return str;
    }
}
