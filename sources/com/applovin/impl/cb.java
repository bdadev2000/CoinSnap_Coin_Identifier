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
    static final Map.Entry[] f7063d = new Map.Entry[0];

    /* renamed from: a, reason: collision with root package name */
    private transient eb f7064a;
    private transient eb b;

    /* renamed from: c, reason: collision with root package name */
    private transient ya f7065c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        Comparator f7066a;
        Object[] b;

        /* renamed from: c, reason: collision with root package name */
        int f7067c;

        /* renamed from: d, reason: collision with root package name */
        boolean f7068d;

        public a() {
            this(4);
        }

        public cb a() {
            b();
            this.f7068d = true;
            return ji.a(this.f7067c, this.b);
        }

        public void b() {
            int i9;
            if (this.f7066a != null) {
                if (this.f7068d) {
                    this.b = Arrays.copyOf(this.b, this.f7067c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f7067c];
                int i10 = 0;
                while (true) {
                    i9 = this.f7067c;
                    if (i10 >= i9) {
                        break;
                    }
                    Object[] objArr = this.b;
                    int i11 = i10 * 2;
                    entryArr[i10] = new AbstractMap.SimpleImmutableEntry(objArr[i11], objArr[i11 + 1]);
                    i10++;
                }
                Arrays.sort(entryArr, 0, i9, tg.a(this.f7066a).a(qc.c()));
                for (int i12 = 0; i12 < this.f7067c; i12++) {
                    int i13 = i12 * 2;
                    this.b[i13] = entryArr[i12].getKey();
                    this.b[i13 + 1] = entryArr[i12].getValue();
                }
            }
        }

        public a(int i9) {
            this.b = new Object[i9 * 2];
            this.f7067c = 0;
            this.f7068d = false;
        }

        private void a(int i9) {
            int i10 = i9 * 2;
            Object[] objArr = this.b;
            if (i10 > objArr.length) {
                this.b = Arrays.copyOf(objArr, ya.b.a(objArr.length, i10));
                this.f7068d = false;
            }
        }

        public a a(Object obj, Object obj2) {
            a(this.f7067c + 1);
            n3.a(obj, obj2);
            Object[] objArr = this.b;
            int i9 = this.f7067c;
            int i10 = i9 * 2;
            objArr[i10] = obj;
            objArr[i10 + 1] = obj2;
            this.f7067c = i9 + 1;
            return this;
        }

        public a a(Map.Entry entry) {
            return a(entry.getKey(), entry.getValue());
        }

        public a a(Iterable iterable) {
            if (iterable instanceof Collection) {
                a(((Collection) iterable).size() + this.f7067c);
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
        return ji.f8465i;
    }

    public abstract eb b();

    public abstract eb c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract ya d();

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public eb entrySet() {
        eb ebVar = this.f7064a;
        if (ebVar == null) {
            eb b = b();
            this.f7064a = b;
            return b;
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
        eb ebVar = this.b;
        if (ebVar == null) {
            eb c9 = c();
            this.b = c9;
            return c9;
        }
        return ebVar;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public int hashCode() {
        return nj.a(entrySet());
    }

    @Override // java.util.Map
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public ya values() {
        ya yaVar = this.f7065c;
        if (yaVar == null) {
            ya d2 = d();
            this.f7065c = d2;
            return d2;
        }
        return yaVar;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
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
