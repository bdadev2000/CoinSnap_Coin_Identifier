package androidx.datastore.preferences.protobuf;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes.dex */
public final class m extends n {

    /* renamed from: e, reason: collision with root package name */
    public final InputStream f1426e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f1427f;

    /* renamed from: g, reason: collision with root package name */
    public int f1428g;

    /* renamed from: h, reason: collision with root package name */
    public int f1429h;

    /* renamed from: i, reason: collision with root package name */
    public int f1430i;

    /* renamed from: j, reason: collision with root package name */
    public int f1431j;

    /* renamed from: k, reason: collision with root package name */
    public int f1432k;

    /* renamed from: l, reason: collision with root package name */
    public int f1433l = Integer.MAX_VALUE;

    public m(InputStream inputStream) {
        Charset charset = h0.a;
        if (inputStream != null) {
            this.f1426e = inputStream;
            this.f1427f = new byte[4096];
            this.f1428g = 0;
            this.f1430i = 0;
            this.f1432k = 0;
            return;
        }
        throw new NullPointerException("input");
    }

    public final ArrayList A(int i10) {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int min = Math.min(i10, 4096);
            byte[] bArr = new byte[min];
            int i11 = 0;
            while (i11 < min) {
                int read = this.f1426e.read(bArr, i11, min - i11);
                if (read != -1) {
                    this.f1432k += read;
                    i11 += read;
                } else {
                    throw j0.e();
                }
            }
            i10 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int B() {
        int i10 = this.f1430i;
        if (this.f1428g - i10 < 4) {
            H(4);
            i10 = this.f1430i;
        }
        this.f1430i = i10 + 4;
        byte[] bArr = this.f1427f;
        return ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
    }

    public final long C() {
        int i10 = this.f1430i;
        if (this.f1428g - i10 < 8) {
            H(8);
            i10 = this.f1430i;
        }
        this.f1430i = i10 + 8;
        byte[] bArr = this.f1427f;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (r3[r2] < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int D() {
        /*
            r5 = this;
            int r0 = r5.f1430i
            int r1 = r5.f1428g
            if (r1 != r0) goto L7
            goto L6a
        L7:
            int r2 = r0 + 1
            byte[] r3 = r5.f1427f
            r0 = r3[r0]
            if (r0 < 0) goto L12
            r5.f1430i = r2
            return r0
        L12:
            int r1 = r1 - r2
            r4 = 9
            if (r1 >= r4) goto L18
            goto L6a
        L18:
            int r1 = r2 + 1
            r2 = r3[r2]
            int r2 = r2 << 7
            r0 = r0 ^ r2
            if (r0 >= 0) goto L24
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L70
        L24:
            int r2 = r1 + 1
            r1 = r3[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L31
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2f:
            r1 = r2
            goto L70
        L31:
            int r1 = r2 + 1
            r2 = r3[r2]
            int r2 = r2 << 21
            r0 = r0 ^ r2
            if (r0 >= 0) goto L3f
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L70
        L3f:
            int r2 = r1 + 1
            r1 = r3[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2f
            int r1 = r2 + 1
            r2 = r3[r2]
            if (r2 >= 0) goto L70
            int r2 = r1 + 1
            r1 = r3[r1]
            if (r1 >= 0) goto L2f
            int r1 = r2 + 1
            r2 = r3[r2]
            if (r2 >= 0) goto L70
            int r2 = r1 + 1
            r1 = r3[r1]
            if (r1 >= 0) goto L2f
            int r1 = r2 + 1
            r2 = r3[r2]
            if (r2 >= 0) goto L70
        L6a:
            long r0 = r5.F()
            int r0 = (int) r0
            return r0
        L70:
            r5.f1430i = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.m.D():int");
    }

    public final long E() {
        long j3;
        long j10;
        long j11;
        int i10;
        int i11 = this.f1430i;
        int i12 = this.f1428g;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f1427f;
            byte b3 = bArr[i11];
            if (b3 >= 0) {
                this.f1430i = i13;
                return b3;
            }
            if (i12 - i13 >= 9) {
                int i14 = i13 + 1;
                int i15 = b3 ^ (bArr[i13] << 7);
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i14 + 1;
                    int i17 = i15 ^ (bArr[i14] << Ascii.SO);
                    if (i17 >= 0) {
                        j3 = i17 ^ 16256;
                    } else {
                        i14 = i16 + 1;
                        int i18 = i17 ^ (bArr[i16] << Ascii.NAK);
                        if (i18 < 0) {
                            i10 = i18 ^ (-2080896);
                        } else {
                            long j12 = i18;
                            int i19 = i14 + 1;
                            long j13 = (bArr[i14] << 28) ^ j12;
                            if (j13 >= 0) {
                                j10 = j13 ^ 266354560;
                                i14 = i19;
                            } else {
                                int i20 = i19 + 1;
                                long j14 = j13 ^ (bArr[i19] << 35);
                                if (j14 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i16 = i20 + 1;
                                    long j15 = j14 ^ (bArr[i20] << 42);
                                    if (j15 >= 0) {
                                        j3 = j15 ^ 4363953127296L;
                                    } else {
                                        i20 = i16 + 1;
                                        j14 = j15 ^ (bArr[i16] << 49);
                                        if (j14 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i16 = i20 + 1;
                                            j3 = (j14 ^ (bArr[i20] << 56)) ^ 71499008037633920L;
                                            if (j3 < 0) {
                                                i20 = i16 + 1;
                                                if (bArr[i16] >= 0) {
                                                    j10 = j3;
                                                    i14 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                j10 = j11 ^ j14;
                                i14 = i20;
                            }
                            this.f1430i = i14;
                            return j10;
                        }
                    }
                    i14 = i16;
                    j10 = j3;
                    this.f1430i = i14;
                    return j10;
                }
                j10 = i10;
                this.f1430i = i14;
                return j10;
            }
        }
        return F();
    }

    public final long F() {
        long j3 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.f1430i == this.f1428g) {
                H(1);
            }
            int i11 = this.f1430i;
            this.f1430i = i11 + 1;
            j3 |= (r3 & Byte.MAX_VALUE) << i10;
            if ((this.f1427f[i11] & ByteCompanionObject.MIN_VALUE) == 0) {
                return j3;
            }
        }
        throw j0.c();
    }

    public final void G() {
        int i10 = this.f1428g + this.f1429h;
        this.f1428g = i10;
        int i11 = this.f1432k + i10;
        int i12 = this.f1433l;
        if (i11 > i12) {
            int i13 = i11 - i12;
            this.f1429h = i13;
            this.f1428g = i10 - i13;
            return;
        }
        this.f1429h = 0;
    }

    public final void H(int i10) {
        if (!J(i10)) {
            if (i10 > (this.f1442c - this.f1432k) - this.f1430i) {
                throw new j0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw j0.e();
        }
    }

    public final void I(int i10) {
        int i11 = this.f1428g;
        int i12 = this.f1430i;
        if (i10 <= i11 - i12 && i10 >= 0) {
            this.f1430i = i12 + i10;
            return;
        }
        InputStream inputStream = this.f1426e;
        if (i10 >= 0) {
            int i13 = this.f1432k;
            int i14 = i13 + i12;
            int i15 = i14 + i10;
            int i16 = this.f1433l;
            if (i15 <= i16) {
                this.f1432k = i14;
                int i17 = i11 - i12;
                this.f1428g = 0;
                this.f1430i = 0;
                while (i17 < i10) {
                    long j3 = i10 - i17;
                    try {
                        try {
                            long skip = inputStream.skip(j3);
                            if (skip >= 0 && skip <= j3) {
                                if (skip == 0) {
                                    break;
                                } else {
                                    i17 += (int) skip;
                                }
                            } else {
                                throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                        } catch (j0 e2) {
                            e2.f1379b = true;
                            throw e2;
                        }
                    } catch (Throwable th2) {
                        this.f1432k += i17;
                        G();
                        throw th2;
                    }
                }
                this.f1432k += i17;
                G();
                if (i17 < i10) {
                    int i18 = this.f1428g;
                    int i19 = i18 - this.f1430i;
                    this.f1430i = i18;
                    H(1);
                    while (true) {
                        int i20 = i10 - i19;
                        int i21 = this.f1428g;
                        if (i20 > i21) {
                            i19 += i21;
                            this.f1430i = i21;
                            H(1);
                        } else {
                            this.f1430i = i20;
                            return;
                        }
                    }
                }
            } else {
                I((i16 - i13) - i12);
                throw j0.e();
            }
        } else {
            throw j0.d();
        }
    }

    public final boolean J(int i10) {
        int i11 = this.f1430i;
        int i12 = i11 + i10;
        int i13 = this.f1428g;
        if (i12 > i13) {
            int i14 = this.f1432k;
            int i15 = this.f1442c;
            if (i10 > (i15 - i14) - i11 || i14 + i11 + i10 > this.f1433l) {
                return false;
            }
            byte[] bArr = this.f1427f;
            if (i11 > 0) {
                if (i13 > i11) {
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f1432k += i11;
                this.f1428g -= i11;
                this.f1430i = 0;
            }
            int i16 = this.f1428g;
            int min = Math.min(bArr.length - i16, (i15 - this.f1432k) - i16);
            InputStream inputStream = this.f1426e;
            try {
                int read = inputStream.read(bArr, i16, min);
                if (read != 0 && read >= -1 && read <= bArr.length) {
                    if (read <= 0) {
                        return false;
                    }
                    this.f1428g += read;
                    G();
                    if (this.f1428g >= i10) {
                        return true;
                    }
                    return J(i10);
                }
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            } catch (j0 e2) {
                e2.f1379b = true;
                throw e2;
            }
        }
        throw new IllegalStateException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.i("refillBuffer() called when ", i10, " bytes were already available in buffer"));
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final void a(int i10) {
        if (this.f1431j == i10) {
        } else {
            throw new j0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final int b() {
        return this.f1432k + this.f1430i;
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final boolean c() {
        return this.f1430i == this.f1428g && !J(1);
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final void d(int i10) {
        this.f1433l = i10;
        G();
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final int e(int i10) {
        if (i10 >= 0) {
            int i11 = this.f1432k + this.f1430i + i10;
            int i12 = this.f1433l;
            if (i11 <= i12) {
                this.f1433l = i11;
                G();
                return i12;
            }
            throw j0.e();
        }
        throw j0.d();
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final boolean f() {
        return E() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final j g() {
        int D = D();
        int i10 = this.f1428g;
        int i11 = this.f1430i;
        int i12 = i10 - i11;
        byte[] bArr = this.f1427f;
        if (D <= i12 && D > 0) {
            j c10 = k.c(i11, D, bArr);
            this.f1430i += D;
            return c10;
        }
        if (D == 0) {
            return k.f1389c;
        }
        byte[] z10 = z(D);
        if (z10 != null) {
            return k.c(0, z10.length, z10);
        }
        int i13 = this.f1430i;
        int i14 = this.f1428g;
        int i15 = i14 - i13;
        this.f1432k += i14;
        this.f1430i = 0;
        this.f1428g = 0;
        ArrayList A = A(D - i15);
        byte[] bArr2 = new byte[D];
        System.arraycopy(bArr, i13, bArr2, 0, i15);
        Iterator it = A.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, i15, bArr3.length);
            i15 += bArr3.length;
        }
        j jVar = k.f1389c;
        return new j(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final double h() {
        return Double.longBitsToDouble(C());
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final int i() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final int j() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final long k() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final float l() {
        return Float.intBitsToFloat(B());
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final int m() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final long n() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final int o() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final long p() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final int q() {
        int D = D();
        return (-(D & 1)) ^ (D >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final long r() {
        long E = E();
        return (-(E & 1)) ^ (E >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final String s() {
        int D = D();
        byte[] bArr = this.f1427f;
        if (D > 0) {
            int i10 = this.f1428g;
            int i11 = this.f1430i;
            if (D <= i10 - i11) {
                String str = new String(bArr, i11, D, h0.a);
                this.f1430i += D;
                return str;
            }
        }
        if (D == 0) {
            return "";
        }
        if (D <= this.f1428g) {
            H(D);
            String str2 = new String(bArr, this.f1430i, D, h0.a);
            this.f1430i += D;
            return str2;
        }
        return new String(y(D), h0.a);
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final String t() {
        int D = D();
        int i10 = this.f1430i;
        int i11 = this.f1428g;
        int i12 = i11 - i10;
        byte[] bArr = this.f1427f;
        if (D <= i12 && D > 0) {
            this.f1430i = i10 + D;
        } else {
            if (D == 0) {
                return "";
            }
            i10 = 0;
            if (D <= i11) {
                H(D);
                this.f1430i = D + 0;
            } else {
                bArr = y(D);
            }
        }
        return e2.a.N(bArr, i10, D);
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final int u() {
        if (c()) {
            this.f1431j = 0;
            return 0;
        }
        int D = D();
        this.f1431j = D;
        if ((D >>> 3) != 0) {
            return D;
        }
        throw new j0("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final int v() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final long w() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final boolean x(int i10) {
        int u;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            return false;
                        }
                        if (i11 == 5) {
                            I(4);
                            return true;
                        }
                        int i13 = j0.f1378c;
                        throw new i0();
                    }
                    do {
                        u = u();
                        if (u == 0) {
                            break;
                        }
                    } while (x(u));
                    a(((i10 >>> 3) << 3) | 4);
                    return true;
                }
                I(D());
                return true;
            }
            I(8);
            return true;
        }
        int i14 = this.f1428g - this.f1430i;
        byte[] bArr = this.f1427f;
        if (i14 >= 10) {
            while (i12 < 10) {
                int i15 = this.f1430i;
                this.f1430i = i15 + 1;
                if (bArr[i15] < 0) {
                    i12++;
                }
            }
            throw j0.c();
        }
        while (i12 < 10) {
            if (this.f1430i == this.f1428g) {
                H(1);
            }
            int i16 = this.f1430i;
            this.f1430i = i16 + 1;
            if (bArr[i16] < 0) {
                i12++;
            }
        }
        throw j0.c();
        return true;
    }

    public final byte[] y(int i10) {
        byte[] z10 = z(i10);
        if (z10 != null) {
            return z10;
        }
        int i11 = this.f1430i;
        int i12 = this.f1428g;
        int i13 = i12 - i11;
        this.f1432k += i12;
        this.f1430i = 0;
        this.f1428g = 0;
        ArrayList A = A(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f1427f, i11, bArr, 0, i13);
        Iterator it = A.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
            i13 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] z(int i10) {
        if (i10 == 0) {
            return h0.f1371b;
        }
        if (i10 >= 0) {
            int i11 = this.f1432k;
            int i12 = this.f1430i;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f1442c <= 0) {
                int i14 = this.f1433l;
                if (i13 <= i14) {
                    int i15 = this.f1428g - i12;
                    int i16 = i10 - i15;
                    InputStream inputStream = this.f1426e;
                    if (i16 >= 4096) {
                        try {
                            if (i16 > inputStream.available()) {
                                return null;
                            }
                        } catch (j0 e2) {
                            e2.f1379b = true;
                            throw e2;
                        }
                    }
                    byte[] bArr = new byte[i10];
                    System.arraycopy(this.f1427f, this.f1430i, bArr, 0, i15);
                    this.f1432k += this.f1428g;
                    this.f1430i = 0;
                    this.f1428g = 0;
                    while (i15 < i10) {
                        try {
                            int read = inputStream.read(bArr, i15, i10 - i15);
                            if (read != -1) {
                                this.f1432k += read;
                                i15 += read;
                            } else {
                                throw j0.e();
                            }
                        } catch (j0 e10) {
                            e10.f1379b = true;
                            throw e10;
                        }
                    }
                    return bArr;
                }
                I((i14 - i11) - i12);
                throw j0.e();
            }
            throw new j0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw j0.d();
    }
}
