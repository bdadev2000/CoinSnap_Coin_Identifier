package U7;

import Q7.InterfaceC0253v;
import t7.AbstractC2712a;
import t7.y;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* loaded from: classes3.dex */
public final class g extends AbstractC2960i implements F7.p {

    /* renamed from: g, reason: collision with root package name */
    public int f3356g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k f3357h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ T7.c f3358i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3359j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, T7.c cVar, Object obj, w7.f fVar) {
        super(2, fVar);
        this.f3357h = kVar;
        this.f3358i = cVar;
        this.f3359j = obj;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        return new g(this.f3357h, this.f3358i, this.f3359j, fVar);
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((g) c((InterfaceC0253v) obj, (w7.f) obj2)).i(y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f3356g;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC2712a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC2712a.f(obj);
            F7.q qVar = (F7.q) this.f3357h.f3376h;
            this.f3356g = 1;
            if (qVar.b(this.f3358i, this.f3359j, this) == enumC2928a) {
                return enumC2928a;
            }
        }
        return y.f23029a;
    }
}
