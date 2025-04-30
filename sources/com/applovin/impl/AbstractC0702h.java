package com.applovin.impl;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0702h implements pf {

    /* renamed from: a, reason: collision with root package name */
    private transient Set f8013a;
    private transient Collection b;

    /* renamed from: c, reason: collision with root package name */
    private transient Map f8014c;

    /* renamed from: com.applovin.impl.h$a */
    /* loaded from: classes.dex */
    public class a extends AbstractCollection {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC0702h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC0702h.this.a(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC0702h.this.f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC0702h.this.size();
        }
    }

    @Override // com.applovin.impl.pf
    public Map a() {
        Map map = this.f8014c;
        if (map != null) {
            return map;
        }
        Map b = b();
        this.f8014c = b;
        return b;
    }

    public abstract Map b();

    public abstract Set c();

    public abstract Collection d();

    public Set e() {
        Set set = this.f8013a;
        if (set == null) {
            Set c9 = c();
            this.f8013a = c9;
            return c9;
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
        Collection collection = this.b;
        if (collection == null) {
            Collection d2 = d();
            this.b = d2;
            return d2;
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
