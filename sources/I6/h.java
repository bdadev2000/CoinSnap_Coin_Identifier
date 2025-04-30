package I6;

import F7.p;
import Q7.InterfaceC0253v;
import t7.AbstractC2712a;
import t7.y;
import y7.AbstractC2960i;

/* loaded from: classes3.dex */
public final class h extends AbstractC2960i implements p {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i f1477g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, w7.f fVar) {
        super(2, fVar);
        this.f1477g = iVar;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        return new h(this.f1477g, fVar);
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        h hVar = (h) c((InterfaceC0253v) obj, (w7.f) obj2);
        y yVar = y.f23029a;
        hVar.i(yVar);
        return yVar;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        AbstractC2712a.f(obj);
        i iVar = this.f1477g;
        iVar.f1478c.clear();
        iVar.f1478c.addAll(iVar.b.a());
        return y.f23029a;
    }
}
