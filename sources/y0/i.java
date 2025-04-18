package y0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class i implements Iterator, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31440a;

    /* renamed from: b, reason: collision with root package name */
    public int f31441b;

    /* renamed from: c, reason: collision with root package name */
    public Object f31442c;
    public final /* synthetic */ j d;

    public i(q qVar) {
        this.f31440a = 1;
        this.d = qVar;
        this.f31442c = qVar.f31448a.iterator();
    }

    public final void b() {
        Object invoke;
        int i2 = this.f31441b;
        r rVar = (r) this.d;
        if (i2 == -2) {
            invoke = ((q0.a) rVar.f31452b).invoke();
        } else {
            q0.l lVar = rVar.f31453c;
            Object obj = this.f31442c;
            p0.a.p(obj);
            invoke = lVar.invoke(obj);
        }
        this.f31442c = invoke;
        this.f31441b = invoke == null ? 0 : 1;
    }

    public final void c() {
        while (this.f31441b < ((q) this.d).f31449b && ((Iterator) this.f31442c).hasNext()) {
            ((Iterator) this.f31442c).next();
            this.f31441b++;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f31440a) {
            case 0:
                if (this.f31441b < 0) {
                    b();
                }
                return this.f31441b == 1;
            default:
                c();
                return this.f31441b < ((q) this.d).f31450c && ((Iterator) this.f31442c).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f31440a) {
            case 0:
                if (this.f31441b < 0) {
                    b();
                }
                if (this.f31441b == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f31442c;
                p0.a.q(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f31441b = -1;
                return obj;
            default:
                c();
                int i2 = this.f31441b;
                if (i2 >= ((q) this.d).f31450c) {
                    throw new NoSuchElementException();
                }
                this.f31441b = i2 + 1;
                return ((Iterator) this.f31442c).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f31440a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public i(r rVar) {
        this.f31440a = 0;
        this.d = rVar;
        this.f31441b = -2;
    }
}
