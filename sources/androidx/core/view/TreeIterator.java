package androidx.core.view;

import e0.t;
import e0.u;
import java.util.ArrayList;
import java.util.Iterator;
import q0.l;

/* loaded from: classes4.dex */
public final class TreeIterator<T> implements Iterator<T>, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public final l f18733a = ViewGroupKt$descendants$1$1.f18757a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18734b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public Iterator f18735c;

    public TreeIterator(Iterator it) {
        this.f18735c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18735c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.f18735c.next();
        Iterator it = (Iterator) this.f18733a.invoke(next);
        ArrayList arrayList = this.f18734b;
        if (it == null || !it.hasNext()) {
            while (!this.f18735c.hasNext() && (!arrayList.isEmpty())) {
                this.f18735c = (Iterator) u.L0(arrayList);
                t.y0(arrayList);
            }
        } else {
            arrayList.add(this.f18735c);
            this.f18735c = it;
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
