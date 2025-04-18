package androidx.datastore.preferences.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class r extends com.bumptech.glide.d {

    /* renamed from: p, reason: collision with root package name */
    public static final Logger f1459p = Logger.getLogger(r.class.getName());

    /* renamed from: q, reason: collision with root package name */
    public static final boolean f1460q = b2.f1350e;

    /* renamed from: o, reason: collision with root package name */
    public fb.c f1461o;

    public static int N(int i10) {
        return e0(i10) + 1;
    }

    public static int O(int i10, k kVar) {
        int e02 = e0(i10);
        int size = kVar.size();
        return g0(size) + size + e02;
    }

    public static int P(int i10) {
        return e0(i10) + 8;
    }

    public static int Q(int i10, int i11) {
        return W(i11) + e0(i10);
    }

    public static int R(int i10) {
        return e0(i10) + 4;
    }

    public static int S(int i10) {
        return e0(i10) + 8;
    }

    public static int T(int i10) {
        return e0(i10) + 4;
    }

    public static int U(int i10, b bVar, k1 k1Var) {
        return bVar.a(k1Var) + (e0(i10) * 2);
    }

    public static int V(int i10, int i11) {
        return W(i11) + e0(i10);
    }

    public static int W(int i10) {
        if (i10 >= 0) {
            return g0(i10);
        }
        return 10;
    }

    public static int X(int i10, long j3) {
        return i0(j3) + e0(i10);
    }

    public static int Y(int i10) {
        return e0(i10) + 4;
    }

    public static int Z(int i10) {
        return e0(i10) + 8;
    }

    public static int a0(int i10, int i11) {
        return g0((i11 >> 31) ^ (i11 << 1)) + e0(i10);
    }

    public static int b0(int i10, long j3) {
        return i0((j3 >> 63) ^ (j3 << 1)) + e0(i10);
    }

    public static int c0(int i10, String str) {
        return d0(str) + e0(i10);
    }

    public static int d0(String str) {
        int length;
        try {
            length = e2.b(str);
        } catch (d2 unused) {
            length = str.getBytes(h0.a).length;
        }
        return g0(length) + length;
    }

    public static int e0(int i10) {
        return g0((i10 << 3) | 0);
    }

    public static int f0(int i10, int i11) {
        return g0(i11) + e0(i10);
    }

    public static int g0(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int h0(int i10, long j3) {
        return i0(j3) + e0(i10);
    }

    public static int i0(long j3) {
        int i10;
        if (((-128) & j3) == 0) {
            return 1;
        }
        if (j3 < 0) {
            return 10;
        }
        if (((-34359738368L) & j3) != 0) {
            j3 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j3) != 0) {
            i10 += 2;
            j3 >>>= 14;
        }
        return (j3 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public abstract void A0(int i10, int i11);

    public abstract void B0(int i10);

    public abstract void C0(int i10, long j3);

    public abstract void D0(long j3);

    public final void j0(String str, d2 d2Var) {
        f1459p.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) d2Var);
        byte[] bytes = str.getBytes(h0.a);
        try {
            B0(bytes.length);
            L(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new p(e2);
        }
    }

    public abstract void k0(byte b3);

    public abstract void l0(int i10, boolean z10);

    public abstract void m0(byte[] bArr, int i10);

    public abstract void n0(int i10, k kVar);

    public abstract void o0(k kVar);

    public abstract void p0(int i10, int i11);

    public abstract void q0(int i10);

    public abstract void r0(int i10, long j3);

    public abstract void s0(long j3);

    public abstract void t0(int i10, int i11);

    public abstract void u0(int i10);

    public abstract void v0(int i10, b bVar, k1 k1Var);

    public abstract void w0(b bVar);

    public abstract void x0(int i10, String str);

    public abstract void y0(String str);

    public abstract void z0(int i10, int i11);
}
