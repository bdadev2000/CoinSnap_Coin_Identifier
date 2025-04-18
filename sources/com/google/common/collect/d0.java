package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class d0 extends y1 implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Comparator f11929b;

    public d0(Comparator comparator) {
        comparator.getClass();
        this.f11929b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f11929b.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0) {
            return this.f11929b.equals(((d0) obj).f11929b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11929b.hashCode();
    }

    public final String toString() {
        return this.f11929b.toString();
    }
}
