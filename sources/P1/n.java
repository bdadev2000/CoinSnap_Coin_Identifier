package P1;

import android.os.SystemClock;
import android.util.Log;
import f2.C2269g;
import f2.InterfaceC2268f;
import j5.C2400c;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import q.c1;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public final class n implements s, R1.e, u {

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f2357h = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    public final E1.d f2358a;
    public final L4.f b;

    /* renamed from: c, reason: collision with root package name */
    public final R1.d f2359c;

    /* renamed from: d, reason: collision with root package name */
    public final c1 f2360d;

    /* renamed from: e, reason: collision with root package name */
    public final B3.e f2361e;

    /* renamed from: f, reason: collision with root package name */
    public final D0.l f2362f;

    /* renamed from: g, reason: collision with root package name */
    public final U4.y f2363g;

    public n(R1.d dVar, C2400c c2400c, S1.e eVar, S1.e eVar2, S1.e eVar3, S1.e eVar4) {
        this.f2359c = dVar;
        m mVar = new m(c2400c);
        U4.y yVar = new U4.y(3);
        this.f2363g = yVar;
        synchronized (this) {
            synchronized (yVar) {
                yVar.f3336d = this;
            }
        }
        this.b = new L4.f(8);
        this.f2358a = new E1.d(9);
        this.f2360d = new c1(eVar, eVar2, eVar3, eVar4, this, this);
        this.f2362f = new D0.l(mVar);
        this.f2361e = new B3.e(2);
        dVar.f2629d = this;
    }

    public static void c(String str, long j7, N1.f fVar) {
        StringBuilder c9 = AbstractC2965e.c(str, " in ");
        c9.append(j2.i.a(j7));
        c9.append("ms, key: ");
        c9.append(fVar);
        Log.v("Engine", c9.toString());
    }

    public static void f(B b) {
        if (b instanceof v) {
            ((v) b).d();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    public final C.c a(com.bumptech.glide.e eVar, Object obj, N1.f fVar, int i9, int i10, Class cls, Class cls2, com.bumptech.glide.g gVar, l lVar, j2.c cVar, boolean z8, boolean z9, N1.i iVar, boolean z10, boolean z11, boolean z12, boolean z13, InterfaceC2268f interfaceC2268f, Executor executor) {
        long j7;
        if (f2357h) {
            int i11 = j2.i.b;
            j7 = SystemClock.elapsedRealtimeNanos();
        } else {
            j7 = 0;
        }
        long j9 = j7;
        this.b.getClass();
        t tVar = new t(obj, fVar, i9, i10, cVar, cls, cls2, iVar);
        synchronized (this) {
            try {
                v b = b(tVar, z10, j9);
                if (b == null) {
                    return g(eVar, obj, fVar, i9, i10, cls, cls2, gVar, lVar, cVar, z8, z9, iVar, z10, z11, z12, z13, interfaceC2268f, executor, tVar, j9);
                }
                ((C2269g) interfaceC2268f).j(b, 5, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final v b(t tVar, boolean z8, long j7) {
        v vVar;
        Object obj;
        v vVar2;
        if (!z8) {
            return null;
        }
        U4.y yVar = this.f2363g;
        synchronized (yVar) {
            C0229c c0229c = (C0229c) ((HashMap) yVar.b).get(tVar);
            if (c0229c == null) {
                vVar = null;
            } else {
                vVar = (v) c0229c.get();
                if (vVar == null) {
                    yVar.c(c0229c);
                }
            }
        }
        if (vVar != null) {
            vVar.b();
        }
        if (vVar != null) {
            if (f2357h) {
                c("Loaded resource from active resources", j7, tVar);
            }
            return vVar;
        }
        R1.d dVar = this.f2359c;
        synchronized (dVar) {
            j2.j jVar = (j2.j) ((LinkedHashMap) dVar.f20608c).remove(tVar);
            if (jVar == null) {
                obj = null;
            } else {
                dVar.b -= jVar.b;
                obj = jVar.f21021a;
            }
        }
        B b = (B) obj;
        if (b == null) {
            vVar2 = null;
        } else if (b instanceof v) {
            vVar2 = (v) b;
        } else {
            vVar2 = new v(b, true, true, tVar, this);
        }
        if (vVar2 != null) {
            vVar2.b();
            this.f2363g.b(tVar, vVar2);
        }
        if (vVar2 == null) {
            return null;
        }
        if (f2357h) {
            c("Loaded resource from cache", j7, tVar);
        }
        return vVar2;
    }

    public final synchronized void d(r rVar, N1.f fVar, v vVar) {
        Object obj;
        if (vVar != null) {
            try {
                if (vVar.b) {
                    this.f2363g.b(fVar, vVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        E1.d dVar = this.f2358a;
        dVar.getClass();
        if (rVar.f2381r) {
            obj = dVar.f974d;
        } else {
            obj = dVar.f973c;
        }
        HashMap hashMap = (HashMap) obj;
        if (rVar.equals(hashMap.get(fVar))) {
            hashMap.remove(fVar);
        }
    }

    public final void e(N1.f fVar, v vVar) {
        U4.y yVar = this.f2363g;
        synchronized (yVar) {
            C0229c c0229c = (C0229c) ((HashMap) yVar.b).remove(fVar);
            if (c0229c != null) {
                c0229c.f2295c = null;
                c0229c.clear();
            }
        }
        if (vVar.b) {
        } else {
            this.f2361e.o(vVar, false);
        }
    }

    public final C.c g(com.bumptech.glide.e eVar, Object obj, N1.f fVar, int i9, int i10, Class cls, Class cls2, com.bumptech.glide.g gVar, l lVar, j2.c cVar, boolean z8, boolean z9, N1.i iVar, boolean z10, boolean z11, boolean z12, boolean z13, InterfaceC2268f interfaceC2268f, Executor executor, t tVar, long j7) {
        S1.e eVar2;
        E1.d dVar = this.f2358a;
        r rVar = (r) ((HashMap) (z13 ? dVar.f974d : dVar.f973c)).get(tVar);
        if (rVar != null) {
            rVar.a(interfaceC2268f, executor);
            if (f2357h) {
                c("Added to existing load", j7, tVar);
            }
            return new C.c(this, interfaceC2268f, rVar);
        }
        r rVar2 = (r) ((C.c) this.f2360d.f22641g).g();
        synchronized (rVar2) {
            rVar2.f2377n = tVar;
            rVar2.f2378o = z10;
            rVar2.f2379p = z11;
            rVar2.f2380q = z12;
            rVar2.f2381r = z13;
        }
        D0.l lVar2 = this.f2362f;
        j jVar = (j) ((C.c) lVar2.f627d).g();
        int i11 = lVar2.b;
        lVar2.b = i11 + 1;
        i iVar2 = jVar.b;
        iVar2.f2306c = eVar;
        iVar2.f2307d = obj;
        iVar2.f2315n = fVar;
        iVar2.f2308e = i9;
        iVar2.f2309f = i10;
        iVar2.f2317p = lVar;
        iVar2.f2310g = cls;
        iVar2.f2311h = jVar.f2330f;
        iVar2.f2314k = cls2;
        iVar2.f2316o = gVar;
        iVar2.f2312i = iVar;
        iVar2.f2313j = cVar;
        iVar2.f2318q = z8;
        iVar2.f2319r = z9;
        jVar.f2334j = eVar;
        jVar.f2335k = fVar;
        jVar.l = gVar;
        jVar.m = tVar;
        jVar.f2336n = i9;
        jVar.f2337o = i10;
        jVar.f2338p = lVar;
        jVar.f2343u = z13;
        jVar.f2339q = iVar;
        jVar.f2340r = rVar2;
        jVar.f2341s = i11;
        jVar.f2326G = 1;
        jVar.f2344v = obj;
        E1.d dVar2 = this.f2358a;
        dVar2.getClass();
        ((HashMap) (rVar2.f2381r ? dVar2.f974d : dVar2.f973c)).put(tVar, rVar2);
        rVar2.a(interfaceC2268f, executor);
        synchronized (rVar2) {
            rVar2.f2388y = jVar;
            int i12 = jVar.i(1);
            if (i12 != 2 && i12 != 3) {
                if (rVar2.f2379p) {
                    eVar2 = rVar2.f2376k;
                } else {
                    eVar2 = rVar2.f2380q ? rVar2.l : rVar2.f2375j;
                }
                eVar2.execute(jVar);
            }
            eVar2 = rVar2.f2374i;
            eVar2.execute(jVar);
        }
        if (f2357h) {
            c("Started new load", j7, tVar);
        }
        return new C.c(this, interfaceC2268f, rVar2);
    }
}
