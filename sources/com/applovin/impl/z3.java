package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.wd;
import com.applovin.impl.xd;
import com.applovin.impl.y6;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class z3 extends b2 {

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f9311g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private Handler f9312h;

    /* renamed from: i, reason: collision with root package name */
    private yo f9313i;

    /* loaded from: classes.dex */
    public static final class b {
        public final wd a;

        /* renamed from: b, reason: collision with root package name */
        public final wd.b f9317b;

        /* renamed from: c, reason: collision with root package name */
        public final a f9318c;

        public b(wd wdVar, wd.b bVar, a aVar) {
            this.a = wdVar;
            this.f9317b = bVar;
            this.f9318c = aVar;
        }
    }

    public int a(Object obj, int i10) {
        return i10;
    }

    public abstract wd.a a(Object obj, wd.a aVar);

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract void a(Object obj, wd wdVar, go goVar);

    @Override // com.applovin.impl.b2
    public void e() {
        for (b bVar : this.f9311g.values()) {
            bVar.a.a(bVar.f9317b);
        }
    }

    @Override // com.applovin.impl.b2
    public void f() {
        for (b bVar : this.f9311g.values()) {
            bVar.a.b(bVar.f9317b);
        }
    }

    @Override // com.applovin.impl.b2
    public void h() {
        for (b bVar : this.f9311g.values()) {
            bVar.a.c(bVar.f9317b);
            bVar.a.a((xd) bVar.f9318c);
            bVar.a.a((y6) bVar.f9318c);
        }
        this.f9311g.clear();
    }

    /* loaded from: classes.dex */
    public final class a implements xd, y6 {
        private final Object a;

        /* renamed from: b, reason: collision with root package name */
        private xd.a f9314b;

        /* renamed from: c, reason: collision with root package name */
        private y6.a f9315c;

        public a(Object obj) {
            this.f9314b = z3.this.b((wd.a) null);
            this.f9315c = z3.this.a((wd.a) null);
            this.a = obj;
        }

        private pd a(pd pdVar) {
            long a = z3.this.a(this.a, pdVar.f6937f);
            long a10 = z3.this.a(this.a, pdVar.f6938g);
            return (a == pdVar.f6937f && a10 == pdVar.f6938g) ? pdVar : new pd(pdVar.a, pdVar.f6933b, pdVar.f6934c, pdVar.f6935d, pdVar.f6936e, a, a10);
        }

        private boolean f(int i10, wd.a aVar) {
            wd.a aVar2;
            if (aVar != null) {
                aVar2 = z3.this.a(this.a, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int a = z3.this.a(this.a, i10);
            xd.a aVar3 = this.f9314b;
            if (aVar3.a != a || !yp.a(aVar3.f8969b, aVar2)) {
                this.f9314b = z3.this.a(a, aVar2, 0L);
            }
            y6.a aVar4 = this.f9315c;
            if (aVar4.a != a || !yp.a(aVar4.f9138b, aVar2)) {
                this.f9315c = z3.this.a(a, aVar2);
                return true;
            }
            return true;
        }

        @Override // com.applovin.impl.y6
        public void b(int i10, wd.a aVar) {
            if (f(i10, aVar)) {
                this.f9315c.d();
            }
        }

        @Override // com.applovin.impl.y6
        public void c(int i10, wd.a aVar) {
            if (f(i10, aVar)) {
                this.f9315c.c();
            }
        }

        @Override // com.applovin.impl.y6
        public void d(int i10, wd.a aVar) {
            if (f(i10, aVar)) {
                this.f9315c.a();
            }
        }

        @Override // com.applovin.impl.xd
        public void b(int i10, wd.a aVar, ic icVar, pd pdVar) {
            if (f(i10, aVar)) {
                this.f9314b.c(icVar, a(pdVar));
            }
        }

        @Override // com.applovin.impl.xd
        public void c(int i10, wd.a aVar, ic icVar, pd pdVar) {
            if (f(i10, aVar)) {
                this.f9314b.b(icVar, a(pdVar));
            }
        }

        @Override // com.applovin.impl.xd
        public void a(int i10, wd.a aVar, pd pdVar) {
            if (f(i10, aVar)) {
                this.f9314b.a(a(pdVar));
            }
        }

        @Override // com.applovin.impl.y6
        public void a(int i10, wd.a aVar) {
            if (f(i10, aVar)) {
                this.f9315c.b();
            }
        }

        @Override // com.applovin.impl.y6
        public void a(int i10, wd.a aVar, int i11) {
            if (f(i10, aVar)) {
                this.f9315c.a(i11);
            }
        }

        @Override // com.applovin.impl.y6
        public void a(int i10, wd.a aVar, Exception exc) {
            if (f(i10, aVar)) {
                this.f9315c.a(exc);
            }
        }

        @Override // com.applovin.impl.xd
        public void a(int i10, wd.a aVar, ic icVar, pd pdVar) {
            if (f(i10, aVar)) {
                this.f9314b.a(icVar, a(pdVar));
            }
        }

        @Override // com.applovin.impl.xd
        public void a(int i10, wd.a aVar, ic icVar, pd pdVar, IOException iOException, boolean z10) {
            if (f(i10, aVar)) {
                this.f9314b.a(icVar, a(pdVar), iOException, z10);
            }
        }
    }

    public long a(Object obj, long j3) {
        return j3;
    }

    public final void a(final Object obj, wd wdVar) {
        a1.a(!this.f9311g.containsKey(obj));
        wd.b bVar = new wd.b() { // from class: com.applovin.impl.lw
            @Override // com.applovin.impl.wd.b
            public final void a(wd wdVar2, go goVar) {
                z3.this.a(obj, wdVar2, goVar);
            }
        };
        a aVar = new a(obj);
        this.f9311g.put(obj, new b(wdVar, bVar, aVar));
        wdVar.a((Handler) a1.a(this.f9312h), (xd) aVar);
        wdVar.a((Handler) a1.a(this.f9312h), (y6) aVar);
        wdVar.a(bVar, this.f9313i);
        if (g()) {
            return;
        }
        wdVar.a(bVar);
    }

    @Override // com.applovin.impl.b2
    public void a(yo yoVar) {
        this.f9313i = yoVar;
        this.f9312h = yp.a();
    }
}
