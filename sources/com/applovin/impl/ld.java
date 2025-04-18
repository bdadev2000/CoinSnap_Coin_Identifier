package com.applovin.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.applovin.impl.g1;
import com.applovin.impl.hd;
import com.applovin.impl.nd;
import com.applovin.impl.p5;
import com.applovin.impl.z6;
import com.facebook.ads.AdError;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class ld extends e2 {
    private static final byte[] I0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private final long[] A;
    private boolean A0;
    private f9 B;
    private boolean B0;
    private f9 C;
    private boolean C0;
    private z6 D;
    private a8 D0;
    private z6 E;
    protected n5 E0;
    private MediaCrypto F;
    private long F0;
    private boolean G;
    private long G0;
    private long H;
    private int H0;
    private float I;
    private float J;
    private hd K;
    private f9 L;
    private MediaFormat M;
    private boolean N;
    private float O;
    private ArrayDeque P;
    private a Q;
    private kd R;
    private int S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f25035a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f25036b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f25037c0;

    /* renamed from: d0, reason: collision with root package name */
    private s2 f25038d0;

    /* renamed from: e0, reason: collision with root package name */
    private long f25039e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f25040f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f25041g0;

    /* renamed from: h0, reason: collision with root package name */
    private ByteBuffer f25042h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f25043i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f25044j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f25045k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f25046l0;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f25047m0;

    /* renamed from: n, reason: collision with root package name */
    private final hd.b f25048n;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f25049n0;

    /* renamed from: o, reason: collision with root package name */
    private final md f25050o;

    /* renamed from: o0, reason: collision with root package name */
    private int f25051o0;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f25052p;

    /* renamed from: p0, reason: collision with root package name */
    private int f25053p0;

    /* renamed from: q, reason: collision with root package name */
    private final float f25054q;

    /* renamed from: q0, reason: collision with root package name */
    private int f25055q0;

    /* renamed from: r, reason: collision with root package name */
    private final p5 f25056r;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f25057r0;

    /* renamed from: s, reason: collision with root package name */
    private final p5 f25058s;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f25059s0;

    /* renamed from: t, reason: collision with root package name */
    private final p5 f25060t;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f25061t0;

    /* renamed from: u, reason: collision with root package name */
    private final g2 f25062u;

    /* renamed from: u0, reason: collision with root package name */
    private long f25063u0;

    /* renamed from: v, reason: collision with root package name */
    private final eo f25064v;

    /* renamed from: v0, reason: collision with root package name */
    private long f25065v0;
    private final ArrayList w;

    /* renamed from: w0, reason: collision with root package name */
    private boolean f25066w0;
    private final MediaCodec.BufferInfo x;

    /* renamed from: x0, reason: collision with root package name */
    private boolean f25067x0;

    /* renamed from: y, reason: collision with root package name */
    private final long[] f25068y;

    /* renamed from: y0, reason: collision with root package name */
    private boolean f25069y0;

    /* renamed from: z, reason: collision with root package name */
    private final long[] f25070z;

    /* renamed from: z0, reason: collision with root package name */
    private boolean f25071z0;

    /* loaded from: classes.dex */
    public static class a extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final String f25072a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f25073b;

        /* renamed from: c, reason: collision with root package name */
        public final kd f25074c;
        public final String d;

        /* renamed from: f, reason: collision with root package name */
        public final a f25075f;

        public a(f9 f9Var, Throwable th, boolean z2, int i2) {
            this("Decoder init failed: [" + i2 + "], " + f9Var, th, f9Var.f23840m, z2, null, a(i2), null);
        }

        private static String a(int i2) {
            return "com.applovin.exoplayer2.mediacodec.MediaCodecRenderer_" + (i2 < 0 ? "neg_" : "") + Math.abs(i2);
        }

        public a(f9 f9Var, Throwable th, boolean z2, kd kdVar) {
            this("Decoder init failed: " + kdVar.f24873a + ", " + f9Var, th, f9Var.f23840m, z2, kdVar, xp.f27962a >= 21 ? a(th) : null, null);
        }

        private static String a(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a a(a aVar) {
            return new a(getMessage(), getCause(), this.f25072a, this.f25073b, this.f25074c, this.d, aVar);
        }

        private a(String str, Throwable th, String str2, boolean z2, kd kdVar, String str3, a aVar) {
            super(str, th);
            this.f25072a = str2;
            this.f25073b = z2;
            this.f25074c = kdVar;
            this.d = str3;
            this.f25075f = aVar;
        }
    }

    public ld(int i2, hd.b bVar, md mdVar, boolean z2, float f2) {
        super(i2);
        this.f25048n = bVar;
        this.f25050o = (md) b1.a(mdVar);
        this.f25052p = z2;
        this.f25054q = f2;
        this.f25056r = p5.i();
        this.f25058s = new p5(0);
        this.f25060t = new p5(2);
        g2 g2Var = new g2();
        this.f25062u = g2Var;
        this.f25064v = new eo();
        this.w = new ArrayList();
        this.x = new MediaCodec.BufferInfo();
        this.I = 1.0f;
        this.J = 1.0f;
        this.H = -9223372036854775807L;
        this.f25068y = new long[10];
        this.f25070z = new long[10];
        this.A = new long[10];
        this.F0 = -9223372036854775807L;
        this.G0 = -9223372036854775807L;
        g2Var.g(0);
        g2Var.f25963c.order(ByteOrder.nativeOrder());
        this.O = -1.0f;
        this.S = 0;
        this.f25051o0 = 0;
        this.f25040f0 = -1;
        this.f25041g0 = -1;
        this.f25039e0 = -9223372036854775807L;
        this.f25063u0 = -9223372036854775807L;
        this.f25065v0 = -9223372036854775807L;
        this.f25053p0 = 0;
        this.f25055q0 = 0;
    }

    private void A() {
        this.f25047m0 = false;
        this.f25062u.b();
        this.f25060t.b();
        this.f25046l0 = false;
        this.f25045k0 = false;
    }

    private boolean B() {
        if (this.f25057r0) {
            this.f25053p0 = 1;
            if (this.U || this.W) {
                this.f25055q0 = 3;
                return false;
            }
            this.f25055q0 = 1;
        }
        return true;
    }

    private void C() {
        if (!this.f25057r0) {
            T();
        } else {
            this.f25053p0 = 1;
            this.f25055q0 = 3;
        }
    }

    private boolean D() {
        if (this.f25057r0) {
            this.f25053p0 = 1;
            if (this.U || this.W) {
                this.f25055q0 = 3;
                return false;
            }
            this.f25055q0 = 2;
        } else {
            b0();
        }
        return true;
    }

    private boolean E() {
        hd hdVar = this.K;
        if (hdVar == null || this.f25053p0 == 2 || this.f25066w0) {
            return false;
        }
        if (this.f25040f0 < 0) {
            int d = hdVar.d();
            this.f25040f0 = d;
            if (d < 0) {
                return false;
            }
            this.f25058s.f25963c = this.K.a(d);
            this.f25058s.b();
        }
        if (this.f25053p0 == 1) {
            if (!this.f25037c0) {
                this.f25059s0 = true;
                this.K.a(this.f25040f0, 0, 0, 0L, 4);
                Y();
            }
            this.f25053p0 = 2;
            return false;
        }
        if (this.f25035a0) {
            this.f25035a0 = false;
            ByteBuffer byteBuffer = this.f25058s.f25963c;
            byte[] bArr = I0;
            byteBuffer.put(bArr);
            this.K.a(this.f25040f0, 0, bArr.length, 0L, 0);
            Y();
            this.f25057r0 = true;
            return true;
        }
        if (this.f25051o0 == 1) {
            for (int i2 = 0; i2 < this.L.f23842o.size(); i2++) {
                this.f25058s.f25963c.put((byte[]) this.L.f23842o.get(i2));
            }
            this.f25051o0 = 2;
        }
        int position = this.f25058s.f25963c.position();
        g9 r2 = r();
        try {
            int a2 = a(r2, this.f25058s, 0);
            if (j()) {
                this.f25065v0 = this.f25063u0;
            }
            if (a2 == -3) {
                return false;
            }
            if (a2 == -5) {
                if (this.f25051o0 == 2) {
                    this.f25058s.b();
                    this.f25051o0 = 1;
                }
                a(r2);
                return true;
            }
            if (this.f25058s.e()) {
                if (this.f25051o0 == 2) {
                    this.f25058s.b();
                    this.f25051o0 = 1;
                }
                this.f25066w0 = true;
                if (!this.f25057r0) {
                    R();
                    return false;
                }
                try {
                    if (!this.f25037c0) {
                        this.f25059s0 = true;
                        this.K.a(this.f25040f0, 0, 0, 0L, 4);
                        Y();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw a(e, this.B, t2.a(e.getErrorCode()));
                }
            }
            if (!this.f25057r0 && !this.f25058s.f()) {
                this.f25058s.b();
                if (this.f25051o0 == 2) {
                    this.f25051o0 = 1;
                }
                return true;
            }
            boolean h2 = this.f25058s.h();
            if (h2) {
                this.f25058s.f25962b.a(position);
            }
            if (this.T && !h2) {
                zf.a(this.f25058s.f25963c);
                if (this.f25058s.f25963c.position() == 0) {
                    return true;
                }
                this.T = false;
            }
            p5 p5Var = this.f25058s;
            long j2 = p5Var.f25964f;
            s2 s2Var = this.f25038d0;
            if (s2Var != null) {
                j2 = s2Var.a(this.B, p5Var);
                this.f25063u0 = Math.max(this.f25063u0, this.f25038d0.a(this.B));
            }
            long j3 = j2;
            if (this.f25058s.d()) {
                this.w.add(Long.valueOf(j3));
            }
            if (this.f25069y0) {
                this.f25064v.a(j3, this.B);
                this.f25069y0 = false;
            }
            this.f25063u0 = Math.max(this.f25063u0, j3);
            this.f25058s.g();
            if (this.f25058s.c()) {
                a(this.f25058s);
            }
            b(this.f25058s);
            try {
                if (h2) {
                    this.K.a(this.f25040f0, 0, this.f25058s.f25962b, j3, 0);
                } else {
                    this.K.a(this.f25040f0, 0, this.f25058s.f25963c.limit(), j3, 0);
                }
                Y();
                this.f25057r0 = true;
                this.f25051o0 = 0;
                this.E0.f25671c++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw a(e2, this.B, t2.a(e2.getErrorCode()));
            }
        } catch (p5.a e3) {
            a(e3);
            e(0);
            F();
            return true;
        }
    }

    private void F() {
        try {
            this.K.b();
        } finally {
            W();
        }
    }

    private boolean O() {
        return this.f25041g0 >= 0;
    }

    private void R() {
        int i2 = this.f25055q0;
        if (i2 == 1) {
            F();
            return;
        }
        if (i2 == 2) {
            F();
            b0();
        } else if (i2 == 3) {
            T();
        } else {
            this.f25067x0 = true;
            V();
        }
    }

    private void S() {
        this.f25061t0 = true;
        MediaFormat e = this.K.e();
        if (this.S != 0 && e.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY) == 32 && e.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY) == 32) {
            this.f25036b0 = true;
            return;
        }
        if (this.Z) {
            e.setInteger("channel-count", 1);
        }
        this.M = e;
        this.N = true;
    }

    private void T() {
        U();
        P();
    }

    private void Y() {
        this.f25040f0 = -1;
        this.f25058s.f25963c = null;
    }

    private void Z() {
        this.f25041g0 = -1;
        this.f25042h0 = null;
    }

    private void b0() {
        try {
            this.F.setMediaDrmSession(a(this.E).f25005b);
            b(this.E);
            this.f25053p0 = 0;
            this.f25055q0 = 0;
        } catch (MediaCryptoException e) {
            throw a(e, this.B, 6006);
        }
    }

    private List d(boolean z2) {
        List a2 = a(this.f25050o, this.B, z2);
        if (a2.isEmpty() && z2) {
            a2 = a(this.f25050o, this.B, false);
            if (!a2.isEmpty()) {
                pc.d("MediaCodecRenderer", "Drm session requires secure decoder for " + this.B.f23840m + ", but no secure decoder available. Trying to proceed with " + a2 + ".");
            }
        }
        return a2;
    }

    private boolean e(int i2) {
        g9 r2 = r();
        this.f25056r.b();
        int a2 = a(r2, this.f25056r, i2 | 4);
        if (a2 == -5) {
            a(r2);
            return true;
        }
        if (a2 != -4 || !this.f25056r.e()) {
            return false;
        }
        this.f25066w0 = true;
        R();
        return false;
    }

    private void z() {
        b1.b(!this.f25066w0);
        g9 r2 = r();
        this.f25060t.b();
        do {
            this.f25060t.b();
            int a2 = a(r2, this.f25060t, 0);
            if (a2 == -5) {
                a(r2);
                return;
            }
            if (a2 != -4) {
                if (a2 != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else {
                if (this.f25060t.e()) {
                    this.f25066w0 = true;
                    return;
                }
                if (this.f25069y0) {
                    f9 f9Var = (f9) b1.a(this.B);
                    this.C = f9Var;
                    a(f9Var, (MediaFormat) null);
                    this.f25069y0 = false;
                }
                this.f25060t.g();
            }
        } while (this.f25062u.a(this.f25060t));
        this.f25046l0 = true;
    }

    public final boolean G() {
        boolean H = H();
        if (H) {
            P();
        }
        return H;
    }

    public boolean H() {
        if (this.K == null) {
            return false;
        }
        if (this.f25055q0 == 3 || this.U || ((this.V && !this.f25061t0) || (this.W && this.f25059s0))) {
            U();
            return true;
        }
        F();
        return false;
    }

    public final hd I() {
        return this.K;
    }

    public final kd J() {
        return this.R;
    }

    public boolean K() {
        return false;
    }

    public final MediaFormat L() {
        return this.M;
    }

    public final long M() {
        return this.G0;
    }

    public float N() {
        return this.I;
    }

    public final void P() {
        f9 f9Var;
        if (this.K != null || this.f25045k0 || (f9Var = this.B) == null) {
            return;
        }
        if (this.E == null && c(f9Var)) {
            b(this.B);
            return;
        }
        b(this.E);
        String str = this.B.f23840m;
        z6 z6Var = this.D;
        if (z6Var != null) {
            if (this.F == null) {
                l9 a2 = a(z6Var);
                if (a2 != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(a2.f25004a, a2.f25005b);
                        this.F = mediaCrypto;
                        this.G = !a2.f25006c && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e) {
                        throw a(e, this.B, 6006);
                    }
                } else if (this.D.getError() == null) {
                    return;
                }
            }
            if (l9.d) {
                int b2 = this.D.b();
                if (b2 == 1) {
                    z6.a aVar = (z6.a) b1.a(this.D.getError());
                    throw a(aVar, this.B, aVar.f28307a);
                }
                if (b2 != 4) {
                    return;
                }
            }
        }
        try {
            a(this.F, this.G);
        } catch (a e2) {
            throw a(e2, this.B, 4001);
        }
    }

    public void Q() {
    }

    public void U() {
        try {
            hd hdVar = this.K;
            if (hdVar != null) {
                hdVar.a();
                this.E0.f25670b++;
                g(this.R.f24873a);
            }
            this.K = null;
            try {
                MediaCrypto mediaCrypto = this.F;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.K = null;
            try {
                MediaCrypto mediaCrypto2 = this.F;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public void V() {
    }

    public void W() {
        Y();
        Z();
        this.f25039e0 = -9223372036854775807L;
        this.f25059s0 = false;
        this.f25057r0 = false;
        this.f25035a0 = false;
        this.f25036b0 = false;
        this.f25043i0 = false;
        this.f25044j0 = false;
        this.w.clear();
        this.f25063u0 = -9223372036854775807L;
        this.f25065v0 = -9223372036854775807L;
        s2 s2Var = this.f25038d0;
        if (s2Var != null) {
            s2Var.a();
        }
        this.f25053p0 = 0;
        this.f25055q0 = 0;
        this.f25051o0 = this.f25049n0 ? 1 : 0;
    }

    public void X() {
        W();
        this.D0 = null;
        this.f25038d0 = null;
        this.P = null;
        this.R = null;
        this.L = null;
        this.M = null;
        this.N = false;
        this.f25061t0 = false;
        this.O = -1.0f;
        this.S = 0;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f25037c0 = false;
        this.f25049n0 = false;
        this.f25051o0 = 0;
        this.G = false;
    }

    public abstract float a(float f2, f9 f9Var, f9[] f9VarArr);

    public abstract int a(md mdVar, f9 f9Var);

    public abstract hd.a a(kd kdVar, f9 f9Var, MediaCrypto mediaCrypto, float f2);

    public abstract q5 a(kd kdVar, f9 f9Var, f9 f9Var2);

    public abstract List a(md mdVar, f9 f9Var, boolean z2);

    public final void a(a8 a8Var) {
        this.D0 = a8Var;
    }

    public abstract void a(f9 f9Var, MediaFormat mediaFormat);

    public abstract void a(Exception exc);

    public abstract void a(String str, long j2, long j3);

    public abstract boolean a(long j2, long j3, hd hdVar, ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z2, boolean z3, f9 f9Var);

    public final void a0() {
        this.f25071z0 = true;
    }

    public abstract void b(p5 p5Var);

    public void b(boolean z2) {
        this.B0 = z2;
    }

    public void c(boolean z2) {
        this.C0 = z2;
    }

    public final void f(long j2) {
        f9 f9Var = (f9) this.f25064v.c(j2);
        if (f9Var == null && this.N) {
            f9Var = (f9) this.f25064v.c();
        }
        if (f9Var != null) {
            this.C = f9Var;
        } else if (!this.N || this.C == null) {
            return;
        }
        a(this.C, this.M);
        this.N = false;
    }

    public abstract void g(String str);

    @Override // com.applovin.impl.e2, com.applovin.impl.ri
    public final int m() {
        return 8;
    }

    @Override // com.applovin.impl.e2
    public void v() {
        this.B = null;
        this.F0 = -9223372036854775807L;
        this.G0 = -9223372036854775807L;
        this.H0 = 0;
        H();
    }

    @Override // com.applovin.impl.e2
    public void w() {
        try {
            A();
            U();
        } finally {
            c((z6) null);
        }
    }

    @Override // com.applovin.impl.e2
    public void x() {
    }

    @Override // com.applovin.impl.e2
    public void y() {
    }

    public void a(p5 p5Var) {
    }

    public boolean b(kd kdVar) {
        return true;
    }

    @Override // com.applovin.impl.qi
    public boolean c() {
        return this.f25067x0;
    }

    private boolean b(long j2, long j3) {
        boolean z2;
        b1.b(!this.f25067x0);
        if (this.f25062u.m()) {
            g2 g2Var = this.f25062u;
            if (!a(j2, j3, null, g2Var.f25963c, this.f25041g0, 0, g2Var.l(), this.f25062u.j(), this.f25062u.d(), this.f25062u.e(), this.C)) {
                return false;
            }
            d(this.f25062u.k());
            this.f25062u.b();
            z2 = false;
        } else {
            z2 = false;
        }
        if (this.f25066w0) {
            this.f25067x0 = true;
            return z2;
        }
        if (this.f25046l0) {
            b1.b(this.f25062u.a(this.f25060t));
            this.f25046l0 = z2;
        }
        if (this.f25047m0) {
            if (this.f25062u.m()) {
                return true;
            }
            A();
            this.f25047m0 = z2;
            P();
            if (!this.f25045k0) {
                return z2;
            }
        }
        z();
        if (this.f25062u.m()) {
            this.f25062u.g();
        }
        if (this.f25062u.m() || this.f25066w0 || this.f25047m0) {
            return true;
        }
        return z2;
    }

    public void a(boolean z2) {
        this.A0 = z2;
    }

    public boolean c(f9 f9Var) {
        return false;
    }

    private static boolean a(kd kdVar) {
        String str = kdVar.f24873a;
        int i2 = xp.f27962a;
        return (i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i2 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || ("Amazon".equals(xp.f27964c) && "AFTS".equals(xp.d) && kdVar.f24877g));
    }

    private boolean c(long j2, long j3) {
        boolean z2;
        boolean a2;
        int a3;
        if (!O()) {
            if (this.X && this.f25059s0) {
                try {
                    a3 = this.K.a(this.x);
                } catch (IllegalStateException unused) {
                    R();
                    if (this.f25067x0) {
                        U();
                    }
                    return false;
                }
            } else {
                a3 = this.K.a(this.x);
            }
            if (a3 < 0) {
                if (a3 == -2) {
                    S();
                    return true;
                }
                if (this.f25037c0 && (this.f25066w0 || this.f25053p0 == 2)) {
                    R();
                }
                return false;
            }
            if (this.f25036b0) {
                this.f25036b0 = false;
                this.K.a(a3, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.x;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                R();
                return false;
            }
            this.f25041g0 = a3;
            ByteBuffer b2 = this.K.b(a3);
            this.f25042h0 = b2;
            if (b2 != null) {
                b2.position(this.x.offset);
                ByteBuffer byteBuffer = this.f25042h0;
                MediaCodec.BufferInfo bufferInfo2 = this.x;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.Y) {
                MediaCodec.BufferInfo bufferInfo3 = this.x;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                    long j4 = this.f25063u0;
                    if (j4 != -9223372036854775807L) {
                        bufferInfo3.presentationTimeUs = j4;
                    }
                }
            }
            this.f25043i0 = c(this.x.presentationTimeUs);
            long j5 = this.f25065v0;
            long j6 = this.x.presentationTimeUs;
            this.f25044j0 = j5 == j6;
            f(j6);
        }
        if (this.X && this.f25059s0) {
            try {
                hd hdVar = this.K;
                ByteBuffer byteBuffer2 = this.f25042h0;
                int i2 = this.f25041g0;
                MediaCodec.BufferInfo bufferInfo4 = this.x;
                z2 = false;
                try {
                    a2 = a(j2, j3, hdVar, byteBuffer2, i2, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f25043i0, this.f25044j0, this.C);
                } catch (IllegalStateException unused2) {
                    R();
                    if (this.f25067x0) {
                        U();
                    }
                    return z2;
                }
            } catch (IllegalStateException unused3) {
                z2 = false;
            }
        } else {
            z2 = false;
            hd hdVar2 = this.K;
            ByteBuffer byteBuffer3 = this.f25042h0;
            int i3 = this.f25041g0;
            MediaCodec.BufferInfo bufferInfo5 = this.x;
            a2 = a(j2, j3, hdVar2, byteBuffer3, i3, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f25043i0, this.f25044j0, this.C);
        }
        if (a2) {
            d(this.x.presentationTimeUs);
            boolean z3 = (this.x.flags & 4) != 0 ? true : z2;
            Z();
            if (!z3) {
                return true;
            }
            R();
        }
        return z2;
    }

    private static boolean f(String str) {
        return xp.f27962a == 29 && "c2.android.aac.decoder".equals(str);
    }

    @Override // com.applovin.impl.qi
    public boolean d() {
        return this.B != null && (u() || O() || (this.f25039e0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f25039e0));
    }

    private boolean e(long j2) {
        return this.H == -9223372036854775807L || SystemClock.elapsedRealtime() - j2 < this.H;
    }

    private boolean e(f9 f9Var) {
        if (xp.f27962a >= 23 && this.K != null && this.f25055q0 != 3 && b() != 0) {
            float a2 = a(this.J, f9Var, t());
            float f2 = this.O;
            if (f2 == a2) {
                return true;
            }
            if (a2 == -1.0f) {
                C();
                return false;
            }
            if (f2 == -1.0f && a2 <= this.f25054q) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", a2);
            this.K.a(bundle);
            this.O = a2;
        }
        return true;
    }

    public void d(long j2) {
        while (true) {
            int i2 = this.H0;
            if (i2 == 0 || j2 < this.A[0]) {
                return;
            }
            long[] jArr = this.f25068y;
            this.F0 = jArr[0];
            this.G0 = this.f25070z[0];
            int i3 = i2 - 1;
            this.H0 = i3;
            System.arraycopy(jArr, 1, jArr, 0, i3);
            long[] jArr2 = this.f25070z;
            System.arraycopy(jArr2, 1, jArr2, 0, this.H0);
            long[] jArr3 = this.A;
            System.arraycopy(jArr3, 1, jArr3, 0, this.H0);
            Q();
        }
    }

    private boolean a(kd kdVar, f9 f9Var, z6 z6Var, z6 z6Var2) {
        l9 a2;
        if (z6Var == z6Var2) {
            return false;
        }
        if (z6Var2 == null || z6Var == null || xp.f27962a < 23) {
            return true;
        }
        UUID uuid = t2.e;
        if (uuid.equals(z6Var.e()) || uuid.equals(z6Var2.e()) || (a2 = a(z6Var2)) == null) {
            return true;
        }
        return !kdVar.f24877g && (a2.f25006c ? false : z6Var2.a(f9Var.f23840m));
    }

    private static boolean e(String str) {
        int i2 = xp.f27962a;
        return i2 < 18 || (i2 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i2 == 19 && xp.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    public static boolean d(f9 f9Var) {
        int i2 = f9Var.F;
        return i2 == 0 || i2 == 2;
    }

    private static boolean d(String str) {
        return xp.f27962a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private l9 a(z6 z6Var) {
        z4 f2 = z6Var.f();
        if (f2 != null && !(f2 instanceof l9)) {
            throw a(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + f2), this.B, AdError.MEDIAVIEW_MISSING_ERROR_CODE);
        }
        return (l9) f2;
    }

    private void b(f9 f9Var) {
        A();
        String str = f9Var.f23840m;
        if (!"audio/mp4a-latm".equals(str) && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
            this.f25062u.i(1);
        } else {
            this.f25062u.i(32);
        }
        this.f25045k0 = true;
    }

    private void a(kd kdVar, MediaCrypto mediaCrypto) {
        hd a2;
        String str = kdVar.f24873a;
        int i2 = xp.f27962a;
        float a3 = i2 < 23 ? -1.0f : a(this.J, this.B, t());
        float f2 = a3 > this.f25054q ? a3 : -1.0f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ko.a("createCodec:" + str);
        hd.a a4 = a(kdVar, this.B, mediaCrypto, f2);
        if (this.A0 && i2 >= 23) {
            a2 = new g1.b(e(), this.B0, this.C0).a(a4);
        } else {
            a2 = this.f25048n.a(a4);
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        this.K = a2;
        this.R = kdVar;
        this.O = f2;
        this.L = this.B;
        this.S = a(str);
        this.T = a(str, this.L);
        this.U = e(str);
        this.V = f(str);
        this.W = c(str);
        this.X = d(str);
        this.Y = b(str);
        this.Z = b(str, this.L);
        this.f25037c0 = a(kdVar) || K();
        if (a2.c()) {
            this.f25049n0 = true;
            this.f25051o0 = 1;
            this.f25035a0 = this.S != 0;
        }
        if ("c2.android.mp3.decoder".equals(kdVar.f24873a)) {
            this.f25038d0 = new s2();
        }
        if (b() == 2) {
            this.f25039e0 = SystemClock.elapsedRealtime() + 1000;
        }
        this.E0.f25669a++;
        a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
    }

    private static boolean b(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    private void b(z6 z6Var) {
        z6.a(this.D, z6Var);
        this.D = z6Var;
    }

    private static boolean b(String str) {
        if (xp.f27962a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(xp.f27964c)) {
            String str2 = xp.f27963b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    private boolean c(long j2) {
        int size = this.w.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((Long) this.w.get(i2)).longValue() == j2) {
                this.w.remove(i2);
                return true;
            }
        }
        return false;
    }

    private static boolean c(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    private void c(z6 z6Var) {
        z6.a(this.E, z6Var);
        this.E = z6Var;
    }

    private static boolean c(String str) {
        int i2 = xp.f27962a;
        if (i2 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i2 <= 19) {
                String str2 = xp.f27963b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    private static boolean b(String str, f9 f9Var) {
        return xp.f27962a <= 18 && f9Var.f23851z == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    private void a(MediaCrypto mediaCrypto, boolean z2) {
        if (this.P == null) {
            try {
                List d = d(z2);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.P = arrayDeque;
                if (this.f25052p) {
                    arrayDeque.addAll(d);
                } else if (!d.isEmpty()) {
                    this.P.add((kd) d.get(0));
                }
                this.Q = null;
            } catch (nd.c e) {
                throw new a(this.B, e, z2, -49998);
            }
        }
        if (this.P.isEmpty()) {
            throw new a(this.B, (Throwable) null, z2, -49999);
        }
        while (this.K == null) {
            kd kdVar = (kd) this.P.peekFirst();
            if (!b(kdVar)) {
                return;
            }
            try {
                a(kdVar, mediaCrypto);
            } catch (Exception e2) {
                pc.c("MediaCodecRenderer", "Failed to initialize decoder: " + kdVar, e2);
                this.P.removeFirst();
                a aVar = new a(this.B, e2, z2, kdVar);
                a(aVar);
                if (this.Q == null) {
                    this.Q = aVar;
                } else {
                    this.Q = this.Q.a(aVar);
                }
                if (this.P.isEmpty()) {
                    throw this.Q;
                }
            }
        }
        this.P = null;
    }

    @Override // com.applovin.impl.e2
    public void a(boolean z2, boolean z3) {
        this.E0 = new n5();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        if (D() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ce, code lost:
    
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b0, code lost:
    
        if (D() == false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.applovin.impl.q5 a(com.applovin.impl.g9 r12) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ld.a(com.applovin.impl.g9):com.applovin.impl.q5");
    }

    @Override // com.applovin.impl.e2
    public void a(long j2, boolean z2) {
        this.f25066w0 = false;
        this.f25067x0 = false;
        this.f25071z0 = false;
        if (this.f25045k0) {
            this.f25062u.b();
            this.f25060t.b();
            this.f25046l0 = false;
        } else {
            G();
        }
        if (this.f25064v.e() > 0) {
            this.f25069y0 = true;
        }
        this.f25064v.a();
        int i2 = this.H0;
        if (i2 != 0) {
            int i3 = i2 - 1;
            this.G0 = this.f25070z[i3];
            this.F0 = this.f25068y[i3];
            this.H0 = 0;
        }
    }

    @Override // com.applovin.impl.e2
    public void a(f9[] f9VarArr, long j2, long j3) {
        if (this.G0 == -9223372036854775807L) {
            b1.b(this.F0 == -9223372036854775807L);
            this.F0 = j2;
            this.G0 = j3;
            return;
        }
        int i2 = this.H0;
        if (i2 == this.f25070z.length) {
            pc.d("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.f25070z[this.H0 - 1]);
        } else {
            this.H0 = i2 + 1;
        }
        long[] jArr = this.f25068y;
        int i3 = this.H0 - 1;
        jArr[i3] = j2;
        this.f25070z[i3] = j3;
        this.A[i3] = this.f25063u0;
    }

    @Override // com.applovin.impl.qi
    public void a(long j2, long j3) {
        boolean z2 = false;
        if (this.f25071z0) {
            this.f25071z0 = false;
            R();
        }
        a8 a8Var = this.D0;
        if (a8Var == null) {
            try {
                if (this.f25067x0) {
                    V();
                    return;
                }
                if (this.B != null || e(2)) {
                    P();
                    if (this.f25045k0) {
                        ko.a("bypassRender");
                        do {
                        } while (b(j2, j3));
                        ko.a();
                    } else if (this.K != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        ko.a("drainAndFeed");
                        while (c(j2, j3) && e(elapsedRealtime)) {
                        }
                        while (E() && e(elapsedRealtime)) {
                        }
                        ko.a();
                    } else {
                        this.E0.d += b(j2);
                        e(1);
                    }
                    this.E0.a();
                    return;
                }
                return;
            } catch (IllegalStateException e) {
                if (a(e)) {
                    a((Exception) e);
                    if (xp.f27962a >= 21 && c(e)) {
                        z2 = true;
                    }
                    if (z2) {
                        U();
                    }
                    throw a(a(e, J()), this.B, z2, 4003);
                }
                throw e;
            }
        }
        this.D0 = null;
        throw a8Var;
    }

    @Override // com.applovin.impl.qi
    public void a(float f2, float f3) {
        this.I = f2;
        this.J = f3;
        e(this.L);
    }

    @Override // com.applovin.impl.ri
    public final int a(f9 f9Var) {
        try {
            return a(this.f25050o, f9Var);
        } catch (nd.c e) {
            throw a(e, f9Var, 4002);
        }
    }

    public jd a(Throwable th, kd kdVar) {
        return new jd(th, kdVar);
    }

    private static boolean a(IllegalStateException illegalStateException) {
        if (xp.f27962a >= 21 && b(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private int a(String str) {
        int i2 = xp.f27962a;
        if (i2 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = xp.d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i2 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = xp.f27963b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private static boolean a(String str, f9 f9Var) {
        return xp.f27962a < 21 && f9Var.f23842o.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }
}
