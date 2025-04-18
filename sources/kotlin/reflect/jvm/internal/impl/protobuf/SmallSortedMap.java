package kotlin.reflect.jvm.internal.impl.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.reflect.jvm.internal.impl.protobuf.FieldSet;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class SmallSortedMap<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private List<SmallSortedMap<K, V>.Entry> entryList;
    private boolean isImmutable;
    private volatile SmallSortedMap<K, V>.EntrySet lazyEntrySet;
    private final int maxArraySize;
    private Map<K, V> overflowEntries;

    /* loaded from: classes4.dex */
    public static class EmptySet {
        private static final Iterator<Object> ITERATOR = new Iterator<Object>() { // from class: kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.EmptySet.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        private static final Iterable<Object> ITERABLE = new Iterable<Object>() { // from class: kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.EmptySet.2
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return EmptySet.ITERATOR;
            }
        };

        public static <T> Iterable<T> iterable() {
            return (Iterable<T>) ITERABLE;
        }
    }

    /* loaded from: classes4.dex */
    public class Entry implements Comparable<SmallSortedMap<K, V>.Entry>, Map.Entry<K, V> {
        private final K key;
        private V value;

        public Entry(SmallSortedMap smallSortedMap, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return equals(this.key, entry.getKey()) && equals(this.value, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.key;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.value;
            return hashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            SmallSortedMap.this.checkMutable();
            V v11 = this.value;
            this.value = v10;
            return v11;
        }

        public String toString() {
            String valueOf = String.valueOf(this.key);
            String valueOf2 = String.valueOf(this.value);
            return a.n(new StringBuilder(valueOf2.length() + valueOf.length() + 1), valueOf, "=", valueOf2);
        }

        public Entry(K k10, V v10) {
            this.key = k10;
            this.value = v10;
        }

        @Override // java.lang.Comparable
        public int compareTo(SmallSortedMap<K, V>.Entry entry) {
            return getKey().compareTo(entry.getKey());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        private boolean equals(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }
    }

    /* loaded from: classes4.dex */
    public class EntryIterator implements Iterator<Map.Entry<K, V>> {
        private Iterator<Map.Entry<K, V>> lazyOverflowIterator;
        private boolean nextCalledBeforeRemove;
        private int pos;

        private EntryIterator() {
            this.pos = -1;
        }

        private Iterator<Map.Entry<K, V>> getOverflowIterator() {
            if (this.lazyOverflowIterator == null) {
                this.lazyOverflowIterator = SmallSortedMap.this.overflowEntries.entrySet().iterator();
            }
            return this.lazyOverflowIterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.pos + 1 < SmallSortedMap.this.entryList.size() || getOverflowIterator().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.nextCalledBeforeRemove) {
                this.nextCalledBeforeRemove = false;
                SmallSortedMap.this.checkMutable();
                if (this.pos < SmallSortedMap.this.entryList.size()) {
                    SmallSortedMap smallSortedMap = SmallSortedMap.this;
                    int i10 = this.pos;
                    this.pos = i10 - 1;
                    smallSortedMap.removeArrayEntryAt(i10);
                    return;
                }
                getOverflowIterator().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            this.nextCalledBeforeRemove = true;
            int i10 = this.pos + 1;
            this.pos = i10;
            if (i10 < SmallSortedMap.this.entryList.size()) {
                return (Map.Entry) SmallSortedMap.this.entryList.get(this.pos);
            }
            return getOverflowIterator().next();
        }
    }

    /* loaded from: classes4.dex */
    public class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        private EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            SmallSortedMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = SmallSortedMap.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                SmallSortedMap.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return SmallSortedMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            SmallSortedMap.this.put((SmallSortedMap) entry.getKey(), (K) entry.getValue());
            return true;
        }
    }

    private int binarySearchInArray(K k10) {
        int size = this.entryList.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.entryList.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = k10.compareTo(this.entryList.get(i11).getKey());
            if (compareTo2 < 0) {
                size = i11 - 1;
            } else if (compareTo2 > 0) {
                i10 = i11 + 1;
            } else {
                return i11;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkMutable() {
        if (!this.isImmutable) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    private void ensureEntryArrayMutable() {
        checkMutable();
        if (this.entryList.isEmpty() && !(this.entryList instanceof ArrayList)) {
            this.entryList = new ArrayList(this.maxArraySize);
        }
    }

    private SortedMap<K, V> getOverflowEntriesMutable() {
        checkMutable();
        if (this.overflowEntries.isEmpty() && !(this.overflowEntries instanceof TreeMap)) {
            this.overflowEntries = new TreeMap();
        }
        return (SortedMap) this.overflowEntries;
    }

    public static <FieldDescriptorType extends FieldSet.FieldDescriptorLite<FieldDescriptorType>> SmallSortedMap<FieldDescriptorType, Object> newFieldMap(int i10) {
        return (SmallSortedMap<FieldDescriptorType, Object>) new SmallSortedMap<FieldDescriptorType, Object>(i10) { // from class: kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap
            public void makeImmutable() {
                if (!isImmutable()) {
                    for (int i11 = 0; i11 < getNumArrayEntries(); i11++) {
                        Map.Entry<FieldDescriptorType, Object> arrayEntryAt = getArrayEntryAt(i11);
                        if (((FieldSet.FieldDescriptorLite) arrayEntryAt.getKey()).isRepeated()) {
                            arrayEntryAt.setValue(Collections.unmodifiableList((List) arrayEntryAt.getValue()));
                        }
                    }
                    for (Map.Entry<FieldDescriptorType, Object> entry : getOverflowEntries()) {
                        if (((FieldSet.FieldDescriptorLite) entry.getKey()).isRepeated()) {
                            entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                        }
                    }
                }
                super.makeImmutable();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap, java.util.AbstractMap, java.util.Map
            public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
                return super.put((AnonymousClass1<FieldDescriptorType>) obj, (FieldSet.FieldDescriptorLite) obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V removeArrayEntryAt(int i10) {
        checkMutable();
        V value = this.entryList.remove(i10).getValue();
        if (!this.overflowEntries.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = getOverflowEntriesMutable().entrySet().iterator();
            this.entryList.add(new Entry(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        checkMutable();
        if (!this.entryList.isEmpty()) {
            this.entryList.clear();
        }
        if (!this.overflowEntries.isEmpty()) {
            this.overflowEntries.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (binarySearchInArray(comparable) < 0 && !this.overflowEntries.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.lazyEntrySet == null) {
            this.lazyEntrySet = new EntrySet();
        }
        return this.lazyEntrySet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int binarySearchInArray = binarySearchInArray(comparable);
        if (binarySearchInArray >= 0) {
            return this.entryList.get(binarySearchInArray).getValue();
        }
        return this.overflowEntries.get(comparable);
    }

    public Map.Entry<K, V> getArrayEntryAt(int i10) {
        return this.entryList.get(i10);
    }

    public int getNumArrayEntries() {
        return this.entryList.size();
    }

    public Iterable<Map.Entry<K, V>> getOverflowEntries() {
        return this.overflowEntries.isEmpty() ? EmptySet.iterable() : this.overflowEntries.entrySet();
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public void makeImmutable() {
        Map<K, V> unmodifiableMap;
        if (!this.isImmutable) {
            if (this.overflowEntries.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.overflowEntries);
            }
            this.overflowEntries = unmodifiableMap;
            this.isImmutable = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((SmallSortedMap<K, V>) obj, (Comparable) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        checkMutable();
        Comparable comparable = (Comparable) obj;
        int binarySearchInArray = binarySearchInArray(comparable);
        if (binarySearchInArray >= 0) {
            return (V) removeArrayEntryAt(binarySearchInArray);
        }
        if (this.overflowEntries.isEmpty()) {
            return null;
        }
        return this.overflowEntries.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.overflowEntries.size() + this.entryList.size();
    }

    private SmallSortedMap(int i10) {
        this.maxArraySize = i10;
        this.entryList = Collections.emptyList();
        this.overflowEntries = Collections.emptyMap();
    }

    public V put(K k10, V v10) {
        checkMutable();
        int binarySearchInArray = binarySearchInArray(k10);
        if (binarySearchInArray >= 0) {
            return this.entryList.get(binarySearchInArray).setValue(v10);
        }
        ensureEntryArrayMutable();
        int i10 = -(binarySearchInArray + 1);
        if (i10 >= this.maxArraySize) {
            return getOverflowEntriesMutable().put(k10, v10);
        }
        int size = this.entryList.size();
        int i11 = this.maxArraySize;
        if (size == i11) {
            SmallSortedMap<K, V>.Entry remove = this.entryList.remove(i11 - 1);
            getOverflowEntriesMutable().put(remove.getKey(), remove.getValue());
        }
        this.entryList.add(i10, new Entry(k10, v10));
        return null;
    }
}
