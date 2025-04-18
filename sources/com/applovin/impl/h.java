package com.applovin.impl;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
abstract class h implements uf {

    /* renamed from: a, reason: collision with root package name */
    private transient Set f24176a;

    /* renamed from: b, reason: collision with root package name */
    private transient Collection f24177b;

    /* renamed from: c, reason: collision with root package name */
    private transient Map f24178c;

    /* loaded from: classes2.dex */
    public class a extends AbstractCollection {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return h.this.a(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return h.this.f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return h.this.size();
        }
    }

    @Override // com.applovin.impl.uf
    public Map a() {
        Map map = this.f24178c;
        if (map != null) {
            return map;
        }
        Map b2 = b();
        this.f24178c = b2;
        return b2;
    }

    public abstract Map b();

    public abstract Set c();

    public abstract Collection d();

    public Set e() {
        Set set = this.f24176a;
        if (set != null) {
            return set;
        }
        Set c2 = c();
        this.f24176a = c2;
        return c2;
    }

    public boolean equals(Object obj) {
        return xf.a(this, obj);
    }

    public abstract Iterator f();

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }

    @Override // com.applovin.impl.uf
    public Collection values() {
        Collection collection = this.f24177b;
        if (collection != null) {
            return collection;
        }
        Collection d = d();
        this.f24177b = d;
        return d;
    }

    public boolean a(Object obj) {
        Iterator it = a().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
