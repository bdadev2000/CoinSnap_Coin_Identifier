package y0;

import d0.b0;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class k extends l implements Iterator, h0.g, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public int f31443a;

    /* renamed from: b, reason: collision with root package name */
    public Object f31444b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f31445c;
    public h0.g d;

    @Override // y0.l
    public final void b(Object obj, h0.g gVar) {
        this.f31444b = obj;
        this.f31443a = 3;
        this.d = gVar;
        i0.a aVar = i0.a.f30806a;
        p0.a.s(gVar, "frame");
    }

    public final RuntimeException c() {
        int i2 = this.f31443a;
        if (i2 == 4) {
            return new NoSuchElementException();
        }
        if (i2 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f31443a);
    }

    @Override // h0.g
    public final h0.l getContext() {
        return h0.m.f30726a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i2 = this.f31443a;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2 || i2 == 3) {
                        return true;
                    }
                    if (i2 == 4) {
                        return false;
                    }
                    throw c();
                }
                Iterator it = this.f31445c;
                p0.a.p(it);
                if (it.hasNext()) {
                    this.f31443a = 2;
                    return true;
                }
                this.f31445c = null;
            }
            this.f31443a = 5;
            h0.g gVar = this.d;
            p0.a.p(gVar);
            this.d = null;
            gVar.resumeWith(b0.f30125a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f31443a;
        if (i2 == 0 || i2 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i2 == 2) {
            this.f31443a = 1;
            Iterator it = this.f31445c;
            p0.a.p(it);
            return it.next();
        }
        if (i2 != 3) {
            throw c();
        }
        this.f31443a = 0;
        Object obj = this.f31444b;
        this.f31444b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // h0.g
    public final void resumeWith(Object obj) {
        kotlin.jvm.internal.q.m(obj);
        this.f31443a = 4;
    }
}
