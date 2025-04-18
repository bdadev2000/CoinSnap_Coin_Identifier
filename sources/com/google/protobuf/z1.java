package com.google.protobuf;

/* loaded from: classes4.dex */
public final class z1 {
    private final int number;
    private final Object object;

    public z1(Object obj, int i10) {
        this.object = obj;
        this.number = i10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        if (this.object != z1Var.object || this.number != z1Var.number) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (System.identityHashCode(this.object) * 65535) + this.number;
    }
}
