package com.applovin.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class hb extends b2 implements Serializable {
    final transient gb d;

    /* renamed from: f, reason: collision with root package name */
    final transient int f24288f;

    /* loaded from: classes.dex */
    public class a extends pp {

        /* renamed from: a, reason: collision with root package name */
        Iterator f24289a;

        /* renamed from: b, reason: collision with root package name */
        Iterator f24290b = xb.a();

        public a() {
            this.f24289a = hb.this.d.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24290b.hasNext() || this.f24289a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f24290b.hasNext()) {
                this.f24290b = ((cb) this.f24289a.next()).iterator();
            }
            return this.f24290b.next();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends cb {

        /* renamed from: b, reason: collision with root package name */
        private final transient hb f24295b;

        public c(hb hbVar) {
            this.f24295b = hbVar;
        }

        @Override // com.applovin.impl.cb
        public int a(Object[] objArr, int i2) {
            pp it = this.f24295b.d.values().iterator();
            while (it.hasNext()) {
                i2 = ((cb) it.next()).a(objArr, i2);
            }
            return i2;
        }

        @Override // com.applovin.impl.cb, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f24295b.a(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public pp iterator() {
            return this.f24295b.f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f24295b.size();
        }
    }

    public hb(gb gbVar, int i2) {
        this.d = gbVar;
        this.f24288f = i2;
    }

    @Override // com.applovin.impl.h
    public Map b() {
        throw new AssertionError("should never be called");
    }

    @Override // com.applovin.impl.h
    public Set c() {
        throw new AssertionError("unreachable");
    }

    @Override // com.applovin.impl.uf
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.applovin.impl.h
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.applovin.impl.h, com.applovin.impl.uf
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public gb a() {
        return this.d;
    }

    @Override // com.applovin.impl.h
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public cb d() {
        return new c(this);
    }

    @Override // com.applovin.impl.h
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.applovin.impl.h
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public pp f() {
        return new a();
    }

    @Override // com.applovin.impl.h, com.applovin.impl.uf
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public cb values() {
        return (cb) super.values();
    }

    @Override // com.applovin.impl.uf
    public boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.applovin.impl.uf
    public int size() {
        return this.f24288f;
    }

    @Override // com.applovin.impl.h
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.applovin.impl.h
    public boolean a(Object obj) {
        return obj != null && super.a(obj);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        Map f24292a = mh.a();

        /* renamed from: b, reason: collision with root package name */
        Comparator f24293b;

        /* renamed from: c, reason: collision with root package name */
        Comparator f24294c;

        public hb a() {
            Collection entrySet = this.f24292a.entrySet();
            Comparator comparator = this.f24293b;
            if (comparator != null) {
                entrySet = wg.a(comparator).b().a(entrySet);
            }
            return fb.a(entrySet, this.f24294c);
        }

        public Collection b() {
            return new ArrayList();
        }

        public b a(Object obj, Iterable iterable) {
            if (obj != null) {
                Collection collection = (Collection) this.f24292a.get(obj);
                if (collection != null) {
                    for (Object obj2 : iterable) {
                        p3.a(obj, obj2);
                        collection.add(obj2);
                    }
                    return this;
                }
                Iterator it = iterable.iterator();
                if (!it.hasNext()) {
                    return this;
                }
                Collection b2 = b();
                while (it.hasNext()) {
                    Object next = it.next();
                    p3.a(obj, next);
                    b2.add(next);
                }
                this.f24292a.put(obj, b2);
                return this;
            }
            throw new NullPointerException("null key in entry: null=" + wb.d(iterable));
        }

        public b a(Object obj, Object... objArr) {
            return a(obj, Arrays.asList(objArr));
        }
    }
}
