package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.NoSuchElementException;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes.dex */
public abstract class AbstractSequentialIterator<T> extends UnmodifiableIterator<T> {
    private T nextOrNull;

    public AbstractSequentialIterator(T t2) {
        this.nextOrNull = t2;
    }

    public abstract T computeNext(T t2);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.nextOrNull != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t2 = this.nextOrNull;
        if (t2 == null) {
            throw new NoSuchElementException();
        }
        this.nextOrNull = computeNext(t2);
        return t2;
    }
}
