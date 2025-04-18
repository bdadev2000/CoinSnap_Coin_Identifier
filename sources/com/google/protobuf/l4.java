package com.google.protobuf;

import java.util.Map;

/* loaded from: classes4.dex */
public final class l4 implements Map.Entry {
    private Map.Entry<Object, n4> entry;

    public n4 getField() {
        return this.entry.getValue();
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.entry.getKey();
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        n4 value = this.entry.getValue();
        if (value == null) {
            return null;
        }
        return value.getValue();
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        if (obj instanceof o5) {
            return this.entry.getValue().setValue((o5) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    private l4(Map.Entry<Object, n4> entry) {
        this.entry = entry;
    }
}
