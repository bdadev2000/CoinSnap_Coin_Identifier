package y0;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class s implements Iterator, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f31454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f31455b;

    public s(r rVar) {
        this.f31455b = rVar;
        this.f31454a = ((j) rVar.f31452b).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31454a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f31455b.f31453c.invoke(this.f31454a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
