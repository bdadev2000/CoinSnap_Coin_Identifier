package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.impl.h;
import com.applovin.impl.qc;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class f extends com.applovin.impl.h implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    private transient Map f4536d;

    /* renamed from: f, reason: collision with root package name */
    private transient int f4537f;

    /* loaded from: classes.dex */
    public class a extends c {
        public a() {
            super();
        }

        @Override // com.applovin.impl.f.c
        public Object a(Object obj, Object obj2) {
            return obj2;
        }
    }

    /* loaded from: classes.dex */
    public class b extends qc.f {

        /* renamed from: c, reason: collision with root package name */
        final transient Map f4539c;

        /* loaded from: classes.dex */
        public class a extends qc.c {
            public a() {
            }

            @Override // com.applovin.impl.qc.c
            public Map a() {
                return b.this;
            }

            @Override // com.applovin.impl.qc.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return o3.a(b.this.f4539c.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return new C0015b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (contains(obj)) {
                    f.this.c(((Map.Entry) obj).getKey());
                    return true;
                }
                return false;
            }
        }

        /* renamed from: com.applovin.impl.f$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0015b implements Iterator {
            final Iterator a;

            /* renamed from: b, reason: collision with root package name */
            Collection f4541b;

            public C0015b() {
                this.a = b.this.f4539c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                Map.Entry entry = (Map.Entry) this.a.next();
                this.f4541b = (Collection) entry.getValue();
                return b.this.a(entry);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                boolean z10;
                if (this.f4541b != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n3.a(z10);
                this.a.remove();
                f.b(f.this, this.f4541b.size());
                this.f4541b.clear();
                this.f4541b = null;
            }
        }

        public b(Map map) {
            this.f4539c = map;
        }

        public Map.Entry a(Map.Entry entry) {
            Object key = entry.getKey();
            return qc.a(key, f.this.a(key, (Collection) entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f4539c == f.this.f4536d) {
                f.this.clear();
            } else {
                sb.a((Iterator) new C0015b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return qc.b(this.f4539c, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f4539c.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f4539c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set keySet() {
            return f.this.e();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f4539c.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f4539c.toString();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection get(Object obj) {
            Collection collection = (Collection) qc.c(this.f4539c, obj);
            if (collection == null) {
                return null;
            }
            return f.this.a(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection remove(Object obj) {
            Collection collection = (Collection) this.f4539c.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection g10 = f.this.g();
            g10.addAll(collection);
            f.b(f.this, collection.size());
            collection.clear();
            return g10;
        }

        @Override // com.applovin.impl.qc.f
        public Set a() {
            return new a();
        }
    }

    /* loaded from: classes.dex */
    public abstract class c implements Iterator {
        final Iterator a;

        /* renamed from: b, reason: collision with root package name */
        Object f4543b = null;

        /* renamed from: c, reason: collision with root package name */
        Collection f4544c = null;

        /* renamed from: d, reason: collision with root package name */
        Iterator f4545d = sb.c();

        public c() {
            this.a = f.this.f4536d.entrySet().iterator();
        }

        public abstract Object a(Object obj, Object obj2);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext() || this.f4545d.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f4545d.hasNext()) {
                Map.Entry entry = (Map.Entry) this.a.next();
                this.f4543b = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.f4544c = collection;
                this.f4545d = collection.iterator();
            }
            return a(this.f4543b, this.f4545d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f4545d.remove();
            if (this.f4544c.isEmpty()) {
                this.a.remove();
            }
            f.c(f.this);
        }
    }

    /* loaded from: classes.dex */
    public class d extends qc.d {

        /* loaded from: classes.dex */
        public class a implements Iterator {
            Map.Entry a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Iterator f4548b;

            public a(Iterator it) {
                this.f4548b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f4548b.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Map.Entry entry = (Map.Entry) this.f4548b.next();
                this.a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                boolean z10;
                if (this.a != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n3.a(z10);
                Collection collection = (Collection) this.a.getValue();
                this.f4548b.remove();
                f.b(f.this, collection.size());
                collection.clear();
                this.a = null;
            }
        }

        public d(Map map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            sb.a(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return a().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || a().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return a().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a(a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Collection collection = (Collection) a().remove(obj);
            if (collection != null) {
                int size = collection.size();
                collection.clear();
                f.b(f.this, size);
                if (size > 0) {
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class e extends h implements NavigableMap {
        public e(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // com.applovin.impl.f.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavigableMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // com.applovin.impl.f.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public NavigableMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public Map.Entry ceilingEntry(Object obj) {
            Map.Entry ceilingEntry = d().ceilingEntry(obj);
            if (ceilingEntry == null) {
                return null;
            }
            return a(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public Object ceilingKey(Object obj) {
            return d().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap descendingMap() {
            return new e(d().descendingMap());
        }

        @Override // com.applovin.impl.f.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public NavigableSet c() {
            return new C0016f(d());
        }

        @Override // com.applovin.impl.f.h
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap d() {
            return (NavigableMap) super.d();
        }

        @Override // java.util.NavigableMap
        public Map.Entry firstEntry() {
            Map.Entry firstEntry = d().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return a(firstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry floorEntry(Object obj) {
            Map.Entry floorEntry = d().floorEntry(obj);
            if (floorEntry == null) {
                return null;
            }
            return a(floorEntry);
        }

        @Override // java.util.NavigableMap
        public Object floorKey(Object obj) {
            return d().floorKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry higherEntry(Object obj) {
            Map.Entry higherEntry = d().higherEntry(obj);
            if (higherEntry == null) {
                return null;
            }
            return a(higherEntry);
        }

        @Override // java.util.NavigableMap
        public Object higherKey(Object obj) {
            return d().higherKey(obj);
        }

        @Override // com.applovin.impl.f.h, com.applovin.impl.f.b, java.util.AbstractMap, java.util.Map
        public NavigableSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry lastEntry() {
            Map.Entry lastEntry = d().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return a(lastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry lowerEntry(Object obj) {
            Map.Entry lowerEntry = d().lowerEntry(obj);
            if (lowerEntry == null) {
                return null;
            }
            return a(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public Object lowerKey(Object obj) {
            return d().lowerKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet navigableKeySet() {
            return keySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollFirstEntry() {
            return a(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollLastEntry() {
            return a(descendingMap().entrySet().iterator());
        }

        public Map.Entry a(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Collection g10 = f.this.g();
            g10.addAll((Collection) entry.getValue());
            it.remove();
            return qc.a(entry.getKey(), f.this.c(g10));
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Object obj, boolean z10) {
            return new e(d().headMap(obj, z10));
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Object obj, boolean z10, Object obj2, boolean z11) {
            return new e(d().subMap(obj, z10, obj2, z11));
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Object obj, boolean z10) {
            return new e(d().tailMap(obj, z10));
        }

        @Override // com.applovin.impl.f.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavigableMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }
    }

    /* renamed from: com.applovin.impl.f$f, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0016f extends i implements NavigableSet {
        public C0016f(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // com.applovin.impl.f.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavigableSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // com.applovin.impl.f.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public NavigableMap b() {
            return (NavigableMap) super.b();
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return b().ceilingKey(obj);
        }

        @Override // java.util.NavigableSet
        public Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet descendingSet() {
            return new C0016f(b().descendingMap());
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return b().floorKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return b().higherKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return b().lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return sb.c(iterator());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return sb.c(descendingIterator());
        }

        @Override // com.applovin.impl.f.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavigableSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.applovin.impl.f.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public NavigableSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z10) {
            return new C0016f(b().headMap(obj, z10));
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
            return new C0016f(b().subMap(obj, z10, obj2, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z10) {
            return new C0016f(b().tailMap(obj, z10));
        }
    }

    /* loaded from: classes.dex */
    public class g extends k implements RandomAccess {
        public g(Object obj, List list, j jVar) {
            super(obj, list, jVar);
        }
    }

    /* loaded from: classes.dex */
    public class h extends b implements SortedMap {

        /* renamed from: f, reason: collision with root package name */
        SortedSet f4553f;

        public h(SortedMap sortedMap) {
            super(sortedMap);
        }

        public SortedSet c() {
            return new i(d());
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return d().comparator();
        }

        public SortedMap d() {
            return (SortedMap) this.f4539c;
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return d().firstKey();
        }

        public SortedMap headMap(Object obj) {
            return new h(d().headMap(obj));
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return d().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return new h(d().subMap(obj, obj2));
        }

        public SortedMap tailMap(Object obj) {
            return new h(d().tailMap(obj));
        }

        @Override // com.applovin.impl.f.b, java.util.AbstractMap, java.util.Map
        public SortedSet keySet() {
            SortedSet sortedSet = this.f4553f;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet c10 = c();
            this.f4553f = c10;
            return c10;
        }
    }

    /* loaded from: classes.dex */
    public class i extends d implements SortedSet {
        public i(SortedMap sortedMap) {
            super(sortedMap);
        }

        public SortedMap b() {
            return (SortedMap) super.a();
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return b().firstKey();
        }

        public SortedSet headSet(Object obj) {
            return new i(b().headMap(obj));
        }

        @Override // java.util.SortedSet
        public Object last() {
            return b().lastKey();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return new i(b().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return new i(b().tailMap(obj));
        }
    }

    public f(Map map) {
        Preconditions.checkArgument(map.isEmpty());
        this.f4536d = map;
    }

    public static /* synthetic */ int b(f fVar) {
        int i10 = fVar.f4537f;
        fVar.f4537f = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int c(f fVar) {
        int i10 = fVar.f4537f;
        fVar.f4537f = i10 - 1;
        return i10;
    }

    public abstract Collection a(Object obj, Collection collection);

    public abstract Collection c(Collection collection);

    @Override // com.applovin.impl.pf
    public void clear() {
        Iterator it = this.f4536d.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f4536d.clear();
        this.f4537f = 0;
    }

    @Override // com.applovin.impl.h
    public Collection d() {
        return new h.a();
    }

    @Override // com.applovin.impl.h
    public Iterator f() {
        return new a();
    }

    public abstract Collection g();

    public final Map h() {
        Map map = this.f4536d;
        if (map instanceof NavigableMap) {
            return new e((NavigableMap) this.f4536d);
        }
        if (map instanceof SortedMap) {
            return new h((SortedMap) this.f4536d);
        }
        return new b(this.f4536d);
    }

    public final Set i() {
        Map map = this.f4536d;
        if (map instanceof NavigableMap) {
            return new C0016f((NavigableMap) this.f4536d);
        }
        if (map instanceof SortedMap) {
            return new i((SortedMap) this.f4536d);
        }
        return new d(this.f4536d);
    }

    @Override // com.applovin.impl.pf
    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.f4536d.get(obj);
        if (collection == null) {
            Collection b3 = b(obj);
            if (b3.add(obj2)) {
                this.f4537f++;
                this.f4536d.put(obj, b3);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (collection.add(obj2)) {
            this.f4537f++;
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.pf
    public int size() {
        return this.f4537f;
    }

    @Override // com.applovin.impl.h, com.applovin.impl.pf
    public Collection values() {
        return super.values();
    }

    /* loaded from: classes.dex */
    public class j extends AbstractCollection {
        final Object a;

        /* renamed from: b, reason: collision with root package name */
        Collection f4556b;

        /* renamed from: c, reason: collision with root package name */
        final j f4557c;

        /* renamed from: d, reason: collision with root package name */
        final Collection f4558d;

        public j(Object obj, Collection collection, j jVar) {
            Collection c10;
            this.a = obj;
            this.f4556b = collection;
            this.f4557c = jVar;
            if (jVar == null) {
                c10 = null;
            } else {
                c10 = jVar.c();
            }
            this.f4558d = c10;
        }

        void a() {
            j jVar = this.f4557c;
            if (jVar != null) {
                jVar.a();
            } else {
                f.this.f4536d.put(this.a, this.f4556b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            e();
            boolean isEmpty = this.f4556b.isEmpty();
            boolean add = this.f4556b.add(obj);
            if (add) {
                f.b(f.this);
                if (isEmpty) {
                    a();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f4556b.addAll(collection);
            if (addAll) {
                f.a(f.this, this.f4556b.size() - size);
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        public j b() {
            return this.f4557c;
        }

        public Collection c() {
            return this.f4556b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f4556b.clear();
            f.b(f.this, size);
            f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            e();
            return this.f4556b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            e();
            return this.f4556b.containsAll(collection);
        }

        public Object d() {
            return this.a;
        }

        void e() {
            Collection collection;
            j jVar = this.f4557c;
            if (jVar != null) {
                jVar.e();
                if (this.f4557c.c() != this.f4558d) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f4556b.isEmpty() && (collection = (Collection) f.this.f4536d.get(this.a)) != null) {
                this.f4556b = collection;
            }
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            e();
            return this.f4556b.equals(obj);
        }

        void f() {
            j jVar = this.f4557c;
            if (jVar != null) {
                jVar.f();
            } else if (this.f4556b.isEmpty()) {
                f.this.f4536d.remove(this.a);
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            e();
            return this.f4556b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            e();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            e();
            boolean remove = this.f4556b.remove(obj);
            if (remove) {
                f.c(f.this);
                f();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f4556b.removeAll(collection);
            if (removeAll) {
                f.a(f.this, this.f4556b.size() - size);
                f();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            Preconditions.checkNotNull(collection);
            int size = size();
            boolean retainAll = this.f4556b.retainAll(collection);
            if (retainAll) {
                f.a(f.this, this.f4556b.size() - size);
                f();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            e();
            return this.f4556b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            e();
            return this.f4556b.toString();
        }

        /* loaded from: classes.dex */
        public class a implements Iterator {
            final Iterator a;

            /* renamed from: b, reason: collision with root package name */
            final Collection f4560b;

            public a() {
                Collection collection = j.this.f4556b;
                this.f4560b = collection;
                this.a = f.b(collection);
            }

            public Iterator a() {
                b();
                return this.a;
            }

            void b() {
                j.this.e();
                if (j.this.f4556b == this.f4560b) {
                } else {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.a.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                b();
                return this.a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.a.remove();
                f.c(f.this);
                j.this.f();
            }

            public a(Iterator it) {
                this.f4560b = j.this.f4556b;
                this.a = it;
            }
        }
    }

    /* loaded from: classes.dex */
    public class k extends j implements List {

        /* loaded from: classes.dex */
        public class a extends j.a implements ListIterator {
            public a() {
                super();
            }

            private ListIterator c() {
                return (ListIterator) a();
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                boolean isEmpty = k.this.isEmpty();
                c().add(obj);
                f.b(f.this);
                if (isEmpty) {
                    k.this.a();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return c().nextIndex();
            }

            @Override // java.util.ListIterator
            public Object previous() {
                return c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                c().set(obj);
            }

            public a(int i10) {
                super(k.this.g().listIterator(i10));
            }
        }

        public k(Object obj, List list, j jVar) {
            super(obj, list, jVar);
        }

        @Override // java.util.List
        public void add(int i10, Object obj) {
            e();
            boolean isEmpty = c().isEmpty();
            g().add(i10, obj);
            f.b(f.this);
            if (isEmpty) {
                a();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = g().addAll(i10, collection);
            if (addAll) {
                f.a(f.this, c().size() - size);
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        public List g() {
            return (List) c();
        }

        @Override // java.util.List
        public Object get(int i10) {
            e();
            return g().get(i10);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            e();
            return g().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            e();
            return g().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            e();
            return new a();
        }

        @Override // java.util.List
        public Object remove(int i10) {
            e();
            Object remove = g().remove(i10);
            f.c(f.this);
            f();
            return remove;
        }

        @Override // java.util.List
        public Object set(int i10, Object obj) {
            e();
            return g().set(i10, obj);
        }

        @Override // java.util.List
        public List subList(int i10, int i11) {
            j b3;
            e();
            f fVar = f.this;
            Object d10 = d();
            List subList = g().subList(i10, i11);
            if (b() == null) {
                b3 = this;
            } else {
                b3 = b();
            }
            return fVar.a(d10, subList, b3);
        }

        @Override // java.util.List
        public ListIterator listIterator(int i10) {
            e();
            return new a(i10);
        }
    }

    public static /* synthetic */ int b(f fVar, int i10) {
        int i11 = fVar.f4537f - i10;
        fVar.f4537f = i11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Object obj) {
        Collection collection = (Collection) qc.d(this.f4536d, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f4537f -= size;
        }
    }

    public static /* synthetic */ int a(f fVar, int i10) {
        int i11 = fVar.f4537f + i10;
        fVar.f4537f = i11;
        return i11;
    }

    public Collection b(Object obj) {
        return g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Iterator b(Collection collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    public final List a(Object obj, List list, j jVar) {
        if (list instanceof RandomAccess) {
            return new g(obj, list, jVar);
        }
        return new k(obj, list, jVar);
    }
}
