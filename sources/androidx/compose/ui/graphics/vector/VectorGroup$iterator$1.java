package androidx.compose.ui.graphics.vector;

import java.util.Iterator;
import r0.a;

/* loaded from: classes4.dex */
public final class VectorGroup$iterator$1 implements Iterator<VectorNode>, a {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f15464a;

    public VectorGroup$iterator$1(VectorGroup vectorGroup) {
        this.f15464a = vectorGroup.f15463k.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15464a.hasNext();
    }

    @Override // java.util.Iterator
    public final VectorNode next() {
        return (VectorNode) this.f15464a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
