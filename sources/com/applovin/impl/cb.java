package com.applovin.impl;

import com.applovin.impl.ya;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;

/* loaded from: classes.dex */
public abstract class cb implements Map, Serializable {

    /* renamed from: d, reason: collision with root package name */
    static final Map.Entry[] f4080d = new Map.Entry[0];
    private transient eb a;

    /* renamed from: b, reason: collision with root package name */
    private transient eb f4081b;

    /* renamed from: c, reason: collision with root package name */
    private transient ya f4082c;

    /* loaded from: classes.dex */
    public static class a {
        Comparator a;

        /* renamed from: b, reason: collision with root package name */
        Object[] f4083b;

        /* renamed from: c, reason: collision with root package name */
        int f4084c;

        /* renamed from: d, reason: collision with root package name */
        boolean f4085d;

        public a() {
            this(4);
        }

        public cb a() {
            b();
            this.f4085d = true;
            return ji.a(this.f4084c, this.f4083b);
        }

        public void b() {
            int i10;
            if (this.a != null) {
                if (this.f4085d) {
                    this.f4083b = Arrays.copyOf(this.f4083b, this.f4084c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f4084c];
                int i11 = 0;
                while (true) {
                    i10 = this.f4084c;
                    if (i11 >= i10) {
                        break;
                    }
                    Object[] objArr = this.f4083b;
                    int i12 = i11 * 2;
                    entryArr[i11] = new AbstractMap.SimpleImmutableEntry(objArr[i12], objArr[i12 + 1]);
                    i11++;
                }
                Arrays.sort(entryArr, 0, i10, tg.a(this.a).a(qc.c()));
                for (int i13 = 0; i13 < this.f4084c; i13++) {
                    int i14 = i13 * 2;
                    this.f4083b[i14] = entryArr[i13].getKey();
                    this.f4083b[i14 + 1] = entryArr[i13].getValue();
                }
            }
        }

        public a(int i10) {
            this.f4083b = new Object[i10 * 2];
            this.f4084c = 0;
            this.f4085d = false;
        }

        private void a(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f4083b;
            if (i11 > objArr.length) {
                this.f4083b = Arrays.copyOf(objArr, ya.b.a(objArr.length, i11));
                this.f4085d = false;
            }
        }

        public a a(Object obj, Object obj2) {
            a(this.f4084c + 1);
            n3.a(obj, obj2);
            Object[] objArr = this.f4083b;
            int i10 = this.f4084c;
            int i11 = i10 * 2;
            objArr[i11] = obj;
            objArr[i11 + 1] = obj2;
            this.f4084c = i10 + 1;
            return this;
        }

        public a a(Map.Entry entry) {
            return a(entry.getKey(), entry.getValue());
        }

        public a a(Iterable iterable) {
            if (iterable instanceof Collection) {
                a(((Collection) iterable).size() + this.f4084c);
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a((Map.Entry) it.next());
            }
            return this;
        }
    }

    public static cb a(Iterable iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.a(iterable);
        return aVar.a();
    }

    public static cb h() {
        return ji.f5507i;
    }

    public abstract eb b();

    public abstract eb c();

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

    public abstract ya d();

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public eb entrySet() {
        eb ebVar = this.a;
        if (ebVar == null) {
            eb b3 = b();
            this.a = b3;
            return b3;
        }
        return ebVar;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return qc.a((Map) this, obj);
    }

    public abstract boolean f();

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public eb keySet() {
        eb ebVar = this.f4081b;
        if (ebVar == null) {
            eb c10 = c();
            this.f4081b = c10;
            return c10;
        }
        return ebVar;
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
        return nj.a(entrySet());
    }

    @Override // java.util.Map
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public ya values() {
        ya yaVar = this.f4082c;
        if (yaVar == null) {
            ya d10 = d();
            this.f4082c = d10;
            return d10;
        }
        return yaVar;
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
        return qc.a(this);
    }

    public static cb a(Map map) {
        if ((map instanceof cb) && !(map instanceof SortedMap)) {
            cb cbVar = (cb) map;
            if (!cbVar.f()) {
                return cbVar;
            }
        }
        return a(map.entrySet());
    }

    public static a a() {
        return new a();
    }
}
