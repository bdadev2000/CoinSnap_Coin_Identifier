package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
abstract class c extends qp {

    /* renamed from: a, reason: collision with root package name */
    private final int f23186a;

    /* renamed from: b, reason: collision with root package name */
    private int f23187b;

    public c(int i2, int i3) {
        Preconditions.checkPositionIndex(i3, i2);
        this.f23186a = i2;
        this.f23187b = i3;
    }

    public abstract Object a(int i2);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f23187b < this.f23186a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f23187b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f23187b;
        this.f23187b = i2 + 1;
        return a(i2);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f23187b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f23187b - 1;
        this.f23187b = i2;
        return a(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f23187b - 1;
    }
}
