package N7;

import java.util.Iterator;
import u7.AbstractC2817h;
import u7.C2827r;

/* loaded from: classes3.dex */
public final class b implements Iterator, H7.a {
    public final /* synthetic */ int b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Iterator f2123c;

    /* renamed from: d, reason: collision with root package name */
    public int f2124d;

    public b(Iterator it) {
        G7.j.e(it, "iterator");
        this.f2123c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.b) {
            case 0:
                break;
            default:
                return this.f2123c.hasNext();
        }
        while (true) {
            int i9 = this.f2124d;
            it = this.f2123c;
            if (i9 > 0 && it.hasNext()) {
                it.next();
                this.f2124d--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.b) {
            case 0:
                break;
            default:
                int i9 = this.f2124d;
                this.f2124d = i9 + 1;
                if (i9 >= 0) {
                    return new C2827r(i9, this.f2123c.next());
                }
                AbstractC2817h.D();
                throw null;
        }
        while (true) {
            int i10 = this.f2124d;
            it = this.f2123c;
            if (i10 > 0 && it.hasNext()) {
                it.next();
                this.f2124d--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(c cVar) {
        this.f2123c = cVar.f2125a.iterator();
        this.f2124d = cVar.b;
    }
}
