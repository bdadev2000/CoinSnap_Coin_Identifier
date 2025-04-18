package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes3.dex */
public class g extends AbstractMap {

    /* renamed from: b, reason: collision with root package name */
    public transient e f11953b;

    /* renamed from: c, reason: collision with root package name */
    public transient b0 f11954c;

    /* renamed from: d, reason: collision with root package name */
    public final transient Map f11955d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f11956f;

    public g(r rVar, Map map) {
        this.f11956f = rVar;
        this.f11955d = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Set entrySet() {
        e eVar = this.f11953b;
        if (eVar == null) {
            e eVar2 = new e(this);
            this.f11953b = eVar2;
            return eVar2;
        }
        return eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Collection values() {
        b0 b0Var = this.f11954c;
        if (b0Var == null) {
            b0 b0Var2 = new b0(this);
            this.f11954c = b0Var2;
            return b0Var2;
        }
        return b0Var;
    }

    public final l0 c(Map.Entry entry) {
        Object qVar;
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        c cVar = (c) this.f11956f;
        cVar.getClass();
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            qVar = new l(cVar, key, list, null);
        } else {
            qVar = new q(cVar, key, list, null);
        }
        return new l0(key, qVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        r rVar = this.f11956f;
        if (this.f11955d == rVar.f12024f) {
            rVar.clear();
            return;
        }
        f fVar = new f(this);
        while (fVar.hasNext()) {
            fVar.next();
            fVar.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f11955d;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f11955d.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object qVar;
        Map map = this.f11955d;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        c cVar = (c) this.f11956f;
        cVar.getClass();
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            qVar = new l(cVar, obj, list, null);
        } else {
            qVar = new q(cVar, obj, list, null);
        }
        return qVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f11955d.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        r rVar = this.f11956f;
        Set set = rVar.f12035b;
        if (set == null) {
            Set e2 = rVar.e();
            rVar.f12035b = e2;
            return e2;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f11955d.remove(obj);
        if (collection == null) {
            return null;
        }
        r rVar = this.f11956f;
        List list = (List) ((v1) rVar).f12045h.get();
        list.addAll(collection);
        rVar.f12025g -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f11955d.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f11955d.toString();
    }
}
