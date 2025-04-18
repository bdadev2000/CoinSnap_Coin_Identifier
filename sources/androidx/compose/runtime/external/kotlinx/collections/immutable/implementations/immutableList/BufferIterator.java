package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.NoSuchElementException;

@StabilityInferred
/* loaded from: classes3.dex */
public final class BufferIterator<T> extends AbstractListIterator<T> {

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f14169c;

    public BufferIterator(Object[] objArr, int i2, int i3) {
        super(i2, i3);
        this.f14169c = objArr;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f14166a;
        this.f14166a = i2 + 1;
        return this.f14169c[i2];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f14166a - 1;
        this.f14166a = i2;
        return this.f14169c[i2];
    }
}
