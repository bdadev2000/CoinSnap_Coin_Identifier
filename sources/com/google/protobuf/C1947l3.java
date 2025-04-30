package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.l3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1947l3 implements Iterator {
    private Iterator<Map.Entry<Object, Object>> iterator;

    public C1947l3(Iterator<Map.Entry<Object, Object>> it) {
        this.iterator = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.iterator.remove();
    }

    @Override // java.util.Iterator
    public Map.Entry<Object, Object> next() {
        Map.Entry<Object, Object> next = this.iterator.next();
        return next.getValue() instanceof C1954m3 ? new C1940k3(next) : next;
    }
}
