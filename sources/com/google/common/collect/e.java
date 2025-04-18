package com.google.common.collect;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class e extends n2 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f11935c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar) {
        super(0);
        this.f11935c = gVar;
    }

    @Override // com.google.common.collect.n2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void clear() {
        this.f11935c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean isEmpty() {
        return this.f11935c.isEmpty();
    }

    @Override // com.google.common.collect.n2, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                z10 |= remove(it.next());
            }
            return z10;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.f11935c.f11955d.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // com.google.common.collect.n2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean retainAll(Collection collection) {
        int i10;
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                a6.k.j(size, "expectedSize");
                i10 = size + 1;
            } else if (size < 1073741824) {
                i10 = (int) ((size / 0.75f) + 1.0f);
            } else {
                i10 = Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i10);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return this.f11935c.keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int size() {
        return this.f11935c.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new f(this.f11935c);
    }

    @Override // com.google.common.collect.n2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        r rVar = this.f11935c.f11956f;
        Object key = entry.getKey();
        Map map = rVar.f12024f;
        map.getClass();
        try {
            obj2 = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            rVar.f12025g -= size;
            return true;
        }
        return true;
    }
}
