package e0;

import Q7.InterfaceC0253v;
import t7.AbstractC2712a;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* loaded from: classes.dex */
public final class E extends AbstractC2960i implements F7.p {

    /* renamed from: g, reason: collision with root package name */
    public int f19942g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ F7.p f19943h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f19944i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(F7.p pVar, Object obj, w7.f fVar) {
        super(2, fVar);
        this.f19943h = pVar;
        this.f19944i = obj;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        return new E(this.f19943h, this.f19944i, fVar);
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((E) c((InterfaceC0253v) obj, (w7.f) obj2)).i(t7.y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f19942g;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC2712a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC2712a.f(obj);
            this.f19942g = 1;
            obj = this.f19943h.g(this.f19944i, this);
            if (obj == enumC2928a) {
                return enumC2928a;
            }
        }
        return obj;
    }
}
