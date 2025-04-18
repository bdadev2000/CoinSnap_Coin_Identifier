package f0;

import java.util.ConcurrentModificationException;

/* loaded from: classes4.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final g f30426a;

    /* renamed from: b, reason: collision with root package name */
    public int f30427b;

    /* renamed from: c, reason: collision with root package name */
    public int f30428c;
    public int d;

    public f(g gVar) {
        p0.a.s(gVar, "map");
        this.f30426a = gVar;
        this.f30428c = -1;
        this.d = gVar.f30436i;
        c();
    }

    public final void b() {
        if (this.f30426a.f30436i != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    public final void c() {
        while (true) {
            int i2 = this.f30427b;
            g gVar = this.f30426a;
            if (i2 >= gVar.f30434g || gVar.f30432c[i2] >= 0) {
                return;
            } else {
                this.f30427b = i2 + 1;
            }
        }
    }

    public final boolean hasNext() {
        return this.f30427b < this.f30426a.f30434g;
    }

    public final void remove() {
        b();
        if (this.f30428c == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
        g gVar = this.f30426a;
        gVar.c();
        gVar.l(this.f30428c);
        this.f30428c = -1;
        this.d = gVar.f30436i;
    }
}
