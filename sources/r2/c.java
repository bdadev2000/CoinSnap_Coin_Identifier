package r2;

import androidx.work.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import u2.j;

/* loaded from: classes.dex */
public abstract class c {
    public final ArrayList a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public Object f23965b;

    /* renamed from: c, reason: collision with root package name */
    public final s2.d f23966c;

    /* renamed from: d, reason: collision with root package name */
    public b f23967d;

    public c(s2.d dVar) {
        this.f23966c = dVar;
    }

    public abstract boolean a(j jVar);

    public abstract boolean b(Object obj);

    public final void c(Collection collection) {
        this.a.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            if (a(jVar)) {
                this.a.add(jVar.a);
            }
        }
        if (this.a.isEmpty()) {
            s2.d dVar = this.f23966c;
            synchronized (dVar.f24160c) {
                if (dVar.f24161d.remove(this) && dVar.f24161d.isEmpty()) {
                    dVar.d();
                }
            }
        } else {
            s2.d dVar2 = this.f23966c;
            synchronized (dVar2.f24160c) {
                try {
                    if (dVar2.f24161d.add(this)) {
                        if (dVar2.f24161d.size() == 1) {
                            dVar2.f24162e = dVar2.a();
                            p.e().b(s2.d.f24158f, String.format("%s: initial state = %s", dVar2.getClass().getSimpleName(), dVar2.f24162e), new Throwable[0]);
                            dVar2.c();
                        }
                        Object obj = dVar2.f24162e;
                        this.f23965b = obj;
                        d(this.f23967d, obj);
                    }
                } finally {
                }
            }
        }
        d(this.f23967d, this.f23965b);
    }

    public final void d(b bVar, Object obj) {
        if (!this.a.isEmpty() && bVar != null) {
            if (obj != null && !b(obj)) {
                ArrayList arrayList = this.a;
                q2.c cVar = (q2.c) bVar;
                synchronized (cVar.f23679c) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (cVar.a(str)) {
                            p.e().b(q2.c.f23677d, String.format("Constraints met for %s", str), new Throwable[0]);
                            arrayList2.add(str);
                        }
                    }
                    q2.b bVar2 = cVar.a;
                    if (bVar2 != null) {
                        bVar2.f(arrayList2);
                    }
                }
                return;
            }
            ArrayList arrayList3 = this.a;
            q2.c cVar2 = (q2.c) bVar;
            synchronized (cVar2.f23679c) {
                q2.b bVar3 = cVar2.a;
                if (bVar3 != null) {
                    bVar3.b(arrayList3);
                }
            }
        }
    }
}
