package g4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class i {
    public final ArrayList a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18075b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.g f18076c;

    /* renamed from: d, reason: collision with root package name */
    public Object f18077d;

    /* renamed from: e, reason: collision with root package name */
    public int f18078e;

    /* renamed from: f, reason: collision with root package name */
    public int f18079f;

    /* renamed from: g, reason: collision with root package name */
    public Class f18080g;

    /* renamed from: h, reason: collision with root package name */
    public q f18081h;

    /* renamed from: i, reason: collision with root package name */
    public e4.m f18082i;

    /* renamed from: j, reason: collision with root package name */
    public Map f18083j;

    /* renamed from: k, reason: collision with root package name */
    public Class f18084k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f18085l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18086m;

    /* renamed from: n, reason: collision with root package name */
    public e4.j f18087n;

    /* renamed from: o, reason: collision with root package name */
    public com.bumptech.glide.h f18088o;

    /* renamed from: p, reason: collision with root package name */
    public p f18089p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f18090q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18091r;

    public final ArrayList a() {
        boolean z10 = this.f18086m;
        ArrayList arrayList = this.f18075b;
        if (!z10) {
            this.f18086m = true;
            arrayList.clear();
            ArrayList b3 = b();
            int size = b3.size();
            for (int i10 = 0; i10 < size; i10++) {
                k4.x xVar = (k4.x) b3.get(i10);
                if (!arrayList.contains(xVar.a)) {
                    arrayList.add(xVar.a);
                }
                int i11 = 0;
                while (true) {
                    List list = xVar.f20270b;
                    if (i11 < list.size()) {
                        if (!arrayList.contains(list.get(i11))) {
                            arrayList.add(list.get(i11));
                        }
                        i11++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z10 = this.f18085l;
        ArrayList arrayList = this.a;
        if (!z10) {
            this.f18085l = true;
            arrayList.clear();
            List e2 = this.f18076c.a().e(this.f18077d);
            int size = e2.size();
            for (int i10 = 0; i10 < size; i10++) {
                k4.x b3 = ((k4.y) e2.get(i10)).b(this.f18077d, this.f18078e, this.f18079f, this.f18082i);
                if (b3 != null) {
                    arrayList.add(b3);
                }
            }
        }
        return arrayList;
    }

    public final e0 c(Class cls) {
        e0 e0Var;
        e0 e0Var2;
        e0 e0Var3;
        ArrayList arrayList;
        boolean z10;
        q4.a aVar;
        boolean z11;
        com.bumptech.glide.k a = this.f18076c.a();
        Class cls2 = this.f18080g;
        Class cls3 = this.f18084k;
        r4.b bVar = a.f9685i;
        w4.k kVar = (w4.k) bVar.f23997b.getAndSet(null);
        if (kVar == null) {
            kVar = new w4.k();
        }
        kVar.a = cls;
        kVar.f26737b = cls2;
        kVar.f26738c = cls3;
        synchronized (bVar.a) {
            e0Var = (e0) bVar.a.getOrDefault(kVar, null);
        }
        bVar.f23997b.set(kVar);
        a.f9685i.getClass();
        if (r4.b.f23996c.equals(e0Var)) {
            return null;
        }
        if (e0Var == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = a.f9679c.w(cls, cls2).iterator();
            while (it.hasNext()) {
                Class<?> cls4 = (Class) it.next();
                Iterator it2 = a.f9682f.b(cls4, cls3).iterator();
                while (it2.hasNext()) {
                    Class cls5 = (Class) it2.next();
                    r4.c cVar = a.f9679c;
                    synchronized (cVar) {
                        arrayList = new ArrayList();
                        Iterator it3 = ((List) cVar.f23999c).iterator();
                        while (it3.hasNext()) {
                            List<r4.d> list = (List) ((Map) cVar.f24000d).get((String) it3.next());
                            if (list != null) {
                                for (r4.d dVar : list) {
                                    if (dVar.a.isAssignableFrom(cls) && cls4.isAssignableFrom(dVar.f24001b)) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        arrayList.add(dVar.f24002c);
                                    }
                                }
                            }
                        }
                    }
                    com.facebook.f0 f0Var = a.f9682f;
                    synchronized (f0Var) {
                        if (cls5.isAssignableFrom(cls4)) {
                            aVar = v5.a.f26029d;
                        } else {
                            Iterator it4 = f0Var.a.iterator();
                            while (it4.hasNext()) {
                                q4.b bVar2 = (q4.b) it4.next();
                                if (bVar2.a.isAssignableFrom(cls4) && cls5.isAssignableFrom(bVar2.f23683b)) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    aVar = bVar2.f23684c;
                                }
                            }
                            throw new IllegalArgumentException("No transcoder registered to transcode from " + cls4 + " to " + cls5);
                        }
                    }
                    arrayList2.add(new n(cls, cls4, cls5, arrayList, aVar, a.f9686j));
                }
            }
            if (arrayList2.isEmpty()) {
                e0Var2 = null;
            } else {
                e0Var2 = new e0(cls, cls2, cls3, arrayList2, a.f9686j);
            }
            r4.b bVar3 = a.f9685i;
            synchronized (bVar3.a) {
                r.b bVar4 = bVar3.a;
                w4.k kVar2 = new w4.k(cls, cls2, cls3);
                if (e0Var2 != null) {
                    e0Var3 = e0Var2;
                } else {
                    e0Var3 = r4.b.f23996c;
                }
                bVar4.put(kVar2, e0Var3);
            }
            return e0Var2;
        }
        return e0Var;
    }

    public final List d() {
        List list;
        ArrayList c10;
        com.bumptech.glide.k a = this.f18076c.a();
        Class<?> cls = this.f18077d.getClass();
        Class cls2 = this.f18080g;
        Class cls3 = this.f18084k;
        r4.c cVar = a.f9684h;
        w4.k kVar = (w4.k) ((AtomicReference) cVar.f23999c).getAndSet(null);
        if (kVar == null) {
            kVar = new w4.k(cls, cls2, cls3);
        } else {
            kVar.a = cls;
            kVar.f26737b = cls2;
            kVar.f26738c = cls3;
        }
        synchronized (((r.b) cVar.f24000d)) {
            list = (List) ((r.b) cVar.f24000d).getOrDefault(kVar, null);
        }
        ((AtomicReference) cVar.f23999c).set(kVar);
        List list2 = list;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            d3.g gVar = a.a;
            synchronized (gVar) {
                c10 = ((k4.d0) gVar.f16812c).c(cls);
            }
            Iterator it = c10.iterator();
            while (it.hasNext()) {
                Iterator it2 = a.f9679c.w((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!a.f9682f.b(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            r4.c cVar2 = a.f9684h;
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (((r.b) cVar2.f24000d)) {
                ((r.b) cVar2.f24000d).put(new w4.k(cls, cls2, cls3), unmodifiableList);
            }
            list2 = arrayList;
        }
        return list2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r1 = r3.f23995b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final e4.c e(java.lang.Object r6) {
        /*
            r5 = this;
            com.bumptech.glide.g r0 = r5.f18076c
            com.bumptech.glide.k r0 = r0.a()
            com.facebook.f0 r0 = r0.f9678b
            java.lang.Class r1 = r6.getClass()
            monitor-enter(r0)
            java.util.ArrayList r2 = r0.a     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L3b
        L13:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L3b
            r4.a r3 = (r4.a) r3     // Catch: java.lang.Throwable -> L3b
            java.lang.Class r4 = r3.a     // Catch: java.lang.Throwable -> L3b
            boolean r4 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L13
            e4.c r1 = r3.f23995b     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r0)
            goto L2d
        L2b:
            monitor-exit(r0)
            r1 = 0
        L2d:
            if (r1 == 0) goto L30
            return r1
        L30:
            com.bumptech.glide.j r0 = new com.bumptech.glide.j
            java.lang.Class r6 = r6.getClass()
            r1 = 3
            r0.<init>(r6, r1)
            throw r0
        L3b:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.i.e(java.lang.Object):e4.c");
    }

    public final e4.q f(Class cls) {
        e4.q qVar = (e4.q) this.f18083j.get(cls);
        if (qVar == null) {
            Iterator it = this.f18083j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    qVar = (e4.q) entry.getValue();
                    break;
                }
            }
        }
        if (qVar == null) {
            if (this.f18083j.isEmpty() && this.f18090q) {
                throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return m4.c.f21626b;
        }
        return qVar;
    }
}
