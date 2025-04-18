package com.applovin.impl;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
abstract class h implements pf {
    private transient Set a;

    /* renamed from: b, reason: collision with root package name */
    private transient Collection f5045b;

    /* renamed from: c, reason: collision with root package name */
    private transient Map f5046c;

    /* loaded from: classes.dex */
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

    @Override // com.applovin.impl.pf
    public Map a() {
        Map map = this.f5046c;
        if (map != null) {
            return map;
        }
        Map b3 = b();
        this.f5046c = b3;
        return b3;
    }

    public abstract Map b();

    public abstract Set c();

    public abstract Collection d();

    public Set e() {
        Set set = this.a;
        if (set == null) {
            Set c10 = c();
            this.a = c10;
            return c10;
        }
        return set;
    }

    public boolean equals(Object obj) {
        return sf.a(this, obj);
    }

    public abstract Iterator f();

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }

    @Override // com.applovin.impl.pf
    public Collection values() {
        Collection collection = this.f5045b;
        if (collection == null) {
            Collection d10 = d();
            this.f5045b = d10;
            return d10;
        }
        return collection;
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
