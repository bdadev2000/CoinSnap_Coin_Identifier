package e0;

import t7.AbstractC2712a;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* loaded from: classes.dex */
public final class u extends AbstractC2960i implements F7.p {

    /* renamed from: g, reason: collision with root package name */
    public int f19994g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f19995h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ G f19996i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(G g9, w7.f fVar) {
        super(2, fVar);
        this.f19996i = g9;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        u uVar = new u(this.f19996i, fVar);
        uVar.f19995h = obj;
        return uVar;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((u) c((T7.c) obj, (w7.f) obj2)).i(t7.y.f23029a);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [G7.p, java.lang.Object] */
    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f19994g;
        t7.y yVar = t7.y.f23029a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC2712a.f(obj);
                return yVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC2712a.f(obj);
        T7.c cVar = (T7.c) this.f19995h;
        G g9 = this.f19996i;
        H h6 = (H) g9.f19958g.getValue();
        if (!(h6 instanceof C2202c)) {
            g9.f19960i.h(new m(h6));
        }
        s sVar = new s(h6, null);
        this.f19994g = 1;
        g9.f19958g.k(new T7.j(new Object(), new T7.m(cVar, 1), sVar), this);
        return enumC2928a;
    }
}
