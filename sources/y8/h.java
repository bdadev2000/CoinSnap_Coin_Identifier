package y8;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ic.t;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import m9.n0;
import m9.o0;
import m9.p0;
import m9.q0;
import m9.v0;
import m9.w0;
import n9.a0;
import n9.h0;
import s7.d1;
import s7.e1;
import s7.j1;
import t7.x;
import v8.u0;
import v8.w;
import v8.y0;
import v8.z;
import x7.u;

/* loaded from: classes3.dex */
public final class h extends v8.a {
    public static final /* synthetic */ int Q = 0;
    public m9.l A;
    public n0 B;
    public w0 C;
    public x3.a D;
    public Handler E;
    public d1 F;
    public Uri G;
    public final Uri H;
    public z8.c I;
    public boolean J;
    public long K;
    public long L;
    public long M;
    public int N;
    public long O;
    public int P;

    /* renamed from: h, reason: collision with root package name */
    public final j1 f28061h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f28062i;

    /* renamed from: j, reason: collision with root package name */
    public final m9.k f28063j;

    /* renamed from: k, reason: collision with root package name */
    public final j f28064k;

    /* renamed from: l, reason: collision with root package name */
    public final com.facebook.internal.m f28065l;

    /* renamed from: m, reason: collision with root package name */
    public final u f28066m;

    /* renamed from: n, reason: collision with root package name */
    public final ac.e f28067n;

    /* renamed from: o, reason: collision with root package name */
    public final t f28068o;

    /* renamed from: p, reason: collision with root package name */
    public final long f28069p;

    /* renamed from: q, reason: collision with root package name */
    public final long f28070q;

    /* renamed from: r, reason: collision with root package name */
    public final f0.c f28071r;

    /* renamed from: s, reason: collision with root package name */
    public final p0 f28072s;

    /* renamed from: t, reason: collision with root package name */
    public final g f28073t;
    public final Object u;

    /* renamed from: v, reason: collision with root package name */
    public final SparseArray f28074v;

    /* renamed from: w, reason: collision with root package name */
    public final d f28075w;

    /* renamed from: x, reason: collision with root package name */
    public final d f28076x;

    /* renamed from: y, reason: collision with root package name */
    public final y7.u f28077y;

    /* renamed from: z, reason: collision with root package name */
    public final o0 f28078z;

    static {
        s7.p0.a("goog.exo.dash");
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [y8.d] */
    /* JADX WARN: Type inference failed for: r2v9, types: [y8.d] */
    public h(j1 j1Var, m9.k kVar, p0 p0Var, j jVar, com.facebook.internal.m mVar, u uVar, ac.e eVar, long j3, long j10) {
        this.f28061h = j1Var;
        this.F = j1Var.f24454d;
        e1 e1Var = j1Var.f24453c;
        e1Var.getClass();
        Uri uri = e1Var.f24342b;
        this.G = uri;
        this.H = uri;
        this.I = null;
        this.f28063j = kVar;
        this.f28072s = p0Var;
        this.f28064k = jVar;
        this.f28066m = uVar;
        this.f28067n = eVar;
        this.f28069p = j3;
        this.f28070q = j10;
        this.f28065l = mVar;
        this.f28068o = new t(7);
        final int i10 = 0;
        this.f28062i = false;
        this.f28071r = new f0.c((CopyOnWriteArrayList) this.f26069c.f17517d, 0, (z) null);
        this.u = new Object();
        this.f28074v = new SparseArray();
        this.f28077y = new y7.u(this);
        this.O = C.TIME_UNSET;
        this.M = C.TIME_UNSET;
        this.f28073t = new g(this, i10);
        this.f28078z = new v3.c(this, 28);
        this.f28075w = new Runnable(this) { // from class: y8.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h f28047c;

            {
                this.f28047c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i11 = i10;
                h hVar = this.f28047c;
                switch (i11) {
                    case 0:
                        hVar.w();
                        return;
                    default:
                        hVar.u(false);
                        return;
                }
            }
        };
        final int i11 = 1;
        this.f28076x = new Runnable(this) { // from class: y8.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h f28047c;

            {
                this.f28047c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i11;
                h hVar = this.f28047c;
                switch (i112) {
                    case 0:
                        hVar.w();
                        return;
                    default:
                        hVar.u(false);
                        return;
                }
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean r(z8.h r5) {
        /*
            r0 = 0
            r1 = r0
        L2:
            java.util.List r2 = r5.f28622c
            int r3 = r2.size()
            if (r1 >= r3) goto L1d
            java.lang.Object r2 = r2.get(r1)
            z8.a r2 = (z8.a) r2
            int r2 = r2.f28583b
            r3 = 1
            if (r2 == r3) goto L1c
            r4 = 2
            if (r2 != r4) goto L19
            goto L1c
        L19:
            int r1 = r1 + 1
            goto L2
        L1c:
            return r3
        L1d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.h.r(z8.h):boolean");
    }

    @Override // v8.a
    public final w a(z zVar, m9.q qVar, long j3) {
        int intValue = ((Integer) zVar.a).intValue() - this.P;
        f0.c cVar = new f0.c((CopyOnWriteArrayList) this.f26069c.f17517d, 0, zVar);
        x7.q qVar2 = new x7.q(this.f26070d.f27497c, 0, zVar);
        int i10 = this.P + intValue;
        z8.c cVar2 = this.I;
        t tVar = this.f28068o;
        j jVar = this.f28064k;
        w0 w0Var = this.C;
        u uVar = this.f28066m;
        ac.e eVar = this.f28067n;
        long j10 = this.M;
        o0 o0Var = this.f28078z;
        com.facebook.internal.m mVar = this.f28065l;
        y7.u uVar2 = this.f28077y;
        x xVar = this.f26073g;
        u0.p(xVar);
        c cVar3 = new c(i10, cVar2, tVar, intValue, jVar, w0Var, uVar, qVar2, eVar, cVar, j10, o0Var, qVar, mVar, uVar2, xVar);
        this.f28074v.put(i10, cVar3);
        return cVar3;
    }

    @Override // v8.a
    public final j1 g() {
        return this.f28061h;
    }

    @Override // v8.a
    public final void i() {
        this.f28078z.maybeThrowError();
    }

    @Override // v8.a
    public final void k(w0 w0Var) {
        this.C = w0Var;
        Looper myLooper = Looper.myLooper();
        x xVar = this.f26073g;
        u0.p(xVar);
        u uVar = this.f28066m;
        uVar.e(myLooper, xVar);
        uVar.c();
        if (this.f28062i) {
            u(false);
            return;
        }
        this.A = this.f28063j.createDataSource();
        this.B = new n0("DashMediaSource");
        this.E = h0.j(null);
        w();
    }

    @Override // v8.a
    public final void m(w wVar) {
        c cVar = (c) wVar;
        q qVar = cVar.f28036o;
        qVar.f28121k = true;
        qVar.f28116f.removeCallbacksAndMessages(null);
        for (x8.j jVar : cVar.f28041t) {
            jVar.f27552t = cVar;
            y0 y0Var = jVar.f27547o;
            y0Var.i();
            x7.n nVar = y0Var.f26328h;
            if (nVar != null) {
                nVar.e(y0Var.f26325e);
                y0Var.f26328h = null;
                y0Var.f26327g = null;
            }
            for (y0 y0Var2 : jVar.f27548p) {
                y0Var2.i();
                x7.n nVar2 = y0Var2.f26328h;
                if (nVar2 != null) {
                    nVar2.e(y0Var2.f26325e);
                    y0Var2.f26328h = null;
                    y0Var2.f26327g = null;
                }
            }
            jVar.f27543k.b(jVar);
        }
        cVar.f28040s = null;
        this.f28074v.remove(cVar.f28024b);
    }

    @Override // v8.a
    public final void o() {
        z8.c cVar;
        this.J = false;
        this.A = null;
        n0 n0Var = this.B;
        if (n0Var != null) {
            n0Var.b(null);
            this.B = null;
        }
        this.K = 0L;
        this.L = 0L;
        if (this.f28062i) {
            cVar = this.I;
        } else {
            cVar = null;
        }
        this.I = cVar;
        this.G = this.H;
        this.D = null;
        Handler handler = this.E;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.E = null;
        }
        this.M = C.TIME_UNSET;
        this.N = 0;
        this.O = C.TIME_UNSET;
        this.f28074v.clear();
        t tVar = this.f28068o;
        ((Map) tVar.a).clear();
        ((Map) tVar.f19574b).clear();
        ((Map) tVar.f19575c).clear();
        this.f28066m.release();
    }

    public final void s() {
        boolean z10;
        n0 n0Var = this.B;
        y7.q qVar = new y7.q(this);
        synchronized (a0.f22513b) {
            z10 = a0.f22514c;
        }
        if (z10) {
            qVar.c();
            return;
        }
        if (n0Var == null) {
            n0Var = new n0("SntpClient");
        }
        n0Var.c(new com.facebook.internal.m((com.facebook.internal.k) null), new g(qVar, 2), 1);
    }

    public final void t(q0 q0Var, long j3, long j10) {
        long j11 = q0Var.f21720b;
        v0 v0Var = q0Var.f21723f;
        Uri uri = v0Var.f21778c;
        v8.p pVar = new v8.p(v0Var.f21779d);
        this.f28067n.getClass();
        this.f28071r.l(pVar, q0Var.f21722d, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01cf, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x04ac, code lost:
    
        if (r12 > 0) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x04af, code lost:
    
        if (r12 < 0) goto L236;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:216:0x0481. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:258:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c5  */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19, types: [int] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [int] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r2v48, types: [k9.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(boolean r41) {
        /*
            Method dump skipped, instructions count: 1302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.h.u(boolean):void");
    }

    public final void v(q0 q0Var, g gVar, int i10) {
        this.f28071r.r(new v8.p(q0Var.f21720b, q0Var.f21721c, this.B.c(q0Var, gVar, i10)), q0Var.f21722d, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
    }

    public final void w() {
        boolean z10;
        Uri uri;
        this.E.removeCallbacks(this.f28075w);
        n0 n0Var = this.B;
        if (n0Var.f21695d != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        if (n0Var.a()) {
            this.J = true;
            return;
        }
        synchronized (this.u) {
            uri = this.G;
        }
        this.J = false;
        v(new q0(this.A, uri, 4, this.f28072s), this.f28073t, this.f28067n.i(4));
    }
}
