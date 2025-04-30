package P1;

import b2.C0555b;
import b2.InterfaceC0554a;
import e2.C2214b;
import e2.C2215c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2305a = new ArrayList();
    public final ArrayList b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.e f2306c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2307d;

    /* renamed from: e, reason: collision with root package name */
    public int f2308e;

    /* renamed from: f, reason: collision with root package name */
    public int f2309f;

    /* renamed from: g, reason: collision with root package name */
    public Class f2310g;

    /* renamed from: h, reason: collision with root package name */
    public m f2311h;

    /* renamed from: i, reason: collision with root package name */
    public N1.i f2312i;

    /* renamed from: j, reason: collision with root package name */
    public Map f2313j;

    /* renamed from: k, reason: collision with root package name */
    public Class f2314k;
    public boolean l;
    public boolean m;

    /* renamed from: n, reason: collision with root package name */
    public N1.f f2315n;

    /* renamed from: o, reason: collision with root package name */
    public com.bumptech.glide.g f2316o;

    /* renamed from: p, reason: collision with root package name */
    public l f2317p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2318q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2319r;

    public final ArrayList a() {
        boolean z8 = this.m;
        ArrayList arrayList = this.b;
        if (!z8) {
            this.m = true;
            arrayList.clear();
            ArrayList b = b();
            int size = b.size();
            for (int i9 = 0; i9 < size; i9++) {
                T1.t tVar = (T1.t) b.get(i9);
                if (!arrayList.contains(tVar.f2993a)) {
                    arrayList.add(tVar.f2993a);
                }
                int i10 = 0;
                while (true) {
                    List list = tVar.b;
                    if (i10 < list.size()) {
                        if (!arrayList.contains(list.get(i10))) {
                            arrayList.add(list.get(i10));
                        }
                        i10++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z8 = this.l;
        ArrayList arrayList = this.f2305a;
        if (!z8) {
            this.l = true;
            arrayList.clear();
            List f9 = this.f2306c.a().f(this.f2307d);
            int size = f9.size();
            for (int i9 = 0; i9 < size; i9++) {
                T1.t b = ((T1.u) f9.get(i9)).b(this.f2307d, this.f2308e, this.f2309f, this.f2312i);
                if (b != null) {
                    arrayList.add(b);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final z c(Class cls) {
        z zVar;
        z zVar2;
        z zVar3;
        ArrayList arrayList;
        InterfaceC0554a interfaceC0554a;
        com.bumptech.glide.i a6 = this.f2306c.a();
        Class cls2 = this.f2310g;
        Class cls3 = this.f2314k;
        C2214b c2214b = a6.f12831i;
        j2.l lVar = (j2.l) c2214b.b.getAndSet(null);
        j2.l lVar2 = lVar;
        if (lVar == null) {
            lVar2 = new Object();
        }
        lVar2.f21022a = cls;
        lVar2.b = cls2;
        lVar2.f21023c = cls3;
        synchronized (c2214b.f20068a) {
            zVar = (z) c2214b.f20068a.getOrDefault(lVar2, null);
        }
        c2214b.b.set(lVar2);
        a6.f12831i.getClass();
        if (C2214b.f20067c.equals(zVar)) {
            return null;
        }
        if (zVar == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = a6.f12825c.o(cls, cls2).iterator();
            while (it.hasNext()) {
                Class<?> cls4 = (Class) it.next();
                Iterator it2 = a6.f12828f.g(cls4, cls3).iterator();
                while (it2.hasNext()) {
                    Class cls5 = (Class) it2.next();
                    E1.d dVar = a6.f12825c;
                    synchronized (dVar) {
                        arrayList = new ArrayList();
                        Iterator it3 = ((ArrayList) dVar.f973c).iterator();
                        while (it3.hasNext()) {
                            List<C2215c> list = (List) ((HashMap) dVar.f974d).get((String) it3.next());
                            if (list != null) {
                                for (C2215c c2215c : list) {
                                    if (c2215c.f20069a.isAssignableFrom(cls) && cls4.isAssignableFrom(c2215c.b)) {
                                        arrayList.add(c2215c.f20070c);
                                    }
                                }
                            }
                        }
                    }
                    J1.k kVar = a6.f12828f;
                    synchronized (kVar) {
                        if (cls5.isAssignableFrom(cls4)) {
                            interfaceC0554a = b2.c.f5275c;
                        } else {
                            Iterator it4 = kVar.f1526a.iterator();
                            while (it4.hasNext()) {
                                C0555b c0555b = (C0555b) it4.next();
                                if (c0555b.f5273a.isAssignableFrom(cls4) && cls5.isAssignableFrom(c0555b.b)) {
                                    interfaceC0554a = c0555b.f5274c;
                                }
                            }
                            throw new IllegalArgumentException("No transcoder registered to transcode from " + cls4 + " to " + cls5);
                        }
                    }
                    arrayList2.add(new k(cls, cls4, cls5, arrayList, interfaceC0554a, a6.f12832j));
                }
            }
            if (arrayList2.isEmpty()) {
                zVar2 = null;
            } else {
                zVar2 = new z(cls, cls2, cls3, arrayList2, a6.f12832j);
            }
            C2214b c2214b2 = a6.f12831i;
            synchronized (c2214b2.f20068a) {
                x.b bVar = c2214b2.f20068a;
                j2.l lVar3 = new j2.l(cls, cls2, cls3);
                if (zVar2 != null) {
                    zVar3 = zVar2;
                } else {
                    zVar3 = C2214b.f20067c;
                }
                bVar.put(lVar3, zVar3);
            }
            return zVar2;
        }
        return zVar;
    }

    public final List d() {
        List list;
        ArrayList d2;
        com.bumptech.glide.i a6 = this.f2306c.a();
        Class<?> cls = this.f2307d.getClass();
        Class cls2 = this.f2310g;
        Class cls3 = this.f2314k;
        a7.b bVar = a6.f12830h;
        j2.l lVar = (j2.l) ((AtomicReference) bVar.f4077c).getAndSet(null);
        if (lVar == null) {
            lVar = new j2.l(cls, cls2, cls3);
        } else {
            lVar.f21022a = cls;
            lVar.b = cls2;
            lVar.f21023c = cls3;
        }
        synchronized (((x.b) bVar.f4078d)) {
            list = (List) ((x.b) bVar.f4078d).getOrDefault(lVar, null);
        }
        ((AtomicReference) bVar.f4077c).set(lVar);
        List list2 = list;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            T1.x xVar = a6.f12824a;
            synchronized (xVar) {
                d2 = xVar.f2996a.d(cls);
            }
            Iterator it = d2.iterator();
            while (it.hasNext()) {
                Iterator it2 = a6.f12825c.o((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!a6.f12828f.g(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            a7.b bVar2 = a6.f12830h;
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (((x.b) bVar2.f4078d)) {
                ((x.b) bVar2.f4078d).put(new j2.l(cls, cls2, cls3), unmodifiableList);
            }
            list2 = arrayList;
        }
        return list2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        r1 = r3.b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final N1.b e(java.lang.Object r6) {
        /*
            r5 = this;
            com.bumptech.glide.e r0 = r5.f2306c
            com.bumptech.glide.i r0 = r0.a()
            com.bumptech.glide.f r0 = r0.b
            java.lang.Class r1 = r6.getClass()
            monitor-enter(r0)
            java.lang.Object r2 = r0.f12819c     // Catch: java.lang.Throwable -> L2d
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2d
        L15:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2d
            e2.a r3 = (e2.C2213a) r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Class r4 = r3.f20066a     // Catch: java.lang.Throwable -> L2d
            boolean r4 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L15
            N1.b r1 = r3.b     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r0)
            goto L31
        L2d:
            r6 = move-exception
            goto L4c
        L2f:
            monitor-exit(r0)
            r1 = 0
        L31:
            if (r1 == 0) goto L34
            return r1
        L34:
            com.bumptech.glide.h r0 = new com.bumptech.glide.h
            java.lang.Class r6 = r6.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to find source encoder for data class: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L4c:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.i.e(java.lang.Object):N1.b");
    }

    public final N1.m f(Class cls) {
        N1.m mVar = (N1.m) this.f2313j.get(cls);
        if (mVar == null) {
            Iterator it = this.f2313j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    mVar = (N1.m) entry.getValue();
                    break;
                }
            }
        }
        if (mVar == null) {
            if (this.f2313j.isEmpty() && this.f2318q) {
                throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return V1.e.b;
        }
        return mVar;
    }
}
