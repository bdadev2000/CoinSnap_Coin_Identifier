package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.impl.AbstractC0702h;
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
/* renamed from: com.applovin.impl.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0692f extends AbstractC0702h implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    private transient Map f7491d;

    /* renamed from: f, reason: collision with root package name */
    private transient int f7492f;

    /* renamed from: com.applovin.impl.f$a */
    /* loaded from: classes.dex */
    public class a extends c {
        public a() {
            super();
        }

        @Override // com.applovin.impl.AbstractC0692f.c
        public Object a(Object obj, Object obj2) {
            return obj2;
        }
    }

    /* renamed from: com.applovin.impl.f$b */
    /* loaded from: classes.dex */
    public class b extends qc.f {

        /* renamed from: c, reason: collision with root package name */
        final transient Map f7494c;

        /* renamed from: com.applovin.impl.f$b$a */
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
                return o3.a(b.this.f7494c.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return new C0015b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (contains(obj)) {
                    AbstractC0692f.this.c(((Map.Entry) obj).getKey());
                    return true;
                }
                return false;
            }
        }

        /* renamed from: com.applovin.impl.f$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0015b implements Iterator {

            /* renamed from: a, reason: collision with root package name */
            final Iterator f7497a;
            Collection b;

            public C0015b() {
                this.f7497a = b.this.f7494c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                Map.Entry entry = (Map.Entry) this.f7497a.next();
                this.b = (Collection) entry.getValue();
                return b.this.a(entry);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f7497a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                boolean z8;
                if (this.b != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                n3.a(z8);
                this.f7497a.remove();
                AbstractC0692f.b(AbstractC0692f.this, this.b.size());
                this.b.clear();
                this.b = null;
            }
        }

        public b(Map map) {
            this.f7494c = map;
        }

        public Map.Entry a(Map.Entry entry) {
            Object key = entry.getKey();
            return qc.a(key, AbstractC0692f.this.a(key, (Collection) entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f7494c == AbstractC0692f.this.f7491d) {
                AbstractC0692f.this.clear();
            } else {
                sb.a((Iterator) new C0015b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return qc.b(this.f7494c, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            if (this != obj && !this.f7494c.equals(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f7494c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set keySet() {
            return AbstractC0692f.this.e();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f7494c.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f7494c.toString();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection get(Object obj) {
            Collection collection = (Collection) qc.c(this.f7494c, obj);
            if (collection == null) {
                return null;
            }
            return AbstractC0692f.this.a(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection remove(Object obj) {
            Collection collection = (Collection) this.f7494c.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection g9 = AbstractC0692f.this.g();
            g9.addAll(collection);
            AbstractC0692f.b(AbstractC0692f.this, collection.size());
            collection.clear();
            return g9;
        }

        @Override // com.applovin.impl.qc.f
        public Set a() {
            return new a();
        }
    }

    /* renamed from: com.applovin.impl.f$c */
    /* loaded from: classes.dex */
    public abstract class c implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        final Iterator f7499a;
        Object b = null;

        /* renamed from: c, reason: collision with root package name */
        Collection f7500c = null;

        /* renamed from: d, reason: collision with root package name */
        Iterator f7501d = sb.c();

        public c() {
            this.f7499a = AbstractC0692f.this.f7491d.entrySet().iterator();
        }

        public abstract Object a(Object obj, Object obj2);

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.f7499a.hasNext() && !this.f7501d.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f7501d.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f7499a.next();
                this.b = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.f7500c = collection;
                this.f7501d = collection.iterator();
            }
            return a(this.b, this.f7501d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f7501d.remove();
            if (this.f7500c.isEmpty()) {
                this.f7499a.remove();
            }
            AbstractC0692f.c(AbstractC0692f.this);
        }
    }

    /* renamed from: com.applovin.impl.f$d */
    /* loaded from: classes.dex */
    public class d extends qc.d {

        /* renamed from: com.applovin.impl.f$d$a */
        /* loaded from: classes.dex */
        public class a implements Iterator {

            /* renamed from: a, reason: collision with root package name */
            Map.Entry f7503a;
            final /* synthetic */ Iterator b;

            public a(Iterator it) {
                this.b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.b.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Map.Entry entry = (Map.Entry) this.b.next();
                this.f7503a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                boolean z8;
                if (this.f7503a != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                n3.a(z8);
                Collection collection = (Collection) this.f7503a.getValue();
                this.b.remove();
                AbstractC0692f.b(AbstractC0692f.this, collection.size());
                collection.clear();
                this.f7503a = null;
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
            if (this != obj && !a().keySet().equals(obj)) {
                return false;
            }
            return true;
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
                AbstractC0692f.b(AbstractC0692f.this, size);
                if (size > 0) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.applovin.impl.f$e */
    /* loaded from: classes.dex */
    public class e extends h implements NavigableMap {
        public e(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // com.applovin.impl.AbstractC0692f.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavigableMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // com.applovin.impl.AbstractC0692f.h, java.util.SortedMap, java.util.NavigableMap
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

        @Override // com.applovin.impl.AbstractC0692f.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public NavigableSet c() {
            return new C0016f(d());
        }

        @Override // com.applovin.impl.AbstractC0692f.h
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

        @Override // com.applovin.impl.AbstractC0692f.h, com.applovin.impl.AbstractC0692f.b, java.util.AbstractMap, java.util.Map
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
            Collection g9 = AbstractC0692f.this.g();
            g9.addAll((Collection) entry.getValue());
            it.remove();
            return qc.a(entry.getKey(), AbstractC0692f.this.c(g9));
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Object obj, boolean z8) {
            return new e(d().headMap(obj, z8));
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Object obj, boolean z8, Object obj2, boolean z9) {
            return new e(d().subMap(obj, z8, obj2, z9));
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Object obj, boolean z8) {
            return new e(d().tailMap(obj, z8));
        }

        @Override // com.applovin.impl.AbstractC0692f.h, java.util.SortedMap, java.util.NavigableMap
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

        @Override // com.applovin.impl.AbstractC0692f.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavigableSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // com.applovin.impl.AbstractC0692f.i
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

        @Override // com.applovin.impl.AbstractC0692f.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavigableSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.applovin.impl.AbstractC0692f.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public NavigableSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z8) {
            return new C0016f(b().headMap(obj, z8));
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z8, Object obj2, boolean z9) {
            return new C0016f(b().subMap(obj, z8, obj2, z9));
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z8) {
            return new C0016f(b().tailMap(obj, z8));
        }
    }

    /* renamed from: com.applovin.impl.f$g */
    /* loaded from: classes.dex */
    public class g extends k implements RandomAccess {
        public g(Object obj, List list, j jVar) {
            super(obj, list, jVar);
        }
    }

    /* renamed from: com.applovin.impl.f$h */
    /* loaded from: classes.dex */
    public class h extends b implements SortedMap {

        /* renamed from: f, reason: collision with root package name */
        SortedSet f7508f;

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
            return (SortedMap) this.f7494c;
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

        @Override // com.applovin.impl.AbstractC0692f.b, java.util.AbstractMap, java.util.Map
        public SortedSet keySet() {
            SortedSet sortedSet = this.f7508f;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet c9 = c();
            this.f7508f = c9;
            return c9;
        }
    }

    /* renamed from: com.applovin.impl.f$i */
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

    public AbstractC0692f(Map map) {
        Preconditions.checkArgument(map.isEmpty());
        this.f7491d = map;
    }

    public static /* synthetic */ int b(AbstractC0692f abstractC0692f) {
        int i9 = abstractC0692f.f7492f;
        abstractC0692f.f7492f = i9 + 1;
        return i9;
    }

    public static /* synthetic */ int c(AbstractC0692f abstractC0692f) {
        int i9 = abstractC0692f.f7492f;
        abstractC0692f.f7492f = i9 - 1;
        return i9;
    }

    public abstract Collection a(Object obj, Collection collection);

    public abstract Collection c(Collection collection);

    @Override // com.applovin.impl.pf
    public void clear() {
        Iterator it = this.f7491d.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f7491d.clear();
        this.f7492f = 0;
    }

    @Override // com.applovin.impl.AbstractC0702h
    public Collection d() {
        return new AbstractC0702h.a();
    }

    @Override // com.applovin.impl.AbstractC0702h
    public Iterator f() {
        return new a();
    }

    public abstract Collection g();

    public final Map h() {
        Map map = this.f7491d;
        if (map instanceof NavigableMap) {
            return new e((NavigableMap) this.f7491d);
        }
        if (map instanceof SortedMap) {
            return new h((SortedMap) this.f7491d);
        }
        return new b(this.f7491d);
    }

    public final Set i() {
        Map map = this.f7491d;
        if (map instanceof NavigableMap) {
            return new C0016f((NavigableMap) this.f7491d);
        }
        if (map instanceof SortedMap) {
            return new i((SortedMap) this.f7491d);
        }
        return new d(this.f7491d);
    }

    @Override // com.applovin.impl.pf
    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.f7491d.get(obj);
        if (collection == null) {
            Collection b8 = b(obj);
            if (b8.add(obj2)) {
                this.f7492f++;
                this.f7491d.put(obj, b8);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (collection.add(obj2)) {
            this.f7492f++;
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.pf
    public int size() {
        return this.f7492f;
    }

    @Override // com.applovin.impl.AbstractC0702h, com.applovin.impl.pf
    public Collection values() {
        return super.values();
    }

    /* renamed from: com.applovin.impl.f$j */
    /* loaded from: classes.dex */
    public class j extends AbstractCollection {

        /* renamed from: a, reason: collision with root package name */
        final Object f7511a;
        Collection b;

        /* renamed from: c, reason: collision with root package name */
        final j f7512c;

        /* renamed from: d, reason: collision with root package name */
        final Collection f7513d;

        public j(Object obj, Collection collection, j jVar) {
            Collection c9;
            this.f7511a = obj;
            this.b = collection;
            this.f7512c = jVar;
            if (jVar == null) {
                c9 = null;
            } else {
                c9 = jVar.c();
            }
            this.f7513d = c9;
        }

        public void a() {
            j jVar = this.f7512c;
            if (jVar != null) {
                jVar.a();
            } else {
                AbstractC0692f.this.f7491d.put(this.f7511a, this.b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            e();
            boolean isEmpty = this.b.isEmpty();
            boolean add = this.b.add(obj);
            if (add) {
                AbstractC0692f.b(AbstractC0692f.this);
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
            boolean addAll = this.b.addAll(collection);
            if (addAll) {
                AbstractC0692f.a(AbstractC0692f.this, this.b.size() - size);
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        public j b() {
            return this.f7512c;
        }

        public Collection c() {
            return this.b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.b.clear();
            AbstractC0692f.b(AbstractC0692f.this, size);
            f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            e();
            return this.b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            e();
            return this.b.containsAll(collection);
        }

        public Object d() {
            return this.f7511a;
        }

        public void e() {
            Collection collection;
            j jVar = this.f7512c;
            if (jVar != null) {
                jVar.e();
                if (this.f7512c.c() != this.f7513d) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.b.isEmpty() && (collection = (Collection) AbstractC0692f.this.f7491d.get(this.f7511a)) != null) {
                this.b = collection;
            }
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            e();
            return this.b.equals(obj);
        }

        public void f() {
            j jVar = this.f7512c;
            if (jVar != null) {
                jVar.f();
            } else if (this.b.isEmpty()) {
                AbstractC0692f.this.f7491d.remove(this.f7511a);
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            e();
            return this.b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            e();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            e();
            boolean remove = this.b.remove(obj);
            if (remove) {
                AbstractC0692f.c(AbstractC0692f.this);
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
            boolean removeAll = this.b.removeAll(collection);
            if (removeAll) {
                AbstractC0692f.a(AbstractC0692f.this, this.b.size() - size);
                f();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            Preconditions.checkNotNull(collection);
            int size = size();
            boolean retainAll = this.b.retainAll(collection);
            if (retainAll) {
                AbstractC0692f.a(AbstractC0692f.this, this.b.size() - size);
                f();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            e();
            return this.b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            e();
            return this.b.toString();
        }

        /* renamed from: com.applovin.impl.f$j$a */
        /* loaded from: classes.dex */
        public class a implements Iterator {

            /* renamed from: a, reason: collision with root package name */
            final Iterator f7515a;
            final Collection b;

            public a() {
                Collection collection = j.this.b;
                this.b = collection;
                this.f7515a = AbstractC0692f.b(collection);
            }

            public Iterator a() {
                b();
                return this.f7515a;
            }

            public void b() {
                j.this.e();
                if (j.this.b == this.b) {
                } else {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f7515a.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                b();
                return this.f7515a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f7515a.remove();
                AbstractC0692f.c(AbstractC0692f.this);
                j.this.f();
            }

            public a(Iterator it) {
                this.b = j.this.b;
                this.f7515a = it;
            }
        }
    }

    /* renamed from: com.applovin.impl.f$k */
    /* loaded from: classes.dex */
    public class k extends j implements List {

        /* renamed from: com.applovin.impl.f$k$a */
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
                AbstractC0692f.b(AbstractC0692f.this);
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

            public a(int i9) {
                super(k.this.g().listIterator(i9));
            }
        }

        public k(Object obj, List list, j jVar) {
            super(obj, list, jVar);
        }

        @Override // java.util.List
        public void add(int i9, Object obj) {
            e();
            boolean isEmpty = c().isEmpty();
            g().add(i9, obj);
            AbstractC0692f.b(AbstractC0692f.this);
            if (isEmpty) {
                a();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i9, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = g().addAll(i9, collection);
            if (addAll) {
                AbstractC0692f.a(AbstractC0692f.this, c().size() - size);
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
        public Object get(int i9) {
            e();
            return g().get(i9);
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
        public Object remove(int i9) {
            e();
            Object remove = g().remove(i9);
            AbstractC0692f.c(AbstractC0692f.this);
            f();
            return remove;
        }

        @Override // java.util.List
        public Object set(int i9, Object obj) {
            e();
            return g().set(i9, obj);
        }

        @Override // java.util.List
        public List subList(int i9, int i10) {
            j b;
            e();
            AbstractC0692f abstractC0692f = AbstractC0692f.this;
            Object d2 = d();
            List subList = g().subList(i9, i10);
            if (b() == null) {
                b = this;
            } else {
                b = b();
            }
            return abstractC0692f.a(d2, subList, b);
        }

        @Override // java.util.List
        public ListIterator listIterator(int i9) {
            e();
            return new a(i9);
        }
    }

    public static /* synthetic */ int b(AbstractC0692f abstractC0692f, int i9) {
        int i10 = abstractC0692f.f7492f - i9;
        abstractC0692f.f7492f = i10;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Object obj) {
        Collection collection = (Collection) qc.d(this.f7491d, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f7492f -= size;
        }
    }

    public static /* synthetic */ int a(AbstractC0692f abstractC0692f, int i9) {
        int i10 = abstractC0692f.f7492f + i9;
        abstractC0692f.f7492f = i10;
        return i10;
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
