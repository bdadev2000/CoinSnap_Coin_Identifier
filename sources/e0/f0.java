package e0;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public final class f0 implements ListIterator, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public final ListIterator f30200a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f30201b;

    /* JADX WARN: Type inference failed for: r1v0, types: [w0.g, w0.e] */
    public f0(g0 g0Var, int i2) {
        this.f30201b = g0Var;
        List list = (List) g0Var.f30203b;
        if (new w0.e(0, g0Var.size(), 1).c(i2)) {
            this.f30200a = list.listIterator(g0Var.size() - i2);
            return;
        }
        StringBuilder t2 = android.support.v4.media.d.t("Position index ", i2, " must be in range [");
        t2.append(new w0.e(0, g0Var.size(), 1));
        t2.append("].");
        throw new IndexOutOfBoundsException(t2.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f30200a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f30200a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f30200a.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b1.f0.p(this.f30201b) - this.f30200a.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f30200a.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b1.f0.p(this.f30201b) - this.f30200a.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
