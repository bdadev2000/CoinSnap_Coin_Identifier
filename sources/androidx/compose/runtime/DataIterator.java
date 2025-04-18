package androidx.compose.runtime;

import java.util.Iterator;

/* loaded from: classes4.dex */
final class DataIterator implements Iterable<Object>, Iterator<Object>, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public int f13778a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13778a < 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f13778a;
        if (i2 >= 0) {
            throw null;
        }
        this.f13778a = i2 + 1;
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
