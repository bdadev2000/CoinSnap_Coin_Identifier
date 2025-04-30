package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Iterator;

/* loaded from: classes.dex */
abstract class zo implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f12675a;

    public zo(Iterator it) {
        this.f12675a = (Iterator) Preconditions.checkNotNull(it);
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12675a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f12675a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f12675a.remove();
    }
}
