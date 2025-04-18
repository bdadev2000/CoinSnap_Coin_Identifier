package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class b0 extends AbstractCollection {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11905b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Map f11906c;

    public b0(c0 c0Var) {
        this.f11906c = c0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i10 = this.f11905b;
        Map map = this.f11906c;
        switch (i10) {
            case 0:
                ((c0) map).clear();
                return;
            default:
                map.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f11905b) {
            case 1:
                return this.f11906c.containsValue(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f11905b) {
            case 1:
                return this.f11906c.isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i10 = this.f11905b;
        Map map = this.f11906c;
        switch (i10) {
            case 0:
                c0 c0Var = (c0) map;
                Map a = c0Var.a();
                if (a != null) {
                    return a.values().iterator();
                }
                return new x(c0Var, 2);
            default:
                return new n1(map.entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f11905b) {
            case 1:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    Map map = this.f11906c;
                    for (Map.Entry entry : map.entrySet()) {
                        if (v8.u0.t(obj, entry.getValue())) {
                            map.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f11905b) {
            case 1:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    Map map = this.f11906c;
                    for (Map.Entry entry : map.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return map.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f11905b) {
            case 1:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    Map map = this.f11906c;
                    for (Map.Entry entry : map.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return map.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i10 = this.f11905b;
        Map map = this.f11906c;
        switch (i10) {
            case 0:
                return ((c0) map).size();
            default:
                return map.size();
        }
    }

    public b0(Map map) {
        map.getClass();
        this.f11906c = map;
    }
}
