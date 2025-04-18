package androidx.datastore.preferences.protobuf;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class q extends r {

    /* renamed from: r, reason: collision with root package name */
    public final byte[] f1452r;

    /* renamed from: s, reason: collision with root package name */
    public final int f1453s;

    /* renamed from: t, reason: collision with root package name */
    public int f1454t;
    public final OutputStream u;

    public q(OutputStream outputStream, int i10) {
        if (i10 >= 0) {
            int max = Math.max(i10, 20);
            this.f1452r = new byte[max];
            this.f1453s = max;
            if (outputStream != null) {
                this.u = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final void A0(int i10, int i11) {
        K0(20);
        G0(i10, 0);
        H0(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final void B0(int i10) {
        K0(5);
        H0(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final void C0(int i10, long j3) {
        K0(20);
        G0(i10, 0);
        I0(j3);
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final void D0(long j3) {
        K0(10);
        I0(j3);
    }

    public final void E0(int i10) {
        int i11 = this.f1454t;
        int i12 = i11 + 1;
        byte[] bArr = this.f1452r;
        bArr[i11] = (byte) (i10 & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >> 8) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >> 16) & 255);
        this.f1454t = i14 + 1;
        bArr[i14] = (byte) ((i10 >> 24) & 255);
    }

    public final void F0(long j3) {
        int i10 = this.f1454t;
        int i11 = i10 + 1;
        byte[] bArr = this.f1452r;
        bArr[i10] = (byte) (j3 & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((j3 >> 8) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((j3 >> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (255 & (j3 >> 24));
        int i15 = i14 + 1;
        bArr[i14] = (byte) (((int) (j3 >> 32)) & 255);
        int i16 = i15 + 1;
        bArr[i15] = (byte) (((int) (j3 >> 40)) & 255);
        int i17 = i16 + 1;
        bArr[i16] = (byte) (((int) (j3 >> 48)) & 255);
        this.f1454t = i17 + 1;
        bArr[i17] = (byte) (((int) (j3 >> 56)) & 255);
    }

    public final void G0(int i10, int i11) {
        H0((i10 << 3) | i11);
    }

    public final void H0(int i10) {
        boolean z10 = r.f1460q;
        byte[] bArr = this.f1452r;
        if (z10) {
            while ((i10 & (-128)) != 0) {
                int i11 = this.f1454t;
                this.f1454t = i11 + 1;
                b2.q(bArr, i11, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            int i12 = this.f1454t;
            this.f1454t = i12 + 1;
            b2.q(bArr, i12, (byte) i10);
            return;
        }
        while ((i10 & (-128)) != 0) {
            int i13 = this.f1454t;
            this.f1454t = i13 + 1;
            bArr[i13] = (byte) ((i10 & 127) | 128);
            i10 >>>= 7;
        }
        int i14 = this.f1454t;
        this.f1454t = i14 + 1;
        bArr[i14] = (byte) i10;
    }

    public final void I0(long j3) {
        boolean z10 = r.f1460q;
        byte[] bArr = this.f1452r;
        if (z10) {
            while ((j3 & (-128)) != 0) {
                int i10 = this.f1454t;
                this.f1454t = i10 + 1;
                b2.q(bArr, i10, (byte) ((((int) j3) & 127) | 128));
                j3 >>>= 7;
            }
            int i11 = this.f1454t;
            this.f1454t = i11 + 1;
            b2.q(bArr, i11, (byte) j3);
            return;
        }
        while ((j3 & (-128)) != 0) {
            int i12 = this.f1454t;
            this.f1454t = i12 + 1;
            bArr[i12] = (byte) ((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        int i13 = this.f1454t;
        this.f1454t = i13 + 1;
        bArr[i13] = (byte) j3;
    }

    public final void J0() {
        this.u.write(this.f1452r, 0, this.f1454t);
        this.f1454t = 0;
    }

    public final void K0(int i10) {
        if (this.f1453s - this.f1454t < i10) {
            J0();
        }
    }

    @Override // com.bumptech.glide.d
    public final void L(byte[] bArr, int i10, int i11) {
        L0(bArr, i10, i11);
    }

    public final void L0(byte[] bArr, int i10, int i11) {
        int i12 = this.f1454t;
        int i13 = this.f1453s;
        int i14 = i13 - i12;
        byte[] bArr2 = this.f1452r;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f1454t += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f1454t = i13;
        J0();
        if (i16 <= i13) {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.f1454t = i16;
        } else {
            this.u.write(bArr, i15, i16);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final void k0(byte b3) {
        if (this.f1454t == this.f1453s) {
            J0();
        }
        int i10 = this.f1454t;
        this.f1454t = i10 + 1;
        this.f1452r[i10] = b3;
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final void l0(int i10, boolean z10) {
        K0(11);
        G0(i10, 0);
        byte b3 = z10 ? (byte) 1 : (byte) 0;
        int i11 = this.f1454t;
        this.f1454t = i11 + 1;
        this.f1452r[i11] = b3;
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final void m0(byte[] bArr, int i10) {
        B0(i10);
        L0(bArr, 0, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final void n0(int i10, k kVar) {
        z0(i10, 2);
        o0(kVar);
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final void o0(k kVar) {
        B0(kVar.size());
        j jVar = (j) kVar;
        L(jVar.f1377f, jVar.g(), jVar.size());
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final void p0(int i10, int i11) {
        K0(14);
        G0(i10, 5);
        E0(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final void q0(int i10) {
        K0(4);
        E0(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final void r0(int i10, long j3) {
        K0(18);
        G0(i10, 1);
        F0(j3);
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final void s0(long j3) {
        K0(8);
        F0(j3);
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final void t0(int i10, int i11) {
        K0(20);
        G0(i10, 0);
        if (i11 >= 0) {
            H0(i11);
        } else {
            I0(i11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final void u0(int i10) {
        if (i10 >= 0) {
            B0(i10);
        } else {
            D0(i10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final void v0(int i10, b bVar, k1 k1Var) {
        z0(i10, 2);
        B0(bVar.a(k1Var));
        k1Var.a(bVar, this.f1461o);
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final void w0(b bVar) {
        B0(((e0) bVar).a(null));
        bVar.b(this);
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final void x0(int i10, String str) {
        z0(i10, 2);
        y0(str);
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final void y0(String str) {
        try {
            int length = str.length() * 3;
            int g02 = r.g0(length);
            int i10 = g02 + length;
            int i11 = this.f1453s;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int O = e2.a.O(str, bArr, 0, length);
                B0(O);
                L0(bArr, 0, O);
                return;
            }
            if (i10 > i11 - this.f1454t) {
                J0();
            }
            int g03 = r.g0(str.length());
            int i12 = this.f1454t;
            byte[] bArr2 = this.f1452r;
            try {
                if (g03 == g02) {
                    int i13 = i12 + g03;
                    this.f1454t = i13;
                    int O2 = e2.a.O(str, bArr2, i13, i11 - i13);
                    this.f1454t = i12;
                    H0((O2 - i12) - g03);
                    this.f1454t = O2;
                } else {
                    int b3 = e2.b(str);
                    H0(b3);
                    this.f1454t = e2.a.O(str, bArr2, this.f1454t, b3);
                }
            } catch (d2 e2) {
                this.f1454t = i12;
                throw e2;
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new p(e10);
            }
        } catch (d2 e11) {
            j0(str, e11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final void z0(int i10, int i11) {
        B0((i10 << 3) | i11);
    }
}
