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
    static final /* synthetic */ boolean f9866f = true;

    /* renamed from: g, reason: collision with root package name */
    private static final Comparator<Comparable> f9867g = new Comparator<Comparable>() { // from class: com.bykv.vk.openvk.preload.a.b.h.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    Comparator<? super K> a;

    /* renamed from: b, reason: collision with root package name */
    d<K, V> f9868b;

    /* renamed from: c, reason: collision with root package name */
    int f9869c;

    /* renamed from: d, reason: collision with root package name */
    int f9870d;

    /* renamed from: e, reason: collision with root package name */
    final d<K, V> f9871e;

    /* renamed from: h, reason: collision with root package name */
    private h<K, V>.a f9872h;

    /* renamed from: i, reason: collision with root package name */
    private h<K, V>.b f9873i;

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
            return (obj instanceof Map.Entry) && h.this.a((Map.Entry<?, ?>) obj) != null;
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
            d<K, V> a;
            if (!(obj instanceof Map.Entry) || (a = h.this.a((Map.Entry<?, ?>) obj)) == null) {
                return false;
            }
            h.this.a((d) a, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return h.this.f9869c;
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
                    return a().f9882f;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return h.this.a(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return h.this.f9869c;
        }
    }

    /* loaded from: classes.dex */
    public abstract class c<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        d<K, V> f9874b;

        /* renamed from: c, reason: collision with root package name */
        d<K, V> f9875c = null;

        /* renamed from: d, reason: collision with root package name */
        int f9876d;

        public c() {
            this.f9874b = h.this.f9871e.f9880d;
            this.f9876d = h.this.f9870d;
        }

        public final d<K, V> a() {
            d<K, V> dVar = this.f9874b;
            h hVar = h.this;
            if (dVar != hVar.f9871e) {
                if (hVar.f9870d == this.f9876d) {
                    this.f9874b = dVar.f9880d;
                    this.f9875c = dVar;
                    return dVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f9874b != h.this.f9871e;
        }

        @Override // java.util.Iterator
        public final void remove() {
            d<K, V> dVar = this.f9875c;
            if (dVar != null) {
                h.this.a((d) dVar, true);
                this.f9875c = null;
                this.f9876d = h.this.f9870d;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public h() {
        this(f9867g);
    }

    private d<K, V> a(K k10, boolean z10) {
        int i10;
        d<K, V> dVar;
        Comparator<? super K> comparator = this.a;
        d<K, V> dVar2 = this.f9868b;
        if (dVar2 != null) {
            Comparable comparable = comparator == f9867g ? (Comparable) k10 : null;
            while (true) {
                if (comparable != null) {
                    i10 = comparable.compareTo(dVar2.f9882f);
                } else {
                    i10 = comparator.compare(k10, dVar2.f9882f);
                }
                if (i10 != 0) {
                    d<K, V> dVar3 = i10 < 0 ? dVar2.f9878b : dVar2.f9879c;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar2 = dVar3;
                } else {
                    return dVar2;
                }
            }
        } else {
            i10 = 0;
        }
        if (!z10) {
            return null;
        }
        d<K, V> dVar4 = this.f9871e;
        if (dVar2 == null) {
            if (comparator == f9867g && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName().concat(" is not Comparable"));
            }
            dVar = new d<>(dVar2, k10, dVar4, dVar4.f9881e);
            this.f9868b = dVar;
        } else {
            dVar = new d<>(dVar2, k10, dVar4, dVar4.f9881e);
            if (i10 < 0) {
                dVar2.f9878b = dVar;
            } else {
                dVar2.f9879c = dVar;
            }
            b(dVar2, true);
        }
        this.f9869c++;
        this.f9870d++;
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
        this.f9868b = null;
        this.f9869c = 0;
        this.f9870d++;
        d<K, V> dVar = this.f9871e;
        dVar.f9881e = dVar;
        dVar.f9880d = dVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return b(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        h<K, V>.a aVar = this.f9872h;
        if (aVar != null) {
            return aVar;
        }
        h<K, V>.a aVar2 = new a();
        this.f9872h = aVar2;
        return aVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        d<K, V> b3 = b(obj);
        if (b3 != null) {
            return b3.f9883g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        h<K, V>.b bVar = this.f9873i;
        if (bVar != null) {
            return bVar;
        }
        h<K, V>.b bVar2 = new b();
        this.f9873i = bVar2;
        return bVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        if (k10 != null) {
            d<K, V> a10 = a((h<K, V>) k10, true);
            V v11 = a10.f9883g;
            a10.f9883g = v10;
            return v11;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        d<K, V> a10 = a(obj);
        if (a10 != null) {
            return a10.f9883g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f9869c;
    }

    private h(Comparator<? super K> comparator) {
        this.f9869c = 0;
        this.f9870d = 0;
        this.f9871e = new d<>();
        this.a = comparator == null ? f9867g : comparator;
    }

    private void b(d<K, V> dVar, boolean z10) {
        while (dVar != null) {
            d<K, V> dVar2 = dVar.f9878b;
            d<K, V> dVar3 = dVar.f9879c;
            int i10 = dVar2 != null ? dVar2.f9884h : 0;
            int i11 = dVar3 != null ? dVar3.f9884h : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                d<K, V> dVar4 = dVar3.f9878b;
                d<K, V> dVar5 = dVar3.f9879c;
                int i13 = (dVar4 != null ? dVar4.f9884h : 0) - (dVar5 != null ? dVar5.f9884h : 0);
                if (i13 != -1 && (i13 != 0 || z10)) {
                    if (!f9866f && i13 != 1) {
                        throw new AssertionError();
                    }
                    b((d) dVar3);
                    a((d) dVar);
                } else {
                    a((d) dVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                d<K, V> dVar6 = dVar2.f9878b;
                d<K, V> dVar7 = dVar2.f9879c;
                int i14 = (dVar6 != null ? dVar6.f9884h : 0) - (dVar7 != null ? dVar7.f9884h : 0);
                if (i14 != 1 && (i14 != 0 || z10)) {
                    if (!f9866f && i14 != -1) {
                        throw new AssertionError();
                    }
                    a((d) dVar2);
                    b((d) dVar);
                } else {
                    b((d) dVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                dVar.f9884h = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                if (!f9866f && i12 != -1 && i12 != 1) {
                    throw new AssertionError();
                }
                dVar.f9884h = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            dVar = dVar.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d<K, V> implements Map.Entry<K, V> {
        d<K, V> a;

        /* renamed from: b, reason: collision with root package name */
        d<K, V> f9878b;

        /* renamed from: c, reason: collision with root package name */
        d<K, V> f9879c;

        /* renamed from: d, reason: collision with root package name */
        d<K, V> f9880d;

        /* renamed from: e, reason: collision with root package name */
        d<K, V> f9881e;

        /* renamed from: f, reason: collision with root package name */
        final K f9882f;

        /* renamed from: g, reason: collision with root package name */
        V f9883g;

        /* renamed from: h, reason: collision with root package name */
        int f9884h;

        public d() {
            this.f9882f = null;
            this.f9881e = this;
            this.f9880d = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f9882f;
                if (k10 != null ? k10.equals(entry.getKey()) : entry.getKey() == null) {
                    V v10 = this.f9883g;
                    if (v10 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v10.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f9882f;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f9883g;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            int hashCode;
            K k10 = this.f9882f;
            int i10 = 0;
            if (k10 == null) {
                hashCode = 0;
            } else {
                hashCode = k10.hashCode();
            }
            V v10 = this.f9883g;
            if (v10 != null) {
                i10 = v10.hashCode();
            }
            return hashCode ^ i10;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            V v11 = this.f9883g;
            this.f9883g = v10;
            return v11;
        }

        public final String toString() {
            return this.f9882f + "=" + this.f9883g;
        }

        public d(d<K, V> dVar, K k10, d<K, V> dVar2, d<K, V> dVar3) {
            this.a = dVar;
            this.f9882f = k10;
            this.f9884h = 1;
            this.f9880d = dVar2;
            this.f9881e = dVar3;
            dVar3.f9880d = this;
            dVar2.f9881e = this;
        }
    }

    public final d<K, V> a(Map.Entry<?, ?> entry) {
        d<K, V> b3 = b(entry.getKey());
        boolean z10 = false;
        if (b3 != null) {
            V v10 = b3.f9883g;
            Object value = entry.getValue();
            if (v10 == value || (v10 != null && v10.equals(value))) {
                z10 = true;
            }
        }
        if (z10) {
            return b3;
        }
        return null;
    }

    public final void a(d<K, V> dVar, boolean z10) {
        int i10;
        if (z10) {
            d<K, V> dVar2 = dVar.f9881e;
            dVar2.f9880d = dVar.f9880d;
            dVar.f9880d.f9881e = dVar2;
        }
        d<K, V> dVar3 = dVar.f9878b;
        d<K, V> dVar4 = dVar.f9879c;
        d<K, V> dVar5 = dVar.a;
        int i11 = 0;
        if (dVar3 != null && dVar4 != null) {
            if (dVar3.f9884h > dVar4.f9884h) {
                d<K, V> dVar6 = dVar3.f9879c;
                while (true) {
                    d<K, V> dVar7 = dVar6;
                    dVar4 = dVar3;
                    dVar3 = dVar7;
                    if (dVar3 == null) {
                        break;
                    } else {
                        dVar6 = dVar3.f9879c;
                    }
                }
            } else {
                while (true) {
                    d<K, V> dVar8 = dVar4.f9878b;
                    if (dVar8 == null) {
                        break;
                    } else {
                        dVar4 = dVar8;
                    }
                }
            }
            a((d) dVar4, false);
            d<K, V> dVar9 = dVar.f9878b;
            if (dVar9 != null) {
                i10 = dVar9.f9884h;
                dVar4.f9878b = dVar9;
                dVar9.a = dVar4;
                dVar.f9878b = null;
            } else {
                i10 = 0;
            }
            d<K, V> dVar10 = dVar.f9879c;
            if (dVar10 != null) {
                i11 = dVar10.f9884h;
                dVar4.f9879c = dVar10;
                dVar10.a = dVar4;
                dVar.f9879c = null;
            }
            dVar4.f9884h = Math.max(i10, i11) + 1;
            a(dVar, dVar4);
            return;
        }
        if (dVar3 != null) {
            a(dVar, dVar3);
            dVar.f9878b = null;
        } else if (dVar4 != null) {
            a(dVar, dVar4);
            dVar.f9879c = null;
        } else {
            a(dVar, (d) null);
        }
        b(dVar5, false);
        this.f9869c--;
        this.f9870d++;
    }

    private void b(d<K, V> dVar) {
        d<K, V> dVar2 = dVar.f9878b;
        d<K, V> dVar3 = dVar.f9879c;
        d<K, V> dVar4 = dVar2.f9878b;
        d<K, V> dVar5 = dVar2.f9879c;
        dVar.f9878b = dVar5;
        if (dVar5 != null) {
            dVar5.a = dVar;
        }
        a(dVar, dVar2);
        dVar2.f9879c = dVar;
        dVar.a = dVar2;
        int max = Math.max(dVar3 != null ? dVar3.f9884h : 0, dVar5 != null ? dVar5.f9884h : 0) + 1;
        dVar.f9884h = max;
        dVar2.f9884h = Math.max(max, dVar4 != null ? dVar4.f9884h : 0) + 1;
    }

    public final d<K, V> a(Object obj) {
        d<K, V> b3 = b(obj);
        if (b3 != null) {
            a((d) b3, true);
        }
        return b3;
    }

    private void a(d<K, V> dVar, d<K, V> dVar2) {
        d<K, V> dVar3 = dVar.a;
        dVar.a = null;
        if (dVar2 != null) {
            dVar2.a = dVar3;
        }
        if (dVar3 != null) {
            if (dVar3.f9878b == dVar) {
                dVar3.f9878b = dVar2;
                return;
            } else {
                if (!f9866f && dVar3.f9879c != dVar) {
                    throw new AssertionError();
                }
                dVar3.f9879c = dVar2;
                return;
            }
        }
        this.f9868b = dVar2;
    }

    private void a(d<K, V> dVar) {
        d<K, V> dVar2 = dVar.f9878b;
        d<K, V> dVar3 = dVar.f9879c;
        d<K, V> dVar4 = dVar3.f9878b;
        d<K, V> dVar5 = dVar3.f9879c;
        dVar.f9879c = dVar4;
        if (dVar4 != null) {
            dVar4.a = dVar;
        }
        a(dVar, dVar3);
        dVar3.f9878b = dVar;
        dVar.a = dVar3;
        int max = Math.max(dVar2 != null ? dVar2.f9884h : 0, dVar4 != null ? dVar4.f9884h : 0) + 1;
        dVar.f9884h = max;
        dVar3.f9884h = Math.max(max, dVar5 != null ? dVar5.f9884h : 0) + 1;
    }
}
