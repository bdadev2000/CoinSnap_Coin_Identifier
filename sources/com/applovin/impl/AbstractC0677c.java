package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.NoSuchElementException;

/* renamed from: com.applovin.impl.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0677c extends rp {

    /* renamed from: a, reason: collision with root package name */
    private final int f6937a;
    private int b;

    public AbstractC0677c(int i9, int i10) {
        Preconditions.checkPositionIndex(i10, i9);
        this.f6937a = i9;
        this.b = i10;
    }

    public abstract Object a(int i9);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.b < this.f6937a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i9 = this.b;
            this.b = i9 + 1;
            return a(i9);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i9 = this.b - 1;
            this.b = i9;
            return a(i9);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }
}
