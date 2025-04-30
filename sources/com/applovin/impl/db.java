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
public abstract class db extends AbstractC0670a2 implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    final transient cb f7269d;

    /* renamed from: f, reason: collision with root package name */
    final transient int f7270f;

    /* loaded from: classes.dex */
    public class a extends qp {

        /* renamed from: a, reason: collision with root package name */
        Iterator f7271a;
        Iterator b = sb.a();

        public a() {
            this.f7271a = db.this.f7269d.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.b.hasNext() && !this.f7271a.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.b.hasNext()) {
                this.b = ((ya) this.f7271a.next()).iterator();
            }
            return this.b.next();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends ya {
        private final transient db b;

        public c(db dbVar) {
            this.b = dbVar;
        }

        @Override // com.applovin.impl.ya
        public int a(Object[] objArr, int i9) {
            qp it = this.b.f7269d.values().iterator();
            while (it.hasNext()) {
                i9 = ((ya) it.next()).a(objArr, i9);
            }
            return i9;
        }

        @Override // com.applovin.impl.ya, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.b.a(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public qp iterator() {
            return this.b.f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.b.size();
        }
    }

    public db(cb cbVar, int i9) {
        this.f7269d = cbVar;
        this.f7270f = i9;
    }

    @Override // com.applovin.impl.AbstractC0702h
    public Map b() {
        throw new AssertionError("should never be called");
    }

    @Override // com.applovin.impl.AbstractC0702h
    public Set c() {
        throw new AssertionError("unreachable");
    }

    @Override // com.applovin.impl.pf
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.applovin.impl.AbstractC0702h
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.applovin.impl.AbstractC0702h, com.applovin.impl.pf
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public cb a() {
        return this.f7269d;
    }

    @Override // com.applovin.impl.AbstractC0702h
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public ya d() {
        return new c(this);
    }

    @Override // com.applovin.impl.AbstractC0702h
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.applovin.impl.AbstractC0702h
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public qp f() {
        return new a();
    }

    @Override // com.applovin.impl.AbstractC0702h, com.applovin.impl.pf
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public ya values() {
        return (ya) super.values();
    }

    @Override // com.applovin.impl.pf
    public boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.applovin.impl.pf
    public int size() {
        return this.f7270f;
    }

    @Override // com.applovin.impl.AbstractC0702h
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.applovin.impl.AbstractC0702h
    public boolean a(Object obj) {
        return obj != null && super.a(obj);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        Map f7273a = jh.a();
        Comparator b;

        /* renamed from: c, reason: collision with root package name */
        Comparator f7274c;

        public db a() {
            Collection entrySet = this.f7273a.entrySet();
            Comparator comparator = this.b;
            if (comparator != null) {
                entrySet = tg.a(comparator).b().a(entrySet);
            }
            return bb.a(entrySet, this.f7274c);
        }

        public Collection b() {
            return new ArrayList();
        }

        public b a(Object obj, Iterable iterable) {
            if (obj != null) {
                Collection collection = (Collection) this.f7273a.get(obj);
                if (collection != null) {
                    for (Object obj2 : iterable) {
                        n3.a(obj, obj2);
                        collection.add(obj2);
                    }
                    return this;
                }
                Iterator it = iterable.iterator();
                if (!it.hasNext()) {
                    return this;
                }
                Collection b = b();
                while (it.hasNext()) {
                    Object next = it.next();
                    n3.a(obj, next);
                    b.add(next);
                }
                this.f7273a.put(obj, b);
                return this;
            }
            throw new NullPointerException("null key in entry: null=" + rb.d(iterable));
        }

        public b a(Object obj, Object... objArr) {
            return a(obj, Arrays.asList(objArr));
        }
    }
}
