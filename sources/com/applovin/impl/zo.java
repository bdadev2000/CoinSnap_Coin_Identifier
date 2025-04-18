package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Iterator;

/* loaded from: classes.dex */
abstract class zo implements Iterator {
    final Iterator a;

    public zo(Iterator it) {
        this.a = (Iterator) Preconditions.checkNotNull(it);
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
