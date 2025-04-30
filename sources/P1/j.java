package P1;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import k2.InterfaceC2430b;
import q4.C2645d;
import x0.AbstractC2914a;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public final class j implements g, Runnable, Comparable, InterfaceC2430b {

    /* renamed from: A, reason: collision with root package name */
    public com.bumptech.glide.load.data.e f2320A;

    /* renamed from: B, reason: collision with root package name */
    public volatile h f2321B;

    /* renamed from: C, reason: collision with root package name */
    public volatile boolean f2322C;

    /* renamed from: D, reason: collision with root package name */
    public volatile boolean f2323D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2324E;

    /* renamed from: F, reason: collision with root package name */
    public int f2325F;

    /* renamed from: G, reason: collision with root package name */
    public int f2326G;

    /* renamed from: H, reason: collision with root package name */
    public int f2327H;

    /* renamed from: f, reason: collision with root package name */
    public final m f2330f;

    /* renamed from: g, reason: collision with root package name */
    public final S.c f2331g;

    /* renamed from: j, reason: collision with root package name */
    public com.bumptech.glide.e f2334j;

    /* renamed from: k, reason: collision with root package name */
    public N1.f f2335k;
    public com.bumptech.glide.g l;
    public t m;

    /* renamed from: n, reason: collision with root package name */
    public int f2336n;

    /* renamed from: o, reason: collision with root package name */
    public int f2337o;

    /* renamed from: p, reason: collision with root package name */
    public l f2338p;

    /* renamed from: q, reason: collision with root package name */
    public N1.i f2339q;

    /* renamed from: r, reason: collision with root package name */
    public r f2340r;

    /* renamed from: s, reason: collision with root package name */
    public int f2341s;

    /* renamed from: t, reason: collision with root package name */
    public long f2342t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2343u;

    /* renamed from: v, reason: collision with root package name */
    public Object f2344v;

    /* renamed from: w, reason: collision with root package name */
    public Thread f2345w;

    /* renamed from: x, reason: collision with root package name */
    public N1.f f2346x;

    /* renamed from: y, reason: collision with root package name */
    public N1.f f2347y;

    /* renamed from: z, reason: collision with root package name */
    public Object f2348z;
    public final i b = new i();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2328c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final k2.e f2329d = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final C.c f2332h = new C.c(5, (char) 0);

    /* renamed from: i, reason: collision with root package name */
    public final B4.a f2333i = new Object();

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k2.e] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, B4.a] */
    public j(m mVar, C.c cVar) {
        this.f2330f = mVar;
        this.f2331g = cVar;
    }

    @Override // P1.g
    public final void a(N1.f fVar, Exception exc, com.bumptech.glide.load.data.e eVar, int i9) {
        eVar.b();
        x xVar = new x("Fetching data failed", Collections.singletonList(exc));
        Class a6 = eVar.a();
        xVar.f2406c = fVar;
        xVar.f2407d = i9;
        xVar.f2408f = a6;
        this.f2328c.add(xVar);
        if (Thread.currentThread() != this.f2345w) {
            n(2);
        } else {
            o();
        }
    }

    @Override // k2.InterfaceC2430b
    public final k2.e b() {
        return this.f2329d;
    }

    @Override // P1.g
    public final void c() {
        n(2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j jVar = (j) obj;
        int ordinal = this.l.ordinal() - jVar.l.ordinal();
        if (ordinal == 0) {
            return this.f2341s - jVar.f2341s;
        }
        return ordinal;
    }

    @Override // P1.g
    public final void d(N1.f fVar, Object obj, com.bumptech.glide.load.data.e eVar, int i9, N1.f fVar2) {
        this.f2346x = fVar;
        this.f2348z = obj;
        this.f2320A = eVar;
        this.f2327H = i9;
        this.f2347y = fVar2;
        boolean z8 = false;
        if (fVar != this.b.a().get(0)) {
            z8 = true;
        }
        this.f2324E = z8;
        if (Thread.currentThread() != this.f2345w) {
            n(3);
        } else {
            g();
        }
    }

    public final B e(com.bumptech.glide.load.data.e eVar, Object obj, int i9) {
        if (obj == null) {
            return null;
        }
        try {
            int i10 = j2.i.b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            B f9 = f(i9, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                j("Decoded result " + f9, elapsedRealtimeNanos, null);
            }
            return f9;
        } finally {
            eVar.b();
        }
    }

    public final B f(int i9, Object obj) {
        boolean z8;
        Class<?> cls = obj.getClass();
        i iVar = this.b;
        z c9 = iVar.c(cls);
        N1.i iVar2 = this.f2339q;
        if (Build.VERSION.SDK_INT >= 26) {
            if (i9 != 4 && !iVar.f2319r) {
                z8 = false;
            } else {
                z8 = true;
            }
            N1.h hVar = W1.q.f3589i;
            Boolean bool = (Boolean) iVar2.c(hVar);
            if (bool == null || (bool.booleanValue() && !z8)) {
                iVar2 = new N1.i();
                j2.c cVar = this.f2339q.b;
                j2.c cVar2 = iVar2.b;
                cVar2.i(cVar);
                cVar2.put(hVar, Boolean.valueOf(z8));
            }
        }
        N1.i iVar3 = iVar2;
        com.bumptech.glide.load.data.g g9 = this.f2334j.a().g(obj);
        try {
            return c9.a(this.f2336n, this.f2337o, new B3.g(i9, 3, this), iVar3, g9);
        } finally {
            g9.b();
        }
    }

    public final void g() {
        B b;
        boolean a6;
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Retrieved data", this.f2342t, "data: " + this.f2348z + ", cache key: " + this.f2346x + ", fetcher: " + this.f2320A);
        }
        A a9 = null;
        try {
            b = e(this.f2320A, this.f2348z, this.f2327H);
        } catch (x e4) {
            N1.f fVar = this.f2347y;
            int i9 = this.f2327H;
            e4.f2406c = fVar;
            e4.f2407d = i9;
            e4.f2408f = null;
            this.f2328c.add(e4);
            b = null;
        }
        if (b != null) {
            int i10 = this.f2327H;
            boolean z8 = this.f2324E;
            if (b instanceof y) {
                ((y) b).initialize();
            }
            if (((A) this.f2332h.f349f) != null) {
                a9 = (A) A.f2267g.g();
                a9.f2270f = false;
                a9.f2269d = true;
                a9.f2268c = b;
                b = a9;
            }
            k(b, i10, z8);
            this.f2325F = 5;
            try {
                C.c cVar = this.f2332h;
                if (((A) cVar.f349f) != null) {
                    m mVar = this.f2330f;
                    N1.i iVar = this.f2339q;
                    cVar.getClass();
                    try {
                        mVar.a().a((N1.f) cVar.f347c, new C.c((N1.l) cVar.f348d, (A) cVar.f349f, iVar, 4));
                        ((A) cVar.f349f).d();
                    } catch (Throwable th) {
                        ((A) cVar.f349f).d();
                        throw th;
                    }
                }
                B4.a aVar = this.f2333i;
                synchronized (aVar) {
                    aVar.b = true;
                    a6 = aVar.a();
                }
                if (a6) {
                    m();
                    return;
                }
                return;
            } finally {
                if (a9 != null) {
                    a9.d();
                }
            }
        }
        o();
    }

    public final h h() {
        int d2 = AbstractC2965e.d(this.f2325F);
        i iVar = this.b;
        if (d2 != 1) {
            if (d2 != 2) {
                if (d2 != 3) {
                    if (d2 == 5) {
                        return null;
                    }
                    throw new IllegalStateException("Unrecognized stage: ".concat(AbstractC2914a.p(this.f2325F)));
                }
                return new F(iVar, this);
            }
            return new C0231e(iVar.a(), iVar, this);
        }
        return new C(iVar, this);
    }

    public final int i(int i9) {
        int d2 = AbstractC2965e.d(i9);
        if (d2 != 0) {
            if (d2 != 1) {
                if (d2 != 2) {
                    if (d2 == 3 || d2 == 5) {
                        return 6;
                    }
                    throw new IllegalArgumentException("Unrecognized stage: ".concat(AbstractC2914a.p(i9)));
                }
                if (this.f2343u) {
                    return 6;
                }
                return 4;
            }
            if (this.f2338p.a()) {
                return 3;
            }
            return i(3);
        }
        if (this.f2338p.b()) {
            return 2;
        }
        return i(2);
    }

    public final void j(String str, long j7, String str2) {
        String str3;
        StringBuilder c9 = AbstractC2965e.c(str, " in ");
        c9.append(j2.i.a(j7));
        c9.append(", load key: ");
        c9.append(this.m);
        if (str2 != null) {
            str3 = ", ".concat(str2);
        } else {
            str3 = "";
        }
        c9.append(str3);
        c9.append(", thread: ");
        c9.append(Thread.currentThread().getName());
        Log.v("DecodeJob", c9.toString());
    }

    public final void k(B b, int i9, boolean z8) {
        q();
        r rVar = this.f2340r;
        synchronized (rVar) {
            rVar.f2382s = b;
            rVar.f2383t = i9;
            rVar.f2368A = z8;
        }
        synchronized (rVar) {
            try {
                rVar.f2369c.a();
                if (rVar.f2389z) {
                    rVar.f2382s.a();
                    rVar.g();
                    return;
                }
                if (!rVar.b.b.isEmpty()) {
                    if (!rVar.f2384u) {
                        C2645d c2645d = rVar.f2372g;
                        B b8 = rVar.f2382s;
                        boolean z9 = rVar.f2378o;
                        N1.f fVar = rVar.f2377n;
                        u uVar = rVar.f2370d;
                        c2645d.getClass();
                        rVar.f2387x = new v(b8, z9, true, fVar, uVar);
                        rVar.f2384u = true;
                        q qVar = rVar.b;
                        qVar.getClass();
                        ArrayList<p> arrayList = new ArrayList(qVar.b);
                        rVar.e(arrayList.size() + 1);
                        ((n) rVar.f2373h).d(rVar, rVar.f2377n, rVar.f2387x);
                        for (p pVar : arrayList) {
                            pVar.b.execute(new o(rVar, pVar.f2366a, 1));
                        }
                        rVar.d();
                        return;
                    }
                    throw new IllegalStateException("Already have resource");
                }
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            } finally {
            }
        }
    }

    public final void l() {
        boolean a6;
        q();
        x xVar = new x("Failed to load resource", new ArrayList(this.f2328c));
        r rVar = this.f2340r;
        synchronized (rVar) {
            rVar.f2385v = xVar;
        }
        synchronized (rVar) {
            try {
                rVar.f2369c.a();
                if (rVar.f2389z) {
                    rVar.g();
                } else if (!rVar.b.b.isEmpty()) {
                    if (!rVar.f2386w) {
                        rVar.f2386w = true;
                        N1.f fVar = rVar.f2377n;
                        q qVar = rVar.b;
                        qVar.getClass();
                        ArrayList<p> arrayList = new ArrayList(qVar.b);
                        rVar.e(arrayList.size() + 1);
                        ((n) rVar.f2373h).d(rVar, fVar, null);
                        for (p pVar : arrayList) {
                            pVar.b.execute(new o(rVar, pVar.f2366a, 0));
                        }
                        rVar.d();
                    } else {
                        throw new IllegalStateException("Already failed once");
                    }
                } else {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
            } finally {
            }
        }
        B4.a aVar = this.f2333i;
        synchronized (aVar) {
            aVar.f310c = true;
            a6 = aVar.a();
        }
        if (a6) {
            m();
        }
    }

    public final void m() {
        B4.a aVar = this.f2333i;
        synchronized (aVar) {
            aVar.b = false;
            aVar.f309a = false;
            aVar.f310c = false;
        }
        C.c cVar = this.f2332h;
        cVar.f347c = null;
        cVar.f348d = null;
        cVar.f349f = null;
        i iVar = this.b;
        iVar.f2306c = null;
        iVar.f2307d = null;
        iVar.f2315n = null;
        iVar.f2310g = null;
        iVar.f2314k = null;
        iVar.f2312i = null;
        iVar.f2316o = null;
        iVar.f2313j = null;
        iVar.f2317p = null;
        iVar.f2305a.clear();
        iVar.l = false;
        iVar.b.clear();
        iVar.m = false;
        this.f2322C = false;
        this.f2334j = null;
        this.f2335k = null;
        this.f2339q = null;
        this.l = null;
        this.m = null;
        this.f2340r = null;
        this.f2325F = 0;
        this.f2321B = null;
        this.f2345w = null;
        this.f2346x = null;
        this.f2348z = null;
        this.f2327H = 0;
        this.f2320A = null;
        this.f2342t = 0L;
        this.f2323D = false;
        this.f2328c.clear();
        this.f2331g.b(this);
    }

    public final void n(int i9) {
        S1.e eVar;
        this.f2326G = i9;
        r rVar = this.f2340r;
        if (rVar.f2379p) {
            eVar = rVar.f2376k;
        } else if (rVar.f2380q) {
            eVar = rVar.l;
        } else {
            eVar = rVar.f2375j;
        }
        eVar.execute(this);
    }

    public final void o() {
        this.f2345w = Thread.currentThread();
        int i9 = j2.i.b;
        this.f2342t = SystemClock.elapsedRealtimeNanos();
        boolean z8 = false;
        while (!this.f2323D && this.f2321B != null && !(z8 = this.f2321B.b())) {
            this.f2325F = i(this.f2325F);
            this.f2321B = h();
            if (this.f2325F == 4) {
                n(2);
                return;
            }
        }
        if ((this.f2325F == 6 || this.f2323D) && !z8) {
            l();
        }
    }

    public final void p() {
        String str;
        int d2 = AbstractC2965e.d(this.f2326G);
        if (d2 != 0) {
            if (d2 != 1) {
                if (d2 == 2) {
                    g();
                    return;
                }
                int i9 = this.f2326G;
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            str = "null";
                        } else {
                            str = "DECODE_DATA";
                        }
                    } else {
                        str = "SWITCH_TO_SOURCE_SERVICE";
                    }
                } else {
                    str = "INITIALIZE";
                }
                throw new IllegalStateException("Unrecognized run reason: ".concat(str));
            }
            o();
            return;
        }
        this.f2325F = i(1);
        this.f2321B = h();
        o();
    }

    public final void q() {
        Throwable th;
        this.f2329d.a();
        if (this.f2322C) {
            if (this.f2328c.isEmpty()) {
                th = null;
            } else {
                th = (Throwable) com.mbridge.msdk.foundation.entity.o.g(this.f2328c, 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f2322C = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.e eVar = this.f2320A;
        try {
            try {
                if (this.f2323D) {
                    l();
                    if (eVar != null) {
                        eVar.b();
                        return;
                    }
                    return;
                }
                p();
                if (eVar != null) {
                    eVar.b();
                }
            } catch (C0230d e4) {
                throw e4;
            } catch (Throwable th) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f2323D + ", stage: " + AbstractC2914a.p(this.f2325F), th);
                }
                if (this.f2325F != 5) {
                    this.f2328c.add(th);
                    l();
                }
                if (!this.f2323D) {
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (eVar != null) {
                eVar.b();
            }
            throw th2;
        }
    }
}
