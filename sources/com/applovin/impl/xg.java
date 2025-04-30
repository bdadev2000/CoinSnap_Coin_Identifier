package com.applovin.impl;

import androidx.core.view.MotionEventCompat;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class xg {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f12177a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f12178c;

    /* renamed from: d, reason: collision with root package name */
    private int f12179d;

    public xg() {
        this.f12177a = yp.f12455f;
    }

    private void a() {
        int i9;
        int i10 = this.b;
        AbstractC0669a1.b(i10 >= 0 && (i10 < (i9 = this.f12179d) || (i10 == i9 && this.f12178c == 0)));
    }

    public int b() {
        return ((this.f12179d - this.b) * 8) - this.f12178c;
    }

    public void c() {
        if (this.f12178c == 0) {
            return;
        }
        this.f12178c = 0;
        this.b++;
        a();
    }

    public int d() {
        AbstractC0669a1.b(this.f12178c == 0);
        return this.b;
    }

    public int e() {
        return (this.b * 8) + this.f12178c;
    }

    public boolean f() {
        boolean z8;
        if ((this.f12177a[this.b] & (128 >> this.f12178c)) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        g();
        return z8;
    }

    public void g() {
        int i9 = this.f12178c + 1;
        this.f12178c = i9;
        if (i9 == 8) {
            this.f12178c = 0;
            this.b++;
        }
        a();
    }

    public void a(int i9, int i10) {
        if (i10 < 32) {
            i9 &= (1 << i10) - 1;
        }
        int min = Math.min(8 - this.f12178c, i10);
        int i11 = this.f12178c;
        int i12 = (8 - i11) - min;
        int i13 = (MotionEventCompat.ACTION_POINTER_INDEX_MASK >> i11) | ((1 << i12) - 1);
        byte[] bArr = this.f12177a;
        int i14 = this.b;
        byte b = (byte) (i13 & bArr[i14]);
        bArr[i14] = b;
        int i15 = i10 - min;
        bArr[i14] = (byte) (b | ((i9 >>> i15) << i12));
        int i16 = i14 + 1;
        while (i15 > 8) {
            this.f12177a[i16] = (byte) (i9 >>> (i15 - 8));
            i15 -= 8;
            i16++;
        }
        int i17 = 8 - i15;
        byte[] bArr2 = this.f12177a;
        byte b8 = (byte) (bArr2[i16] & ((1 << i17) - 1));
        bArr2[i16] = b8;
        bArr2[i16] = (byte) (((i9 & ((1 << i15) - 1)) << i17) | b8);
        d(i10);
        a();
    }

    public long b(int i9) {
        if (i9 <= 32) {
            return yp.i(a(i9));
        }
        return yp.c(a(i9 - 32), a(32));
    }

    public void e(int i9) {
        AbstractC0669a1.b(this.f12178c == 0);
        this.b += i9;
        a();
    }

    public xg(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public void d(int i9) {
        int i10 = i9 / 8;
        int i11 = this.b + i10;
        this.b = i11;
        int i12 = (i9 - (i10 * 8)) + this.f12178c;
        this.f12178c = i12;
        if (i12 > 7) {
            this.b = i11 + 1;
            this.f12178c = i12 - 8;
        }
        a();
    }

    public xg(byte[] bArr, int i9) {
        this.f12177a = bArr;
        this.f12179d = i9;
    }

    public void b(byte[] bArr, int i9, int i10) {
        AbstractC0669a1.b(this.f12178c == 0);
        System.arraycopy(this.f12177a, this.b, bArr, i9, i10);
        this.b += i10;
        a();
    }

    public void c(int i9) {
        int i10 = i9 / 8;
        this.b = i10;
        this.f12178c = i9 - (i10 * 8);
        a();
    }

    public int a(int i9) {
        int i10;
        if (i9 == 0) {
            return 0;
        }
        this.f12178c += i9;
        int i11 = 0;
        while (true) {
            i10 = this.f12178c;
            if (i10 <= 8) {
                break;
            }
            int i12 = i10 - 8;
            this.f12178c = i12;
            byte[] bArr = this.f12177a;
            int i13 = this.b;
            this.b = i13 + 1;
            i11 |= (bArr[i13] & 255) << i12;
        }
        byte[] bArr2 = this.f12177a;
        int i14 = this.b;
        int i15 = ((-1) >>> (32 - i9)) & (i11 | ((bArr2[i14] & 255) >> (8 - i10)));
        if (i10 == 8) {
            this.f12178c = 0;
            this.b = i14 + 1;
        }
        a();
        return i15;
    }

    public void a(byte[] bArr, int i9, int i10) {
        int i11 = (i10 >> 3) + i9;
        while (i9 < i11) {
            byte[] bArr2 = this.f12177a;
            int i12 = this.b;
            int i13 = i12 + 1;
            this.b = i13;
            byte b = bArr2[i12];
            int i14 = this.f12178c;
            byte b8 = (byte) (b << i14);
            bArr[i9] = b8;
            bArr[i9] = (byte) (((255 & bArr2[i13]) >> (8 - i14)) | b8);
            i9++;
        }
        int i15 = i10 & 7;
        if (i15 == 0) {
            return;
        }
        byte b9 = (byte) (bArr[i11] & (255 >> i15));
        bArr[i11] = b9;
        int i16 = this.f12178c;
        if (i16 + i15 > 8) {
            byte[] bArr3 = this.f12177a;
            int i17 = this.b;
            this.b = i17 + 1;
            bArr[i11] = (byte) (b9 | ((bArr3[i17] & 255) << i16));
            this.f12178c = i16 - 8;
        }
        int i18 = this.f12178c + i15;
        this.f12178c = i18;
        byte[] bArr4 = this.f12177a;
        int i19 = this.b;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i19]) >> (8 - i18)) << (8 - i15))) | bArr[i11]);
        if (i18 == 8) {
            this.f12178c = 0;
            this.b = i19 + 1;
        }
        a();
    }

    public String a(int i9, Charset charset) {
        byte[] bArr = new byte[i9];
        b(bArr, 0, i9);
        return new String(bArr, charset);
    }

    public void a(yg ygVar) {
        a(ygVar.c(), ygVar.e());
        c(ygVar.d() * 8);
    }

    public void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    public void a(byte[] bArr, int i9) {
        this.f12177a = bArr;
        this.b = 0;
        this.f12178c = 0;
        this.f12179d = i9;
    }
}
