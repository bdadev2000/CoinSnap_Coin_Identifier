package a1;

import androidx.work.o;
import b1.AbstractC0551d;
import d1.C2168i;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: a1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0329c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3912a = new ArrayList();
    public Object b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0551d f3913c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0328b f3914d;

    public AbstractC0329c(AbstractC0551d abstractC0551d) {
        this.f3913c = abstractC0551d;
    }

    public abstract boolean a(C2168i c2168i);

    public abstract boolean b(Object obj);

    public final void c(Iterable iterable) {
        this.f3912a.clear();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C2168i c2168i = (C2168i) it.next();
            if (a(c2168i)) {
                this.f3912a.add(c2168i.f19801a);
            }
        }
        if (this.f3912a.isEmpty()) {
            this.f3913c.b(this);
        } else {
            AbstractC0551d abstractC0551d = this.f3913c;
            synchronized (abstractC0551d.f5261c) {
                try {
                    if (abstractC0551d.f5262d.add(this)) {
                        if (abstractC0551d.f5262d.size() == 1) {
                            abstractC0551d.f5263e = abstractC0551d.a();
                            o.e().b(AbstractC0551d.f5259f, String.format("%s: initial state = %s", abstractC0551d.getClass().getSimpleName(), abstractC0551d.f5263e), new Throwable[0]);
                            abstractC0551d.d();
                        }
                        Object obj = abstractC0551d.f5263e;
                        this.b = obj;
                        d(this.f3914d, obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.f3914d, this.b);
    }

    public final void d(InterfaceC0328b interfaceC0328b, Object obj) {
        if (!this.f3912a.isEmpty() && interfaceC0328b != null) {
            if (obj != null && !b(obj)) {
                ArrayList arrayList = this.f3912a;
                Z0.c cVar = (Z0.c) interfaceC0328b;
                synchronized (cVar.f3877c) {
                    try {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            if (cVar.a(str)) {
                                o.e().b(Z0.c.f3875d, "Constraints met for " + str, new Throwable[0]);
                                arrayList2.add(str);
                            }
                        }
                        Z0.b bVar = cVar.f3876a;
                        if (bVar != null) {
                            bVar.f(arrayList2);
                        }
                    } finally {
                    }
                }
                return;
            }
            ArrayList arrayList3 = this.f3912a;
            Z0.c cVar2 = (Z0.c) interfaceC0328b;
            synchronized (cVar2.f3877c) {
                try {
                    Z0.b bVar2 = cVar2.f3876a;
                    if (bVar2 != null) {
                        bVar2.a(arrayList3);
                    }
                } finally {
                }
            }
        }
    }
}
