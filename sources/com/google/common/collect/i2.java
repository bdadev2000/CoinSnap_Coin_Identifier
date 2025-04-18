package com.google.common.collect;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class i2 extends y1 implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final y1 f11976b;

    public i2(y1 y1Var) {
        y1Var.getClass();
        this.f11976b = y1Var;
    }

    @Override // com.google.common.collect.y1
    public final y1 b() {
        return this.f11976b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f11976b.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i2) {
            return this.f11976b.equals(((i2) obj).f11976b);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f11976b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11976b);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 10);
        sb2.append(valueOf);
        sb2.append(".reverse()");
        return sb2.toString();
    }
}
