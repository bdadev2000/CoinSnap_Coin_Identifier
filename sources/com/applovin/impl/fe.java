package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.a7;
import com.applovin.impl.be;
import com.applovin.impl.ce;
import com.applovin.impl.wj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class fe {
    private final d d;
    private final ce.a e;

    /* renamed from: f, reason: collision with root package name */
    private final a7.a f23898f;

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f23899g;

    /* renamed from: h, reason: collision with root package name */
    private final Set f23900h;

    /* renamed from: j, reason: collision with root package name */
    private boolean f23902j;

    /* renamed from: k, reason: collision with root package name */
    private xo f23903k;

    /* renamed from: i, reason: collision with root package name */
    private wj f23901i = new wj.a(0);

    /* renamed from: b, reason: collision with root package name */
    private final IdentityHashMap f23896b = new IdentityHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f23897c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final List f23895a = new ArrayList();

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final be f23907a;

        /* renamed from: b, reason: collision with root package name */
        public final be.b f23908b;

        /* renamed from: c, reason: collision with root package name */
        public final a f23909c;

        public b(be beVar, be.b bVar, a aVar) {
            this.f23907a = beVar;
            this.f23908b = bVar;
            this.f23909c = aVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements ee {

        /* renamed from: a, reason: collision with root package name */
        public final xc f23910a;
        public int d;
        public boolean e;

        /* renamed from: c, reason: collision with root package name */
        public final List f23912c = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f23911b = new Object();

        public c(be beVar, boolean z2) {
            this.f23910a = new xc(beVar, z2);
        }

        @Override // com.applovin.impl.ee
        public Object a() {
            return this.f23911b;
        }

        @Override // com.applovin.impl.ee
        public fo b() {
            return this.f23910a.i();
        }

        public void a(int i2) {
            this.d = i2;
            this.e = false;
            this.f23912c.clear();
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        void a();
    }

    public fe(d dVar, r0 r0Var, Handler handler) {
        this.d = dVar;
        ce.a aVar = new ce.a();
        this.e = aVar;
        a7.a aVar2 = new a7.a();
        this.f23898f = aVar2;
        this.f23899g = new HashMap();
        this.f23900h = new HashSet();
        if (r0Var != null) {
            aVar.a(handler, r0Var);
            aVar2.a(handler, r0Var);
        }
    }

    public int c() {
        return this.f23895a.size();
    }

    public boolean d() {
        return this.f23902j;
    }

    public void e() {
        for (b bVar : this.f23899g.values()) {
            try {
                bVar.f23907a.c(bVar.f23908b);
            } catch (RuntimeException e) {
                pc.a("MediaSourceList", "Failed to release child source.", e);
            }
            bVar.f23907a.a((ce) bVar.f23909c);
            bVar.f23907a.a((a7) bVar.f23909c);
        }
        this.f23899g.clear();
        this.f23900h.clear();
        this.f23902j = false;
    }

    /* loaded from: classes3.dex */
    public final class a implements ce, a7 {

        /* renamed from: a, reason: collision with root package name */
        private final c f23904a;

        /* renamed from: b, reason: collision with root package name */
        private ce.a f23905b;

        /* renamed from: c, reason: collision with root package name */
        private a7.a f23906c;

        public a(c cVar) {
            this.f23905b = fe.this.e;
            this.f23906c = fe.this.f23898f;
            this.f23904a = cVar;
        }

        private boolean f(int i2, be.a aVar) {
            be.a aVar2;
            if (aVar != null) {
                aVar2 = fe.b(this.f23904a, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int b2 = fe.b(this.f23904a, i2);
            ce.a aVar3 = this.f23905b;
            if (aVar3.f23269a != b2 || !xp.a(aVar3.f23270b, aVar2)) {
                this.f23905b = fe.this.e.a(b2, aVar2, 0L);
            }
            a7.a aVar4 = this.f23906c;
            if (aVar4.f22699a == b2 && xp.a(aVar4.f22700b, aVar2)) {
                return true;
            }
            this.f23906c = fe.this.f23898f.a(b2, aVar2);
            return true;
        }

        @Override // com.applovin.impl.ce
        public void a(int i2, be.a aVar, ud udVar) {
            if (f(i2, aVar)) {
                this.f23905b.a(udVar);
            }
        }

        @Override // com.applovin.impl.a7
        public void b(int i2, be.a aVar) {
            if (f(i2, aVar)) {
                this.f23906c.d();
            }
        }

        @Override // com.applovin.impl.a7
        public void c(int i2, be.a aVar) {
            if (f(i2, aVar)) {
                this.f23906c.c();
            }
        }

        @Override // com.applovin.impl.a7
        public void d(int i2, be.a aVar) {
            if (f(i2, aVar)) {
                this.f23906c.a();
            }
        }

        @Override // com.applovin.impl.a7
        public void a(int i2, be.a aVar) {
            if (f(i2, aVar)) {
                this.f23906c.b();
            }
        }

        @Override // com.applovin.impl.ce
        public void b(int i2, be.a aVar, nc ncVar, ud udVar) {
            if (f(i2, aVar)) {
                this.f23905b.c(ncVar, udVar);
            }
        }

        @Override // com.applovin.impl.ce
        public void c(int i2, be.a aVar, nc ncVar, ud udVar) {
            if (f(i2, aVar)) {
                this.f23905b.b(ncVar, udVar);
            }
        }

        @Override // com.applovin.impl.a7
        public void a(int i2, be.a aVar, int i3) {
            if (f(i2, aVar)) {
                this.f23906c.a(i3);
            }
        }

        @Override // com.applovin.impl.a7
        public void a(int i2, be.a aVar, Exception exc) {
            if (f(i2, aVar)) {
                this.f23906c.a(exc);
            }
        }

        @Override // com.applovin.impl.ce
        public void a(int i2, be.a aVar, nc ncVar, ud udVar) {
            if (f(i2, aVar)) {
                this.f23905b.a(ncVar, udVar);
            }
        }

        @Override // com.applovin.impl.ce
        public void a(int i2, be.a aVar, nc ncVar, ud udVar, IOException iOException, boolean z2) {
            if (f(i2, aVar)) {
                this.f23905b.a(ncVar, udVar, iOException, z2);
            }
        }
    }

    private void b() {
        Iterator it = this.f23900h.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f23912c.isEmpty()) {
                a(cVar);
                it.remove();
            }
        }
    }

    private void c(c cVar) {
        if (cVar.e && cVar.f23912c.isEmpty()) {
            b bVar = (b) b1.a((b) this.f23899g.remove(cVar));
            bVar.f23907a.c(bVar.f23908b);
            bVar.f23907a.a((ce) bVar.f23909c);
            bVar.f23907a.a((a7) bVar.f23909c);
            this.f23900h.remove(cVar);
        }
    }

    private void d(c cVar) {
        xc xcVar = cVar.f23910a;
        be.b bVar = new be.b() { // from class: com.applovin.impl.kt
            @Override // com.applovin.impl.be.b
            public final void a(be beVar, fo foVar) {
                fe.this.a(beVar, foVar);
            }
        };
        a aVar = new a(cVar);
        this.f23899g.put(cVar, new b(xcVar, bVar, aVar));
        xcVar.a(xp.b(), (ce) aVar);
        xcVar.a(xp.b(), (a7) aVar);
        xcVar.a(bVar, this.f23903k);
    }

    public fo a(int i2, List list, wj wjVar) {
        if (!list.isEmpty()) {
            this.f23901i = wjVar;
            for (int i3 = i2; i3 < list.size() + i2; i3++) {
                c cVar = (c) list.get(i3 - i2);
                if (i3 > 0) {
                    c cVar2 = (c) this.f23895a.get(i3 - 1);
                    cVar.a(cVar2.f23910a.i().b() + cVar2.d);
                } else {
                    cVar.a(0);
                }
                a(i3, cVar.f23910a.i().b());
                this.f23895a.add(i3, cVar);
                this.f23897c.put(cVar.f23911b, cVar);
                if (this.f23902j) {
                    d(cVar);
                    if (this.f23896b.isEmpty()) {
                        this.f23900h.add(cVar);
                    } else {
                        a(cVar);
                    }
                }
            }
        }
        return a();
    }

    private void b(c cVar) {
        this.f23900h.add(cVar);
        b bVar = (b) this.f23899g.get(cVar);
        if (bVar != null) {
            bVar.f23907a.b(bVar.f23908b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static be.a b(c cVar, be.a aVar) {
        for (int i2 = 0; i2 < cVar.f23912c.size(); i2++) {
            if (((be.a) cVar.f23912c.get(i2)).d == aVar.d) {
                return aVar.b(a(cVar, aVar.f28191a));
            }
        }
        return null;
    }

    private static Object b(Object obj) {
        return com.applovin.impl.b.d(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(c cVar, int i2) {
        return i2 + cVar.d;
    }

    private void b(int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            c cVar = (c) this.f23895a.remove(i4);
            this.f23897c.remove(cVar.f23911b);
            a(i4, -cVar.f23910a.i().b());
            cVar.e = true;
            if (this.f23902j) {
                c(cVar);
            }
        }
    }

    private void a(int i2, int i3) {
        while (i2 < this.f23895a.size()) {
            ((c) this.f23895a.get(i2)).d += i3;
            i2++;
        }
    }

    public wd a(be.a aVar, n0 n0Var, long j2) {
        Object b2 = b(aVar.f28191a);
        be.a b3 = aVar.b(a(aVar.f28191a));
        c cVar = (c) b1.a((c) this.f23897c.get(b2));
        b(cVar);
        cVar.f23912c.add(b3);
        wc a2 = cVar.f23910a.a(b3, n0Var, j2);
        this.f23896b.put(a2, cVar);
        b();
        return a2;
    }

    public fo a() {
        if (this.f23895a.isEmpty()) {
            return fo.f23945a;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f23895a.size(); i3++) {
            c cVar = (c) this.f23895a.get(i3);
            cVar.d = i2;
            i2 += cVar.f23910a.i().b();
        }
        return new sh(this.f23895a, this.f23901i);
    }

    private void a(c cVar) {
        b bVar = (b) this.f23899g.get(cVar);
        if (bVar != null) {
            bVar.f23907a.a(bVar.f23908b);
        }
    }

    private static Object a(Object obj) {
        return com.applovin.impl.b.c(obj);
    }

    private static Object a(c cVar, Object obj) {
        return com.applovin.impl.b.a(cVar.f23911b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(be beVar, fo foVar) {
        this.d.a();
    }

    public void a(xo xoVar) {
        b1.b(!this.f23902j);
        this.f23903k = xoVar;
        for (int i2 = 0; i2 < this.f23895a.size(); i2++) {
            c cVar = (c) this.f23895a.get(i2);
            d(cVar);
            this.f23900h.add(cVar);
        }
        this.f23902j = true;
    }

    public void a(wd wdVar) {
        c cVar = (c) b1.a((c) this.f23896b.remove(wdVar));
        cVar.f23910a.a(wdVar);
        cVar.f23912c.remove(((wc) wdVar).f27712a);
        if (!this.f23896b.isEmpty()) {
            b();
        }
        c(cVar);
    }

    public fo a(int i2, int i3, wj wjVar) {
        b1.a(i2 >= 0 && i2 <= i3 && i3 <= c());
        this.f23901i = wjVar;
        b(i2, i3);
        return a();
    }

    public fo a(List list, wj wjVar) {
        b(0, this.f23895a.size());
        return a(this.f23895a.size(), list, wjVar);
    }

    public fo a(wj wjVar) {
        int c2 = c();
        if (wjVar.a() != c2) {
            wjVar = wjVar.d().b(0, c2);
        }
        this.f23901i = wjVar;
        return a();
    }
}
