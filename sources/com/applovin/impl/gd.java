package com.applovin.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.adjust.sdk.Constants;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.cd;
import com.applovin.impl.f1;
import com.applovin.impl.id;
import com.applovin.impl.n5;
import com.applovin.impl.x6;
import com.facebook.ads.AdError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class gd extends d2 {
    private static final byte[] I0 = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    private final long[] A;
    private boolean A0;
    private d9 B;
    private boolean B0;
    private d9 C;
    private boolean C0;
    private x6 D;
    private y7 D0;
    private x6 E;
    protected l5 E0;
    private MediaCrypto F;
    private long F0;
    private boolean G;
    private long G0;
    private long H;
    private int H0;
    private float I;
    private float J;
    private cd K;
    private d9 L;
    private MediaFormat M;
    private boolean N;
    private float O;
    private ArrayDeque P;
    private a Q;
    private fd R;
    private int S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f4884a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f4885b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f4886c0;

    /* renamed from: d0, reason: collision with root package name */
    private q2 f4887d0;

    /* renamed from: e0, reason: collision with root package name */
    private long f4888e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f4889f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f4890g0;

    /* renamed from: h0, reason: collision with root package name */
    private ByteBuffer f4891h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f4892i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f4893j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f4894k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f4895l0;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f4896m0;

    /* renamed from: n, reason: collision with root package name */
    private final cd.b f4897n;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f4898n0;

    /* renamed from: o, reason: collision with root package name */
    private final hd f4899o;

    /* renamed from: o0, reason: collision with root package name */
    private int f4900o0;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f4901p;

    /* renamed from: p0, reason: collision with root package name */
    private int f4902p0;

    /* renamed from: q, reason: collision with root package name */
    private final float f4903q;

    /* renamed from: q0, reason: collision with root package name */
    private int f4904q0;

    /* renamed from: r, reason: collision with root package name */
    private final n5 f4905r;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f4906r0;

    /* renamed from: s, reason: collision with root package name */
    private final n5 f4907s;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f4908s0;

    /* renamed from: t, reason: collision with root package name */
    private final n5 f4909t;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f4910t0;
    private final f2 u;

    /* renamed from: u0, reason: collision with root package name */
    private long f4911u0;

    /* renamed from: v, reason: collision with root package name */
    private final fo f4912v;

    /* renamed from: v0, reason: collision with root package name */
    private long f4913v0;

    /* renamed from: w, reason: collision with root package name */
    private final ArrayList f4914w;

    /* renamed from: w0, reason: collision with root package name */
    private boolean f4915w0;

    /* renamed from: x, reason: collision with root package name */
    private final MediaCodec.BufferInfo f4916x;

    /* renamed from: x0, reason: collision with root package name */
    private boolean f4917x0;

    /* renamed from: y, reason: collision with root package name */
    private final long[] f4918y;

    /* renamed from: y0, reason: collision with root package name */
    private boolean f4919y0;

    /* renamed from: z, reason: collision with root package name */
    private final long[] f4920z;

    /* renamed from: z0, reason: collision with root package name */
    private boolean f4921z0;

    /* loaded from: classes.dex */
    public static class a extends Exception {
        public final String a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f4922b;

        /* renamed from: c, reason: collision with root package name */
        public final fd f4923c;

        /* renamed from: d, reason: collision with root package name */
        public final String f4924d;

        /* renamed from: f, reason: collision with root package name */
        public final a f4925f;

        public a(d9 d9Var, Throwable th2, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + d9Var, th2, d9Var.f4228m, z10, null, a(i10), null);
        }

        private static String a(int i10) {
            return "com.applovin.exoplayer2.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10);
        }

        public a(d9 d9Var, Throwable th2, boolean z10, fd fdVar) {
            this("Decoder init failed: " + fdVar.a + ", " + d9Var, th2, d9Var.f4228m, z10, fdVar, yp.a >= 21 ? a(th2) : null, null);
        }

        private static String a(Throwable th2) {
            if (th2 instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a a(a aVar) {
            return new a(getMessage(), getCause(), this.a, this.f4922b, this.f4923c, this.f4924d, aVar);
        }

        private a(String str, Throwable th2, String str2, boolean z10, fd fdVar, String str3, a aVar) {
            super(str, th2);
            this.a = str2;
            this.f4922b = z10;
            this.f4923c = fdVar;
            this.f4924d = str3;
            this.f4925f = aVar;
        }
    }

    public gd(int i10, cd.b bVar, hd hdVar, boolean z10, float f10) {
        super(i10);
        this.f4897n = bVar;
        this.f4899o = (hd) a1.a(hdVar);
        this.f4901p = z10;
        this.f4903q = f10;
        this.f4905r = n5.i();
        this.f4907s = new n5(0);
        this.f4909t = new n5(2);
        f2 f2Var = new f2();
        this.u = f2Var;
        this.f4912v = new fo();
        this.f4914w = new ArrayList();
        this.f4916x = new MediaCodec.BufferInfo();
        this.I = 1.0f;
        this.J = 1.0f;
        this.H = C.TIME_UNSET;
        this.f4918y = new long[10];
        this.f4920z = new long[10];
        this.A = new long[10];
        this.F0 = C.TIME_UNSET;
        this.G0 = C.TIME_UNSET;
        f2Var.g(0);
        f2Var.f6351c.order(ByteOrder.nativeOrder());
        this.O = -1.0f;
        this.S = 0;
        this.f4900o0 = 0;
        this.f4889f0 = -1;
        this.f4890g0 = -1;
        this.f4888e0 = C.TIME_UNSET;
        this.f4911u0 = C.TIME_UNSET;
        this.f4913v0 = C.TIME_UNSET;
        this.f4902p0 = 0;
        this.f4904q0 = 0;
    }

    private void A() {
        this.f4896m0 = false;
        this.u.b();
        this.f4909t.b();
        this.f4895l0 = false;
        this.f4894k0 = false;
    }

    private boolean B() {
        if (this.f4906r0) {
            this.f4902p0 = 1;
            if (!this.U && !this.W) {
                this.f4904q0 = 1;
            } else {
                this.f4904q0 = 3;
                return false;
            }
        }
        return true;
    }

    private void C() {
        if (this.f4906r0) {
            this.f4902p0 = 1;
            this.f4904q0 = 3;
        } else {
            T();
        }
    }

    private boolean D() {
        if (this.f4906r0) {
            this.f4902p0 = 1;
            if (!this.U && !this.W) {
                this.f4904q0 = 2;
            } else {
                this.f4904q0 = 3;
                return false;
            }
        } else {
            b0();
        }
        return true;
    }

    private boolean E() {
        cd cdVar = this.K;
        if (cdVar == null || this.f4902p0 == 2 || this.f4915w0) {
            return false;
        }
        if (this.f4889f0 < 0) {
            int d10 = cdVar.d();
            this.f4889f0 = d10;
            if (d10 < 0) {
                return false;
            }
            this.f4907s.f6351c = this.K.a(d10);
            this.f4907s.b();
        }
        if (this.f4902p0 == 1) {
            if (!this.f4886c0) {
                this.f4908s0 = true;
                this.K.a(this.f4889f0, 0, 0, 0L, 4);
                Y();
            }
            this.f4902p0 = 2;
            return false;
        }
        if (this.f4884a0) {
            this.f4884a0 = false;
            ByteBuffer byteBuffer = this.f4907s.f6351c;
            byte[] bArr = I0;
            byteBuffer.put(bArr);
            this.K.a(this.f4889f0, 0, bArr.length, 0L, 0);
            Y();
            this.f4906r0 = true;
            return true;
        }
        if (this.f4900o0 == 1) {
            for (int i10 = 0; i10 < this.L.f4230o.size(); i10++) {
                this.f4907s.f6351c.put((byte[]) this.L.f4230o.get(i10));
            }
            this.f4900o0 = 2;
        }
        int position = this.f4907s.f6351c.position();
        e9 r6 = r();
        try {
            int a10 = a(r6, this.f4907s, 0);
            if (j()) {
                this.f4913v0 = this.f4911u0;
            }
            if (a10 == -3) {
                return false;
            }
            if (a10 == -5) {
                if (this.f4900o0 == 2) {
                    this.f4907s.b();
                    this.f4900o0 = 1;
                }
                a(r6);
                return true;
            }
            if (this.f4907s.e()) {
                if (this.f4900o0 == 2) {
                    this.f4907s.b();
                    this.f4900o0 = 1;
                }
                this.f4915w0 = true;
                if (!this.f4906r0) {
                    R();
                    return false;
                }
                try {
                    if (!this.f4886c0) {
                        this.f4908s0 = true;
                        this.K.a(this.f4889f0, 0, 0, 0L, 4);
                        Y();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e2) {
                    throw a(e2, this.B, r2.a(e2.getErrorCode()));
                }
            }
            if (!this.f4906r0 && !this.f4907s.f()) {
                this.f4907s.b();
                if (this.f4900o0 == 2) {
                    this.f4900o0 = 1;
                }
                return true;
            }
            boolean h10 = this.f4907s.h();
            if (h10) {
                this.f4907s.f6350b.a(position);
            }
            if (this.T && !h10) {
                uf.a(this.f4907s.f6351c);
                if (this.f4907s.f6351c.position() == 0) {
                    return true;
                }
                this.T = false;
            }
            n5 n5Var = this.f4907s;
            long j3 = n5Var.f6353f;
            q2 q2Var = this.f4887d0;
            if (q2Var != null) {
                j3 = q2Var.a(this.B, n5Var);
                this.f4911u0 = Math.max(this.f4911u0, this.f4887d0.a(this.B));
            }
            long j10 = j3;
            if (this.f4907s.d()) {
                this.f4914w.add(Long.valueOf(j10));
            }
            if (this.f4919y0) {
                this.f4912v.a(j10, this.B);
                this.f4919y0 = false;
            }
            this.f4911u0 = Math.max(this.f4911u0, j10);
            this.f4907s.g();
            if (this.f4907s.c()) {
                a(this.f4907s);
            }
            b(this.f4907s);
            try {
                if (h10) {
                    this.K.a(this.f4889f0, 0, this.f4907s.f6350b, j10, 0);
                } else {
                    this.K.a(this.f4889f0, 0, this.f4907s.f6351c.limit(), j10, 0);
                }
                Y();
                this.f4906r0 = true;
                this.f4900o0 = 0;
                this.E0.f5844c++;
                return true;
            } catch (MediaCodec.CryptoException e10) {
                throw a(e10, this.B, r2.a(e10.getErrorCode()));
            }
        } catch (n5.a e11) {
            a(e11);
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
        return this.f4890g0 >= 0;
    }

    private void R() {
        int i10 = this.f4904q0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    this.f4917x0 = true;
                    V();
                    return;
                } else {
                    T();
                    return;
                }
            }
            F();
            b0();
            return;
        }
        F();
    }

    private void S() {
        this.f4910t0 = true;
        MediaFormat e2 = this.K.e();
        if (this.S != 0 && e2.getInteger("width") == 32 && e2.getInteger("height") == 32) {
            this.f4885b0 = true;
            return;
        }
        if (this.Z) {
            e2.setInteger("channel-count", 1);
        }
        this.M = e2;
        this.N = true;
    }

    private void T() {
        U();
        P();
    }

    private void Y() {
        this.f4889f0 = -1;
        this.f4907s.f6351c = null;
    }

    private void Z() {
        this.f4890g0 = -1;
        this.f4891h0 = null;
    }

    private void b0() {
        try {
            this.F.setMediaDrmSession(a(this.E).f5461b);
            b(this.E);
            this.f4902p0 = 0;
            this.f4904q0 = 0;
        } catch (MediaCryptoException e2) {
            throw a(e2, this.B, 6006);
        }
    }

    private List d(boolean z10) {
        List a10 = a(this.f4899o, this.B, z10);
        if (a10.isEmpty() && z10) {
            a10 = a(this.f4899o, this.B, false);
            if (!a10.isEmpty()) {
                kc.d("MediaCodecRenderer", "Drm session requires secure decoder for " + this.B.f4228m + ", but no secure decoder available. Trying to proceed with " + a10 + ".");
            }
        }
        return a10;
    }

    private boolean e(int i10) {
        e9 r6 = r();
        this.f4905r.b();
        int a10 = a(r6, this.f4905r, i10 | 4);
        if (a10 == -5) {
            a(r6);
            return true;
        }
        if (a10 != -4 || !this.f4905r.e()) {
            return false;
        }
        this.f4915w0 = true;
        R();
        return false;
    }

    private void z() {
        a1.b(!this.f4915w0);
        e9 r6 = r();
        this.f4909t.b();
        do {
            this.f4909t.b();
            int a10 = a(r6, this.f4909t, 0);
            if (a10 != -5) {
                if (a10 != -4) {
                    if (a10 == -3) {
                        return;
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    if (this.f4909t.e()) {
                        this.f4915w0 = true;
                        return;
                    }
                    if (this.f4919y0) {
                        d9 d9Var = (d9) a1.a(this.B);
                        this.C = d9Var;
                        a(d9Var, (MediaFormat) null);
                        this.f4919y0 = false;
                    }
                    this.f4909t.g();
                }
            } else {
                a(r6);
                return;
            }
        } while (this.u.a(this.f4909t));
        this.f4895l0 = true;
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
        if (this.f4904q0 != 3 && !this.U && ((!this.V || this.f4910t0) && (!this.W || !this.f4908s0))) {
            F();
            return false;
        }
        U();
        return true;
    }

    public final cd I() {
        return this.K;
    }

    public final fd J() {
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
        d9 d9Var;
        boolean z10;
        if (this.K == null && !this.f4894k0 && (d9Var = this.B) != null) {
            if (this.E == null && c(d9Var)) {
                b(this.B);
                return;
            }
            b(this.E);
            String str = this.B.f4228m;
            x6 x6Var = this.D;
            if (x6Var != null) {
                if (this.F == null) {
                    j9 a10 = a(x6Var);
                    if (a10 == null) {
                        if (this.D.getError() == null) {
                            return;
                        }
                    } else {
                        try {
                            MediaCrypto mediaCrypto = new MediaCrypto(a10.a, a10.f5461b);
                            this.F = mediaCrypto;
                            if (!a10.f5462c && mediaCrypto.requiresSecureDecoderComponent(str)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.G = z10;
                        } catch (MediaCryptoException e2) {
                            throw a(e2, this.B, 6006);
                        }
                    }
                }
                if (j9.f5460d) {
                    int b3 = this.D.b();
                    if (b3 != 1) {
                        if (b3 != 4) {
                            return;
                        }
                    } else {
                        x6.a aVar = (x6.a) a1.a(this.D.getError());
                        throw a(aVar, this.B, aVar.a);
                    }
                }
            }
            try {
                a(this.F, this.G);
            } catch (a e10) {
                throw a(e10, this.B, 4001);
            }
        }
    }

    public void Q() {
    }

    public void U() {
        try {
            cd cdVar = this.K;
            if (cdVar != null) {
                cdVar.a();
                this.E0.f5843b++;
                g(this.R.a);
            }
            this.K = null;
            try {
                MediaCrypto mediaCrypto = this.F;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.K = null;
            try {
                MediaCrypto mediaCrypto2 = this.F;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    public void V() {
    }

    public void W() {
        Y();
        Z();
        this.f4888e0 = C.TIME_UNSET;
        this.f4908s0 = false;
        this.f4906r0 = false;
        this.f4884a0 = false;
        this.f4885b0 = false;
        this.f4892i0 = false;
        this.f4893j0 = false;
        this.f4914w.clear();
        this.f4911u0 = C.TIME_UNSET;
        this.f4913v0 = C.TIME_UNSET;
        q2 q2Var = this.f4887d0;
        if (q2Var != null) {
            q2Var.a();
        }
        this.f4902p0 = 0;
        this.f4904q0 = 0;
        this.f4900o0 = this.f4898n0 ? 1 : 0;
    }

    public void X() {
        W();
        this.D0 = null;
        this.f4887d0 = null;
        this.P = null;
        this.R = null;
        this.L = null;
        this.M = null;
        this.N = false;
        this.f4910t0 = false;
        this.O = -1.0f;
        this.S = 0;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f4886c0 = false;
        this.f4898n0 = false;
        this.f4900o0 = 0;
        this.G = false;
    }

    public abstract float a(float f10, d9 d9Var, d9[] d9VarArr);

    public abstract int a(hd hdVar, d9 d9Var);

    public abstract cd.a a(fd fdVar, d9 d9Var, MediaCrypto mediaCrypto, float f10);

    public abstract o5 a(fd fdVar, d9 d9Var, d9 d9Var2);

    public abstract List a(hd hdVar, d9 d9Var, boolean z10);

    public abstract void a(d9 d9Var, MediaFormat mediaFormat);

    public void a(n5 n5Var) {
    }

    public abstract void a(Exception exc);

    public abstract void a(String str, long j3, long j10);

    public abstract boolean a(long j3, long j10, cd cdVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, d9 d9Var);

    public final void a0() {
        this.f4921z0 = true;
    }

    public abstract void b(n5 n5Var);

    public boolean b(fd fdVar) {
        return true;
    }

    public boolean c(d9 d9Var) {
        return false;
    }

    public final void f(long j3) {
        d9 d9Var = (d9) this.f4912v.c(j3);
        if (d9Var == null && this.N) {
            d9Var = (d9) this.f4912v.c();
        }
        if (d9Var != null) {
            this.C = d9Var;
        } else if (!this.N || this.C == null) {
            return;
        }
        a(this.C, this.M);
        this.N = false;
    }

    public abstract void g(String str);

    @Override // com.applovin.impl.d2, com.applovin.impl.mi
    public final int m() {
        return 8;
    }

    @Override // com.applovin.impl.d2
    public void v() {
        this.B = null;
        this.F0 = C.TIME_UNSET;
        this.G0 = C.TIME_UNSET;
        this.H0 = 0;
        H();
    }

    @Override // com.applovin.impl.d2
    public void w() {
        try {
            A();
            U();
        } finally {
            c((x6) null);
        }
    }

    @Override // com.applovin.impl.d2
    public void x() {
    }

    @Override // com.applovin.impl.d2
    public void y() {
    }

    private static boolean a(fd fdVar) {
        String str = fdVar.a;
        int i10 = yp.a;
        return (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i10 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i10 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || ("Amazon".equals(yp.f9254c) && "AFTS".equals(yp.f9255d) && fdVar.f4689g));
    }

    private boolean b(long j3, long j10) {
        boolean z10;
        a1.b(!this.f4917x0);
        if (this.u.m()) {
            f2 f2Var = this.u;
            if (!a(j3, j10, null, f2Var.f6351c, this.f4890g0, 0, f2Var.l(), this.u.j(), this.u.d(), this.u.e(), this.C)) {
                return false;
            }
            d(this.u.k());
            this.u.b();
            z10 = false;
        } else {
            z10 = false;
        }
        if (this.f4915w0) {
            this.f4917x0 = true;
            return z10;
        }
        if (this.f4895l0) {
            a1.b(this.u.a(this.f4909t));
            this.f4895l0 = z10;
        }
        if (this.f4896m0) {
            if (this.u.m()) {
                return true;
            }
            A();
            this.f4896m0 = z10;
            P();
            if (!this.f4894k0) {
                return z10;
            }
        }
        z();
        if (this.u.m()) {
            this.u.g();
        }
        if (this.u.m() || this.f4915w0 || this.f4896m0) {
            return true;
        }
        return z10;
    }

    private boolean c(long j3, long j10) {
        boolean z10;
        boolean a10;
        int a11;
        if (!O()) {
            if (this.X && this.f4908s0) {
                try {
                    a11 = this.K.a(this.f4916x);
                } catch (IllegalStateException unused) {
                    R();
                    if (this.f4917x0) {
                        U();
                    }
                    return false;
                }
            } else {
                a11 = this.K.a(this.f4916x);
            }
            if (a11 < 0) {
                if (a11 == -2) {
                    S();
                    return true;
                }
                if (this.f4886c0 && (this.f4915w0 || this.f4902p0 == 2)) {
                    R();
                }
                return false;
            }
            if (this.f4885b0) {
                this.f4885b0 = false;
                this.K.a(a11, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f4916x;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                R();
                return false;
            }
            this.f4890g0 = a11;
            ByteBuffer b3 = this.K.b(a11);
            this.f4891h0 = b3;
            if (b3 != null) {
                b3.position(this.f4916x.offset);
                ByteBuffer byteBuffer = this.f4891h0;
                MediaCodec.BufferInfo bufferInfo2 = this.f4916x;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.Y) {
                MediaCodec.BufferInfo bufferInfo3 = this.f4916x;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                    long j11 = this.f4911u0;
                    if (j11 != C.TIME_UNSET) {
                        bufferInfo3.presentationTimeUs = j11;
                    }
                }
            }
            this.f4892i0 = c(this.f4916x.presentationTimeUs);
            long j12 = this.f4913v0;
            long j13 = this.f4916x.presentationTimeUs;
            this.f4893j0 = j12 == j13;
            f(j13);
        }
        if (this.X && this.f4908s0) {
            try {
                cd cdVar = this.K;
                ByteBuffer byteBuffer2 = this.f4891h0;
                int i10 = this.f4890g0;
                MediaCodec.BufferInfo bufferInfo4 = this.f4916x;
                z10 = false;
                try {
                    a10 = a(j3, j10, cdVar, byteBuffer2, i10, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f4892i0, this.f4893j0, this.C);
                } catch (IllegalStateException unused2) {
                    R();
                    if (this.f4917x0) {
                        U();
                    }
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            z10 = false;
            cd cdVar2 = this.K;
            ByteBuffer byteBuffer3 = this.f4891h0;
            int i11 = this.f4890g0;
            MediaCodec.BufferInfo bufferInfo5 = this.f4916x;
            a10 = a(j3, j10, cdVar2, byteBuffer3, i11, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f4892i0, this.f4893j0, this.C);
        }
        if (a10) {
            d(this.f4916x.presentationTimeUs);
            boolean z11 = (this.f4916x.flags & 4) != 0 ? true : z10;
            Z();
            if (!z11) {
                return true;
            }
            R();
        }
        return z10;
    }

    private boolean e(long j3) {
        return this.H == C.TIME_UNSET || SystemClock.elapsedRealtime() - j3 < this.H;
    }

    private static boolean f(String str) {
        return yp.a == 29 && "c2.android.aac.decoder".equals(str);
    }

    @Override // com.applovin.impl.li
    public boolean d() {
        return this.B != null && (u() || O() || (this.f4888e0 != C.TIME_UNSET && SystemClock.elapsedRealtime() < this.f4888e0));
    }

    private boolean a(fd fdVar, d9 d9Var, x6 x6Var, x6 x6Var2) {
        j9 a10;
        if (x6Var == x6Var2) {
            return false;
        }
        if (x6Var2 == null || x6Var == null || yp.a < 23) {
            return true;
        }
        UUID uuid = r2.f7313e;
        if (uuid.equals(x6Var.e()) || uuid.equals(x6Var2.e()) || (a10 = a(x6Var2)) == null) {
            return true;
        }
        return !fdVar.f4689g && (a10.f5462c ? false : x6Var2.a(d9Var.f4228m));
    }

    private boolean e(d9 d9Var) {
        if (yp.a >= 23 && this.K != null && this.f4904q0 != 3 && b() != 0) {
            float a10 = a(this.J, d9Var, t());
            float f10 = this.O;
            if (f10 == a10) {
                return true;
            }
            if (a10 == -1.0f) {
                C();
                return false;
            }
            if (f10 == -1.0f && a10 <= this.f4903q) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", a10);
            this.K.a(bundle);
            this.O = a10;
        }
        return true;
    }

    public void d(long j3) {
        while (true) {
            int i10 = this.H0;
            if (i10 == 0 || j3 < this.A[0]) {
                return;
            }
            long[] jArr = this.f4918y;
            this.F0 = jArr[0];
            this.G0 = this.f4920z[0];
            int i11 = i10 - 1;
            this.H0 = i11;
            System.arraycopy(jArr, 1, jArr, 0, i11);
            long[] jArr2 = this.f4920z;
            System.arraycopy(jArr2, 1, jArr2, 0, this.H0);
            long[] jArr3 = this.A;
            System.arraycopy(jArr3, 1, jArr3, 0, this.H0);
            Q();
        }
    }

    public void a(boolean z10) {
        this.A0 = z10;
    }

    private j9 a(x6 x6Var) {
        x4 f10 = x6Var.f();
        if (f10 != null && !(f10 instanceof j9)) {
            throw a(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + f10), this.B, AdError.MEDIAVIEW_MISSING_ERROR_CODE);
        }
        return (j9) f10;
    }

    public static boolean d(d9 d9Var) {
        int i10 = d9Var.F;
        return i10 == 0 || i10 == 2;
    }

    private void a(fd fdVar, MediaCrypto mediaCrypto) {
        cd a10;
        String str = fdVar.a;
        int i10 = yp.a;
        float a11 = i10 < 23 ? -1.0f : a(this.J, this.B, t());
        float f10 = a11 > this.f4903q ? a11 : -1.0f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        lo.a("createCodec:" + str);
        cd.a a12 = a(fdVar, this.B, mediaCrypto, f10);
        if (this.A0 && i10 >= 23) {
            a10 = new f1.b(e(), this.B0, this.C0).a(a12);
        } else {
            a10 = this.f4897n.a(a12);
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        this.K = a10;
        this.R = fdVar;
        this.O = f10;
        this.L = this.B;
        this.S = a(str);
        this.T = a(str, this.L);
        this.U = e(str);
        this.V = f(str);
        this.W = c(str);
        this.X = d(str);
        this.Y = b(str);
        this.Z = b(str, this.L);
        this.f4886c0 = a(fdVar) || K();
        if (a10.c()) {
            this.f4898n0 = true;
            this.f4900o0 = 1;
            this.f4884a0 = this.S != 0;
        }
        if ("c2.android.mp3.decoder".equals(fdVar.a)) {
            this.f4887d0 = new q2();
        }
        if (b() == 2) {
            this.f4888e0 = SystemClock.elapsedRealtime() + 1000;
        }
        this.E0.a++;
        a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
    }

    private static boolean d(String str) {
        return yp.a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean e(String str) {
        int i10 = yp.a;
        return i10 < 18 || (i10 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i10 == 19 && yp.f9255d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    public void b(boolean z10) {
        this.B0 = z10;
    }

    private void b(d9 d9Var) {
        A();
        String str = d9Var.f4228m;
        if (!MimeTypes.AUDIO_AAC.equals(str) && !MimeTypes.AUDIO_MPEG.equals(str) && !MimeTypes.AUDIO_OPUS.equals(str)) {
            this.u.i(1);
        } else {
            this.u.i(32);
        }
        this.f4894k0 = true;
    }

    private static boolean b(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    private void b(x6 x6Var) {
        x6.a(this.D, x6Var);
        this.D = x6Var;
    }

    public void c(boolean z10) {
        this.C0 = z10;
    }

    private static boolean b(String str) {
        if (yp.a < 21 && "OMX.SEC.mp3.dec".equals(str) && Constants.REFERRER_API_SAMSUNG.equals(yp.f9254c)) {
            String str2 = yp.f9253b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    private boolean c(long j3) {
        int size = this.f4914w.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((Long) this.f4914w.get(i10)).longValue() == j3) {
                this.f4914w.remove(i10);
                return true;
            }
        }
        return false;
    }

    @Override // com.applovin.impl.li
    public boolean c() {
        return this.f4917x0;
    }

    private static boolean c(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    private void c(x6 x6Var) {
        x6.a(this.E, x6Var);
        this.E = x6Var;
    }

    private static boolean c(String str) {
        int i10 = yp.a;
        if (i10 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i10 <= 19) {
                String str2 = yp.f9253b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    private static boolean b(String str, d9 d9Var) {
        return yp.a <= 18 && d9Var.f4240z == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    private void a(MediaCrypto mediaCrypto, boolean z10) {
        if (this.P == null) {
            try {
                List d10 = d(z10);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.P = arrayDeque;
                if (this.f4901p) {
                    arrayDeque.addAll(d10);
                } else if (!d10.isEmpty()) {
                    this.P.add((fd) d10.get(0));
                }
                this.Q = null;
            } catch (id.c e2) {
                throw new a(this.B, e2, z10, -49998);
            }
        }
        if (!this.P.isEmpty()) {
            while (this.K == null) {
                fd fdVar = (fd) this.P.peekFirst();
                if (!b(fdVar)) {
                    return;
                }
                try {
                    a(fdVar, mediaCrypto);
                } catch (Exception e10) {
                    kc.c("MediaCodecRenderer", "Failed to initialize decoder: " + fdVar, e10);
                    this.P.removeFirst();
                    a aVar = new a(this.B, e10, z10, fdVar);
                    a(aVar);
                    if (this.Q != null) {
                        this.Q = this.Q.a(aVar);
                    } else {
                        this.Q = aVar;
                    }
                    if (this.P.isEmpty()) {
                        throw this.Q;
                    }
                }
            }
            this.P = null;
            return;
        }
        throw new a(this.B, (Throwable) null, z10, -49999);
    }

    @Override // com.applovin.impl.d2
    public void a(boolean z10, boolean z11) {
        this.E0 = new l5();
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
    public com.applovin.impl.o5 a(com.applovin.impl.e9 r12) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.gd.a(com.applovin.impl.e9):com.applovin.impl.o5");
    }

    @Override // com.applovin.impl.d2
    public void a(long j3, boolean z10) {
        this.f4915w0 = false;
        this.f4917x0 = false;
        this.f4921z0 = false;
        if (this.f4894k0) {
            this.u.b();
            this.f4909t.b();
            this.f4895l0 = false;
        } else {
            G();
        }
        if (this.f4912v.e() > 0) {
            this.f4919y0 = true;
        }
        this.f4912v.a();
        int i10 = this.H0;
        if (i10 != 0) {
            int i11 = i10 - 1;
            this.G0 = this.f4920z[i11];
            this.F0 = this.f4918y[i11];
            this.H0 = 0;
        }
    }

    @Override // com.applovin.impl.d2
    public void a(d9[] d9VarArr, long j3, long j10) {
        if (this.G0 == C.TIME_UNSET) {
            a1.b(this.F0 == C.TIME_UNSET);
            this.F0 = j3;
            this.G0 = j10;
            return;
        }
        int i10 = this.H0;
        if (i10 == this.f4920z.length) {
            kc.d("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.f4920z[this.H0 - 1]);
        } else {
            this.H0 = i10 + 1;
        }
        long[] jArr = this.f4918y;
        int i11 = this.H0 - 1;
        jArr[i11] = j3;
        this.f4920z[i11] = j10;
        this.A[i11] = this.f4911u0;
    }

    @Override // com.applovin.impl.li
    public void a(long j3, long j10) {
        boolean z10 = false;
        if (this.f4921z0) {
            this.f4921z0 = false;
            R();
        }
        y7 y7Var = this.D0;
        if (y7Var == null) {
            try {
                if (this.f4917x0) {
                    V();
                    return;
                }
                if (this.B != null || e(2)) {
                    P();
                    if (this.f4894k0) {
                        lo.a("bypassRender");
                        do {
                        } while (b(j3, j10));
                        lo.a();
                    } else if (this.K != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        lo.a("drainAndFeed");
                        while (c(j3, j10) && e(elapsedRealtime)) {
                        }
                        while (E() && e(elapsedRealtime)) {
                        }
                        lo.a();
                    } else {
                        this.E0.f5845d += b(j3);
                        e(1);
                    }
                    this.E0.a();
                    return;
                }
                return;
            } catch (IllegalStateException e2) {
                if (a(e2)) {
                    a((Exception) e2);
                    if (yp.a >= 21 && c(e2)) {
                        z10 = true;
                    }
                    if (z10) {
                        U();
                    }
                    throw a(a(e2, J()), this.B, z10, 4003);
                }
                throw e2;
            }
        }
        this.D0 = null;
        throw y7Var;
    }

    public final void a(y7 y7Var) {
        this.D0 = y7Var;
    }

    @Override // com.applovin.impl.li
    public void a(float f10, float f11) {
        this.I = f10;
        this.J = f11;
        e(this.L);
    }

    @Override // com.applovin.impl.mi
    public final int a(d9 d9Var) {
        try {
            return a(this.f4899o, d9Var);
        } catch (id.c e2) {
            throw a(e2, d9Var, 4002);
        }
    }

    public ed a(Throwable th2, fd fdVar) {
        return new ed(th2, fdVar);
    }

    private static boolean a(IllegalStateException illegalStateException) {
        if (yp.a >= 21 && b(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private int a(String str) {
        int i10 = yp.a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = yp.f9255d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i10 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = yp.f9253b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private static boolean a(String str, d9 d9Var) {
        return yp.a < 21 && d9Var.f4230o.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }
}
