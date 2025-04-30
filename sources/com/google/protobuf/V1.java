package com.google.protobuf;

/* loaded from: classes3.dex */
public final class V1 {
    private final int number;
    private final Object object;

    public V1(Object obj, int i9) {
        this.object = obj;
        this.number = i9;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof V1)) {
            return false;
        }
        V1 v12 = (V1) obj;
        if (this.object != v12.object || this.number != v12.number) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (System.identityHashCode(this.object) * 65535) + this.number;
    }
}
