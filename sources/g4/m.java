package g4;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class m implements g, Runnable, Comparable, x4.b {
    public e4.a A;
    public com.bumptech.glide.load.data.e B;
    public volatile h C;
    public volatile boolean D;
    public volatile boolean E;
    public boolean F;
    public int G;
    public int H;

    /* renamed from: f, reason: collision with root package name */
    public final q f18116f;

    /* renamed from: g, reason: collision with root package name */
    public final m0.c f18117g;

    /* renamed from: j, reason: collision with root package name */
    public com.bumptech.glide.g f18120j;

    /* renamed from: k, reason: collision with root package name */
    public e4.j f18121k;

    /* renamed from: l, reason: collision with root package name */
    public com.bumptech.glide.h f18122l;

    /* renamed from: m, reason: collision with root package name */
    public x f18123m;

    /* renamed from: n, reason: collision with root package name */
    public int f18124n;

    /* renamed from: o, reason: collision with root package name */
    public int f18125o;

    /* renamed from: p, reason: collision with root package name */
    public p f18126p;

    /* renamed from: q, reason: collision with root package name */
    public e4.m f18127q;

    /* renamed from: r, reason: collision with root package name */
    public j f18128r;

    /* renamed from: s, reason: collision with root package name */
    public int f18129s;

    /* renamed from: t, reason: collision with root package name */
    public long f18130t;
    public boolean u;

    /* renamed from: v, reason: collision with root package name */
    public Object f18131v;

    /* renamed from: w, reason: collision with root package name */
    public Thread f18132w;

    /* renamed from: x, reason: collision with root package name */
    public e4.j f18133x;

    /* renamed from: y, reason: collision with root package name */
    public e4.j f18134y;

    /* renamed from: z, reason: collision with root package name */
    public Object f18135z;

    /* renamed from: b, reason: collision with root package name */
    public final i f18113b = new i();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f18114c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final x4.d f18115d = new x4.d();

    /* renamed from: h, reason: collision with root package name */
    public final k f18118h = new k();

    /* renamed from: i, reason: collision with root package name */
    public final l f18119i = new l();

    public m(q qVar, m0.c cVar) {
        this.f18116f = qVar;
        this.f18117g = cVar;
    }

    @Override // g4.g
    public final void a(e4.j jVar, Exception exc, com.bumptech.glide.load.data.e eVar, e4.a aVar) {
        eVar.b();
        b0 b0Var = new b0("Fetching data failed", Collections.singletonList(exc));
        Class a = eVar.a();
        b0Var.f18038c = jVar;
        b0Var.f18039d = aVar;
        b0Var.f18040f = a;
        this.f18114c.add(b0Var);
        if (Thread.currentThread() != this.f18132w) {
            n(2);
        } else {
            o();
        }
    }

    @Override // x4.b
    public final x4.d b() {
        return this.f18115d;
    }

    @Override // g4.g
    public final void c(e4.j jVar, Object obj, com.bumptech.glide.load.data.e eVar, e4.a aVar, e4.j jVar2) {
        this.f18133x = jVar;
        this.f18135z = obj;
        this.B = eVar;
        this.A = aVar;
        this.f18134y = jVar2;
        boolean z10 = false;
        if (jVar != this.f18113b.a().get(0)) {
            z10 = true;
        }
        this.F = z10;
        if (Thread.currentThread() != this.f18132w) {
            n(3);
        } else {
            g();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        m mVar = (m) obj;
        int ordinal = this.f18122l.ordinal() - mVar.f18122l.ordinal();
        if (ordinal == 0) {
            return this.f18129s - mVar.f18129s;
        }
        return ordinal;
    }

    @Override // g4.g
    public final void d() {
        n(2);
    }

    public final g0 e(com.bumptech.glide.load.data.e eVar, Object obj, e4.a aVar) {
        if (obj == null) {
            return null;
        }
        try {
            int i10 = w4.g.f26732b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            g0 f10 = f(obj, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                j(elapsedRealtimeNanos, "Decoded result " + f10, null);
            }
            return f10;
        } finally {
            eVar.b();
        }
    }

    public final g0 f(Object obj, e4.a aVar) {
        boolean z10;
        Class<?> cls = obj.getClass();
        i iVar = this.f18113b;
        e0 c10 = iVar.c(cls);
        e4.m mVar = this.f18127q;
        if (Build.VERSION.SDK_INT >= 26) {
            if (aVar != e4.a.RESOURCE_DISK_CACHE && !iVar.f18091r) {
                z10 = false;
            } else {
                z10 = true;
            }
            e4.l lVar = n4.p.f22430i;
            Boolean bool = (Boolean) mVar.c(lVar);
            if (bool == null || (bool.booleanValue() && !z10)) {
                mVar = new e4.m();
                w4.c cVar = this.f18127q.f17107b;
                w4.c cVar2 = mVar.f17107b;
                cVar2.i(cVar);
                cVar2.put(lVar, Boolean.valueOf(z10));
            }
        }
        e4.m mVar2 = mVar;
        com.bumptech.glide.load.data.g f10 = this.f18120j.a().f(obj);
        try {
            return c10.a(this.f18124n, this.f18125o, new d3.g(this, aVar, 18), mVar2, f10);
        } finally {
            f10.b();
        }
    }

    public final void g() {
        g0 g0Var;
        boolean z10;
        boolean a;
        if (Log.isLoggable("DecodeJob", 2)) {
            j(this.f18130t, "Retrieved data", "data: " + this.f18135z + ", cache key: " + this.f18133x + ", fetcher: " + this.B);
        }
        f0 f0Var = null;
        try {
            g0Var = e(this.B, this.f18135z, this.A);
        } catch (b0 e2) {
            e4.j jVar = this.f18134y;
            e4.a aVar = this.A;
            e2.f18038c = jVar;
            e2.f18039d = aVar;
            e2.f18040f = null;
            this.f18114c.add(e2);
            g0Var = null;
        }
        if (g0Var != null) {
            e4.a aVar2 = this.A;
            boolean z11 = this.F;
            if (g0Var instanceof c0) {
                ((c0) g0Var).initialize();
            }
            boolean z12 = false;
            if (((f0) this.f18118h.f18103c) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                f0Var = (f0) f0.f18060g.d();
                com.bumptech.glide.c.l(f0Var);
                f0Var.f18064f = false;
                f0Var.f18063d = true;
                f0Var.f18062c = g0Var;
                g0Var = f0Var;
            }
            k(g0Var, aVar2, z11);
            this.G = 5;
            try {
                k kVar = this.f18118h;
                if (((f0) kVar.f18103c) != null) {
                    z12 = true;
                }
                if (z12) {
                    kVar.a(this.f18116f, this.f18127q);
                }
                l lVar = this.f18119i;
                synchronized (lVar) {
                    lVar.f18111b = true;
                    a = lVar.a();
                }
                if (a) {
                    m();
                    return;
                }
                return;
            } finally {
                if (f0Var != null) {
                    f0Var.d();
                }
            }
        }
        o();
    }

    public final h h() {
        int b3 = t.h.b(this.G);
        i iVar = this.f18113b;
        if (b3 != 1) {
            if (b3 != 2) {
                if (b3 != 3) {
                    if (b3 == 5) {
                        return null;
                    }
                    throw new IllegalStateException("Unrecognized stage: ".concat(eb.j.z(this.G)));
                }
                return new k0(iVar, this);
            }
            return new e(iVar.a(), iVar, this);
        }
        return new h0(iVar, this);
    }

    public final int i(int i10) {
        if (i10 != 0) {
            int i11 = i10 - 1;
            boolean z10 = false;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3 || i11 == 5) {
                            return 6;
                        }
                        throw new IllegalArgumentException("Unrecognized stage: ".concat(eb.j.z(i10)));
                    }
                    if (this.u) {
                        return 6;
                    }
                    return 4;
                }
                switch (((o) this.f18126p).f18140d) {
                    case 1:
                        break;
                    default:
                        z10 = true;
                        break;
                }
                if (z10) {
                    return 3;
                }
                return i(3);
            }
            switch (((o) this.f18126p).f18140d) {
                case 1:
                case 2:
                    break;
                default:
                    z10 = true;
                    break;
            }
            if (z10) {
                return 2;
            }
            return i(2);
        }
        throw null;
    }

    public final void j(long j3, String str, String str2) {
        String str3;
        StringBuilder n10 = eb.j.n(str, " in ");
        n10.append(w4.g.a(j3));
        n10.append(", load key: ");
        n10.append(this.f18123m);
        if (str2 != null) {
            str3 = ", ".concat(str2);
        } else {
            str3 = "";
        }
        n10.append(str3);
        n10.append(", thread: ");
        n10.append(Thread.currentThread().getName());
        Log.v("DecodeJob", n10.toString());
    }

    public final void k(g0 g0Var, e4.a aVar, boolean z10) {
        Map map;
        q();
        v vVar = (v) this.f18128r;
        synchronized (vVar) {
            vVar.f18173s = g0Var;
            vVar.f18174t = aVar;
            vVar.A = z10;
        }
        synchronized (vVar) {
            vVar.f18158c.a();
            if (vVar.f18179z) {
                vVar.f18173s.a();
                vVar.g();
                return;
            }
            if (!vVar.f18157b.f18156b.isEmpty()) {
                if (!vVar.u) {
                    com.facebook.b bVar = vVar.f18161g;
                    g0 g0Var2 = vVar.f18173s;
                    boolean z11 = vVar.f18169o;
                    e4.j jVar = vVar.f18168n;
                    y yVar = vVar.f18159d;
                    bVar.getClass();
                    vVar.f18177x = new z(g0Var2, z11, true, jVar, yVar);
                    int i10 = 1;
                    vVar.u = true;
                    u uVar = vVar.f18157b;
                    uVar.getClass();
                    ArrayList arrayList = new ArrayList(uVar.f18156b);
                    u uVar2 = new u(arrayList);
                    vVar.e(arrayList.size() + 1);
                    e4.j jVar2 = vVar.f18168n;
                    z zVar = vVar.f18177x;
                    r rVar = (r) vVar.f18162h;
                    synchronized (rVar) {
                        if (zVar != null) {
                            if (zVar.f18189b) {
                                rVar.f18151g.a(jVar2, zVar);
                            }
                        }
                        d0 d0Var = rVar.a;
                        d0Var.getClass();
                        if (vVar.f18172r) {
                            map = d0Var.f18046b;
                        } else {
                            map = d0Var.a;
                        }
                        if (vVar.equals(map.get(jVar2))) {
                            map.remove(jVar2);
                        }
                    }
                    Iterator it = uVar2.iterator();
                    while (it.hasNext()) {
                        t tVar = (t) it.next();
                        tVar.f18155b.execute(new s(vVar, tVar.a, i10));
                    }
                    vVar.d();
                    return;
                }
                throw new IllegalStateException("Already have resource");
            }
            throw new IllegalStateException("Received a resource without any callbacks to notify");
        }
    }

    public final void l() {
        Map map;
        boolean a;
        q();
        b0 b0Var = new b0("Failed to load resource", new ArrayList(this.f18114c));
        v vVar = (v) this.f18128r;
        synchronized (vVar) {
            vVar.f18175v = b0Var;
        }
        synchronized (vVar) {
            vVar.f18158c.a();
            if (vVar.f18179z) {
                vVar.g();
            } else if (!vVar.f18157b.f18156b.isEmpty()) {
                if (!vVar.f18176w) {
                    vVar.f18176w = true;
                    e4.j jVar = vVar.f18168n;
                    u uVar = vVar.f18157b;
                    uVar.getClass();
                    ArrayList arrayList = new ArrayList(uVar.f18156b);
                    u uVar2 = new u(arrayList);
                    vVar.e(arrayList.size() + 1);
                    r rVar = (r) vVar.f18162h;
                    synchronized (rVar) {
                        d0 d0Var = rVar.a;
                        d0Var.getClass();
                        if (vVar.f18172r) {
                            map = d0Var.f18046b;
                        } else {
                            map = d0Var.a;
                        }
                        if (vVar.equals(map.get(jVar))) {
                            map.remove(jVar);
                        }
                    }
                    Iterator it = uVar2.iterator();
                    while (it.hasNext()) {
                        t tVar = (t) it.next();
                        tVar.f18155b.execute(new s(vVar, tVar.a, 0));
                    }
                    vVar.d();
                } else {
                    throw new IllegalStateException("Already failed once");
                }
            } else {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
        }
        l lVar = this.f18119i;
        synchronized (lVar) {
            lVar.f18112c = true;
            a = lVar.a();
        }
        if (a) {
            m();
        }
    }

    public final void m() {
        l lVar = this.f18119i;
        synchronized (lVar) {
            lVar.f18111b = false;
            lVar.a = false;
            lVar.f18112c = false;
        }
        k kVar = this.f18118h;
        kVar.a = null;
        kVar.f18102b = null;
        kVar.f18103c = null;
        i iVar = this.f18113b;
        iVar.f18076c = null;
        iVar.f18077d = null;
        iVar.f18087n = null;
        iVar.f18080g = null;
        iVar.f18084k = null;
        iVar.f18082i = null;
        iVar.f18088o = null;
        iVar.f18083j = null;
        iVar.f18089p = null;
        iVar.a.clear();
        iVar.f18085l = false;
        iVar.f18075b.clear();
        iVar.f18086m = false;
        this.D = false;
        this.f18120j = null;
        this.f18121k = null;
        this.f18127q = null;
        this.f18122l = null;
        this.f18123m = null;
        this.f18128r = null;
        this.G = 0;
        this.C = null;
        this.f18132w = null;
        this.f18133x = null;
        this.f18135z = null;
        this.A = null;
        this.B = null;
        this.f18130t = 0L;
        this.E = false;
        this.f18131v = null;
        this.f18114c.clear();
        this.f18117g.c(this);
    }

    public final void n(int i10) {
        j4.e eVar;
        this.H = i10;
        v vVar = (v) this.f18128r;
        if (vVar.f18170p) {
            eVar = vVar.f18165k;
        } else if (vVar.f18171q) {
            eVar = vVar.f18166l;
        } else {
            eVar = vVar.f18164j;
        }
        eVar.execute(this);
    }

    public final void o() {
        this.f18132w = Thread.currentThread();
        int i10 = w4.g.f26732b;
        this.f18130t = SystemClock.elapsedRealtimeNanos();
        boolean z10 = false;
        while (!this.E && this.C != null && !(z10 = this.C.b())) {
            this.G = i(this.G);
            this.C = h();
            if (this.G == 4) {
                n(2);
                return;
            }
        }
        if ((this.G == 6 || this.E) && !z10) {
            l();
        }
    }

    public final void p() {
        int b3 = t.h.b(this.H);
        if (b3 != 0) {
            if (b3 != 1) {
                if (b3 == 2) {
                    g();
                    return;
                }
                throw new IllegalStateException("Unrecognized run reason: ".concat(eb.j.y(this.H)));
            }
            o();
            return;
        }
        this.G = i(1);
        this.C = h();
        o();
    }

    public final void q() {
        Throwable th2;
        this.f18115d.a();
        if (this.D) {
            if (this.f18114c.isEmpty()) {
                th2 = null;
            } else {
                ArrayList arrayList = this.f18114c;
                th2 = (Throwable) arrayList.get(arrayList.size() - 1);
            }
            throw new IllegalStateException("Already notified", th2);
        }
        this.D = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.e eVar = this.B;
        try {
            try {
                if (this.E) {
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
            } catch (d e2) {
                throw e2;
            } catch (Throwable th2) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.E + ", stage: " + eb.j.z(this.G), th2);
                }
                if (this.G != 5) {
                    this.f18114c.add(th2);
                    l();
                }
                if (!this.E) {
                    throw th2;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            if (eVar != null) {
                eVar.b();
            }
            throw th3;
        }
    }
}
