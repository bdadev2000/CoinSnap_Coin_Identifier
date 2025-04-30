package com.google.protobuf;

import java.util.Map;

/* loaded from: classes3.dex */
public final class H4 implements Map.Entry, Comparable {
    private final Comparable<Object> key;
    final /* synthetic */ K4 this$0;
    private Object value;

    public H4(K4 k42, Map.Entry<Comparable<Object>, Object> entry) {
        this(k42, entry.getKey(), entry.getValue());
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
    public Object getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        int hashCode;
        Comparable<Object> comparable = this.key;
        int i9 = 0;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.value;
        if (obj != null) {
            i9 = obj.hashCode();
        }
        return hashCode ^ i9;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        this.this$0.checkMutable();
        Object obj2 = this.value;
        this.value = obj;
        return obj2;
    }

    public String toString() {
        return this.key + "=" + this.value;
    }

    public H4(K4 k42, Comparable<Object> comparable, Object obj) {
        this.this$0 = k42;
        this.key = comparable;
        this.value = obj;
    }

    @Override // java.lang.Comparable
    public int compareTo(H4 h42) {
        return getKey().compareTo(h42.getKey());
    }

    @Override // java.util.Map.Entry
    public Comparable<Object> getKey() {
        return this.key;
    }

    private boolean equals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }
}
