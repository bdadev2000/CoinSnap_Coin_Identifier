package N6;

import F7.p;
import Q7.InterfaceC0253v;
import T7.r;
import java.util.List;
import t7.AbstractC2712a;
import t7.y;
import u7.AbstractC2816g;
import y7.AbstractC2960i;

/* loaded from: classes3.dex */
public final class i extends AbstractC2960i implements p {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j f2117g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, w7.f fVar) {
        super(2, fVar);
        this.f2117g = jVar;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        return new i(this.f2117g, fVar);
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        i iVar = (i) c((InterfaceC0253v) obj, (w7.f) obj2);
        y yVar = y.f23029a;
        iVar.i(yVar);
        return yVar;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        r rVar;
        Object value;
        List R4;
        AbstractC2712a.f(obj);
        j jVar = this.f2117g;
        jVar.f2119d = jVar.b.a();
        do {
            rVar = jVar.f2118c;
            value = rVar.getValue();
            R4 = AbstractC2816g.R(new C5.c(5), jVar.f2119d);
            ((h) value).getClass();
        } while (!rVar.b(value, new h(R4)));
        return y.f23029a;
    }
}
