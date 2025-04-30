package V7;

import Q7.AbstractC0233a;
import Q7.AbstractC0255x;
import y7.InterfaceC2955d;

/* loaded from: classes3.dex */
public class t extends AbstractC0233a implements InterfaceC2955d {

    /* renamed from: f, reason: collision with root package name */
    public final w7.f f3538f;

    public t(w7.f fVar, w7.k kVar) {
        super(kVar, true);
        this.f3538f = fVar;
    }

    @Override // Q7.d0
    public final boolean K() {
        return true;
    }

    @Override // y7.InterfaceC2955d
    public final InterfaceC2955d d() {
        w7.f fVar = this.f3538f;
        if (fVar instanceof InterfaceC2955d) {
            return (InterfaceC2955d) fVar;
        }
        return null;
    }

    @Override // Q7.d0
    public void q(Object obj) {
        a.h(F2.h.x(this.f3538f), AbstractC0255x.n(obj), null);
    }

    @Override // Q7.d0
    public void r(Object obj) {
        this.f3538f.e(AbstractC0255x.n(obj));
    }
}
