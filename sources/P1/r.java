package P1;

import f2.InterfaceC2268f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import k2.InterfaceC2430b;
import q4.C2645d;

/* loaded from: classes.dex */
public final class r implements InterfaceC2430b {

    /* renamed from: B, reason: collision with root package name */
    public static final C2645d f2367B = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f2368A;
    public final q b;

    /* renamed from: c, reason: collision with root package name */
    public final k2.e f2369c;

    /* renamed from: d, reason: collision with root package name */
    public final u f2370d;

    /* renamed from: f, reason: collision with root package name */
    public final S.c f2371f;

    /* renamed from: g, reason: collision with root package name */
    public final C2645d f2372g;

    /* renamed from: h, reason: collision with root package name */
    public final s f2373h;

    /* renamed from: i, reason: collision with root package name */
    public final S1.e f2374i;

    /* renamed from: j, reason: collision with root package name */
    public final S1.e f2375j;

    /* renamed from: k, reason: collision with root package name */
    public final S1.e f2376k;
    public final S1.e l;
    public final AtomicInteger m;

    /* renamed from: n, reason: collision with root package name */
    public N1.f f2377n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2378o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2379p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2380q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2381r;

    /* renamed from: s, reason: collision with root package name */
    public B f2382s;

    /* renamed from: t, reason: collision with root package name */
    public int f2383t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2384u;

    /* renamed from: v, reason: collision with root package name */
    public x f2385v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2386w;

    /* renamed from: x, reason: collision with root package name */
    public v f2387x;

    /* renamed from: y, reason: collision with root package name */
    public j f2388y;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f2389z;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k2.e] */
    public r(S1.e eVar, S1.e eVar2, S1.e eVar3, S1.e eVar4, s sVar, u uVar, C.c cVar) {
        C2645d c2645d = f2367B;
        this.b = new q(new ArrayList(2));
        this.f2369c = new Object();
        this.m = new AtomicInteger();
        this.f2374i = eVar;
        this.f2375j = eVar2;
        this.f2376k = eVar3;
        this.l = eVar4;
        this.f2373h = sVar;
        this.f2370d = uVar;
        this.f2371f = cVar;
        this.f2372g = c2645d;
    }

    public final synchronized void a(InterfaceC2268f interfaceC2268f, Executor executor) {
        try {
            this.f2369c.a();
            q qVar = this.b;
            qVar.getClass();
            qVar.b.add(new p(interfaceC2268f, executor));
            if (this.f2384u) {
                e(1);
                executor.execute(new o(this, interfaceC2268f, 1));
            } else if (this.f2386w) {
                e(1);
                executor.execute(new o(this, interfaceC2268f, 0));
            } else {
                j2.g.a("Cannot add callbacks to a cancelled EngineJob", !this.f2389z);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // k2.InterfaceC2430b
    public final k2.e b() {
        return this.f2369c;
    }

    public final void c() {
        Object obj;
        if (f()) {
            return;
        }
        this.f2389z = true;
        j jVar = this.f2388y;
        jVar.f2323D = true;
        h hVar = jVar.f2321B;
        if (hVar != null) {
            hVar.cancel();
        }
        s sVar = this.f2373h;
        N1.f fVar = this.f2377n;
        n nVar = (n) sVar;
        synchronized (nVar) {
            E1.d dVar = nVar.f2358a;
            dVar.getClass();
            if (this.f2381r) {
                obj = dVar.f974d;
            } else {
                obj = dVar.f973c;
            }
            HashMap hashMap = (HashMap) obj;
            if (equals(hashMap.get(fVar))) {
                hashMap.remove(fVar);
            }
        }
    }

    public final void d() {
        boolean z8;
        v vVar;
        synchronized (this) {
            try {
                this.f2369c.a();
                j2.g.a("Not yet complete!", f());
                int decrementAndGet = this.m.decrementAndGet();
                if (decrementAndGet >= 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                j2.g.a("Can't decrement below 0", z8);
                if (decrementAndGet == 0) {
                    vVar = this.f2387x;
                    g();
                } else {
                    vVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vVar != null) {
            vVar.d();
        }
    }

    public final synchronized void e(int i9) {
        v vVar;
        j2.g.a("Not yet complete!", f());
        if (this.m.getAndAdd(i9) == 0 && (vVar = this.f2387x) != null) {
            vVar.b();
        }
    }

    public final boolean f() {
        if (!this.f2386w && !this.f2384u && !this.f2389z) {
            return false;
        }
        return true;
    }

    public final synchronized void g() {
        boolean a6;
        if (this.f2377n != null) {
            this.b.b.clear();
            this.f2377n = null;
            this.f2387x = null;
            this.f2382s = null;
            this.f2386w = false;
            this.f2389z = false;
            this.f2384u = false;
            this.f2368A = false;
            j jVar = this.f2388y;
            B4.a aVar = jVar.f2333i;
            synchronized (aVar) {
                aVar.f309a = true;
                a6 = aVar.a();
            }
            if (a6) {
                jVar.m();
            }
            this.f2388y = null;
            this.f2385v = null;
            this.f2383t = 0;
            this.f2371f.b(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void h(InterfaceC2268f interfaceC2268f) {
        try {
            this.f2369c.a();
            q qVar = this.b;
            qVar.b.remove(new p(interfaceC2268f, j2.g.b));
            if (this.b.b.isEmpty()) {
                c();
                if (!this.f2384u) {
                    if (this.f2386w) {
                    }
                }
                if (this.m.get() == 0) {
                    g();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
