package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class c extends rp {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private int f3967b;

    public c(int i10, int i11) {
        Preconditions.checkPositionIndex(i11, i10);
        this.a = i10;
        this.f3967b = i11;
    }

    public abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f3967b < this.a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3967b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f3967b;
            this.f3967b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3967b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f3967b - 1;
            this.f3967b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3967b - 1;
    }
}
