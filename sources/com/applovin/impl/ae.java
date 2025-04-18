package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.tj;
import com.applovin.impl.wd;
import com.applovin.impl.xd;
import com.applovin.impl.y6;
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
/* loaded from: classes.dex */
public final class ae {

    /* renamed from: d, reason: collision with root package name */
    private final d f3735d;

    /* renamed from: e, reason: collision with root package name */
    private final xd.a f3736e;

    /* renamed from: f, reason: collision with root package name */
    private final y6.a f3737f;

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f3738g;

    /* renamed from: h, reason: collision with root package name */
    private final Set f3739h;

    /* renamed from: j, reason: collision with root package name */
    private boolean f3741j;

    /* renamed from: k, reason: collision with root package name */
    private yo f3742k;

    /* renamed from: i, reason: collision with root package name */
    private tj f3740i = new tj.a(0);

    /* renamed from: b, reason: collision with root package name */
    private final IdentityHashMap f3733b = new IdentityHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f3734c = new HashMap();
    private final List a = new ArrayList();

    /* loaded from: classes.dex */
    public static final class b {
        public final wd a;

        /* renamed from: b, reason: collision with root package name */
        public final wd.b f3746b;

        /* renamed from: c, reason: collision with root package name */
        public final a f3747c;

        public b(wd wdVar, wd.b bVar, a aVar) {
            this.a = wdVar;
            this.f3746b = bVar;
            this.f3747c = aVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements zd {
        public final sc a;

        /* renamed from: d, reason: collision with root package name */
        public int f3750d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f3751e;

        /* renamed from: c, reason: collision with root package name */
        public final List f3749c = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f3748b = new Object();

        public c(wd wdVar, boolean z10) {
            this.a = new sc(wdVar, z10);
        }

        @Override // com.applovin.impl.zd
        public Object a() {
            return this.f3748b;
        }

        @Override // com.applovin.impl.zd
        public go b() {
            return this.a.i();
        }

        public void a(int i10) {
            this.f3750d = i10;
            this.f3751e = false;
            this.f3749c.clear();
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();
    }

    public ae(d dVar, r0 r0Var, Handler handler) {
        this.f3735d = dVar;
        xd.a aVar = new xd.a();
        this.f3736e = aVar;
        y6.a aVar2 = new y6.a();
        this.f3737f = aVar2;
        this.f3738g = new HashMap();
        this.f3739h = new HashSet();
        if (r0Var != null) {
            aVar.a(handler, r0Var);
            aVar2.a(handler, r0Var);
        }
    }

    public int c() {
        return this.a.size();
    }

    public boolean d() {
        return this.f3741j;
    }

    public void e() {
        for (b bVar : this.f3738g.values()) {
            try {
                bVar.a.c(bVar.f3746b);
            } catch (RuntimeException e2) {
                kc.a("MediaSourceList", "Failed to release child source.", e2);
            }
            bVar.a.a((xd) bVar.f3747c);
            bVar.a.a((y6) bVar.f3747c);
        }
        this.f3738g.clear();
        this.f3739h.clear();
        this.f3741j = false;
    }

    /* loaded from: classes.dex */
    public final class a implements xd, y6 {
        private final c a;

        /* renamed from: b, reason: collision with root package name */
        private xd.a f3743b;

        /* renamed from: c, reason: collision with root package name */
        private y6.a f3744c;

        public a(c cVar) {
            this.f3743b = ae.this.f3736e;
            this.f3744c = ae.this.f3737f;
            this.a = cVar;
        }

        private boolean f(int i10, wd.a aVar) {
            wd.a aVar2;
            if (aVar != null) {
                aVar2 = ae.b(this.a, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int b3 = ae.b(this.a, i10);
            xd.a aVar3 = this.f3743b;
            if (aVar3.a != b3 || !yp.a(aVar3.f8969b, aVar2)) {
                this.f3743b = ae.this.f3736e.a(b3, aVar2, 0L);
            }
            y6.a aVar4 = this.f3744c;
            if (aVar4.a != b3 || !yp.a(aVar4.f9138b, aVar2)) {
                this.f3744c = ae.this.f3737f.a(b3, aVar2);
                return true;
            }
            return true;
        }

        @Override // com.applovin.impl.xd
        public void a(int i10, wd.a aVar, pd pdVar) {
            if (f(i10, aVar)) {
                this.f3743b.a(pdVar);
            }
        }

        @Override // com.applovin.impl.y6
        public void b(int i10, wd.a aVar) {
            if (f(i10, aVar)) {
                this.f3744c.d();
            }
        }

        @Override // com.applovin.impl.y6
        public void c(int i10, wd.a aVar) {
            if (f(i10, aVar)) {
                this.f3744c.c();
            }
        }

        @Override // com.applovin.impl.y6
        public void d(int i10, wd.a aVar) {
            if (f(i10, aVar)) {
                this.f3744c.a();
            }
        }

        @Override // com.applovin.impl.y6
        public void a(int i10, wd.a aVar) {
            if (f(i10, aVar)) {
                this.f3744c.b();
            }
        }

        @Override // com.applovin.impl.xd
        public void b(int i10, wd.a aVar, ic icVar, pd pdVar) {
            if (f(i10, aVar)) {
                this.f3743b.c(icVar, pdVar);
            }
        }

        @Override // com.applovin.impl.xd
        public void c(int i10, wd.a aVar, ic icVar, pd pdVar) {
            if (f(i10, aVar)) {
                this.f3743b.b(icVar, pdVar);
            }
        }

        @Override // com.applovin.impl.y6
        public void a(int i10, wd.a aVar, int i11) {
            if (f(i10, aVar)) {
                this.f3744c.a(i11);
            }
        }

        @Override // com.applovin.impl.y6
        public void a(int i10, wd.a aVar, Exception exc) {
            if (f(i10, aVar)) {
                this.f3744c.a(exc);
            }
        }

        @Override // com.applovin.impl.xd
        public void a(int i10, wd.a aVar, ic icVar, pd pdVar) {
            if (f(i10, aVar)) {
                this.f3743b.a(icVar, pdVar);
            }
        }

        @Override // com.applovin.impl.xd
        public void a(int i10, wd.a aVar, ic icVar, pd pdVar, IOException iOException, boolean z10) {
            if (f(i10, aVar)) {
                this.f3743b.a(icVar, pdVar, iOException, z10);
            }
        }
    }

    private void b() {
        Iterator it = this.f3739h.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f3749c.isEmpty()) {
                a(cVar);
                it.remove();
            }
        }
    }

    private void c(c cVar) {
        if (cVar.f3751e && cVar.f3749c.isEmpty()) {
            b bVar = (b) a1.a((b) this.f3738g.remove(cVar));
            bVar.a.c(bVar.f3746b);
            bVar.a.a((xd) bVar.f3747c);
            bVar.a.a((y6) bVar.f3747c);
            this.f3739h.remove(cVar);
        }
    }

    private void d(c cVar) {
        sc scVar = cVar.a;
        wd.b bVar = new wd.b() { // from class: com.applovin.impl.ts
            @Override // com.applovin.impl.wd.b
            public final void a(wd wdVar, go goVar) {
                ae.this.a(wdVar, goVar);
            }
        };
        a aVar = new a(cVar);
        this.f3738g.put(cVar, new b(scVar, bVar, aVar));
        scVar.a(yp.b(), (xd) aVar);
        scVar.a(yp.b(), (y6) aVar);
        scVar.a(bVar, this.f3742k);
    }

    public go a(int i10, List list, tj tjVar) {
        if (!list.isEmpty()) {
            this.f3740i = tjVar;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = (c) list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = (c) this.a.get(i11 - 1);
                    cVar.a(cVar2.a.i().b() + cVar2.f3750d);
                } else {
                    cVar.a(0);
                }
                a(i11, cVar.a.i().b());
                this.a.add(i11, cVar);
                this.f3734c.put(cVar.f3748b, cVar);
                if (this.f3741j) {
                    d(cVar);
                    if (this.f3733b.isEmpty()) {
                        this.f3739h.add(cVar);
                    } else {
                        a(cVar);
                    }
                }
            }
        }
        return a();
    }

    private void b(c cVar) {
        this.f3739h.add(cVar);
        b bVar = (b) this.f3738g.get(cVar);
        if (bVar != null) {
            bVar.a.b(bVar.f3746b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static wd.a b(c cVar, wd.a aVar) {
        for (int i10 = 0; i10 < cVar.f3749c.size(); i10++) {
            if (((wd.a) cVar.f3749c.get(i10)).f8262d == aVar.f8262d) {
                return aVar.b(a(cVar, aVar.a));
            }
        }
        return null;
    }

    private static Object b(Object obj) {
        return com.applovin.impl.b.d(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(c cVar, int i10) {
        return i10 + cVar.f3750d;
    }

    private void b(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c cVar = (c) this.a.remove(i12);
            this.f3734c.remove(cVar.f3748b);
            a(i12, -cVar.a.i().b());
            cVar.f3751e = true;
            if (this.f3741j) {
                c(cVar);
            }
        }
    }

    private void a(int i10, int i11) {
        while (i10 < this.a.size()) {
            ((c) this.a.get(i10)).f3750d += i11;
            i10++;
        }
    }

    public rd a(wd.a aVar, n0 n0Var, long j3) {
        Object b3 = b(aVar.a);
        wd.a b10 = aVar.b(a(aVar.a));
        c cVar = (c) a1.a((c) this.f3734c.get(b3));
        b(cVar);
        cVar.f3749c.add(b10);
        rc a10 = cVar.a.a(b10, n0Var, j3);
        this.f3733b.put(a10, cVar);
        b();
        return a10;
    }

    public go a() {
        if (this.a.isEmpty()) {
            return go.a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.a.size(); i11++) {
            c cVar = (c) this.a.get(i11);
            cVar.f3750d = i10;
            i10 += cVar.a.i().b();
        }
        return new ph(this.a, this.f3740i);
    }

    private void a(c cVar) {
        b bVar = (b) this.f3738g.get(cVar);
        if (bVar != null) {
            bVar.a.a(bVar.f3746b);
        }
    }

    private static Object a(Object obj) {
        return com.applovin.impl.b.c(obj);
    }

    private static Object a(c cVar, Object obj) {
        return com.applovin.impl.b.a(cVar.f3748b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(wd wdVar, go goVar) {
        this.f3735d.a();
    }

    public void a(yo yoVar) {
        a1.b(!this.f3741j);
        this.f3742k = yoVar;
        for (int i10 = 0; i10 < this.a.size(); i10++) {
            c cVar = (c) this.a.get(i10);
            d(cVar);
            this.f3739h.add(cVar);
        }
        this.f3741j = true;
    }

    public void a(rd rdVar) {
        c cVar = (c) a1.a((c) this.f3733b.remove(rdVar));
        cVar.a.a(rdVar);
        cVar.f3749c.remove(((rc) rdVar).a);
        if (!this.f3733b.isEmpty()) {
            b();
        }
        c(cVar);
    }

    public go a(int i10, int i11, tj tjVar) {
        a1.a(i10 >= 0 && i10 <= i11 && i11 <= c());
        this.f3740i = tjVar;
        b(i10, i11);
        return a();
    }

    public go a(List list, tj tjVar) {
        b(0, this.a.size());
        return a(this.a.size(), list, tjVar);
    }

    public go a(tj tjVar) {
        int c10 = c();
        if (tjVar.a() != c10) {
            tjVar = tjVar.d().b(0, c10);
        }
        this.f3740i = tjVar;
        return a();
    }
}
