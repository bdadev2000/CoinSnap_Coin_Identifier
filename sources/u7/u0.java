package u7;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import com.applovin.impl.su;
import com.google.common.collect.z1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import s7.b2;
import s7.o2;

/* loaded from: classes3.dex */
public final class u0 extends k8.s implements n9.p {
    public final Context H0;
    public final r4.c I0;
    public final w J0;
    public int K0;
    public boolean L0;
    public s7.r0 M0;
    public s7.r0 N0;
    public long O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public s7.j0 S0;

    public u0(Context context, g0.j jVar, boolean z10, Handler handler, s7.f0 f0Var, r0 r0Var) {
        super(1, jVar, z10, 44100.0f);
        this.H0 = context.getApplicationContext();
        this.J0 = r0Var;
        this.I0 = new r4.c(handler, f0Var);
        r0Var.f25631r = new f.a(this);
    }

    public static z1 q0(k8.t tVar, s7.r0 r0Var, boolean z10, w wVar) {
        boolean z11;
        k8.o oVar;
        if (r0Var.f24723n == null) {
            com.google.common.collect.n0 n0Var = com.google.common.collect.r0.f12026c;
            return z1.f12062g;
        }
        if (((r0) wVar).g(r0Var) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            List e2 = k8.z.e(MimeTypes.AUDIO_RAW, false, false);
            if (e2.isEmpty()) {
                oVar = null;
            } else {
                oVar = (k8.o) e2.get(0);
            }
            if (oVar != null) {
                return com.google.common.collect.r0.o(oVar);
            }
        }
        return k8.z.g(tVar, r0Var, z10, false);
    }

    @Override // k8.s
    public final float J(float f10, s7.r0[] r0VarArr) {
        int i10 = -1;
        for (s7.r0 r0Var : r0VarArr) {
            int i11 = r0Var.B;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return f10 * i10;
    }

    @Override // k8.s
    public final ArrayList K(k8.t tVar, s7.r0 r0Var, boolean z10) {
        z1 q02 = q0(tVar, r0Var, z10, this.J0);
        Pattern pattern = k8.z.a;
        ArrayList arrayList = new ArrayList(q02);
        Collections.sort(arrayList, new k8.u(new androidx.core.app.h(r0Var, 24)));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010f  */
    @Override // k8.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k8.j L(k8.o r12, s7.r0 r13, android.media.MediaCrypto r14, float r15) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.u0.L(k8.o, s7.r0, android.media.MediaCrypto, float):k8.j");
    }

    @Override // k8.s
    public final void Q(Exception exc) {
        n9.o.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        r4.c cVar = this.I0;
        Handler handler = (Handler) cVar.f23999c;
        if (handler != null) {
            handler.post(new r(cVar, exc, 1));
        }
    }

    @Override // k8.s
    public final void R(String str, long j3, long j10) {
        r4.c cVar = this.I0;
        Handler handler = (Handler) cVar.f23999c;
        if (handler != null) {
            handler.post(new su(cVar, str, j3, j10, 2));
        }
    }

    @Override // k8.s
    public final void S(String str) {
        r4.c cVar = this.I0;
        Handler handler = (Handler) cVar.f23999c;
        if (handler != null) {
            handler.post(new com.facebook.r0(15, cVar, str));
        }
    }

    @Override // k8.s
    public final w7.k T(r4.c cVar) {
        s7.r0 r0Var = (s7.r0) cVar.f24000d;
        r0Var.getClass();
        this.M0 = r0Var;
        w7.k T = super.T(cVar);
        s7.r0 r0Var2 = this.M0;
        r4.c cVar2 = this.I0;
        Handler handler = (Handler) cVar2.f23999c;
        if (handler != null) {
            handler.post(new androidx.emoji2.text.n(11, cVar2, r0Var2, T));
        }
        return T;
    }

    @Override // k8.s
    public final void U(s7.r0 r0Var, MediaFormat mediaFormat) {
        int i10;
        int i11;
        s7.r0 r0Var2 = this.N0;
        int[] iArr = null;
        if (r0Var2 != null) {
            r0Var = r0Var2;
        } else if (this.L != null) {
            if (MimeTypes.AUDIO_RAW.equals(r0Var.f24723n)) {
                i10 = r0Var.C;
            } else if (n9.h0.a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i10 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i10 = n9.h0.s(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i10 = 2;
            }
            s7.q0 q0Var = new s7.q0();
            q0Var.f24667k = MimeTypes.AUDIO_RAW;
            q0Var.f24681z = i10;
            q0Var.A = r0Var.D;
            q0Var.B = r0Var.E;
            q0Var.f24679x = mediaFormat.getInteger("channel-count");
            q0Var.f24680y = mediaFormat.getInteger("sample-rate");
            s7.r0 r0Var3 = new s7.r0(q0Var);
            if (this.L0 && r0Var3.A == 6 && (i11 = r0Var.A) < 6) {
                int[] iArr2 = new int[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    iArr2[i12] = i12;
                }
                iArr = iArr2;
            }
            r0Var = r0Var3;
        }
        try {
            ((r0) this.J0).b(r0Var, iArr);
        } catch (t e2) {
            throw c(5001, e2.f25650b, e2, false);
        }
    }

    @Override // k8.s
    public final void V() {
        this.J0.getClass();
    }

    @Override // k8.s
    public final void X() {
        ((r0) this.J0).K = true;
    }

    @Override // k8.s
    public final void Y(w7.i iVar) {
        if (this.P0 && !iVar.d()) {
            if (Math.abs(iVar.f26892h - this.O0) > 500000) {
                this.O0 = iVar.f26892h;
            }
            this.P0 = false;
        }
    }

    @Override // n9.p
    public final void a(b2 b2Var) {
        r0 r0Var = (r0) this.J0;
        r0Var.getClass();
        r0Var.B = new b2(n9.h0.g(b2Var.f24302b, 0.1f, 8.0f), n9.h0.g(b2Var.f24303c, 0.1f, 8.0f));
        if (r0Var.v()) {
            r0Var.s();
        } else {
            r0Var.r(b2Var);
        }
    }

    @Override // k8.s
    public final boolean b0(long j3, long j10, k8.l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, s7.r0 r0Var) {
        byteBuffer.getClass();
        if (this.N0 != null && (i11 & 2) != 0) {
            lVar.getClass();
            lVar.k(i10, false);
            return true;
        }
        w wVar = this.J0;
        if (z10) {
            if (lVar != null) {
                lVar.k(i10, false);
            }
            this.C0.f26882f += i12;
            ((r0) wVar).K = true;
            return true;
        }
        try {
            if (!((r0) wVar).j(byteBuffer, j11, i12)) {
                return false;
            }
            if (lVar != null) {
                lVar.k(i10, false);
            }
            this.C0.f26881e += i12;
            return true;
        } catch (u e2) {
            throw c(5001, this.M0, e2, e2.f25652c);
        } catch (v e10) {
            throw c(5002, r0Var, e10, e10.f25654c);
        }
    }

    @Override // s7.g
    public final n9.p e() {
        return this;
    }

    @Override // k8.s
    public final void e0() {
        try {
            r0 r0Var = (r0) this.J0;
            if (!r0Var.T && r0Var.m() && r0Var.c()) {
                r0Var.o();
                r0Var.T = true;
            }
        } catch (v e2) {
            throw c(5002, e2.f25655d, e2, e2.f25654c);
        }
    }

    @Override // s7.g
    public final String f() {
        return "MediaCodecAudioRenderer";
    }

    @Override // n9.p
    public final b2 getPlaybackParameters() {
        return ((r0) this.J0).B;
    }

    @Override // n9.p
    public final long getPositionUs() {
        if (this.f24364i == 2) {
            r0();
        }
        return this.O0;
    }

    @Override // s7.g
    public final boolean h() {
        boolean z10;
        if (!this.f20375y0) {
            return false;
        }
        r0 r0Var = (r0) this.J0;
        if (r0Var.m() && (!r0Var.T || r0Var.k())) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    @Override // s7.g, s7.i2
    public final void handleMessage(int i10, Object obj) {
        b2 b2Var;
        boolean z10;
        w wVar = this.J0;
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 6) {
                    switch (i10) {
                        case 9:
                            r0 r0Var = (r0) wVar;
                            r0Var.C = ((Boolean) obj).booleanValue();
                            if (r0Var.v()) {
                                b2Var = b2.f24301f;
                            } else {
                                b2Var = r0Var.B;
                            }
                            r0Var.r(b2Var);
                            return;
                        case 10:
                            int intValue = ((Integer) obj).intValue();
                            r0 r0Var2 = (r0) wVar;
                            if (r0Var2.X != intValue) {
                                r0Var2.X = intValue;
                                if (intValue != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                r0Var2.W = z10;
                                r0Var2.d();
                                return;
                            }
                            return;
                        case 11:
                            this.S0 = (s7.j0) obj;
                            return;
                        case 12:
                            if (n9.h0.a >= 23) {
                                t0.a(wVar, obj);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                a0 a0Var = (a0) obj;
                r0 r0Var3 = (r0) wVar;
                if (!r0Var3.Y.equals(a0Var)) {
                    a0Var.getClass();
                    if (r0Var3.f25634v != null) {
                        r0Var3.Y.getClass();
                    }
                    r0Var3.Y = a0Var;
                    return;
                }
                return;
            }
            e eVar = (e) obj;
            r0 r0Var4 = (r0) wVar;
            if (!r0Var4.f25637y.equals(eVar)) {
                r0Var4.f25637y = eVar;
                if (!r0Var4.f25609a0) {
                    r0Var4.d();
                    return;
                }
                return;
            }
            return;
        }
        float floatValue = ((Float) obj).floatValue();
        r0 r0Var5 = (r0) wVar;
        if (r0Var5.N != floatValue) {
            r0Var5.N = floatValue;
            r0Var5.t();
        }
    }

    @Override // k8.s, s7.g
    public final boolean i() {
        return ((r0) this.J0).k() || super.i();
    }

    @Override // k8.s, s7.g
    public final void j() {
        r4.c cVar = this.I0;
        this.R0 = true;
        this.M0 = null;
        try {
            ((r0) this.J0).d();
            try {
                super.j();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.j();
                throw th2;
            } finally {
            }
        }
    }

    @Override // s7.g
    public final void k(boolean z10, boolean z11) {
        w7.f fVar = new w7.f();
        this.C0 = fVar;
        r4.c cVar = this.I0;
        Handler handler = (Handler) cVar.f23999c;
        int i10 = 1;
        if (handler != null) {
            handler.post(new q(cVar, fVar, i10));
        }
        o2 o2Var = this.f24361f;
        o2Var.getClass();
        boolean z12 = o2Var.a;
        boolean z13 = false;
        w wVar = this.J0;
        if (z12) {
            r0 r0Var = (r0) wVar;
            r0Var.getClass();
            if (n9.h0.a >= 21) {
                z13 = true;
            }
            v8.u0.m(z13);
            v8.u0.m(r0Var.W);
            if (!r0Var.f25609a0) {
                r0Var.f25609a0 = true;
                r0Var.d();
            }
        } else {
            r0 r0Var2 = (r0) wVar;
            if (r0Var2.f25609a0) {
                r0Var2.f25609a0 = false;
                r0Var2.d();
            }
        }
        t7.x xVar = this.f24363h;
        xVar.getClass();
        ((r0) wVar).f25630q = xVar;
    }

    @Override // k8.s
    public final boolean k0(s7.r0 r0Var) {
        if (((r0) this.J0).g(r0Var) != 0) {
            return true;
        }
        return false;
    }

    @Override // k8.s, s7.g
    public final void l(long j3, boolean z10) {
        super.l(j3, z10);
        ((r0) this.J0).d();
        this.O0 = j3;
        this.P0 = true;
        this.Q0 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        if (r4 != null) goto L33;
     */
    @Override // k8.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int l0(k8.t r12, s7.r0 r13) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.u0.l0(k8.t, s7.r0):int");
    }

    @Override // s7.g
    public final void m() {
        j jVar;
        l lVar = ((r0) this.J0).f25636x;
        if (lVar != null && lVar.f25585h) {
            lVar.f25584g = null;
            int i10 = n9.h0.a;
            Context context = lVar.a;
            if (i10 >= 23 && (jVar = lVar.f25581d) != null) {
                i.b(context, jVar);
            }
            h.c0 c0Var = lVar.f25582e;
            if (c0Var != null) {
                context.unregisterReceiver(c0Var);
            }
            k kVar = lVar.f25583f;
            if (kVar != null) {
                kVar.a.unregisterContentObserver(kVar);
            }
            lVar.f25585h = false;
        }
    }

    @Override // s7.g
    public final void n() {
        w wVar = this.J0;
        try {
            try {
                B();
                d0();
            } finally {
                x7.n.c(this.F, null);
                this.F = null;
            }
        } finally {
            if (this.R0) {
                this.R0 = false;
                ((r0) wVar).q();
            }
        }
    }

    @Override // s7.g
    public final void o() {
        r0 r0Var = (r0) this.J0;
        r0Var.V = true;
        if (r0Var.m()) {
            y yVar = r0Var.f25622i.f25717f;
            yVar.getClass();
            yVar.a();
            r0Var.f25634v.play();
        }
    }

    @Override // s7.g
    public final void p() {
        r0();
        r0 r0Var = (r0) this.J0;
        boolean z10 = false;
        r0Var.V = false;
        if (r0Var.m()) {
            z zVar = r0Var.f25622i;
            zVar.d();
            if (zVar.f25735y == C.TIME_UNSET) {
                y yVar = zVar.f25717f;
                yVar.getClass();
                yVar.a();
                z10 = true;
            }
            if (z10) {
                r0Var.f25634v.pause();
            }
        }
    }

    public final int p0(s7.r0 r0Var, k8.o oVar) {
        int i10;
        if ("OMX.google.raw.decoder".equals(oVar.a) && (i10 = n9.h0.a) < 24 && (i10 != 23 || !n9.h0.G(this.H0))) {
            return -1;
        }
        return r0Var.f24724o;
    }

    public final void r0() {
        long j3;
        ArrayDeque arrayDeque;
        long q10;
        long j10;
        boolean h10 = h();
        r0 r0Var = (r0) this.J0;
        if (r0Var.m() && !r0Var.L) {
            long min = Math.min(r0Var.f25622i.a(h10), (r0Var.i() * 1000000) / r0Var.f25633t.f25573e);
            while (true) {
                arrayDeque = r0Var.f25623j;
                if (arrayDeque.isEmpty() || min < ((l0) arrayDeque.getFirst()).f25587c) {
                    break;
                } else {
                    r0Var.A = (l0) arrayDeque.remove();
                }
            }
            l0 l0Var = r0Var.A;
            long j11 = min - l0Var.f25587c;
            boolean equals = l0Var.a.equals(b2.f24301f);
            h.c cVar = r0Var.f25610b;
            if (equals) {
                q10 = r0Var.A.f25586b + j11;
            } else if (arrayDeque.isEmpty()) {
                x0 x0Var = (x0) cVar.f18525f;
                if (x0Var.f25705o >= 1024) {
                    long j12 = x0Var.f25704n;
                    x0Var.f25700j.getClass();
                    long j13 = j12 - ((r3.f25677k * r3.f25668b) * 2);
                    int i10 = x0Var.f25698h.a;
                    int i11 = x0Var.f25697g.a;
                    if (i10 == i11) {
                        j10 = n9.h0.M(j11, j13, x0Var.f25705o);
                    } else {
                        j10 = n9.h0.M(j11, j13 * i10, x0Var.f25705o * i11);
                    }
                } else {
                    j10 = (long) (x0Var.f25693c * j11);
                }
                q10 = j10 + r0Var.A.f25586b;
            } else {
                l0 l0Var2 = (l0) arrayDeque.getFirst();
                q10 = l0Var2.f25586b - n9.h0.q(l0Var2.f25587c - min, r0Var.A.a.f24302b);
            }
            j3 = ((((v0) cVar.f18524d).f25667t * 1000000) / r0Var.f25633t.f25573e) + q10;
        } else {
            j3 = Long.MIN_VALUE;
        }
        if (j3 != Long.MIN_VALUE) {
            if (!this.Q0) {
                j3 = Math.max(this.O0, j3);
            }
            this.O0 = j3;
            this.Q0 = false;
        }
    }

    @Override // k8.s
    public final w7.k z(k8.o oVar, s7.r0 r0Var, s7.r0 r0Var2) {
        boolean z10;
        w7.k b3 = oVar.b(r0Var, r0Var2);
        int i10 = 0;
        if (this.F == null && k0(r0Var2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = b3.f26900e;
        if (z10) {
            i11 |= 32768;
        }
        if (p0(r0Var2, oVar) > this.K0) {
            i11 |= 64;
        }
        int i12 = i11;
        String str = oVar.a;
        if (i12 == 0) {
            i10 = b3.f26899d;
        }
        return new w7.k(str, r0Var, r0Var2, i10, i12);
    }
}
