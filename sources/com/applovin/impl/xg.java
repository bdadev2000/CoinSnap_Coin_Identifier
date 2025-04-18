package com.applovin.impl;

import androidx.core.view.MotionEventCompat;
import java.nio.charset.Charset;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class xg {
    public byte[] a;

    /* renamed from: b, reason: collision with root package name */
    private int f8975b;

    /* renamed from: c, reason: collision with root package name */
    private int f8976c;

    /* renamed from: d, reason: collision with root package name */
    private int f8977d;

    public xg() {
        this.a = yp.f9257f;
    }

    private void a() {
        int i10;
        int i11 = this.f8975b;
        a1.b(i11 >= 0 && (i11 < (i10 = this.f8977d) || (i11 == i10 && this.f8976c == 0)));
    }

    public int b() {
        return ((this.f8977d - this.f8975b) * 8) - this.f8976c;
    }

    public void c() {
        if (this.f8976c == 0) {
            return;
        }
        this.f8976c = 0;
        this.f8975b++;
        a();
    }

    public int d() {
        a1.b(this.f8976c == 0);
        return this.f8975b;
    }

    public int e() {
        return (this.f8975b * 8) + this.f8976c;
    }

    public boolean f() {
        boolean z10;
        if ((this.a[this.f8975b] & (128 >> this.f8976c)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        g();
        return z10;
    }

    public void g() {
        int i10 = this.f8976c + 1;
        this.f8976c = i10;
        if (i10 == 8) {
            this.f8976c = 0;
            this.f8975b++;
        }
        a();
    }

    public void a(int i10, int i11) {
        if (i11 < 32) {
            i10 &= (1 << i11) - 1;
        }
        int min = Math.min(8 - this.f8976c, i11);
        int i12 = this.f8976c;
        int i13 = (8 - i12) - min;
        int i14 = (MotionEventCompat.ACTION_POINTER_INDEX_MASK >> i12) | ((1 << i13) - 1);
        byte[] bArr = this.a;
        int i15 = this.f8975b;
        byte b3 = (byte) (i14 & bArr[i15]);
        bArr[i15] = b3;
        int i16 = i11 - min;
        bArr[i15] = (byte) (b3 | ((i10 >>> i16) << i13));
        int i17 = i15 + 1;
        while (i16 > 8) {
            this.a[i17] = (byte) (i10 >>> (i16 - 8));
            i16 -= 8;
            i17++;
        }
        int i18 = 8 - i16;
        byte[] bArr2 = this.a;
        byte b10 = (byte) (bArr2[i17] & ((1 << i18) - 1));
        bArr2[i17] = b10;
        bArr2[i17] = (byte) (((i10 & ((1 << i16) - 1)) << i18) | b10);
        d(i11);
        a();
    }

    public long b(int i10) {
        if (i10 <= 32) {
            return yp.i(a(i10));
        }
        return yp.c(a(i10 - 32), a(32));
    }

    public void e(int i10) {
        a1.b(this.f8976c == 0);
        this.f8975b += i10;
        a();
    }

    public xg(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public void d(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f8975b + i11;
        this.f8975b = i12;
        int i13 = (i10 - (i11 * 8)) + this.f8976c;
        this.f8976c = i13;
        if (i13 > 7) {
            this.f8975b = i12 + 1;
            this.f8976c = i13 - 8;
        }
        a();
    }

    public xg(byte[] bArr, int i10) {
        this.a = bArr;
        this.f8977d = i10;
    }

    public void b(byte[] bArr, int i10, int i11) {
        a1.b(this.f8976c == 0);
        System.arraycopy(this.a, this.f8975b, bArr, i10, i11);
        this.f8975b += i11;
        a();
    }

    public void c(int i10) {
        int i11 = i10 / 8;
        this.f8975b = i11;
        this.f8976c = i10 - (i11 * 8);
        a();
    }

    public int a(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f8976c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f8976c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f8976c = i13;
            byte[] bArr = this.a;
            int i14 = this.f8975b;
            this.f8975b = i14 + 1;
            i12 |= (bArr[i14] & UByte.MAX_VALUE) << i13;
        }
        byte[] bArr2 = this.a;
        int i15 = this.f8975b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & UByte.MAX_VALUE) >> (8 - i11)));
        if (i11 == 8) {
            this.f8976c = 0;
            this.f8975b = i15 + 1;
        }
        a();
        return i16;
    }

    public void a(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.a;
            int i13 = this.f8975b;
            int i14 = i13 + 1;
            this.f8975b = i14;
            byte b3 = bArr2[i13];
            int i15 = this.f8976c;
            byte b10 = (byte) (b3 << i15);
            bArr[i10] = b10;
            bArr[i10] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b10);
            i10++;
        }
        int i16 = i11 & 7;
        if (i16 == 0) {
            return;
        }
        byte b11 = (byte) (bArr[i12] & (255 >> i16));
        bArr[i12] = b11;
        int i17 = this.f8976c;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.a;
            int i18 = this.f8975b;
            this.f8975b = i18 + 1;
            bArr[i12] = (byte) (b11 | ((bArr3[i18] & UByte.MAX_VALUE) << i17));
            this.f8976c = i17 - 8;
        }
        int i19 = this.f8976c + i16;
        this.f8976c = i19;
        byte[] bArr4 = this.a;
        int i20 = this.f8975b;
        bArr[i12] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i12]);
        if (i19 == 8) {
            this.f8976c = 0;
            this.f8975b = i20 + 1;
        }
        a();
    }

    public String a(int i10, Charset charset) {
        byte[] bArr = new byte[i10];
        b(bArr, 0, i10);
        return new String(bArr, charset);
    }

    public void a(yg ygVar) {
        a(ygVar.c(), ygVar.e());
        c(ygVar.d() * 8);
    }

    public void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    public void a(byte[] bArr, int i10) {
        this.a = bArr;
        this.f8975b = 0;
        this.f8976c = 0;
        this.f8977d = i10;
    }
}
