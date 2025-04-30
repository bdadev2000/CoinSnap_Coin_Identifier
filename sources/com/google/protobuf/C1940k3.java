package com.google.protobuf;

import java.util.Map;

/* renamed from: com.google.protobuf.k3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1940k3 implements Map.Entry {
    private Map.Entry<Object, C1954m3> entry;

    public C1954m3 getField() {
        return this.entry.getValue();
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.entry.getKey();
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        C1954m3 value = this.entry.getValue();
        if (value == null) {
            return null;
        }
        return value.getValue();
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        if (obj instanceof N3) {
            return this.entry.getValue().setValue((N3) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    private C1940k3(Map.Entry<Object, C1954m3> entry) {
        this.entry = entry;
    }
}
