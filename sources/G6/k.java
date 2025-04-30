package G6;

import F7.p;
import Q7.InterfaceC0253v;
import T7.s;
import t7.AbstractC2712a;
import t7.y;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* loaded from: classes3.dex */
public final class k extends AbstractC2960i implements p {

    /* renamed from: g, reason: collision with root package name */
    public int f1311g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n f1312h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, w7.f fVar) {
        super(2, fVar);
        this.f1312h = nVar;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        return new k(this.f1312h, fVar);
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((k) c((InterfaceC0253v) obj, (w7.f) obj2)).i(y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f1311g;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC2712a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC2712a.f(obj);
            n nVar = this.f1312h;
            N6.j h6 = nVar.h();
            j jVar = new j(nVar, null);
            this.f1311g = 1;
            if (s.b(h6.f2121f, jVar, this) == enumC2928a) {
                return enumC2928a;
            }
        }
        return y.f23029a;
    }
}
