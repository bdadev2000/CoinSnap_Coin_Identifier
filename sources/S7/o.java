package S7;

import Q7.AbstractC0233a;
import Q7.AbstractC0255x;
import Q7.C0247o;
import Q7.V;
import Q7.b0;
import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public final class o extends AbstractC0233a implements p, g {

    /* renamed from: f, reason: collision with root package name */
    public final g f2846f;

    public o(w7.k kVar, c cVar) {
        super(kVar, true);
        this.f2846f = cVar;
    }

    @Override // Q7.AbstractC0233a
    public final void V(boolean z8, Throwable th) {
        if (!this.f2846f.j(th) && !z8) {
            AbstractC0255x.i(th, this.f2547d);
        }
    }

    @Override // Q7.AbstractC0233a
    public final void W(Object obj) {
        this.f2846f.j(null);
    }

    @Override // Q7.d0, Q7.U
    public final void a(CancellationException cancellationException) {
        Object F4 = F();
        if (!(F4 instanceof C0247o)) {
            if (!(F4 instanceof b0) || !((b0) F4).d()) {
                if (cancellationException == null) {
                    cancellationException = new V(v(), null, this);
                }
                t(cancellationException);
            }
        }
    }

    @Override // S7.r
    public final Object g(Object obj, w7.f fVar) {
        return this.f2846f.g(obj, fVar);
    }

    @Override // S7.q
    public final b iterator() {
        return this.f2846f.iterator();
    }

    @Override // S7.r
    public final boolean j(Throwable th) {
        return this.f2846f.j(th);
    }

    @Override // S7.r
    public final Object m(Object obj) {
        return this.f2846f.m(obj);
    }

    @Override // Q7.d0
    public final void t(CancellationException cancellationException) {
        this.f2846f.a(cancellationException);
        s(cancellationException);
    }
}
