package e0;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class d extends c implements ListIterator {
    public final /* synthetic */ f d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, int i2) {
        super(fVar);
        this.d = fVar;
        b bVar = f.Companion;
        int size = fVar.size();
        bVar.getClass();
        b.b(i2, size);
        this.f30195b = i2;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f30195b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f30195b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f30195b - 1;
        this.f30195b = i2;
        return this.d.get(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f30195b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
