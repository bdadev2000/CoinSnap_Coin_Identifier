package com.google.common.collect;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class h2 extends y1 implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final h2 f11970b = new h2();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f11970b;
    }

    @Override // com.google.common.collect.y1
    public final y1 b() {
        return x1.f12053b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
