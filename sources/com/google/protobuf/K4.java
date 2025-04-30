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

/* loaded from: classes3.dex */
public class K4 extends AbstractMap {
    private List<H4> entryList;
    private boolean isImmutable;
    private volatile D4 lazyDescendingEntrySet;
    private volatile J4 lazyEntrySet;
    private final int maxArraySize;
    private Map<Comparable<Object>, Object> overflowEntries;
    private Map<Comparable<Object>, Object> overflowEntriesDescending;

    public /* synthetic */ K4(int i9, B4 b42) {
        this(i9);
    }

    private int binarySearchInArray(Comparable<Object> comparable) {
        int i9;
        int size = this.entryList.size();
        int i10 = size - 1;
        if (i10 >= 0) {
            int compareTo = comparable.compareTo(this.entryList.get(i10).getKey());
            if (compareTo > 0) {
                i9 = size + 1;
                return -i9;
            }
            if (compareTo == 0) {
                return i10;
            }
        }
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int compareTo2 = comparable.compareTo(this.entryList.get(i12).getKey());
            if (compareTo2 < 0) {
                i10 = i12 - 1;
            } else if (compareTo2 > 0) {
                i11 = i12 + 1;
            } else {
                return i12;
            }
        }
        i9 = i11 + 1;
        return -i9;
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

    public static <FieldDescriptorType extends InterfaceC1994s2> K4 newFieldMap(int i9) {
        return new B4(i9);
    }

    public static <K extends Comparable<K>, V> K4 newInstanceForTest(int i9) {
        return new K4(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object removeArrayEntryAt(int i9) {
        checkMutable();
        Object value = this.entryList.remove(i9).getValue();
        if (!this.overflowEntries.isEmpty()) {
            Iterator<Map.Entry<Comparable<Object>, Object>> it = getOverflowEntriesMutable().entrySet().iterator();
            this.entryList.add(new H4(this, it.next()));
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
            this.lazyDescendingEntrySet = new D4(this, null);
        }
        return this.lazyDescendingEntrySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<Comparable<Object>, Object>> entrySet() {
        if (this.lazyEntrySet == null) {
            this.lazyEntrySet = new J4(this, null);
        }
        return this.lazyEntrySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K4)) {
            return super.equals(obj);
        }
        K4 k42 = (K4) obj;
        int size = size();
        if (size != k42.size()) {
            return false;
        }
        int numArrayEntries = getNumArrayEntries();
        if (numArrayEntries != k42.getNumArrayEntries()) {
            return entrySet().equals(k42.entrySet());
        }
        for (int i9 = 0; i9 < numArrayEntries; i9++) {
            if (!getArrayEntryAt(i9).equals(k42.getArrayEntryAt(i9))) {
                return false;
            }
        }
        if (numArrayEntries == size) {
            return true;
        }
        return this.overflowEntries.equals(k42.overflowEntries);
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

    public Map.Entry<Comparable<Object>, Object> getArrayEntryAt(int i9) {
        return this.entryList.get(i9);
    }

    public int getNumArrayEntries() {
        return this.entryList.size();
    }

    public int getNumOverflowEntries() {
        return this.overflowEntries.size();
    }

    public Iterable<Map.Entry<Comparable<Object>, Object>> getOverflowEntries() {
        if (this.overflowEntries.isEmpty()) {
            return G4.iterable();
        }
        return this.overflowEntries.entrySet();
    }

    public Iterable<Map.Entry<Comparable<Object>, Object>> getOverflowEntriesDescending() {
        if (this.overflowEntriesDescending.isEmpty()) {
            return G4.iterable();
        }
        return this.overflowEntriesDescending.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int numArrayEntries = getNumArrayEntries();
        int i9 = 0;
        for (int i10 = 0; i10 < numArrayEntries; i10++) {
            i9 += this.entryList.get(i10).hashCode();
        }
        if (getNumOverflowEntries() > 0) {
            return i9 + this.overflowEntries.hashCode();
        }
        return i9;
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

    private K4(int i9) {
        this.maxArraySize = i9;
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
        int i9 = -(binarySearchInArray + 1);
        if (i9 >= this.maxArraySize) {
            return getOverflowEntriesMutable().put(comparable, obj);
        }
        int size = this.entryList.size();
        int i10 = this.maxArraySize;
        if (size == i10) {
            H4 remove = this.entryList.remove(i10 - 1);
            getOverflowEntriesMutable().put(remove.getKey(), remove.getValue());
        }
        this.entryList.add(i9, new H4(this, comparable, obj));
        return null;
    }
}
