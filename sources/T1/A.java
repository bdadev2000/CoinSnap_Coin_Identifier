package T1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: e, reason: collision with root package name */
    public static final D f2955e = new D(10);

    /* renamed from: f, reason: collision with root package name */
    public static final E f2956f = new E(2);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2957a;
    public final D b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f2958c;

    /* renamed from: d, reason: collision with root package name */
    public final S.c f2959d;

    public A(C.c cVar) {
        D d2 = f2955e;
        this.f2957a = new ArrayList();
        this.f2958c = new HashSet();
        this.f2959d = cVar;
        this.b = d2;
    }

    public final u a(z zVar) {
        return zVar.f3004c.i(this);
    }

    public final synchronized u b(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f2957a.iterator();
            boolean z8 = false;
            while (it.hasNext()) {
                z zVar = (z) it.next();
                if (this.f2958c.contains(zVar)) {
                    z8 = true;
                } else if (zVar.f3003a.isAssignableFrom(cls) && zVar.b.isAssignableFrom(cls2)) {
                    this.f2958c.add(zVar);
                    arrayList.add(a(zVar));
                    this.f2958c.remove(zVar);
                }
            }
            if (arrayList.size() > 1) {
                D d2 = this.b;
                S.c cVar = this.f2959d;
                d2.getClass();
                return new C0296b(2, arrayList, cVar);
            }
            if (arrayList.size() == 1) {
                return (u) arrayList.get(0);
            }
            if (z8) {
                return f2956f;
            }
            throw new RuntimeException("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            this.f2958c.clear();
            throw th;
        }
    }

    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f2957a.iterator();
            while (it.hasNext()) {
                z zVar = (z) it.next();
                if (!this.f2958c.contains(zVar) && zVar.f3003a.isAssignableFrom(cls)) {
                    this.f2958c.add(zVar);
                    arrayList.add(zVar.f3004c.i(this));
                    this.f2958c.remove(zVar);
                }
            }
        } catch (Throwable th) {
            this.f2958c.clear();
            throw th;
        }
        return arrayList;
    }

    public final synchronized ArrayList d(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f2957a.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            if (!arrayList.contains(zVar.b) && zVar.f3003a.isAssignableFrom(cls)) {
                arrayList.add(zVar.b);
            }
        }
        return arrayList;
    }
}
