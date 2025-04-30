package com.bykv.vk.openvk.preload.a.b;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class h<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ boolean f13024f = true;

    /* renamed from: g, reason: collision with root package name */
    private static final Comparator<Comparable> f13025g = new Comparator<Comparable>() { // from class: com.bykv.vk.openvk.preload.a.b.h.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    Comparator<? super K> f13026a;
    d<K, V> b;

    /* renamed from: c, reason: collision with root package name */
    int f13027c;

    /* renamed from: d, reason: collision with root package name */
    int f13028d;

    /* renamed from: e, reason: collision with root package name */
    final d<K, V> f13029e;

    /* renamed from: h, reason: collision with root package name */
    private h<K, V>.a f13030h;

    /* renamed from: i, reason: collision with root package name */
    private h<K, V>.b f13031i;

    /* loaded from: classes.dex */
    public class a extends AbstractSet<Map.Entry<K, V>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if ((obj instanceof Map.Entry) && h.this.a((Map.Entry<?, ?>) obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new h<K, V>.c<Map.Entry<K, V>>() { // from class: com.bykv.vk.openvk.preload.a.b.h.a.1
                {
                    h hVar = h.this;
                }

                @Override // java.util.Iterator
                public final /* synthetic */ Object next() {
                    return a();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            d<K, V> a6;
            if (!(obj instanceof Map.Entry) || (a6 = h.this.a((Map.Entry<?, ?>) obj)) == null) {
                return false;
            }
            h.this.a((d) a6, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return h.this.f13027c;
        }
    }

    /* loaded from: classes.dex */
    public final class b extends AbstractSet<K> {
        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return h.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new h<K, V>.c<K>() { // from class: com.bykv.vk.openvk.preload.a.b.h.b.1
                {
                    h hVar = h.this;
                }

                @Override // java.util.Iterator
                public final K next() {
                    return a().f13043f;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (h.this.a(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return h.this.f13027c;
        }
    }

    /* loaded from: classes.dex */
    public abstract class c<T> implements Iterator<T> {
        d<K, V> b;

        /* renamed from: c, reason: collision with root package name */
        d<K, V> f13036c = null;

        /* renamed from: d, reason: collision with root package name */
        int f13037d;

        public c() {
            this.b = h.this.f13029e.f13041d;
            this.f13037d = h.this.f13028d;
        }

        public final d<K, V> a() {
            d<K, V> dVar = this.b;
            h hVar = h.this;
            if (dVar != hVar.f13029e) {
                if (hVar.f13028d == this.f13037d) {
                    this.b = dVar.f13041d;
                    this.f13036c = dVar;
                    return dVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.b != h.this.f13029e) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final void remove() {
            d<K, V> dVar = this.f13036c;
            if (dVar != null) {
                h.this.a((d) dVar, true);
                this.f13036c = null;
                this.f13037d = h.this.f13028d;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public h() {
        this(f13025g);
    }

    private d<K, V> a(K k6, boolean z8) {
        int i9;
        d<K, V> dVar;
        Comparator<? super K> comparator = this.f13026a;
        d<K, V> dVar2 = this.b;
        if (dVar2 != null) {
            Comparable comparable = comparator == f13025g ? (Comparable) k6 : null;
            while (true) {
                if (comparable != null) {
                    i9 = comparable.compareTo(dVar2.f13043f);
                } else {
                    i9 = comparator.compare(k6, dVar2.f13043f);
                }
                if (i9 != 0) {
                    d<K, V> dVar3 = i9 < 0 ? dVar2.b : dVar2.f13040c;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar2 = dVar3;
                } else {
                    return dVar2;
                }
            }
        } else {
            i9 = 0;
        }
        if (!z8) {
            return null;
        }
        d<K, V> dVar4 = this.f13029e;
        if (dVar2 == null) {
            if (comparator == f13025g && !(k6 instanceof Comparable)) {
                throw new ClassCastException(k6.getClass().getName().concat(" is not Comparable"));
            }
            dVar = new d<>(dVar2, k6, dVar4, dVar4.f13042e);
            this.b = dVar;
        } else {
            dVar = new d<>(dVar2, k6, dVar4, dVar4.f13042e);
            if (i9 < 0) {
                dVar2.b = dVar;
            } else {
                dVar2.f13040c = dVar;
            }
            b(dVar2, true);
        }
        this.f13027c++;
        this.f13028d++;
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d<K, V> b(Object obj) {
        if (obj != 0) {
            try {
                return a((h<K, V>) obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.b = null;
        this.f13027c = 0;
        this.f13028d++;
        d<K, V> dVar = this.f13029e;
        dVar.f13042e = dVar;
        dVar.f13041d = dVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (b(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        h<K, V>.a aVar = this.f13030h;
        if (aVar != null) {
            return aVar;
        }
        h<K, V>.a aVar2 = new a();
        this.f13030h = aVar2;
        return aVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        d<K, V> b8 = b(obj);
        if (b8 != null) {
            return b8.f13044g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        h<K, V>.b bVar = this.f13031i;
        if (bVar != null) {
            return bVar;
        }
        h<K, V>.b bVar2 = new b();
        this.f13031i = bVar2;
        return bVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k6, V v6) {
        if (k6 != null) {
            d<K, V> a6 = a((h<K, V>) k6, true);
            V v9 = a6.f13044g;
            a6.f13044g = v6;
            return v9;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        d<K, V> a6 = a(obj);
        if (a6 != null) {
            return a6.f13044g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f13027c;
    }

    private h(Comparator<? super K> comparator) {
        this.f13027c = 0;
        this.f13028d = 0;
        this.f13029e = new d<>();
        this.f13026a = comparator == null ? f13025g : comparator;
    }

    private void b(d<K, V> dVar, boolean z8) {
        while (dVar != null) {
            d<K, V> dVar2 = dVar.b;
            d<K, V> dVar3 = dVar.f13040c;
            int i9 = dVar2 != null ? dVar2.f13045h : 0;
            int i10 = dVar3 != null ? dVar3.f13045h : 0;
            int i11 = i9 - i10;
            if (i11 == -2) {
                d<K, V> dVar4 = dVar3.b;
                d<K, V> dVar5 = dVar3.f13040c;
                int i12 = (dVar4 != null ? dVar4.f13045h : 0) - (dVar5 != null ? dVar5.f13045h : 0);
                if (i12 != -1 && (i12 != 0 || z8)) {
                    if (!f13024f && i12 != 1) {
                        throw new AssertionError();
                    }
                    b((d) dVar3);
                    a((d) dVar);
                } else {
                    a((d) dVar);
                }
                if (z8) {
                    return;
                }
            } else if (i11 == 2) {
                d<K, V> dVar6 = dVar2.b;
                d<K, V> dVar7 = dVar2.f13040c;
                int i13 = (dVar6 != null ? dVar6.f13045h : 0) - (dVar7 != null ? dVar7.f13045h : 0);
                if (i13 != 1 && (i13 != 0 || z8)) {
                    if (!f13024f && i13 != -1) {
                        throw new AssertionError();
                    }
                    a((d) dVar2);
                    b((d) dVar);
                } else {
                    b((d) dVar);
                }
                if (z8) {
                    return;
                }
            } else if (i11 == 0) {
                dVar.f13045h = i9 + 1;
                if (z8) {
                    return;
                }
            } else {
                if (!f13024f && i11 != -1 && i11 != 1) {
                    throw new AssertionError();
                }
                dVar.f13045h = Math.max(i9, i10) + 1;
                if (!z8) {
                    return;
                }
            }
            dVar = dVar.f13039a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d<K, V> implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        d<K, V> f13039a;
        d<K, V> b;

        /* renamed from: c, reason: collision with root package name */
        d<K, V> f13040c;

        /* renamed from: d, reason: collision with root package name */
        d<K, V> f13041d;

        /* renamed from: e, reason: collision with root package name */
        d<K, V> f13042e;

        /* renamed from: f, reason: collision with root package name */
        final K f13043f;

        /* renamed from: g, reason: collision with root package name */
        V f13044g;

        /* renamed from: h, reason: collision with root package name */
        int f13045h;

        public d() {
            this.f13043f = null;
            this.f13042e = this;
            this.f13041d = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k6 = this.f13043f;
                if (k6 != null ? k6.equals(entry.getKey()) : entry.getKey() == null) {
                    V v6 = this.f13044g;
                    if (v6 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v6.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f13043f;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f13044g;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            int hashCode;
            K k6 = this.f13043f;
            int i9 = 0;
            if (k6 == null) {
                hashCode = 0;
            } else {
                hashCode = k6.hashCode();
            }
            V v6 = this.f13044g;
            if (v6 != null) {
                i9 = v6.hashCode();
            }
            return hashCode ^ i9;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v6) {
            V v9 = this.f13044g;
            this.f13044g = v6;
            return v9;
        }

        public final String toString() {
            return this.f13043f + "=" + this.f13044g;
        }

        public d(d<K, V> dVar, K k6, d<K, V> dVar2, d<K, V> dVar3) {
            this.f13039a = dVar;
            this.f13043f = k6;
            this.f13045h = 1;
            this.f13041d = dVar2;
            this.f13042e = dVar3;
            dVar3.f13041d = this;
            dVar2.f13042e = this;
        }
    }

    public final d<K, V> a(Map.Entry<?, ?> entry) {
        d<K, V> b8 = b(entry.getKey());
        if (b8 == null) {
            return null;
        }
        V v6 = b8.f13044g;
        Object value = entry.getValue();
        if (v6 == value || (v6 != null && v6.equals(value))) {
            return b8;
        }
        return null;
    }

    public final void a(d<K, V> dVar, boolean z8) {
        int i9;
        if (z8) {
            d<K, V> dVar2 = dVar.f13042e;
            dVar2.f13041d = dVar.f13041d;
            dVar.f13041d.f13042e = dVar2;
        }
        d<K, V> dVar3 = dVar.b;
        d<K, V> dVar4 = dVar.f13040c;
        d<K, V> dVar5 = dVar.f13039a;
        int i10 = 0;
        if (dVar3 != null && dVar4 != null) {
            if (dVar3.f13045h > dVar4.f13045h) {
                d<K, V> dVar6 = dVar3.f13040c;
                while (true) {
                    d<K, V> dVar7 = dVar6;
                    dVar4 = dVar3;
                    dVar3 = dVar7;
                    if (dVar3 == null) {
                        break;
                    } else {
                        dVar6 = dVar3.f13040c;
                    }
                }
            } else {
                while (true) {
                    d<K, V> dVar8 = dVar4.b;
                    if (dVar8 == null) {
                        break;
                    } else {
                        dVar4 = dVar8;
                    }
                }
            }
            a((d) dVar4, false);
            d<K, V> dVar9 = dVar.b;
            if (dVar9 != null) {
                i9 = dVar9.f13045h;
                dVar4.b = dVar9;
                dVar9.f13039a = dVar4;
                dVar.b = null;
            } else {
                i9 = 0;
            }
            d<K, V> dVar10 = dVar.f13040c;
            if (dVar10 != null) {
                i10 = dVar10.f13045h;
                dVar4.f13040c = dVar10;
                dVar10.f13039a = dVar4;
                dVar.f13040c = null;
            }
            dVar4.f13045h = Math.max(i9, i10) + 1;
            a(dVar, dVar4);
            return;
        }
        if (dVar3 != null) {
            a(dVar, dVar3);
            dVar.b = null;
        } else if (dVar4 != null) {
            a(dVar, dVar4);
            dVar.f13040c = null;
        } else {
            a(dVar, (d) null);
        }
        b(dVar5, false);
        this.f13027c--;
        this.f13028d++;
    }

    private void b(d<K, V> dVar) {
        d<K, V> dVar2 = dVar.b;
        d<K, V> dVar3 = dVar.f13040c;
        d<K, V> dVar4 = dVar2.b;
        d<K, V> dVar5 = dVar2.f13040c;
        dVar.b = dVar5;
        if (dVar5 != null) {
            dVar5.f13039a = dVar;
        }
        a(dVar, dVar2);
        dVar2.f13040c = dVar;
        dVar.f13039a = dVar2;
        int max = Math.max(dVar3 != null ? dVar3.f13045h : 0, dVar5 != null ? dVar5.f13045h : 0) + 1;
        dVar.f13045h = max;
        dVar2.f13045h = Math.max(max, dVar4 != null ? dVar4.f13045h : 0) + 1;
    }

    public final d<K, V> a(Object obj) {
        d<K, V> b8 = b(obj);
        if (b8 != null) {
            a((d) b8, true);
        }
        return b8;
    }

    private void a(d<K, V> dVar, d<K, V> dVar2) {
        d<K, V> dVar3 = dVar.f13039a;
        dVar.f13039a = null;
        if (dVar2 != null) {
            dVar2.f13039a = dVar3;
        }
        if (dVar3 != null) {
            if (dVar3.b == dVar) {
                dVar3.b = dVar2;
                return;
            } else {
                if (!f13024f && dVar3.f13040c != dVar) {
                    throw new AssertionError();
                }
                dVar3.f13040c = dVar2;
                return;
            }
        }
        this.b = dVar2;
    }

    private void a(d<K, V> dVar) {
        d<K, V> dVar2 = dVar.b;
        d<K, V> dVar3 = dVar.f13040c;
        d<K, V> dVar4 = dVar3.b;
        d<K, V> dVar5 = dVar3.f13040c;
        dVar.f13040c = dVar4;
        if (dVar4 != null) {
            dVar4.f13039a = dVar;
        }
        a(dVar, dVar3);
        dVar3.b = dVar;
        dVar.f13039a = dVar3;
        int max = Math.max(dVar2 != null ? dVar2.f13045h : 0, dVar4 != null ? dVar4.f13045h : 0) + 1;
        dVar.f13045h = max;
        dVar3.f13045h = Math.max(max, dVar5 != null ? dVar5.f13045h : 0) + 1;
    }
}
