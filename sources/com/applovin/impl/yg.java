package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Charsets;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class yg {
    private byte[] a;

    /* renamed from: b, reason: collision with root package name */
    private int f9203b;

    /* renamed from: c, reason: collision with root package name */
    private int f9204c;

    public yg() {
        this.a = yp.f9257f;
    }

    public int A() {
        int j3 = j();
        if (j3 >= 0) {
            return j3;
        }
        throw new IllegalStateException(eb.j.i("Top bit not zero: ", j3));
    }

    public long B() {
        long s5 = s();
        if (s5 >= 0) {
            return s5;
        }
        throw new IllegalStateException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("Top bit not zero: ", s5));
    }

    public int C() {
        byte[] bArr = this.a;
        int i10 = this.f9203b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & UByte.MAX_VALUE) << 8;
        this.f9203b = i10 + 2;
        return (bArr[i11] & UByte.MAX_VALUE) | i12;
    }

    public long D() {
        int i10;
        int i11;
        long j3 = this.a[this.f9203b];
        int i12 = 7;
        while (true) {
            if (i12 < 0) {
                break;
            }
            if (((1 << i12) & j3) != 0) {
                i12--;
            } else if (i12 < 6) {
                j3 &= r6 - 1;
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 != 0) {
            for (i10 = 1; i10 < i11; i10++) {
                if ((this.a[this.f9203b + i10] & 192) == 128) {
                    j3 = (j3 << 6) | (r3 & 63);
                } else {
                    throw new NumberFormatException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("Invalid UTF-8 sequence continuation byte: ", j3));
                }
            }
            this.f9203b += i11;
            return j3;
        }
        throw new NumberFormatException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("Invalid UTF-8 sequence first byte: ", j3));
    }

    public int a() {
        return this.f9204c - this.f9203b;
    }

    public int b() {
        return this.a.length;
    }

    public byte[] c() {
        return this.a;
    }

    public int d() {
        return this.f9203b;
    }

    public int e() {
        return this.f9204c;
    }

    public char f() {
        byte[] bArr = this.a;
        int i10 = this.f9203b;
        return (char) ((bArr[i10 + 1] & UByte.MAX_VALUE) | ((bArr[i10] & UByte.MAX_VALUE) << 8));
    }

    public int g() {
        return this.a[this.f9203b] & UByte.MAX_VALUE;
    }

    public double h() {
        return Double.longBitsToDouble(s());
    }

    public float i() {
        return Float.intBitsToFloat(j());
    }

    public int j() {
        byte[] bArr = this.a;
        int i10 = this.f9203b;
        int i11 = ((bArr[i10 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i10] & UByte.MAX_VALUE) << 24);
        int i12 = i10 + 3;
        int i13 = i11 | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 8);
        this.f9203b = i10 + 4;
        return (bArr[i12] & UByte.MAX_VALUE) | i13;
    }

    public int k() {
        byte[] bArr = this.a;
        int i10 = this.f9203b;
        int i11 = i10 + 2;
        int i12 = ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | (((bArr[i10] & UByte.MAX_VALUE) << 24) >> 8);
        this.f9203b = i10 + 3;
        return (bArr[i11] & UByte.MAX_VALUE) | i12;
    }

    public String l() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f9203b;
        while (i10 < this.f9204c && !yp.h(this.a[i10])) {
            i10++;
        }
        int i11 = this.f9203b;
        if (i10 - i11 >= 3) {
            byte[] bArr = this.a;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.f9203b = i11 + 3;
            }
        }
        byte[] bArr2 = this.a;
        int i12 = this.f9203b;
        String a = yp.a(bArr2, i12, i10 - i12);
        this.f9203b = i10;
        int i13 = this.f9204c;
        if (i10 == i13) {
            return a;
        }
        byte[] bArr3 = this.a;
        if (bArr3[i10] == 13) {
            int i14 = i10 + 1;
            this.f9203b = i14;
            if (i14 == i13) {
                return a;
            }
        }
        int i15 = this.f9203b;
        if (bArr3[i15] == 10) {
            this.f9203b = i15 + 1;
        }
        return a;
    }

    public int m() {
        byte[] bArr = this.a;
        int i10 = this.f9203b;
        int i11 = ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | (bArr[i10] & UByte.MAX_VALUE);
        int i12 = i10 + 3;
        int i13 = i11 | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
        this.f9203b = i10 + 4;
        return ((bArr[i12] & UByte.MAX_VALUE) << 24) | i13;
    }

    public long n() {
        byte[] bArr = this.a;
        int i10 = this.f9203b;
        int i11 = i10 + 7;
        long j3 = (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        this.f9203b = i10 + 8;
        return ((bArr[i11] & 255) << 56) | j3;
    }

    public short o() {
        byte[] bArr = this.a;
        int i10 = this.f9203b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & UByte.MAX_VALUE;
        this.f9203b = i10 + 2;
        return (short) (((bArr[i11] & UByte.MAX_VALUE) << 8) | i12);
    }

    public long p() {
        byte[] bArr = this.a;
        int i10 = this.f9203b;
        int i11 = i10 + 3;
        long j3 = (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        this.f9203b = i10 + 4;
        return ((bArr[i11] & 255) << 24) | j3;
    }

    public int q() {
        int m10 = m();
        if (m10 >= 0) {
            return m10;
        }
        throw new IllegalStateException(eb.j.i("Top bit not zero: ", m10));
    }

    public int r() {
        byte[] bArr = this.a;
        int i10 = this.f9203b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & UByte.MAX_VALUE;
        this.f9203b = i10 + 2;
        return ((bArr[i11] & UByte.MAX_VALUE) << 8) | i12;
    }

    public long s() {
        byte[] bArr = this.a;
        int i10 = this.f9203b;
        int i11 = i10 + 7;
        long j3 = ((bArr[i10] & 255) << 56) | ((bArr[i10 + 1] & 255) << 48) | ((bArr[i10 + 2] & 255) << 40) | ((bArr[i10 + 3] & 255) << 32) | ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8);
        this.f9203b = i10 + 8;
        return (bArr[i11] & 255) | j3;
    }

    public String t() {
        return a((char) 0);
    }

    public short u() {
        byte[] bArr = this.a;
        int i10 = this.f9203b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & UByte.MAX_VALUE) << 8;
        this.f9203b = i10 + 2;
        return (short) ((bArr[i11] & UByte.MAX_VALUE) | i12);
    }

    public int v() {
        return (w() << 21) | (w() << 14) | (w() << 7) | w();
    }

    public int w() {
        byte[] bArr = this.a;
        int i10 = this.f9203b;
        this.f9203b = i10 + 1;
        return bArr[i10] & UByte.MAX_VALUE;
    }

    public int x() {
        byte[] bArr = this.a;
        int i10 = this.f9203b;
        int i11 = (bArr[i10 + 1] & UByte.MAX_VALUE) | ((bArr[i10] & UByte.MAX_VALUE) << 8);
        this.f9203b = i10 + 4;
        return i11;
    }

    public long y() {
        byte[] bArr = this.a;
        int i10 = this.f9203b;
        int i11 = i10 + 3;
        long j3 = ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
        this.f9203b = i10 + 4;
        return (bArr[i11] & 255) | j3;
    }

    public int z() {
        byte[] bArr = this.a;
        int i10 = this.f9203b;
        int i11 = i10 + 2;
        int i12 = ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10] & UByte.MAX_VALUE) << 16);
        this.f9203b = i10 + 3;
        return (bArr[i11] & UByte.MAX_VALUE) | i12;
    }

    public void a(int i10) {
        if (i10 > b()) {
            this.a = Arrays.copyOf(this.a, i10);
        }
    }

    public String b(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f9203b;
        int i12 = (i11 + i10) - 1;
        String a = yp.a(this.a, i11, (i12 >= this.f9204c || this.a[i12] != 0) ? i10 : i10 - 1);
        this.f9203b += i10;
        return a;
    }

    public String c(int i10) {
        return a(i10, Charsets.UTF_8);
    }

    public void d(int i10) {
        a(b() < i10 ? new byte[i10] : this.a, i10);
    }

    public void e(int i10) {
        a1.a(i10 >= 0 && i10 <= this.a.length);
        this.f9204c = i10;
    }

    public void f(int i10) {
        a1.a(i10 >= 0 && i10 <= this.f9204c);
        this.f9203b = i10;
    }

    public void g(int i10) {
        f(this.f9203b + i10);
    }

    public yg(int i10) {
        this.a = new byte[i10];
        this.f9204c = i10;
    }

    public void a(xg xgVar, int i10) {
        a(xgVar.a, 0, i10);
        xgVar.c(0);
    }

    public yg(byte[] bArr) {
        this.a = bArr;
        this.f9204c = bArr.length;
    }

    public void a(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.a, this.f9203b, bArr, i10, i11);
        this.f9203b += i11;
    }

    public String a(char c10) {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f9203b;
        while (i10 < this.f9204c && this.a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.a;
        int i11 = this.f9203b;
        String a = yp.a(bArr, i11, i10 - i11);
        this.f9203b = i10;
        if (i10 < this.f9204c) {
            this.f9203b = i10 + 1;
        }
        return a;
    }

    public yg(byte[] bArr, int i10) {
        this.a = bArr;
        this.f9204c = i10;
    }

    public void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    public void a(byte[] bArr, int i10) {
        this.a = bArr;
        this.f9204c = i10;
        this.f9203b = 0;
    }

    public String a(int i10, Charset charset) {
        String str = new String(this.a, this.f9203b, i10, charset);
        this.f9203b += i10;
        return str;
    }
}
