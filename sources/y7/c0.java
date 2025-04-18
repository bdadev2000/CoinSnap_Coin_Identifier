package y7;

import kotlin.UByte;
import n9.h0;
import v8.u0;

/* loaded from: classes3.dex */
public final class c0 {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public int f27956b;

    /* renamed from: c, reason: collision with root package name */
    public int f27957c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f27958d;

    /* renamed from: e, reason: collision with root package name */
    public int f27959e;

    public c0(int i10) {
        this.a = i10;
        if (i10 != 4) {
            this.f27958d = h0.f22548f;
            return;
        }
        this.f27956b = -1;
        this.f27957c = -1;
        this.f27959e = -1;
    }

    public final void a() {
        int i10;
        int i11;
        int i12;
        boolean z10 = true;
        switch (this.a) {
            case 0:
                int i13 = this.f27957c;
                if (i13 < 0 || (i13 >= (i11 = this.f27956b) && (i13 != i11 || this.f27959e != 0))) {
                    z10 = false;
                }
                u0.m(z10);
                return;
            case 1:
            default:
                int i14 = this.f27957c;
                if (i14 < 0 || (i14 >= (i10 = this.f27956b) && (i14 != i10 || this.f27959e != 0))) {
                    z10 = false;
                }
                u0.m(z10);
                return;
            case 2:
                int i15 = this.f27956b;
                if (i15 < 0 || (i15 >= (i12 = this.f27959e) && (i15 != i12 || this.f27957c != 0))) {
                    z10 = false;
                }
                u0.m(z10);
                return;
        }
    }

    public final int b() {
        return ((this.f27959e - this.f27956b) * 8) - this.f27957c;
    }

    public final void c() {
        if (this.f27957c == 0) {
            return;
        }
        this.f27957c = 0;
        this.f27956b++;
        a();
    }

    public final boolean d(int i10) {
        int i11 = this.f27957c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f27959e + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f27956b) {
                break;
            }
            if (p(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f27956b;
        if (i13 < i15) {
            return true;
        }
        if (i13 == i15 && i14 == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        boolean z10;
        int i10 = this.f27957c;
        int i11 = this.f27959e;
        int i12 = 0;
        while (this.f27957c < this.f27956b && !h()) {
            i12++;
        }
        if (this.f27957c == this.f27956b) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27957c = i10;
        this.f27959e = i11;
        if (z10 || !d((i12 * 2) + 1)) {
            return false;
        }
        return true;
    }

    public final int f() {
        boolean z10;
        if (this.f27957c == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.m(z10);
        return this.f27956b;
    }

    public final int g() {
        int i10;
        int i11;
        switch (this.a) {
            case 0:
                i10 = this.f27957c * 8;
                i11 = this.f27959e;
                break;
            default:
                i10 = this.f27956b * 8;
                i11 = this.f27957c;
                break;
        }
        return i10 + i11;
    }

    public final boolean h() {
        boolean z10 = false;
        switch (this.a) {
            case 0:
                if ((((this.f27958d[this.f27957c] & UByte.MAX_VALUE) >> this.f27959e) & 1) == 1) {
                    z10 = true;
                }
                r(1);
                return z10;
            case 1:
            default:
                if ((this.f27958d[this.f27957c] & (128 >> this.f27959e)) != 0) {
                    z10 = true;
                }
                q();
                return z10;
            case 2:
                if ((this.f27958d[this.f27956b] & (128 >> this.f27957c)) != 0) {
                    z10 = true;
                }
                q();
                return z10;
        }
    }

    public final int i(int i10) {
        int i11 = 1;
        switch (this.a) {
            case 0:
                int i12 = this.f27957c;
                int min = Math.min(i10, 8 - this.f27959e);
                int i13 = i12 + 1;
                int i14 = ((this.f27958d[i12] & UByte.MAX_VALUE) >> this.f27959e) & (255 >> (8 - min));
                while (min < i10) {
                    i14 |= (this.f27958d[i13] & UByte.MAX_VALUE) << min;
                    min += 8;
                    i13++;
                }
                int i15 = i14 & ((-1) >>> (32 - i10));
                r(i10);
                return i15;
            case 1:
            default:
                this.f27959e += i10;
                int i16 = 0;
                while (true) {
                    int i17 = this.f27959e;
                    int i18 = 2;
                    if (i17 > 8) {
                        int i19 = i17 - 8;
                        this.f27959e = i19;
                        byte[] bArr = this.f27958d;
                        int i20 = this.f27957c;
                        i16 |= (bArr[i20] & UByte.MAX_VALUE) << i19;
                        if (!p(i20 + 1)) {
                            i18 = 1;
                        }
                        this.f27957c = i20 + i18;
                    } else {
                        byte[] bArr2 = this.f27958d;
                        int i21 = this.f27957c;
                        int i22 = ((-1) >>> (32 - i10)) & (i16 | ((255 & bArr2[i21]) >> (8 - i17)));
                        if (i17 == 8) {
                            this.f27959e = 0;
                            if (p(i21 + 1)) {
                                i11 = 2;
                            }
                            this.f27957c = i21 + i11;
                        }
                        a();
                        return i22;
                    }
                }
            case 2:
                if (i10 == 0) {
                    return 0;
                }
                this.f27957c += i10;
                int i23 = 0;
                while (true) {
                    int i24 = this.f27957c;
                    if (i24 > 8) {
                        int i25 = i24 - 8;
                        this.f27957c = i25;
                        byte[] bArr3 = this.f27958d;
                        int i26 = this.f27956b;
                        this.f27956b = i26 + 1;
                        i23 |= (bArr3[i26] & UByte.MAX_VALUE) << i25;
                    } else {
                        byte[] bArr4 = this.f27958d;
                        int i27 = this.f27956b;
                        int i28 = ((-1) >>> (32 - i10)) & (i23 | ((255 & bArr4[i27]) >> (8 - i24)));
                        if (i24 == 8) {
                            this.f27957c = 0;
                            this.f27956b = i27 + 1;
                        }
                        a();
                        return i28;
                    }
                }
        }
    }

    public final void j(byte[] bArr, int i10) {
        int i11 = (i10 >> 3) + 0;
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.f27958d;
            int i13 = this.f27956b;
            int i14 = i13 + 1;
            this.f27956b = i14;
            byte b3 = bArr2[i13];
            int i15 = this.f27957c;
            byte b10 = (byte) (b3 << i15);
            bArr[i12] = b10;
            bArr[i12] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b10);
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b11 = (byte) (bArr[i11] & (255 >> i16));
        bArr[i11] = b11;
        int i17 = this.f27957c;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f27958d;
            int i18 = this.f27956b;
            this.f27956b = i18 + 1;
            bArr[i11] = (byte) (b11 | ((bArr3[i18] & UByte.MAX_VALUE) << i17));
            this.f27957c = i17 - 8;
        }
        int i19 = this.f27957c + i16;
        this.f27957c = i19;
        byte[] bArr4 = this.f27958d;
        int i20 = this.f27956b;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i11]);
        if (i19 == 8) {
            this.f27957c = 0;
            this.f27956b = i20 + 1;
        }
        a();
    }

    public final void k(byte[] bArr, int i10) {
        boolean z10;
        if (this.f27957c == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.m(z10);
        System.arraycopy(this.f27958d, this.f27956b, bArr, 0, i10);
        this.f27956b += i10;
        a();
    }

    public final int l() {
        int i10 = 0;
        int i11 = 0;
        while (!h()) {
            i11++;
        }
        int i12 = (1 << i11) - 1;
        if (i11 > 0) {
            i10 = i(i11);
        }
        return i12 + i10;
    }

    public final int m() {
        int i10;
        int l10 = l();
        if (l10 % 2 == 0) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        return ((l10 + 1) / 2) * i10;
    }

    public final void n(byte[] bArr, int i10) {
        this.f27958d = bArr;
        this.f27956b = 0;
        this.f27957c = 0;
        this.f27959e = i10;
    }

    public final void o(int i10) {
        int i11 = i10 / 8;
        this.f27956b = i11;
        this.f27957c = i10 - (i11 * 8);
        a();
    }

    public final boolean p(int i10) {
        if (2 <= i10 && i10 < this.f27956b) {
            byte[] bArr = this.f27958d;
            if (bArr[i10] == 3 && bArr[i10 - 2] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void q() {
        int i10 = 1;
        switch (this.a) {
            case 2:
                int i11 = this.f27957c + 1;
                this.f27957c = i11;
                if (i11 == 8) {
                    this.f27957c = 0;
                    this.f27956b++;
                }
                a();
                return;
            default:
                int i12 = this.f27959e + 1;
                this.f27959e = i12;
                if (i12 == 8) {
                    this.f27959e = 0;
                    int i13 = this.f27957c;
                    if (p(i13 + 1)) {
                        i10 = 2;
                    }
                    this.f27957c = i13 + i10;
                }
                a();
                return;
        }
    }

    public final void r(int i10) {
        switch (this.a) {
            case 0:
                int i11 = i10 / 8;
                int i12 = this.f27957c + i11;
                this.f27957c = i12;
                int i13 = (i10 - (i11 * 8)) + this.f27959e;
                this.f27959e = i13;
                if (i13 > 7) {
                    this.f27957c = i12 + 1;
                    this.f27959e = i13 - 8;
                }
                a();
                return;
            case 1:
            default:
                int i14 = this.f27957c;
                int i15 = i10 / 8;
                int i16 = i14 + i15;
                this.f27957c = i16;
                int i17 = (i10 - (i15 * 8)) + this.f27959e;
                this.f27959e = i17;
                if (i17 > 7) {
                    this.f27957c = i16 + 1;
                    this.f27959e = i17 - 8;
                }
                while (true) {
                    i14++;
                    if (i14 <= this.f27957c) {
                        if (p(i14)) {
                            this.f27957c++;
                            i14 += 2;
                        }
                    } else {
                        a();
                        return;
                    }
                }
            case 2:
                int i18 = i10 / 8;
                int i19 = this.f27956b + i18;
                this.f27956b = i19;
                int i20 = (i10 - (i18 * 8)) + this.f27957c;
                this.f27957c = i20;
                if (i20 > 7) {
                    this.f27956b = i19 + 1;
                    this.f27957c = i20 - 8;
                }
                a();
                return;
        }
    }

    public final void s(int i10) {
        boolean z10;
        if (this.f27957c == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.m(z10);
        this.f27956b += i10;
        a();
    }

    public c0(byte[] bArr, int i10, int i11) {
        this.a = 3;
        this.f27958d = bArr;
        this.f27957c = i10;
        this.f27956b = i11;
        this.f27959e = 0;
        a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c0(byte[] bArr, int i10, Object obj) {
        this(bArr, bArr.length);
        this.a = i10;
        if (i10 != 2) {
            this.f27958d = bArr;
            this.f27956b = bArr.length;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(o9.b bVar, int i10) {
        this(bVar);
        this.a = 4;
    }

    public c0(o9.b bVar) {
        this.a = 4;
        this.f27956b = bVar.f23185b;
        this.f27957c = bVar.f23186c;
        this.f27959e = bVar.f23187d;
        this.f27958d = bVar.f23188f;
    }

    public c0(byte[] bArr, int i10) {
        this.a = 2;
        this.f27958d = bArr;
        this.f27959e = i10;
    }

    public c0(int i10, int i11) {
        this.a = 1;
        this.f27956b = i10;
        this.f27957c = i11;
        this.f27958d = new byte[(i11 * 2) - 1];
        this.f27959e = 0;
    }
}
