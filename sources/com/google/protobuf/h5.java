package com.google.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class h5 extends LinkedHashMap {
    private static final h5 EMPTY_MAP_FIELD;
    private boolean isMutable;

    static {
        h5 h5Var = new h5();
        EMPTY_MAP_FIELD = h5Var;
        h5Var.makeImmutable();
    }

    private h5() {
        this.isMutable = true;
    }

    public static <K, V> int calculateHashCodeForMap(Map<K, V> map) {
        int i10 = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            i10 += calculateHashCodeForObject(entry.getValue()) ^ calculateHashCodeForObject(entry.getKey());
        }
        return i10;
    }

    private static int calculateHashCodeForObject(Object obj) {
        if (obj instanceof byte[]) {
            return f4.hashCode((byte[]) obj);
        }
        if (!(obj instanceof y3)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    private static void checkForNullKeysAndValues(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            f4.checkNotNull(obj);
            f4.checkNotNull(map.get(obj));
        }
    }

    private static Object copy(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public static <K, V> h5 emptyMapField() {
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
        return isEmpty() ? Collections.emptySet() : super.entrySet();
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

    public void mergeFrom(h5 h5Var) {
        ensureMutable();
        if (!h5Var.isEmpty()) {
            putAll(h5Var);
        }
    }

    public h5 mutableCopy() {
        return isEmpty() ? new h5() : new h5(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        ensureMutable();
        f4.checkNotNull(obj);
        f4.checkNotNull(obj2);
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

    private h5(Map<Object, Object> map) {
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
