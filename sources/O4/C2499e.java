package o4;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2499e implements InterfaceC2497c {

    /* renamed from: h, reason: collision with root package name */
    public static final U4.m f21950h = new U4.m(5);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f21951a;
    public final HashMap b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f21952c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f21953d;

    /* renamed from: e, reason: collision with root package name */
    public final C2504j f21954e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f21955f;

    /* renamed from: g, reason: collision with root package name */
    public final r6.b f21956g;

    public C2499e(ArrayList arrayList, ArrayList arrayList2, r6.b bVar) {
        p4.l lVar = p4.l.b;
        this.f21951a = new HashMap();
        this.b = new HashMap();
        this.f21952c = new HashMap();
        this.f21953d = new HashSet();
        this.f21955f = new AtomicReference();
        C2504j c2504j = new C2504j();
        this.f21954e = c2504j;
        this.f21956g = bVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(C2496b.c(c2504j, C2504j.class, K4.c.class, K4.b.class));
        arrayList3.add(C2496b.c(this, C2499e.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C2496b c2496b = (C2496b) it.next();
            if (c2496b != null) {
                arrayList3.add(c2496b);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((N4.b) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f21956g.f(componentRegistrar));
                        it3.remove();
                    }
                } catch (C2505k e4) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e4);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((C2496b) it4.next()).b.toArray();
                int length = array.length;
                int i9 = 0;
                while (true) {
                    if (i9 < length) {
                        Object obj = array[i9];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f21953d.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.f21953d.add(obj.toString());
                        }
                        i9++;
                    }
                }
            }
            if (this.f21951a.isEmpty()) {
                com.bumptech.glide.c.K(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f21951a.keySet());
                arrayList6.addAll(arrayList3);
                com.bumptech.glide.c.K(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                C2496b c2496b2 = (C2496b) it5.next();
                this.f21951a.put(c2496b2, new l(new L4.c(2, this, c2496b2)));
            }
            arrayList5.addAll(j(arrayList3));
            arrayList5.addAll(k());
            i();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) this.f21955f.get();
        if (bool != null) {
            h(this.f21951a, bool.booleanValue());
        }
    }

    @Override // o4.InterfaceC2497c
    public final o d(q qVar) {
        N4.b g9 = g(qVar);
        if (g9 == null) {
            return new o(o.f21967c, o.f21968d);
        }
        if (g9 instanceof o) {
            return (o) g9;
        }
        return new o(null, g9);
    }

    @Override // o4.InterfaceC2497c
    public final synchronized N4.b e(q qVar) {
        m mVar = (m) this.f21952c.get(qVar);
        if (mVar != null) {
            return mVar;
        }
        return f21950h;
    }

    @Override // o4.InterfaceC2497c
    public final synchronized N4.b g(q qVar) {
        com.bumptech.glide.d.H(qVar, "Null interface requested.");
        return (N4.b) this.b.get(qVar);
    }

    public final void h(Map map, boolean z8) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            C2496b c2496b = (C2496b) entry.getKey();
            N4.b bVar = (N4.b) entry.getValue();
            int i9 = c2496b.f21946d;
            if (i9 == 1 || (i9 == 2 && z8)) {
                bVar.get();
            }
        }
        C2504j c2504j = this.f21954e;
        synchronized (c2504j) {
            arrayDeque = c2504j.b;
            if (arrayDeque != null) {
                c2504j.b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                com.mbridge.msdk.foundation.entity.o.v(it.next());
                throw null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [o4.m, java.lang.Object] */
    public final void i() {
        boolean z8;
        for (C2496b c2496b : this.f21951a.keySet()) {
            for (C2502h c2502h : c2496b.f21945c) {
                if (c2502h.b == 2) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                q qVar = c2502h.f21960a;
                if (z8) {
                    HashMap hashMap = this.f21952c;
                    if (!hashMap.containsKey(qVar)) {
                        Set emptySet = Collections.emptySet();
                        ?? obj = new Object();
                        obj.b = null;
                        obj.f21966a = Collections.newSetFromMap(new ConcurrentHashMap());
                        obj.f21966a.addAll(emptySet);
                        hashMap.put(qVar, obj);
                    }
                }
                HashMap hashMap2 = this.b;
                if (hashMap2.containsKey(qVar)) {
                    continue;
                } else {
                    int i9 = c2502h.b;
                    if (i9 != 1) {
                        if (i9 != 2) {
                            hashMap2.put(qVar, new o(o.f21967c, o.f21968d));
                        }
                    } else {
                        throw new RuntimeException("Unsatisfied dependency for component " + c2496b + ": " + qVar);
                    }
                }
            }
        }
    }

    public final ArrayList j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2496b c2496b = (C2496b) it.next();
            if (c2496b.f21947e == 0) {
                N4.b bVar = (N4.b) this.f21951a.get(c2496b);
                for (q qVar : c2496b.b) {
                    HashMap hashMap = this.b;
                    if (!hashMap.containsKey(qVar)) {
                        hashMap.put(qVar, bVar);
                    } else {
                        arrayList2.add(new com.facebook.appevents.k(17, (o) ((N4.b) hashMap.get(qVar)), bVar));
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [o4.m, java.lang.Object] */
    public final ArrayList k() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f21951a.entrySet()) {
            C2496b c2496b = (C2496b) entry.getKey();
            if (c2496b.f21947e != 0) {
                N4.b bVar = (N4.b) entry.getValue();
                for (q qVar : c2496b.b) {
                    if (!hashMap.containsKey(qVar)) {
                        hashMap.put(qVar, new HashSet());
                    }
                    ((Set) hashMap.get(qVar)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            HashMap hashMap2 = this.f21952c;
            if (!hashMap2.containsKey(key)) {
                q qVar2 = (q) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                ?? obj = new Object();
                obj.b = null;
                obj.f21966a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.f21966a.addAll(set);
                hashMap2.put(qVar2, obj);
            } else {
                m mVar = (m) hashMap2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.facebook.appevents.k(18, mVar, (N4.b) it.next()));
                }
            }
        }
        return arrayList;
    }
}
