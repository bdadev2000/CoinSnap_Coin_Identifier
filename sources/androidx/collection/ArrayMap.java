package androidx.collection;

import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p0.a;

/* loaded from: classes.dex */
public class ArrayMap<K, V> extends SimpleArrayMap<K, V> implements Map<K, V> {
    public EntrySet d;

    /* renamed from: f, reason: collision with root package name */
    public KeySet f1390f;

    /* renamed from: g, reason: collision with root package name */
    public ValueCollection f1391g;

    /* loaded from: classes.dex */
    public final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new MapIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return ArrayMap.this.size();
        }
    }

    /* loaded from: classes.dex */
    public final class KeyIterator extends IndexBasedArrayIterator<K> {
        public KeyIterator() {
            super(ArrayMap.this.size());
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final Object b(int i2) {
            return ArrayMap.this.g(i2);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final void c(int i2) {
            ArrayMap.this.i(i2);
        }
    }

    /* loaded from: classes.dex */
    public final class MapIterator implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public int f1394a;

        /* renamed from: b, reason: collision with root package name */
        public int f1395b = -1;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1396c;

        public MapIterator() {
            this.f1394a = ArrayMap.this.size() - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.f1396c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i2 = this.f1395b;
            ArrayMap arrayMap = ArrayMap.this;
            return a.g(key, arrayMap.g(i2)) && a.g(entry.getValue(), arrayMap.k(this.f1395b));
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            if (this.f1396c) {
                return ArrayMap.this.g(this.f1395b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            if (this.f1396c) {
                return ArrayMap.this.k(this.f1395b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f1395b < this.f1394a;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.f1396c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            int i2 = this.f1395b;
            ArrayMap arrayMap = ArrayMap.this;
            Object g2 = arrayMap.g(i2);
            Object k2 = arrayMap.k(this.f1395b);
            return (g2 == null ? 0 : g2.hashCode()) ^ (k2 != null ? k2.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f1395b++;
            this.f1396c = true;
            return this;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f1396c) {
                throw new IllegalStateException();
            }
            ArrayMap.this.i(this.f1395b);
            this.f1395b--;
            this.f1394a--;
            this.f1396c = false;
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (this.f1396c) {
                return ArrayMap.this.j(this.f1395b, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + ImpressionLog.R + getValue();
        }
    }

    /* loaded from: classes.dex */
    public final class ValueIterator extends IndexBasedArrayIterator<V> {
        public ValueIterator() {
            super(ArrayMap.this.size());
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final Object b(int i2) {
            return ArrayMap.this.k(i2);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final void c(int i2) {
            ArrayMap.this.i(i2);
        }
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        EntrySet entrySet = this.d;
        if (entrySet != null) {
            return entrySet;
        }
        EntrySet entrySet2 = new EntrySet();
        this.d = entrySet2;
        return entrySet2;
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final Object get(Object obj) {
        return super.get(obj);
    }

    @Override // java.util.Map
    public final Set keySet() {
        KeySet keySet = this.f1390f;
        if (keySet != null) {
            return keySet;
        }
        KeySet keySet2 = new KeySet();
        this.f1390f = keySet2;
        return keySet2;
    }

    public final boolean l(Collection collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(g(size2))) {
                i(size2);
            }
        }
        return size != size();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        c(map.size() + size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final Object remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.Map
    public final Collection values() {
        ValueCollection valueCollection = this.f1391g;
        if (valueCollection != null) {
            return valueCollection;
        }
        ValueCollection valueCollection2 = new ValueCollection();
        this.f1391g = valueCollection2;
        return valueCollection2;
    }

    /* loaded from: classes.dex */
    public final class KeySet implements Set<K> {
        public KeySet() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            ArrayMap.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return ArrayMap.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection collection) {
            ArrayMap arrayMap = ArrayMap.this;
            arrayMap.getClass();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!arrayMap.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() == set.size()) {
                        if (containsAll(set)) {
                            return true;
                        }
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            ArrayMap arrayMap = ArrayMap.this;
            int i2 = 0;
            for (int size = arrayMap.size() - 1; size >= 0; size--) {
                Object g2 = arrayMap.g(size);
                i2 += g2 == null ? 0 : g2.hashCode();
            }
            return i2;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new KeyIterator();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            ArrayMap arrayMap = ArrayMap.this;
            int e = arrayMap.e(obj);
            if (e < 0) {
                return false;
            }
            arrayMap.i(e);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection collection) {
            ArrayMap arrayMap = ArrayMap.this;
            int size = arrayMap.size();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayMap.remove(it.next());
            }
            return size != arrayMap.size();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection collection) {
            return ArrayMap.this.l(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return ArrayMap.this.size();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            ArrayMap arrayMap = ArrayMap.this;
            int size = arrayMap.size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = arrayMap.g(i2);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            ArrayMap arrayMap = ArrayMap.this;
            int size = arrayMap.size();
            Object[] objArr = new Object[size];
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = arrayMap.g(i2);
            }
            return objArr;
        }
    }

    /* loaded from: classes.dex */
    public final class ValueCollection implements Collection<V> {
        public ValueCollection() {
        }

        @Override // java.util.Collection
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            ArrayMap.this.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return ArrayMap.this.b(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new ValueIterator();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            ArrayMap arrayMap = ArrayMap.this;
            int b2 = arrayMap.b(obj);
            if (b2 < 0) {
                return false;
            }
            arrayMap.i(b2);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection collection) {
            ArrayMap arrayMap = ArrayMap.this;
            int size = arrayMap.size();
            int i2 = 0;
            boolean z2 = false;
            while (i2 < size) {
                if (collection.contains(arrayMap.k(i2))) {
                    arrayMap.i(i2);
                    i2--;
                    size--;
                    z2 = true;
                }
                i2++;
            }
            return z2;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection collection) {
            ArrayMap arrayMap = ArrayMap.this;
            int size = arrayMap.size();
            int i2 = 0;
            boolean z2 = false;
            while (i2 < size) {
                if (!collection.contains(arrayMap.k(i2))) {
                    arrayMap.i(i2);
                    i2--;
                    size--;
                    z2 = true;
                }
                i2++;
            }
            return z2;
        }

        @Override // java.util.Collection
        public final int size() {
            return ArrayMap.this.size();
        }

        @Override // java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            ArrayMap arrayMap = ArrayMap.this;
            int size = arrayMap.size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = arrayMap.k(i2);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            ArrayMap arrayMap = ArrayMap.this;
            int size = arrayMap.size();
            Object[] objArr = new Object[size];
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = arrayMap.k(i2);
            }
            return objArr;
        }
    }
}
