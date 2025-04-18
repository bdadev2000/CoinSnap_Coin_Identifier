package g4;

import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class r implements w, i4.f, y {

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f18145h = Log.isLoggable("Engine", 2);
    public final d0 a;

    /* renamed from: b, reason: collision with root package name */
    public final z1.d f18146b;

    /* renamed from: c, reason: collision with root package name */
    public final i4.e f18147c;

    /* renamed from: d, reason: collision with root package name */
    public final ob.c f18148d;

    /* renamed from: e, reason: collision with root package name */
    public final a4.g0 f18149e;

    /* renamed from: f, reason: collision with root package name */
    public final f0.c f18150f;

    /* renamed from: g, reason: collision with root package name */
    public final c f18151g;

    public r(i4.e eVar, i4.c cVar, j4.e eVar2, j4.e eVar3, j4.e eVar4, j4.e eVar5) {
        this.f18147c = eVar;
        q qVar = new q(cVar);
        c cVar2 = new c();
        this.f18151g = cVar2;
        synchronized (this) {
            synchronized (cVar2) {
                cVar2.f18045e = this;
            }
        }
        this.f18146b = new z1.d(9);
        this.a = new d0(0);
        this.f18148d = new ob.c(eVar2, eVar3, eVar4, eVar5, this, this);
        this.f18150f = new f0.c(qVar);
        this.f18149e = new a4.g0(1);
        eVar.f19144e = this;
    }

    public static void c(String str, long j3, e4.j jVar) {
        StringBuilder n10 = eb.j.n(str, " in ");
        n10.append(w4.g.a(j3));
        n10.append("ms, key: ");
        n10.append(jVar);
        Log.v("Engine", n10.toString());
    }

    public static void e(g0 g0Var) {
        if (g0Var instanceof z) {
            ((z) g0Var).d();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    public final k a(com.bumptech.glide.g gVar, Object obj, e4.j jVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.h hVar, p pVar, w4.c cVar, boolean z10, boolean z11, e4.m mVar, boolean z12, boolean z13, boolean z14, boolean z15, s4.g gVar2, Executor executor) {
        long j3;
        if (f18145h) {
            int i12 = w4.g.f26732b;
            j3 = SystemClock.elapsedRealtimeNanos();
        } else {
            j3 = 0;
        }
        long j10 = j3;
        this.f18146b.getClass();
        x xVar = new x(obj, jVar, i10, i11, cVar, cls, cls2, mVar);
        synchronized (this) {
            try {
                z b3 = b(xVar, z12, j10);
                if (b3 == null) {
                    return f(gVar, obj, jVar, i10, i11, cls, cls2, hVar, pVar, cVar, z10, z11, mVar, z12, z13, z14, z15, gVar2, executor, xVar, j10);
                }
                ((s4.h) gVar2).l(b3, e4.a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final z b(x xVar, boolean z10, long j3) {
        z zVar;
        Object obj;
        z zVar2;
        if (!z10) {
            return null;
        }
        c cVar = this.f18151g;
        synchronized (cVar) {
            b bVar = (b) cVar.f18043c.get(xVar);
            if (bVar == null) {
                zVar = null;
            } else {
                zVar = (z) bVar.get();
                if (zVar == null) {
                    cVar.b(bVar);
                }
            }
        }
        if (zVar != null) {
            zVar.b();
        }
        if (zVar != null) {
            if (f18145h) {
                c("Loaded resource from active resources", j3, xVar);
            }
            return zVar;
        }
        i4.e eVar = this.f18147c;
        synchronized (eVar) {
            w4.h hVar = (w4.h) eVar.a.remove(xVar);
            if (hVar == null) {
                obj = null;
            } else {
                eVar.f26735c -= hVar.f26733b;
                obj = hVar.a;
            }
        }
        g0 g0Var = (g0) obj;
        if (g0Var == null) {
            zVar2 = null;
        } else if (g0Var instanceof z) {
            zVar2 = (z) g0Var;
        } else {
            zVar2 = new z(g0Var, true, true, xVar, this);
        }
        if (zVar2 != null) {
            zVar2.b();
            this.f18151g.a(xVar, zVar2);
        }
        if (zVar2 == null) {
            return null;
        }
        if (f18145h) {
            c("Loaded resource from cache", j3, xVar);
        }
        return zVar2;
    }

    public final void d(e4.j jVar, z zVar) {
        c cVar = this.f18151g;
        synchronized (cVar) {
            b bVar = (b) cVar.f18043c.remove(jVar);
            if (bVar != null) {
                bVar.f18035c = null;
                bVar.clear();
            }
        }
        if (zVar.f18189b) {
        } else {
            this.f18149e.d(zVar, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e3, code lost:
    
        r0 = r15.f18163i;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final g4.k f(com.bumptech.glide.g r17, java.lang.Object r18, e4.j r19, int r20, int r21, java.lang.Class r22, java.lang.Class r23, com.bumptech.glide.h r24, g4.p r25, w4.c r26, boolean r27, boolean r28, e4.m r29, boolean r30, boolean r31, boolean r32, boolean r33, s4.g r34, java.util.concurrent.Executor r35, g4.x r36, long r37) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.r.f(com.bumptech.glide.g, java.lang.Object, e4.j, int, int, java.lang.Class, java.lang.Class, com.bumptech.glide.h, g4.p, w4.c, boolean, boolean, e4.m, boolean, boolean, boolean, boolean, s4.g, java.util.concurrent.Executor, g4.x, long):g4.k");
    }
}
