package d1;

import b1.i1;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class p extends b1.a implements q, f {
    public final f d;

    public p(h0.l lVar, b bVar) {
        super(lVar, true);
        this.d = bVar;
    }

    @Override // b1.r1, b1.h1
    public final void a(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new i1(I(), null, this);
        }
        x(cancellationException);
    }

    @Override // d1.s
    public final Object b(Object obj) {
        return this.d.b(obj);
    }

    @Override // d1.s
    public final void c(i.i iVar) {
        this.d.c(iVar);
    }

    @Override // d1.r
    public final Object d() {
        return this.d.d();
    }

    @Override // d1.s
    public final boolean f(Throwable th) {
        return this.d.f(th);
    }

    @Override // d1.r
    public final Object g(j0.i iVar) {
        return this.d.g(iVar);
    }

    @Override // b1.a, b1.r1, b1.h1
    public final boolean isActive() {
        return super.isActive();
    }

    @Override // d1.r
    public final a iterator() {
        return this.d.iterator();
    }

    @Override // d1.s
    public final Object j(Object obj, h0.g gVar) {
        return this.d.j(obj, gVar);
    }

    @Override // d1.s
    public final boolean k() {
        return this.d.k();
    }

    @Override // b1.a
    public final void m0(boolean z2, Throwable th) {
        if (this.d.f(th) || z2) {
            return;
        }
        kotlin.jvm.internal.e.o(this.f22283c, th);
    }

    @Override // b1.a
    public final void n0(Object obj) {
        this.d.f(null);
    }

    @Override // b1.r1
    public final void x(CancellationException cancellationException) {
        this.d.a(cancellationException);
        w(cancellationException);
    }
}
