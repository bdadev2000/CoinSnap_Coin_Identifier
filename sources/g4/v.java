package g4;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class v implements j, x4.b {
    public static final com.facebook.b B = new com.facebook.b(9);
    public boolean A;

    /* renamed from: b, reason: collision with root package name */
    public final u f18157b;

    /* renamed from: c, reason: collision with root package name */
    public final x4.d f18158c;

    /* renamed from: d, reason: collision with root package name */
    public final y f18159d;

    /* renamed from: f, reason: collision with root package name */
    public final m0.c f18160f;

    /* renamed from: g, reason: collision with root package name */
    public final com.facebook.b f18161g;

    /* renamed from: h, reason: collision with root package name */
    public final w f18162h;

    /* renamed from: i, reason: collision with root package name */
    public final j4.e f18163i;

    /* renamed from: j, reason: collision with root package name */
    public final j4.e f18164j;

    /* renamed from: k, reason: collision with root package name */
    public final j4.e f18165k;

    /* renamed from: l, reason: collision with root package name */
    public final j4.e f18166l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicInteger f18167m;

    /* renamed from: n, reason: collision with root package name */
    public e4.j f18168n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f18169o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f18170p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f18171q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18172r;

    /* renamed from: s, reason: collision with root package name */
    public g0 f18173s;

    /* renamed from: t, reason: collision with root package name */
    public e4.a f18174t;
    public boolean u;

    /* renamed from: v, reason: collision with root package name */
    public b0 f18175v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f18176w;

    /* renamed from: x, reason: collision with root package name */
    public z f18177x;

    /* renamed from: y, reason: collision with root package name */
    public m f18178y;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f18179z;

    public v(j4.e eVar, j4.e eVar2, j4.e eVar3, j4.e eVar4, w wVar, y yVar, m0.c cVar) {
        com.facebook.b bVar = B;
        this.f18157b = new u(new ArrayList(2));
        this.f18158c = new x4.d();
        this.f18167m = new AtomicInteger();
        this.f18163i = eVar;
        this.f18164j = eVar2;
        this.f18165k = eVar3;
        this.f18166l = eVar4;
        this.f18162h = wVar;
        this.f18159d = yVar;
        this.f18160f = cVar;
        this.f18161g = bVar;
    }

    public final synchronized void a(s4.g gVar, Executor executor) {
        this.f18158c.a();
        u uVar = this.f18157b;
        uVar.getClass();
        uVar.f18156b.add(new t(gVar, executor));
        boolean z10 = true;
        boolean z11 = true;
        if (this.u) {
            e(1);
            executor.execute(new s(this, gVar, z11 ? 1 : 0));
        } else {
            int i10 = 0;
            if (this.f18176w) {
                e(1);
                executor.execute(new s(this, gVar, i10));
            } else {
                if (this.f18179z) {
                    z10 = false;
                }
                com.bumptech.glide.c.h("Cannot add callbacks to a cancelled EngineJob", z10);
            }
        }
    }

    @Override // x4.b
    public final x4.d b() {
        return this.f18158c;
    }

    public final void c() {
        Map map;
        if (f()) {
            return;
        }
        this.f18179z = true;
        m mVar = this.f18178y;
        mVar.E = true;
        h hVar = mVar.C;
        if (hVar != null) {
            hVar.cancel();
        }
        w wVar = this.f18162h;
        e4.j jVar = this.f18168n;
        r rVar = (r) wVar;
        synchronized (rVar) {
            d0 d0Var = rVar.a;
            d0Var.getClass();
            if (this.f18172r) {
                map = d0Var.f18046b;
            } else {
                map = d0Var.a;
            }
            if (equals(map.get(jVar))) {
                map.remove(jVar);
            }
        }
    }

    public final void d() {
        boolean z10;
        z zVar;
        synchronized (this) {
            this.f18158c.a();
            com.bumptech.glide.c.h("Not yet complete!", f());
            int decrementAndGet = this.f18167m.decrementAndGet();
            if (decrementAndGet >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            com.bumptech.glide.c.h("Can't decrement below 0", z10);
            if (decrementAndGet == 0) {
                zVar = this.f18177x;
                g();
            } else {
                zVar = null;
            }
        }
        if (zVar != null) {
            zVar.d();
        }
    }

    public final synchronized void e(int i10) {
        z zVar;
        com.bumptech.glide.c.h("Not yet complete!", f());
        if (this.f18167m.getAndAdd(i10) == 0 && (zVar = this.f18177x) != null) {
            zVar.b();
        }
    }

    public final boolean f() {
        return this.f18176w || this.u || this.f18179z;
    }

    public final synchronized void g() {
        boolean a;
        if (this.f18168n != null) {
            this.f18157b.f18156b.clear();
            this.f18168n = null;
            this.f18177x = null;
            this.f18173s = null;
            this.f18176w = false;
            this.f18179z = false;
            this.u = false;
            this.A = false;
            m mVar = this.f18178y;
            l lVar = mVar.f18119i;
            synchronized (lVar) {
                lVar.a = true;
                a = lVar.a();
            }
            if (a) {
                mVar.m();
            }
            this.f18178y = null;
            this.f18175v = null;
            this.f18174t = null;
            this.f18160f.c(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void h(s4.g gVar) {
        boolean z10;
        this.f18158c.a();
        u uVar = this.f18157b;
        uVar.f18156b.remove(new t(gVar, d6.g.f16895l));
        if (this.f18157b.f18156b.isEmpty()) {
            c();
            if (!this.u && !this.f18176w) {
                z10 = false;
                if (z10 && this.f18167m.get() == 0) {
                    g();
                }
            }
            z10 = true;
            if (z10) {
                g();
            }
        }
    }
}
