package g;

import e1.i1;

/* loaded from: classes3.dex */
public final class s implements e1.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1.h f30562b;

    public /* synthetic */ s(i1 i1Var, int i2) {
        this.f30561a = i2;
        this.f30562b = i1Var;
    }

    @Override // e1.h
    public final Object collect(e1.i iVar, h0.g gVar) {
        d0.b0 b0Var = d0.b0.f30125a;
        int i2 = this.f30561a;
        e1.h hVar = this.f30562b;
        switch (i2) {
            case 0:
                Object collect = hVar.collect(new r(iVar, 0), gVar);
                return collect == i0.a.f30806a ? collect : b0Var;
            case 1:
                Object collect2 = hVar.collect(new r(iVar, 1), gVar);
                return collect2 == i0.a.f30806a ? collect2 : b0Var;
            default:
                Object collect3 = hVar.collect(new r(iVar, 2), gVar);
                return collect3 == i0.a.f30806a ? collect3 : b0Var;
        }
    }
}
