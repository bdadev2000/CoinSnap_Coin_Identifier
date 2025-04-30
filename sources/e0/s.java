package e0;

import t7.AbstractC2712a;
import y7.AbstractC2960i;

/* loaded from: classes.dex */
public final class s extends AbstractC2960i implements F7.p {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f19989g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ H f19990h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(H h6, w7.f fVar) {
        super(2, fVar);
        this.f19990h = h6;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        s sVar = new s(this.f19990h, fVar);
        sVar.f19989g = obj;
        return sVar;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((s) c((H) obj, (w7.f) obj2)).i(t7.y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        AbstractC2712a.f(obj);
        H h6 = (H) this.f19989g;
        H h9 = this.f19990h;
        boolean z8 = false;
        if (!(h9 instanceof C2202c) && !(h9 instanceof j) && h6 == h9) {
            z8 = true;
        }
        return Boolean.valueOf(z8);
    }
}
