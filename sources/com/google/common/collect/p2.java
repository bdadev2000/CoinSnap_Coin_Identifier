package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class p2 implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f12016b;

    public p2(Iterator it) {
        it.getClass();
        this.f12016b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12016b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.f12016b.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f12016b.remove();
    }
}
