package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class i extends n2 {

    /* renamed from: c, reason: collision with root package name */
    public final Map f11971c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f11972d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, Map map) {
        super(0);
        this.f11972d = rVar;
        map.getClass();
        this.f11971c = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean contains(Object obj) {
        return this.f11971c.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean isEmpty() {
        return this.f11971c.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int size() {
        return this.f11971c.size();
    }

    @Override // com.google.common.collect.n2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        f fVar = (f) iterator();
        while (fVar.hasNext()) {
            fVar.next();
            fVar.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f11971c.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f11971c.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f11971c.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new f(this, this.f11971c.entrySet().iterator());
    }

    @Override // com.google.common.collect.n2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i10;
        Collection collection = (Collection) this.f11971c.remove(obj);
        if (collection != null) {
            i10 = collection.size();
            collection.clear();
            this.f11972d.f12025g -= i10;
        } else {
            i10 = 0;
        }
        if (i10 <= 0) {
            return false;
        }
        return true;
    }
}
