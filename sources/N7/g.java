package N7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import t7.AbstractC2712a;
import t7.y;

/* loaded from: classes3.dex */
public final class g implements Iterator, w7.f, H7.a {
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2130c;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f2131d;

    /* renamed from: f, reason: collision with root package name */
    public w7.f f2132f;

    public final RuntimeException a() {
        int i9 = this.b;
        if (i9 != 4) {
            if (i9 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.b);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    @Override // w7.f
    public final void e(Object obj) {
        AbstractC2712a.f(obj);
        this.b = 4;
    }

    @Override // w7.f
    public final w7.k getContext() {
        return w7.l.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i9 = this.b;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 == 2 || i9 == 3) {
                        return true;
                    }
                    if (i9 == 4) {
                        return false;
                    }
                    throw a();
                }
                Iterator it = this.f2131d;
                G7.j.b(it);
                if (it.hasNext()) {
                    this.b = 2;
                    return true;
                }
                this.f2131d = null;
            }
            this.b = 5;
            w7.f fVar = this.f2132f;
            G7.j.b(fVar);
            this.f2132f = null;
            fVar.e(y.f23029a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i9 = this.b;
        if (i9 != 0 && i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    this.b = 0;
                    Object obj = this.f2130c;
                    this.f2130c = null;
                    return obj;
                }
                throw a();
            }
            this.b = 1;
            Iterator it = this.f2131d;
            G7.j.b(it);
            return it.next();
        }
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
