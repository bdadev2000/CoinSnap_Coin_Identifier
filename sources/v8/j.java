package v8;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import s7.x2;

/* loaded from: classes3.dex */
public abstract class j extends a {

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f26168h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public Handler f26169i;

    /* renamed from: j, reason: collision with root package name */
    public m9.w0 f26170j;

    @Override // v8.a
    public final void c() {
        for (i iVar : this.f26168h.values()) {
            iVar.a.b(iVar.f26158b);
        }
    }

    @Override // v8.a
    public final void e() {
        for (i iVar : this.f26168h.values()) {
            iVar.a.d(iVar.f26158b);
        }
    }

    @Override // v8.a
    public void i() {
        Iterator it = this.f26168h.values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).a.i();
        }
    }

    @Override // v8.a
    public void o() {
        HashMap hashMap = this.f26168h;
        for (i iVar : hashMap.values()) {
            iVar.a.n(iVar.f26158b);
            a aVar = iVar.a;
            s2.h hVar = iVar.f26159c;
            aVar.q(hVar);
            aVar.p(hVar);
        }
        hashMap.clear();
    }

    public abstract z r(Object obj, z zVar);

    public long s(Object obj, long j3) {
        return j3;
    }

    public int t(Object obj, int i10) {
        return i10;
    }

    public abstract void u(Object obj, a aVar, x2 x2Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [v8.a0, v8.h] */
    public final void v(final Object obj, a aVar) {
        HashMap hashMap = this.f26168h;
        u0.d(!hashMap.containsKey(obj));
        ?? r12 = new a0() { // from class: v8.h
            @Override // v8.a0
            public final void a(a aVar2, x2 x2Var) {
                j.this.u(obj, aVar2, x2Var);
            }
        };
        s2.h hVar = new s2.h(this, obj);
        hashMap.put(obj, new i(aVar, r12, hVar));
        Handler handler = this.f26169i;
        handler.getClass();
        f0.c cVar = aVar.f26069c;
        cVar.getClass();
        ((CopyOnWriteArrayList) cVar.f17517d).add(new c0(handler, hVar));
        Handler handler2 = this.f26169i;
        handler2.getClass();
        x7.q qVar = aVar.f26070d;
        qVar.getClass();
        qVar.f27497c.add(new x7.p(handler2, hVar));
        m9.w0 w0Var = this.f26170j;
        t7.x xVar = this.f26073g;
        u0.p(xVar);
        aVar.j(r12, w0Var, xVar);
        if (!(!this.f26068b.isEmpty())) {
            aVar.b(r12);
        }
    }
}
