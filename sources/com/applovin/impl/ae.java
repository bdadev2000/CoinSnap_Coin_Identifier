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
    private final d f6727d;

    /* renamed from: e, reason: collision with root package name */
    private final xd.a f6728e;

    /* renamed from: f, reason: collision with root package name */
    private final y6.a f6729f;

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f6730g;

    /* renamed from: h, reason: collision with root package name */
    private final Set f6731h;

    /* renamed from: j, reason: collision with root package name */
    private boolean f6733j;

    /* renamed from: k, reason: collision with root package name */
    private yo f6734k;

    /* renamed from: i, reason: collision with root package name */
    private tj f6732i = new tj.a(0);
    private final IdentityHashMap b = new IdentityHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f6726c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final List f6725a = new ArrayList();

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final wd f6738a;
        public final wd.b b;

        /* renamed from: c, reason: collision with root package name */
        public final a f6739c;

        public b(wd wdVar, wd.b bVar, a aVar) {
            this.f6738a = wdVar;
            this.b = bVar;
            this.f6739c = aVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements zd {

        /* renamed from: a, reason: collision with root package name */
        public final sc f6740a;

        /* renamed from: d, reason: collision with root package name */
        public int f6742d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f6743e;

        /* renamed from: c, reason: collision with root package name */
        public final List f6741c = new ArrayList();
        public final Object b = new Object();

        public c(wd wdVar, boolean z8) {
            this.f6740a = new sc(wdVar, z8);
        }

        @Override // com.applovin.impl.zd
        public Object a() {
            return this.b;
        }

        @Override // com.applovin.impl.zd
        public go b() {
            return this.f6740a.i();
        }

        public void a(int i9) {
            this.f6742d = i9;
            this.f6743e = false;
            this.f6741c.clear();
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();
    }

    public ae(d dVar, C0742r0 c0742r0, Handler handler) {
        this.f6727d = dVar;
        xd.a aVar = new xd.a();
        this.f6728e = aVar;
        y6.a aVar2 = new y6.a();
        this.f6729f = aVar2;
        this.f6730g = new HashMap();
        this.f6731h = new HashSet();
        if (c0742r0 != null) {
            aVar.a(handler, c0742r0);
            aVar2.a(handler, c0742r0);
        }
    }

    public int c() {
        return this.f6725a.size();
    }

    public boolean d() {
        return this.f6733j;
    }

    public void e() {
        for (b bVar : this.f6730g.values()) {
            try {
                bVar.f6738a.c(bVar.b);
            } catch (RuntimeException e4) {
                kc.a("MediaSourceList", "Failed to release child source.", e4);
            }
            bVar.f6738a.a((xd) bVar.f6739c);
            bVar.f6738a.a((y6) bVar.f6739c);
        }
        this.f6730g.clear();
        this.f6731h.clear();
        this.f6733j = false;
    }

    /* loaded from: classes.dex */
    public final class a implements xd, y6 {

        /* renamed from: a, reason: collision with root package name */
        private final c f6735a;
        private xd.a b;

        /* renamed from: c, reason: collision with root package name */
        private y6.a f6736c;

        public a(c cVar) {
            this.b = ae.this.f6728e;
            this.f6736c = ae.this.f6729f;
            this.f6735a = cVar;
        }

        private boolean f(int i9, wd.a aVar) {
            wd.a aVar2;
            if (aVar != null) {
                aVar2 = ae.b(this.f6735a, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int b = ae.b(this.f6735a, i9);
            xd.a aVar3 = this.b;
            if (aVar3.f12171a != b || !yp.a(aVar3.b, aVar2)) {
                this.b = ae.this.f6728e.a(b, aVar2, 0L);
            }
            y6.a aVar4 = this.f6736c;
            if (aVar4.f12342a != b || !yp.a(aVar4.b, aVar2)) {
                this.f6736c = ae.this.f6729f.a(b, aVar2);
                return true;
            }
            return true;
        }

        @Override // com.applovin.impl.xd
        public void a(int i9, wd.a aVar, pd pdVar) {
            if (f(i9, aVar)) {
                this.b.a(pdVar);
            }
        }

        @Override // com.applovin.impl.y6
        public void b(int i9, wd.a aVar) {
            if (f(i9, aVar)) {
                this.f6736c.d();
            }
        }

        @Override // com.applovin.impl.y6
        public void c(int i9, wd.a aVar) {
            if (f(i9, aVar)) {
                this.f6736c.c();
            }
        }

        @Override // com.applovin.impl.y6
        public void d(int i9, wd.a aVar) {
            if (f(i9, aVar)) {
                this.f6736c.a();
            }
        }

        @Override // com.applovin.impl.y6
        public void a(int i9, wd.a aVar) {
            if (f(i9, aVar)) {
                this.f6736c.b();
            }
        }

        @Override // com.applovin.impl.xd
        public void b(int i9, wd.a aVar, ic icVar, pd pdVar) {
            if (f(i9, aVar)) {
                this.b.c(icVar, pdVar);
            }
        }

        @Override // com.applovin.impl.xd
        public void c(int i9, wd.a aVar, ic icVar, pd pdVar) {
            if (f(i9, aVar)) {
                this.b.b(icVar, pdVar);
            }
        }

        @Override // com.applovin.impl.y6
        public void a(int i9, wd.a aVar, int i10) {
            if (f(i9, aVar)) {
                this.f6736c.a(i10);
            }
        }

        @Override // com.applovin.impl.y6
        public void a(int i9, wd.a aVar, Exception exc) {
            if (f(i9, aVar)) {
                this.f6736c.a(exc);
            }
        }

        @Override // com.applovin.impl.xd
        public void a(int i9, wd.a aVar, ic icVar, pd pdVar) {
            if (f(i9, aVar)) {
                this.b.a(icVar, pdVar);
            }
        }

        @Override // com.applovin.impl.xd
        public void a(int i9, wd.a aVar, ic icVar, pd pdVar, IOException iOException, boolean z8) {
            if (f(i9, aVar)) {
                this.b.a(icVar, pdVar, iOException, z8);
            }
        }
    }

    private void b() {
        Iterator it = this.f6731h.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f6741c.isEmpty()) {
                a(cVar);
                it.remove();
            }
        }
    }

    private void c(c cVar) {
        if (cVar.f6743e && cVar.f6741c.isEmpty()) {
            b bVar = (b) AbstractC0669a1.a((b) this.f6730g.remove(cVar));
            bVar.f6738a.c(bVar.b);
            bVar.f6738a.a((xd) bVar.f6739c);
            bVar.f6738a.a((y6) bVar.f6739c);
            this.f6731h.remove(cVar);
        }
    }

    private void d(c cVar) {
        sc scVar = cVar.f6740a;
        wd.b bVar = new wd.b() { // from class: com.applovin.impl.K
            @Override // com.applovin.impl.wd.b
            public final void a(wd wdVar, go goVar) {
                ae.this.a(wdVar, goVar);
            }
        };
        a aVar = new a(cVar);
        this.f6730g.put(cVar, new b(scVar, bVar, aVar));
        scVar.a(yp.b(), (xd) aVar);
        scVar.a(yp.b(), (y6) aVar);
        scVar.a(bVar, this.f6734k);
    }

    public go a(int i9, List list, tj tjVar) {
        if (!list.isEmpty()) {
            this.f6732i = tjVar;
            for (int i10 = i9; i10 < list.size() + i9; i10++) {
                c cVar = (c) list.get(i10 - i9);
                if (i10 > 0) {
                    c cVar2 = (c) this.f6725a.get(i10 - 1);
                    cVar.a(cVar2.f6740a.i().b() + cVar2.f6742d);
                } else {
                    cVar.a(0);
                }
                a(i10, cVar.f6740a.i().b());
                this.f6725a.add(i10, cVar);
                this.f6726c.put(cVar.b, cVar);
                if (this.f6733j) {
                    d(cVar);
                    if (this.b.isEmpty()) {
                        this.f6731h.add(cVar);
                    } else {
                        a(cVar);
                    }
                }
            }
        }
        return a();
    }

    private void b(c cVar) {
        this.f6731h.add(cVar);
        b bVar = (b) this.f6730g.get(cVar);
        if (bVar != null) {
            bVar.f6738a.b(bVar.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static wd.a b(c cVar, wd.a aVar) {
        for (int i9 = 0; i9 < cVar.f6741c.size(); i9++) {
            if (((wd.a) cVar.f6741c.get(i9)).f11477d == aVar.f11477d) {
                return aVar.b(a(cVar, aVar.f11475a));
            }
        }
        return null;
    }

    private static Object b(Object obj) {
        return AbstractC0672b.d(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(c cVar, int i9) {
        return i9 + cVar.f6742d;
    }

    private void b(int i9, int i10) {
        for (int i11 = i10 - 1; i11 >= i9; i11--) {
            c cVar = (c) this.f6725a.remove(i11);
            this.f6726c.remove(cVar.b);
            a(i11, -cVar.f6740a.i().b());
            cVar.f6743e = true;
            if (this.f6733j) {
                c(cVar);
            }
        }
    }

    private void a(int i9, int i10) {
        while (i9 < this.f6725a.size()) {
            ((c) this.f6725a.get(i9)).f6742d += i10;
            i9++;
        }
    }

    public rd a(wd.a aVar, InterfaceC0727n0 interfaceC0727n0, long j7) {
        Object b8 = b(aVar.f11475a);
        wd.a b9 = aVar.b(a(aVar.f11475a));
        c cVar = (c) AbstractC0669a1.a((c) this.f6726c.get(b8));
        b(cVar);
        cVar.f6741c.add(b9);
        rc a6 = cVar.f6740a.a(b9, interfaceC0727n0, j7);
        this.b.put(a6, cVar);
        b();
        return a6;
    }

    public go a() {
        if (this.f6725a.isEmpty()) {
            return go.f7931a;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f6725a.size(); i10++) {
            c cVar = (c) this.f6725a.get(i10);
            cVar.f6742d = i9;
            i9 += cVar.f6740a.i().b();
        }
        return new ph(this.f6725a, this.f6732i);
    }

    private void a(c cVar) {
        b bVar = (b) this.f6730g.get(cVar);
        if (bVar != null) {
            bVar.f6738a.a(bVar.b);
        }
    }

    private static Object a(Object obj) {
        return AbstractC0672b.c(obj);
    }

    private static Object a(c cVar, Object obj) {
        return AbstractC0672b.a(cVar.b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(wd wdVar, go goVar) {
        this.f6727d.a();
    }

    public void a(yo yoVar) {
        AbstractC0669a1.b(!this.f6733j);
        this.f6734k = yoVar;
        for (int i9 = 0; i9 < this.f6725a.size(); i9++) {
            c cVar = (c) this.f6725a.get(i9);
            d(cVar);
            this.f6731h.add(cVar);
        }
        this.f6733j = true;
    }

    public void a(rd rdVar) {
        c cVar = (c) AbstractC0669a1.a((c) this.b.remove(rdVar));
        cVar.f6740a.a(rdVar);
        cVar.f6741c.remove(((rc) rdVar).f10482a);
        if (!this.b.isEmpty()) {
            b();
        }
        c(cVar);
    }

    public go a(int i9, int i10, tj tjVar) {
        AbstractC0669a1.a(i9 >= 0 && i9 <= i10 && i10 <= c());
        this.f6732i = tjVar;
        b(i9, i10);
        return a();
    }

    public go a(List list, tj tjVar) {
        b(0, this.f6725a.size());
        return a(this.f6725a.size(), list, tjVar);
    }

    public go a(tj tjVar) {
        int c9 = c();
        if (tjVar.a() != c9) {
            tjVar = tjVar.d().b(0, c9);
        }
        this.f6732i = tjVar;
        return a();
    }
}
