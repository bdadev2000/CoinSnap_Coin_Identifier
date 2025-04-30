package com.google.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class G3 extends LinkedHashMap {
    private static final G3 EMPTY_MAP_FIELD;
    private boolean isMutable;

    static {
        G3 g32 = new G3();
        EMPTY_MAP_FIELD = g32;
        g32.makeImmutable();
    }

    private G3() {
        this.isMutable = true;
    }

    public static <K, V> int calculateHashCodeForMap(Map<K, V> map) {
        int i9 = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            i9 += calculateHashCodeForObject(entry.getValue()) ^ calculateHashCodeForObject(entry.getKey());
        }
        return i9;
    }

    private static int calculateHashCodeForObject(Object obj) {
        if (obj instanceof byte[]) {
            return C1898e3.hashCode((byte[]) obj);
        }
        if (!(obj instanceof V2)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    private static void checkForNullKeysAndValues(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            C1898e3.checkNotNull(obj);
            C1898e3.checkNotNull(map.get(obj));
        }
    }

    private static Object copy(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public static <K, V> G3 emptyMapField() {
        return EMPTY_MAP_FIELD;
    }

    private void ensureMutable() {
        if (isMutable()) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean equals(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        return obj.equals(obj2);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        ensureMutable();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<Object, Object>> entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return calculateHashCodeForMap(this);
    }

    public boolean isMutable() {
        return this.isMutable;
    }

    public void makeImmutable() {
        this.isMutable = false;
    }

    public void mergeFrom(G3 g32) {
        ensureMutable();
        if (!g32.isEmpty()) {
            putAll(g32);
        }
    }

    public G3 mutableCopy() {
        if (isEmpty()) {
            return new G3();
        }
        return new G3(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        ensureMutable();
        C1898e3.checkNotNull(obj);
        C1898e3.checkNotNull(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<Object, Object> map) {
        ensureMutable();
        checkForNullKeysAndValues(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        ensureMutable();
        return super.remove(obj);
    }

    private G3(Map<Object, Object> map) {
        super(map);
        this.isMutable = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> Map<K, V> copy(Map<K, V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), copy(entry.getValue()));
        }
        return linkedHashMap;
    }

    public static <K, V> boolean equals(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public Object put(Map.Entry<Object, Object> entry) {
        return put(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && equals((Map) this, (Map) obj);
    }
}
