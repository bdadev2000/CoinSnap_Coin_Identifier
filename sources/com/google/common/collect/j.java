package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public final class j extends m implements NavigableMap {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r f11977i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r rVar, NavigableMap navigableMap) {
        super(rVar, navigableMap);
        this.f11977i = rVar;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = f().ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return c(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return f().ceilingKey(obj);
    }

    @Override // com.google.common.collect.m
    public final SortedSet d() {
        return new k(this.f11977i, f());
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return ((j) descendingMap()).navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new j(this.f11977i, f().descendingMap());
    }

    @Override // com.google.common.collect.m
    /* renamed from: e */
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = f().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return c(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = f().floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return c(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return f().floorKey(obj);
    }

    public final l0 g(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        List list = (List) ((v1) this.f11977i).f12045h.get();
        list.addAll((Collection) entry.getValue());
        it.remove();
        return new l0(entry.getKey(), Collections.unmodifiableList(list));
    }

    @Override // com.google.common.collect.m
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final NavigableMap f() {
        return (NavigableMap) ((SortedMap) this.f11955d);
    }

    @Override // com.google.common.collect.m, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = f().higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return c(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return f().higherKey(obj);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.g, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = f().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return c(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = f().lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return c(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return f().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return g(((e) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return g(((e) ((g) descendingMap()).entrySet()).iterator());
    }

    @Override // com.google.common.collect.m, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.common.collect.m, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z10) {
        return new j(this.f11977i, f().headMap(obj, z10));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        return new j(this.f11977i, f().subMap(obj, z10, obj2, z11));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z10) {
        return new j(this.f11977i, f().tailMap(obj, z10));
    }
}
