package com.google.common.collect;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class x1 extends y1 implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final x1 f12053b = new x1();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f12053b;
    }

    @Override // com.google.common.collect.y1
    public final y1 b() {
        return h2.f11970b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
