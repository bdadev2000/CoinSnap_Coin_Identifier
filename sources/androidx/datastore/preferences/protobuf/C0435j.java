package androidx.datastore.preferences.protobuf;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0435j extends P {

    /* renamed from: h, reason: collision with root package name */
    public static final Logger f4581h = Logger.getLogger(C0435j.class.getName());

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f4582i = r0.f4602f;

    /* renamed from: c, reason: collision with root package name */
    public J f4583c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f4584d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4585e;

    /* renamed from: f, reason: collision with root package name */
    public int f4586f;

    /* renamed from: g, reason: collision with root package name */
    public final OutputStream f4587g;

    public C0435j(e0.p pVar, int i9) {
        if (i9 >= 0) {
            int max = Math.max(i9, 20);
            this.f4584d = new byte[max];
            this.f4585e = max;
            this.f4587g = pVar;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    public static int A(int i9, AbstractC0425a abstractC0425a, InterfaceC0426a0 interfaceC0426a0) {
        return abstractC0425a.b(interfaceC0426a0) + (K(i9) * 2);
    }

    public static int B(int i9, int i10) {
        return C(i10) + K(i9);
    }

    public static int C(int i9) {
        if (i9 >= 0) {
            return M(i9);
        }
        return 10;
    }

    public static int D(int i9, long j7) {
        return O(j7) + K(i9);
    }

    public static int E(int i9) {
        return K(i9) + 4;
    }

    public static int F(int i9) {
        return K(i9) + 8;
    }

    public static int G(int i9, int i10) {
        return M((i10 >> 31) ^ (i10 << 1)) + K(i9);
    }

    public static int H(int i9, long j7) {
        return O((j7 >> 63) ^ (j7 << 1)) + K(i9);
    }

    public static int I(int i9, String str) {
        return J(str) + K(i9);
    }

    public static int J(String str) {
        int length;
        try {
            length = u0.b(str);
        } catch (t0 unused) {
            length = str.getBytes(AbstractC0449y.f4610a).length;
        }
        return M(length) + length;
    }

    public static int K(int i9) {
        return M(i9 << 3);
    }

    public static int L(int i9, int i10) {
        return M(i10) + K(i9);
    }

    public static int M(int i9) {
        if ((i9 & (-128)) == 0) {
            return 1;
        }
        if ((i9 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i9) == 0) {
            return 3;
        }
        if ((i9 & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static int N(int i9, long j7) {
        return O(j7) + K(i9);
    }

    public static int O(long j7) {
        int i9;
        if (((-128) & j7) == 0) {
            return 1;
        }
        if (j7 < 0) {
            return 10;
        }
        if (((-34359738368L) & j7) != 0) {
            j7 >>>= 28;
            i9 = 6;
        } else {
            i9 = 2;
        }
        if (((-2097152) & j7) != 0) {
            i9 += 2;
            j7 >>>= 14;
        }
        if ((j7 & (-16384)) != 0) {
            return i9 + 1;
        }
        return i9;
    }

    public static int s(int i9) {
        return K(i9) + 1;
    }

    public static int t(int i9, C0432g c0432g) {
        return u(c0432g) + K(i9);
    }

    public static int u(C0432g c0432g) {
        int size = c0432g.size();
        return M(size) + size;
    }

    public static int v(int i9) {
        return K(i9) + 8;
    }

    public static int w(int i9, int i10) {
        return C(i10) + K(i9);
    }

    public static int x(int i9) {
        return K(i9) + 4;
    }

    public static int y(int i9) {
        return K(i9) + 8;
    }

    public static int z(int i9) {
        return K(i9) + 4;
    }

    public final void P() {
        this.f4587g.write(this.f4584d, 0, this.f4586f);
        this.f4586f = 0;
    }

    public final void Q(int i9) {
        if (this.f4585e - this.f4586f < i9) {
            P();
        }
    }

    public final void R(String str, t0 t0Var) {
        f4581h.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) t0Var);
        byte[] bytes = str.getBytes(AbstractC0449y.f4610a);
        try {
            k0(bytes.length);
            m(bytes, 0, bytes.length);
        } catch (C0434i e4) {
            throw e4;
        } catch (IndexOutOfBoundsException e9) {
            throw new C0434i(e9);
        }
    }

    public final void S(byte b) {
        if (this.f4586f == this.f4585e) {
            P();
        }
        int i9 = this.f4586f;
        this.f4586f = i9 + 1;
        this.f4584d[i9] = b;
    }

    public final void T(byte[] bArr, int i9, int i10) {
        int i11 = this.f4586f;
        int i12 = this.f4585e;
        int i13 = i12 - i11;
        byte[] bArr2 = this.f4584d;
        if (i13 >= i10) {
            System.arraycopy(bArr, i9, bArr2, i11, i10);
            this.f4586f += i10;
            return;
        }
        System.arraycopy(bArr, i9, bArr2, i11, i13);
        int i14 = i9 + i13;
        int i15 = i10 - i13;
        this.f4586f = i12;
        P();
        if (i15 <= i12) {
            System.arraycopy(bArr, i14, bArr2, 0, i15);
            this.f4586f = i15;
        } else {
            this.f4587g.write(bArr, i14, i15);
        }
    }

    public final void U(int i9, boolean z8) {
        Q(11);
        p(i9, 0);
        byte b = z8 ? (byte) 1 : (byte) 0;
        int i10 = this.f4586f;
        this.f4586f = i10 + 1;
        this.f4584d[i10] = b;
    }

    public final void V(int i9, byte[] bArr) {
        k0(i9);
        T(bArr, 0, i9);
    }

    public final void W(int i9, C0432g c0432g) {
        i0(i9, 2);
        X(c0432g);
    }

    public final void X(C0432g c0432g) {
        k0(c0432g.size());
        m(c0432g.f4562c, c0432g.d(), c0432g.size());
    }

    public final void Y(int i9, int i10) {
        Q(14);
        p(i9, 5);
        n(i10);
    }

    public final void Z(int i9) {
        Q(4);
        n(i9);
    }

    public final void a0(int i9, long j7) {
        Q(18);
        p(i9, 1);
        o(j7);
    }

    public final void b0(long j7) {
        Q(8);
        o(j7);
    }

    public final void c0(int i9, int i10) {
        Q(20);
        p(i9, 0);
        if (i10 >= 0) {
            q(i10);
        } else {
            r(i10);
        }
    }

    public final void d0(int i9) {
        if (i9 >= 0) {
            k0(i9);
        } else {
            m0(i9);
        }
    }

    public final void e0(int i9, AbstractC0425a abstractC0425a, InterfaceC0426a0 interfaceC0426a0) {
        i0(i9, 2);
        k0(abstractC0425a.b(interfaceC0426a0));
        interfaceC0426a0.a(abstractC0425a, this.f4583c);
    }

    public final void f0(AbstractC0425a abstractC0425a) {
        k0(abstractC0425a.a());
        abstractC0425a.c(this);
    }

    public final void g0(int i9, String str) {
        i0(i9, 2);
        h0(str);
    }

    public final void h0(String str) {
        try {
            int length = str.length() * 3;
            int M8 = M(length);
            int i9 = M8 + length;
            int i10 = this.f4585e;
            if (i9 > i10) {
                byte[] bArr = new byte[length];
                int g9 = u0.f4609a.g(str, bArr, 0, length);
                k0(g9);
                T(bArr, 0, g9);
                return;
            }
            if (i9 > i10 - this.f4586f) {
                P();
            }
            int M9 = M(str.length());
            int i11 = this.f4586f;
            byte[] bArr2 = this.f4584d;
            try {
                try {
                    if (M9 == M8) {
                        int i12 = i11 + M9;
                        this.f4586f = i12;
                        int g10 = u0.f4609a.g(str, bArr2, i12, i10 - i12);
                        this.f4586f = i11;
                        q((g10 - i11) - M9);
                        this.f4586f = g10;
                    } else {
                        int b = u0.b(str);
                        q(b);
                        this.f4586f = u0.f4609a.g(str, bArr2, this.f4586f, b);
                    }
                } catch (ArrayIndexOutOfBoundsException e4) {
                    throw new C0434i(e4);
                }
            } catch (t0 e9) {
                this.f4586f = i11;
                throw e9;
            }
        } catch (t0 e10) {
            R(str, e10);
        }
    }

    public final void i0(int i9, int i10) {
        k0((i9 << 3) | i10);
    }

    public final void j0(int i9, int i10) {
        Q(20);
        p(i9, 0);
        q(i10);
    }

    public final void k0(int i9) {
        Q(5);
        q(i9);
    }

    public final void l0(int i9, long j7) {
        Q(20);
        p(i9, 0);
        r(j7);
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public final void m(byte[] bArr, int i9, int i10) {
        T(bArr, i9, i10);
    }

    public final void m0(long j7) {
        Q(10);
        r(j7);
    }

    public final void n(int i9) {
        int i10 = this.f4586f;
        int i11 = i10 + 1;
        this.f4586f = i11;
        byte[] bArr = this.f4584d;
        bArr[i10] = (byte) (i9 & 255);
        int i12 = i10 + 2;
        this.f4586f = i12;
        bArr[i11] = (byte) ((i9 >> 8) & 255);
        int i13 = i10 + 3;
        this.f4586f = i13;
        bArr[i12] = (byte) ((i9 >> 16) & 255);
        this.f4586f = i10 + 4;
        bArr[i13] = (byte) ((i9 >> 24) & 255);
    }

    public final void o(long j7) {
        int i9 = this.f4586f;
        int i10 = i9 + 1;
        this.f4586f = i10;
        byte[] bArr = this.f4584d;
        bArr[i9] = (byte) (j7 & 255);
        int i11 = i9 + 2;
        this.f4586f = i11;
        bArr[i10] = (byte) ((j7 >> 8) & 255);
        int i12 = i9 + 3;
        this.f4586f = i12;
        bArr[i11] = (byte) ((j7 >> 16) & 255);
        int i13 = i9 + 4;
        this.f4586f = i13;
        bArr[i12] = (byte) (255 & (j7 >> 24));
        int i14 = i9 + 5;
        this.f4586f = i14;
        bArr[i13] = (byte) (((int) (j7 >> 32)) & 255);
        int i15 = i9 + 6;
        this.f4586f = i15;
        bArr[i14] = (byte) (((int) (j7 >> 40)) & 255);
        int i16 = i9 + 7;
        this.f4586f = i16;
        bArr[i15] = (byte) (((int) (j7 >> 48)) & 255);
        this.f4586f = i9 + 8;
        bArr[i16] = (byte) (((int) (j7 >> 56)) & 255);
    }

    public final void p(int i9, int i10) {
        q((i9 << 3) | i10);
    }

    public final void q(int i9) {
        boolean z8 = f4582i;
        byte[] bArr = this.f4584d;
        if (z8) {
            while ((i9 & (-128)) != 0) {
                int i10 = this.f4586f;
                this.f4586f = i10 + 1;
                r0.m(bArr, i10, (byte) ((i9 & 127) | 128));
                i9 >>>= 7;
            }
            int i11 = this.f4586f;
            this.f4586f = i11 + 1;
            r0.m(bArr, i11, (byte) i9);
            return;
        }
        while ((i9 & (-128)) != 0) {
            int i12 = this.f4586f;
            this.f4586f = i12 + 1;
            bArr[i12] = (byte) ((i9 & 127) | 128);
            i9 >>>= 7;
        }
        int i13 = this.f4586f;
        this.f4586f = i13 + 1;
        bArr[i13] = (byte) i9;
    }

    public final void r(long j7) {
        boolean z8 = f4582i;
        byte[] bArr = this.f4584d;
        if (z8) {
            while ((j7 & (-128)) != 0) {
                int i9 = this.f4586f;
                this.f4586f = i9 + 1;
                r0.m(bArr, i9, (byte) ((((int) j7) & 127) | 128));
                j7 >>>= 7;
            }
            int i10 = this.f4586f;
            this.f4586f = i10 + 1;
            r0.m(bArr, i10, (byte) j7);
            return;
        }
        while ((j7 & (-128)) != 0) {
            int i11 = this.f4586f;
            this.f4586f = i11 + 1;
            bArr[i11] = (byte) ((((int) j7) & 127) | 128);
            j7 >>>= 7;
        }
        int i12 = this.f4586f;
        this.f4586f = i12 + 1;
        bArr[i12] = (byte) j7;
    }
}
