package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Iterator;

/* loaded from: classes4.dex */
abstract class yo implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f28226a;

    public yo(Iterator it) {
        this.f28226a = (Iterator) Preconditions.checkNotNull(it);
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28226a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f28226a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f28226a.remove();
    }
}
