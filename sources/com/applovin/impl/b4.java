package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.a7;
import com.applovin.impl.be;
import com.applovin.impl.ce;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class b4 extends c2 {

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f22979g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private Handler f22980h;

    /* renamed from: i, reason: collision with root package name */
    private xo f22981i;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final be f22985a;

        /* renamed from: b, reason: collision with root package name */
        public final be.b f22986b;

        /* renamed from: c, reason: collision with root package name */
        public final a f22987c;

        public b(be beVar, be.b bVar, a aVar) {
            this.f22985a = beVar;
            this.f22986b = bVar;
            this.f22987c = aVar;
        }
    }

    public int a(Object obj, int i2) {
        return i2;
    }

    public abstract be.a a(Object obj, be.a aVar);

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract void a(Object obj, be beVar, fo foVar);

    @Override // com.applovin.impl.c2
    public void e() {
        for (b bVar : this.f22979g.values()) {
            bVar.f22985a.a(bVar.f22986b);
        }
    }

    @Override // com.applovin.impl.c2
    public void f() {
        for (b bVar : this.f22979g.values()) {
            bVar.f22985a.b(bVar.f22986b);
        }
    }

    @Override // com.applovin.impl.c2
    public void h() {
        for (b bVar : this.f22979g.values()) {
            bVar.f22985a.c(bVar.f22986b);
            bVar.f22985a.a((ce) bVar.f22987c);
            bVar.f22985a.a((a7) bVar.f22987c);
        }
        this.f22979g.clear();
    }

    /* loaded from: classes.dex */
    public final class a implements ce, a7 {

        /* renamed from: a, reason: collision with root package name */
        private final Object f22982a;

        /* renamed from: b, reason: collision with root package name */
        private ce.a f22983b;

        /* renamed from: c, reason: collision with root package name */
        private a7.a f22984c;

        public a(Object obj) {
            this.f22983b = b4.this.b((be.a) null);
            this.f22984c = b4.this.a((be.a) null);
            this.f22982a = obj;
        }

        private ud a(ud udVar) {
            long a2 = b4.this.a(this.f22982a, udVar.f27315f);
            long a3 = b4.this.a(this.f22982a, udVar.f27316g);
            return (a2 == udVar.f27315f && a3 == udVar.f27316g) ? udVar : new ud(udVar.f27312a, udVar.f27313b, udVar.f27314c, udVar.d, udVar.e, a2, a3);
        }

        private boolean f(int i2, be.a aVar) {
            be.a aVar2;
            if (aVar != null) {
                aVar2 = b4.this.a(this.f22982a, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int a2 = b4.this.a(this.f22982a, i2);
            ce.a aVar3 = this.f22983b;
            if (aVar3.f23269a != a2 || !xp.a(aVar3.f23270b, aVar2)) {
                this.f22983b = b4.this.a(a2, aVar2, 0L);
            }
            a7.a aVar4 = this.f22984c;
            if (aVar4.f22699a == a2 && xp.a(aVar4.f22700b, aVar2)) {
                return true;
            }
            this.f22984c = b4.this.a(a2, aVar2);
            return true;
        }

        @Override // com.applovin.impl.a7
        public void b(int i2, be.a aVar) {
            if (f(i2, aVar)) {
                this.f22984c.d();
            }
        }

        @Override // com.applovin.impl.a7
        public void c(int i2, be.a aVar) {
            if (f(i2, aVar)) {
                this.f22984c.c();
            }
        }

        @Override // com.applovin.impl.a7
        public void d(int i2, be.a aVar) {
            if (f(i2, aVar)) {
                this.f22984c.a();
            }
        }

        @Override // com.applovin.impl.ce
        public void b(int i2, be.a aVar, nc ncVar, ud udVar) {
            if (f(i2, aVar)) {
                this.f22983b.c(ncVar, a(udVar));
            }
        }

        @Override // com.applovin.impl.ce
        public void c(int i2, be.a aVar, nc ncVar, ud udVar) {
            if (f(i2, aVar)) {
                this.f22983b.b(ncVar, a(udVar));
            }
        }

        @Override // com.applovin.impl.ce
        public void a(int i2, be.a aVar, ud udVar) {
            if (f(i2, aVar)) {
                this.f22983b.a(a(udVar));
            }
        }

        @Override // com.applovin.impl.a7
        public void a(int i2, be.a aVar) {
            if (f(i2, aVar)) {
                this.f22984c.b();
            }
        }

        @Override // com.applovin.impl.a7
        public void a(int i2, be.a aVar, int i3) {
            if (f(i2, aVar)) {
                this.f22984c.a(i3);
            }
        }

        @Override // com.applovin.impl.a7
        public void a(int i2, be.a aVar, Exception exc) {
            if (f(i2, aVar)) {
                this.f22984c.a(exc);
            }
        }

        @Override // com.applovin.impl.ce
        public void a(int i2, be.a aVar, nc ncVar, ud udVar) {
            if (f(i2, aVar)) {
                this.f22983b.a(ncVar, a(udVar));
            }
        }

        @Override // com.applovin.impl.ce
        public void a(int i2, be.a aVar, nc ncVar, ud udVar, IOException iOException, boolean z2) {
            if (f(i2, aVar)) {
                this.f22983b.a(ncVar, a(udVar), iOException, z2);
            }
        }
    }

    public long a(Object obj, long j2) {
        return j2;
    }

    public final void a(final Object obj, be beVar) {
        b1.a(!this.f22979g.containsKey(obj));
        be.b bVar = new be.b() { // from class: com.applovin.impl.qs
            @Override // com.applovin.impl.be.b
            public final void a(be beVar2, fo foVar) {
                b4.this.a(obj, beVar2, foVar);
            }
        };
        a aVar = new a(obj);
        this.f22979g.put(obj, new b(beVar, bVar, aVar));
        beVar.a((Handler) b1.a(this.f22980h), (ce) aVar);
        beVar.a((Handler) b1.a(this.f22980h), (a7) aVar);
        beVar.a(bVar, this.f22981i);
        if (g()) {
            return;
        }
        beVar.a(bVar);
    }

    @Override // com.applovin.impl.c2
    public void a(xo xoVar) {
        this.f22981i = xoVar;
        this.f22980h = xp.a();
    }
}
