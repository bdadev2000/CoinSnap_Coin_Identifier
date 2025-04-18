package androidx.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;
import r0.a;

/* loaded from: classes.dex */
public abstract class IndexBasedArrayIterator<T> implements Iterator<T>, a {

    /* renamed from: a, reason: collision with root package name */
    public int f1423a;

    /* renamed from: b, reason: collision with root package name */
    public int f1424b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1425c;

    public IndexBasedArrayIterator(int i2) {
        this.f1423a = i2;
    }

    public abstract Object b(int i2);

    public abstract void c(int i2);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1424b < this.f1423a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = b(this.f1424b);
        this.f1424b++;
        this.f1425c = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f1425c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i2 = this.f1424b - 1;
        this.f1424b = i2;
        c(i2);
        this.f1423a--;
        this.f1425c = false;
    }
}
