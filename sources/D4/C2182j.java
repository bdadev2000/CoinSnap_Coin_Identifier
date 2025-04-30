package d4;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: d4.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2182j extends O implements ListIterator {
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public int f19870c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC2186n f19871d;

    public C2182j(AbstractC2186n abstractC2186n, int i9) {
        int size = abstractC2186n.size();
        C2.m.i(i9, size);
        this.b = size;
        this.f19870c = i9;
        this.f19871d = abstractC2186n;
    }

    public final Object a(int i9) {
        return this.f19871d.get(i9);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f19870c < this.b) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f19870c > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i9 = this.f19870c;
            this.f19870c = i9 + 1;
            return a(i9);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f19870c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i9 = this.f19870c - 1;
            this.f19870c = i9;
            return a(i9);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f19870c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
