package k4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.facebook.b f20226e = new com.facebook.b(16);

    /* renamed from: f, reason: collision with root package name */
    public static final g f20227f = new g(1);
    public final ArrayList a;

    /* renamed from: b, reason: collision with root package name */
    public final com.facebook.b f20228b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f20229c;

    /* renamed from: d, reason: collision with root package name */
    public final m0.c f20230d;

    public d0(h.c cVar) {
        com.facebook.b bVar = f20226e;
        this.a = new ArrayList();
        this.f20229c = new HashSet();
        this.f20230d = cVar;
        this.f20228b = bVar;
    }

    public final synchronized ArrayList a(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                c0 c0Var = (c0) it.next();
                if (!this.f20229c.contains(c0Var) && c0Var.a.isAssignableFrom(cls)) {
                    this.f20229c.add(c0Var);
                    y c10 = c0Var.f20223c.c(this);
                    com.bumptech.glide.c.l(c10);
                    arrayList.add(c10);
                    this.f20229c.remove(c0Var);
                }
            }
        } catch (Throwable th2) {
            this.f20229c.clear();
            throw th2;
        }
        return arrayList;
    }

    public final synchronized y b(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.a.iterator();
            boolean z10 = false;
            while (true) {
                boolean z11 = true;
                if (!it.hasNext()) {
                    break;
                }
                c0 c0Var = (c0) it.next();
                if (this.f20229c.contains(c0Var)) {
                    z10 = true;
                } else {
                    if (!c0Var.a.isAssignableFrom(cls) || !c0Var.f20222b.isAssignableFrom(cls2)) {
                        z11 = false;
                    }
                    if (z11) {
                        this.f20229c.add(c0Var);
                        y c10 = c0Var.f20223c.c(this);
                        com.bumptech.glide.c.l(c10);
                        arrayList.add(c10);
                        this.f20229c.remove(c0Var);
                    }
                }
            }
            if (arrayList.size() > 1) {
                com.facebook.b bVar = this.f20228b;
                m0.c cVar = this.f20230d;
                bVar.getClass();
                return new m(arrayList, cVar);
            }
            if (arrayList.size() == 1) {
                return (y) arrayList.get(0);
            }
            if (z10) {
                return f20227f;
            }
            throw new com.bumptech.glide.j(cls, cls2);
        } catch (Throwable th2) {
            this.f20229c.clear();
            throw th2;
        }
    }

    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            c0 c0Var = (c0) it.next();
            if (!arrayList.contains(c0Var.f20222b) && c0Var.a.isAssignableFrom(cls)) {
                arrayList.add(c0Var.f20222b);
            }
        }
        return arrayList;
    }
}
