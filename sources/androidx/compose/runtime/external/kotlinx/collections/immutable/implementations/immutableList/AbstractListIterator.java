package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ListIterator;
import r0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public abstract class AbstractListIterator<E> implements ListIterator<E>, a {

    /* renamed from: a, reason: collision with root package name */
    public int f14166a;

    /* renamed from: b, reason: collision with root package name */
    public int f14167b;

    public AbstractListIterator(int i2, int i3) {
        this.f14166a = i2;
        this.f14167b = i3;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f14166a < this.f14167b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f14166a > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f14166a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f14166a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
