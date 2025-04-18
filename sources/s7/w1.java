package s7;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class w1 {
    public final t7.x a;

    /* renamed from: e, reason: collision with root package name */
    public final o0 f24825e;

    /* renamed from: h, reason: collision with root package name */
    public final t7.a f24828h;

    /* renamed from: i, reason: collision with root package name */
    public final n9.j f24829i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f24831k;

    /* renamed from: l, reason: collision with root package name */
    public m9.w0 f24832l;

    /* renamed from: j, reason: collision with root package name */
    public v8.c1 f24830j = new v8.c1();

    /* renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f24823c = new IdentityHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f24824d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f24822b = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f24826f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f24827g = new HashSet();

    public w1(o0 o0Var, t7.a aVar, n9.e0 e0Var, t7.x xVar) {
        this.a = xVar;
        this.f24825e = o0Var;
        this.f24828h = aVar;
        this.f24829i = e0Var;
    }

    public final x2 a(int i10, List list, v8.c1 c1Var) {
        if (!list.isEmpty()) {
            this.f24830j = c1Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                v1 v1Var = (v1) list.get(i11 - i10);
                ArrayList arrayList = this.f24822b;
                if (i11 > 0) {
                    v1 v1Var2 = (v1) arrayList.get(i11 - 1);
                    v1Var.f24778d = v1Var2.a.f26279o.o() + v1Var2.f24778d;
                    v1Var.f24779e = false;
                    v1Var.f24777c.clear();
                } else {
                    v1Var.f24778d = 0;
                    v1Var.f24779e = false;
                    v1Var.f24777c.clear();
                }
                int o10 = v1Var.a.f26279o.o();
                for (int i12 = i11; i12 < arrayList.size(); i12++) {
                    ((v1) arrayList.get(i12)).f24778d += o10;
                }
                arrayList.add(i11, v1Var);
                this.f24824d.put(v1Var.f24776b, v1Var);
                if (this.f24831k) {
                    e(v1Var);
                    if (this.f24823c.isEmpty()) {
                        this.f24827g.add(v1Var);
                    } else {
                        u1 u1Var = (u1) this.f24826f.get(v1Var);
                        if (u1Var != null) {
                            u1Var.a.b(u1Var.f24769b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final x2 b() {
        ArrayList arrayList = this.f24822b;
        if (arrayList.isEmpty()) {
            return x2.f24864b;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            v1 v1Var = (v1) arrayList.get(i11);
            v1Var.f24778d = i10;
            i10 += v1Var.a.f26279o.o();
        }
        return new l2(arrayList, this.f24830j);
    }

    public final void c() {
        Iterator it = this.f24827g.iterator();
        while (it.hasNext()) {
            v1 v1Var = (v1) it.next();
            if (v1Var.f24777c.isEmpty()) {
                u1 u1Var = (u1) this.f24826f.get(v1Var);
                if (u1Var != null) {
                    u1Var.a.b(u1Var.f24769b);
                }
                it.remove();
            }
        }
    }

    public final void d(v1 v1Var) {
        if (v1Var.f24779e && v1Var.f24777c.isEmpty()) {
            u1 u1Var = (u1) this.f24826f.remove(v1Var);
            u1Var.getClass();
            v8.a0 a0Var = u1Var.f24769b;
            v8.a aVar = u1Var.a;
            aVar.n(a0Var);
            r4.c cVar = u1Var.f24770c;
            aVar.q(cVar);
            aVar.p(cVar);
            this.f24827g.remove(v1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [v8.a0, s7.q1] */
    public final void e(v1 v1Var) {
        v8.t tVar = v1Var.a;
        ?? r12 = new v8.a0() { // from class: s7.q1
            @Override // v8.a0
            public final void a(v8.a aVar, x2 x2Var) {
                w1.this.f24825e.f24620j.d(22);
            }
        };
        r4.c cVar = new r4.c(16, this, v1Var);
        this.f24826f.put(v1Var, new u1(tVar, r12, cVar));
        int i10 = n9.h0.a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        f0.c cVar2 = tVar.f26069c;
        cVar2.getClass();
        ((CopyOnWriteArrayList) cVar2.f17517d).add(new v8.c0(handler, cVar));
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        x7.q qVar = tVar.f26070d;
        qVar.getClass();
        qVar.f27497c.add(new x7.p(handler2, cVar));
        tVar.j(r12, this.f24832l, this.a);
    }

    public final void f(v8.w wVar) {
        IdentityHashMap identityHashMap = this.f24823c;
        v1 v1Var = (v1) identityHashMap.remove(wVar);
        v1Var.getClass();
        v1Var.a.m(wVar);
        v1Var.f24777c.remove(((v8.q) wVar).f26246b);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(v1Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.f24822b;
            v1 v1Var = (v1) arrayList.remove(i12);
            this.f24824d.remove(v1Var.f24776b);
            int i13 = -v1Var.a.f26279o.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((v1) arrayList.get(i14)).f24778d += i13;
            }
            v1Var.f24779e = true;
            if (this.f24831k) {
                d(v1Var);
            }
        }
    }
}
