package androidx.lifecycle;

import Q7.AbstractC0255x;
import Q7.C0238f;
import Q7.InterfaceC0237e;
import Q7.InterfaceC0253v;

/* loaded from: classes.dex */
public final class L implements InterfaceC0509t {
    public final /* synthetic */ EnumC0503m b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G7.r f4844c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0253v f4845d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ EnumC0503m f4846f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0237e f4847g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y7.a f4848h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ F7.p f4849i;

    public L(EnumC0503m enumC0503m, G7.r rVar, InterfaceC0253v interfaceC0253v, EnumC0503m enumC0503m2, C0238f c0238f, Y7.d dVar, F7.p pVar) {
        this.b = enumC0503m;
        this.f4844c = rVar;
        this.f4845d = interfaceC0253v;
        this.f4846f = enumC0503m2;
        this.f4847g = c0238f;
        this.f4848h = dVar;
        this.f4849i = pVar;
    }

    @Override // androidx.lifecycle.InterfaceC0509t
    public final void b(InterfaceC0511v interfaceC0511v, EnumC0503m enumC0503m) {
        EnumC0503m enumC0503m2 = this.b;
        G7.r rVar = this.f4844c;
        if (enumC0503m == enumC0503m2) {
            rVar.b = AbstractC0255x.l(this.f4845d, null, null, new K(this.f4848h, this.f4849i, null), 3);
            return;
        }
        if (enumC0503m == this.f4846f) {
            Q7.U u8 = (Q7.U) rVar.b;
            if (u8 != null) {
                u8.a(null);
            }
            rVar.b = null;
        }
        if (enumC0503m == EnumC0503m.ON_DESTROY) {
            this.f4847g.e(t7.y.f23029a);
        }
    }
}
