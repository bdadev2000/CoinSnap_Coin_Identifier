package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.impl.h;
import com.applovin.impl.vc;
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
    private transient Map d;

    /* renamed from: f, reason: collision with root package name */
    private transient int f23764f;

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
    public class b extends vc.f {

        /* renamed from: c, reason: collision with root package name */
        final transient Map f23766c;

        /* loaded from: classes.dex */
        public class a extends vc.c {
            public a() {
            }

            @Override // com.applovin.impl.vc.c
            public Map a() {
                return b.this;
            }

            @Override // com.applovin.impl.vc.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return q3.a(b.this.f23766c.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return new C0078b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                f.this.c(((Map.Entry) obj).getKey());
                return true;
            }
        }

        /* renamed from: com.applovin.impl.f$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0078b implements Iterator {

            /* renamed from: a, reason: collision with root package name */
            final Iterator f23768a;

            /* renamed from: b, reason: collision with root package name */
            Collection f23769b;

            public C0078b() {
                this.f23768a = b.this.f23766c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                Map.Entry entry = (Map.Entry) this.f23768a.next();
                this.f23769b = (Collection) entry.getValue();
                return b.this.a(entry);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f23768a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                p3.a(this.f23769b != null);
                this.f23768a.remove();
                f.b(f.this, this.f23769b.size());
                this.f23769b.clear();
                this.f23769b = null;
            }
        }

        public b(Map map) {
            this.f23766c = map;
        }

        public Map.Entry a(Map.Entry entry) {
            Object key = entry.getKey();
            return vc.a(key, f.this.a(key, (Collection) entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f23766c == f.this.d) {
                f.this.clear();
            } else {
                xb.a((Iterator) new C0078b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return vc.b(this.f23766c, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f23766c.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f23766c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set keySet() {
            return f.this.e();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f23766c.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f23766c.toString();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection get(Object obj) {
            Collection collection = (Collection) vc.c(this.f23766c, obj);
            if (collection == null) {
                return null;
            }
            return f.this.a(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection remove(Object obj) {
            Collection collection = (Collection) this.f23766c.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection g2 = f.this.g();
            g2.addAll(collection);
            f.b(f.this, collection.size());
            collection.clear();
            return g2;
        }

        @Override // com.applovin.impl.vc.f
        public Set a() {
            return new a();
        }
    }

    /* loaded from: classes.dex */
    public abstract class c implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        final Iterator f23771a;

        /* renamed from: b, reason: collision with root package name */
        Object f23772b = null;

        /* renamed from: c, reason: collision with root package name */
        Collection f23773c = null;
        Iterator d = xb.c();

        public c() {
            this.f23771a = f.this.d.entrySet().iterator();
        }

        public abstract Object a(Object obj, Object obj2);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23771a.hasNext() || this.d.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.d.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f23771a.next();
                this.f23772b = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.f23773c = collection;
                this.d = collection.iterator();
            }
            return a(this.f23772b, this.d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.d.remove();
            if (this.f23773c.isEmpty()) {
                this.f23771a.remove();
            }
            f.c(f.this);
        }
    }

    /* loaded from: classes.dex */
    public class d extends vc.d {

        /* loaded from: classes.dex */
        public class a implements Iterator {

            /* renamed from: a, reason: collision with root package name */
            Map.Entry f23776a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Iterator f23777b;

            public a(Iterator it) {
                this.f23777b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f23777b.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Map.Entry entry = (Map.Entry) this.f23777b.next();
                this.f23776a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                p3.a(this.f23776a != null);
                Collection collection = (Collection) this.f23776a.getValue();
                this.f23777b.remove();
                f.b(f.this, collection.size());
                collection.clear();
                this.f23776a = null;
            }
        }

        public d(Map map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            xb.a(iterator());
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
            return new C0079f(d());
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
            Collection g2 = f.this.g();
            g2.addAll((Collection) entry.getValue());
            it.remove();
            return vc.a(entry.getKey(), f.this.c(g2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Object obj, boolean z2) {
            return new e(d().headMap(obj, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Object obj, boolean z2, Object obj2, boolean z3) {
            return new e(d().subMap(obj, z2, obj2, z3));
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Object obj, boolean z2) {
            return new e(d().tailMap(obj, z2));
        }

        @Override // com.applovin.impl.f.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavigableMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }
    }

    /* renamed from: com.applovin.impl.f$f, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0079f extends i implements NavigableSet {
        public C0079f(NavigableMap navigableMap) {
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
            return new C0079f(b().descendingMap());
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
            return xb.c(iterator());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return xb.c(descendingIterator());
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
        public NavigableSet headSet(Object obj, boolean z2) {
            return new C0079f(b().headMap(obj, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z2, Object obj2, boolean z3) {
            return new C0079f(b().subMap(obj, z2, obj2, z3));
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z2) {
            return new C0079f(b().tailMap(obj, z2));
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
        SortedSet f23781f;

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
            return (SortedMap) this.f23766c;
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
            SortedSet sortedSet = this.f23781f;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet c2 = c();
            this.f23781f = c2;
            return c2;
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
        this.d = map;
    }

    public static /* synthetic */ int b(f fVar) {
        int i2 = fVar.f23764f;
        fVar.f23764f = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int c(f fVar) {
        int i2 = fVar.f23764f;
        fVar.f23764f = i2 - 1;
        return i2;
    }

    public abstract Collection a(Object obj, Collection collection);

    public abstract Collection c(Collection collection);

    @Override // com.applovin.impl.uf
    public void clear() {
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.d.clear();
        this.f23764f = 0;
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
        Map map = this.d;
        return map instanceof NavigableMap ? new e((NavigableMap) this.d) : map instanceof SortedMap ? new h((SortedMap) this.d) : new b(this.d);
    }

    public final Set i() {
        Map map = this.d;
        return map instanceof NavigableMap ? new C0079f((NavigableMap) this.d) : map instanceof SortedMap ? new i((SortedMap) this.d) : new d(this.d);
    }

    @Override // com.applovin.impl.uf
    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.d.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f23764f++;
            return true;
        }
        Collection b2 = b(obj);
        if (!b2.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f23764f++;
        this.d.put(obj, b2);
        return true;
    }

    @Override // com.applovin.impl.uf
    public int size() {
        return this.f23764f;
    }

    @Override // com.applovin.impl.h, com.applovin.impl.uf
    public Collection values() {
        return super.values();
    }

    /* loaded from: classes.dex */
    public class j extends AbstractCollection {

        /* renamed from: a, reason: collision with root package name */
        final Object f23784a;

        /* renamed from: b, reason: collision with root package name */
        Collection f23785b;

        /* renamed from: c, reason: collision with root package name */
        final j f23786c;
        final Collection d;

        public j(Object obj, Collection collection, j jVar) {
            this.f23784a = obj;
            this.f23785b = collection;
            this.f23786c = jVar;
            this.d = jVar == null ? null : jVar.c();
        }

        public void a() {
            j jVar = this.f23786c;
            if (jVar != null) {
                jVar.a();
            } else {
                f.this.d.put(this.f23784a, this.f23785b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            e();
            boolean isEmpty = this.f23785b.isEmpty();
            boolean add = this.f23785b.add(obj);
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
            boolean addAll = this.f23785b.addAll(collection);
            if (addAll) {
                f.a(f.this, this.f23785b.size() - size);
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        public j b() {
            return this.f23786c;
        }

        public Collection c() {
            return this.f23785b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f23785b.clear();
            f.b(f.this, size);
            f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            e();
            return this.f23785b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            e();
            return this.f23785b.containsAll(collection);
        }

        public Object d() {
            return this.f23784a;
        }

        public void e() {
            Collection collection;
            j jVar = this.f23786c;
            if (jVar != null) {
                jVar.e();
                if (this.f23786c.c() != this.d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f23785b.isEmpty() || (collection = (Collection) f.this.d.get(this.f23784a)) == null) {
                    return;
                }
                this.f23785b = collection;
            }
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            e();
            return this.f23785b.equals(obj);
        }

        public void f() {
            j jVar = this.f23786c;
            if (jVar != null) {
                jVar.f();
            } else if (this.f23785b.isEmpty()) {
                f.this.d.remove(this.f23784a);
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            e();
            return this.f23785b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            e();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            e();
            boolean remove = this.f23785b.remove(obj);
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
            boolean removeAll = this.f23785b.removeAll(collection);
            if (removeAll) {
                f.a(f.this, this.f23785b.size() - size);
                f();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            Preconditions.checkNotNull(collection);
            int size = size();
            boolean retainAll = this.f23785b.retainAll(collection);
            if (retainAll) {
                f.a(f.this, this.f23785b.size() - size);
                f();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            e();
            return this.f23785b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            e();
            return this.f23785b.toString();
        }

        /* loaded from: classes.dex */
        public class a implements Iterator {

            /* renamed from: a, reason: collision with root package name */
            final Iterator f23788a;

            /* renamed from: b, reason: collision with root package name */
            final Collection f23789b;

            public a() {
                Collection collection = j.this.f23785b;
                this.f23789b = collection;
                this.f23788a = f.b(collection);
            }

            public Iterator a() {
                b();
                return this.f23788a;
            }

            public void b() {
                j.this.e();
                if (j.this.f23785b != this.f23789b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f23788a.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                b();
                return this.f23788a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f23788a.remove();
                f.c(f.this);
                j.this.f();
            }

            public a(Iterator it) {
                this.f23789b = j.this.f23785b;
                this.f23788a = it;
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

            public a(int i2) {
                super(k.this.g().listIterator(i2));
            }
        }

        public k(Object obj, List list, j jVar) {
            super(obj, list, jVar);
        }

        @Override // java.util.List
        public void add(int i2, Object obj) {
            e();
            boolean isEmpty = c().isEmpty();
            g().add(i2, obj);
            f.b(f.this);
            if (isEmpty) {
                a();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i2, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = g().addAll(i2, collection);
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
        public Object get(int i2) {
            e();
            return g().get(i2);
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
        public Object remove(int i2) {
            e();
            Object remove = g().remove(i2);
            f.c(f.this);
            f();
            return remove;
        }

        @Override // java.util.List
        public Object set(int i2, Object obj) {
            e();
            return g().set(i2, obj);
        }

        @Override // java.util.List
        public List subList(int i2, int i3) {
            e();
            return f.this.a(d(), g().subList(i2, i3), b() == null ? this : b());
        }

        @Override // java.util.List
        public ListIterator listIterator(int i2) {
            e();
            return new a(i2);
        }
    }

    public static /* synthetic */ int b(f fVar, int i2) {
        int i3 = fVar.f23764f - i2;
        fVar.f23764f = i3;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Object obj) {
        Collection collection = (Collection) vc.d(this.d, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f23764f -= size;
        }
    }

    public static /* synthetic */ int a(f fVar, int i2) {
        int i3 = fVar.f23764f + i2;
        fVar.f23764f = i3;
        return i3;
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
