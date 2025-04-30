package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.wd;
import com.applovin.impl.xd;
import com.applovin.impl.y6;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class z3 extends AbstractC0675b2 {

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f12495g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private Handler f12496h;

    /* renamed from: i, reason: collision with root package name */
    private yo f12497i;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final wd f12501a;
        public final wd.b b;

        /* renamed from: c, reason: collision with root package name */
        public final a f12502c;

        public b(wd wdVar, wd.b bVar, a aVar) {
            this.f12501a = wdVar;
            this.b = bVar;
            this.f12502c = aVar;
        }
    }

    public int a(Object obj, int i9) {
        return i9;
    }

    public abstract wd.a a(Object obj, wd.a aVar);

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract void a(Object obj, wd wdVar, go goVar);

    @Override // com.applovin.impl.AbstractC0675b2
    public void e() {
        for (b bVar : this.f12495g.values()) {
            bVar.f12501a.a(bVar.b);
        }
    }

    @Override // com.applovin.impl.AbstractC0675b2
    public void f() {
        for (b bVar : this.f12495g.values()) {
            bVar.f12501a.b(bVar.b);
        }
    }

    @Override // com.applovin.impl.AbstractC0675b2
    public void h() {
        for (b bVar : this.f12495g.values()) {
            bVar.f12501a.c(bVar.b);
            bVar.f12501a.a((xd) bVar.f12502c);
            bVar.f12501a.a((y6) bVar.f12502c);
        }
        this.f12495g.clear();
    }

    /* loaded from: classes.dex */
    public final class a implements xd, y6 {

        /* renamed from: a, reason: collision with root package name */
        private final Object f12498a;
        private xd.a b;

        /* renamed from: c, reason: collision with root package name */
        private y6.a f12499c;

        public a(Object obj) {
            this.b = z3.this.b((wd.a) null);
            this.f12499c = z3.this.a((wd.a) null);
            this.f12498a = obj;
        }

        private pd a(pd pdVar) {
            long a6 = z3.this.a(this.f12498a, pdVar.f10007f);
            long a9 = z3.this.a(this.f12498a, pdVar.f10008g);
            return (a6 == pdVar.f10007f && a9 == pdVar.f10008g) ? pdVar : new pd(pdVar.f10003a, pdVar.b, pdVar.f10004c, pdVar.f10005d, pdVar.f10006e, a6, a9);
        }

        private boolean f(int i9, wd.a aVar) {
            wd.a aVar2;
            if (aVar != null) {
                aVar2 = z3.this.a(this.f12498a, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int a6 = z3.this.a(this.f12498a, i9);
            xd.a aVar3 = this.b;
            if (aVar3.f12171a != a6 || !yp.a(aVar3.b, aVar2)) {
                this.b = z3.this.a(a6, aVar2, 0L);
            }
            y6.a aVar4 = this.f12499c;
            if (aVar4.f12342a != a6 || !yp.a(aVar4.b, aVar2)) {
                this.f12499c = z3.this.a(a6, aVar2);
                return true;
            }
            return true;
        }

        @Override // com.applovin.impl.y6
        public void b(int i9, wd.a aVar) {
            if (f(i9, aVar)) {
                this.f12499c.d();
            }
        }

        @Override // com.applovin.impl.y6
        public void c(int i9, wd.a aVar) {
            if (f(i9, aVar)) {
                this.f12499c.c();
            }
        }

        @Override // com.applovin.impl.y6
        public void d(int i9, wd.a aVar) {
            if (f(i9, aVar)) {
                this.f12499c.a();
            }
        }

        @Override // com.applovin.impl.xd
        public void b(int i9, wd.a aVar, ic icVar, pd pdVar) {
            if (f(i9, aVar)) {
                this.b.c(icVar, a(pdVar));
            }
        }

        @Override // com.applovin.impl.xd
        public void c(int i9, wd.a aVar, ic icVar, pd pdVar) {
            if (f(i9, aVar)) {
                this.b.b(icVar, a(pdVar));
            }
        }

        @Override // com.applovin.impl.xd
        public void a(int i9, wd.a aVar, pd pdVar) {
            if (f(i9, aVar)) {
                this.b.a(a(pdVar));
            }
        }

        @Override // com.applovin.impl.y6
        public void a(int i9, wd.a aVar) {
            if (f(i9, aVar)) {
                this.f12499c.b();
            }
        }

        @Override // com.applovin.impl.y6
        public void a(int i9, wd.a aVar, int i10) {
            if (f(i9, aVar)) {
                this.f12499c.a(i10);
            }
        }

        @Override // com.applovin.impl.y6
        public void a(int i9, wd.a aVar, Exception exc) {
            if (f(i9, aVar)) {
                this.f12499c.a(exc);
            }
        }

        @Override // com.applovin.impl.xd
        public void a(int i9, wd.a aVar, ic icVar, pd pdVar) {
            if (f(i9, aVar)) {
                this.b.a(icVar, a(pdVar));
            }
        }

        @Override // com.applovin.impl.xd
        public void a(int i9, wd.a aVar, ic icVar, pd pdVar, IOException iOException, boolean z8) {
            if (f(i9, aVar)) {
                this.b.a(icVar, a(pdVar), iOException, z8);
            }
        }
    }

    public long a(Object obj, long j7) {
        return j7;
    }

    public final void a(final Object obj, wd wdVar) {
        AbstractC0669a1.a(!this.f12495g.containsKey(obj));
        wd.b bVar = new wd.b() { // from class: com.applovin.impl.C3
            @Override // com.applovin.impl.wd.b
            public final void a(wd wdVar2, go goVar) {
                z3.this.a(obj, wdVar2, goVar);
            }
        };
        a aVar = new a(obj);
        this.f12495g.put(obj, new b(wdVar, bVar, aVar));
        wdVar.a((Handler) AbstractC0669a1.a(this.f12496h), (xd) aVar);
        wdVar.a((Handler) AbstractC0669a1.a(this.f12496h), (y6) aVar);
        wdVar.a(bVar, this.f12497i);
        if (g()) {
            return;
        }
        wdVar.a(bVar);
    }

    @Override // com.applovin.impl.AbstractC0675b2
    public void a(yo yoVar) {
        this.f12497i = yoVar;
        this.f12496h = yp.a();
    }
}
