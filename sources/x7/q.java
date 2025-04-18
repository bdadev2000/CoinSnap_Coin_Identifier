package x7;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class q {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final v8.z f27496b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f27497c;

    public q(CopyOnWriteArrayList copyOnWriteArrayList, int i10, v8.z zVar) {
        this.f27497c = copyOnWriteArrayList;
        this.a = i10;
        this.f27496b = zVar;
    }

    public final void a() {
        Iterator it = this.f27497c.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            n9.h0.L(pVar.a, new o(this, pVar.f27495b, 2));
        }
    }

    public final void b() {
        Iterator it = this.f27497c.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            n9.h0.L(pVar.a, new o(this, pVar.f27495b, 1));
        }
    }

    public final void c() {
        Iterator it = this.f27497c.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            n9.h0.L(pVar.a, new o(this, pVar.f27495b, 3));
        }
    }

    public final void d(int i10) {
        Iterator it = this.f27497c.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            n9.h0.L(pVar.a, new o.q(this, pVar.f27495b, i10, 5));
        }
    }

    public final void e(Exception exc) {
        Iterator it = this.f27497c.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            n9.h0.L(pVar.a, new androidx.emoji2.text.n(12, this, pVar.f27495b, exc));
        }
    }

    public final void f() {
        Iterator it = this.f27497c.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            n9.h0.L(pVar.a, new o(this, pVar.f27495b, 0));
        }
    }
}
