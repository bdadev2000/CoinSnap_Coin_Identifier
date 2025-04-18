package com.applovin.impl;

import com.applovin.impl.cb;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;

/* loaded from: classes2.dex */
public abstract class gb implements Map, Serializable {
    static final Map.Entry[] d = new Map.Entry[0];

    /* renamed from: a, reason: collision with root package name */
    private transient ib f24079a;

    /* renamed from: b, reason: collision with root package name */
    private transient ib f24080b;

    /* renamed from: c, reason: collision with root package name */
    private transient cb f24081c;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        Comparator f24082a;

        /* renamed from: b, reason: collision with root package name */
        Object[] f24083b;

        /* renamed from: c, reason: collision with root package name */
        int f24084c;
        boolean d;

        public a() {
            this(4);
        }

        public gb a() {
            b();
            this.d = true;
            return ni.a(this.f24084c, this.f24083b);
        }

        public void b() {
            int i2;
            if (this.f24082a != null) {
                if (this.d) {
                    this.f24083b = Arrays.copyOf(this.f24083b, this.f24084c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f24084c];
                int i3 = 0;
                while (true) {
                    i2 = this.f24084c;
                    if (i3 >= i2) {
                        break;
                    }
                    Object[] objArr = this.f24083b;
                    int i4 = i3 * 2;
                    entryArr[i3] = new AbstractMap.SimpleImmutableEntry(objArr[i4], objArr[i4 + 1]);
                    i3++;
                }
                Arrays.sort(entryArr, 0, i2, wg.a(this.f24082a).a(vc.c()));
                for (int i5 = 0; i5 < this.f24084c; i5++) {
                    int i6 = i5 * 2;
                    this.f24083b[i6] = entryArr[i5].getKey();
                    this.f24083b[i6 + 1] = entryArr[i5].getValue();
                }
            }
        }

        public a(int i2) {
            this.f24083b = new Object[i2 * 2];
            this.f24084c = 0;
            this.d = false;
        }

        private void a(int i2) {
            int i3 = i2 * 2;
            Object[] objArr = this.f24083b;
            if (i3 > objArr.length) {
                this.f24083b = Arrays.copyOf(objArr, cb.b.a(objArr.length, i3));
                this.d = false;
            }
        }

        public a a(Object obj, Object obj2) {
            a(this.f24084c + 1);
            p3.a(obj, obj2);
            Object[] objArr = this.f24083b;
            int i2 = this.f24084c;
            int i3 = i2 * 2;
            objArr[i3] = obj;
            objArr[i3 + 1] = obj2;
            this.f24084c = i2 + 1;
            return this;
        }

        public a a(Map.Entry entry) {
            return a(entry.getKey(), entry.getValue());
        }

        public a a(Iterable iterable) {
            if (iterable instanceof Collection) {
                a(((Collection) iterable).size() + this.f24084c);
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a((Map.Entry) it.next());
            }
            return this;
        }
    }

    public static gb a(Iterable iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.a(iterable);
        return aVar.a();
    }

    public static gb h() {
        return ni.f25712i;
    }

    public abstract ib b();

    public abstract ib c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract cb d();

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public ib entrySet() {
        ib ibVar = this.f24079a;
        if (ibVar != null) {
            return ibVar;
        }
        ib b2 = b();
        this.f24079a = b2;
        return b2;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return vc.a((Map) this, obj);
    }

    public abstract boolean f();

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public ib keySet() {
        ib ibVar = this.f24080b;
        if (ibVar != null) {
            return ibVar;
        }
        ib c2 = c();
        this.f24080b = c2;
        return c2;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public int hashCode() {
        return rj.a(entrySet());
    }

    @Override // java.util.Map
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public cb values() {
        cb cbVar = this.f24081c;
        if (cbVar != null) {
            return cbVar;
        }
        cb d2 = d();
        this.f24081c = d2;
        return d2;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return vc.a(this);
    }

    public static gb a(Map map) {
        if ((map instanceof gb) && !(map instanceof SortedMap)) {
            gb gbVar = (gb) map;
            if (!gbVar.f()) {
                return gbVar;
            }
        }
        return a(map.entrySet());
    }

    public static a a() {
        return new a();
    }
}
