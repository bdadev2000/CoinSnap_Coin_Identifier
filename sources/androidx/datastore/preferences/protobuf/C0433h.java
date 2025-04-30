package androidx.datastore.preferences.protobuf;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0433h {

    /* renamed from: a, reason: collision with root package name */
    public int f4566a;

    /* renamed from: d, reason: collision with root package name */
    public J5.a f4568d;

    /* renamed from: e, reason: collision with root package name */
    public final InputStream f4569e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f4570f;

    /* renamed from: g, reason: collision with root package name */
    public int f4571g;

    /* renamed from: h, reason: collision with root package name */
    public int f4572h;

    /* renamed from: i, reason: collision with root package name */
    public int f4573i;

    /* renamed from: j, reason: collision with root package name */
    public int f4574j;

    /* renamed from: k, reason: collision with root package name */
    public int f4575k;
    public final int b = 100;

    /* renamed from: c, reason: collision with root package name */
    public final int f4567c = Integer.MAX_VALUE;
    public int l = Integer.MAX_VALUE;

    public C0433h(FileInputStream fileInputStream) {
        Charset charset = AbstractC0449y.f4610a;
        this.f4569e = fileInputStream;
        this.f4570f = new byte[4096];
        this.f4571g = 0;
        this.f4573i = 0;
        this.f4575k = 0;
    }

    public final String A() {
        int t9 = t();
        byte[] bArr = this.f4570f;
        if (t9 > 0) {
            int i9 = this.f4571g;
            int i10 = this.f4573i;
            if (t9 <= i9 - i10) {
                String str = new String(bArr, i10, t9, AbstractC0449y.f4610a);
                this.f4573i += t9;
                return str;
            }
        }
        if (t9 == 0) {
            return "";
        }
        if (t9 <= this.f4571g) {
            G(t9);
            String str2 = new String(bArr, this.f4573i, t9, AbstractC0449y.f4610a);
            this.f4573i += t9;
            return str2;
        }
        return new String(o(t9), AbstractC0449y.f4610a);
    }

    public final String B() {
        int t9 = t();
        int i9 = this.f4573i;
        int i10 = this.f4571g;
        int i11 = i10 - i9;
        byte[] bArr = this.f4570f;
        if (t9 <= i11 && t9 > 0) {
            this.f4573i = i9 + t9;
        } else {
            if (t9 == 0) {
                return "";
            }
            i9 = 0;
            if (t9 <= i10) {
                G(t9);
                this.f4573i = t9;
            } else {
                bArr = o(t9);
            }
        }
        return u0.f4609a.f(bArr, i9, t9);
    }

    public final int C() {
        if (c()) {
            this.f4574j = 0;
            return 0;
        }
        int t9 = t();
        this.f4574j = t9;
        if ((t9 >>> 3) != 0) {
            return t9;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    public final int D() {
        return t();
    }

    public final long E() {
        return u();
    }

    public final void F() {
        int i9 = this.f4571g + this.f4572h;
        this.f4571g = i9;
        int i10 = this.f4575k + i9;
        int i11 = this.l;
        if (i10 > i11) {
            int i12 = i10 - i11;
            this.f4572h = i12;
            this.f4571g = i9 - i12;
            return;
        }
        this.f4572h = 0;
    }

    public final void G(int i9) {
        if (!J(i9)) {
            if (i9 > (this.f4567c - this.f4575k) - this.f4573i) {
                throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw A.f();
        }
    }

    public final boolean H(int i9) {
        int C8;
        int i10 = i9 & 7;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return false;
                        }
                        if (i10 == 5) {
                            I(4);
                            return true;
                        }
                        throw A.b();
                    }
                    do {
                        C8 = C();
                        if (C8 == 0) {
                            break;
                        }
                    } while (H(C8));
                    a(((i9 >>> 3) << 3) | 4);
                    return true;
                }
                I(t());
                return true;
            }
            I(8);
            return true;
        }
        int i12 = this.f4571g - this.f4573i;
        byte[] bArr = this.f4570f;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.f4573i;
                this.f4573i = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            throw A.c();
        }
        while (i11 < 10) {
            if (this.f4573i == this.f4571g) {
                G(1);
            }
            int i14 = this.f4573i;
            this.f4573i = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        throw A.c();
        return true;
    }

    public final void I(int i9) {
        int i10 = this.f4571g;
        int i11 = this.f4573i;
        if (i9 <= i10 - i11 && i9 >= 0) {
            this.f4573i = i11 + i9;
            return;
        }
        InputStream inputStream = this.f4569e;
        if (i9 >= 0) {
            int i12 = this.f4575k;
            int i13 = i12 + i11;
            int i14 = i13 + i9;
            int i15 = this.l;
            if (i14 <= i15) {
                this.f4575k = i13;
                int i16 = i10 - i11;
                this.f4571g = 0;
                this.f4573i = 0;
                while (i16 < i9) {
                    long j7 = i9 - i16;
                    try {
                        long skip = inputStream.skip(j7);
                        if (skip >= 0 && skip <= j7) {
                            if (skip == 0) {
                                break;
                            } else {
                                i16 += (int) skip;
                            }
                        } else {
                            throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                        }
                    } finally {
                        this.f4575k += i16;
                        F();
                    }
                }
                if (i16 < i9) {
                    int i17 = this.f4571g;
                    int i18 = i17 - this.f4573i;
                    this.f4573i = i17;
                    G(1);
                    while (true) {
                        int i19 = i9 - i18;
                        int i20 = this.f4571g;
                        if (i19 > i20) {
                            i18 += i20;
                            this.f4573i = i20;
                            G(1);
                        } else {
                            this.f4573i = i19;
                            return;
                        }
                    }
                }
            } else {
                I((i15 - i12) - i11);
                throw A.f();
            }
        } else {
            throw A.d();
        }
    }

    public final boolean J(int i9) {
        int i10 = this.f4573i;
        int i11 = i10 + i9;
        int i12 = this.f4571g;
        if (i11 > i12) {
            int i13 = this.f4575k;
            int i14 = this.f4567c;
            if (i9 > (i14 - i13) - i10 || i13 + i10 + i9 > this.l) {
                return false;
            }
            byte[] bArr = this.f4570f;
            if (i10 > 0) {
                if (i12 > i10) {
                    System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                }
                this.f4575k += i10;
                this.f4571g -= i10;
                this.f4573i = 0;
            }
            int i15 = this.f4571g;
            int min = Math.min(bArr.length - i15, (i14 - this.f4575k) - i15);
            InputStream inputStream = this.f4569e;
            int read = inputStream.read(bArr, i15, min);
            if (read != 0 && read >= -1 && read <= bArr.length) {
                if (read <= 0) {
                    return false;
                }
                this.f4571g += read;
                F();
                if (this.f4571g >= i9) {
                    return true;
                }
                return J(i9);
            }
            throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
        }
        throw new IllegalStateException(Q7.n0.f(i9, "refillBuffer() called when ", " bytes were already available in buffer"));
    }

    public final void a(int i9) {
        if (this.f4574j == i9) {
        } else {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int b() {
        return this.f4575k + this.f4573i;
    }

    public final boolean c() {
        if (this.f4573i == this.f4571g && !J(1)) {
            return true;
        }
        return false;
    }

    public final void d(int i9) {
        this.l = i9;
        F();
    }

    public final int e(int i9) {
        if (i9 >= 0) {
            int i10 = this.f4575k + this.f4573i + i9;
            int i11 = this.l;
            if (i10 <= i11) {
                this.l = i10;
                F();
                return i11;
            }
            throw A.f();
        }
        throw A.d();
    }

    public final boolean f() {
        if (u() != 0) {
            return true;
        }
        return false;
    }

    public final C0432g g() {
        int t9 = t();
        int i9 = this.f4571g;
        int i10 = this.f4573i;
        int i11 = i9 - i10;
        byte[] bArr = this.f4570f;
        if (t9 <= i11 && t9 > 0) {
            C0432g c9 = C0432g.c(i10, t9, bArr);
            this.f4573i += t9;
            return c9;
        }
        if (t9 == 0) {
            return C0432g.f4560d;
        }
        byte[] p2 = p(t9);
        if (p2 != null) {
            return C0432g.c(0, p2.length, p2);
        }
        int i12 = this.f4573i;
        int i13 = this.f4571g;
        int i14 = i13 - i12;
        this.f4575k += i13;
        this.f4573i = 0;
        this.f4571g = 0;
        ArrayList q9 = q(t9 - i14);
        byte[] bArr2 = new byte[t9];
        System.arraycopy(bArr, i12, bArr2, 0, i14);
        Iterator it = q9.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, i14, bArr3.length);
            i14 += bArr3.length;
        }
        C0432g c0432g = C0432g.f4560d;
        return new C0432g(bArr2);
    }

    public final double h() {
        return Double.longBitsToDouble(s());
    }

    public final int i() {
        return t();
    }

    public final int j() {
        return r();
    }

    public final long k() {
        return s();
    }

    public final float l() {
        return Float.intBitsToFloat(r());
    }

    public final int m() {
        return t();
    }

    public final long n() {
        return u();
    }

    public final byte[] o(int i9) {
        byte[] p2 = p(i9);
        if (p2 != null) {
            return p2;
        }
        int i10 = this.f4573i;
        int i11 = this.f4571g;
        int i12 = i11 - i10;
        this.f4575k += i11;
        this.f4573i = 0;
        this.f4571g = 0;
        ArrayList q9 = q(i9 - i12);
        byte[] bArr = new byte[i9];
        System.arraycopy(this.f4570f, i10, bArr, 0, i12);
        Iterator it = q9.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i12, bArr2.length);
            i12 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] p(int i9) {
        if (i9 == 0) {
            return AbstractC0449y.b;
        }
        if (i9 >= 0) {
            int i10 = this.f4575k;
            int i11 = this.f4573i;
            int i12 = i10 + i11 + i9;
            if (i12 - this.f4567c <= 0) {
                int i13 = this.l;
                if (i12 <= i13) {
                    int i14 = this.f4571g - i11;
                    int i15 = i9 - i14;
                    InputStream inputStream = this.f4569e;
                    if (i15 >= 4096 && i15 > inputStream.available()) {
                        return null;
                    }
                    byte[] bArr = new byte[i9];
                    System.arraycopy(this.f4570f, this.f4573i, bArr, 0, i14);
                    this.f4575k += this.f4571g;
                    this.f4573i = 0;
                    this.f4571g = 0;
                    while (i14 < i9) {
                        int read = inputStream.read(bArr, i14, i9 - i14);
                        if (read != -1) {
                            this.f4575k += read;
                            i14 += read;
                        } else {
                            throw A.f();
                        }
                    }
                    return bArr;
                }
                I((i13 - i10) - i11);
                throw A.f();
            }
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw A.d();
    }

    public final ArrayList q(int i9) {
        ArrayList arrayList = new ArrayList();
        while (i9 > 0) {
            int min = Math.min(i9, 4096);
            byte[] bArr = new byte[min];
            int i10 = 0;
            while (i10 < min) {
                int read = this.f4569e.read(bArr, i10, min - i10);
                if (read != -1) {
                    this.f4575k += read;
                    i10 += read;
                } else {
                    throw A.f();
                }
            }
            i9 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int r() {
        int i9 = this.f4573i;
        if (this.f4571g - i9 < 4) {
            G(4);
            i9 = this.f4573i;
        }
        this.f4573i = i9 + 4;
        byte[] bArr = this.f4570f;
        return ((bArr[i9 + 3] & 255) << 24) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16);
    }

    public final long s() {
        int i9 = this.f4573i;
        if (this.f4571g - i9 < 8) {
            G(8);
            i9 = this.f4573i;
        }
        this.f4573i = i9 + 8;
        byte[] bArr = this.f4570f;
        return ((bArr[i9 + 7] & 255) << 56) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16) | ((bArr[i9 + 3] & 255) << 24) | ((bArr[i9 + 4] & 255) << 32) | ((bArr[i9 + 5] & 255) << 40) | ((bArr[i9 + 6] & 255) << 48);
    }

    public final int t() {
        int i9;
        int i10 = this.f4573i;
        int i11 = this.f4571g;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f4570f;
            byte b = bArr[i10];
            if (b >= 0) {
                this.f4573i = i12;
                return b;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b;
                if (i14 < 0) {
                    i9 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << Ascii.SO) ^ i14;
                    if (i16 >= 0) {
                        i9 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << Ascii.NAK);
                        if (i18 < 0) {
                            i9 = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b8 = bArr[i17];
                            int i19 = (i18 ^ (b8 << Ascii.FS)) ^ 266354560;
                            if (b8 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i9 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i9 = i19;
                            }
                            i9 = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.f4573i = i13;
                return i9;
            }
        }
        return (int) v();
    }

    public final long u() {
        long j7;
        long j9;
        long j10;
        long j11;
        int i9 = this.f4573i;
        int i10 = this.f4571g;
        if (i10 != i9) {
            int i11 = i9 + 1;
            byte[] bArr = this.f4570f;
            byte b = bArr[i9];
            if (b >= 0) {
                this.f4573i = i11;
                return b;
            }
            if (i10 - i11 >= 9) {
                int i12 = i9 + 2;
                int i13 = (bArr[i11] << 7) ^ b;
                if (i13 < 0) {
                    j7 = i13 ^ (-128);
                } else {
                    int i14 = i9 + 3;
                    int i15 = (bArr[i12] << Ascii.SO) ^ i13;
                    if (i15 >= 0) {
                        j7 = i15 ^ 16256;
                        i12 = i14;
                    } else {
                        int i16 = i9 + 4;
                        int i17 = i15 ^ (bArr[i14] << Ascii.NAK);
                        if (i17 < 0) {
                            j11 = (-2080896) ^ i17;
                        } else {
                            long j12 = i17;
                            i12 = i9 + 5;
                            long j13 = j12 ^ (bArr[i16] << 28);
                            if (j13 >= 0) {
                                j10 = 266354560;
                            } else {
                                i16 = i9 + 6;
                                long j14 = j13 ^ (bArr[i12] << 35);
                                if (j14 < 0) {
                                    j9 = -34093383808L;
                                } else {
                                    i12 = i9 + 7;
                                    j13 = j14 ^ (bArr[i16] << 42);
                                    if (j13 >= 0) {
                                        j10 = 4363953127296L;
                                    } else {
                                        i16 = i9 + 8;
                                        j14 = j13 ^ (bArr[i12] << 49);
                                        if (j14 < 0) {
                                            j9 = -558586000294016L;
                                        } else {
                                            i12 = i9 + 9;
                                            long j15 = (j14 ^ (bArr[i16] << 56)) ^ 71499008037633920L;
                                            if (j15 < 0) {
                                                int i18 = i9 + 10;
                                                if (bArr[i12] >= 0) {
                                                    i12 = i18;
                                                }
                                            }
                                            j7 = j15;
                                        }
                                    }
                                }
                                j11 = j9 ^ j14;
                            }
                            j7 = j10 ^ j13;
                        }
                        i12 = i16;
                        j7 = j11;
                    }
                }
                this.f4573i = i12;
                return j7;
            }
        }
        return v();
    }

    public final long v() {
        long j7 = 0;
        for (int i9 = 0; i9 < 64; i9 += 7) {
            if (this.f4573i == this.f4571g) {
                G(1);
            }
            int i10 = this.f4573i;
            this.f4573i = i10 + 1;
            j7 |= (r3 & Ascii.DEL) << i9;
            if ((this.f4570f[i10] & 128) == 0) {
                return j7;
            }
        }
        throw A.c();
    }

    public final int w() {
        return r();
    }

    public final long x() {
        return s();
    }

    public final int y() {
        int t9 = t();
        return (-(t9 & 1)) ^ (t9 >>> 1);
    }

    public final long z() {
        long u8 = u();
        return (-(u8 & 1)) ^ (u8 >>> 1);
    }
}
