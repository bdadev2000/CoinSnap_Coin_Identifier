package db;

import android.util.Log;
import com.facebook.r0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class g implements b, ub.a {

    /* renamed from: h, reason: collision with root package name */
    public static final f f16946h = new f(0);

    /* renamed from: e, reason: collision with root package name */
    public final l f16950e;

    /* renamed from: g, reason: collision with root package name */
    public final e f16952g;
    public final HashMap a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f16947b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f16948c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f16949d = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f16951f = new AtomicReference();

    public g(Executor executor, List list, List list2, e eVar) {
        l lVar = new l(executor);
        this.f16950e = lVar;
        this.f16952g = eVar;
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        arrayList.add(a.c(lVar, l.class, zb.c.class, zb.b.class));
        arrayList.add(a.c(this, ub.a.class, new Class[0]));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next());
        }
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((cc.c) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList.addAll(this.f16952g.a(componentRegistrar));
                        it3.remove();
                    }
                } catch (m e2) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e2);
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Object[] array = ((a) it4.next()).f16939b.toArray();
                int length = array.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        Object obj = array[i11];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f16949d.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.f16949d.add(obj.toString());
                        }
                        i11++;
                    }
                }
            }
            if (this.a.isEmpty()) {
                com.facebook.appevents.g.f(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(this.a.keySet());
                arrayList4.addAll(arrayList);
                com.facebook.appevents.g.f(arrayList4);
            }
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                a aVar2 = (a) it5.next();
                this.a.put(aVar2, new n(new va.c(i10, this, aVar2)));
            }
            arrayList3.addAll(j(arrayList));
            arrayList3.addAll(k());
            i();
        }
        Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) this.f16951f.get();
        if (bool != null) {
            h(this.a, bool.booleanValue());
        }
    }

    @Override // db.b
    public final synchronized cc.c a(s sVar) {
        if (sVar != null) {
        } else {
            throw new NullPointerException("Null interface requested.");
        }
        return (cc.c) this.f16947b.get(sVar);
    }

    @Override // db.b
    public final cc.b f(s sVar) {
        cc.c a = a(sVar);
        if (a == null) {
            return new q(q.f16964c, q.f16965d);
        }
        if (a instanceof q) {
            return (q) a;
        }
        return new q(null, a);
    }

    @Override // db.b
    public final synchronized cc.c g(s sVar) {
        o oVar = (o) this.f16948c.get(sVar);
        if (oVar != null) {
            return oVar;
        }
        return f16946h;
    }

    public final void h(Map map, boolean z10) {
        ArrayDeque arrayDeque;
        boolean z11;
        for (Map.Entry entry : map.entrySet()) {
            a aVar = (a) entry.getKey();
            cc.c cVar = (cc.c) entry.getValue();
            int i10 = aVar.f16941d;
            boolean z12 = false;
            if (i10 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                if (i10 == 2) {
                    z12 = true;
                }
                if (z12 && z10) {
                }
            }
            cVar.get();
        }
        l lVar = this.f16950e;
        synchronized (lVar) {
            try {
                arrayDeque = lVar.f16959b;
                if (arrayDeque != null) {
                    lVar.f16959b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                a4.j.t(it.next());
                throw null;
            }
        }
    }

    public final void i() {
        boolean z10;
        boolean z11;
        for (a aVar : this.a.keySet()) {
            for (j jVar : aVar.f16940c) {
                boolean z12 = true;
                if (jVar.f16956b == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s sVar = jVar.a;
                if (z10) {
                    HashMap hashMap = this.f16948c;
                    if (!hashMap.containsKey(sVar)) {
                        hashMap.put(sVar, new o(Collections.emptySet()));
                    }
                }
                HashMap hashMap2 = this.f16947b;
                if (hashMap2.containsKey(sVar)) {
                    continue;
                } else {
                    int i10 = jVar.f16956b;
                    if (i10 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        if (i10 != 2) {
                            z12 = false;
                        }
                        if (!z12) {
                            hashMap2.put(sVar, new q(q.f16964c, q.f16965d));
                        }
                    } else {
                        throw new p(String.format("Unsatisfied dependency for component %s: %s", aVar, sVar));
                    }
                }
            }
        }
    }

    public final ArrayList j(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f16942e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                cc.c cVar = (cc.c) this.a.get(aVar);
                for (s sVar : aVar.f16939b) {
                    HashMap hashMap = this.f16947b;
                    if (!hashMap.containsKey(sVar)) {
                        hashMap.put(sVar, cVar);
                    } else {
                        arrayList2.add(new r0(25, (q) ((cc.c) hashMap.get(sVar)), cVar));
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList k() {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.f16942e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                cc.c cVar = (cc.c) entry.getValue();
                for (s sVar : aVar.f16939b) {
                    if (!hashMap.containsKey(sVar)) {
                        hashMap.put(sVar, new HashSet());
                    }
                    ((Set) hashMap.get(sVar)).add(cVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            HashMap hashMap2 = this.f16948c;
            if (!hashMap2.containsKey(key)) {
                hashMap2.put((s) entry2.getKey(), new o((Set) ((Collection) entry2.getValue())));
            } else {
                o oVar = (o) hashMap2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new r0(26, oVar, (cc.c) it.next()));
                }
            }
        }
        return arrayList;
    }
}
