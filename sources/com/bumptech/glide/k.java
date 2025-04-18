package com.bumptech.glide;

import a4.s;
import com.facebook.f0;
import e4.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k4.a0;
import k4.c0;
import k4.d0;
import k4.y;
import k4.z;

/* loaded from: classes.dex */
public final class k {
    public final d3.g a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f9678b;

    /* renamed from: c, reason: collision with root package name */
    public final r4.c f9679c;

    /* renamed from: d, reason: collision with root package name */
    public final o3.c f9680d;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.data.i f9681e;

    /* renamed from: f, reason: collision with root package name */
    public final f0 f9682f;

    /* renamed from: g, reason: collision with root package name */
    public final s f9683g;

    /* renamed from: h, reason: collision with root package name */
    public final r4.c f9684h = new r4.c(0);

    /* renamed from: i, reason: collision with root package name */
    public final r4.b f9685i = new r4.b();

    /* renamed from: j, reason: collision with root package name */
    public final h.c f9686j;

    public k() {
        h.c cVar = new h.c(new m0.d(20), new z1.d(27), new com.facebook.b(28));
        this.f9686j = cVar;
        this.a = new d3.g(cVar);
        this.f9678b = new f0(2);
        this.f9679c = new r4.c(1);
        this.f9680d = new o3.c(1);
        this.f9681e = new com.bumptech.glide.load.data.i();
        this.f9682f = new f0(1);
        this.f9683g = new s(1);
        List asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        r4.c cVar2 = this.f9679c;
        synchronized (cVar2) {
            ArrayList arrayList2 = new ArrayList((List) cVar2.f23999c);
            ((List) cVar2.f23999c).clear();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((List) cVar2.f23999c).add((String) it2.next());
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                String str = (String) it3.next();
                if (!arrayList.contains(str)) {
                    ((List) cVar2.f23999c).add(str);
                }
            }
        }
    }

    public final void a(e4.o oVar, Class cls, Class cls2, String str) {
        r4.c cVar = this.f9679c;
        synchronized (cVar) {
            cVar.v(str).add(new r4.d(cls, cls2, oVar));
        }
    }

    public final void b(Class cls, p pVar) {
        o3.c cVar = this.f9680d;
        synchronized (cVar) {
            cVar.a.add(new r4.e(cls, pVar));
        }
    }

    public final void c(Class cls, Class cls2, z zVar) {
        d3.g gVar = this.a;
        synchronized (gVar) {
            d0 d0Var = (d0) gVar.f16812c;
            synchronized (d0Var) {
                c0 c0Var = new c0(cls, cls2, zVar);
                ArrayList arrayList = d0Var.a;
                arrayList.add(arrayList.size(), c0Var);
            }
            ((androidx.work.g) gVar.f16813d).a.clear();
        }
    }

    public final ArrayList d() {
        ArrayList arrayList;
        s sVar = this.f9683g;
        synchronized (sVar) {
            arrayList = sVar.a;
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new j();
    }

    public final List e(Object obj) {
        List list;
        d3.g gVar = this.a;
        gVar.getClass();
        Class<?> cls = obj.getClass();
        synchronized (gVar) {
            a0 a0Var = (a0) ((androidx.work.g) gVar.f16813d).a.get(cls);
            if (a0Var == null) {
                list = null;
            } else {
                list = a0Var.a;
            }
            if (list == null) {
                list = Collections.unmodifiableList(((d0) gVar.f16812c).a(cls));
                if (((a0) ((androidx.work.g) gVar.f16813d).a.put(cls, new a0(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List emptyList = Collections.emptyList();
            boolean z10 = true;
            for (int i10 = 0; i10 < size; i10++) {
                y yVar = (y) list.get(i10);
                if (yVar.a(obj)) {
                    if (z10) {
                        emptyList = new ArrayList(size - i10);
                        z10 = false;
                    }
                    emptyList.add(yVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new j(obj, list);
        }
        throw new j(obj);
    }

    public final com.bumptech.glide.load.data.g f(Object obj) {
        com.bumptech.glide.load.data.g b3;
        com.bumptech.glide.load.data.i iVar = this.f9681e;
        synchronized (iVar) {
            c.l(obj);
            com.bumptech.glide.load.data.f fVar = (com.bumptech.glide.load.data.f) iVar.a.get(obj.getClass());
            if (fVar == null) {
                Iterator it = iVar.a.values().iterator();
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
                fVar = com.bumptech.glide.load.data.i.f9698b;
            }
            b3 = fVar.b(obj);
        }
        return b3;
    }

    public final void g(com.bumptech.glide.load.data.f fVar) {
        com.bumptech.glide.load.data.i iVar = this.f9681e;
        synchronized (iVar) {
            iVar.a.put(fVar.a(), fVar);
        }
    }

    public final void h(Class cls, Class cls2, q4.a aVar) {
        f0 f0Var = this.f9682f;
        synchronized (f0Var) {
            f0Var.a.add(new q4.b(cls, cls2, aVar));
        }
    }
}
