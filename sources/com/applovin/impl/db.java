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
public abstract class db extends a2 implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    final transient cb f4285d;

    /* renamed from: f, reason: collision with root package name */
    final transient int f4286f;

    /* loaded from: classes.dex */
    public class a extends qp {
        Iterator a;

        /* renamed from: b, reason: collision with root package name */
        Iterator f4287b = sb.a();

        public a() {
            this.a = db.this.f4285d.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4287b.hasNext() || this.a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f4287b.hasNext()) {
                this.f4287b = ((ya) this.a.next()).iterator();
            }
            return this.f4287b.next();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends ya {

        /* renamed from: b, reason: collision with root package name */
        private final transient db f4291b;

        public c(db dbVar) {
            this.f4291b = dbVar;
        }

        @Override // com.applovin.impl.ya
        public int a(Object[] objArr, int i10) {
            qp it = this.f4291b.f4285d.values().iterator();
            while (it.hasNext()) {
                i10 = ((ya) it.next()).a(objArr, i10);
            }
            return i10;
        }

        @Override // com.applovin.impl.ya, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.f4291b.a(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public qp iterator() {
            return this.f4291b.f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f4291b.size();
        }
    }

    public db(cb cbVar, int i10) {
        this.f4285d = cbVar;
        this.f4286f = i10;
    }

    @Override // com.applovin.impl.h
    public Map b() {
        throw new AssertionError("should never be called");
    }

    @Override // com.applovin.impl.h
    public Set c() {
        throw new AssertionError("unreachable");
    }

    @Override // com.applovin.impl.pf
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.applovin.impl.h
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.applovin.impl.h, com.applovin.impl.pf
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public cb a() {
        return this.f4285d;
    }

    @Override // com.applovin.impl.h
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public ya d() {
        return new c(this);
    }

    @Override // com.applovin.impl.h
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.applovin.impl.h
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public qp f() {
        return new a();
    }

    @Override // com.applovin.impl.h, com.applovin.impl.pf
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
        return this.f4286f;
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
        Map a = jh.a();

        /* renamed from: b, reason: collision with root package name */
        Comparator f4289b;

        /* renamed from: c, reason: collision with root package name */
        Comparator f4290c;

        public db a() {
            Collection entrySet = this.a.entrySet();
            Comparator comparator = this.f4289b;
            if (comparator != null) {
                entrySet = tg.a(comparator).b().a(entrySet);
            }
            return bb.a(entrySet, this.f4290c);
        }

        public Collection b() {
            return new ArrayList();
        }

        public b a(Object obj, Iterable iterable) {
            if (obj != null) {
                Collection collection = (Collection) this.a.get(obj);
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
                Collection b3 = b();
                while (it.hasNext()) {
                    Object next = it.next();
                    n3.a(obj, next);
                    b3.add(next);
                }
                this.a.put(obj, b3);
                return this;
            }
            throw new NullPointerException("null key in entry: null=" + rb.d(iterable));
        }

        public b a(Object obj, Object... objArr) {
            return a(obj, Arrays.asList(objArr));
        }
    }
}
