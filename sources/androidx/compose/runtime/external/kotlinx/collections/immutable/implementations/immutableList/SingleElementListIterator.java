package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.NoSuchElementException;

@StabilityInferred
/* loaded from: classes3.dex */
public final class SingleElementListIterator<E> extends AbstractListIterator<E> {

    /* renamed from: c, reason: collision with root package name */
    public final Object f14186c;

    public SingleElementListIterator(Object obj, int i2) {
        super(i2, 1);
        this.f14186c = obj;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f14166a++;
        return this.f14186c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f14166a--;
        return this.f14186c;
    }
}
