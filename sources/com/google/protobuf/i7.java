package com.google.protobuf;

import java.util.Map;

/* loaded from: classes4.dex */
public final class i7 implements Map.Entry, Comparable {
    private final Comparable<Object> key;
    final /* synthetic */ l7 this$0;
    private Object value;

    public i7(l7 l7Var, Map.Entry<Comparable<Object>, Object> entry) {
        this(l7Var, entry.getKey(), entry.getValue());
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
        Comparable<Object> comparable = this.key;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.value;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
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

    public i7(l7 l7Var, Comparable<Object> comparable, Object obj) {
        this.this$0 = l7Var;
        this.key = comparable;
        this.value = obj;
    }

    @Override // java.lang.Comparable
    public int compareTo(i7 i7Var) {
        return getKey().compareTo(i7Var.getKey());
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
