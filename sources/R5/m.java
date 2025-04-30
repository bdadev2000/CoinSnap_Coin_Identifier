package r5;

import F7.p;
import h0.C2312b;
import t7.AbstractC2712a;
import t7.y;
import y7.AbstractC2960i;

/* loaded from: classes2.dex */
public final class m extends AbstractC2960i implements p {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f22881g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f22882h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h0.f f22883i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f22884j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Object obj, h0.f fVar, n nVar, w7.f fVar2) {
        super(2, fVar2);
        this.f22882h = obj;
        this.f22883i = fVar;
        this.f22884j = nVar;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        m mVar = new m(this.f22882h, this.f22883i, this.f22884j, fVar);
        mVar.f22881g = obj;
        return mVar;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        m mVar = (m) c((C2312b) obj, (w7.f) obj2);
        y yVar = y.f23029a;
        mVar.i(yVar);
        return yVar;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        AbstractC2712a.f(obj);
        C2312b c2312b = (C2312b) this.f22881g;
        h0.f fVar = this.f22883i;
        Object obj2 = this.f22882h;
        if (obj2 != null) {
            c2312b.getClass();
            G7.j.e(fVar, "key");
            c2312b.c(fVar, obj2);
        } else {
            c2312b.getClass();
            G7.j.e(fVar, "key");
            c2312b.a();
            c2312b.f20569a.remove(fVar);
        }
        n.a(this.f22884j, c2312b);
        return y.f23029a;
    }
}
