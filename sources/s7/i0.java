package s7;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.appcompat.widget.r3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class i0 extends f {

    /* renamed from: i0, reason: collision with root package name */
    public static final /* synthetic */ int f24392i0 = 0;
    public final r3 A;
    public final r3 B;
    public final long C;
    public int D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public int I;
    public final p2 J;
    public v8.c1 K;
    public d2 L;
    public l1 M;
    public AudioTrack N;
    public Object O;
    public Surface P;
    public SurfaceHolder Q;
    public p9.k R;
    public boolean S;
    public TextureView T;
    public final int U;
    public n9.y V;
    public final int W;
    public final u7.e X;
    public float Y;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public a9.c f24393a0;

    /* renamed from: b, reason: collision with root package name */
    public final k9.x f24394b;

    /* renamed from: b0, reason: collision with root package name */
    public final boolean f24395b0;

    /* renamed from: c, reason: collision with root package name */
    public final d2 f24396c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f24397c0;

    /* renamed from: d, reason: collision with root package name */
    public final a4.g0 f24398d = new a4.g0(3);

    /* renamed from: d0, reason: collision with root package name */
    public o9.z f24399d0;

    /* renamed from: e, reason: collision with root package name */
    public final Context f24400e;

    /* renamed from: e0, reason: collision with root package name */
    public l1 f24401e0;

    /* renamed from: f, reason: collision with root package name */
    public final h2 f24402f;

    /* renamed from: f0, reason: collision with root package name */
    public a2 f24403f0;

    /* renamed from: g, reason: collision with root package name */
    public final g[] f24404g;

    /* renamed from: g0, reason: collision with root package name */
    public int f24405g0;

    /* renamed from: h, reason: collision with root package name */
    public final k9.t f24406h;

    /* renamed from: h0, reason: collision with root package name */
    public long f24407h0;

    /* renamed from: i, reason: collision with root package name */
    public final n9.e0 f24408i;

    /* renamed from: j, reason: collision with root package name */
    public final y f24409j;

    /* renamed from: k, reason: collision with root package name */
    public final o0 f24410k;

    /* renamed from: l, reason: collision with root package name */
    public final x.e f24411l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArraySet f24412m;

    /* renamed from: n, reason: collision with root package name */
    public final v2 f24413n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f24414o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f24415p;

    /* renamed from: q, reason: collision with root package name */
    public final v8.y f24416q;

    /* renamed from: r, reason: collision with root package name */
    public final t7.a f24417r;

    /* renamed from: s, reason: collision with root package name */
    public final Looper f24418s;

    /* renamed from: t, reason: collision with root package name */
    public final m9.e f24419t;
    public final long u;

    /* renamed from: v, reason: collision with root package name */
    public final long f24420v;

    /* renamed from: w, reason: collision with root package name */
    public final n9.c0 f24421w;

    /* renamed from: x, reason: collision with root package name */
    public final f0 f24422x;

    /* renamed from: y, reason: collision with root package name */
    public final g0 f24423y;

    /* renamed from: z, reason: collision with root package name */
    public final e f24424z;

    static {
        p0.a("goog.exo.exoplayer");
    }

    public i0(w wVar) {
        boolean z10;
        t7.x a;
        boolean z11;
        try {
            n9.o.e("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.19.0] [" + n9.h0.f22547e + "]");
            this.f24400e = wVar.a.getApplicationContext();
            this.f24417r = (t7.a) wVar.f24798h.apply(wVar.f24792b);
            this.X = wVar.f24800j;
            this.U = wVar.f24801k;
            this.Z = false;
            this.C = wVar.f24807q;
            f0 f0Var = new f0(this);
            this.f24422x = f0Var;
            this.f24423y = new g0();
            Handler handler = new Handler(wVar.f24799i);
            g[] a10 = ((p) wVar.f24793c.get()).a(handler, f0Var, f0Var, f0Var, f0Var);
            this.f24404g = a10;
            if (a10.length > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            v8.u0.m(z10);
            this.f24406h = (k9.t) wVar.f24795e.get();
            this.f24416q = (v8.y) wVar.f24794d.get();
            this.f24419t = (m9.e) wVar.f24797g.get();
            this.f24415p = wVar.f24802l;
            this.J = wVar.f24803m;
            this.u = wVar.f24804n;
            this.f24420v = wVar.f24805o;
            Looper looper = wVar.f24799i;
            this.f24418s = looper;
            n9.c0 c0Var = wVar.f24792b;
            this.f24421w = c0Var;
            this.f24402f = this;
            this.f24411l = new x.e(looper, c0Var, new y(this));
            this.f24412m = new CopyOnWriteArraySet();
            this.f24414o = new ArrayList();
            this.K = new v8.c1();
            this.f24394b = new k9.x(new o2[a10.length], new k9.q[a10.length], z2.f24896c, null);
            this.f24413n = new v2();
            c2 c2Var = new c2();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 24, 27, 28, 32};
            a4.g0 g0Var = c2Var.a;
            g0Var.getClass();
            for (int i10 = 0; i10 < 19; i10++) {
                g0Var.a(iArr[i10]);
            }
            this.f24406h.getClass();
            c2Var.a(29, true);
            c2Var.a(23, false);
            c2Var.a(25, false);
            c2Var.a(33, false);
            c2Var.a(26, false);
            c2Var.a(34, false);
            d2 b3 = c2Var.b();
            this.f24396c = b3;
            c2 c2Var2 = new c2();
            n9.g gVar = b3.f24324b;
            a4.g0 g0Var2 = c2Var2.a;
            g0Var2.getClass();
            for (int i11 = 0; i11 < gVar.b(); i11++) {
                g0Var2.a(gVar.a(i11));
            }
            c2Var2.a.a(4);
            c2Var2.a.a(10);
            this.L = c2Var2.b();
            this.f24408i = this.f24421w.a(this.f24418s, null);
            y yVar = new y(this);
            this.f24409j = yVar;
            this.f24403f0 = a2.g(this.f24394b);
            ((t7.p) this.f24417r).R(this.f24402f, this.f24418s);
            int i12 = n9.h0.a;
            if (i12 < 31) {
                a = new t7.x();
            } else {
                a = d0.a(this.f24400e, this, wVar.f24808r);
            }
            this.f24410k = new o0(this.f24404g, this.f24406h, this.f24394b, (u0) wVar.f24796f.get(), this.f24419t, this.D, this.E, this.f24417r, this.J, wVar.f24806p, false, this.f24418s, this.f24421w, yVar, a);
            this.Y = 1.0f;
            this.D = 0;
            l1 l1Var = l1.K;
            this.M = l1Var;
            this.f24401e0 = l1Var;
            int i13 = -1;
            this.f24405g0 = -1;
            if (i12 < 21) {
                AudioTrack audioTrack = this.N;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.N.release();
                    this.N = null;
                }
                if (this.N == null) {
                    this.N = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.W = this.N.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.f24400e.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                if (audioManager != null) {
                    i13 = audioManager.generateAudioSessionId();
                }
                this.W = i13;
            }
            this.f24393a0 = a9.c.f382c;
            this.f24395b0 = true;
            t7.a aVar = this.f24417r;
            aVar.getClass();
            this.f24411l.a(aVar);
            ((m9.t) this.f24419t).a(new Handler(this.f24418s), this.f24417r);
            this.f24412m.add(this.f24422x);
            new com.bumptech.glide.manager.r(wVar.a, handler, this.f24422x).l(false);
            e eVar = new e(wVar.a, handler, this.f24422x);
            this.f24424z = eVar;
            eVar.c();
            r3 r3Var = new r3(wVar.a, 1);
            this.A = r3Var;
            r3Var.a();
            r3 r3Var2 = new r3(wVar.a, 2);
            this.B = r3Var2;
            r3Var2.a();
            o(null);
            this.f24399d0 = o9.z.f23275g;
            this.V = n9.y.f22601c;
            k9.t tVar = this.f24406h;
            u7.e eVar2 = this.X;
            k9.o oVar = (k9.o) tVar;
            synchronized (oVar.f20463c) {
                z11 = !oVar.f20469i.equals(eVar2);
                oVar.f20469i = eVar2;
            }
            if (z11) {
                oVar.d();
            }
            J(1, 10, Integer.valueOf(this.W));
            J(2, 10, Integer.valueOf(this.W));
            J(1, 3, this.X);
            J(2, 4, Integer.valueOf(this.U));
            J(2, 5, 0);
            J(1, 9, Boolean.valueOf(this.Z));
            J(2, 7, this.f24423y);
            J(6, 8, this.f24423y);
        } finally {
            this.f24398d.c();
        }
    }

    public static long B(a2 a2Var) {
        w2 w2Var = new w2();
        v2 v2Var = new v2();
        a2Var.a.g(a2Var.f24265b.a, v2Var);
        long j3 = a2Var.f24266c;
        if (j3 == C.TIME_UNSET) {
            return a2Var.a.m(v2Var.f24787d, w2Var).f24851o;
        }
        return v2Var.f24789g + j3;
    }

    public static q o(s2 s2Var) {
        int i10;
        int i11 = 0;
        androidx.datastore.preferences.protobuf.o oVar = new androidx.datastore.preferences.protobuf.o(0);
        if (s2Var != null && n9.h0.a >= 28) {
            i10 = ((AudioManager) s2Var.f24756g).getStreamMinVolume(s2Var.f24752c);
        } else {
            i10 = 0;
        }
        oVar.f1445b = i10;
        if (s2Var != null) {
            i11 = ((AudioManager) s2Var.f24756g).getStreamMaxVolume(s2Var.f24752c);
        }
        oVar.f1446c = i11;
        return oVar.b();
    }

    public final int A() {
        S();
        return this.f24403f0.f24268e;
    }

    public final boolean C() {
        S();
        return this.f24403f0.f24265b.a();
    }

    public final a2 D(a2 a2Var, x2 x2Var, Pair pair) {
        boolean z10;
        v8.z zVar;
        v8.j1 j1Var;
        k9.x xVar;
        List list;
        long j3;
        if (!x2Var.p() && pair == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        v8.u0.d(z10);
        x2 x2Var2 = a2Var.a;
        long q10 = q(a2Var);
        a2 f10 = a2Var.f(x2Var);
        if (x2Var.p()) {
            v8.z zVar2 = a2.f24264t;
            long H = n9.h0.H(this.f24407h0);
            a2 a = f10.b(zVar2, H, H, H, 0L, v8.j1.f26179f, this.f24394b, com.google.common.collect.z1.f12062g).a(zVar2);
            a.f24279p = a.f24281r;
            return a;
        }
        Object obj = f10.f24265b.a;
        boolean z11 = !obj.equals(pair.first);
        if (z11) {
            zVar = new v8.z(pair.first);
        } else {
            zVar = f10.f24265b;
        }
        v8.z zVar3 = zVar;
        long longValue = ((Long) pair.second).longValue();
        long H2 = n9.h0.H(q10);
        if (!x2Var2.p()) {
            H2 -= x2Var2.g(obj, this.f24413n).f24789g;
        }
        if (!z11 && longValue >= H2) {
            if (longValue == H2) {
                int b3 = x2Var.b(f10.f24274k.a);
                if (b3 == -1 || x2Var.f(b3, this.f24413n, false).f24787d != x2Var.g(zVar3.a, this.f24413n).f24787d) {
                    x2Var.g(zVar3.a, this.f24413n);
                    if (zVar3.a()) {
                        j3 = this.f24413n.a(zVar3.f26318b, zVar3.f26319c);
                    } else {
                        j3 = this.f24413n.f24788f;
                    }
                    a2 a10 = f10.b(zVar3, f10.f24281r, f10.f24281r, f10.f24267d, j3 - f10.f24281r, f10.f24271h, f10.f24272i, f10.f24273j).a(zVar3);
                    a10.f24279p = j3;
                    return a10;
                }
                return f10;
            }
            v8.u0.m(!zVar3.a());
            long max = Math.max(0L, f10.f24280q - (longValue - H2));
            long j10 = f10.f24279p;
            if (f10.f24274k.equals(f10.f24265b)) {
                j10 = longValue + max;
            }
            a2 b10 = f10.b(zVar3, longValue, longValue, longValue, max, f10.f24271h, f10.f24272i, f10.f24273j);
            b10.f24279p = j10;
            return b10;
        }
        v8.u0.m(!zVar3.a());
        if (z11) {
            j1Var = v8.j1.f26179f;
        } else {
            j1Var = f10.f24271h;
        }
        v8.j1 j1Var2 = j1Var;
        if (z11) {
            xVar = this.f24394b;
        } else {
            xVar = f10.f24272i;
        }
        k9.x xVar2 = xVar;
        if (z11) {
            com.google.common.collect.n0 n0Var = com.google.common.collect.r0.f12026c;
            list = com.google.common.collect.z1.f12062g;
        } else {
            list = f10.f24273j;
        }
        a2 a11 = f10.b(zVar3, longValue, longValue, longValue, 0L, j1Var2, xVar2, list).a(zVar3);
        a11.f24279p = longValue;
        return a11;
    }

    public final Pair E(x2 x2Var, int i10, long j3) {
        if (x2Var.p()) {
            this.f24405g0 = i10;
            if (j3 == C.TIME_UNSET) {
                j3 = 0;
            }
            this.f24407h0 = j3;
            return null;
        }
        if (i10 == -1 || i10 >= x2Var.o()) {
            i10 = x2Var.a(this.E);
            j3 = n9.h0.Q(x2Var.m(i10, this.a).f24851o);
        }
        return x2Var.i(this.a, this.f24413n, i10, n9.h0.H(j3));
    }

    public final void F(final int i10, final int i11) {
        n9.y yVar = this.V;
        if (i10 != yVar.a || i11 != yVar.f22602b) {
            this.V = new n9.y(i10, i11);
            this.f24411l.k(24, new n9.l() { // from class: s7.x
                @Override // n9.l
                public final void invoke(Object obj) {
                    ((f2) obj).t(i10, i11);
                }
            });
            J(2, 14, new n9.y(i10, i11));
        }
    }

    public final void G() {
        int i10;
        S();
        boolean z10 = z();
        int i11 = 2;
        int e2 = this.f24424z.e(2, z10);
        if (z10 && e2 != 1) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        P(e2, i10, z10);
        a2 a2Var = this.f24403f0;
        if (a2Var.f24268e != 1) {
            return;
        }
        a2 d10 = a2Var.d(null);
        if (d10.a.p()) {
            i11 = 4;
        }
        a2 e10 = d10.e(i11);
        this.F++;
        n9.e0 e0Var = this.f24410k.f24620j;
        e0Var.getClass();
        n9.d0 b3 = n9.e0.b();
        b3.a = e0Var.a.obtainMessage(0);
        b3.a();
        Q(e10, 1, 1, false, 5, C.TIME_UNSET, -1, false);
    }

    public final void H(f2 f2Var) {
        S();
        f2Var.getClass();
        x.e eVar = this.f24411l;
        eVar.l();
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) eVar.f27261f;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            n9.n nVar = (n9.n) it.next();
            if (nVar.a.equals(f2Var)) {
                n9.m mVar = (n9.m) eVar.f27260e;
                nVar.f22560d = true;
                if (nVar.f22559c) {
                    nVar.f22559c = false;
                    mVar.c(nVar.a, nVar.f22558b.b());
                }
                copyOnWriteArraySet.remove(nVar);
            }
        }
    }

    public final void I() {
        p9.k kVar = this.R;
        f0 f0Var = this.f24422x;
        if (kVar != null) {
            j2 p10 = p(this.f24423y);
            v8.u0.m(!p10.f24463g);
            p10.f24460d = 10000;
            v8.u0.m(!p10.f24463g);
            p10.f24461e = null;
            p10.c();
            this.R.f23544b.remove(f0Var);
            this.R = null;
        }
        TextureView textureView = this.T;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != f0Var) {
                n9.o.f("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.T.setSurfaceTextureListener(null);
            }
            this.T = null;
        }
        SurfaceHolder surfaceHolder = this.Q;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(f0Var);
            this.Q = null;
        }
    }

    public final void J(int i10, int i11, Object obj) {
        for (g gVar : this.f24404g) {
            if (gVar.f24359c == i10) {
                j2 p10 = p(gVar);
                v8.u0.m(!p10.f24463g);
                p10.f24460d = i11;
                v8.u0.m(!p10.f24463g);
                p10.f24461e = obj;
                p10.c();
            }
        }
    }

    public final void K(SurfaceHolder surfaceHolder) {
        this.S = false;
        this.Q = surfaceHolder;
        surfaceHolder.addCallback(this.f24422x);
        Surface surface = this.Q.getSurface();
        if (surface != null && surface.isValid()) {
            Rect surfaceFrame = this.Q.getSurfaceFrame();
            F(surfaceFrame.width(), surfaceFrame.height());
        } else {
            F(0, 0);
        }
    }

    public final void L(boolean z10) {
        S();
        int e2 = this.f24424z.e(A(), z10);
        int i10 = 1;
        if (z10 && e2 != 1) {
            i10 = 2;
        }
        P(e2, i10, z10);
    }

    public final void M(int i10) {
        S();
        if (this.D != i10) {
            this.D = i10;
            n9.e0 e0Var = this.f24410k.f24620j;
            e0Var.getClass();
            n9.d0 b3 = n9.e0.b();
            b3.a = e0Var.a.obtainMessage(11, i10, 0);
            b3.a();
            n0.h hVar = new n0.h(i10);
            x.e eVar = this.f24411l;
            eVar.j(8, hVar);
            O();
            eVar.g();
        }
    }

    public final void N(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (g gVar : this.f24404g) {
            if (gVar.f24359c == 2) {
                j2 p10 = p(gVar);
                v8.u0.m(!p10.f24463g);
                p10.f24460d = 1;
                v8.u0.m(true ^ p10.f24463g);
                p10.f24461e = obj;
                p10.c();
                arrayList.add(p10);
            }
        }
        Object obj2 = this.O;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((j2) it.next()).a(this.C);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z10 = true;
            }
            Object obj3 = this.O;
            Surface surface = this.P;
            if (obj3 == surface) {
                surface.release();
                this.P = null;
            }
        }
        this.O = obj;
        if (z10) {
            r rVar = new r(2, new ni.p(), 1003);
            a2 a2Var = this.f24403f0;
            a2 a = a2Var.a(a2Var.f24265b);
            a.f24279p = a.f24281r;
            a.f24280q = 0L;
            a2 d10 = a.e(1).d(rVar);
            this.F++;
            n9.e0 e0Var = this.f24410k.f24620j;
            e0Var.getClass();
            n9.d0 b3 = n9.e0.b();
            b3.a = e0Var.a.obtainMessage(6);
            b3.a();
            Q(d10, 0, 1, false, 5, C.TIME_UNSET, -1, false);
        }
    }

    public final void O() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        d2 d2Var = this.L;
        int i10 = n9.h0.a;
        i0 i0Var = (i0) this.f24402f;
        boolean C = i0Var.C();
        boolean f10 = i0Var.f();
        boolean z18 = false;
        if (i0Var.b() != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i0Var.a() != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean e2 = i0Var.e();
        boolean d10 = i0Var.d();
        boolean p10 = i0Var.x().p();
        c2 c2Var = new c2();
        n9.g gVar = this.f24396c.f24324b;
        a4.g0 g0Var = c2Var.a;
        g0Var.getClass();
        for (int i11 = 0; i11 < gVar.b(); i11++) {
            g0Var.a(gVar.a(i11));
        }
        boolean z19 = !C;
        c2Var.a(4, z19);
        if (f10 && !C) {
            z12 = true;
        } else {
            z12 = false;
        }
        c2Var.a(5, z12);
        if (z10 && !C) {
            z13 = true;
        } else {
            z13 = false;
        }
        c2Var.a(6, z13);
        if (!p10 && ((z10 || !e2 || f10) && !C)) {
            z14 = true;
        } else {
            z14 = false;
        }
        c2Var.a(7, z14);
        if (z11 && !C) {
            z15 = true;
        } else {
            z15 = false;
        }
        c2Var.a(8, z15);
        if (!p10 && ((z11 || (e2 && d10)) && !C)) {
            z16 = true;
        } else {
            z16 = false;
        }
        c2Var.a(9, z16);
        c2Var.a(10, z19);
        if (f10 && !C) {
            z17 = true;
        } else {
            z17 = false;
        }
        c2Var.a(11, z17);
        if (f10 && !C) {
            z18 = true;
        }
        c2Var.a(12, z18);
        d2 b3 = c2Var.b();
        this.L = b3;
        if (!b3.equals(d2Var)) {
            this.f24411l.j(13, new y(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void P(int i10, int i11, boolean z10) {
        ?? r32;
        int i12 = 0;
        if (z10 && i10 != -1) {
            r32 = 1;
        } else {
            r32 = 0;
        }
        if (r32 != 0 && i10 != 1) {
            i12 = 1;
        }
        a2 a2Var = this.f24403f0;
        if (a2Var.f24275l == r32 && a2Var.f24276m == i12) {
            return;
        }
        this.F++;
        boolean z11 = a2Var.f24278o;
        a2 a2Var2 = a2Var;
        if (z11) {
            a2Var2 = new a2(a2Var.a, a2Var.f24265b, a2Var.f24266c, a2Var.f24267d, a2Var.f24268e, a2Var.f24269f, a2Var.f24270g, a2Var.f24271h, a2Var.f24272i, a2Var.f24273j, a2Var.f24274k, a2Var.f24275l, a2Var.f24276m, a2Var.f24277n, a2Var.f24279p, a2Var.f24280q, a2Var.h(), SystemClock.elapsedRealtime(), a2Var.f24278o);
        }
        a2 c10 = a2Var2.c(i12, r32);
        n9.e0 e0Var = this.f24410k.f24620j;
        e0Var.getClass();
        n9.d0 b3 = n9.e0.b();
        b3.a = e0Var.a.obtainMessage(1, r32, i12);
        b3.a();
        Q(c10, 0, i11, false, 5, C.TIME_UNSET, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0260  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q(final s7.a2 r39, final int r40, final int r41, boolean r42, int r43, long r44, int r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 929
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.i0.Q(s7.a2, int, int, boolean, int, long, int, boolean):void");
    }

    public final void R() {
        int A = A();
        r3 r3Var = this.B;
        r3 r3Var2 = this.A;
        boolean z10 = true;
        if (A != 1) {
            if (A != 2 && A != 3) {
                if (A != 4) {
                    throw new IllegalStateException();
                }
            } else {
                S();
                boolean z11 = this.f24403f0.f24278o;
                if (!z() || z11) {
                    z10 = false;
                }
                r3Var2.b(z10);
                r3Var.b(z());
                return;
            }
        }
        r3Var2.b(false);
        r3Var.b(false);
    }

    public final void S() {
        IllegalStateException illegalStateException;
        a4.g0 g0Var = this.f24398d;
        synchronized (g0Var) {
            boolean z10 = false;
            while (!g0Var.a) {
                try {
                    g0Var.wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f24418s.getThread()) {
            String k10 = n9.h0.k("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f24418s.getThread().getName());
            if (!this.f24395b0) {
                if (this.f24397c0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                n9.o.g("ExoPlayerImpl", k10, illegalStateException);
                this.f24397c0 = true;
                return;
            }
            throw new IllegalStateException(k10);
        }
    }

    @Override // s7.f
    public final void g(int i10, long j3, boolean z10) {
        boolean z11;
        S();
        int i11 = 0;
        if (i10 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        v8.u0.d(z11);
        t7.p pVar = (t7.p) this.f24417r;
        if (!pVar.f25322j) {
            t7.b L = pVar.L();
            pVar.f25322j = true;
            pVar.Q(L, -1, new t7.i(L, i11));
        }
        x2 x2Var = this.f24403f0.a;
        if (!x2Var.p() && i10 >= x2Var.o()) {
            return;
        }
        this.F++;
        if (C()) {
            n9.o.f("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            l0 l0Var = new l0(this.f24403f0);
            l0Var.a(1);
            i0 i0Var = this.f24409j.f24865b;
            i0Var.f24408i.c(new com.facebook.r0(13, i0Var, l0Var));
            return;
        }
        a2 a2Var = this.f24403f0;
        int i12 = a2Var.f24268e;
        if (i12 == 3 || (i12 == 4 && !x2Var.p())) {
            a2Var = this.f24403f0.e(2);
        }
        int t5 = t();
        a2 D = D(a2Var, x2Var, E(x2Var, i10, j3));
        this.f24410k.f24620j.a(3, new n0(x2Var, i10, n9.h0.H(j3))).a();
        Q(D, 0, 1, true, 1, w(D), t5, z10);
    }

    public final ArrayList l(int i10, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            v1 v1Var = new v1((v8.a) arrayList.get(i11), this.f24415p);
            arrayList2.add(v1Var);
            this.f24414o.add(i11 + i10, new h0(v1Var.a.f26279o, v1Var.f24776b));
        }
        this.K = this.K.a(i10, arrayList2.size());
        return arrayList2;
    }

    public final l1 m() {
        x2 x10 = x();
        if (x10.p()) {
            return this.f24401e0;
        }
        j1 j1Var = x10.m(t(), this.a).f24841d;
        l1 l1Var = this.f24401e0;
        l1Var.getClass();
        k1 k1Var = new k1(l1Var);
        l1 l1Var2 = j1Var.f24455f;
        if (l1Var2 != null) {
            CharSequence charSequence = l1Var2.f24535b;
            if (charSequence != null) {
                k1Var.a = charSequence;
            }
            CharSequence charSequence2 = l1Var2.f24536c;
            if (charSequence2 != null) {
                k1Var.f24471b = charSequence2;
            }
            CharSequence charSequence3 = l1Var2.f24537d;
            if (charSequence3 != null) {
                k1Var.f24472c = charSequence3;
            }
            CharSequence charSequence4 = l1Var2.f24538f;
            if (charSequence4 != null) {
                k1Var.f24473d = charSequence4;
            }
            CharSequence charSequence5 = l1Var2.f24539g;
            if (charSequence5 != null) {
                k1Var.f24474e = charSequence5;
            }
            CharSequence charSequence6 = l1Var2.f24540h;
            if (charSequence6 != null) {
                k1Var.f24475f = charSequence6;
            }
            CharSequence charSequence7 = l1Var2.f24541i;
            if (charSequence7 != null) {
                k1Var.f24476g = charSequence7;
            }
            m2 m2Var = l1Var2.f24542j;
            if (m2Var != null) {
                k1Var.f24477h = m2Var;
            }
            m2 m2Var2 = l1Var2.f24543k;
            if (m2Var2 != null) {
                k1Var.f24478i = m2Var2;
            }
            byte[] bArr = l1Var2.f24544l;
            if (bArr != null) {
                k1Var.f24479j = (byte[]) bArr.clone();
                k1Var.f24480k = l1Var2.f24545m;
            }
            Uri uri = l1Var2.f24546n;
            if (uri != null) {
                k1Var.f24481l = uri;
            }
            Integer num = l1Var2.f24547o;
            if (num != null) {
                k1Var.f24482m = num;
            }
            Integer num2 = l1Var2.f24548p;
            if (num2 != null) {
                k1Var.f24483n = num2;
            }
            Integer num3 = l1Var2.f24549q;
            if (num3 != null) {
                k1Var.f24484o = num3;
            }
            Boolean bool = l1Var2.f24550r;
            if (bool != null) {
                k1Var.f24485p = bool;
            }
            Boolean bool2 = l1Var2.f24551s;
            if (bool2 != null) {
                k1Var.f24486q = bool2;
            }
            Integer num4 = l1Var2.f24552t;
            if (num4 != null) {
                k1Var.f24487r = num4;
            }
            Integer num5 = l1Var2.u;
            if (num5 != null) {
                k1Var.f24487r = num5;
            }
            Integer num6 = l1Var2.f24553v;
            if (num6 != null) {
                k1Var.f24488s = num6;
            }
            Integer num7 = l1Var2.f24554w;
            if (num7 != null) {
                k1Var.f24489t = num7;
            }
            Integer num8 = l1Var2.f24555x;
            if (num8 != null) {
                k1Var.u = num8;
            }
            Integer num9 = l1Var2.f24556y;
            if (num9 != null) {
                k1Var.f24490v = num9;
            }
            Integer num10 = l1Var2.f24557z;
            if (num10 != null) {
                k1Var.f24491w = num10;
            }
            CharSequence charSequence8 = l1Var2.A;
            if (charSequence8 != null) {
                k1Var.f24492x = charSequence8;
            }
            CharSequence charSequence9 = l1Var2.B;
            if (charSequence9 != null) {
                k1Var.f24493y = charSequence9;
            }
            CharSequence charSequence10 = l1Var2.C;
            if (charSequence10 != null) {
                k1Var.f24494z = charSequence10;
            }
            Integer num11 = l1Var2.D;
            if (num11 != null) {
                k1Var.A = num11;
            }
            Integer num12 = l1Var2.E;
            if (num12 != null) {
                k1Var.B = num12;
            }
            CharSequence charSequence11 = l1Var2.F;
            if (charSequence11 != null) {
                k1Var.C = charSequence11;
            }
            CharSequence charSequence12 = l1Var2.G;
            if (charSequence12 != null) {
                k1Var.D = charSequence12;
            }
            CharSequence charSequence13 = l1Var2.H;
            if (charSequence13 != null) {
                k1Var.E = charSequence13;
            }
            Integer num13 = l1Var2.I;
            if (num13 != null) {
                k1Var.F = num13;
            }
            Bundle bundle = l1Var2.J;
            if (bundle != null) {
                k1Var.G = bundle;
            }
        }
        return new l1(k1Var);
    }

    public final void n() {
        S();
        I();
        N(null);
        F(0, 0);
    }

    public final j2 p(i2 i2Var) {
        int y4 = y(this.f24403f0);
        x2 x2Var = this.f24403f0.a;
        if (y4 == -1) {
            y4 = 0;
        }
        n9.c0 c0Var = this.f24421w;
        o0 o0Var = this.f24410k;
        return new j2(o0Var, i2Var, x2Var, y4, c0Var, o0Var.f24622l);
    }

    public final long q(a2 a2Var) {
        if (a2Var.f24265b.a()) {
            Object obj = a2Var.f24265b.a;
            x2 x2Var = a2Var.a;
            v2 v2Var = this.f24413n;
            x2Var.g(obj, v2Var);
            long j3 = a2Var.f24266c;
            if (j3 == C.TIME_UNSET) {
                return n9.h0.Q(x2Var.m(y(a2Var), this.a).f24851o);
            }
            return n9.h0.Q(v2Var.f24789g) + n9.h0.Q(j3);
        }
        return n9.h0.Q(w(a2Var));
    }

    public final int r() {
        S();
        if (C()) {
            return this.f24403f0.f24265b.f26318b;
        }
        return -1;
    }

    public final int s() {
        S();
        if (C()) {
            return this.f24403f0.f24265b.f26319c;
        }
        return -1;
    }

    public final int t() {
        S();
        int y4 = y(this.f24403f0);
        if (y4 == -1) {
            return 0;
        }
        return y4;
    }

    public final int u() {
        S();
        if (this.f24403f0.a.p()) {
            return 0;
        }
        a2 a2Var = this.f24403f0;
        return a2Var.a.b(a2Var.f24265b.a);
    }

    public final long v() {
        S();
        return n9.h0.Q(w(this.f24403f0));
    }

    public final long w(a2 a2Var) {
        long j3;
        if (a2Var.a.p()) {
            return n9.h0.H(this.f24407h0);
        }
        if (a2Var.f24278o) {
            j3 = a2Var.h();
        } else {
            j3 = a2Var.f24281r;
        }
        if (a2Var.f24265b.a()) {
            return j3;
        }
        x2 x2Var = a2Var.a;
        Object obj = a2Var.f24265b.a;
        v2 v2Var = this.f24413n;
        x2Var.g(obj, v2Var);
        return j3 + v2Var.f24789g;
    }

    public final x2 x() {
        S();
        return this.f24403f0.a;
    }

    public final int y(a2 a2Var) {
        if (a2Var.a.p()) {
            return this.f24405g0;
        }
        return a2Var.a.g(a2Var.f24265b.a, this.f24413n).f24787d;
    }

    public final boolean z() {
        S();
        return this.f24403f0.f24275l;
    }
}
