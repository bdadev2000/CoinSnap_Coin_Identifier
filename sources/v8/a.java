package v8;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import s7.x2;

/* loaded from: classes3.dex */
public abstract class a {
    public final ArrayList a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f26068b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final f0.c f26069c = new f0.c(new CopyOnWriteArrayList(), 0, (z) null);

    /* renamed from: d, reason: collision with root package name */
    public final x7.q f26070d = new x7.q(new CopyOnWriteArrayList(), 0, null);

    /* renamed from: e, reason: collision with root package name */
    public Looper f26071e;

    /* renamed from: f, reason: collision with root package name */
    public x2 f26072f;

    /* renamed from: g, reason: collision with root package name */
    public t7.x f26073g;

    public abstract w a(z zVar, m9.q qVar, long j3);

    public final void b(a0 a0Var) {
        HashSet hashSet = this.f26068b;
        boolean z10 = !hashSet.isEmpty();
        hashSet.remove(a0Var);
        if (z10 && hashSet.isEmpty()) {
            c();
        }
    }

    public void c() {
    }

    public final void d(a0 a0Var) {
        this.f26071e.getClass();
        HashSet hashSet = this.f26068b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(a0Var);
        if (isEmpty) {
            e();
        }
    }

    public void e() {
    }

    public /* bridge */ /* synthetic */ x2 f() {
        return null;
    }

    public abstract s7.j1 g();

    public /* bridge */ /* synthetic */ boolean h() {
        return true;
    }

    public abstract void i();

    public final void j(a0 a0Var, m9.w0 w0Var, t7.x xVar) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f26071e;
        if (looper != null && looper != myLooper) {
            z10 = false;
        } else {
            z10 = true;
        }
        u0.d(z10);
        this.f26073g = xVar;
        x2 x2Var = this.f26072f;
        this.a.add(a0Var);
        if (this.f26071e == null) {
            this.f26071e = myLooper;
            this.f26068b.add(a0Var);
            k(w0Var);
        } else if (x2Var != null) {
            d(a0Var);
            a0Var.a(this, x2Var);
        }
    }

    public abstract void k(m9.w0 w0Var);

    public final void l(x2 x2Var) {
        this.f26072f = x2Var;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((a0) it.next()).a(this, x2Var);
        }
    }

    public abstract void m(w wVar);

    public final void n(a0 a0Var) {
        ArrayList arrayList = this.a;
        arrayList.remove(a0Var);
        if (arrayList.isEmpty()) {
            this.f26071e = null;
            this.f26072f = null;
            this.f26073g = null;
            this.f26068b.clear();
            o();
            return;
        }
        b(a0Var);
    }

    public abstract void o();

    public final void p(x7.r rVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f26070d.f27497c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            x7.p pVar = (x7.p) it.next();
            if (pVar.f27495b == rVar) {
                copyOnWriteArrayList.remove(pVar);
            }
        }
    }

    public final void q(d0 d0Var) {
        f0.c cVar = this.f26069c;
        Iterator it = ((CopyOnWriteArrayList) cVar.f17517d).iterator();
        while (it.hasNext()) {
            c0 c0Var = (c0) it.next();
            if (c0Var.f26082b == d0Var) {
                ((CopyOnWriteArrayList) cVar.f17517d).remove(c0Var);
            }
        }
    }
}
