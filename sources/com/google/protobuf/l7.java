package com.google.protobuf;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public class l7 extends AbstractMap {
    private List<i7> entryList;
    private boolean isImmutable;
    private volatile e7 lazyDescendingEntrySet;
    private volatile k7 lazyEntrySet;
    private final int maxArraySize;
    private Map<Comparable<Object>, Object> overflowEntries;
    private Map<Comparable<Object>, Object> overflowEntriesDescending;

    public /* synthetic */ l7(int i10, c7 c7Var) {
        this(i10);
    }

    private int binarySearchInArray(Comparable<Object> comparable) {
        int size = this.entryList.size() - 1;
        if (size >= 0) {
            int compareTo = comparable.compareTo(this.entryList.get(size).getKey());
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
            int compareTo2 = comparable.compareTo(this.entryList.get(i11).getKey());
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

    private SortedMap<Comparable<Object>, Object> getOverflowEntriesMutable() {
        checkMutable();
        if (this.overflowEntries.isEmpty() && !(this.overflowEntries instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.overflowEntries = treeMap;
            this.overflowEntriesDescending = treeMap.descendingMap();
        }
        return (SortedMap) this.overflowEntries;
    }

    public static <FieldDescriptorType extends w2> l7 newFieldMap(int i10) {
        return new c7(i10);
    }

    public static <K extends Comparable<K>, V> l7 newInstanceForTest(int i10) {
        return new l7(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object removeArrayEntryAt(int i10) {
        checkMutable();
        Object value = this.entryList.remove(i10).getValue();
        if (!this.overflowEntries.isEmpty()) {
            Iterator<Map.Entry<Comparable<Object>, Object>> it = getOverflowEntriesMutable().entrySet().iterator();
            this.entryList.add(new i7(this, it.next()));
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

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable<Object> comparable = (Comparable) obj;
        if (binarySearchInArray(comparable) < 0 && !this.overflowEntries.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public Set<Map.Entry<Comparable<Object>, Object>> descendingEntrySet() {
        if (this.lazyDescendingEntrySet == null) {
            this.lazyDescendingEntrySet = new e7(this, null);
        }
        return this.lazyDescendingEntrySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<Comparable<Object>, Object>> entrySet() {
        if (this.lazyEntrySet == null) {
            this.lazyEntrySet = new k7(this, null);
        }
        return this.lazyEntrySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7)) {
            return super.equals(obj);
        }
        l7 l7Var = (l7) obj;
        int size = size();
        if (size != l7Var.size()) {
            return false;
        }
        int numArrayEntries = getNumArrayEntries();
        if (numArrayEntries != l7Var.getNumArrayEntries()) {
            return entrySet().equals(l7Var.entrySet());
        }
        for (int i10 = 0; i10 < numArrayEntries; i10++) {
            if (!getArrayEntryAt(i10).equals(l7Var.getArrayEntryAt(i10))) {
                return false;
            }
        }
        if (numArrayEntries == size) {
            return true;
        }
        return this.overflowEntries.equals(l7Var.overflowEntries);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable<Object> comparable = (Comparable) obj;
        int binarySearchInArray = binarySearchInArray(comparable);
        if (binarySearchInArray >= 0) {
            return this.entryList.get(binarySearchInArray).getValue();
        }
        return this.overflowEntries.get(comparable);
    }

    public Map.Entry<Comparable<Object>, Object> getArrayEntryAt(int i10) {
        return this.entryList.get(i10);
    }

    public int getNumArrayEntries() {
        return this.entryList.size();
    }

    public int getNumOverflowEntries() {
        return this.overflowEntries.size();
    }

    public Iterable<Map.Entry<Comparable<Object>, Object>> getOverflowEntries() {
        if (this.overflowEntries.isEmpty()) {
            return h7.iterable();
        }
        return this.overflowEntries.entrySet();
    }

    public Iterable<Map.Entry<Comparable<Object>, Object>> getOverflowEntriesDescending() {
        if (this.overflowEntriesDescending.isEmpty()) {
            return h7.iterable();
        }
        return this.overflowEntriesDescending.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int numArrayEntries = getNumArrayEntries();
        int i10 = 0;
        for (int i11 = 0; i11 < numArrayEntries; i11++) {
            i10 += this.entryList.get(i11).hashCode();
        }
        if (getNumOverflowEntries() > 0) {
            return i10 + this.overflowEntries.hashCode();
        }
        return i10;
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public void makeImmutable() {
        Map<Comparable<Object>, Object> unmodifiableMap;
        Map<Comparable<Object>, Object> unmodifiableMap2;
        if (!this.isImmutable) {
            if (this.overflowEntries.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.overflowEntries);
            }
            this.overflowEntries = unmodifiableMap;
            if (this.overflowEntriesDescending.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.overflowEntriesDescending);
            }
            this.overflowEntriesDescending = unmodifiableMap2;
            this.isImmutable = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        checkMutable();
        Comparable<Object> comparable = (Comparable) obj;
        int binarySearchInArray = binarySearchInArray(comparable);
        if (binarySearchInArray >= 0) {
            return removeArrayEntryAt(binarySearchInArray);
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

    private l7(int i10) {
        this.maxArraySize = i10;
        this.entryList = Collections.emptyList();
        this.overflowEntries = Collections.emptyMap();
        this.overflowEntriesDescending = Collections.emptyMap();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Comparable<Object> comparable, Object obj) {
        checkMutable();
        int binarySearchInArray = binarySearchInArray(comparable);
        if (binarySearchInArray >= 0) {
            return this.entryList.get(binarySearchInArray).setValue(obj);
        }
        ensureEntryArrayMutable();
        int i10 = -(binarySearchInArray + 1);
        if (i10 >= this.maxArraySize) {
            return getOverflowEntriesMutable().put(comparable, obj);
        }
        int size = this.entryList.size();
        int i11 = this.maxArraySize;
        if (size == i11) {
            i7 remove = this.entryList.remove(i11 - 1);
            getOverflowEntriesMutable().put(remove.getKey(), remove.getValue());
        }
        this.entryList.add(i10, new i7(this, comparable, obj));
        return null;
    }
}
