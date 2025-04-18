package f1;

/* loaded from: classes2.dex */
public final class n extends i {

    /* renamed from: f, reason: collision with root package name */
    public final q0.q f30487f;

    public n(q0.q qVar, e1.h hVar, h0.l lVar, int i2, int i3) {
        super(i2, lVar, i3, hVar);
        this.f30487f = qVar;
    }

    @Override // f1.g
    public final g d(h0.l lVar, int i2, int i3) {
        return new n(this.f30487f, this.d, lVar, i2, i3);
    }

    @Override // f1.i
    public final Object g(e1.i iVar, h0.g gVar) {
        Object J = p0.a.J(new m(this, iVar, null), gVar);
        return J == i0.a.f30806a ? J : d0.b0.f30125a;
    }
}
