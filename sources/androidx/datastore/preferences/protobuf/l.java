package androidx.datastore.preferences.protobuf;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes.dex */
public final class l extends n {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f1415e;

    /* renamed from: f, reason: collision with root package name */
    public int f1416f;

    /* renamed from: g, reason: collision with root package name */
    public int f1417g;

    /* renamed from: h, reason: collision with root package name */
    public int f1418h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1419i;

    /* renamed from: j, reason: collision with root package name */
    public int f1420j;

    /* renamed from: k, reason: collision with root package name */
    public int f1421k = Integer.MAX_VALUE;

    public l(byte[] bArr, int i10, int i11, boolean z10) {
        this.f1415e = bArr;
        this.f1416f = i11 + i10;
        this.f1418h = i10;
        this.f1419i = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (r3[r2] < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A() {
        /*
            r5 = this;
            int r0 = r5.f1418h
            int r1 = r5.f1416f
            if (r1 != r0) goto L7
            goto L6a
        L7:
            int r2 = r0 + 1
            byte[] r3 = r5.f1415e
            r0 = r3[r0]
            if (r0 < 0) goto L12
            r5.f1418h = r2
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
            long r0 = r5.C()
            int r0 = (int) r0
            return r0
        L70:
            r5.f1418h = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.l.A():int");
    }

    public final long B() {
        long j3;
        long j10;
        long j11;
        int i10;
        int i11 = this.f1418h;
        int i12 = this.f1416f;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f1415e;
            byte b3 = bArr[i11];
            if (b3 >= 0) {
                this.f1418h = i13;
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
                            this.f1418h = i14;
                            return j10;
                        }
                    }
                    i14 = i16;
                    j10 = j3;
                    this.f1418h = i14;
                    return j10;
                }
                j10 = i10;
                this.f1418h = i14;
                return j10;
            }
        }
        return C();
    }

    public final long C() {
        long j3 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.f1418h;
            if (i11 != this.f1416f) {
                this.f1418h = i11 + 1;
                j3 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((this.f1415e[i11] & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j3;
                }
            } else {
                throw j0.e();
            }
        }
        throw j0.c();
    }

    public final void D(int i10) {
        if (i10 >= 0) {
            int i11 = this.f1416f;
            int i12 = this.f1418h;
            if (i10 <= i11 - i12) {
                this.f1418h = i12 + i10;
                return;
            }
        }
        if (i10 < 0) {
            throw j0.d();
        }
        throw j0.e();
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final void a(int i10) {
        if (this.f1420j == i10) {
        } else {
            throw new j0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final int b() {
        return this.f1418h - this.f1419i;
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final boolean c() {
        return this.f1418h == this.f1416f;
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final void d(int i10) {
        this.f1421k = i10;
        int i11 = this.f1416f + this.f1417g;
        this.f1416f = i11;
        int i12 = i11 - this.f1419i;
        if (i12 > i10) {
            int i13 = i12 - i10;
            this.f1417g = i13;
            this.f1416f = i11 - i13;
            return;
        }
        this.f1417g = 0;
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final int e(int i10) {
        if (i10 >= 0) {
            int i11 = this.f1418h;
            int i12 = this.f1419i;
            int i13 = (i11 - i12) + i10;
            if (i13 >= 0) {
                int i14 = this.f1421k;
                if (i13 <= i14) {
                    this.f1421k = i13;
                    int i15 = this.f1416f + this.f1417g;
                    this.f1416f = i15;
                    int i16 = i15 - i12;
                    if (i16 > i13) {
                        int i17 = i16 - i13;
                        this.f1417g = i17;
                        this.f1416f = i15 - i17;
                    } else {
                        this.f1417g = 0;
                    }
                    return i14;
                }
                throw j0.e();
            }
            throw new j0("Failed to parse the message.");
        }
        throw j0.d();
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final boolean f() {
        return B() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final j g() {
        byte[] bArr;
        int A = A();
        byte[] bArr2 = this.f1415e;
        if (A > 0) {
            int i10 = this.f1416f;
            int i11 = this.f1418h;
            if (A <= i10 - i11) {
                j c10 = k.c(i11, A, bArr2);
                this.f1418h += A;
                return c10;
            }
        }
        if (A == 0) {
            return k.f1389c;
        }
        if (A > 0) {
            int i12 = this.f1416f;
            int i13 = this.f1418h;
            if (A <= i12 - i13) {
                int i14 = A + i13;
                this.f1418h = i14;
                bArr = Arrays.copyOfRange(bArr2, i13, i14);
                j jVar = k.f1389c;
                return new j(bArr);
            }
        }
        if (A <= 0) {
            if (A == 0) {
                bArr = h0.f1371b;
                j jVar2 = k.f1389c;
                return new j(bArr);
            }
            throw j0.d();
        }
        throw j0.e();
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final double h() {
        return Double.longBitsToDouble(z());
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final int i() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final int j() {
        return y();
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final long k() {
        return z();
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final float l() {
        return Float.intBitsToFloat(y());
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final int m() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final long n() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final int o() {
        return y();
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final long p() {
        return z();
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final int q() {
        int A = A();
        return (-(A & 1)) ^ (A >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final long r() {
        long B = B();
        return (-(B & 1)) ^ (B >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final String s() {
        int A = A();
        if (A > 0) {
            int i10 = this.f1416f;
            int i11 = this.f1418h;
            if (A <= i10 - i11) {
                String str = new String(this.f1415e, i11, A, h0.a);
                this.f1418h += A;
                return str;
            }
        }
        if (A == 0) {
            return "";
        }
        if (A < 0) {
            throw j0.d();
        }
        throw j0.e();
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final String t() {
        int A = A();
        if (A > 0) {
            int i10 = this.f1416f;
            int i11 = this.f1418h;
            if (A <= i10 - i11) {
                String N = e2.a.N(this.f1415e, i11, A);
                this.f1418h += A;
                return N;
            }
        }
        if (A == 0) {
            return "";
        }
        if (A <= 0) {
            throw j0.d();
        }
        throw j0.e();
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final int u() {
        if (c()) {
            this.f1420j = 0;
            return 0;
        }
        int A = A();
        this.f1420j = A;
        if ((A >>> 3) != 0) {
            return A;
        }
        throw new j0("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final int v() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final long w() {
        return B();
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
                            D(4);
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
                D(A());
                return true;
            }
            D(8);
            return true;
        }
        int i14 = this.f1416f - this.f1418h;
        byte[] bArr = this.f1415e;
        if (i14 >= 10) {
            while (i12 < 10) {
                int i15 = this.f1418h;
                this.f1418h = i15 + 1;
                if (bArr[i15] < 0) {
                    i12++;
                }
            }
            throw j0.c();
        }
        while (i12 < 10) {
            int i16 = this.f1418h;
            if (i16 != this.f1416f) {
                this.f1418h = i16 + 1;
                if (bArr[i16] < 0) {
                    i12++;
                }
            } else {
                throw j0.e();
            }
        }
        throw j0.c();
        return true;
    }

    public final int y() {
        int i10 = this.f1418h;
        if (this.f1416f - i10 >= 4) {
            this.f1418h = i10 + 4;
            byte[] bArr = this.f1415e;
            return ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
        }
        throw j0.e();
    }

    public final long z() {
        int i10 = this.f1418h;
        if (this.f1416f - i10 >= 8) {
            this.f1418h = i10 + 8;
            byte[] bArr = this.f1415e;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }
        throw j0.e();
    }
}
