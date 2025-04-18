package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class m4 implements Iterator {
    private Iterator<Map.Entry<Object, Object>> iterator;

    public m4(Iterator<Map.Entry<Object, Object>> it) {
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
        return next.getValue() instanceof n4 ? new l4(next) : next;
    }
}
