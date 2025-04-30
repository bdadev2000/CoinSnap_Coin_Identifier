package com.applovin.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.adjust.sdk.Constants;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.C0694f1;
import com.applovin.impl.cd;
import com.applovin.impl.id;
import com.applovin.impl.n5;
import com.applovin.impl.x6;
import com.facebook.ads.AdError;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class gd extends AbstractC0685d2 {

    /* renamed from: I0, reason: collision with root package name */
    private static final byte[] f7823I0 = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};

    /* renamed from: A, reason: collision with root package name */
    private final long[] f7824A;

    /* renamed from: A0, reason: collision with root package name */
    private boolean f7825A0;

    /* renamed from: B, reason: collision with root package name */
    private d9 f7826B;

    /* renamed from: B0, reason: collision with root package name */
    private boolean f7827B0;

    /* renamed from: C, reason: collision with root package name */
    private d9 f7828C;

    /* renamed from: C0, reason: collision with root package name */
    private boolean f7829C0;

    /* renamed from: D, reason: collision with root package name */
    private x6 f7830D;

    /* renamed from: D0, reason: collision with root package name */
    private y7 f7831D0;

    /* renamed from: E, reason: collision with root package name */
    private x6 f7832E;

    /* renamed from: E0, reason: collision with root package name */
    protected l5 f7833E0;

    /* renamed from: F, reason: collision with root package name */
    private MediaCrypto f7834F;

    /* renamed from: F0, reason: collision with root package name */
    private long f7835F0;

    /* renamed from: G, reason: collision with root package name */
    private boolean f7836G;

    /* renamed from: G0, reason: collision with root package name */
    private long f7837G0;

    /* renamed from: H, reason: collision with root package name */
    private long f7838H;

    /* renamed from: H0, reason: collision with root package name */
    private int f7839H0;

    /* renamed from: I, reason: collision with root package name */
    private float f7840I;

    /* renamed from: J, reason: collision with root package name */
    private float f7841J;

    /* renamed from: K, reason: collision with root package name */
    private cd f7842K;

    /* renamed from: L, reason: collision with root package name */
    private d9 f7843L;

    /* renamed from: M, reason: collision with root package name */
    private MediaFormat f7844M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f7845N;
    private float O;

    /* renamed from: P, reason: collision with root package name */
    private ArrayDeque f7846P;

    /* renamed from: Q, reason: collision with root package name */
    private a f7847Q;

    /* renamed from: R, reason: collision with root package name */
    private fd f7848R;

    /* renamed from: S, reason: collision with root package name */
    private int f7849S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f7850T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f7851U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f7852V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f7853W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f7854X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f7855Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f7856Z;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f7857a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f7858b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f7859c0;

    /* renamed from: d0, reason: collision with root package name */
    private C0741q2 f7860d0;

    /* renamed from: e0, reason: collision with root package name */
    private long f7861e0;
    private int f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f7862g0;

    /* renamed from: h0, reason: collision with root package name */
    private ByteBuffer f7863h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f7864i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f7865j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f7866k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f7867l0;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f7868m0;

    /* renamed from: n, reason: collision with root package name */
    private final cd.b f7869n;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f7870n0;

    /* renamed from: o, reason: collision with root package name */
    private final hd f7871o;

    /* renamed from: o0, reason: collision with root package name */
    private int f7872o0;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f7873p;

    /* renamed from: p0, reason: collision with root package name */
    private int f7874p0;

    /* renamed from: q, reason: collision with root package name */
    private final float f7875q;

    /* renamed from: q0, reason: collision with root package name */
    private int f7876q0;

    /* renamed from: r, reason: collision with root package name */
    private final n5 f7877r;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f7878r0;

    /* renamed from: s, reason: collision with root package name */
    private final n5 f7879s;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f7880s0;

    /* renamed from: t, reason: collision with root package name */
    private final n5 f7881t;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f7882t0;

    /* renamed from: u, reason: collision with root package name */
    private final C0695f2 f7883u;

    /* renamed from: u0, reason: collision with root package name */
    private long f7884u0;

    /* renamed from: v, reason: collision with root package name */
    private final fo f7885v;

    /* renamed from: v0, reason: collision with root package name */
    private long f7886v0;

    /* renamed from: w, reason: collision with root package name */
    private final ArrayList f7887w;

    /* renamed from: w0, reason: collision with root package name */
    private boolean f7888w0;

    /* renamed from: x, reason: collision with root package name */
    private final MediaCodec.BufferInfo f7889x;

    /* renamed from: x0, reason: collision with root package name */
    private boolean f7890x0;

    /* renamed from: y, reason: collision with root package name */
    private final long[] f7891y;

    /* renamed from: y0, reason: collision with root package name */
    private boolean f7892y0;

    /* renamed from: z, reason: collision with root package name */
    private final long[] f7893z;

    /* renamed from: z0, reason: collision with root package name */
    private boolean f7894z0;

    /* loaded from: classes.dex */
    public static class a extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final String f7895a;
        public final boolean b;

        /* renamed from: c, reason: collision with root package name */
        public final fd f7896c;

        /* renamed from: d, reason: collision with root package name */
        public final String f7897d;

        /* renamed from: f, reason: collision with root package name */
        public final a f7898f;

        public a(d9 d9Var, Throwable th, boolean z8, int i9) {
            this("Decoder init failed: [" + i9 + "], " + d9Var, th, d9Var.m, z8, null, a(i9), null);
        }

        private static String a(int i9) {
            return "com.applovin.exoplayer2.mediacodec.MediaCodecRenderer_" + (i9 < 0 ? "neg_" : "") + Math.abs(i9);
        }

        public a(d9 d9Var, Throwable th, boolean z8, fd fdVar) {
            this("Decoder init failed: " + fdVar.f7633a + ", " + d9Var, th, d9Var.m, z8, fdVar, yp.f12451a >= 21 ? a(th) : null, null);
        }

        private static String a(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        private a(String str, Throwable th, String str2, boolean z8, fd fdVar, String str3, a aVar) {
            super(str, th);
            this.f7895a = str2;
            this.b = z8;
            this.f7896c = fdVar;
            this.f7897d = str3;
            this.f7898f = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a a(a aVar) {
            return new a(getMessage(), getCause(), this.f7895a, this.b, this.f7896c, this.f7897d, aVar);
        }
    }

    public gd(int i9, cd.b bVar, hd hdVar, boolean z8, float f9) {
        super(i9);
        this.f7869n = bVar;
        this.f7871o = (hd) AbstractC0669a1.a(hdVar);
        this.f7873p = z8;
        this.f7875q = f9;
        this.f7877r = n5.i();
        this.f7879s = new n5(0);
        this.f7881t = new n5(2);
        C0695f2 c0695f2 = new C0695f2();
        this.f7883u = c0695f2;
        this.f7885v = new fo();
        this.f7887w = new ArrayList();
        this.f7889x = new MediaCodec.BufferInfo();
        this.f7840I = 1.0f;
        this.f7841J = 1.0f;
        this.f7838H = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f7891y = new long[10];
        this.f7893z = new long[10];
        this.f7824A = new long[10];
        this.f7835F0 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f7837G0 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        c0695f2.g(0);
        c0695f2.f9273c.order(ByteOrder.nativeOrder());
        this.O = -1.0f;
        this.f7849S = 0;
        this.f7872o0 = 0;
        this.f0 = -1;
        this.f7862g0 = -1;
        this.f7861e0 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f7884u0 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f7886v0 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f7874p0 = 0;
        this.f7876q0 = 0;
    }

    private void A() {
        this.f7868m0 = false;
        this.f7883u.b();
        this.f7881t.b();
        this.f7867l0 = false;
        this.f7866k0 = false;
    }

    private boolean B() {
        if (this.f7878r0) {
            this.f7874p0 = 1;
            if (!this.f7851U && !this.f7853W) {
                this.f7876q0 = 1;
            } else {
                this.f7876q0 = 3;
                return false;
            }
        }
        return true;
    }

    private void C() {
        if (this.f7878r0) {
            this.f7874p0 = 1;
            this.f7876q0 = 3;
        } else {
            T();
        }
    }

    private boolean D() {
        if (this.f7878r0) {
            this.f7874p0 = 1;
            if (!this.f7851U && !this.f7853W) {
                this.f7876q0 = 2;
            } else {
                this.f7876q0 = 3;
                return false;
            }
        } else {
            b0();
        }
        return true;
    }

    private boolean E() {
        cd cdVar = this.f7842K;
        if (cdVar == null || this.f7874p0 == 2 || this.f7888w0) {
            return false;
        }
        if (this.f0 < 0) {
            int d2 = cdVar.d();
            this.f0 = d2;
            if (d2 < 0) {
                return false;
            }
            this.f7879s.f9273c = this.f7842K.a(d2);
            this.f7879s.b();
        }
        if (this.f7874p0 == 1) {
            if (!this.f7859c0) {
                this.f7880s0 = true;
                this.f7842K.a(this.f0, 0, 0, 0L, 4);
                Y();
            }
            this.f7874p0 = 2;
            return false;
        }
        if (this.f7857a0) {
            this.f7857a0 = false;
            ByteBuffer byteBuffer = this.f7879s.f9273c;
            byte[] bArr = f7823I0;
            byteBuffer.put(bArr);
            this.f7842K.a(this.f0, 0, bArr.length, 0L, 0);
            Y();
            this.f7878r0 = true;
            return true;
        }
        if (this.f7872o0 == 1) {
            for (int i9 = 0; i9 < this.f7843L.f7212o.size(); i9++) {
                this.f7879s.f9273c.put((byte[]) this.f7843L.f7212o.get(i9));
            }
            this.f7872o0 = 2;
        }
        int position = this.f7879s.f9273c.position();
        e9 r9 = r();
        try {
            int a6 = a(r9, this.f7879s, 0);
            if (j()) {
                this.f7886v0 = this.f7884u0;
            }
            if (a6 == -3) {
                return false;
            }
            if (a6 == -5) {
                if (this.f7872o0 == 2) {
                    this.f7879s.b();
                    this.f7872o0 = 1;
                }
                a(r9);
                return true;
            }
            if (this.f7879s.e()) {
                if (this.f7872o0 == 2) {
                    this.f7879s.b();
                    this.f7872o0 = 1;
                }
                this.f7888w0 = true;
                if (!this.f7878r0) {
                    R();
                    return false;
                }
                try {
                    if (!this.f7859c0) {
                        this.f7880s0 = true;
                        this.f7842K.a(this.f0, 0, 0, 0L, 4);
                        Y();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e4) {
                    throw a(e4, this.f7826B, AbstractC0744r2.a(e4.getErrorCode()));
                }
            }
            if (!this.f7878r0 && !this.f7879s.f()) {
                this.f7879s.b();
                if (this.f7872o0 == 2) {
                    this.f7872o0 = 1;
                }
                return true;
            }
            boolean h6 = this.f7879s.h();
            if (h6) {
                this.f7879s.b.a(position);
            }
            if (this.f7850T && !h6) {
                uf.a(this.f7879s.f9273c);
                if (this.f7879s.f9273c.position() == 0) {
                    return true;
                }
                this.f7850T = false;
            }
            n5 n5Var = this.f7879s;
            long j7 = n5Var.f9275f;
            C0741q2 c0741q2 = this.f7860d0;
            if (c0741q2 != null) {
                j7 = c0741q2.a(this.f7826B, n5Var);
                this.f7884u0 = Math.max(this.f7884u0, this.f7860d0.a(this.f7826B));
            }
            long j9 = j7;
            if (this.f7879s.d()) {
                this.f7887w.add(Long.valueOf(j9));
            }
            if (this.f7892y0) {
                this.f7885v.a(j9, this.f7826B);
                this.f7892y0 = false;
            }
            this.f7884u0 = Math.max(this.f7884u0, j9);
            this.f7879s.g();
            if (this.f7879s.c()) {
                a(this.f7879s);
            }
            b(this.f7879s);
            try {
                if (h6) {
                    this.f7842K.a(this.f0, 0, this.f7879s.b, j9, 0);
                } else {
                    this.f7842K.a(this.f0, 0, this.f7879s.f9273c.limit(), j9, 0);
                }
                Y();
                this.f7878r0 = true;
                this.f7872o0 = 0;
                this.f7833E0.f8811c++;
                return true;
            } catch (MediaCodec.CryptoException e9) {
                throw a(e9, this.f7826B, AbstractC0744r2.a(e9.getErrorCode()));
            }
        } catch (n5.a e10) {
            a(e10);
            e(0);
            F();
            return true;
        }
    }

    private void F() {
        try {
            this.f7842K.b();
        } finally {
            W();
        }
    }

    private boolean O() {
        if (this.f7862g0 >= 0) {
            return true;
        }
        return false;
    }

    private void R() {
        int i9 = this.f7876q0;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    this.f7890x0 = true;
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
        this.f7882t0 = true;
        MediaFormat e4 = this.f7842K.e();
        if (this.f7849S != 0 && e4.getInteger("width") == 32 && e4.getInteger("height") == 32) {
            this.f7858b0 = true;
            return;
        }
        if (this.f7856Z) {
            e4.setInteger("channel-count", 1);
        }
        this.f7844M = e4;
        this.f7845N = true;
    }

    private void T() {
        U();
        P();
    }

    private void Y() {
        this.f0 = -1;
        this.f7879s.f9273c = null;
    }

    private void Z() {
        this.f7862g0 = -1;
        this.f7863h0 = null;
    }

    private void b0() {
        try {
            this.f7834F.setMediaDrmSession(a(this.f7832E).b);
            b(this.f7832E);
            this.f7874p0 = 0;
            this.f7876q0 = 0;
        } catch (MediaCryptoException e4) {
            throw a(e4, this.f7826B, 6006);
        }
    }

    private List d(boolean z8) {
        List a6 = a(this.f7871o, this.f7826B, z8);
        if (a6.isEmpty() && z8) {
            a6 = a(this.f7871o, this.f7826B, false);
            if (!a6.isEmpty()) {
                kc.d("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f7826B.m + ", but no secure decoder available. Trying to proceed with " + a6 + ".");
            }
        }
        return a6;
    }

    private boolean e(int i9) {
        e9 r9 = r();
        this.f7877r.b();
        int a6 = a(r9, this.f7877r, i9 | 4);
        if (a6 == -5) {
            a(r9);
            return true;
        }
        if (a6 != -4 || !this.f7877r.e()) {
            return false;
        }
        this.f7888w0 = true;
        R();
        return false;
    }

    private void z() {
        AbstractC0669a1.b(!this.f7888w0);
        e9 r9 = r();
        this.f7881t.b();
        do {
            this.f7881t.b();
            int a6 = a(r9, this.f7881t, 0);
            if (a6 != -5) {
                if (a6 != -4) {
                    if (a6 == -3) {
                        return;
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    if (this.f7881t.e()) {
                        this.f7888w0 = true;
                        return;
                    }
                    if (this.f7892y0) {
                        d9 d9Var = (d9) AbstractC0669a1.a(this.f7826B);
                        this.f7828C = d9Var;
                        a(d9Var, (MediaFormat) null);
                        this.f7892y0 = false;
                    }
                    this.f7881t.g();
                }
            } else {
                a(r9);
                return;
            }
        } while (this.f7883u.a(this.f7881t));
        this.f7867l0 = true;
    }

    public final boolean G() {
        boolean H8 = H();
        if (H8) {
            P();
        }
        return H8;
    }

    public boolean H() {
        if (this.f7842K == null) {
            return false;
        }
        if (this.f7876q0 != 3 && !this.f7851U && ((!this.f7852V || this.f7882t0) && (!this.f7853W || !this.f7880s0))) {
            F();
            return false;
        }
        U();
        return true;
    }

    public final cd I() {
        return this.f7842K;
    }

    public final fd J() {
        return this.f7848R;
    }

    public boolean K() {
        return false;
    }

    public final MediaFormat L() {
        return this.f7844M;
    }

    public final long M() {
        return this.f7837G0;
    }

    public float N() {
        return this.f7840I;
    }

    public final void P() {
        d9 d9Var;
        boolean z8;
        if (this.f7842K == null && !this.f7866k0 && (d9Var = this.f7826B) != null) {
            if (this.f7832E == null && c(d9Var)) {
                b(this.f7826B);
                return;
            }
            b(this.f7832E);
            String str = this.f7826B.m;
            x6 x6Var = this.f7830D;
            if (x6Var != null) {
                if (this.f7834F == null) {
                    j9 a6 = a(x6Var);
                    if (a6 == null) {
                        if (this.f7830D.getError() == null) {
                            return;
                        }
                    } else {
                        try {
                            MediaCrypto mediaCrypto = new MediaCrypto(a6.f8419a, a6.b);
                            this.f7834F = mediaCrypto;
                            if (!a6.f8420c && mediaCrypto.requiresSecureDecoderComponent(str)) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            this.f7836G = z8;
                        } catch (MediaCryptoException e4) {
                            throw a(e4, this.f7826B, 6006);
                        }
                    }
                }
                if (j9.f8418d) {
                    int b = this.f7830D.b();
                    if (b != 1) {
                        if (b != 4) {
                            return;
                        }
                    } else {
                        x6.a aVar = (x6.a) AbstractC0669a1.a(this.f7830D.getError());
                        throw a(aVar, this.f7826B, aVar.f12156a);
                    }
                }
            }
            try {
                a(this.f7834F, this.f7836G);
            } catch (a e9) {
                throw a(e9, this.f7826B, 4001);
            }
        }
    }

    public void Q() {
    }

    public void U() {
        try {
            cd cdVar = this.f7842K;
            if (cdVar != null) {
                cdVar.a();
                this.f7833E0.b++;
                g(this.f7848R.f7633a);
            }
            this.f7842K = null;
            try {
                MediaCrypto mediaCrypto = this.f7834F;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f7842K = null;
            try {
                MediaCrypto mediaCrypto2 = this.f7834F;
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
        this.f7861e0 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f7880s0 = false;
        this.f7878r0 = false;
        this.f7857a0 = false;
        this.f7858b0 = false;
        this.f7864i0 = false;
        this.f7865j0 = false;
        this.f7887w.clear();
        this.f7884u0 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f7886v0 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        C0741q2 c0741q2 = this.f7860d0;
        if (c0741q2 != null) {
            c0741q2.a();
        }
        this.f7874p0 = 0;
        this.f7876q0 = 0;
        this.f7872o0 = this.f7870n0 ? 1 : 0;
    }

    public void X() {
        W();
        this.f7831D0 = null;
        this.f7860d0 = null;
        this.f7846P = null;
        this.f7848R = null;
        this.f7843L = null;
        this.f7844M = null;
        this.f7845N = false;
        this.f7882t0 = false;
        this.O = -1.0f;
        this.f7849S = 0;
        this.f7850T = false;
        this.f7851U = false;
        this.f7852V = false;
        this.f7853W = false;
        this.f7854X = false;
        this.f7855Y = false;
        this.f7856Z = false;
        this.f7859c0 = false;
        this.f7870n0 = false;
        this.f7872o0 = 0;
        this.f7836G = false;
    }

    public abstract float a(float f9, d9 d9Var, d9[] d9VarArr);

    public abstract int a(hd hdVar, d9 d9Var);

    public abstract cd.a a(fd fdVar, d9 d9Var, MediaCrypto mediaCrypto, float f9);

    public abstract o5 a(fd fdVar, d9 d9Var, d9 d9Var2);

    public abstract List a(hd hdVar, d9 d9Var, boolean z8);

    public abstract void a(d9 d9Var, MediaFormat mediaFormat);

    public void a(n5 n5Var) {
    }

    public abstract void a(Exception exc);

    public abstract void a(String str, long j7, long j9);

    public abstract boolean a(long j7, long j9, cd cdVar, ByteBuffer byteBuffer, int i9, int i10, int i11, long j10, boolean z8, boolean z9, d9 d9Var);

    public final void a0() {
        this.f7894z0 = true;
    }

    public abstract void b(n5 n5Var);

    public boolean b(fd fdVar) {
        return true;
    }

    public boolean c(d9 d9Var) {
        return false;
    }

    public final void f(long j7) {
        d9 d9Var = (d9) this.f7885v.c(j7);
        if (d9Var == null && this.f7845N) {
            d9Var = (d9) this.f7885v.c();
        }
        if (d9Var != null) {
            this.f7828C = d9Var;
        } else if (!this.f7845N || this.f7828C == null) {
            return;
        }
        a(this.f7828C, this.f7844M);
        this.f7845N = false;
    }

    public abstract void g(String str);

    @Override // com.applovin.impl.AbstractC0685d2, com.applovin.impl.mi
    public final int m() {
        return 8;
    }

    @Override // com.applovin.impl.AbstractC0685d2
    public void v() {
        this.f7826B = null;
        this.f7835F0 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f7837G0 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f7839H0 = 0;
        H();
    }

    @Override // com.applovin.impl.AbstractC0685d2
    public void w() {
        try {
            A();
            U();
        } finally {
            c((x6) null);
        }
    }

    @Override // com.applovin.impl.AbstractC0685d2
    public void x() {
    }

    @Override // com.applovin.impl.AbstractC0685d2
    public void y() {
    }

    private static boolean a(fd fdVar) {
        String str = fdVar.f7633a;
        int i9 = yp.f12451a;
        return (i9 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i9 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i9 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || ("Amazon".equals(yp.f12452c) && "AFTS".equals(yp.f12453d) && fdVar.f7638g));
    }

    private boolean b(long j7, long j9) {
        boolean z8;
        AbstractC0669a1.b(!this.f7890x0);
        if (this.f7883u.m()) {
            C0695f2 c0695f2 = this.f7883u;
            if (!a(j7, j9, null, c0695f2.f9273c, this.f7862g0, 0, c0695f2.l(), this.f7883u.j(), this.f7883u.d(), this.f7883u.e(), this.f7828C)) {
                return false;
            }
            d(this.f7883u.k());
            this.f7883u.b();
            z8 = false;
        } else {
            z8 = false;
        }
        if (this.f7888w0) {
            this.f7890x0 = true;
            return z8;
        }
        if (this.f7867l0) {
            AbstractC0669a1.b(this.f7883u.a(this.f7881t));
            this.f7867l0 = z8;
        }
        if (this.f7868m0) {
            if (this.f7883u.m()) {
                return true;
            }
            A();
            this.f7868m0 = z8;
            P();
            if (!this.f7866k0) {
                return z8;
            }
        }
        z();
        if (this.f7883u.m()) {
            this.f7883u.g();
        }
        if (this.f7883u.m() || this.f7888w0 || this.f7868m0) {
            return true;
        }
        return z8;
    }

    private boolean c(long j7, long j9) {
        boolean z8;
        boolean a6;
        int a9;
        if (!O()) {
            if (this.f7854X && this.f7880s0) {
                try {
                    a9 = this.f7842K.a(this.f7889x);
                } catch (IllegalStateException unused) {
                    R();
                    if (this.f7890x0) {
                        U();
                    }
                    return false;
                }
            } else {
                a9 = this.f7842K.a(this.f7889x);
            }
            if (a9 < 0) {
                if (a9 == -2) {
                    S();
                    return true;
                }
                if (this.f7859c0 && (this.f7888w0 || this.f7874p0 == 2)) {
                    R();
                }
                return false;
            }
            if (this.f7858b0) {
                this.f7858b0 = false;
                this.f7842K.a(a9, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f7889x;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                R();
                return false;
            }
            this.f7862g0 = a9;
            ByteBuffer b = this.f7842K.b(a9);
            this.f7863h0 = b;
            if (b != null) {
                b.position(this.f7889x.offset);
                ByteBuffer byteBuffer = this.f7863h0;
                MediaCodec.BufferInfo bufferInfo2 = this.f7889x;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f7855Y) {
                MediaCodec.BufferInfo bufferInfo3 = this.f7889x;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                    long j10 = this.f7884u0;
                    if (j10 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        bufferInfo3.presentationTimeUs = j10;
                    }
                }
            }
            this.f7864i0 = c(this.f7889x.presentationTimeUs);
            long j11 = this.f7886v0;
            long j12 = this.f7889x.presentationTimeUs;
            this.f7865j0 = j11 == j12;
            f(j12);
        }
        if (this.f7854X && this.f7880s0) {
            try {
                cd cdVar = this.f7842K;
                ByteBuffer byteBuffer2 = this.f7863h0;
                int i9 = this.f7862g0;
                MediaCodec.BufferInfo bufferInfo4 = this.f7889x;
                z8 = false;
                try {
                    a6 = a(j7, j9, cdVar, byteBuffer2, i9, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f7864i0, this.f7865j0, this.f7828C);
                } catch (IllegalStateException unused2) {
                    R();
                    if (this.f7890x0) {
                        U();
                    }
                    return z8;
                }
            } catch (IllegalStateException unused3) {
                z8 = false;
            }
        } else {
            z8 = false;
            cd cdVar2 = this.f7842K;
            ByteBuffer byteBuffer3 = this.f7863h0;
            int i10 = this.f7862g0;
            MediaCodec.BufferInfo bufferInfo5 = this.f7889x;
            a6 = a(j7, j9, cdVar2, byteBuffer3, i10, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f7864i0, this.f7865j0, this.f7828C);
        }
        if (a6) {
            d(this.f7889x.presentationTimeUs);
            boolean z9 = (this.f7889x.flags & 4) != 0 ? true : z8;
            Z();
            if (!z9) {
                return true;
            }
            R();
        }
        return z8;
    }

    private boolean e(long j7) {
        return this.f7838H == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || SystemClock.elapsedRealtime() - j7 < this.f7838H;
    }

    private static boolean f(String str) {
        return yp.f12451a == 29 && "c2.android.aac.decoder".equals(str);
    }

    @Override // com.applovin.impl.li
    public boolean d() {
        return this.f7826B != null && (u() || O() || (this.f7861e0 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && SystemClock.elapsedRealtime() < this.f7861e0));
    }

    private boolean a(fd fdVar, d9 d9Var, x6 x6Var, x6 x6Var2) {
        j9 a6;
        if (x6Var == x6Var2) {
            return false;
        }
        if (x6Var2 == null || x6Var == null || yp.f12451a < 23) {
            return true;
        }
        UUID uuid = AbstractC0744r2.f10447e;
        if (uuid.equals(x6Var.e()) || uuid.equals(x6Var2.e()) || (a6 = a(x6Var2)) == null) {
            return true;
        }
        return !fdVar.f7638g && (a6.f8420c ? false : x6Var2.a(d9Var.m));
    }

    private boolean e(d9 d9Var) {
        if (yp.f12451a >= 23 && this.f7842K != null && this.f7876q0 != 3 && b() != 0) {
            float a6 = a(this.f7841J, d9Var, t());
            float f9 = this.O;
            if (f9 == a6) {
                return true;
            }
            if (a6 == -1.0f) {
                C();
                return false;
            }
            if (f9 == -1.0f && a6 <= this.f7875q) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", a6);
            this.f7842K.a(bundle);
            this.O = a6;
        }
        return true;
    }

    public void d(long j7) {
        while (true) {
            int i9 = this.f7839H0;
            if (i9 == 0 || j7 < this.f7824A[0]) {
                return;
            }
            long[] jArr = this.f7891y;
            this.f7835F0 = jArr[0];
            this.f7837G0 = this.f7893z[0];
            int i10 = i9 - 1;
            this.f7839H0 = i10;
            System.arraycopy(jArr, 1, jArr, 0, i10);
            long[] jArr2 = this.f7893z;
            System.arraycopy(jArr2, 1, jArr2, 0, this.f7839H0);
            long[] jArr3 = this.f7824A;
            System.arraycopy(jArr3, 1, jArr3, 0, this.f7839H0);
            Q();
        }
    }

    public void a(boolean z8) {
        this.f7825A0 = z8;
    }

    private j9 a(x6 x6Var) {
        x4 f9 = x6Var.f();
        if (f9 != null && !(f9 instanceof j9)) {
            throw a(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + f9), this.f7826B, AdError.MEDIAVIEW_MISSING_ERROR_CODE);
        }
        return (j9) f9;
    }

    public static boolean d(d9 d9Var) {
        int i9 = d9Var.f7200F;
        return i9 == 0 || i9 == 2;
    }

    private void a(fd fdVar, MediaCrypto mediaCrypto) {
        cd a6;
        String str = fdVar.f7633a;
        int i9 = yp.f12451a;
        float a9 = i9 < 23 ? -1.0f : a(this.f7841J, this.f7826B, t());
        float f9 = a9 > this.f7875q ? a9 : -1.0f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        lo.a("createCodec:" + str);
        cd.a a10 = a(fdVar, this.f7826B, mediaCrypto, f9);
        if (this.f7825A0 && i9 >= 23) {
            a6 = new C0694f1.b(e(), this.f7827B0, this.f7829C0).a(a10);
        } else {
            a6 = this.f7869n.a(a10);
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        this.f7842K = a6;
        this.f7848R = fdVar;
        this.O = f9;
        this.f7843L = this.f7826B;
        this.f7849S = a(str);
        this.f7850T = a(str, this.f7843L);
        this.f7851U = e(str);
        this.f7852V = f(str);
        this.f7853W = c(str);
        this.f7854X = d(str);
        this.f7855Y = b(str);
        this.f7856Z = b(str, this.f7843L);
        this.f7859c0 = a(fdVar) || K();
        if (a6.c()) {
            this.f7870n0 = true;
            this.f7872o0 = 1;
            this.f7857a0 = this.f7849S != 0;
        }
        if ("c2.android.mp3.decoder".equals(fdVar.f7633a)) {
            this.f7860d0 = new C0741q2();
        }
        if (b() == 2) {
            this.f7861e0 = SystemClock.elapsedRealtime() + 1000;
        }
        this.f7833E0.f8810a++;
        a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
    }

    private static boolean d(String str) {
        return yp.f12451a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean e(String str) {
        int i9 = yp.f12451a;
        return i9 < 18 || (i9 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i9 == 19 && yp.f12453d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    public void b(boolean z8) {
        this.f7827B0 = z8;
    }

    private void b(d9 d9Var) {
        A();
        String str = d9Var.m;
        if (!MimeTypes.AUDIO_AAC.equals(str) && !MimeTypes.AUDIO_MPEG.equals(str) && !MimeTypes.AUDIO_OPUS.equals(str)) {
            this.f7883u.i(1);
        } else {
            this.f7883u.i(32);
        }
        this.f7866k0 = true;
    }

    private static boolean b(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    private void b(x6 x6Var) {
        x6.a(this.f7830D, x6Var);
        this.f7830D = x6Var;
    }

    public void c(boolean z8) {
        this.f7829C0 = z8;
    }

    private static boolean b(String str) {
        if (yp.f12451a < 21 && "OMX.SEC.mp3.dec".equals(str) && Constants.REFERRER_API_SAMSUNG.equals(yp.f12452c)) {
            String str2 = yp.b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    private boolean c(long j7) {
        int size = this.f7887w.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (((Long) this.f7887w.get(i9)).longValue() == j7) {
                this.f7887w.remove(i9);
                return true;
            }
        }
        return false;
    }

    @Override // com.applovin.impl.li
    public boolean c() {
        return this.f7890x0;
    }

    private static boolean c(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    private void c(x6 x6Var) {
        x6.a(this.f7832E, x6Var);
        this.f7832E = x6Var;
    }

    private static boolean c(String str) {
        int i9 = yp.f12451a;
        if (i9 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i9 <= 19) {
                String str2 = yp.b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    private static boolean b(String str, d9 d9Var) {
        return yp.f12451a <= 18 && d9Var.f7223z == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    private void a(MediaCrypto mediaCrypto, boolean z8) {
        if (this.f7846P == null) {
            try {
                List d2 = d(z8);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.f7846P = arrayDeque;
                if (this.f7873p) {
                    arrayDeque.addAll(d2);
                } else if (!d2.isEmpty()) {
                    this.f7846P.add((fd) d2.get(0));
                }
                this.f7847Q = null;
            } catch (id.c e4) {
                throw new a(this.f7826B, e4, z8, -49998);
            }
        }
        if (!this.f7846P.isEmpty()) {
            while (this.f7842K == null) {
                fd fdVar = (fd) this.f7846P.peekFirst();
                if (!b(fdVar)) {
                    return;
                }
                try {
                    a(fdVar, mediaCrypto);
                } catch (Exception e9) {
                    kc.c("MediaCodecRenderer", "Failed to initialize decoder: " + fdVar, e9);
                    this.f7846P.removeFirst();
                    a aVar = new a(this.f7826B, e9, z8, fdVar);
                    a(aVar);
                    if (this.f7847Q != null) {
                        this.f7847Q = this.f7847Q.a(aVar);
                    } else {
                        this.f7847Q = aVar;
                    }
                    if (this.f7846P.isEmpty()) {
                        throw this.f7847Q;
                    }
                }
            }
            this.f7846P = null;
            return;
        }
        throw new a(this.f7826B, (Throwable) null, z8, -49999);
    }

    @Override // com.applovin.impl.AbstractC0685d2
    public void a(boolean z8, boolean z9) {
        this.f7833E0 = new l5();
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

    @Override // com.applovin.impl.AbstractC0685d2
    public void a(long j7, boolean z8) {
        this.f7888w0 = false;
        this.f7890x0 = false;
        this.f7894z0 = false;
        if (this.f7866k0) {
            this.f7883u.b();
            this.f7881t.b();
            this.f7867l0 = false;
        } else {
            G();
        }
        if (this.f7885v.e() > 0) {
            this.f7892y0 = true;
        }
        this.f7885v.a();
        int i9 = this.f7839H0;
        if (i9 != 0) {
            int i10 = i9 - 1;
            this.f7837G0 = this.f7893z[i10];
            this.f7835F0 = this.f7891y[i10];
            this.f7839H0 = 0;
        }
    }

    @Override // com.applovin.impl.AbstractC0685d2
    public void a(d9[] d9VarArr, long j7, long j9) {
        if (this.f7837G0 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            AbstractC0669a1.b(this.f7835F0 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
            this.f7835F0 = j7;
            this.f7837G0 = j9;
            return;
        }
        int i9 = this.f7839H0;
        if (i9 == this.f7893z.length) {
            kc.d("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.f7893z[this.f7839H0 - 1]);
        } else {
            this.f7839H0 = i9 + 1;
        }
        long[] jArr = this.f7891y;
        int i10 = this.f7839H0 - 1;
        jArr[i10] = j7;
        this.f7893z[i10] = j9;
        this.f7824A[i10] = this.f7884u0;
    }

    @Override // com.applovin.impl.li
    public void a(long j7, long j9) {
        boolean z8 = false;
        if (this.f7894z0) {
            this.f7894z0 = false;
            R();
        }
        y7 y7Var = this.f7831D0;
        if (y7Var == null) {
            try {
                if (this.f7890x0) {
                    V();
                    return;
                }
                if (this.f7826B != null || e(2)) {
                    P();
                    if (this.f7866k0) {
                        lo.a("bypassRender");
                        do {
                        } while (b(j7, j9));
                        lo.a();
                    } else if (this.f7842K != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        lo.a("drainAndFeed");
                        while (c(j7, j9) && e(elapsedRealtime)) {
                        }
                        while (E() && e(elapsedRealtime)) {
                        }
                        lo.a();
                    } else {
                        this.f7833E0.f8812d += b(j7);
                        e(1);
                    }
                    this.f7833E0.a();
                    return;
                }
                return;
            } catch (IllegalStateException e4) {
                if (a(e4)) {
                    a((Exception) e4);
                    if (yp.f12451a >= 21 && c(e4)) {
                        z8 = true;
                    }
                    if (z8) {
                        U();
                    }
                    throw a(a(e4, J()), this.f7826B, z8, 4003);
                }
                throw e4;
            }
        }
        this.f7831D0 = null;
        throw y7Var;
    }

    public final void a(y7 y7Var) {
        this.f7831D0 = y7Var;
    }

    @Override // com.applovin.impl.li
    public void a(float f9, float f10) {
        this.f7840I = f9;
        this.f7841J = f10;
        e(this.f7843L);
    }

    @Override // com.applovin.impl.mi
    public final int a(d9 d9Var) {
        try {
            return a(this.f7871o, d9Var);
        } catch (id.c e4) {
            throw a(e4, d9Var, 4002);
        }
    }

    public ed a(Throwable th, fd fdVar) {
        return new ed(th, fdVar);
    }

    private static boolean a(IllegalStateException illegalStateException) {
        if (yp.f12451a >= 21 && b(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private int a(String str) {
        int i9 = yp.f12451a;
        if (i9 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = yp.f12453d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i9 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = yp.b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private static boolean a(String str, d9 d9Var) {
        return yp.f12451a < 21 && d9Var.f7212o.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }
}
