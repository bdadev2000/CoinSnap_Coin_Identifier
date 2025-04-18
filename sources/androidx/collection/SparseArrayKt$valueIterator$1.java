package androidx.collection;

import java.util.Iterator;
import r0.a;

/* loaded from: classes4.dex */
public final class SparseArrayKt$valueIterator$1 implements Iterator<Object>, a {

    /* renamed from: a, reason: collision with root package name */
    public int f1615a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SparseArrayCompat f1616b;

    public SparseArrayKt$valueIterator$1(SparseArrayCompat sparseArrayCompat) {
        this.f1616b = sparseArrayCompat;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1615a < this.f1616b.g();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f1615a;
        this.f1615a = i2 + 1;
        return this.f1616b.h(i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
