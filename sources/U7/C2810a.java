package u7;

import Q7.n0;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: u7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2810a extends G7.a implements ListIterator {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC2812c f23443f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2810a(AbstractC2812c abstractC2812c, int i9) {
        super(abstractC2812c, 6);
        this.f23443f = abstractC2812c;
        int b = abstractC2812c.b();
        if (i9 >= 0 && i9 <= b) {
            this.f1320c = i9;
            return;
        }
        throw new IndexOutOfBoundsException(n0.e(i9, b, "index: ", ", size: "));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f1320c > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1320c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i9 = this.f1320c - 1;
            this.f1320c = i9;
            return this.f23443f.get(i9);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1320c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
