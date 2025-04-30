package com.bumptech.glide;

import T1.A;
import T1.u;
import T1.v;
import T1.w;
import T1.x;
import T1.z;
import b2.C0555b;
import b2.InterfaceC0554a;
import com.facebook.B;
import e2.C2213a;
import e2.C2214b;
import e2.C2215c;
import e2.C2216d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final x f12824a;
    public final f b;

    /* renamed from: c, reason: collision with root package name */
    public final E1.d f12825c;

    /* renamed from: d, reason: collision with root package name */
    public final B f12826d;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.data.h f12827e;

    /* renamed from: f, reason: collision with root package name */
    public final J1.k f12828f;

    /* renamed from: g, reason: collision with root package name */
    public final J1.k f12829g;

    /* renamed from: h, reason: collision with root package name */
    public final a7.b f12830h = new a7.b(21);

    /* renamed from: i, reason: collision with root package name */
    public final C2214b f12831i = new C2214b();

    /* renamed from: j, reason: collision with root package name */
    public final C.c f12832j;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, k2.c] */
    public i() {
        C.c cVar = new C.c(new S.e(20), new R3.e(26), (k2.c) new Object());
        this.f12832j = cVar;
        this.f12824a = new x(cVar);
        this.b = new f(3);
        this.f12825c = new E1.d(26);
        this.f12826d = new B();
        this.f12827e = new com.bumptech.glide.load.data.h();
        this.f12828f = new J1.k(1);
        this.f12829g = new J1.k(2);
        List asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        E1.d dVar = this.f12825c;
        synchronized (dVar) {
            try {
                ArrayList arrayList2 = new ArrayList((ArrayList) dVar.f973c);
                ((ArrayList) dVar.f973c).clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ArrayList) dVar.f973c).add((String) it2.next());
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    String str = (String) it3.next();
                    if (!arrayList.contains(str)) {
                        ((ArrayList) dVar.f973c).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Class cls, N1.b bVar) {
        f fVar = this.b;
        synchronized (fVar) {
            ((ArrayList) fVar.f12819c).add(new C2213a(cls, bVar));
        }
    }

    public final void b(Class cls, N1.l lVar) {
        B b = this.f12826d;
        synchronized (b) {
            b.f13379a.add(new C2216d(cls, lVar));
        }
    }

    public final void c(Class cls, Class cls2, v vVar) {
        x xVar = this.f12824a;
        synchronized (xVar) {
            A a6 = xVar.f2996a;
            synchronized (a6) {
                z zVar = new z(cls, cls2, vVar);
                ArrayList arrayList = a6.f2957a;
                arrayList.add(arrayList.size(), zVar);
            }
            ((HashMap) xVar.b.f972c).clear();
        }
    }

    public final void d(String str, Class cls, Class cls2, N1.k kVar) {
        E1.d dVar = this.f12825c;
        synchronized (dVar) {
            dVar.l(str).add(new C2215c(cls, cls2, kVar));
        }
    }

    public final ArrayList e() {
        ArrayList arrayList;
        J1.k kVar = this.f12829g;
        synchronized (kVar) {
            arrayList = kVar.f1526a;
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new RuntimeException("Failed to find image header parser.");
    }

    public final List f(Object obj) {
        List list;
        x xVar = this.f12824a;
        xVar.getClass();
        Class<?> cls = obj.getClass();
        synchronized (xVar) {
            w wVar = (w) ((HashMap) xVar.b.f972c).get(cls);
            if (wVar == null) {
                list = null;
            } else {
                list = wVar.f2995a;
            }
            if (list == null) {
                list = Collections.unmodifiableList(xVar.f2996a.c(cls));
                if (((w) ((HashMap) xVar.b.f972c).put(cls, new w(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List emptyList = Collections.emptyList();
            boolean z8 = true;
            for (int i9 = 0; i9 < size; i9++) {
                u uVar = (u) list.get(i9);
                if (uVar.a(obj)) {
                    if (z8) {
                        emptyList = new ArrayList(size - i9);
                        z8 = false;
                    }
                    emptyList.add(uVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new RuntimeException("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
        }
        throw new RuntimeException("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
    }

    public final com.bumptech.glide.load.data.g g(Object obj) {
        com.bumptech.glide.load.data.g b;
        com.bumptech.glide.load.data.h hVar = this.f12827e;
        synchronized (hVar) {
            try {
                j2.g.b(obj);
                com.bumptech.glide.load.data.f fVar = (com.bumptech.glide.load.data.f) ((HashMap) hVar.f12856c).get(obj.getClass());
                if (fVar == null) {
                    Iterator it = ((HashMap) hVar.f12856c).values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        com.bumptech.glide.load.data.f fVar2 = (com.bumptech.glide.load.data.f) it.next();
                        if (fVar2.a().isAssignableFrom(obj.getClass())) {
                            fVar = fVar2;
                            break;
                        }
                    }
                }
                if (fVar == null) {
                    fVar = com.bumptech.glide.load.data.h.f12855d;
                }
                b = fVar.b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    public final void h(com.bumptech.glide.load.data.f fVar) {
        com.bumptech.glide.load.data.h hVar = this.f12827e;
        synchronized (hVar) {
            ((HashMap) hVar.f12856c).put(fVar.a(), fVar);
        }
    }

    public final void i(Class cls, Class cls2, InterfaceC0554a interfaceC0554a) {
        J1.k kVar = this.f12828f;
        synchronized (kVar) {
            kVar.f1526a.add(new C0555b(cls, cls2, interfaceC0554a));
        }
    }
}
