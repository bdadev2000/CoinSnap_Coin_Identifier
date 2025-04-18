package e0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class a0 implements Iterator, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30191a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f30192b;

    /* renamed from: c, reason: collision with root package name */
    public int f30193c;

    public a0(Iterator it) {
        p0.a.s(it, "iterator");
        this.f30192b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f30191a;
        Iterator it = this.f30192b;
        switch (i2) {
            case 0:
                return it.hasNext();
            case 1:
                break;
            default:
                return this.f30193c > 0 && it.hasNext();
        }
        while (this.f30193c > 0 && it.hasNext()) {
            it.next();
            this.f30193c--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f30191a;
        Iterator it = this.f30192b;
        switch (i2) {
            case 0:
                int i3 = this.f30193c;
                this.f30193c = i3 + 1;
                if (i3 >= 0) {
                    return new z(i3, it.next());
                }
                b1.f0.D();
                throw null;
            case 1:
                break;
            default:
                int i4 = this.f30193c;
                if (i4 == 0) {
                    throw new NoSuchElementException();
                }
                this.f30193c = i4 - 1;
                return it.next();
        }
        while (this.f30193c > 0 && it.hasNext()) {
            it.next();
            this.f30193c--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f30191a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a0(y0.b bVar, int i2) {
        this.f30193c = bVar.f31425c;
        this.f30192b = bVar.f31424b.iterator();
    }

    public a0(y0.b bVar) {
        this.f30192b = bVar.f31424b.iterator();
        this.f30193c = bVar.f31425c;
    }
}
