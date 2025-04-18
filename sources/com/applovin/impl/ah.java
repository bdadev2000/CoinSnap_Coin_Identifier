package com.applovin.impl;

import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class ah {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f22849a;

    /* renamed from: b, reason: collision with root package name */
    private int f22850b;

    /* renamed from: c, reason: collision with root package name */
    private int f22851c;
    private int d;

    public ah() {
        this.f22849a = xp.f27965f;
    }

    public void a(byte[] bArr, int i2) {
        this.f22849a = bArr;
        this.f22850b = 0;
        this.f22851c = 0;
        this.d = i2;
    }

    public int b() {
        return ((this.d - this.f22850b) * 8) - this.f22851c;
    }

    public void c() {
        if (this.f22851c == 0) {
            return;
        }
        this.f22851c = 0;
        this.f22850b++;
        a();
    }

    public int d() {
        b1.b(this.f22851c == 0);
        return this.f22850b;
    }

    public int e() {
        return (this.f22850b * 8) + this.f22851c;
    }

    public boolean f() {
        boolean z2 = (this.f22849a[this.f22850b] & (128 >> this.f22851c)) != 0;
        g();
        return z2;
    }

    public void g() {
        int i2 = this.f22851c + 1;
        this.f22851c = i2;
        if (i2 == 8) {
            this.f22851c = 0;
            this.f22850b++;
        }
        a();
    }

    private void a() {
        int i2;
        int i3 = this.f22850b;
        b1.b(i3 >= 0 && (i3 < (i2 = this.d) || (i3 == i2 && this.f22851c == 0)));
    }

    public long b(int i2) {
        if (i2 <= 32) {
            return xp.i(a(i2));
        }
        return xp.c(a(i2 - 32), a(32));
    }

    public void c(int i2) {
        int i3 = i2 / 8;
        this.f22850b = i3;
        this.f22851c = i2 - (i3 * 8);
        a();
    }

    public void d(int i2) {
        int i3 = i2 / 8;
        int i4 = this.f22850b + i3;
        this.f22850b = i4;
        int i5 = (i2 - (i3 * 8)) + this.f22851c;
        this.f22851c = i5;
        if (i5 > 7) {
            this.f22850b = i4 + 1;
            this.f22851c = i5 - 8;
        }
        a();
    }

    public void e(int i2) {
        b1.b(this.f22851c == 0);
        this.f22850b += i2;
        a();
    }

    public ah(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public void a(int i2, int i3) {
        if (i3 < 32) {
            i2 &= (1 << i3) - 1;
        }
        int min = Math.min(8 - this.f22851c, i3);
        int i4 = this.f22851c;
        int i5 = (8 - i4) - min;
        byte[] bArr = this.f22849a;
        int i6 = this.f22850b;
        byte b2 = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr[i6]);
        bArr[i6] = b2;
        int i7 = i3 - min;
        bArr[i6] = (byte) (b2 | ((i2 >>> i7) << i5));
        int i8 = i6 + 1;
        while (i7 > 8) {
            this.f22849a[i8] = (byte) (i2 >>> (i7 - 8));
            i7 -= 8;
            i8++;
        }
        int i9 = 8 - i7;
        byte[] bArr2 = this.f22849a;
        byte b3 = (byte) (bArr2[i8] & ((1 << i9) - 1));
        bArr2[i8] = b3;
        bArr2[i8] = (byte) (((i2 & ((1 << i7) - 1)) << i9) | b3);
        d(i3);
        a();
    }

    public ah(byte[] bArr, int i2) {
        this.f22849a = bArr;
        this.d = i2;
    }

    public void b(byte[] bArr, int i2, int i3) {
        b1.b(this.f22851c == 0);
        System.arraycopy(this.f22849a, this.f22850b, bArr, i2, i3);
        this.f22850b += i3;
        a();
    }

    public int a(int i2) {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        this.f22851c += i2;
        int i4 = 0;
        while (true) {
            i3 = this.f22851c;
            if (i3 <= 8) {
                break;
            }
            int i5 = i3 - 8;
            this.f22851c = i5;
            byte[] bArr = this.f22849a;
            int i6 = this.f22850b;
            this.f22850b = i6 + 1;
            i4 |= (bArr[i6] & UnsignedBytes.MAX_VALUE) << i5;
        }
        byte[] bArr2 = this.f22849a;
        int i7 = this.f22850b;
        int i8 = ((-1) >>> (32 - i2)) & (i4 | ((bArr2[i7] & UnsignedBytes.MAX_VALUE) >> (8 - i3)));
        if (i3 == 8) {
            this.f22851c = 0;
            this.f22850b = i7 + 1;
        }
        a();
        return i8;
    }

    public void a(byte[] bArr, int i2, int i3) {
        int i4 = (i3 >> 3) + i2;
        while (i2 < i4) {
            byte[] bArr2 = this.f22849a;
            int i5 = this.f22850b;
            int i6 = i5 + 1;
            this.f22850b = i6;
            byte b2 = bArr2[i5];
            int i7 = this.f22851c;
            byte b3 = (byte) (b2 << i7);
            bArr[i2] = b3;
            bArr[i2] = (byte) (((255 & bArr2[i6]) >> (8 - i7)) | b3);
            i2++;
        }
        int i8 = i3 & 7;
        if (i8 == 0) {
            return;
        }
        byte b4 = (byte) (bArr[i4] & (255 >> i8));
        bArr[i4] = b4;
        int i9 = this.f22851c;
        if (i9 + i8 > 8) {
            byte[] bArr3 = this.f22849a;
            int i10 = this.f22850b;
            this.f22850b = i10 + 1;
            bArr[i4] = (byte) (b4 | ((bArr3[i10] & UnsignedBytes.MAX_VALUE) << i9));
            this.f22851c = i9 - 8;
        }
        int i11 = this.f22851c + i8;
        this.f22851c = i11;
        byte[] bArr4 = this.f22849a;
        int i12 = this.f22850b;
        bArr[i4] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i8))) | bArr[i4]);
        if (i11 == 8) {
            this.f22851c = 0;
            this.f22850b = i12 + 1;
        }
        a();
    }

    public String a(int i2, Charset charset) {
        byte[] bArr = new byte[i2];
        b(bArr, 0, i2);
        return new String(bArr, charset);
    }

    public void a(bh bhVar) {
        a(bhVar.c(), bhVar.e());
        c(bhVar.d() * 8);
    }

    public void a(byte[] bArr) {
        a(bArr, bArr.length);
    }
}
